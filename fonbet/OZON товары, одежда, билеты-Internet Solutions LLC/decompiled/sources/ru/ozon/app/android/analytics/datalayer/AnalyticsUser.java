package ru.ozon.app.android.analytics.datalayer;

import B0.C2454a;
import Ek.a;
import Kk.C3532b;
import N3.C3660k;
import Pk0.g;
import c8.C5766e;
import com.google.android.gms.common.Scopes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001Bi\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0012\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u0015\"\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b$\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b&\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b'\u0010\u0015R\u0017\u0010\f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b(\u0010\u0017R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "", "", "id", "afid", "", "ordersCount", "gender", "", "isPushSubscribed", "emailHash", Scopes.EMAIL, "areaid", "recognized", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;Ljava/lang/String;IZ)V", "userId", "areaId", "updateUserInformation", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Lru/ozon/app/android/analytics/datalayer/AnalyticsUser;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getAfid", "setAfid", "(Ljava/lang/String;)V", "I", "getOrdersCount", "setOrdersCount", "(I)V", "getGender", "Z", "getEmailHash", "getEmail", "getAreaid", "getRecognized", "()Z", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class AnalyticsUser {
    private String afid;
    private final int areaid;
    private final transient String email;
    private final String emailHash;
    private final int gender;
    private final String id;
    private final boolean isPushSubscribed;
    private int ordersCount;
    private final boolean recognized;

    public AnalyticsUser() {
        this(null, null, 0, 0, false, null, null, 0, false, 511, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyticsUser)) {
            return false;
        }
        AnalyticsUser analyticsUser = (AnalyticsUser) other;
        return Intrinsics.d(this.id, analyticsUser.id) && Intrinsics.d(this.afid, analyticsUser.afid) && this.ordersCount == analyticsUser.ordersCount && this.gender == analyticsUser.gender && this.isPushSubscribed == analyticsUser.isPushSubscribed && Intrinsics.d(this.emailHash, analyticsUser.emailHash) && Intrinsics.d(this.email, analyticsUser.email) && this.areaid == analyticsUser.areaid && this.recognized == analyticsUser.recognized;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.afid;
        int a11 = C3532b.a(C2454a.a(this.gender, C2454a.a(this.ordersCount, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31, this.isPushSubscribed);
        String str3 = this.emailHash;
        int hashCode2 = (a11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return Boolean.hashCode(this.recognized) + C2454a.a(this.areaid, (hashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
    }

    public final void setAfid(String str) {
        this.afid = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.afid;
        int i11 = this.ordersCount;
        int i12 = this.gender;
        boolean z11 = this.isPushSubscribed;
        String str3 = this.emailHash;
        String str4 = this.email;
        int i13 = this.areaid;
        boolean z12 = this.recognized;
        StringBuilder d11 = C3660k.d("AnalyticsUser(id=", str, ", afid=", str2, ", ordersCount=");
        a.f(i11, i12, ", gender=", ", isPushSubscribed=", d11);
        C5766e.a(", emailHash=", str3, ", email=", d11, z11);
        g.d(i13, str4, ", areaid=", ", recognized=", d11);
        return Pk0.a.a(")", d11, z12);
    }

    @NotNull
    public final AnalyticsUser updateUserInformation(String userId, int gender, String email, String emailHash, int areaId) {
        return new AnalyticsUser(userId, this.afid, this.ordersCount, gender, this.isPushSubscribed, emailHash, email, areaId, userId != null ? !h.K(userId) : false);
    }

    public AnalyticsUser(String str, String str2, int i11, int i12, boolean z11, String str3, String str4, int i13, boolean z12) {
        this.id = str;
        this.afid = str2;
        this.ordersCount = i11;
        this.gender = i12;
        this.isPushSubscribed = z11;
        this.emailHash = str3;
        this.email = str4;
        this.areaid = i13;
        this.recognized = z12;
    }

    public /* synthetic */ AnalyticsUser(String str, String str2, int i11, int i12, boolean z11, String str3, String str4, int i13, boolean z12, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? null : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? -1 : i12, (i14 & 16) != 0 ? false : z11, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4, (i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? 2 : i13, (i14 & 256) != 0 ? false : z12);
    }
}
