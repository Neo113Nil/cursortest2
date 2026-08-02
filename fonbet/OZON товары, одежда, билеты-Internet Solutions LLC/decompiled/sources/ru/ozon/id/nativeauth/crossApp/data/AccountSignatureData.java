package ru.ozon.id.nativeauth.crossApp.data;

import G.g;
import N3.C3660k;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/id/nativeauth/crossApp/data/AccountSignatureData;", "", "publicKey", "", "privateKey", "userId", "", "appName", "createdAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;J)V", "getPublicKey", "()Ljava/lang/String;", "getPrivateKey", "getUserId", "()J", "getAppName", "getCreatedAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AccountSignatureData {

    @NotNull
    private final String appName;
    private final long createdAt;

    @NotNull
    private final String privateKey;

    @NotNull
    private final String publicKey;
    private final long userId;

    public AccountSignatureData(@NotNull String publicKey, @NotNull String privateKey, long j11, @NotNull String appName, long j12) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(appName, "appName");
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.userId = j11;
        this.appName = appName;
        this.createdAt = j12;
    }

    public static /* synthetic */ AccountSignatureData copy$default(AccountSignatureData accountSignatureData, String str, String str2, long j11, String str3, long j12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = accountSignatureData.publicKey;
        }
        if ((i11 & 2) != 0) {
            str2 = accountSignatureData.privateKey;
        }
        if ((i11 & 4) != 0) {
            j11 = accountSignatureData.userId;
        }
        if ((i11 & 8) != 0) {
            str3 = accountSignatureData.appName;
        }
        if ((i11 & 16) != 0) {
            j12 = accountSignatureData.createdAt;
        }
        String str4 = str3;
        long j13 = j11;
        return accountSignatureData.copy(str, str2, j13, str4, j12);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPrivateKey() {
        return this.privateKey;
    }

    /* renamed from: component3, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component5, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final AccountSignatureData copy(@NotNull String publicKey, @NotNull String privateKey, long userId, @NotNull String appName, long createdAt) {
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
        Intrinsics.checkNotNullParameter(privateKey, "privateKey");
        Intrinsics.checkNotNullParameter(appName, "appName");
        return new AccountSignatureData(publicKey, privateKey, userId, appName, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountSignatureData)) {
            return false;
        }
        AccountSignatureData accountSignatureData = (AccountSignatureData) other;
        return Intrinsics.d(this.publicKey, accountSignatureData.publicKey) && Intrinsics.d(this.privateKey, accountSignatureData.privateKey) && this.userId == accountSignatureData.userId && Intrinsics.d(this.appName, accountSignatureData.appName) && this.createdAt == accountSignatureData.createdAt;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    public final String getPrivateKey() {
        return this.privateKey;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return Long.hashCode(this.createdAt) + g.a(c.a(g.a(this.publicKey.hashCode() * 31, 31, this.privateKey), 31, this.userId), 31, this.appName);
    }

    @NotNull
    public String toString() {
        String str = this.publicKey;
        String str2 = this.privateKey;
        long j11 = this.userId;
        String str3 = this.appName;
        long j12 = this.createdAt;
        StringBuilder d11 = C3660k.d("AccountSignatureData(publicKey=", str, ", privateKey=", str2, ", userId=");
        d11.append(j11);
        d11.append(", appName=");
        d11.append(str3);
        d11.append(", createdAt=");
        d11.append(j12);
        d11.append(")");
        return d11.toString();
    }
}
