package ru.ozon.app.android.platform.bundle.state;

import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.c;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.storage.entity.bundle.BundleState;
import ru.ozon.app.android.storage.entity.bundle.BundleStateDao;
import ru.ozon.app.android.storage.entity.bundle.ShortInfoAboutBundleState;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreDelegateImpl;", "Lru/ozon/app/android/platform/bundle/state/ManualSaveRestoreStateDelegate;", "bundleStateDao", "Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "<init>", "(Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;)V", "clearStorage", "", "deleteRecordsForScreenWithoutNewest", "notDeleteGuid", "", "screenGuid", "save", "", "bundle", "Landroid/os/Bundle;", "guid", "restoreState", "savedBundle", "classLoader", "Ljava/lang/ClassLoader;", "getFromDB", "Companion", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ManualSaveRestoreDelegateImpl implements ManualSaveRestoreStateDelegate {

    @NotNull
    private final BundleStateDao bundleStateDao;

    public ManualSaveRestoreDelegateImpl(@NotNull BundleStateDao bundleStateDao) {
        Intrinsics.checkNotNullParameter(bundleStateDao, "bundleStateDao");
        this.bundleStateDao = bundleStateDao;
    }

    private final Bundle getFromDB(String guid, ClassLoader classLoader) {
        List<byte[]> blobsByGuid = this.bundleStateDao.getBlobsByGuid(guid);
        byte[] chunksToByteArray = blobsByGuid != null ? BundleChunkUtilsKt.chunksToByteArray(blobsByGuid) : null;
        if (chunksToByteArray == null || chunksToByteArray.length == 0) {
            return null;
        }
        BundleDebugUtils.INSTANCE.log("restore state guid - " + guid + " size - " + chunksToByteArray.length);
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        try {
            try {
                obtain.unmarshall(chunksToByteArray, 0, chunksToByteArray.length);
                obtain.setDataPosition(0);
                Bundle readBundle = obtain.readBundle(classLoader);
                obtain.recycle();
                return readBundle;
            } catch (Exception e11) {
                BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
                if (bundleDebugUtils.isRemoteErrorLoggingEnabled()) {
                    bundleDebugUtils.getLogger().f(c.INFO, "BundleDebugErrorLogger - " + ((Object) ("Cant retrieve bundle " + e11.getMessage())), null, Boolean.FALSE);
                }
                LoggerExtKt.sendNonFatal$default(null, "Cant retrieve bundle " + e11.getMessage(), "CUSTOM_BUNDLE_EXCEPTION", null, 9, null);
                obtain.recycle();
                return null;
            }
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
        }
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate
    public void clearStorage() {
        List<ShortInfoAboutBundleState> allShortDesc = this.bundleStateDao.getAllShortDesc();
        if (allShortDesc != null) {
            if (allShortDesc.isEmpty()) {
                allShortDesc = null;
            }
            if (allShortDesc == null) {
                return;
            }
            List<ShortInfoAboutBundleState> list = allShortDesc;
            Iterator<T> it = list.iterator();
            int i11 = 0;
            int i12 = 0;
            while (it.hasNext()) {
                i12 += ((ShortInfoAboutBundleState) it.next()).getBlobSize();
            }
            if (i12 < 18874368) {
                BundleDebugUtils.INSTANCE.log("should not clear table tableSize - " + i12 + " limit - 18874368");
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (ShortInfoAboutBundleState shortInfoAboutBundleState : list) {
                i11 += shortInfoAboutBundleState.getBlobSize();
                if (i11 >= 10485760) {
                    arrayList.add(Long.valueOf(shortInfoAboutBundleState.getId()));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
            ArrayList arrayList2 = new ArrayList(C7714v.z(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Long.valueOf(((ShortInfoAboutBundleState) it2.next()).getId()));
            }
            bundleDebugUtils.log("clear table records size " + i11 + " \n ids - " + arrayList2 + " \n idsToDelete - " + arrayList);
            this.bundleStateDao.deleteByIds(arrayList);
        }
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate
    public void deleteRecordsForScreenWithoutNewest(@NotNull String notDeleteGuid, @NotNull String screenGuid) {
        Intrinsics.checkNotNullParameter(notDeleteGuid, "notDeleteGuid");
        Intrinsics.checkNotNullParameter(screenGuid, "screenGuid");
        this.bundleStateDao.deleteAllForScreenExceptPassedRecord(screenGuid, notDeleteGuid);
        BundleDebugUtils.INSTANCE.log("delete all old records notDeletedGuid " + notDeleteGuid + " screenGuid " + screenGuid);
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate
    public Bundle restoreState(Bundle savedBundle, @NotNull ClassLoader classLoader) {
        String string;
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        if (savedBundle == null || (string = savedBundle.getString("persisted_state_item_key")) == null || h.K(string)) {
            return null;
        }
        return getFromDB(string, classLoader);
    }

    @Override // ru.ozon.app.android.platform.bundle.state.ManualSaveRestoreStateDelegate
    public boolean save(@NotNull Bundle bundle, @NotNull String guid, @NotNull String screenGuid) {
        byte[] bArr;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(guid, "guid");
        String screenGuid2 = screenGuid;
        Intrinsics.checkNotNullParameter(screenGuid2, "screenGuid");
        Parcel obtain = Parcel.obtain();
        Intrinsics.checkNotNullExpressionValue(obtain, "obtain(...)");
        try {
            try {
                bundle.writeToParcel(obtain, 0);
                byte[] marshall = obtain.marshall();
                obtain.recycle();
                bArr = marshall;
            } catch (Exception e11) {
                BundleDebugUtils bundleDebugUtils = BundleDebugUtils.INSTANCE;
                bArr = null;
                if (bundleDebugUtils.isRemoteErrorLoggingEnabled()) {
                    bundleDebugUtils.getLogger().f(c.INFO, "BundleDebugErrorLogger - " + ((Object) ("Save bundle executed with error " + e11.getMessage())), null, Boolean.FALSE);
                }
                LoggerExtKt.sendNonFatal$default(null, "Save bundle error " + e11.getMessage(), "CUSTOM_BUNDLE_EXCEPTION", null, 9, null);
                obtain.recycle();
            }
            if (bArr == null || bArr.length == 0) {
                return false;
            }
            List<byte[]> sliceToChunksIfNeedIt = BundleChunkUtilsKt.sliceToChunksIfNeedIt(bArr, 1048576);
            ArrayList arrayList = new ArrayList(C7714v.z(sliceToChunksIfNeedIt, 10));
            for (byte[] bArr2 : sliceToChunksIfNeedIt) {
                arrayList.add(new BundleState(0L, guid, bArr2, bArr2.length, screenGuid2, 1, null));
                screenGuid2 = screenGuid;
            }
            BundleDebugUtils.INSTANCE.log("save bundle to DB guid " + guid + " total bytes - " + bArr.length);
            this.bundleStateDao.insertRecords(arrayList);
            return true;
        } catch (Throwable th2) {
            obtain.recycle();
            throw th2;
        }
    }
}
