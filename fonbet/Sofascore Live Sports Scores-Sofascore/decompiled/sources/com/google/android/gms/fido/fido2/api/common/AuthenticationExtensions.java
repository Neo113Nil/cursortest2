package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.bf3;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new zzd();
    public final FidoAppIdExtension a;
    public final zzs b;
    public final UserVerificationMethodExtension c;
    public final zzz d;
    public final zzab e;
    public final zzad f;
    public final zzu g;
    public final zzag h;
    public final GoogleThirdPartyPaymentExtension i;
    public final zzak j;
    public final zzaw k;
    public final zzai l;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
        public FidoAppIdExtension a;
        public UserVerificationMethodExtension b;
        public zzs c;
        public zzz d;
        public zzab e;
        public zzad f;
        public zzu g;
        public zzag h;
        public GoogleThirdPartyPaymentExtension i;
        public zzak j;
        public zzaw k;
    }

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.a = fidoAppIdExtension;
        this.c = userVerificationMethodExtension;
        this.b = zzsVar;
        this.d = zzzVar;
        this.e = zzabVar;
        this.f = zzadVar;
        this.g = zzuVar;
        this.h = zzagVar;
        this.i = googleThirdPartyPaymentExtension;
        this.j = zzakVar;
        this.k = zzawVar;
        this.l = zzaiVar;
    }

    public static AuthenticationExtensions Y0(JSONObject jSONObject) {
        Builder builder = new Builder();
        if (jSONObject.has("fidoAppIdExtension")) {
            builder.a = new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString("appid"));
        }
        if (jSONObject.has("appid")) {
            builder.a = new FidoAppIdExtension(jSONObject.getString("appid"));
        }
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            builder.j = zzak.Y0(jSONObject.getJSONObject("prf"), false);
        } else if (jSONObject.has("prfAlreadyHashed")) {
            builder.j = zzak.Y0(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        if (jSONObject.has("cableAuthenticationExtension")) {
            JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
            }
            builder.c = new zzs(arrayList);
        }
        if (jSONObject.has("userVerificationMethodExtension")) {
            builder.b = new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
        }
        if (jSONObject.has("google_multiAssertionExtension")) {
            builder.d = new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
        }
        if (jSONObject.has("google_sessionIdExtension")) {
            builder.e = new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
        }
        if (jSONObject.has("google_silentVerificationExtension")) {
            builder.f = new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
        }
        if (jSONObject.has("devicePublicKeyExtension")) {
            jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
            builder.g = new zzu();
        }
        if (jSONObject.has("google_tunnelServerIdExtension")) {
            builder.h = new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
        }
        if (jSONObject.has("google_thirdPartyPaymentExtension")) {
            builder.i = new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
        }
        if (jSONObject.has("txAuthSimple")) {
            builder.k = new zzaw(jSONObject.getString("txAuthSimple"));
        }
        return new AuthenticationExtensions(builder.a, builder.c, builder.b, builder.d, builder.e, builder.f, builder.g, builder.h, builder.i, builder.j, builder.k, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return Objects.a(this.a, authenticationExtensions.a) && Objects.a(this.b, authenticationExtensions.b) && Objects.a(this.c, authenticationExtensions.c) && Objects.a(this.d, authenticationExtensions.d) && Objects.a(this.e, authenticationExtensions.e) && Objects.a(this.f, authenticationExtensions.f) && Objects.a(this.g, authenticationExtensions.g) && Objects.a(this.h, authenticationExtensions.h) && Objects.a(this.i, authenticationExtensions.i) && Objects.a(this.j, authenticationExtensions.j) && Objects.a(this.k, authenticationExtensions.k) && Objects.a(this.l, authenticationExtensions.l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        StringBuilder s = mz1.s("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        bf3.v(s, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        bf3.v(s, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        bf3.v(s, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        bf3.v(s, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return mz1.o(s, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 2, this.a, i, false);
        SafeParcelWriter.l(parcel, 3, this.b, i, false);
        SafeParcelWriter.l(parcel, 4, this.c, i, false);
        SafeParcelWriter.l(parcel, 5, this.d, i, false);
        SafeParcelWriter.l(parcel, 6, this.e, i, false);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        SafeParcelWriter.l(parcel, 8, this.g, i, false);
        SafeParcelWriter.l(parcel, 9, this.h, i, false);
        SafeParcelWriter.l(parcel, 10, this.i, i, false);
        SafeParcelWriter.l(parcel, 11, this.j, i, false);
        SafeParcelWriter.l(parcel, 12, this.k, i, false);
        SafeParcelWriter.l(parcel, 13, this.l, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
