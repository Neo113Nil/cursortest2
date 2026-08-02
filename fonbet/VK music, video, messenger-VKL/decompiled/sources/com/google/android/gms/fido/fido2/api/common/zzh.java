package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.ozg0;
import xsna.xf01;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new xf01();
    public final boolean b;

    @Nullable
    public final zzgx c;

    public zzh(boolean z, @Nullable zzgx zzgxVar) {
        this.b = z;
        this.c = zzgxVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzhVar = (zzh) obj;
        return this.b == zzhVar.b && dq70.b(this.c, zzhVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c});
    }

    public final JSONObject i() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.b) {
                jSONObject.put("enabled", true);
            }
            zzgx zzgxVar = this.c;
            byte[] zzm = zzgxVar == null ? null : zzgxVar.zzm();
            if (zzm != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("first", Base64.encodeToString(Arrays.copyOf(zzm, 32), 11));
                if (zzm.length == 64) {
                    jSONObject2.put("second", Base64.encodeToString(Arrays.copyOfRange(zzm, 32, 64), 11));
                }
                jSONObject.put("results", jSONObject2);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final String toString() {
        return zr.a("AuthenticationExtensionsPrfOutputs{", i().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.v(parcel, 1, 4);
        parcel.writeInt(this.b ? 1 : 0);
        zzgx zzgxVar = this.c;
        ozg0.e(parcel, 2, zzgxVar == null ? null : zzgxVar.zzm(), false);
        ozg0.x(w, parcel);
    }
}
