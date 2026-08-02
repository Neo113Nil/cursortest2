package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
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

@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes9.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();

    @NonNull
    @SafeParcelable.Field(getter = "getKeyHandle", id = 2, type = "byte[]")
    private final zzgx zza;

    @NonNull
    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3, type = "byte[]")
    private final zzgx zzb;

    @NonNull
    @SafeParcelable.Field(getter = "getAttestationObject", id = 4, type = "byte[]")
    private final zzgx zzc;

    @NonNull
    @SafeParcelable.Field(getter = "getTransports", id = 5)
    private final String[] zzd;

    @SafeParcelable.Constructor
    AuthenticatorAttestationResponse(@NonNull @SafeParcelable.Param(id = 2) byte[] bArr, @NonNull @SafeParcelable.Param(id = 3) byte[] bArr2, @NonNull @SafeParcelable.Param(id = 4) byte[] bArr3, @NonNull @SafeParcelable.Param(id = 5) String[] strArr) {
        byte[] bArr4 = (byte[]) Preconditions.checkNotNull(bArr);
        zzgx zzgxVar = zzgx.zzb;
        zzgx zzl = zzgx.zzl(bArr4, 0, bArr4.length);
        byte[] bArr5 = (byte[]) Preconditions.checkNotNull(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr5, 0, bArr5.length);
        byte[] bArr6 = (byte[]) Preconditions.checkNotNull(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr6, 0, bArr6.length);
        this.zza = (zzgx) Preconditions.checkNotNull(zzl);
        this.zzb = (zzgx) Preconditions.checkNotNull(zzl2);
        this.zzc = (zzgx) Preconditions.checkNotNull(zzl3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    @NonNull
    public static AuthenticatorAttestationResponse deserializeFromBytes(@NonNull byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Objects.equal(this.zza, authenticatorAttestationResponse.zza) && Objects.equal(this.zzb, authenticatorAttestationResponse.zzb) && Objects.equal(this.zzc, authenticatorAttestationResponse.zzc);
    }

    @NonNull
    public byte[] getAttestationObject() {
        return this.zzc.zzm();
    }

    public zzgx getAttestationObjectAsByteString() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] getClientDataJSON() {
        return this.zzb.zzm();
    }

    public zzgx getClientDataJSONAsByteString() {
        return this.zzb;
    }

    @NonNull
    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza.zzm();
    }

    public zzgx getKeyHandleAsByteString() {
        return this.zza;
    }

    @NonNull
    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Objects.hashCode(this.zza)), Integer.valueOf(Objects.hashCode(this.zzb)), Integer.valueOf(Objects.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    @NonNull
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    @NonNull
    public String toString() {
        zzbi zza = zzbj.zza(this);
        zzgf zzf = zzgf.zzf();
        byte[] keyHandle = getKeyHandle();
        zza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(keyHandle, 0, keyHandle.length));
        zzgf zzf2 = zzgf.zzf();
        byte[] clientDataJSON = getClientDataJSON();
        zza.zzb("clientDataJSON", zzf2.zzg(clientDataJSON, 0, clientDataJSON.length));
        zzgf zzf3 = zzgf.zzf();
        byte[] attestationObject = getAttestationObject();
        zza.zzb("attestationObject", zzf3.zzg(attestationObject, 0, attestationObject.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i11) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01f8 A[Catch: JSONException -> 0x0019, TRY_LEAVE, TryCatch #3 {JSONException -> 0x0019, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x001c, B:8:0x0020, B:9:0x002d, B:10:0x0034, B:12:0x0039, B:14:0x0047, B:16:0x0054, B:17:0x004d, B:20:0x0057, B:22:0x0060, B:24:0x0068, B:26:0x007a, B:27:0x0082, B:29:0x0086, B:31:0x0098, B:33:0x00b6, B:34:0x00ce, B:39:0x00f4, B:45:0x01e4, B:47:0x01f8, B:50:0x0113, B:52:0x0125, B:57:0x0139, B:60:0x015b, B:62:0x0171, B:64:0x0177, B:65:0x0191, B:66:0x0196, B:67:0x0197, B:68:0x019c, B:73:0x01a7, B:75:0x01b7, B:77:0x01c5, B:78:0x01d8, B:79:0x01dd, B:80:0x01de, B:81:0x01e3, B:82:0x0202, B:83:0x0207, B:86:0x0208, B:87:0x020f, B:88:0x0210, B:89:0x0215, B:93:0x0219, B:94:0x0220, B:96:0x0223, B:97:0x022a, B:99:0x022b, B:100:0x0232, B:101:0x0235, B:102:0x023c, B:104:0x023d, B:105:0x0244, B:109:0x0248, B:110:0x024f), top: B:2:0x0002, inners: #0, #1, #2 }] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        byte[] zza;
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.zzb != null) {
                jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(getClientDataJSON()));
            }
            if (this.zzc != null) {
                jSONObject.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(getAttestationObject()));
            }
            JSONArray jSONArray = new JSONArray();
            int i11 = 0;
            while (true) {
                String[] strArr = this.zzd;
                if (i11 >= strArr.length) {
                    break;
                }
                if (strArr[i11].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i11, "hybrid");
                } else {
                    jSONArray.put(i11, this.zzd[i11]);
                }
                i11++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzhp zzhpVar = (zzhp) zzhp.zzj(getAttestationObject()).zzh().zzc().get(zzhp.zzi("authData"));
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
                                    jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (zza != null) {
                                        jSONObject.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(zza));
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
                                jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (zza != null) {
                                }
                                return jSONObject;
                            } catch (zzho e11) {
                                throw new IllegalArgumentException("COSE key ill-formed", e11);
                            }
                        } catch (zzhj e12) {
                            e = e12;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzho e13) {
                            e = e13;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e14) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e14);
                    }
                } catch (zzho e15) {
                    throw new IllegalArgumentException("authData value has wrong type", e15);
                }
            } catch (zzhj e16) {
                e = e16;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzho e17) {
                e = e17;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e18) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e18);
        }
    }
}
