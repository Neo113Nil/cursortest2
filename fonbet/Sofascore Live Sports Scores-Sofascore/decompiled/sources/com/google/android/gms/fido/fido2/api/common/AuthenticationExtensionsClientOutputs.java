package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.lnb;
import defpackage.vp2;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new zzc();
    public final UvmEntries a;
    public final zzf b;
    public final AuthenticationExtensionsCredPropsOutputs c;
    public final zzh d;
    public final String e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.a = uvmEntries;
        this.b = zzfVar;
        this.c = authenticationExtensionsCredPropsOutputs;
        this.d = zzhVar;
        this.e = str;
    }

    public final JSONObject Y0() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.c;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.a;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.Y0());
            }
            zzh zzhVar = this.d;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.Y0());
            }
            String str = this.e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            vp2.e("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return Objects.a(this.a, authenticationExtensionsClientOutputs.a) && Objects.a(this.b, authenticationExtensionsClientOutputs.b) && Objects.a(this.c, authenticationExtensionsClientOutputs.c) && Objects.a(this.d, authenticationExtensionsClientOutputs.d) && Objects.a(this.e, authenticationExtensionsClientOutputs.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        return lnb.o("AuthenticationExtensionsClientOutputs{", Y0().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.l(parcel, 3, this.c, i, false);
        SafeParcelWriter.l(parcel, 4, this.d, i, false);
        SafeParcelWriter.m(parcel, 5, this.e, false);
        SafeParcelWriter.t(parcel, s);
    }
}
