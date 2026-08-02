package ru.ozon.app.android.storage.di;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storage/di/StorageComponentConfig;", "", "versionCode", "", "versionName", "", "versionNameWithoutSuffix", "commitHash", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getVersionCode", "()I", "getVersionName", "()Ljava/lang/String;", "getVersionNameWithoutSuffix", "getCommitHash", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class StorageComponentConfig {

    @NotNull
    private final String commitHash;
    private final int versionCode;

    @NotNull
    private final String versionName;

    @NotNull
    private final String versionNameWithoutSuffix;

    public StorageComponentConfig(int i11, @NotNull String versionName, @NotNull String versionNameWithoutSuffix, @NotNull String commitHash) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(versionNameWithoutSuffix, "versionNameWithoutSuffix");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        this.versionCode = i11;
        this.versionName = versionName;
        this.versionNameWithoutSuffix = versionNameWithoutSuffix;
        this.commitHash = commitHash;
    }

    @NotNull
    public final String getCommitHash() {
        return this.commitHash;
    }

    public final int getVersionCode() {
        return this.versionCode;
    }

    @NotNull
    public final String getVersionName() {
        return this.versionName;
    }

    @NotNull
    public final String getVersionNameWithoutSuffix() {
        return this.versionNameWithoutSuffix;
    }
}
