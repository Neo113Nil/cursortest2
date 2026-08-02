package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.c1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensionsClientOutputs> CREATOR = new l(15);

    /* renamed from: a, reason: collision with root package name */
    public final UvmEntries f4656a;

    /* renamed from: b, reason: collision with root package name */
    public final zzf f4657b;

    /* renamed from: c, reason: collision with root package name */
    public final AuthenticationExtensionsCredPropsOutputs f4658c;

    /* renamed from: d, reason: collision with root package name */
    public final zzh f4659d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4660e;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries, zzf zzfVar, AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, zzh zzhVar, String str) {
        this.f4656a = uvmEntries;
        this.f4657b = zzfVar;
        this.f4658c = authenticationExtensionsCredPropsOutputs;
        this.f4659d = zzhVar;
        this.f4660e = str;
    }

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.f4658c;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("rk", authenticationExtensionsCredPropsOutputs.f4661a);
                    jSONObject.put("credProps", jSONObject2);
                } catch (JSONException e7) {
                    throw new RuntimeException("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e7);
                }
            }
            UvmEntries uvmEntries = this.f4656a;
            if (uvmEntries != null) {
                jSONObject.put("uvm", uvmEntries.c());
            }
            zzh zzhVar = this.f4659d;
            if (zzhVar != null) {
                jSONObject.put("prf", zzhVar.c());
            }
            String str = this.f4660e;
            if (str != null) {
                jSONObject.put("txAuthSimple", str);
            }
            return jSONObject;
        } catch (JSONException e9) {
            throw new RuntimeException("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e9);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        return v.k(this.f4656a, authenticationExtensionsClientOutputs.f4656a) && v.k(this.f4657b, authenticationExtensionsClientOutputs.f4657b) && v.k(this.f4658c, authenticationExtensionsClientOutputs.f4658c) && v.k(this.f4659d, authenticationExtensionsClientOutputs.f4659d) && v.k(this.f4660e, authenticationExtensionsClientOutputs.f4660e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4656a, this.f4657b, this.f4658c, this.f4659d, this.f4660e});
    }

    public final String toString() {
        return c1.n("AuthenticationExtensionsClientOutputs{", c().toString(), "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 1, this.f4656a, i5, false);
        b.N(parcel, 2, this.f4657b, i5, false);
        b.N(parcel, 3, this.f4658c, i5, false);
        b.N(parcel, 4, this.f4659d, i5, false);
        b.O(parcel, 5, this.f4660e, false);
        b.W(parcel, V);
    }
}
