package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.f4n;
import defpackage.wt3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class ApiMetadata extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<ApiMetadata> CREATOR = f4n.a;
    public static final ApiMetadata d = new Builder().a();
    public final ComplianceOptions a;
    public final boolean b;
    public boolean c;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @KeepForSdk
    public static final class Builder {
        public ComplianceOptions a;
        public boolean b = false;
        public boolean c;

        public final ApiMetadata a() {
            ApiMetadata apiMetadata = new ApiMetadata(this.a, this.b);
            apiMetadata.c = this.c;
            return apiMetadata;
        }
    }

    static {
        Builder builder = new Builder();
        builder.c = true;
        builder.a();
    }

    public ApiMetadata(ComplianceOptions complianceOptions, boolean z) {
        this.a = complianceOptions;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ApiMetadata)) {
            return false;
        }
        ApiMetadata apiMetadata = (ApiMetadata) obj;
        return Objects.a(this.a, apiMetadata.a) && this.c == apiMetadata.c && this.b == apiMetadata.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return wt3.m("ApiMetadata(complianceOptions=", valueOf, new StringBuilder(valueOf.length() + 31), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.r(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
