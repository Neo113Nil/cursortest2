package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = w.a();

    /* renamed from: d, reason: collision with root package name */
    public static final ApiMetadata f32256d = i().a();

    /* renamed from: e, reason: collision with root package name */
    public static final ApiMetadata f32257e;

    /* renamed from: a, reason: collision with root package name */
    public final ComplianceOptions f32258a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f32259b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32260c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public ComplianceOptions f32261a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f32262b = false;

        /* renamed from: c, reason: collision with root package name */
        public boolean f32263c;

        public ApiMetadata a() {
            ApiMetadata apiMetadata = new ApiMetadata(this.f32261a, this.f32262b);
            apiMetadata.j(this.f32263c);
            return apiMetadata;
        }

        public a b(ComplianceOptions complianceOptions) {
            this.f32261a = complianceOptions;
            return this;
        }

        public final /* synthetic */ a c(boolean z10) {
            this.f32263c = z10;
            return this;
        }
    }

    static {
        a i10 = i();
        i10.c(true);
        f32257e = i10.a();
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z10) {
        this.f32258a = complianceOptions;
        this.f32259b = z10;
    }

    public static final ApiMetadata g(ComplianceOptions complianceOptions) {
        a i10 = i();
        i10.b(complianceOptions);
        return i10.a();
    }

    public static final ApiMetadata h() {
        return f32256d;
    }

    public static a i() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return AbstractC3189m.b(this.f32258a, apiMetadata.f32258a) && this.f32260c == apiMetadata.f32260c && this.f32259b == apiMetadata.f32259b;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32258a, Boolean.valueOf(this.f32260c), Boolean.valueOf(this.f32259b));
    }

    public final /* synthetic */ void j(boolean z10) {
        this.f32260c = z10;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32258a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 31);
        sb2.append("ApiMetadata(complianceOptions=");
        sb2.append(valueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f32260c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, this.f32258a, i10, false);
        E9.b.g(parcel, 2, this.f32259b);
        E9.b.b(parcel, a10);
    }
}
