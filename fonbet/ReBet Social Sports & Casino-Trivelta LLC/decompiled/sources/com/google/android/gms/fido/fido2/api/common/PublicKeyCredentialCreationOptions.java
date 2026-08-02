package com.google.android.gms.fido.fido2.api.common;

import R9.C1558i;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class PublicKeyCredentialCreationOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialCreationOptions> CREATOR = new C1558i();

    /* renamed from: a, reason: collision with root package name */
    public final PublicKeyCredentialRpEntity f32925a;

    /* renamed from: b, reason: collision with root package name */
    public final PublicKeyCredentialUserEntity f32926b;

    /* renamed from: c, reason: collision with root package name */
    public final List f32927c;

    /* renamed from: d, reason: collision with root package name */
    public final Double f32928d;

    /* renamed from: e, reason: collision with root package name */
    public final List f32929e;

    /* renamed from: f, reason: collision with root package name */
    public final AuthenticatorSelectionCriteria f32930f;

    /* renamed from: g, reason: collision with root package name */
    public final Integer f32931g;

    /* renamed from: h, reason: collision with root package name */
    public final TokenBinding f32932h;

    /* renamed from: i, reason: collision with root package name */
    public final AttestationConveyancePreference f32933i;

    /* renamed from: j, reason: collision with root package name */
    public final AuthenticationExtensions f32934j;

    @NonNull
    private final byte[] zzc;

    public PublicKeyCredentialCreationOptions(PublicKeyCredentialRpEntity publicKeyCredentialRpEntity, PublicKeyCredentialUserEntity publicKeyCredentialUserEntity, byte[] bArr, List list, Double d10, List list2, AuthenticatorSelectionCriteria authenticatorSelectionCriteria, Integer num, TokenBinding tokenBinding, String str, AuthenticationExtensions authenticationExtensions) {
        this.f32925a = (PublicKeyCredentialRpEntity) AbstractC3191o.m(publicKeyCredentialRpEntity);
        this.f32926b = (PublicKeyCredentialUserEntity) AbstractC3191o.m(publicKeyCredentialUserEntity);
        this.zzc = (byte[]) AbstractC3191o.m(bArr);
        this.f32927c = (List) AbstractC3191o.m(list);
        this.f32928d = d10;
        this.f32929e = list2;
        this.f32930f = authenticatorSelectionCriteria;
        this.f32931g = num;
        this.f32932h = tokenBinding;
        if (str != null) {
            try {
                this.f32933i = AttestationConveyancePreference.a(str);
            } catch (AttestationConveyancePreference.a e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f32933i = null;
        }
        this.f32934j = authenticationExtensions;
    }

    public PublicKeyCredentialRpEntity N() {
        return this.f32925a;
    }

    public Double O() {
        return this.f32928d;
    }

    public TokenBinding Y() {
        return this.f32932h;
    }

    public PublicKeyCredentialUserEntity Z() {
        return this.f32926b;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialCreationOptions)) {
            return false;
        }
        PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
        return AbstractC3189m.b(this.f32925a, publicKeyCredentialCreationOptions.f32925a) && AbstractC3189m.b(this.f32926b, publicKeyCredentialCreationOptions.f32926b) && Arrays.equals(this.zzc, publicKeyCredentialCreationOptions.zzc) && AbstractC3189m.b(this.f32928d, publicKeyCredentialCreationOptions.f32928d) && this.f32927c.containsAll(publicKeyCredentialCreationOptions.f32927c) && publicKeyCredentialCreationOptions.f32927c.containsAll(this.f32927c) && (((list = this.f32929e) == null && publicKeyCredentialCreationOptions.f32929e == null) || (list != null && (list2 = publicKeyCredentialCreationOptions.f32929e) != null && list.containsAll(list2) && publicKeyCredentialCreationOptions.f32929e.containsAll(this.f32929e))) && AbstractC3189m.b(this.f32930f, publicKeyCredentialCreationOptions.f32930f) && AbstractC3189m.b(this.f32931g, publicKeyCredentialCreationOptions.f32931g) && AbstractC3189m.b(this.f32932h, publicKeyCredentialCreationOptions.f32932h) && AbstractC3189m.b(this.f32933i, publicKeyCredentialCreationOptions.f32933i) && AbstractC3189m.b(this.f32934j, publicKeyCredentialCreationOptions.f32934j);
    }

    public String g() {
        AttestationConveyancePreference attestationConveyancePreference = this.f32933i;
        if (attestationConveyancePreference == null) {
            return null;
        }
        return attestationConveyancePreference.toString();
    }

    public AuthenticationExtensions h() {
        return this.f32934j;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32925a, this.f32926b, Integer.valueOf(Arrays.hashCode(this.zzc)), this.f32927c, this.f32928d, this.f32929e, this.f32930f, this.f32931g, this.f32932h, this.f32933i, this.f32934j);
    }

    public AuthenticatorSelectionCriteria i() {
        return this.f32930f;
    }

    public byte[] j() {
        return this.zzc;
    }

    public List k() {
        return this.f32929e;
    }

    public List l() {
        return this.f32927c;
    }

    public Integer m() {
        return this.f32931g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 2, N(), i10, false);
        E9.b.D(parcel, 3, Z(), i10, false);
        E9.b.l(parcel, 4, j(), false);
        E9.b.J(parcel, 5, l(), false);
        E9.b.p(parcel, 6, O(), false);
        E9.b.J(parcel, 7, k(), false);
        E9.b.D(parcel, 8, i(), i10, false);
        E9.b.x(parcel, 9, m(), false);
        E9.b.D(parcel, 10, Y(), i10, false);
        E9.b.F(parcel, 11, g(), false);
        E9.b.D(parcel, 12, h(), i10, false);
        E9.b.b(parcel, a10);
    }
}
