package ru.ozon.id.nativeauth.account;

import Ak.C2436a;
import Bi.b;
import G.g;
import Nh.a;
import com.squareup.moshi.j;
import dc0.C6156b;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u000fJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b\"\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b#\u0010\u000fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0013R\u0011\u0010(\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010\u000f¨\u0006)"}, d2 = {"Lru/ozon/id/nativeauth/account/CrossAppCredentials;", "Ljava/io/Serializable;", "", "createdAt", "", "appName", "appPackage", "cookiesData", "", "fromOldFormat", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "()Z", "copy", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lru/ozon/id/nativeauth/account/CrossAppCredentials;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getCreatedAt", "Ljava/lang/String;", "getAppName", "getAppPackage", "getCookiesData", "Z", "getFromOldFormat", "Ldc0/b;", "getAccountCookies-2C5OJKw", "accountCookies", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CrossAppCredentials implements Serializable {

    @NotNull
    private final String appName;

    @NotNull
    private final String appPackage;

    @NotNull
    private final String cookiesData;
    private final long createdAt;
    private final boolean fromOldFormat;

    public CrossAppCredentials(long j11, @NotNull String appName, @NotNull String appPackage, @NotNull String cookiesData, boolean z11) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(cookiesData, "cookiesData");
        this.createdAt = j11;
        this.appName = appName;
        this.appPackage = appPackage;
        this.cookiesData = cookiesData;
        this.fromOldFormat = z11;
    }

    public static /* synthetic */ CrossAppCredentials copy$default(CrossAppCredentials crossAppCredentials, long j11, String str, String str2, String str3, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = crossAppCredentials.createdAt;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = crossAppCredentials.appName;
        }
        String str4 = str;
        if ((i11 & 4) != 0) {
            str2 = crossAppCredentials.appPackage;
        }
        String str5 = str2;
        if ((i11 & 8) != 0) {
            str3 = crossAppCredentials.cookiesData;
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            z11 = crossAppCredentials.fromOldFormat;
        }
        return crossAppCredentials.copy(j12, str4, str5, str6, z11);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCookiesData() {
        return this.cookiesData;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFromOldFormat() {
        return this.fromOldFormat;
    }

    @NotNull
    public final CrossAppCredentials copy(long createdAt, @NotNull String appName, @NotNull String appPackage, @NotNull String cookiesData, boolean fromOldFormat) {
        Intrinsics.checkNotNullParameter(appName, "appName");
        Intrinsics.checkNotNullParameter(appPackage, "appPackage");
        Intrinsics.checkNotNullParameter(cookiesData, "cookiesData");
        return new CrossAppCredentials(createdAt, appName, appPackage, cookiesData, fromOldFormat);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CrossAppCredentials)) {
            return false;
        }
        CrossAppCredentials crossAppCredentials = (CrossAppCredentials) other;
        return this.createdAt == crossAppCredentials.createdAt && Intrinsics.d(this.appName, crossAppCredentials.appName) && Intrinsics.d(this.appPackage, crossAppCredentials.appPackage) && Intrinsics.d(this.cookiesData, crossAppCredentials.cookiesData) && this.fromOldFormat == crossAppCredentials.fromOldFormat;
    }

    @NotNull
    /* renamed from: getAccountCookies-2C5OJKw, reason: not valid java name */
    public final String m1647getAccountCookies2C5OJKw() {
        String str = this.cookiesData;
        C6156b.a(str);
        return str;
    }

    @NotNull
    public final String getAppName() {
        return this.appName;
    }

    @NotNull
    public final String getAppPackage() {
        return this.appPackage;
    }

    @NotNull
    public final String getCookiesData() {
        return this.cookiesData;
    }

    public final long getCreatedAt() {
        return this.createdAt;
    }

    public final boolean getFromOldFormat() {
        return this.fromOldFormat;
    }

    public int hashCode() {
        return Boolean.hashCode(this.fromOldFormat) + g.a(g.a(g.a(Long.hashCode(this.createdAt) * 31, 31, this.appName), 31, this.appPackage), 31, this.cookiesData);
    }

    @NotNull
    public String toString() {
        long j11 = this.createdAt;
        String str = this.appName;
        String str2 = this.appPackage;
        String str3 = this.cookiesData;
        boolean z11 = this.fromOldFormat;
        StringBuilder c11 = C2436a.c(j11, "CrossAppCredentials(createdAt=", ", appName=", str);
        a.h(c11, ", appPackage=", str2, ", cookiesData=", str3);
        return b.f(c11, ", fromOldFormat=", z11, ")");
    }

    public /* synthetic */ CrossAppCredentials(long j11, String str, String str2, String str3, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? System.currentTimeMillis() : j11, str, str2, str3, z11);
    }
}
