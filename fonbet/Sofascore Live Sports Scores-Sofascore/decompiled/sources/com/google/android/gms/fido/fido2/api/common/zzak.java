package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzfx;
import com.google.android.gms.internal.fido.zzgj;
import defpackage.a70;
import defpackage.ibo;
import defpackage.lnb;
import defpackage.oao;
import defpackage.pp4;
import defpackage.w9o;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new zzal();
    public static final byte[] b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public final byte[][] a;

    public zzak(byte[][] bArr) {
        Preconditions.b(bArr != null);
        Preconditions.b(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            Preconditions.b(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            Preconditions.b(bArr[i2] != null);
            int length = bArr[i2].length;
            Preconditions.b(length == 32 || length == 64);
            i += 2;
        }
        this.a = bArr;
    }

    public static zzak Y0(JSONObject jSONObject, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z) {
                    arrayList.add(b1(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(c1(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(Base64Utils.a(next));
                    if (z) {
                        arrayList.add(b1(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(c1(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject Z0(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] a1(byte[] bArr) {
        pp4 pp4Var;
        int i = zzfx.a;
        ibo iboVar = oao.a;
        int i2 = iboVar.g;
        MessageDigest messageDigest = iboVar.f;
        try {
            if (iboVar.h) {
                try {
                    pp4Var = new pp4((MessageDigest) messageDigest.clone(), i2);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) pp4Var.d;
                byte[] bArr2 = b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!pp4Var.b) {
                    a70.r("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (pp4Var.b) {
                    a70.r("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                messageDigest2.update(bArr, 0, length2);
                if (pp4Var.b) {
                    a70.r("Cannot re-use a Hasher after calling hash() on it");
                    return null;
                }
                pp4Var.b = true;
                int i3 = pp4Var.c;
                return (byte[]) (i3 == messageDigest2.getDigestLength() ? new w9o(messageDigest2.digest()) : new w9o(Arrays.copyOf(messageDigest2.digest(), i3))).b.clone();
            }
            pp4Var = new pp4(MessageDigest.getInstance(messageDigest.getAlgorithm()), i2);
            MessageDigest messageDigest22 = (MessageDigest) pp4Var.d;
            byte[] bArr22 = b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!pp4Var.b) {
            }
        } catch (NoSuchAlgorithmException e) {
            a70.j(e);
            return null;
        }
    }

    public static byte[] b1(JSONObject jSONObject) {
        byte[] a = Base64Utils.a(jSONObject.getString("first"));
        if (a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return a;
        }
        byte[] a2 = Base64Utils.a(jSONObject.getString("second"));
        if (a2.length == 32) {
            return zzgj.a(a, a2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] c1(JSONObject jSONObject) {
        byte[] a1 = a1(Base64Utils.a(jSONObject.getString("first")));
        return !jSONObject.has("second") ? a1 : zzgj.a(a1, a1(Base64Utils.a(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.a, ((zzak) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.a) {
            if (bArr != null) {
                i ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i;
    }

    public final String toString() {
        byte[][] bArr = this.a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i = 0; i < bArr.length; i += 2) {
                if (bArr[i] == null) {
                    jSONObject.put("eval", Z0(bArr[i + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(Base64Utils.b(bArr[i]), Z0(bArr[i + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e) {
            return lnb.o("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.d(parcel, 1, this.a);
        SafeParcelWriter.t(parcel, s);
    }
}
