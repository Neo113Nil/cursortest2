package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import xsna.dgn;
import xsna.f601;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;

    static {
        new ComplianceOptions(-1, -1, 0, true);
        CREATOR = new f601();
    }

    public ComplianceOptions(int i, int i2, int i3, boolean z) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.b == complianceOptions.b && this.c == complianceOptions.c && this.d == complianceOptions.d && this.e == complianceOptions.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e)});
    }

    @NonNull
    public final String toString() {
        int i = this.b;
        int length = String.valueOf(i).length();
        int i2 = this.c;
        int length2 = String.valueOf(i2).length();
        int i3 = this.d;
        int length3 = String.valueOf(i3).length();
        boolean z = this.e;
        StringBuilder sb = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z).length() + 1);
        dgn.a(i, i2, "ComplianceOptions{callerProductId=", ", dataOwnerProductId=", sb);
        sb.append(", processingReason=");
        sb.append(i3);
        sb.append(", isUserData=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b);
        ozg0.v(parcel, 2, 4);
        parcel.writeInt(this.c);
        ozg0.v(parcel, 3, 4);
        parcel.writeInt(this.d);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
