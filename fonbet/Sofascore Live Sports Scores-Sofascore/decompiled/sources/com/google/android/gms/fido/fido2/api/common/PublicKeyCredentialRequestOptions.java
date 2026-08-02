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
import com.google.android.gms.internal.fido.zzia;
import com.google.android.gms.internal.fido.zzib;
import defpackage.bf3;
import defpackage.ilg;
import defpackage.vxd;
import defpackage.wt3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes3.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new zzar();
    public final byte[] a;
    public final Double b;
    public final String c;
    public final List d;
    public final Integer e;
    public final TokenBinding f;
    public final UserVerificationRequirement g;
    public final AuthenticationExtensions h;
    public final Long i;
    public final ResultReceiver j;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class Builder {
    }

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d, String str, ArrayList arrayList, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l, String str3, ResultReceiver resultReceiver) {
        this.j = resultReceiver;
        if (str3 != null) {
            ((zzib) zzia.b.a.a).zza();
            throw null;
        }
        Preconditions.i(bArr);
        this.a = bArr;
        this.b = d;
        Preconditions.i(str);
        this.c = str;
        this.d = arrayList;
        this.e = num;
        this.f = tokenBinding;
        this.i = l;
        if (str2 != null) {
            try {
                this.g = UserVerificationRequirement.a(str2);
            } catch (zzbc e) {
                ilg.k(e);
                throw null;
            }
        } else {
            this.g = null;
        }
        this.h = authenticationExtensions;
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        List list2 = publicKeyCredentialRequestOptions.d;
        return Arrays.equals(this.a, publicKeyCredentialRequestOptions.a) && Objects.a(this.b, publicKeyCredentialRequestOptions.b) && Objects.a(this.c, publicKeyCredentialRequestOptions.c) && (((list = this.d) == null && list2 == null) || (list != null && list2 != null && list.containsAll(list2) && list2.containsAll(list))) && Objects.a(this.e, publicKeyCredentialRequestOptions.e) && Objects.a(this.f, publicKeyCredentialRequestOptions.f) && Objects.a(this.g, publicKeyCredentialRequestOptions.g) && Objects.a(this.h, publicKeyCredentialRequestOptions.h) && Objects.a(this.i, publicKeyCredentialRequestOptions.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i});
    }

    public final String toString() {
        String b = Base64Utils.b(this.a);
        String valueOf = String.valueOf(this.d);
        String valueOf2 = String.valueOf(this.f);
        String valueOf3 = String.valueOf(this.g);
        String valueOf4 = String.valueOf(this.h);
        StringBuilder q = wt3.q("PublicKeyCredentialRequestOptions{\n challenge=", b, ", \n timeoutSeconds=");
        q.append(this.b);
        q.append(", \n rpId='");
        bf3.v(q, this.c, "', \n allowList=", valueOf, ", \n requestId=");
        vxd.s(this.e, ", \n tokenBinding=", valueOf2, ", \n userVerification=", q);
        bf3.v(q, valueOf3, ", \n authenticationExtensions=", valueOf4, ", \n longRequestId=");
        q.append(this.i);
        q.append("}");
        return q.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.c(parcel, 2, this.a, false);
        SafeParcelWriter.e(parcel, 3, this.b);
        SafeParcelWriter.m(parcel, 4, this.c, false);
        SafeParcelWriter.q(parcel, 5, this.d, false);
        SafeParcelWriter.i(parcel, 6, this.e);
        SafeParcelWriter.l(parcel, 7, this.f, i, false);
        UserVerificationRequirement userVerificationRequirement = this.g;
        SafeParcelWriter.m(parcel, 8, userVerificationRequirement == null ? null : userVerificationRequirement.a, false);
        SafeParcelWriter.l(parcel, 9, this.h, i, false);
        SafeParcelWriter.k(parcel, 10, this.i);
        SafeParcelWriter.l(parcel, 12, this.j, i, false);
        SafeParcelWriter.t(parcel, s);
    }
}
