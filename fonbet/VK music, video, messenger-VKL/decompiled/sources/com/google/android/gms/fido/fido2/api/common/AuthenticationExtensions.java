package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.dq70;
import xsna.i5s;
import xsna.n601;
import xsna.n6j;
import xsna.ozg0;
import xsna.xe9;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes12.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new n601();

    @Nullable
    public final FidoAppIdExtension b;

    @Nullable
    public final zzs c;

    @Nullable
    public final UserVerificationMethodExtension d;

    @Nullable
    public final zzz e;

    @Nullable
    public final zzab f;

    @Nullable
    public final zzad g;

    @Nullable
    public final zzu h;

    @Nullable
    public final zzag i;

    @Nullable
    public final GoogleThirdPartyPaymentExtension j;

    @Nullable
    public final zzak k;

    @Nullable
    public final zzaw l;

    @Nullable
    public final zzai m;

    public AuthenticationExtensions(@Nullable FidoAppIdExtension fidoAppIdExtension, @Nullable zzs zzsVar, @Nullable UserVerificationMethodExtension userVerificationMethodExtension, @Nullable zzz zzzVar, @Nullable zzab zzabVar, @Nullable zzad zzadVar, @Nullable zzu zzuVar, @Nullable zzag zzagVar, @Nullable GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, @Nullable zzak zzakVar, @Nullable zzaw zzawVar, @Nullable zzai zzaiVar) {
        this.b = fidoAppIdExtension;
        this.d = userVerificationMethodExtension;
        this.c = zzsVar;
        this.e = zzzVar;
        this.f = zzabVar;
        this.g = zzadVar;
        this.h = zzuVar;
        this.i = zzagVar;
        this.j = googleThirdPartyPaymentExtension;
        this.k = zzakVar;
        this.l = zzawVar;
        this.m = zzaiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AuthenticationExtensions b(@NonNull JSONObject jSONObject) throws JSONException {
        zzak zzakVar;
        zzak b;
        zzs zzsVar;
        FidoAppIdExtension fidoAppIdExtension = jSONObject.has("fidoAppIdExtension") ? new FidoAppIdExtension(jSONObject.getJSONObject("fidoAppIdExtension").getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID)) : null;
        if (jSONObject.has(HiAnalyticsConstant.HaKey.BI_KEY_APPID)) {
            fidoAppIdExtension = new FidoAppIdExtension(jSONObject.getString(HiAnalyticsConstant.HaKey.BI_KEY_APPID));
        }
        FidoAppIdExtension fidoAppIdExtension2 = fidoAppIdExtension;
        if (jSONObject.has("prf")) {
            if (jSONObject.has("prfAlreadyHashed")) {
                throw new JSONException("both prf and prfAlreadyHashed extensions found");
            }
            b = zzak.b(jSONObject.getJSONObject("prf"), false);
        } else {
            if (!jSONObject.has("prfAlreadyHashed")) {
                zzakVar = null;
                if (jSONObject.has("cableAuthenticationExtension")) {
                    zzsVar = null;
                } else {
                    JSONArray jSONArray = jSONObject.getJSONArray("cableAuthenticationExtension");
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                        arrayList.add(new zzq(jSONObject2.getLong("version"), Base64.decode(jSONObject2.getString("clientEid"), 11), Base64.decode(jSONObject2.getString("authenticatorEid"), 11), Base64.decode(jSONObject2.getString("sessionPreKey"), 11)));
                    }
                    zzsVar = new zzs(arrayList);
                }
                return new AuthenticationExtensions(fidoAppIdExtension2, zzsVar, !jSONObject.has("userVerificationMethodExtension") ? new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null, !jSONObject.has("google_multiAssertionExtension") ? new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null, !jSONObject.has("google_sessionIdExtension") ? new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null, !jSONObject.has("google_silentVerificationExtension") ? new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null, !jSONObject.has("devicePublicKeyExtension") ? new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")) : null, !jSONObject.has("google_tunnelServerIdExtension") ? new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, zzakVar, jSONObject.has("txAuthSimple") ? new zzaw(jSONObject.getString("txAuthSimple")) : null, null);
            }
            b = zzak.b(jSONObject.getJSONObject("prfAlreadyHashed"), true);
        }
        zzakVar = b;
        if (jSONObject.has("cableAuthenticationExtension")) {
        }
        return new AuthenticationExtensions(fidoAppIdExtension2, zzsVar, !jSONObject.has("userVerificationMethodExtension") ? new UserVerificationMethodExtension(jSONObject.getJSONObject("userVerificationMethodExtension").getBoolean("uvm")) : null, !jSONObject.has("google_multiAssertionExtension") ? new zzz(jSONObject.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion")) : null, !jSONObject.has("google_sessionIdExtension") ? new zzab(jSONObject.getJSONObject("google_sessionIdExtension").getInt("sessionId")) : null, !jSONObject.has("google_silentVerificationExtension") ? new zzad(jSONObject.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification")) : null, !jSONObject.has("devicePublicKeyExtension") ? new zzu(jSONObject.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey")) : null, !jSONObject.has("google_tunnelServerIdExtension") ? new zzag(jSONObject.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId")) : null, !jSONObject.has("google_thirdPartyPaymentExtension") ? new GoogleThirdPartyPaymentExtension(jSONObject.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment")) : null, zzakVar, jSONObject.has("txAuthSimple") ? new zzaw(jSONObject.getString("txAuthSimple")) : null, null);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return dq70.b(this.b, authenticationExtensions.b) && dq70.b(this.c, authenticationExtensions.c) && dq70.b(this.d, authenticationExtensions.d) && dq70.b(this.e, authenticationExtensions.e) && dq70.b(this.f, authenticationExtensions.f) && dq70.b(this.g, authenticationExtensions.g) && dq70.b(this.h, authenticationExtensions.h) && dq70.b(this.i, authenticationExtensions.i) && dq70.b(this.j, authenticationExtensions.j) && dq70.b(this.k, authenticationExtensions.k) && dq70.b(this.l, authenticationExtensions.l) && dq70.b(this.m, authenticationExtensions.m);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m});
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        String valueOf4 = String.valueOf(this.e);
        String valueOf5 = String.valueOf(this.f);
        String valueOf6 = String.valueOf(this.g);
        String valueOf7 = String.valueOf(this.h);
        String valueOf8 = String.valueOf(this.i);
        String valueOf9 = String.valueOf(this.j);
        String valueOf10 = String.valueOf(this.k);
        String valueOf11 = String.valueOf(this.l);
        StringBuilder a = xe9.a("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        n6j.b(a, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        n6j.b(a, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        n6j.b(a, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        n6j.b(a, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return i5s.a(a, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 2, this.b, i, false);
        ozg0.p(parcel, 3, this.c, i, false);
        ozg0.p(parcel, 4, this.d, i, false);
        ozg0.p(parcel, 5, this.e, i, false);
        ozg0.p(parcel, 6, this.f, i, false);
        ozg0.p(parcel, 7, this.g, i, false);
        ozg0.p(parcel, 8, this.h, i, false);
        ozg0.p(parcel, 9, this.i, i, false);
        ozg0.p(parcel, 10, this.j, i, false);
        ozg0.p(parcel, 11, this.k, i, false);
        ozg0.p(parcel, 12, this.l, i, false);
        ozg0.p(parcel, 13, this.m, i, false);
        ozg0.x(w, parcel);
    }
}
