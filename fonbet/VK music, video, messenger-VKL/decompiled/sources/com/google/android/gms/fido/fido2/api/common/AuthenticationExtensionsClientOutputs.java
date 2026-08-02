package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a501;
import xsna.dq70;
import xsna.ozg0;
import xsna.zr;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new a501();

    @Nullable
    public final UvmEntries b;

    @Nullable
    public final zzf c;

    @Nullable
    public final AuthenticationExtensionsCredPropsOutputs d;

    @Nullable
    public final zzh e;

    @Nullable
    public final String f;

    public AuthenticationExtensionsClientOutputs(@Nullable UvmEntries uvmEntries, @Nullable zzf zzfVar, @Nullable AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, @Nullable zzh zzhVar, @Nullable String str) {
        this.b = uvmEntries;
        this.c = zzfVar;
        this.d = authenticationExtensionsCredPropsOutputs;
        this.e = zzhVar;
        this.f = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return dq70.b(this.b, authenticationExtensionsClientOutputs.b) && dq70.b(this.c, authenticationExtensionsClientOutputs.c) && dq70.b(this.d, authenticationExtensionsClientOutputs.d) && dq70.b(this.e, authenticationExtensionsClientOutputs.e) && dq70.b(this.f, authenticationExtensionsClientOutputs.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f});
    }

    @NonNull
    public final JSONObject i() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.d;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.b);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                }
            }
            UvmEntries uvmEntries = this.b;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.i());
            }
            zzh zzhVar = this.e;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.i());
            }
            String str = this.f;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e2);
        }
    }

    @NonNull
    public final String toString() {
        return zr.a("AuthenticationExtensionsClientOutputs{", i().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.p(parcel, 3, this.d, i, false);
        ozg0.p(parcel, 4, this.e, i, false);
        ozg0.q(parcel, 5, this.f, false);
        ozg0.x(w, parcel);
    }
}
