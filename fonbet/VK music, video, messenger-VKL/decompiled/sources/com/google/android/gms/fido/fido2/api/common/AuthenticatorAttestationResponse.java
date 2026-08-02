package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aj01;
import xsna.dq70;
import xsna.exc0;
import xsna.k46;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new aj01();

    @NonNull
    public final zzgx b;

    @NonNull
    public final zzgx c;

    @NonNull
    public final zzgx d;

    @NonNull
    public final String[] e;

    public AuthenticatorAttestationResponse(@NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3, @NonNull String[] strArr) {
        exc0.i(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        exc0.i(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        exc0.i(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        exc0.i(zzl);
        this.b = zzl;
        exc0.i(zzl2);
        this.c = zzl2;
        exc0.i(zzl3);
        this.d = zzl3;
        exc0.i(strArr);
        this.e = strArr;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return dq70.b(this.b, authenticatorAttestationResponse.b) && dq70.b(this.c, authenticatorAttestationResponse.c) && dq70.b(this.d, authenticatorAttestationResponse.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c})), Integer.valueOf(Arrays.hashCode(new Object[]{this.d}))});
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f6 A[Catch: JSONException -> 0x001b, TRY_LEAVE, TryCatch #5 {JSONException -> 0x001b, blocks: (B:3:0x0004, B:5:0x000d, B:8:0x0022, B:9:0x002f, B:10:0x0036, B:12:0x0039, B:14:0x0047, B:16:0x0052, B:17:0x004d, B:20:0x0055, B:22:0x005e, B:24:0x0066, B:26:0x0078, B:27:0x0080, B:29:0x0084, B:31:0x0096, B:33:0x00b4, B:34:0x00cc, B:39:0x00f2, B:45:0x01e2, B:47:0x01f6, B:50:0x0111, B:52:0x0123, B:57:0x0137, B:60:0x0159, B:62:0x016f, B:64:0x0175, B:65:0x018f, B:66:0x0194, B:67:0x0195, B:68:0x019a, B:73:0x01a5, B:75:0x01b5, B:77:0x01c3, B:78:0x01d6, B:79:0x01db, B:80:0x01dc, B:81:0x01e1, B:82:0x0202, B:83:0x0207, B:86:0x0208, B:87:0x020f, B:88:0x0210, B:89:0x0215, B:93:0x0219, B:94:0x0220, B:96:0x0223, B:97:0x022a, B:99:0x022b, B:100:0x0232, B:101:0x0235, B:102:0x023c, B:104:0x023d, B:105:0x0244, B:109:0x0248, B:110:0x024f), top: B:2:0x0004, inners: #0, #1, #2 }] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject i() {
        byte[] zza;
        String[] strArr = this.e;
        try {
            JSONObject jSONObject = new JSONObject();
            zzgx zzgxVar = this.c;
            if (zzgxVar != null) {
                jSONObject.put("clientDataJSON", k46.c(zzgxVar.zzm()));
            }
            zzgx zzgxVar2 = this.d;
            if (zzgxVar2 != null) {
                jSONObject.put("attestationObject", k46.c(zzgxVar2.zzm()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar = (zzhp) zzhp.zzj(zzgxVar2.zzm()).zzh().zzc().get(zzhp.zzi("authData"));
                    if (zzhpVar == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzgx zzc = zzhpVar.zze().zzc();
                    ByteBuffer zzi = zzc.zzi();
                    try {
                        zzi.position(zzi.position() + 32);
                        if ((zzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        zzi.position(zzi.position() + 4);
                        zzi.position(zzi.position() + 16);
                        zzi.position(zzi.position() + zzi.getShort());
                        try {
                            zzhm zzh = zzhp.zzk(zzc.zzg(zzi.position(), zzc.zzd()).zzh()).zzh();
                            zzhp zzhpVar2 = (zzhp) zzh.zzc().get(zzhp.zzg(3L));
                            zzhp zzhpVar3 = (zzhp) zzh.zzc().get(zzhp.zzg(1L));
                            if (zzhpVar2 == null || zzhpVar3 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long zzc2 = zzhpVar2.zzf().zzc();
                                long zzc3 = zzhpVar3.zzf().zzc();
                                if (zzc3 != 1) {
                                    if (zzc3 == 2) {
                                        zzc3 = 2;
                                    }
                                    zza = null;
                                    jSONObject.put("authenticatorData", k46.c(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (zza != null) {
                                        jSONObject.put("publicKey", Base64.encodeToString(zza, 11));
                                    }
                                    return jSONObject;
                                }
                                zzhp zzhpVar4 = (zzhp) zzh.zzc().get(zzhp.zzg(-1L));
                                if (zzhpVar4 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                long zzc4 = zzhpVar4.zzf().zzc();
                                if (zzc3 == 2 && zzc4 == 1) {
                                    zzhp zzhpVar5 = (zzhp) zzh.zzc().get(zzhp.zzg(-2L));
                                    zzhp zzhpVar6 = (zzhp) zzh.zzc().get(zzhp.zzg(-3L));
                                    if (zzhpVar5 == null || zzhpVar6 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    zzgx zzc5 = zzhpVar5.zze().zzc();
                                    zzgx zzc6 = zzhpVar6.zze().zzc();
                                    if (zzc5.zzd() != 32 || zzc6.zzd() != 32) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    zza = zzgj.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzc5.zzm(), zzc6.zzm());
                                } else {
                                    if (zzc3 == 1 && zzc4 == 6) {
                                        zzhp zzhpVar7 = (zzhp) zzh.zzc().get(zzhp.zzg(-2L));
                                        if (zzhpVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzgx zzc7 = zzhpVar7.zze().zzc();
                                        if (zzc7.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        zza = zzgj.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzc7.zzm());
                                    }
                                    zza = null;
                                }
                                jSONObject.put("authenticatorData", k46.c(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (zza != null) {
                                }
                                return jSONObject;
                            } catch (zzho e) {
                                throw new IllegalArgumentException("COSE key ill-formed", e);
                            }
                        } catch (zzhj e2) {
                            e = e2;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e3) {
                            e = e3;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e4) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e4);
                    }
                } catch (zzho e5) {
                    throw new IllegalArgumentException("authData value has wrong type", e5);
                }
            } catch (zzhj e6) {
                e = e6;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e7) {
                e = e7;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e8) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e8);
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
        zza.zzb("attestationObject", zzf3.zzg(zzm3, 0, zzm3.length));
        zza.zzb("transports", Arrays.toString(this.e));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.e(parcel, 2, this.b.zzm(), false);
        ozg0.e(parcel, 3, this.c.zzm(), false);
        ozg0.e(parcel, 4, this.d.zzm(), false);
        ozg0.r(parcel, 5, this.e, false);
        ozg0.x(w, parcel);
    }
}
