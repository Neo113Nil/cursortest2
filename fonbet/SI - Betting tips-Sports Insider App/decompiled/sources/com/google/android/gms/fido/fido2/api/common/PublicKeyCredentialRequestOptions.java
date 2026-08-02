package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import d9.e;
import g6.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import k7.j1;
import q6.b;
import r4.k;
import y6.l;
import y6.m;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new l(3);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f4734a;

    /* renamed from: b, reason: collision with root package name */
    public final Double f4735b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4736c;

    /* renamed from: d, reason: collision with root package name */
    public final List f4737d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f4738e;

    /* renamed from: f, reason: collision with root package name */
    public final TokenBinding f4739f;

    /* renamed from: g, reason: collision with root package name */
    public final UserVerificationRequirement f4740g;

    /* renamed from: h, reason: collision with root package name */
    public final AuthenticationExtensions f4741h;

    /* renamed from: i, reason: collision with root package name */
    public final Long f4742i;
    public final ResultReceiver j;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d10, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l6, String str3, ResultReceiver resultReceiver) {
        this.j = resultReceiver;
        if (str3 != null) {
            j1.f18884a.c();
            throw null;
        }
        v.h(bArr);
        this.f4734a = bArr;
        this.f4735b = d10;
        v.h(str);
        this.f4736c = str;
        this.f4737d = arrayList;
        this.f4738e = num;
        this.f4739f = tokenBinding;
        this.f4742i = l6;
        if (str2 != null) {
            try {
                this.f4740g = UserVerificationRequirement.a(str2);
            } catch (m e7) {
                throw new IllegalArgumentException(e7);
            }
        } else {
            this.f4740g = null;
        }
        this.f4741h = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.f4737d;
        return Arrays.equals(this.f4734a, publicKeyCredentialRequestOptions.f4734a) && v.k(this.f4735b, publicKeyCredentialRequestOptions.f4735b) && v.k(this.f4736c, publicKeyCredentialRequestOptions.f4736c) && (((list = this.f4737d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && v.k(this.f4738e, publicKeyCredentialRequestOptions.f4738e) && v.k(this.f4739f, publicKeyCredentialRequestOptions.f4739f) && v.k(this.f4740g, publicKeyCredentialRequestOptions.f4740g) && v.k(this.f4741h, publicKeyCredentialRequestOptions.f4741h) && v.k(this.f4742i, publicKeyCredentialRequestOptions.f4742i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.f4734a)), this.f4735b, this.f4736c, this.f4737d, this.f4738e, this.f4739f, this.f4740g, this.f4741h, this.f4742i});
    }

    public final String toString() {
        String c2 = b.c(this.f4734a);
        String valueOf = String.valueOf(this.f4737d);
        String valueOf2 = String.valueOf(this.f4739f);
        String valueOf3 = String.valueOf(this.f4740g);
        String valueOf4 = String.valueOf(this.f4741h);
        StringBuilder p10 = e.p("PublicKeyCredentialRequestOptions{\n challenge=", c2, ", \n timeoutSeconds=");
        p10.append(this.f4735b);
        p10.append(", \n rpId='");
        k.s(p10, this.f4736c, "', \n allowList=", valueOf, ", \n requestId=");
        p10.append(this.f4738e);
        p10.append(", \n tokenBinding=");
        p10.append(valueOf2);
        p10.append(", \n userVerification=");
        k.s(p10, valueOf3, ", \n authenticationExtensions=", valueOf4, ", \n longRequestId=");
        p10.append(this.f4742i);
        p10.append("}");
        return p10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.G(parcel, 2, this.f4734a, false);
        h8.b.H(parcel, 3, this.f4735b);
        h8.b.O(parcel, 4, this.f4736c, false);
        h8.b.R(parcel, 5, this.f4737d, false);
        h8.b.K(parcel, 6, this.f4738e);
        h8.b.N(parcel, 7, this.f4739f, i5, false);
        UserVerificationRequirement userVerificationRequirement = this.f4740g;
        h8.b.O(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.f4760a, false);
        h8.b.N(parcel, 9, this.f4741h, i5, false);
        h8.b.M(parcel, 10, this.f4742i);
        h8.b.N(parcel, 12, this.j, i5, false);
        h8.b.W(parcel, V);
    }
}
