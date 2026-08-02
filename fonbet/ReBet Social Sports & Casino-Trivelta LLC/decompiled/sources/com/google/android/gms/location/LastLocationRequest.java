package com.google.android.gms.location;

import E9.b;
import V9.G;
import V9.N;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<LastLocationRequest> CREATOR = new N();

    /* renamed from: a, reason: collision with root package name */
    public final long f33080a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33081b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f33082c;

    /* renamed from: d, reason: collision with root package name */
    public final String f33083d;

    /* renamed from: e, reason: collision with root package name */
    public final zzd f33084e;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f33085a = LongCompanionObject.MAX_VALUE;

        /* renamed from: b, reason: collision with root package name */
        public int f33086b = 0;

        /* renamed from: c, reason: collision with root package name */
        public boolean f33087c = false;

        /* renamed from: d, reason: collision with root package name */
        public String f33088d = null;

        /* renamed from: e, reason: collision with root package name */
        public zzd f33089e = null;

        public LastLocationRequest a() {
            return new LastLocationRequest(this.f33085a, this.f33086b, this.f33087c, this.f33088d, this.f33089e);
        }
    }

    public LastLocationRequest(long j10, int i10, boolean z10, String str, zzd zzdVar) {
        this.f33080a = j10;
        this.f33081b = i10;
        this.f33082c = z10;
        this.f33083d = str;
        this.f33084e = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.f33080a == lastLocationRequest.f33080a && this.f33081b == lastLocationRequest.f33081b && this.f33082c == lastLocationRequest.f33082c && AbstractC3189m.b(this.f33083d, lastLocationRequest.f33083d) && AbstractC3189m.b(this.f33084e, lastLocationRequest.f33084e);
    }

    public int g() {
        return this.f33081b;
    }

    public long h() {
        return this.f33080a;
    }

    public int hashCode() {
        return AbstractC3189m.c(Long.valueOf(this.f33080a), Integer.valueOf(this.f33081b), Boolean.valueOf(this.f33082c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("LastLocationRequest[");
        if (this.f33080a != LongCompanionObject.MAX_VALUE) {
            sb2.append("maxAge=");
            zzdj.zzb(this.f33080a, sb2);
        }
        if (this.f33081b != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f33081b));
        }
        if (this.f33082c) {
            sb2.append(", bypass");
        }
        if (this.f33083d != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f33083d);
        }
        if (this.f33084e != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f33084e);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.y(parcel, 1, h());
        b.u(parcel, 2, g());
        b.g(parcel, 3, this.f33082c);
        b.F(parcel, 4, this.f33083d, false);
        b.D(parcel, 5, this.f33084e, i10, false);
        b.b(parcel, a10);
    }
}
