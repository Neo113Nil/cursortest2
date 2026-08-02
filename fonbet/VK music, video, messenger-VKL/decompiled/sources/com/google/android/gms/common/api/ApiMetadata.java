package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dq70;
import xsna.gsz0;
import xsna.ozg0;
import xsna.tdj;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = gsz0.a;
    public static final ApiMetadata e;

    @Nullable
    public final ComplianceOptions b;
    public final boolean c;
    public boolean d;

    static {
        ApiMetadata apiMetadata = new ApiMetadata(null, false);
        apiMetadata.d = false;
        e = apiMetadata;
        new ApiMetadata(null, false).d = true;
    }

    public ApiMetadata(@Nullable ComplianceOptions complianceOptions, boolean z) {
        this.b = complianceOptions;
        this.c = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return dq70.b(this.b, apiMetadata.b) && this.d == apiMetadata.d && this.c == apiMetadata.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Boolean.valueOf(this.d), Boolean.valueOf(this.c)});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        return tdj.a(new StringBuilder(valueOf.length() + 31), "ApiMetadata(complianceOptions=", valueOf, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        if (this.d) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
