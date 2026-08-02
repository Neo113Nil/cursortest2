package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.fido.common.Transport;
import g6.v;
import io.sentry.android.core.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import k7.d;
import k7.e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r4.k;
import u5.b;
import y6.c;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new b(29);

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRpEntity f4717a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicKeyCredentialUserEntity f4718b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f4719c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4720d;

    /* renamed from: e, reason: collision with root package name */
    public final Double f4721e;

    /* renamed from: f, reason: collision with root package name */
    public final List f4722f;

    /* renamed from: g, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f4723g;

    /* renamed from: h, reason: collision with root package name */
    public final Integer f4724h;

    /* renamed from: i, reason: collision with root package name */
    public final TokenBinding f4725i;
    public final AttestationConveyancePreference j;

    /* renamed from: k, reason: collision with root package name */
    public final AuthenticationExtensions f4726k;

    /* renamed from: l, reason: collision with root package name */
    public final String f4727l;

    /* renamed from: m, reason: collision with root package name */
    public final ResultReceiver f4728m;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, ArrayList arrayList, Double d10, ArrayList arrayList2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions, String str2, ResultReceiver resultReceiver) {
        this.f4728m = resultReceiver;
        if (str2 != null) {
            try {
                PublicKeyCredentialCreationOptions c2 = c(new JSONObject(str2));
                this.f4717a = c2.f4717a;
                this.f4718b = c2.f4718b;
                this.f4719c = c2.f4719c;
                this.f4720d = c2.f4720d;
                this.f4721e = c2.f4721e;
                this.f4722f = c2.f4722f;
                this.f4723g = c2.f4723g;
                this.f4724h = c2.f4724h;
                this.f4725i = c2.f4725i;
                this.j = c2.j;
                this.f4726k = c2.f4726k;
                this.f4727l = str2;
                return;
            } catch (JSONException e7) {
                throw new IllegalArgumentException(e7);
            }
        }
        v.h(publicKeyCredentialRpEntity);
        this.f4717a = publicKeyCredentialRpEntity;
        v.h(publicKeyCredentialUserEntity);
        this.f4718b = publicKeyCredentialUserEntity;
        v.h(bArr);
        this.f4719c = bArr;
        v.h(arrayList);
        this.f4720d = arrayList;
        this.f4721e = d10;
        this.f4722f = arrayList2;
        this.f4723g = authenticatorSelectionCriteria;
        this.f4724h = num;
        this.f4725i = tokenBinding;
        if (str != null) {
            try {
                this.j = AttestationConveyancePreference.a(str);
            } catch (c e9) {
                throw new IllegalArgumentException(e9);
            }
        } else {
            this.j = null;
        }
        this.f4726k = authenticationExtensions;
        this.f4727l = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0268  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PublicKeyCredentialCreationOptions c(JSONObject jSONObject) {
        ArrayList arrayList;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria;
        AuthenticationExtensions authenticationExtensions;
        AttestationConveyancePreference attestationConveyancePreference;
        int i5;
        zzak zzakVar;
        zzak c2;
        zzs zzsVar;
        zzu zzuVar;
        JSONArray jSONArray;
        String str;
        ArrayList arrayList2;
        JSONArray jSONArray2;
        String str2;
        d dVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = new PublicKeyCredentialRpEntity(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = new PublicKeyCredentialUserEntity(jSONObject3.getString("name"), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"), q6.b.b(jSONObject3.getString("id")));
        byte[] b10 = q6.b.b(jSONObject.getString("challenge"));
        v.h(b10);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < jSONArray3.length(); i10++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i10);
            try {
                dVar = new e(new PublicKeyCredentialParameters(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                dVar = k7.b.f18847a;
            }
            if (dVar.b()) {
                arrayList3.add(dVar.a());
            }
        }
        Double valueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i11 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList4 = new ArrayList();
            int i12 = 0;
            while (i12 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i12);
                Parcelable.Creator<PublicKeyCredentialDescriptor> creator = PublicKeyCredentialDescriptor.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] decode = Base64.decode(jSONObject5.getString(str3), i11);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    jSONArray = jSONArray4;
                    str = str3;
                    arrayList2 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    jSONArray = jSONArray4;
                    int i13 = 0;
                    while (i13 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i13);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (w6.a unused2) {
                                w0.m("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i13++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList2 = new ArrayList(hashSet);
                }
                arrayList4.add(new PublicKeyCredentialDescriptor(string, decode, arrayList2));
                i12++;
                jSONArray4 = jSONArray;
                str3 = str;
                i11 = 11;
            }
            arrayList = arrayList4;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            authenticatorSelectionCriteria = new AuthenticatorSelectionCriteria(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            authenticatorSelectionCriteria = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            FidoAppIdExtension fidoAppIdExtension = jSONObject7.has("fidoAppIdExtension") ? new FidoAppIdExtension(jSONObject7.getJSONObject("fidoAppIdExtension").getString(AppsFlyerProperties.APP_ID)) : null;
            if (jSONObject7.has(AppsFlyerProperties.APP_ID)) {
                fidoAppIdExtension = new FidoAppIdExtension(jSONObject7.getString(AppsFlyerProperties.APP_ID));
            }
            FidoAppIdExtension fidoAppIdExtension2 = fidoAppIdExtension;
            if (!jSONObject7.has("prf")) {
                i5 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    c2 = zzak.c(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    zzakVar = null;
                    if (jSONObject7.has("cableAuthenticationExtension")) {
                        zzsVar = null;
                    } else {
                        JSONArray jSONArray5 = jSONObject7.getJSONArray("cableAuthenticationExtension");
                        ArrayList arrayList5 = new ArrayList();
                        while (i5 < jSONArray5.length()) {
                            JSONObject jSONObject8 = jSONArray5.getJSONObject(i5);
                            arrayList5.add(new zzq(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                            i5++;
                        }
                        zzsVar = new zzs(arrayList5);
                    }
                    UserVerificationMethodExtension userVerificationMethodExtension = !jSONObject7.has("userVerificationMethodExtension") ? new UserVerificationMethodExtension(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null;
                    zzz zzzVar = !jSONObject7.has("google_multiAssertionExtension") ? new zzz(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null;
                    zzab zzabVar = !jSONObject7.has("google_sessionIdExtension") ? new zzab(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null;
                    zzad zzadVar = !jSONObject7.has("google_silentVerificationExtension") ? new zzad(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null;
                    if (jSONObject7.has("devicePublicKeyExtension")) {
                        zzuVar = null;
                    } else {
                        jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                        zzuVar = new zzu();
                    }
                    authenticationExtensions = new AuthenticationExtensions(fidoAppIdExtension2, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new zzag(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, zzakVar, !jSONObject7.has("txAuthSimple") ? new zzaw(jSONObject7.getString("txAuthSimple")) : null, null);
                }
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i5 = 0;
                c2 = zzak.c(jSONObject7.getJSONObject("prf"), false);
            }
            zzakVar = c2;
            if (jSONObject7.has("cableAuthenticationExtension")) {
            }
            if (!jSONObject7.has("userVerificationMethodExtension")) {
            }
            if (!jSONObject7.has("google_multiAssertionExtension")) {
            }
            if (!jSONObject7.has("google_sessionIdExtension")) {
            }
            if (!jSONObject7.has("google_silentVerificationExtension")) {
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
            }
            authenticationExtensions = new AuthenticationExtensions(fidoAppIdExtension2, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, !jSONObject7.has("google_tunnelServerIdExtension") ? new zzag(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject7.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, zzakVar, !jSONObject7.has("txAuthSimple") ? new zzaw(jSONObject7.getString("txAuthSimple")) : null, null);
        } else {
            authenticationExtensions = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                attestationConveyancePreference = AttestationConveyancePreference.a(jSONObject.getString("attestation"));
            } catch (c e7) {
                w0.n("PKCCreationOptions", "Invalid AttestationConveyancePreference", e7);
                attestationConveyancePreference = AttestationConveyancePreference.NONE;
            }
        } else {
            attestationConveyancePreference = null;
        }
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, b10, arrayList3, valueOf, arrayList, authenticatorSelectionCriteria, null, null, attestationConveyancePreference == null ? null : attestationConveyancePreference.f4644a, authenticationExtensions, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        List list2 = publicKeyCredentialCreationOptions.f4720d;
        List list3 = publicKeyCredentialCreationOptions.f4722f;
        if (v.k(this.f4717a, publicKeyCredentialCreationOptions.f4717a) && v.k(this.f4718b, publicKeyCredentialCreationOptions.f4718b) && Arrays.equals(this.f4719c, publicKeyCredentialCreationOptions.f4719c) && v.k(this.f4721e, publicKeyCredentialCreationOptions.f4721e)) {
            List list4 = this.f4720d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f4722f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && v.k(this.f4723g, publicKeyCredentialCreationOptions.f4723g) && v.k(this.f4724h, publicKeyCredentialCreationOptions.f4724h) && v.k(this.f4725i, publicKeyCredentialCreationOptions.f4725i) && v.k(this.j, publicKeyCredentialCreationOptions.j) && v.k(this.f4726k, publicKeyCredentialCreationOptions.f4726k) && v.k(this.f4727l, publicKeyCredentialCreationOptions.f4727l))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4717a, this.f4718b, Integer.valueOf(Arrays.hashCode(this.f4719c)), this.f4720d, this.f4721e, this.f4722f, this.f4723g, this.f4724h, this.f4725i, this.j, this.f4726k, this.f4727l});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4717a);
        String valueOf2 = String.valueOf(this.f4718b);
        String c2 = q6.b.c(this.f4719c);
        String valueOf3 = String.valueOf(this.f4720d);
        String valueOf4 = String.valueOf(this.f4722f);
        String valueOf5 = String.valueOf(this.f4723g);
        String valueOf6 = String.valueOf(this.f4725i);
        String valueOf7 = String.valueOf(this.j);
        String valueOf8 = String.valueOf(this.f4726k);
        StringBuilder q = k.q("PublicKeyCredentialCreationOptions{\n rp=", valueOf, ", \n user=", valueOf2, ", \n challenge=");
        k.s(q, c2, ", \n parameters=", valueOf3, ", \n timeoutSeconds=");
        q.append(this.f4721e);
        q.append(", \n excludeList=");
        q.append(valueOf4);
        q.append(", \n authenticatorSelection=");
        q.append(valueOf5);
        q.append(", \n requestId=");
        q.append(this.f4724h);
        q.append(", \n tokenBinding=");
        q.append(valueOf6);
        q.append(", \n attestationConveyancePreference=");
        return d9.e.n(q, valueOf7, ", \n authenticationExtensions=", valueOf8, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.N(parcel, 2, this.f4717a, i5, false);
        h8.b.N(parcel, 3, this.f4718b, i5, false);
        h8.b.G(parcel, 4, this.f4719c, false);
        h8.b.R(parcel, 5, this.f4720d, false);
        h8.b.H(parcel, 6, this.f4721e);
        h8.b.R(parcel, 7, this.f4722f, false);
        h8.b.N(parcel, 8, this.f4723g, i5, false);
        h8.b.K(parcel, 9, this.f4724h);
        h8.b.N(parcel, 10, this.f4725i, i5, false);
        AttestationConveyancePreference attestationConveyancePreference = this.j;
        h8.b.O(parcel, 11, attestationConveyancePreference == null ? null : attestationConveyancePreference.f4644a, false);
        h8.b.N(parcel, 12, this.f4726k, i5, false);
        h8.b.O(parcel, 13, this.f4727l, false);
        h8.b.N(parcel, 14, this.f4728m, i5, false);
        h8.b.W(parcel, V);
    }
}
