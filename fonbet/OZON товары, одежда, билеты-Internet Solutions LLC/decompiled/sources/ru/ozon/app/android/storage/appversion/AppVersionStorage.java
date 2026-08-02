package ru.ozon.app.android.storage.appversion;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0003H&J\b\u0010\r\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storage/appversion/AppVersionStorage;", "", "versionName", "", "getVersionName", "()Ljava/lang/String;", "versionNameWithoutSuffix", "getVersionNameWithoutSuffix", "versionCode", "getVersionCode", "saveFakeVersion", "", "version", "clearFakeVersion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface AppVersionStorage {
    void clearFakeVersion();

    @NotNull
    String getVersionCode();

    @NotNull
    String getVersionName();

    @NotNull
    String getVersionNameWithoutSuffix();

    void saveFakeVersion(@NotNull String version);
}
