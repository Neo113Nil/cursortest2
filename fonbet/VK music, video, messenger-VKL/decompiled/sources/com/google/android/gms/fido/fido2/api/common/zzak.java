package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzfv;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.exc0;
import xsna.k46;
import xsna.ozg0;
import xsna.rxz0;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new rxz0();
    public static final byte[] c = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] b;

    public zzak(byte[][] bArr) {
        exc0.b(bArr != null);
        exc0.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            exc0.b(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            exc0.b(bArr[i2] != null);
            int length = bArr[i2].length;
            exc0.b(length == 32 || length == 64);
            i += 2;
        }
        this.b = bArr;
    }

    public static zzak b(JSONObject jSONObject, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(j(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(k(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(k46.b(next));
                    if (z) {
                        arrayList.add(j(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(k(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject i(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] j(JSONObject jSONObject) throws JSONException {
        byte[] b = k46.b(jSONObject.getString("first"));
        if (b.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b;
        }
        byte[] b2 = k46.b(jSONObject.getString("second"));
        if (b2.length == 32) {
            return zzgj.zza(b, b2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] k(JSONObject jSONObject) throws JSONException {
        byte[] b = k46.b(jSONObject.getString("first"));
        zzfv zza = zzfx.zza().zza();
        byte[] bArr = c;
        zza.zza(bArr);
        zza.zza(b);
        byte[] zzd = zza.zzc().zzd();
        if (!jSONObject.has("second")) {
            return zzd;
        }
        byte[] b2 = k46.b(jSONObject.getString("second"));
        zzfv zza2 = zzfx.zza().zza();
        zza2.zza(bArr);
        zza2.zza(b2);
        return zzgj.zza(zzd, zza2.zzc().zzd());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.b, ((zzak) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.b) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.b;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", i(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(k46.c(bArr[i]), i(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return zr.a("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        byte[][] bArr = this.b;
        if (bArr != null) {
            int w2 = ozg0.w(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            ozg0.x(w2, parcel);
        }
        ozg0.x(w, parcel);
    }
}
