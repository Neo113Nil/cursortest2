package com.google.android.gms.fido.fido2.api.common;

import R9.m;
import R9.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class PublicKeyCredentialRequestOptions extends RequestOptions {

    @NonNull
    public static final Parcelable.Creator<PublicKeyCredentialRequestOptions> CREATOR = new m();

    /* renamed from: a, reason: collision with root package name */
    public final Double f32940a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32941b;

    /* renamed from: c, reason: collision with root package name */
    public final List f32942c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f32943d;

    /* renamed from: e, reason: collision with root package name */
    public final TokenBinding f32944e;

    /* renamed from: f, reason: collision with root package name */
    public final zzay f32945f;

    /* renamed from: g, reason: collision with root package name */
    public final AuthenticationExtensions f32946g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f32947h;

    @NonNull
    private final byte[] zza;

    public PublicKeyCredentialRequestOptions(byte[] bArr, Double d10, String str, List list, Integer num, TokenBinding tokenBinding, String str2, AuthenticationExtensions authenticationExtensions, Long l10) {
        this.zza = (byte[]) AbstractC3191o.m(bArr);
        this.f32940a = d10;
        this.f32941b = (String) AbstractC3191o.m(str);
        this.f32942c = list;
        this.f32943d = num;
        this.f32944e = tokenBinding;
        this.f32947h = l10;
        if (str2 != null) {
            try {
                this.f32945f = zzay.a(str2);
            } catch (s e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f32945f = null;
        }
        this.f32946g = authenticationExtensions;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (!(obj instanceof PublicKeyCredentialRequestOptions)) {
            return false;
        }
        PublicKeyCredentialRequestOptions publicKeyCredentialRequestOptions = (PublicKeyCredentialRequestOptions) obj;
        return Arrays.equals(this.zza, publicKeyCredentialRequestOptions.zza) && AbstractC3189m.b(this.f32940a, publicKeyCredentialRequestOptions.f32940a) && AbstractC3189m.b(this.f32941b, publicKeyCredentialRequestOptions.f32941b) && (((list = this.f32942c) == null && publicKeyCredentialRequestOptions.f32942c == null) || (list != null && (list2 = publicKeyCredentialRequestOptions.f32942c) != null && list.containsAll(list2) && publicKeyCredentialRequestOptions.f32942c.containsAll(this.f32942c))) && AbstractC3189m.b(this.f32943d, publicKeyCredentialRequestOptions.f32943d) && AbstractC3189m.b(this.f32944e, publicKeyCredentialRequestOptions.f32944e) && AbstractC3189m.b(this.f32945f, publicKeyCredentialRequestOptions.f32945f) && AbstractC3189m.b(this.f32946g, publicKeyCredentialRequestOptions.f32946g) && AbstractC3189m.b(this.f32947h, publicKeyCredentialRequestOptions.f32947h);
    }

    public List g() {
        return this.f32942c;
    }

    public AuthenticationExtensions h() {
        return this.f32946g;
    }

    public int hashCode() {
        return AbstractC3189m.c(Integer.valueOf(Arrays.hashCode(this.zza)), this.f32940a, this.f32941b, this.f32942c, this.f32943d, this.f32944e, this.f32945f, this.f32946g, this.f32947h);
    }

    public byte[] i() {
        return this.zza;
    }

    public Integer j() {
        return this.f32943d;
    }

    public String k() {
        return this.f32941b;
    }

    public Double l() {
        return this.f32940a;
    }

    public TokenBinding m() {
        return this.f32944e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.l(parcel, 2, i(), false);
        E9.b.p(parcel, 3, l(), false);
        E9.b.F(parcel, 4, k(), false);
        E9.b.J(parcel, 5, g(), false);
        E9.b.x(parcel, 6, j(), false);
        E9.b.D(parcel, 7, m(), i10, false);
        zzay zzayVar = this.f32945f;
        E9.b.F(parcel, 8, zzayVar == null ? null : zzayVar.toString(), false);
        E9.b.D(parcel, 9, h(), i10, false);
        E9.b.A(parcel, 10, this.f32947h, false);
        E9.b.b(parcel, a10);
    }
}
