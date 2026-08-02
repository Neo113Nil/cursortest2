package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import com.google.android.gms.internal.fido.zzcj;
import com.google.android.gms.internal.fido.zzgf;
import com.google.android.gms.internal.fido.zzgj;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhi;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzhk;
import com.google.android.gms.internal.fido.zzhm;
import com.google.android.gms.internal.fido.zzhn;
import com.google.android.gms.internal.fido.zzho;
import com.google.android.gms.internal.fido.zzhp;
import com.google.android.gms.internal.fido.zzhs;
import defpackage.f6a;
import defpackage.qbo;
import defpackage.vp2;
import defpackage.xgo;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    public final xgo a;
    public final xgo b;
    public final xgo c;
    public final String[] d;

    public AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        Preconditions.i(bArr);
        xgo r = zzgx.r(bArr.length, bArr);
        Preconditions.i(bArr2);
        xgo r2 = zzgx.r(bArr2.length, bArr2);
        Preconditions.i(bArr3);
        xgo r3 = zzgx.r(bArr3.length, bArr3);
        this.a = r;
        this.b = r2;
        this.c = r3;
        Preconditions.i(strArr);
        this.d = strArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0212 A[Catch: JSONException -> 0x01a2, TRY_LEAVE, TryCatch #0 {JSONException -> 0x01a2, blocks: (B:52:0x01fc, B:54:0x0212, B:60:0x0133, B:62:0x013e, B:67:0x0152, B:70:0x016e, B:72:0x0185, B:74:0x018a, B:75:0x01a8, B:76:0x01ad, B:77:0x01ae, B:78:0x01b3, B:83:0x01be, B:85:0x01cb, B:87:0x01da, B:88:0x01ee, B:89:0x01f3, B:90:0x01f4, B:91:0x01f9, B:93:0x021e, B:94:0x0223, B:97:0x0227, B:98:0x022e, B:102:0x022f, B:103:0x0236, B:110:0x023a, B:116:0x0249, B:117:0x0250, B:113:0x0240, B:125:0x0257, B:126:0x025e, B:129:0x0260, B:130:0x0267, B:136:0x026e, B:137:0x0275, B:140:0x0277, B:141:0x027e, B:147:0x0285, B:148:0x028c), top: B:19:0x0057 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject Y0() {
        JSONObject jSONObject;
        byte[] bArr;
        String[] strArr = this.d;
        try {
            JSONObject jSONObject2 = new JSONObject();
            xgo xgoVar = this.b;
            if (xgoVar != null) {
                jSONObject2.put("clientDataJSON", Base64Utils.b(xgoVar.s()));
            }
            xgo xgoVar2 = this.c;
            if (xgoVar2 != null) {
                jSONObject2.put("attestationObject", Base64Utils.b(xgoVar2.s()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < strArr.length; i++) {
                if (strArr[i].equals("cable")) {
                    jSONArray.put(i, "hybrid");
                } else {
                    jSONArray.put(i, strArr[i]);
                }
            }
            try {
                jSONObject2.put("transports", jSONArray);
                try {
                    try {
                        zzhp zzhpVar = (zzhp) ((zzhm) zzhp.e(xgoVar2.s()).b(zzhm.class)).b.get(new zzhn("authData"));
                        if (zzhpVar == null) {
                            try {
                                throw new IllegalArgumentException("attestation object missing authData");
                            } catch (zzho e) {
                                e = e;
                                throw new IllegalArgumentException("authData value has wrong type", e);
                            }
                        }
                        xgo xgoVar3 = ((zzhi) zzhpVar.b(zzhi.class)).a;
                        ByteBuffer asReadOnlyBuffer = ByteBuffer.wrap(xgoVar3.c, 0, xgoVar3.m()).asReadOnlyBuffer();
                        try {
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 32);
                            if ((asReadOnlyBuffer.get() & 64) == 0) {
                                try {
                                    throw new IllegalArgumentException("authData does not include credential data");
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new IllegalArgumentException("ill-formed authenticator data", e);
                                }
                            }
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 4);
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + 16);
                            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + asReadOnlyBuffer.getShort());
                            try {
                                try {
                                    zzhs zzhsVar = new zzhs(xgoVar3.p(asReadOnlyBuffer.position(), xgoVar3.c.length).u());
                                    try {
                                        zzhp P = f6a.P(zzhsVar);
                                        try {
                                            zzhsVar.close();
                                        } catch (IOException unused) {
                                        }
                                        zzcj zzcjVar = ((zzhm) P.b(zzhm.class)).b;
                                        zzhp zzhpVar2 = (zzhp) zzcjVar.get(new zzhk(3L));
                                        zzhp zzhpVar3 = (zzhp) zzcjVar.get(new zzhk(1L));
                                        if (zzhpVar2 == null || zzhpVar3 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        try {
                                            long j = ((zzhk) zzhpVar2.b(zzhk.class)).a;
                                            long j2 = ((zzhk) zzhpVar3.b(zzhk.class)).a;
                                            try {
                                                if (j2 != 1) {
                                                    if (j2 != 2) {
                                                        jSONObject = jSONObject2;
                                                        bArr = null;
                                                        JSONObject jSONObject3 = jSONObject;
                                                        jSONObject3.put("authenticatorData", Base64Utils.b(xgoVar3.s()));
                                                        jSONObject3.put("publicKeyAlgorithm", j);
                                                        if (bArr != null) {
                                                            jSONObject3.put("publicKey", Base64.encodeToString(bArr, 11));
                                                        }
                                                        return jSONObject3;
                                                    }
                                                    j2 = 2;
                                                }
                                                zzhp zzhpVar4 = (zzhp) zzcjVar.get(new zzhk(-1L));
                                                if (zzhpVar4 == null) {
                                                    throw new IllegalArgumentException("COSE key missing required fields");
                                                }
                                                long j3 = ((zzhk) zzhpVar4.b(zzhk.class)).a;
                                                if (j2 == 2 && j3 == 1) {
                                                    zzhp zzhpVar5 = (zzhp) zzcjVar.get(new zzhk(-2L));
                                                    zzhp zzhpVar6 = (zzhp) zzcjVar.get(new zzhk(-3L));
                                                    if (zzhpVar5 == null || zzhpVar6 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    xgo xgoVar4 = ((zzhi) zzhpVar5.b(zzhi.class)).a;
                                                    xgo xgoVar5 = ((zzhi) zzhpVar6.b(zzhi.class)).a;
                                                    if (xgoVar4.c.length != 32 || xgoVar5.c.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = zzgj.a(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), xgoVar4.s(), xgoVar5.s());
                                                } else if (j2 == 1 && j3 == 6) {
                                                    zzhp zzhpVar7 = (zzhp) zzcjVar.get(new zzhk(-2L));
                                                    if (zzhpVar7 == null) {
                                                        throw new IllegalArgumentException("COSE key missing required fields");
                                                    }
                                                    xgo xgoVar6 = ((zzhi) zzhpVar7.b(zzhi.class)).a;
                                                    if (xgoVar6.c.length != 32) {
                                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                                    }
                                                    bArr = zzgj.a(Base64.decode("MCowBQYDK2VwAyEA", 0), xgoVar6.s());
                                                } else {
                                                    bArr = null;
                                                }
                                                JSONObject jSONObject32 = jSONObject;
                                                jSONObject32.put("authenticatorData", Base64Utils.b(xgoVar3.s()));
                                                jSONObject32.put("publicKeyAlgorithm", j);
                                                if (bArr != null) {
                                                }
                                                return jSONObject32;
                                            } catch (zzho e3) {
                                                e = e3;
                                                throw new IllegalArgumentException("COSE key ill-formed", e);
                                            }
                                            jSONObject = jSONObject2;
                                        } catch (zzho e4) {
                                            e = e4;
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            try {
                                                zzhsVar.close();
                                            } catch (zzho e5) {
                                                e = e5;
                                                throw new IllegalArgumentException("failed to parse COSE key", e);
                                            }
                                        } catch (IOException unused2) {
                                        }
                                        try {
                                            throw th;
                                        } catch (zzhj e6) {
                                            e = e6;
                                            throw new IllegalArgumentException("failed to parse COSE key", e);
                                        }
                                    }
                                } catch (zzhj e7) {
                                    e = e7;
                                    throw new IllegalArgumentException("failed to parse COSE key", e);
                                }
                            } catch (zzho e8) {
                                e = e8;
                                throw new IllegalArgumentException("failed to parse COSE key", e);
                            }
                        } catch (IllegalArgumentException e9) {
                            e = e9;
                        }
                    } catch (zzho e10) {
                        e = e10;
                    }
                } catch (zzhj e11) {
                    e = e11;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                } catch (zzho e12) {
                    e = e12;
                    throw new IllegalArgumentException("failed to parse attestation object", e);
                }
            } catch (JSONException e13) {
                e = e13;
                vp2.e("Error encoding AuthenticatorAttestationResponse to JSON object", e);
                return null;
            }
        } catch (JSONException e14) {
            e = e14;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Objects.a(this.a, authenticatorAttestationResponse.a) && Objects.a(this.b, authenticatorAttestationResponse.b) && Objects.a(this.c, authenticatorAttestationResponse.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.a})), Integer.valueOf(Arrays.hashCode(new Object[]{this.b})), Integer.valueOf(Arrays.hashCode(new Object[]{this.c}))});
    }

    public final String toString() {
        zzbi a = zzbj.a(this);
        qbo qboVar = zzgf.a;
        byte[] s = this.a.s();
        a.a(qboVar.c(s.length, s), "keyHandle");
        byte[] s2 = this.b.s();
        a.a(qboVar.c(s2.length, s2), "clientDataJSON");
        byte[] s3 = this.c.s();
        a.a(qboVar.c(s3.length, s3), "attestationObject");
        a.a(Arrays.toString(this.d), "transports");
        return a.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a.s(), false);
        SafeParcelWriter.c(parcel, 3, this.b.s(), false);
        SafeParcelWriter.c(parcel, 4, this.c.s(), false);
        SafeParcelWriter.n(parcel, 5, this.d);
        SafeParcelWriter.t(parcel, s);
    }
}
