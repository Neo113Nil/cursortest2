package com.google.android.gms.location;

import E9.b;
import V9.D;
import V9.G;
import V9.t;
import V9.v;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.location.zzd;
import com.google.android.gms.internal.location.zzdj;
import kotlin.jvm.internal.LongCompanionObject;

/* loaded from: classes2.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<CurrentLocationRequest> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public final long f33055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33056b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33057c;

    /* renamed from: d, reason: collision with root package name */
    public final long f33058d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f33059e;

    /* renamed from: f, reason: collision with root package name */
    public final int f33060f;

    /* renamed from: g, reason: collision with root package name */
    public final String f33061g;

    /* renamed from: h, reason: collision with root package name */
    public final WorkSource f33062h;

    /* renamed from: i, reason: collision with root package name */
    public final zzd f33063i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f33064a = 60000;

        /* renamed from: b, reason: collision with root package name */
        public int f33065b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f33066c = 102;

        /* renamed from: d, reason: collision with root package name */
        public long f33067d = LongCompanionObject.MAX_VALUE;

        /* renamed from: e, reason: collision with root package name */
        public boolean f33068e = false;

        /* renamed from: f, reason: collision with root package name */
        public int f33069f = 0;

        /* renamed from: g, reason: collision with root package name */
        public String f33070g = null;

        /* renamed from: h, reason: collision with root package name */
        public WorkSource f33071h = null;

        /* renamed from: i, reason: collision with root package name */
        public zzd f33072i = null;

        public CurrentLocationRequest a() {
            return new CurrentLocationRequest(this.f33064a, this.f33065b, this.f33066c, this.f33067d, this.f33068e, this.f33069f, this.f33070g, new WorkSource(this.f33071h), this.f33072i);
        }

        public a b(long j10) {
            AbstractC3191o.b(j10 > 0, "durationMillis must be greater than 0");
            this.f33067d = j10;
            return this;
        }

        public a c(long j10) {
            AbstractC3191o.b(j10 >= 0, "maxUpdateAgeMillis must be greater than or equal to 0");
            this.f33064a = j10;
            return this;
        }

        public a d(int i10) {
            t.a(i10);
            this.f33066c = i10;
            return this;
        }
    }

    public CurrentLocationRequest(long j10, int i10, int i11, long j11, boolean z10, int i12, String str, WorkSource workSource, zzd zzdVar) {
        boolean z11 = true;
        if (Build.VERSION.SDK_INT >= 30 && str != null) {
            z11 = false;
        }
        AbstractC3191o.a(z11);
        this.f33055a = j10;
        this.f33056b = i10;
        this.f33057c = i11;
        this.f33058d = j11;
        this.f33059e = z10;
        this.f33060f = i12;
        this.f33061g = str;
        this.f33062h = workSource;
        this.f33063i = zzdVar;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.f33055a == currentLocationRequest.f33055a && this.f33056b == currentLocationRequest.f33056b && this.f33057c == currentLocationRequest.f33057c && this.f33058d == currentLocationRequest.f33058d && this.f33059e == currentLocationRequest.f33059e && this.f33060f == currentLocationRequest.f33060f && AbstractC3189m.b(this.f33061g, currentLocationRequest.f33061g) && AbstractC3189m.b(this.f33062h, currentLocationRequest.f33062h) && AbstractC3189m.b(this.f33063i, currentLocationRequest.f33063i);
    }

    public long g() {
        return this.f33058d;
    }

    public int h() {
        return this.f33056b;
    }

    public int hashCode() {
        return AbstractC3189m.c(Long.valueOf(this.f33055a), Integer.valueOf(this.f33056b), Integer.valueOf(this.f33057c), Long.valueOf(this.f33058d));
    }

    public long i() {
        return this.f33055a;
    }

    public int j() {
        return this.f33057c;
    }

    public final int k() {
        return this.f33060f;
    }

    public final WorkSource l() {
        return this.f33062h;
    }

    public final boolean m() {
        return this.f33059e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLocationRequest[");
        sb2.append(t.b(this.f33057c));
        if (this.f33055a != LongCompanionObject.MAX_VALUE) {
            sb2.append(", maxAge=");
            zzdj.zzb(this.f33055a, sb2);
        }
        if (this.f33058d != LongCompanionObject.MAX_VALUE) {
            sb2.append(", duration=");
            sb2.append(this.f33058d);
            sb2.append("ms");
        }
        if (this.f33056b != 0) {
            sb2.append(", ");
            sb2.append(G.b(this.f33056b));
        }
        if (this.f33059e) {
            sb2.append(", bypass");
        }
        if (this.f33060f != 0) {
            sb2.append(", ");
            sb2.append(v.a(this.f33060f));
        }
        if (this.f33061g != null) {
            sb2.append(", moduleId=");
            sb2.append(this.f33061g);
        }
        if (!K9.t.d(this.f33062h)) {
            sb2.append(", workSource=");
            sb2.append(this.f33062h);
        }
        if (this.f33063i != null) {
            sb2.append(", impersonation=");
            sb2.append(this.f33063i);
        }
        sb2.append(']');
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.y(parcel, 1, i());
        b.u(parcel, 2, h());
        b.u(parcel, 3, j());
        b.y(parcel, 4, g());
        b.g(parcel, 5, this.f33059e);
        b.D(parcel, 6, this.f33062h, i10, false);
        b.u(parcel, 7, this.f33060f);
        b.F(parcel, 8, this.f33061g, false);
        b.D(parcel, 9, this.f33063i, i10, false);
        b.b(parcel, a10);
    }

    public final String zzd() {
        return this.f33061g;
    }
}
