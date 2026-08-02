package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.feature.result.CommonConstant;
import java.util.ArrayList;
import java.util.Arrays;
import xsna.dq70;
import xsna.n801;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new n801();
    public boolean A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public String F;
    public String G;
    public String b;
    public byte[] c;
    public String d;
    public String e;
    public int f;
    public TokenStatus g;
    public String h;
    public Uri i;
    public int j;
    public int k;

    @Nullable
    public zzae l;
    public String m;
    public zzaz n;
    public String o;
    public byte[] p;
    public int q;
    public int r;
    public int s;
    public zzac t;
    public zzaa u;
    public String v;
    public zzai[] w;
    public boolean x;
    public ArrayList y;
    public boolean z;

    static {
        com.google.android.gms.internal.tapandpay.zzas.zza(10, 9);
    }

    public CardInfo() {
        throw null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof CardInfo)) {
            return false;
        }
        CardInfo cardInfo = (CardInfo) obj;
        return dq70.b(this.b, cardInfo.b) && Arrays.equals(this.c, cardInfo.c) && dq70.b(this.d, cardInfo.d) && dq70.b(this.e, cardInfo.e) && this.f == cardInfo.f && dq70.b(this.g, cardInfo.g) && dq70.b(this.h, cardInfo.h) && dq70.b(this.i, cardInfo.i) && this.j == cardInfo.j && this.k == cardInfo.k && dq70.b(this.l, cardInfo.l) && dq70.b(this.m, cardInfo.m) && dq70.b(this.n, cardInfo.n) && this.q == cardInfo.q && this.r == cardInfo.r && this.s == cardInfo.s && dq70.b(this.t, cardInfo.t) && dq70.b(this.u, cardInfo.u) && dq70.b(this.v, cardInfo.v) && Arrays.equals(this.w, cardInfo.w) && this.x == cardInfo.x && dq70.b(this.y, cardInfo.y) && this.z == cardInfo.z && this.A == cardInfo.A && this.B == cardInfo.B && this.D == cardInfo.D && this.E == cardInfo.E && dq70.b(this.F, cardInfo.F) && dq70.b(this.G, cardInfo.G);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, Integer.valueOf(this.f), this.g, this.h, this.i, Integer.valueOf(this.j), Integer.valueOf(this.k), this.m, this.n, Integer.valueOf(this.q), Integer.valueOf(this.r), Integer.valueOf(this.s), this.t, this.u, this.v, this.w, Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), Boolean.valueOf(this.A), Long.valueOf(this.B), Boolean.valueOf(this.D), Long.valueOf(this.E), this.F, this.G});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "billingCardId");
        byte[] bArr = this.c;
        aVar.a(bArr == null ? null : Arrays.toString(bArr), "serverToken");
        aVar.a(this.d, "cardholderName");
        aVar.a(this.e, CommonConstant.KEY_DISPLAY_NAME);
        aVar.a(Integer.valueOf(this.f), "cardNetwork");
        aVar.a(this.g, "tokenStatus");
        aVar.a(this.h, "panLastDigits");
        aVar.a(this.i, "cardImageUrl");
        aVar.a(Integer.valueOf(this.j), "cardColor");
        aVar.a(Integer.valueOf(this.k), "overlayTextColor");
        zzae zzaeVar = this.l;
        aVar.a(zzaeVar == null ? null : zzaeVar.toString(), "issuerInfo");
        aVar.a(this.m, "tokenLastDigits");
        aVar.a(this.n, "transactionInfo");
        byte[] bArr2 = this.p;
        aVar.a(bArr2 == null ? null : Arrays.toString(bArr2), "inAppCardToken");
        aVar.a(Integer.valueOf(this.q), "cachedEligibility");
        aVar.a(Integer.valueOf(this.r), "paymentProtocol");
        aVar.a(Integer.valueOf(this.s), "tokenType");
        aVar.a(this.t, "inStoreCvmConfig");
        aVar.a(this.u, "inAppCvmConfig");
        aVar.a(this.v, "tokenDisplayName");
        zzai[] zzaiVarArr = this.w;
        aVar.a(zzaiVarArr != null ? Arrays.toString(zzaiVarArr) : null, "onlineAccountCardLinkInfos");
        aVar.a(Boolean.valueOf(this.x), "allowAidSelection");
        String join = TextUtils.join(", ", this.y);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
        sb.append('[');
        sb.append(join);
        sb.append(']');
        aVar.a(sb.toString(), "badges");
        aVar.a(Boolean.valueOf(this.z), "upgradeAvailable");
        aVar.a(Boolean.valueOf(this.A), "requiresSignature");
        aVar.a(Long.valueOf(this.B), "googleTokenId");
        aVar.a(Boolean.valueOf(this.D), "isTransit");
        aVar.a(Long.valueOf(this.E), "googleWalletId");
        aVar.a(this.F, "devicePaymentMethodId");
        aVar.a(this.G, "cloudPaymentMethodId");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.e(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        int i2 = this.f;
        ozg0.v(parcel, 6, 4);
        parcel.writeInt(i2);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.p(parcel, 9, this.i, i, false);
        int i3 = this.j;
        ozg0.v(parcel, 10, 4);
        parcel.writeInt(i3);
        int i4 = this.k;
        ozg0.v(parcel, 11, 4);
        parcel.writeInt(i4);
        ozg0.p(parcel, 12, this.l, i, false);
        ozg0.q(parcel, 13, this.m, false);
        ozg0.p(parcel, 15, this.n, i, false);
        ozg0.q(parcel, 16, this.o, false);
        ozg0.e(parcel, 17, this.p, false);
        int i5 = this.q;
        ozg0.v(parcel, 18, 4);
        parcel.writeInt(i5);
        int i6 = this.r;
        ozg0.v(parcel, 20, 4);
        parcel.writeInt(i6);
        int i7 = this.s;
        ozg0.v(parcel, 21, 4);
        parcel.writeInt(i7);
        ozg0.p(parcel, 22, this.t, i, false);
        ozg0.p(parcel, 23, this.u, i, false);
        ozg0.q(parcel, 24, this.v, false);
        ozg0.t(parcel, 25, this.w, i);
        boolean z = this.x;
        ozg0.v(parcel, 26, 4);
        parcel.writeInt(z ? 1 : 0);
        ozg0.u(parcel, 27, this.y, false);
        boolean z2 = this.z;
        ozg0.v(parcel, 28, 4);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = this.A;
        ozg0.v(parcel, 29, 4);
        parcel.writeInt(z3 ? 1 : 0);
        long j = this.B;
        ozg0.v(parcel, 30, 8);
        parcel.writeLong(j);
        long j2 = this.C;
        ozg0.v(parcel, 31, 8);
        parcel.writeLong(j2);
        boolean z4 = this.D;
        ozg0.v(parcel, 32, 4);
        parcel.writeInt(z4 ? 1 : 0);
        long j3 = this.E;
        ozg0.v(parcel, 33, 8);
        parcel.writeLong(j3);
        ozg0.q(parcel, 34, this.F, false);
        ozg0.q(parcel, 35, this.G, false);
        ozg0.x(w, parcel);
    }
}
