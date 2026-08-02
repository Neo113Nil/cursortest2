package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.internal.fido.zzbl;
import com.huawei.hms.support.feature.result.CommonConstant;
import io.jsonwebtoken.JwsHeader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.exc0;
import xsna.eyz0;
import xsna.h5s;
import xsna.k46;
import xsna.mq;
import xsna.n6j;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new eyz0();

    @NonNull
    public final PublicKeyCredentialRpEntity b;

    @NonNull
    public final PublicKeyCredentialUserEntity c;

    @NonNull
    public final byte[] d;

    @NonNull
    public final List e;

    @Nullable
    public final Double f;

    @Nullable
    public final List g;

    @Nullable
    public final AuthenticatorSelectionCriteria h;

    @Nullable
    public final Integer i;

    @Nullable
    public final TokenBinding j;

    @Nullable
    public final AttestationConveyancePreference k;

    @Nullable
    public final AuthenticationExtensions l;

    @Nullable
    public final String m;

    @Nullable
    public final ResultReceiver n;

    /* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
    public static final class a {
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

    public PublicKeyCredentialCreationOptions(@NonNull PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, @NonNull PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, @NonNull byte[] bArr, @NonNull ArrayList arrayList, @Nullable Double d, @Nullable ArrayList arrayList2, @Nullable AuthenticatorSelectionCriteria authenticatorSelectionCriteria, @Nullable Integer num, @Nullable TokenBinding tokenBinding, @Nullable String str, @Nullable AuthenticationExtensions authenticationExtensions, @Nullable String str2, @Nullable ResultReceiver resultReceiver) {
        this.n = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions b = b(new JSONObject(str2));
                this.b = b.b;
                this.c = b.c;
                this.d = b.d;
                this.e = b.e;
                this.f = b.f;
                this.g = b.g;
                this.h = b.h;
                this.i = b.i;
                this.j = b.j;
                this.k = b.k;
                this.l = b.l;
                this.m = str2;
                return;
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
        exc0.i(publicKeyCredentialRpEntity);
        this.b = publicKeyCredentialRpEntity;
        exc0.i(publicKeyCredentialUserEntity);
        this.c = publicKeyCredentialUserEntity;
        exc0.i(bArr);
        this.d = bArr;
        exc0.i(arrayList);
        this.e = arrayList;
        this.f = d;
        this.g = arrayList2;
        this.h = authenticatorSelectionCriteria;
        this.i = num;
        this.j = tokenBinding;
        if (str != null) {
            try {
                this.k = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else {
            this.k = null;
        }
        this.l = authenticationExtensions;
        this.m = null;
    }

    @NonNull
    public static PublicKeyCredentialCreationOptions b(@NonNull JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria;
        AttestationConveyancePreference attestationConveyancePreference;
        zzbl zzc;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = new PublicKeyCredentialUserEntity(k46.b(jSONObject3.getString("id")), jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString(CommonConstant.KEY_DISPLAY_NAME));
        byte[] b = k46.b(jSONObject.getString("challenge"));
        exc0.i(b);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            try {
                zzc = zzbl.zzd(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt(JwsHeader.ALGORITHM)));
            } catch (IllegalArgumentException unused) {
                zzc = zzbl.zzc();
            }
            if (zzc.zzb()) {
                arrayList2.add(zzc.zza());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList3 = new ArrayList();
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                arrayList3.add(PublicKeyCredentialDescriptor.b(jSONArray2.getJSONObject(i2)));
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject5 = jSONObject.getJSONObject("authenticatorSelection");
            authenticatorSelectionCriteria = new AuthenticatorSelectionCriteria(jSONObject5.has("requireResidentKey") ? Boolean.valueOf(jSONObject5.optBoolean("requireResidentKey")) : null, jSONObject5.has("authenticatorAttachment") ? jSONObject5.optString("authenticatorAttachment") : null, jSONObject5.has("userVerification") ? jSONObject5.optString("userVerification") : null, jSONObject5.has("residentKey") ? jSONObject5.optString("residentKey") : null);
        } else {
            authenticatorSelectionCriteria = null;
        }
        AuthenticationExtensions b2 = jSONObject.has("extensions") ? AuthenticationExtensions.b(jSONObject.getJSONObject("extensions")) : null;
        if (jSONObject.has("attestation")) {
            try {
                attestationConveyancePreference = AttestationConveyancePreference.a(jSONObject.getString("attestation"));
            } catch (AttestationConveyancePreference.UnsupportedAttestationConveyancePreferenceException unused2) {
                attestationConveyancePreference = AttestationConveyancePreference.NONE;
            }
        } else {
            attestationConveyancePreference = null;
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, b, arrayList2, valueOf, arrayList, authenticatorSelectionCriteria, null, null, attestationConveyancePreference != null ? attestationConveyancePreference.toString() : null, b2, null, null);
    }

    public final boolean equals(@NonNull Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = publicKeyCredentialCreationOptions.b;
        List list2 = publicKeyCredentialCreationOptions.e;
        List list3 = publicKeyCredentialCreationOptions.g;
        if (dq70.b(this.b, publicKeyCredentialRpEntity) && dq70.b(this.c, publicKeyCredentialCreationOptions.c) && Arrays.equals(this.d, publicKeyCredentialCreationOptions.d) && dq70.b(this.f, publicKeyCredentialCreationOptions.f)) {
            List list4 = this.e;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.g) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && dq70.b(this.h, publicKeyCredentialCreationOptions.h) && dq70.b(this.i, publicKeyCredentialCreationOptions.i) && dq70.b(this.j, publicKeyCredentialCreationOptions.j) && dq70.b(this.k, publicKeyCredentialCreationOptions.k) && dq70.b(this.l, publicKeyCredentialCreationOptions.l) && dq70.b(this.m, publicKeyCredentialCreationOptions.m))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Integer.valueOf(Arrays.hashCode(this.d)), this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String c = k46.c(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.g);
        String valueOf5 = String.valueOf(this.h);
        String valueOf6 = String.valueOf(this.j);
        String valueOf7 = String.valueOf(this.k);
        String valueOf8 = String.valueOf(this.l);
        StringBuilder a2 = xe9.a("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        n6j.b(a2, c, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        a2.append(this.f);
        a2.append(", \n excludeList=");
        a2.append(valueOf4);
        a2.append(", \n authenticatorSelection=");
        a2.append(valueOf5);
        a2.append(", \n requestId=");
        mq.b(this.i, ", \n tokenBinding=", valueOf6, ", \n attestationConveyancePreference=", a2);
        return h5s.d(a2, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.e(parcel, 4, this.d, false);
        ozg0.u(parcel, 5, this.e, false);
        ozg0.f(parcel, 6, this.f);
        ozg0.u(parcel, 7, this.g, false);
        ozg0.p(parcel, 8, this.h, i, false);
        ozg0.k(parcel, 9, this.i);
        ozg0.p(parcel, 10, this.j, i, false);
        AttestationConveyancePreference attestationConveyancePreference = this.k;
        ozg0.q(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.toString(), false);
        ozg0.p(parcel, 12, this.l, i, false);
        ozg0.q(parcel, 13, this.m, false);
        ozg0.p(parcel, 14, this.n, i, false);
        ozg0.x(w, parcel);
    }

    public PublicKeyCredentialCreationOptions(@NonNull String str) {
        try {
            PublicKeyCredentialCreationOptions b = b(new JSONObject(str));
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = str;
        } catch (JSONException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
