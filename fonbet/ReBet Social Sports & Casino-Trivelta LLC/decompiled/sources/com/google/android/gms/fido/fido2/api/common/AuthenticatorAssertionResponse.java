package com.google.android.gms.fido.fido2.api.common;

import R9.A;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.fido.zzam;
import com.google.android.gms.internal.fido.zzan;
import com.google.android.gms.internal.fido.zzch;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new A();

    @NonNull
    private final byte[] zza;

    @NonNull
    private final byte[] zzb;

    @NonNull
    private final byte[] zzc;

    @NonNull
    private final byte[] zzd;
    private final byte[] zze;

    public AuthenticatorAssertionResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.zza = (byte[]) AbstractC3191o.m(bArr);
        this.zzb = (byte[]) AbstractC3191o.m(bArr2);
        this.zzc = (byte[]) AbstractC3191o.m(bArr3);
        this.zzd = (byte[]) AbstractC3191o.m(bArr4);
        this.zze = bArr5;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return Arrays.equals(this.zza, authenticatorAssertionResponse.zza) && Arrays.equals(this.zzb, authenticatorAssertionResponse.zzb) && Arrays.equals(this.zzc, authenticatorAssertionResponse.zzc) && Arrays.equals(this.zzd, authenticatorAssertionResponse.zzd) && Arrays.equals(this.zze, authenticatorAssertionResponse.zze);
    }

    public byte[] g() {
        return this.zzc;
    }

    public byte[] h() {
        return this.zzb;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)), Integer.valueOf(Arrays.hashCode(this.zzd)), Integer.valueOf(Arrays.hashCode(this.zze)));
    }

    public byte[] i() {
        return this.zza;
    }

    public byte[] j() {
        return this.zzd;
    }

    public byte[] k() {
        return this.zze;
    }

    public String toString() {
        zzam zza = zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.zza;
        zza.zzb("keyHandle", zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.zzb;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.zzc;
        zza.zzb("authenticatorData", zzf3.zzg(bArr3, 0, bArr3.length));
        zzch zzf4 = zzch.zzf();
        byte[] bArr4 = this.zzd;
        zza.zzb("signature", zzf4.zzg(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.zze;
        if (bArr5 != null) {
            zza.zzb("userHandle", zzch.zzf().zzg(bArr5, 0, bArr5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.l(parcel, 2, i(), false);
        E9.b.l(parcel, 3, h(), false);
        E9.b.l(parcel, 4, g(), false);
        E9.b.l(parcel, 5, j(), false);
        E9.b.l(parcel, 6, k(), false);
        E9.b.b(parcel, a10);
    }
}
