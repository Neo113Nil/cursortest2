package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.zzbl;
import defpackage.bf3;
import defpackage.fc6;
import defpackage.ilg;
import defpackage.mz1;
import defpackage.rkn;
import defpackage.vxd;
import defpackage.ynn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new zzan();
    public final PublicKeyCredentialRpEntity a;
    public final PublicKeyCredentialUserEntity b;
    public final byte[] c;
    public final List d;
    public final Double e;
    public final List f;
    public final AuthenticatorSelectionCriteria g;
    public final Integer h;
    public final TokenBinding i;
    public final AttestationConveyancePreference j;
    public final AuthenticationExtensions k;
    public final String l;
    public final ResultReceiver m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public PublicKeyCredentialRpEntity a;
        public PublicKeyCredentialUserEntity b;
        public byte[] c;
        public ArrayList d;
        public Double e;
        public ArrayList f;
        public AuthenticatorSelectionCriteria g;
        public AttestationConveyancePreference h;
        public AuthenticationExtensions i;
    }

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.m = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions Y0 = Y0(new JSONObject(str2));
                this.a = Y0.a;
                this.b = Y0.b;
                this.c = Y0.c;
                this.d = Y0.d;
                this.e = Y0.e;
                this.f = Y0.f;
                this.g = Y0.g;
                this.h = Y0.h;
                this.i = Y0.i;
                this.j = Y0.j;
                this.k = Y0.k;
                this.l = str2;
                return;
            } catch (JSONException e) {
                ilg.k(e);
                throw null;
            }
        }
        Preconditions.i(publicKeyCredentialRpEntity);
        this.a = publicKeyCredentialRpEntity;
        Preconditions.i(publicKeyCredentialUserEntity);
        this.b = publicKeyCredentialUserEntity;
        Preconditions.i(bArr);
        this.c = bArr;
        Preconditions.i(arrayList);
        this.d = arrayList;
        this.e = d;
        this.f = arrayList2;
        this.g = authenticatorSelectionCriteria;
        this.h = num;
        this.i = tokenBinding;
        if (str != null) {
            try {
                this.j = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                ilg.k(e2);
                throw null;
            }
        } else {
            this.j = null;
        }
        this.k = authenticationExtensions;
        this.l = null;
    }

    public static PublicKeyCredentialCreationOptions Y0(JSONObject jSONObject) {
        zzbl zzblVar;
        Builder builder = new Builder();
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        Parcelable.Creator<PublicKeyCredentialRpEntity> creator = PublicKeyCredentialRpEntity.CREATOR;
        builder.a = new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        Parcelable.Creator<PublicKeyCredentialUserEntity> creator2 = PublicKeyCredentialUserEntity.CREATOR;
        builder.b = new PublicKeyCredentialUserEntity(Base64Utils.a(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] a = Base64Utils.a(jSONObject.getString("challenge"));
        Preconditions.i(a);
        builder.c = a;
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                zzblVar = new ynn(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                zzblVar = rkn.a;
            }
            if (zzblVar.g()) {
                arrayList.add(zzblVar.d());
            }
        }
        builder.d = arrayList;
        if (jSONObject.has("timeout")) {
            builder.e = Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d);
        }
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList2.add(PublicKeyCredentialDescriptor.Y0(jSONArray2.getJSONObject(i2)));
            }
            builder.f = arrayList2;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            Parcelable.Creator<AuthenticatorSelectionCriteria> creator3 = AuthenticatorSelectionCriteria.CREATOR;
            builder.g = new AuthenticatorSelectionCriteria(jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null, jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null);
        }
        if (jSONObject.has("extensions")) {
            builder.i = AuthenticationExtensions.Y0(jSONObject.getJSONObject("extensions"));
        }
        if (jSONObject.has("attestation")) {
            try {
                builder.h = AttestationConveyancePreference.a(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException unused2) {
                builder.h = AttestationConveyancePreference.NONE;
            }
        }
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = builder.a;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = builder.b;
        byte[] bArr = builder.c;
        ArrayList arrayList3 = builder.d;
        Double d = builder.e;
        ArrayList arrayList4 = builder.f;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = builder.g;
        AttestationConveyancePreference attestationConveyancePreference = builder.h;
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList3, d, arrayList4, authenticatorSelectionCriteria, null, null, attestationConveyancePreference != null ? attestationConveyancePreference.a : null, builder.i, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.d;
        List list3 = publicKeyCredentialCreationOptions.f;
        if (Objects.a(this.a, publicKeyCredentialCreationOptions.a) && Objects.a(this.b, publicKeyCredentialCreationOptions.b) && Arrays.equals(this.c, publicKeyCredentialCreationOptions.c) && Objects.a(this.e, publicKeyCredentialCreationOptions.e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && Objects.a(this.g, publicKeyCredentialCreationOptions.g) && Objects.a(this.h, publicKeyCredentialCreationOptions.h) && Objects.a(this.i, publicKeyCredentialCreationOptions.i) && Objects.a(this.j, publicKeyCredentialCreationOptions.j) && Objects.a(this.k, publicKeyCredentialCreationOptions.k) && Objects.a(this.l, publicKeyCredentialCreationOptions.l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c)), this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String b = Base64Utils.b(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.k);
        StringBuilder s = mz1.s("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        bf3.v(s, b, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        s.append(this.e);
        s.append(", \n excludeList=");
        s.append(valueOf4);
        s.append(", \n authenticatorSelection=");
        s.append(valueOf5);
        s.append(", \n requestId=");
        vxd.s(this.h, ", \n tokenBinding=", valueOf6, ", \n attestationConveyancePreference=", s);
        return fc6.o(s, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.l(parcel, 3, this.b, i, false);
        SafeParcelWriter.c(parcel, 4, this.c, false);
        SafeParcelWriter.q(parcel, 5, this.d, false);
        SafeParcelWriter.e(parcel, 6, this.e);
        SafeParcelWriter.q(parcel, 7, this.f, false);
        SafeParcelWriter.l(parcel, 8, this.g, i, false);
        SafeParcelWriter.i(parcel, 9, this.h);
        SafeParcelWriter.l(parcel, 10, this.i, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        SafeParcelWriter.m(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.a, false);
        SafeParcelWriter.l(parcel, 12, this.k, i, false);
        SafeParcelWriter.m(parcel, 13, this.l, false);
        SafeParcelWriter.l(parcel, 14, this.m, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
