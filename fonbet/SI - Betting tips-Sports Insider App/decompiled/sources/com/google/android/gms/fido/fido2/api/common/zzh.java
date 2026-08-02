package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.r0;
import org.json.JSONException;
import org.json.JSONObject;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new l(19);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4777a;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f4778b;

    public zzh(boolean z5, r0 r0Var) {
        this.f4777a = z5;
        this.f4778b = r0Var;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.f4777a) {
                jSONObject.put("enabled", true);
            }
            r0 r0Var = this.f4778b;
            byte[] i5 = r0Var == null ? null : r0Var.i();
            if (i5 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(i5, 32), 11));
                if (i5.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(i5, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e7) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e7);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.f4777a == zzhVar.f4777a && v.k(this.f4778b, zzhVar.f4778b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4777a), this.f4778b});
    }

    public final String toString() {
        return c1.n("AuthenticationExtensionsPrfOutputs{", c().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.U(parcel, 1, 4);
        parcel.writeInt(this.f4777a ? 1 : 0);
        r0 r0Var = this.f4778b;
        b.G(parcel, 2, r0Var == null ? null : r0Var.i(), false);
        b.W(parcel, V);
    }
}
