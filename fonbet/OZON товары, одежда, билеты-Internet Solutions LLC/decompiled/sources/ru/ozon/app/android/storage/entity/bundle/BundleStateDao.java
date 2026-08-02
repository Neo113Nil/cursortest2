package ru.ozon.app.android.storage.entity.bundle;

import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H'J\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\nH'J\u0010\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0005H'J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0005H'J\u0018\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH'¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storage/entity/bundle/BundleStateDao;", "", "insertRecords", "", "bundleState", "", "Lru/ozon/app/android/storage/entity/bundle/BundleState;", "getBlobsByGuid", "", "guid", "", "getAllShortDesc", "Lru/ozon/app/android/storage/entity/bundle/ShortInfoAboutBundleState;", "deleteByIds", "ids", "", "deleteAllForScreenExceptPassedRecord", "screenGuid", "notDeleteGuid", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BundleStateDao {
    void deleteAllForScreenExceptPassedRecord(@NotNull String screenGuid, @NotNull String notDeleteGuid);

    void deleteByIds(@NotNull List<Long> ids);

    List<ShortInfoAboutBundleState> getAllShortDesc();

    List<byte[]> getBlobsByGuid(@NotNull String guid);

    void insertRecords(@NotNull List<BundleState> bundleState);
}
