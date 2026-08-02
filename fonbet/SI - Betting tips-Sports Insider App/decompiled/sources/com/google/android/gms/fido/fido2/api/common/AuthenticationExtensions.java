package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import d9.e;
import g6.v;
import h8.b;
import java.util.Arrays;
import r4.k;
import y6.l;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class AuthenticationExtensions extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticationExtensions> CREATOR = new l(16);

    /* renamed from: a, reason: collision with root package name */
    public final FidoAppIdExtension f4645a;

    /* renamed from: b, reason: collision with root package name */
    public final zzs f4646b;

    /* renamed from: c, reason: collision with root package name */
    public final UserVerificationMethodExtension f4647c;

    /* renamed from: d, reason: collision with root package name */
    public final zzz f4648d;

    /* renamed from: e, reason: collision with root package name */
    public final zzab f4649e;

    /* renamed from: f, reason: collision with root package name */
    public final zzad f4650f;

    /* renamed from: g, reason: collision with root package name */
    public final zzu f4651g;

    /* renamed from: h, reason: collision with root package name */
    public final zzag f4652h;

    /* renamed from: i, reason: collision with root package name */
    public final GoogleThirdPartyPaymentExtension f4653i;
    public final zzak j;

    /* renamed from: k, reason: collision with root package name */
    public final zzaw f4654k;

    /* renamed from: l, reason: collision with root package name */
    public final zzai f4655l;

    public AuthenticationExtensions(FidoAppIdExtension fidoAppIdExtension, zzs zzsVar, UserVerificationMethodExtension userVerificationMethodExtension, zzz zzzVar, zzab zzabVar, zzad zzadVar, zzu zzuVar, zzag zzagVar, GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, zzak zzakVar, zzaw zzawVar, zzai zzaiVar) {
        this.f4645a = fidoAppIdExtension;
        this.f4647c = userVerificationMethodExtension;
        this.f4646b = zzsVar;
        this.f4648d = zzzVar;
        this.f4649e = zzabVar;
        this.f4650f = zzadVar;
        this.f4651g = zzuVar;
        this.f4652h = zzagVar;
        this.f4653i = googleThirdPartyPaymentExtension;
        this.j = zzakVar;
        this.f4654k = zzawVar;
        this.f4655l = zzaiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensions)) {
            return false;
        }
        AuthenticationExtensions authenticationExtensions = (AuthenticationExtensions) obj;
        return v.k(this.f4645a, authenticationExtensions.f4645a) && v.k(this.f4646b, authenticationExtensions.f4646b) && v.k(this.f4647c, authenticationExtensions.f4647c) && v.k(this.f4648d, authenticationExtensions.f4648d) && v.k(this.f4649e, authenticationExtensions.f4649e) && v.k(this.f4650f, authenticationExtensions.f4650f) && v.k(this.f4651g, authenticationExtensions.f4651g) && v.k(this.f4652h, authenticationExtensions.f4652h) && v.k(this.f4653i, authenticationExtensions.f4653i) && v.k(this.j, authenticationExtensions.j) && v.k(this.f4654k, authenticationExtensions.f4654k) && v.k(this.f4655l, authenticationExtensions.f4655l);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4645a, this.f4646b, this.f4647c, this.f4648d, this.f4649e, this.f4650f, this.f4651g, this.f4652h, this.f4653i, this.j, this.f4654k, this.f4655l});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4645a);
        String valueOf2 = String.valueOf(this.f4646b);
        String valueOf3 = String.valueOf(this.f4647c);
        String valueOf4 = String.valueOf(this.f4648d);
        String valueOf5 = String.valueOf(this.f4649e);
        String valueOf6 = String.valueOf(this.f4650f);
        String valueOf7 = String.valueOf(this.f4651g);
        String valueOf8 = String.valueOf(this.f4652h);
        String valueOf9 = String.valueOf(this.f4653i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.f4654k);
        StringBuilder q = k.q("AuthenticationExtensions{\n fidoAppIdExtension=", valueOf, ", \n cableAuthenticationExtension=", valueOf2, ", \n userVerificationMethodExtension=");
        k.s(q, valueOf3, ", \n googleMultiAssertionExtension=", valueOf4, ", \n googleSessionIdExtension=");
        k.s(q, valueOf5, ", \n googleSilentVerificationExtension=", valueOf6, ", \n devicePublicKeyExtension=");
        k.s(q, valueOf7, ", \n googleTunnelServerIdExtension=", valueOf8, ", \n googleThirdPartyPaymentExtension=");
        k.s(q, valueOf9, ", \n prfExtension=", valueOf10, ", \n simpleTransactionAuthorizationExtension=");
        return e.l(q, valueOf11, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.N(parcel, 2, this.f4645a, i5, false);
        b.N(parcel, 3, this.f4646b, i5, false);
        b.N(parcel, 4, this.f4647c, i5, false);
        b.N(parcel, 5, this.f4648d, i5, false);
        b.N(parcel, 6, this.f4649e, i5, false);
        b.N(parcel, 7, this.f4650f, i5, false);
        b.N(parcel, 8, this.f4651g, i5, false);
        b.N(parcel, 9, this.f4652h, i5, false);
        b.N(parcel, 10, this.f4653i, i5, false);
        b.N(parcel, 11, this.j, i5, false);
        b.N(parcel, 12, this.f4654k, i5, false);
        b.N(parcel, 13, this.f4655l, i5, false);
        b.W(parcel, V);
    }
}
