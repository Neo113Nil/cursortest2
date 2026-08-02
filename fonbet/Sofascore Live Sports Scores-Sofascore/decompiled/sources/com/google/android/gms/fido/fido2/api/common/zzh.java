package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.lnb;
import defpackage.vp2;
import defpackage.xgo;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new zzi();
    public final boolean a;
    public final zzgx b;

    public zzh(boolean z, xgo xgoVar) {
        this.a = z;
        this.b = xgoVar;
    }

    public final JSONObject Y0() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.a) {
                jSONObject.put("enabled", true);
            }
            zzgx zzgxVar = this.b;
            byte[] s = zzgxVar == null ? null : zzgxVar.s();
            if (s != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(s, 32), 11));
                if (s.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(s, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            vp2.e("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.a == zzhVar.a && Objects.a(this.b, zzhVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final String toString() {
        return lnb.o("AuthenticationExtensionsPrfOutputs{", Y0().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.r(parcel, 1, 4);
        parcel.writeInt(this.a ? 1 : 0);
        zzgx zzgxVar = this.b;
        SafeParcelWriter.c(parcel, 2, zzgxVar == null ? null : zzgxVar.s(), false);
        SafeParcelWriter.t(parcel, s);
    }
}
