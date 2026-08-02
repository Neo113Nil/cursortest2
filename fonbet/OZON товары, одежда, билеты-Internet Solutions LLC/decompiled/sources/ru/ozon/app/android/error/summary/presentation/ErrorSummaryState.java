package ru.ozon.app.android.error.summary.presentation;

import C.o0;
import G.g;
import N3.C3660k;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.uikit.screenstate.ScreenState;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u001a\u0010\u000fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b!\u0010\u000fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/ErrorSummaryState;", "", "", "platform", "appVersion", "commitHash", "", "userId", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "serverIssue", "meshVersions", "abVariants", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPlatform", "getAppVersion", "getCommitHash", "Ljava/lang/Long;", "getUserId", "()Ljava/lang/Long;", "Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "getServerIssue", "()Lru/ozon/app/android/uikit/screenstate/ScreenState$ServerIssue;", "getMeshVersions", "getAbVariants", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ErrorSummaryState {
    private final String abVariants;

    @NotNull
    private final String appVersion;

    @NotNull
    private final String commitHash;
    private final String meshVersions;

    @NotNull
    private final String platform;
    private final ScreenState.ServerIssue serverIssue;
    private final Long userId;

    public ErrorSummaryState(@NotNull String platform, @NotNull String appVersion, @NotNull String commitHash, Long l11, ScreenState.ServerIssue serverIssue, String str, String str2) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(commitHash, "commitHash");
        this.platform = platform;
        this.appVersion = appVersion;
        this.commitHash = commitHash;
        this.userId = l11;
        this.serverIssue = serverIssue;
        this.meshVersions = str;
        this.abVariants = str2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorSummaryState)) {
            return false;
        }
        ErrorSummaryState errorSummaryState = (ErrorSummaryState) other;
        return Intrinsics.d(this.platform, errorSummaryState.platform) && Intrinsics.d(this.appVersion, errorSummaryState.appVersion) && Intrinsics.d(this.commitHash, errorSummaryState.commitHash) && Intrinsics.d(this.userId, errorSummaryState.userId) && Intrinsics.d(this.serverIssue, errorSummaryState.serverIssue) && Intrinsics.d(this.meshVersions, errorSummaryState.meshVersions) && Intrinsics.d(this.abVariants, errorSummaryState.abVariants);
    }

    public final String getAbVariants() {
        return this.abVariants;
    }

    @NotNull
    public final String getAppVersion() {
        return this.appVersion;
    }

    @NotNull
    public final String getCommitHash() {
        return this.commitHash;
    }

    public final String getMeshVersions() {
        return this.meshVersions;
    }

    @NotNull
    public final String getPlatform() {
        return this.platform;
    }

    public final ScreenState.ServerIssue getServerIssue() {
        return this.serverIssue;
    }

    public final Long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        int a11 = g.a(g.a(this.platform.hashCode() * 31, 31, this.appVersion), 31, this.commitHash);
        Long l11 = this.userId;
        int hashCode = (a11 + (l11 == null ? 0 : l11.hashCode())) * 31;
        ScreenState.ServerIssue serverIssue = this.serverIssue;
        int hashCode2 = (hashCode + (serverIssue == null ? 0 : serverIssue.hashCode())) * 31;
        String str = this.meshVersions;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.abVariants;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.platform;
        String str2 = this.appVersion;
        String str3 = this.commitHash;
        Long l11 = this.userId;
        ScreenState.ServerIssue serverIssue = this.serverIssue;
        String str4 = this.meshVersions;
        String str5 = this.abVariants;
        StringBuilder d11 = C3660k.d("ErrorSummaryState(platform=", str, ", appVersion=", str2, ", commitHash=");
        d11.append(str3);
        d11.append(", userId=");
        d11.append(l11);
        d11.append(", serverIssue=");
        d11.append(serverIssue);
        d11.append(", meshVersions=");
        d11.append(str4);
        d11.append(", abVariants=");
        return o0.c(d11, str5, ")");
    }
}
