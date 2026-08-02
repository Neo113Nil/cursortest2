package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import k7.d0;
import k7.e0;
import k7.f0;
import k7.g0;
import k7.h0;
import org.json.JSONException;
import org.json.JSONObject;
import u5.b;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzak> CREATOR = new b(28);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4772b = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f4773a;

    public zzak(byte[][] bArr) {
        v.b(bArr != null);
        v.b(1 == ((bArr.length & 1) ^ 1));
        int i5 = 0;
        while (i5 < bArr.length) {
            v.b(i5 == 0 || bArr[i5] != null);
            int i10 = i5 + 1;
            v.b(bArr[i10] != null);
            int length = bArr[i10].length;
            v.b(length == 32 || length == 64);
            i5 += 2;
        }
        this.f4773a = bArr;
    }

    public static zzak c(JSONObject jSONObject, boolean z5) {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z5) {
                    arrayList.add(s0(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(t0(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    arrayList.add(q6.b.b(next));
                    if (z5) {
                        arrayList.add(s0(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(t0(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new zzak((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject l0(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] o0(byte[] bArr) {
        androidx.appcompat.widget.a aVar;
        d0 d0Var;
        int i5 = g0.f18862a;
        h0 h0Var = f0.f18860a;
        int i10 = h0Var.f18866f;
        MessageDigest messageDigest = h0Var.f18865e;
        try {
            if (h0Var.f18867g) {
                try {
                    aVar = new androidx.appcompat.widget.a((MessageDigest) messageDigest.clone(), i10);
                } catch (CloneNotSupportedException unused) {
                }
                MessageDigest messageDigest2 = (MessageDigest) aVar.f678c;
                byte[] bArr2 = f4772b;
                bArr2.getClass();
                int length = bArr2.length;
                if (!aVar.f677b) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr2, 0, length);
                bArr.getClass();
                int length2 = bArr.length;
                if (aVar.f677b) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                messageDigest2.update(bArr, 0, length2);
                if (aVar.f677b) {
                    throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
                }
                aVar.f677b = true;
                int i11 = aVar.f676a;
                if (i11 == messageDigest2.getDigestLength()) {
                    byte[] digest = messageDigest2.digest();
                    char[] cArr = e0.f18856a;
                    d0Var = new d0(digest);
                } else {
                    byte[] copyOf = Arrays.copyOf(messageDigest2.digest(), i11);
                    char[] cArr2 = e0.f18856a;
                    d0Var = new d0(copyOf);
                }
                return (byte[]) d0Var.f18850b.clone();
            }
            aVar = new androidx.appcompat.widget.a(MessageDigest.getInstance(messageDigest.getAlgorithm()), i10);
            MessageDigest messageDigest22 = (MessageDigest) aVar.f678c;
            byte[] bArr22 = f4772b;
            bArr22.getClass();
            int length3 = bArr22.length;
            if (!aVar.f677b) {
            }
        } catch (NoSuchAlgorithmException e7) {
            throw new AssertionError(e7);
        }
    }

    public static byte[] s0(JSONObject jSONObject) {
        byte[] b10 = q6.b.b(jSONObject.getString("first"));
        if (b10.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return b10;
        }
        byte[] b11 = q6.b.b(jSONObject.getString("second"));
        if (b11.length == 32) {
            return k7.a.k(b10, b11);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] t0(JSONObject jSONObject) {
        byte[] o02 = o0(q6.b.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? o02 : k7.a.k(o02, o0(q6.b.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzak) {
            return Arrays.deepEquals(this.f4773a, ((zzak) obj).f4773a);
        }
        return false;
    }

    public final int hashCode() {
        int i5 = 0;
        for (byte[] bArr : this.f4773a) {
            if (bArr != null) {
                i5 ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return i5;
    }

    public final String toString() {
        byte[][] bArr = this.f4773a;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i5 = 0; i5 < bArr.length; i5 += 2) {
                if (bArr[i5] == null) {
                    jSONObject.put("eval", l0(bArr[i5 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(q6.b.c(bArr[i5]), l0(bArr[i5 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e7) {
            return c1.n("PrfExtension{Exception:", e7.getMessage(), "}");
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        byte[][] bArr = this.f4773a;
        if (bArr != null) {
            int V2 = h8.b.V(parcel, 1);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            h8.b.W(parcel, V2);
        }
        h8.b.W(parcel, V);
    }
}
