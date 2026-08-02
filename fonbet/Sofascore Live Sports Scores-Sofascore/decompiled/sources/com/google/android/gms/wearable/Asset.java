package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.ironsource.U3;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class Asset extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<Asset> CREATOR = new zzd();
    public final byte[] a;
    public final String b;
    public final ParcelFileDescriptor c;
    public final Uri d;

    public Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.a = bArr;
        this.b = str;
        this.c = parcelFileDescriptor;
        this.d = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.a, asset.a) && Objects.a(this.b, asset.b) && Objects.a(this.c, asset.c) && Objects.a(this.d, asset.d);
    }

    public final int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Asset[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.b;
        if (str == null) {
            sb.append(", nodigest");
        } else {
            sb.append(", ");
            sb.append(str);
        }
        byte[] bArr = this.a;
        if (bArr != null) {
            sb.append(", size=");
            sb.append(bArr.length);
        }
        ParcelFileDescriptor parcelFileDescriptor = this.c;
        if (parcelFileDescriptor != null) {
            sb.append(", fd=");
            sb.append(parcelFileDescriptor);
        }
        Uri uri = this.d;
        if (uri != null) {
            sb.append(", uri=");
            sb.append(uri);
        }
        sb.append(U3.j.e);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        int i2 = i | 1;
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.l(parcel, 4, this.c, i2, false);
        SafeParcelWriter.l(parcel, 5, this.d, i2, false);
        SafeParcelWriter.t(parcel, s);
    }
}
