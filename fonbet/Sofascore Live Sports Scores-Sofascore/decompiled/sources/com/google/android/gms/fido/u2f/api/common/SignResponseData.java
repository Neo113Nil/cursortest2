package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import defpackage.qbo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
@Deprecated
/* loaded from: classes3.dex */
public class SignResponseData extends ResponseData {

    @NonNull
    public static final Parcelable.Creator<SignResponseData> CREATOR = new zzl();
    public final byte[] a;
    public final String b;
    public final byte[] c;
    public final byte[] d;

    public SignResponseData(byte[] bArr, String str, byte[] bArr2, byte[] bArr3) {
        Preconditions.i(bArr);
        this.a = bArr;
        Preconditions.i(str);
        this.b = str;
        Preconditions.i(bArr2);
        this.c = bArr2;
        Preconditions.i(bArr3);
        this.d = bArr3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignResponseData)) {
            return false;
        }
        SignResponseData signResponseData = (SignResponseData) obj;
        return Arrays.equals(this.a, signResponseData.a) && Objects.a(this.b, signResponseData.b) && Arrays.equals(this.c, signResponseData.c) && Arrays.equals(this.d, signResponseData.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, Integer.valueOf(Arrays.hashCode(this.c)), Integer.valueOf(Arrays.hashCode(this.d))});
    }

    public final String toString() {
        zzbi a = zzbj.a(this);
        qbo qboVar = zzgf.a;
        byte[] bArr = this.a;
        a.a(qboVar.c(bArr.length, bArr), "keyHandle");
        a.a(this.b, "clientDataString");
        byte[] bArr2 = this.c;
        a.a(qboVar.c(bArr2.length, bArr2), "signatureData");
        byte[] bArr3 = this.d;
        a.a(qboVar.c(bArr3.length, bArr3), "application");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a, false);
        SafeParcelWriter.m(parcel, 3, this.b, false);
        SafeParcelWriter.c(parcel, 4, this.c, false);
        SafeParcelWriter.c(parcel, 5, this.d, false);
        SafeParcelWriter.t(parcel, s);
    }
}
