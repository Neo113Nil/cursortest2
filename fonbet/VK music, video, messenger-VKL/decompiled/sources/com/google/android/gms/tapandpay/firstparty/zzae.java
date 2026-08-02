package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.jvz0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzae> CREATOR = new jvz0();
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public long o;
    public String p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public String v;
    public int w;

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof zzae) {
            zzae zzaeVar = (zzae) obj;
            if (dq70.b(this.b, zzaeVar.b) && dq70.b(this.c, zzaeVar.c) && dq70.b(this.d, zzaeVar.d) && dq70.b(this.e, zzaeVar.e) && dq70.b(this.f, zzaeVar.f) && dq70.b(this.g, zzaeVar.g) && dq70.b(this.h, zzaeVar.h) && dq70.b(this.i, zzaeVar.i) && dq70.b(this.j, zzaeVar.j) && dq70.b(this.k, zzaeVar.k) && dq70.b(this.l, zzaeVar.l) && dq70.b(this.m, zzaeVar.m) && dq70.b(this.n, zzaeVar.n) && this.o == zzaeVar.o && dq70.b(this.p, zzaeVar.p) && dq70.b(this.q, zzaeVar.q) && dq70.b(this.r, zzaeVar.r) && dq70.b(this.s, zzaeVar.s) && dq70.b(this.t, zzaeVar.t) && dq70.b(this.u, zzaeVar.u) && dq70.b(this.v, zzaeVar.v) && dq70.b(Integer.valueOf(this.w), Integer.valueOf(zzaeVar.w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, Long.valueOf(this.o), this.p, this.q, this.r, this.s, this.t, this.u, this.v, Integer.valueOf(this.w)});
    }

    public final String toString() {
        dq70.a aVar = new dq70.a(this);
        aVar.a(this.b, "issuerName");
        aVar.a(this.c, "issuerPhoneNumber");
        aVar.a(this.d, "appLogoUrl");
        aVar.a(this.e, "appName");
        aVar.a(this.f, "appDeveloperName");
        aVar.a(this.g, "appPackageName");
        aVar.a(this.h, "privacyNoticeUrl");
        aVar.a(this.i, "termsAndConditionsUrl");
        aVar.a(this.j, "productShortName");
        aVar.a(this.k, "appAction");
        aVar.a(this.l, "appIntentExtraMessage");
        aVar.a(this.m, "issuerMessageHeadline");
        aVar.a(this.n, "issuerMessageBody");
        aVar.a(Long.valueOf(this.o), "issuerMessageExpiryTimestampMillis");
        aVar.a(this.p, "issuerMessageLinkPackageName");
        aVar.a(this.q, "issuerMessageLinkAction");
        aVar.a(this.r, "issuerMessageLinkExtraText");
        aVar.a(this.s, "issuerMessageLinkUrl");
        aVar.a(this.t, "issuerMessageLinkText");
        aVar.a(this.u, "issuerWebLinkUrl");
        aVar.a(this.v, "issuerWebLinkText");
        aVar.a(Integer.valueOf(this.w), "issuerMessageType");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.q(parcel, 2, this.b, false);
        ozg0.q(parcel, 3, this.c, false);
        ozg0.q(parcel, 4, this.d, false);
        ozg0.q(parcel, 5, this.e, false);
        ozg0.q(parcel, 6, this.f, false);
        ozg0.q(parcel, 7, this.g, false);
        ozg0.q(parcel, 8, this.h, false);
        ozg0.q(parcel, 9, this.i, false);
        ozg0.q(parcel, 10, this.j, false);
        ozg0.q(parcel, 11, this.k, false);
        ozg0.q(parcel, 12, this.l, false);
        ozg0.q(parcel, 13, this.m, false);
        ozg0.q(parcel, 14, this.n, false);
        long j = this.o;
        ozg0.v(parcel, 15, 8);
        parcel.writeLong(j);
        ozg0.q(parcel, 16, this.p, false);
        ozg0.q(parcel, 17, this.q, false);
        ozg0.q(parcel, 18, this.r, false);
        ozg0.q(parcel, 20, this.s, false);
        ozg0.q(parcel, 21, this.t, false);
        ozg0.q(parcel, 22, this.u, false);
        ozg0.q(parcel, 23, this.v, false);
        int i2 = this.w;
        ozg0.v(parcel, 24, 4);
        parcel.writeInt(i2);
        ozg0.x(w, parcel);
    }
}
