package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d6.o;
import h8.b;
import java.util.Arrays;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class ComplianceOptions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ComplianceOptions> CREATOR = new o(1);

    /* renamed from: a, reason: collision with root package name */
    public final int f4453a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4454b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4455c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4456d;

    public ComplianceOptions(int i5, int i10, int i11, boolean z5) {
        this.f4453a = i5;
        this.f4454b = i10;
        this.f4455c = i11;
        this.f4456d = z5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ComplianceOptions)) {
            return false;
        }
        ComplianceOptions complianceOptions = (ComplianceOptions) obj;
        return this.f4453a == complianceOptions.f4453a && this.f4454b == complianceOptions.f4454b && this.f4455c == complianceOptions.f4455c && this.f4456d == complianceOptions.f4456d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4453a), Integer.valueOf(this.f4454b), Integer.valueOf(this.f4455c), Boolean.valueOf(this.f4456d)});
    }

    public final String toString() {
        int i5 = this.f4453a;
        int length = String.valueOf(i5).length();
        int i10 = this.f4454b;
        int length2 = String.valueOf(i10).length();
        int i11 = this.f4455c;
        int length3 = String.valueOf(i11).length();
        boolean z5 = this.f4456d;
        StringBuilder sb2 = new StringBuilder(length + 55 + length2 + 19 + length3 + 13 + String.valueOf(z5).length() + 1);
        sb2.append("ComplianceOptions{callerProductId=");
        sb2.append(i5);
        sb2.append(", dataOwnerProductId=");
        sb2.append(i10);
        sb2.append(", processingReason=");
        sb2.append(i11);
        sb2.append(", isUserData=");
        sb2.append(z5);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4453a);
        b.U(parcel, 2, 4);
        parcel.writeInt(this.f4454b);
        b.U(parcel, 3, 4);
        parcel.writeInt(this.f4455c);
        b.U(parcel, 4, 4);
        parcel.writeInt(this.f4456d ? 1 : 0);
        b.W(parcel, V);
    }
}
