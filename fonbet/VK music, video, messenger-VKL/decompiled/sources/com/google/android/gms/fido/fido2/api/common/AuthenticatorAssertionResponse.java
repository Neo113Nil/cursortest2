package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgx;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.exc0;
import xsna.ih01;
import xsna.k46;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class AuthenticatorAssertionResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAssertionResponse> CREATOR = new ih01();

    @NonNull
    public final zzgx b;

    @NonNull
    public final zzgx c;

    @NonNull
    public final zzgx d;

    @NonNull
    public final zzgx e;

    @Nullable
    public final zzgx f;

    public AuthenticatorAssertionResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull byte[] bArr4, @Nullable byte[] bArr5) {
        exc0.i(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        exc0.i(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        exc0.i(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        exc0.i(bArr4);
        zzgx zzl4 = zzgx.zzl(bArr4, 0, bArr4.length);
        zzgx zzl5 = bArr5 == null ? null : zzgx.zzl(bArr5, 0, bArr5.length);
        exc0.i(zzl);
        this.b = zzl;
        exc0.i(zzl2);
        this.c = zzl2;
        exc0.i(zzl3);
        this.d = zzl3;
        exc0.i(zzl4);
        this.e = zzl4;
        this.f = zzl5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorAssertionResponse)) {
            return false;
        }
        AuthenticatorAssertionResponse authenticatorAssertionResponse = (AuthenticatorAssertionResponse) obj;
        return dq70.b(this.b, authenticatorAssertionResponse.b) && dq70.b(this.c, authenticatorAssertionResponse.c) && dq70.b(this.d, authenticatorAssertionResponse.d) && dq70.b(this.e, authenticatorAssertionResponse.e) && dq70.b(this.f, authenticatorAssertionResponse.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d})), Integer.valueOf(Arrays.hashCode(new Object[]{this.e})), Integer.valueOf(Arrays.hashCode(new Object[]{this.f}))});
    }

    @NonNull
    public final JSONObject i() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("clientDataJSON", k46.c(this.c.zzm()));
            jSONObject.put("authenticatorData", k46.c(this.d.zzm()));
            jSONObject.put(InAppPurchaseMetaData.KEY_SIGNATURE, k46.c(this.e.zzm()));
            zzgx zzgxVar = this.f;
            if (zzgxVar == null) {
                return jSONObject;
            }
            jSONObject.put("userHandle", k46.c(zzgxVar == null ? null : zzgxVar.zzm()));
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticatorAssertionResponse to JSON object", e);
        }
    }

    @NonNull
    public final String toString() {
        zzbi zza = zzbj.zza(this);
        zzgf zzf = zzgf.zzf();
        byte[] zzm = this.b.zzm();
        zza.zzb("keyHandle", zzf.zzg(zzm, 0, zzm.length));
        zzgf zzf2 = zzgf.zzf();
        byte[] zzm2 = this.c.zzm();
        zza.zzb("clientDataJSON", zzf2.zzg(zzm2, 0, zzm2.length));
        zzgf zzf3 = zzgf.zzf();
        byte[] zzm3 = this.d.zzm();
        zza.zzb("authenticatorData", zzf3.zzg(zzm3, 0, zzm3.length));
        zzgf zzf4 = zzgf.zzf();
        byte[] zzm4 = this.e.zzm();
        zza.zzb(InAppPurchaseMetaData.KEY_SIGNATURE, zzf4.zzg(zzm4, 0, zzm4.length));
        zzgx zzgxVar = this.f;
        byte[] zzm5 = zzgxVar == null ? null : zzgxVar.zzm();
        if (zzm5 != null) {
            zza.zzb("userHandle", zzgf.zzf().zzg(zzm5, 0, zzm5.length));
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.e(parcel, 2, this.b.zzm(), false);
        ozg0.e(parcel, 3, this.c.zzm(), false);
        ozg0.e(parcel, 4, this.d.zzm(), false);
        ozg0.e(parcel, 5, this.e.zzm(), false);
        zzgx zzgxVar = this.f;
        ozg0.e(parcel, 6, zzgxVar == null ? null : zzgxVar.zzm(), false);
        ozg0.x(w, parcel);
    }
}
