package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.o;
import d9.e;
import g6.v;
import h8.b;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = o.f8262b;

    /* renamed from: d, reason: collision with root package name */
    public static final ApiMetadata f4449d;

    /* renamed from: a, reason: collision with root package name */
    public final ComplianceOptions f4450a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4451b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4452c;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.f4452c = false;
        f4449d = apiMetadata;
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z5) {
        this.f4450a = complianceOptions;
        this.f4451b = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return v.k(this.f4450a, apiMetadata.f4450a) && this.f4452c == apiMetadata.f4452c && this.f4451b == apiMetadata.f4451b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4450a, Boolean.valueOf(this.f4452c), Boolean.valueOf(this.f4451b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4450a);
        return e.m(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        if (this.f4452c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4450a, i5, false);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4451b ? 1 : 0);
        b.W(parcel, V);
    }
}
