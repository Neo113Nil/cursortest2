package ru.ozon.app.android.barcodecache.wearable.pageConfigurator;

import A00.a;
import Ae.C2399j;
import Ae.C2408n0;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import j10.h;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.barcodecache.wearable.WearableBarcodeSyncer;
import ru.ozon.app.android.composer.ConfiguratorReferences;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.l;
import xe.B0;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0014\u0010\u0010J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001bR$\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8$X¤\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/barcodecache/wearable/pageConfigurator/BaseUpdateBarcodeOnWearableDeviceConfigurator;", "Lru/ozon/app/android/composer/universalscreen/view/ComposerScreenConfig$PageConfigurator;", "Lru/ozon/app/android/barcodecache/wearable/WearableBarcodeSyncer;", "wearableBarcodeSyncer", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authManager", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(Lru/ozon/app/android/barcodecache/wearable/WearableBarcodeSyncer;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/utils/AppType;)V", "LA00/a;", "event", "", "handleEvent", "(LA00/a;)V", "notifyBarcodeStatus", "()V", "Lru/ozon/app/android/barcodecache/wearable/pageConfigurator/ViewItemWithBarcode;", "getFirstItemWithBarcode", "()Lru/ozon/app/android/barcodecache/wearable/pageConfigurator/ViewItemWithBarcode;", "onComposerInitialized", "Landroidx/lifecycle/J;", "owner", "onDestroy", "(Landroidx/lifecycle/J;)V", "Lru/ozon/app/android/barcodecache/wearable/WearableBarcodeSyncer;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/utils/AppType;", "Lxe/B0;", "eventObserver", "Lxe/B0;", "getEventObserver", "()Lxe/B0;", "setEventObserver", "(Lxe/B0;)V", "", "alreadySynced", "Z", "getAllowEmptyBarcodeNotification", "()Z", "allowEmptyBarcodeNotification", "barcodecache_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseUpdateBarcodeOnWearableDeviceConfigurator extends ComposerScreenConfig.PageConfigurator {
    private boolean alreadySynced;

    @NotNull
    private final AppType appType;

    @NotNull
    private final AuthStateStorage authManager;
    private B0 eventObserver;

    @NotNull
    private final WearableBarcodeSyncer wearableBarcodeSyncer;

    public BaseUpdateBarcodeOnWearableDeviceConfigurator(@NotNull WearableBarcodeSyncer wearableBarcodeSyncer, @NotNull AuthStateStorage authManager, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(wearableBarcodeSyncer, "wearableBarcodeSyncer");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.wearableBarcodeSyncer = wearableBarcodeSyncer;
        this.authManager = authManager;
        this.appType = appType;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ViewItemWithBarcode getFirstItemWithBarcode() {
        c cVar;
        h.b<l> voHelper;
        List<l> b11;
        Object obj;
        ConfiguratorReferences references = getReferences();
        if (references != null && (voHelper = references.getVoHelper()) != null && (b11 = voHelper.b()) != null) {
            Iterator<T> it = b11.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((l) obj).d() instanceof ViewItemWithBarcode) {
                    break;
                }
            }
            l lVar = (l) obj;
            if (lVar != null) {
                cVar = lVar.d();
                if (cVar instanceof ViewItemWithBarcode) {
                    return null;
                }
                return (ViewItemWithBarcode) cVar;
            }
        }
        cVar = null;
        if (cVar instanceof ViewItemWithBarcode) {
        }
    }

    private final void handleEvent(a event) {
        if (event instanceof a.o) {
            notifyBarcodeStatus();
        } else if (event instanceof a.u) {
            this.alreadySynced = false;
        }
    }

    private final void notifyBarcodeStatus() {
        if (this.alreadySynced) {
            return;
        }
        if (this.authManager.isAuthenticated()) {
            ViewItemWithBarcode firstItemWithBarcode = getFirstItemWithBarcode();
            if (firstItemWithBarcode != null && firstItemWithBarcode.getHasBarcode()) {
                this.wearableBarcodeSyncer.syncBarcode();
            } else if (getAllowEmptyBarcodeNotification()) {
                this.wearableBarcodeSyncer.syncEmpty();
            }
        } else {
            this.wearableBarcodeSyncer.syncEmpty();
        }
        this.alreadySynced = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onComposerInitialized$handleEvent(BaseUpdateBarcodeOnWearableDeviceConfigurator baseUpdateBarcodeOnWearableDeviceConfigurator, a aVar, d dVar) {
        baseUpdateBarcodeOnWearableDeviceConfigurator.handleEvent(aVar);
        return Unit.f71690a;
    }

    protected abstract boolean getAllowEmptyBarcodeNotification();

    @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig.PageConfigurator
    protected void onComposerInitialized() {
        ConfiguratorReferences references;
        super.onComposerInitialized();
        if (this.appType == AppType.f94580BX && this.wearableBarcodeSyncer.getIsEnable() && (references = getReferences()) != null) {
            this.eventObserver = C2399j.C(new C2408n0(references.getController().getEventsFlow(), new BaseUpdateBarcodeOnWearableDeviceConfigurator$onComposerInitialized$1(this)), K.a(getOwner()));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(@NotNull J owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        B0 b02 = this.eventObserver;
        if (b02 != null) {
            b02.j(null);
        }
        super.onDestroy(owner);
    }
}
