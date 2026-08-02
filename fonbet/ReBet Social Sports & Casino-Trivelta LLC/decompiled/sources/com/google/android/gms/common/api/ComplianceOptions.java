package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;

    /* renamed from: e, reason: collision with root package name */
    public static final ComplianceOptions f32264e;

    /* renamed from: a, reason: collision with root package name */
    public final int f32265a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32266b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32267c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32268d;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f32269a = -1;

        /* renamed from: b, reason: collision with root package name */
        public int f32270b = -1;

        /* renamed from: c, reason: collision with root package name */
        public int f32271c = 0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f32272d = true;

        public ComplianceOptions a() {
            return new ComplianceOptions(this.f32269a, this.f32270b, this.f32271c, this.f32272d);
        }

        public a b(int i10) {
            this.f32269a = i10;
            return this;
        }

        public a c(int i10) {
            this.f32270b = i10;
            return this;
        }

        public a d(boolean z10) {
            this.f32272d = z10;
            return this;
        }

        public a e(int i10) {
            this.f32271c = i10;
            return this;
        }
    }

    static {
        a g10 = g();
        g10.b(-1);
        g10.c(-1);
        g10.e(0);
        g10.d(true);
        f32264e = g10.a();
        CREATOR = new y();
    }

    public ComplianceOptions(int i10, int i11, int i12, boolean z10) {
        this.f32265a = i10;
        this.f32266b = i11;
        this.f32267c = i12;
        this.f32268d = z10;
    }

    public static a g() {
        return new a();
    }

    public static final a h(Context context) {
        return g();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f32265a == complianceOptions.f32265a && this.f32266b == complianceOptions.f32266b && this.f32267c == complianceOptions.f32267c && this.f32268d == complianceOptions.f32268d;
    }

    public final int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(this.f32265a), Integer.valueOf(this.f32266b), Integer.valueOf(this.f32267c), Boolean.valueOf(this.f32268d));
    }

    public final String toString() {
        int i10 = this.f32265a;
        int length = String.valueOf(i10).length();
        int i11 = this.f32266b;
        int length2 = String.valueOf(i11).length();
        int i12 = this.f32267c;
        int length3 = String.valueOf(i12).length();
        boolean z10 = this.f32268d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z10).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i10);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i11);
        sb2.append(", processingReason=");
        sb2.append(i12);
        sb2.append(", isUserData=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f32265a;
        int a10 = E9.b.a(parcel);
        E9.b.u(parcel, 1, i11);
        E9.b.u(parcel, 2, this.f32266b);
        E9.b.u(parcel, 3, this.f32267c);
        E9.b.g(parcel, 4, this.f32268d);
        E9.b.b(parcel, a10);
    }
}
