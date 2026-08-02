package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Deprecated
/* loaded from: classes2.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();

    /* renamed from: a, reason: collision with root package name */
    public final PasswordRequestOptions f32089a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f32090b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32091c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32092d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32093e;

    /* renamed from: f, reason: collision with root package name */
    public final PasskeysRequestOptions f32094f;

    /* renamed from: g, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f32095g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32096h;

    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f32097a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32098b;

        /* renamed from: c, reason: collision with root package name */
        public final String f32099c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f32100d;

        /* renamed from: e, reason: collision with root package name */
        public final String f32101e;

        /* renamed from: f, reason: collision with root package name */
        public final List f32102f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f32103g;

        /* renamed from: h, reason: collision with root package name */
        public final List f32104h;

        /* renamed from: i, reason: collision with root package name */
        public final String f32105i;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f32106a = false;

            /* renamed from: b, reason: collision with root package name */
            public String f32107b = null;

            /* renamed from: c, reason: collision with root package name */
            public String f32108c = null;

            /* renamed from: d, reason: collision with root package name */
            public boolean f32109d = true;

            /* renamed from: e, reason: collision with root package name */
            public String f32110e = null;

            /* renamed from: f, reason: collision with root package name */
            public List f32111f = null;

            /* renamed from: g, reason: collision with root package name */
            public boolean f32112g = false;

            public GoogleIdTokenRequestOptions a() {
                return new GoogleIdTokenRequestOptions(this.f32106a, this.f32107b, this.f32108c, this.f32109d, this.f32110e, this.f32111f, this.f32112g, null, null);
            }

            public a b(boolean z10) {
                this.f32106a = z10;
                return this;
            }
        }

        public GoogleIdTokenRequestOptions(boolean z10, String str, String str2, boolean z11, String str3, List list, boolean z12, List list2, String str4) {
            boolean z13 = true;
            if (z11 && z12) {
                z13 = false;
            }
            AbstractC3191o.b(z13, "filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.");
            this.f32097a = z10;
            if (z10) {
                AbstractC3191o.n(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f32098b = str;
            this.f32099c = str2;
            this.f32100d = z11;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList = null;
            if (list != null && !list.isEmpty()) {
                arrayList = new ArrayList(list);
                Collections.sort(arrayList);
            }
            this.f32102f = arrayList;
            this.f32101e = str3;
            this.f32103g = z12;
            this.f32104h = list2;
            this.f32105i = str4;
        }

        public static a g() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f32097a == googleIdTokenRequestOptions.f32097a && AbstractC3189m.b(this.f32098b, googleIdTokenRequestOptions.f32098b) && AbstractC3189m.b(this.f32099c, googleIdTokenRequestOptions.f32099c) && this.f32100d == googleIdTokenRequestOptions.f32100d && AbstractC3189m.b(this.f32101e, googleIdTokenRequestOptions.f32101e) && AbstractC3189m.b(this.f32102f, googleIdTokenRequestOptions.f32102f) && this.f32103g == googleIdTokenRequestOptions.f32103g && AbstractC3189m.b(this.f32104h, googleIdTokenRequestOptions.f32104h) && AbstractC3189m.b(this.f32105i, googleIdTokenRequestOptions.f32105i);
        }

        public String getServerClientId() {
            return this.f32098b;
        }

        public boolean h() {
            return this.f32100d;
        }

        public int hashCode() {
            return AbstractC3189m.c(Boolean.valueOf(this.f32097a), this.f32098b, this.f32099c, Boolean.valueOf(this.f32100d), this.f32101e, this.f32102f, Boolean.valueOf(this.f32103g), this.f32104h, this.f32105i);
        }

        public List i() {
            return this.f32102f;
        }

        public String j() {
            return this.f32101e;
        }

        public String k() {
            return this.f32099c;
        }

        public boolean l() {
            return this.f32097a;
        }

        public boolean m() {
            return this.f32103g;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = E9.b.a(parcel);
            E9.b.g(parcel, 1, l());
            E9.b.F(parcel, 2, getServerClientId(), false);
            E9.b.F(parcel, 3, k(), false);
            E9.b.g(parcel, 4, h());
            E9.b.F(parcel, 5, j(), false);
            E9.b.H(parcel, 6, i(), false);
            E9.b.g(parcel, 7, m());
            E9.b.J(parcel, 8, this.f32104h, false);
            E9.b.F(parcel, 9, this.f32105i, false);
            E9.b.b(parcel, a10);
        }
    }

    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f32113a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32114b;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f32115a = false;

            /* renamed from: b, reason: collision with root package name */
            public String f32116b;

            public PasskeyJsonRequestOptions a() {
                return new PasskeyJsonRequestOptions(this.f32115a, this.f32116b);
            }

            public a b(boolean z10) {
                this.f32115a = z10;
                return this;
            }
        }

        public PasskeyJsonRequestOptions(boolean z10, String str) {
            if (z10) {
                AbstractC3191o.m(str);
            }
            this.f32113a = z10;
            this.f32114b = str;
        }

        public static a g() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f32113a == passkeyJsonRequestOptions.f32113a && AbstractC3189m.b(this.f32114b, passkeyJsonRequestOptions.f32114b);
        }

        public String h() {
            return this.f32114b;
        }

        public int hashCode() {
            return AbstractC3189m.c(Boolean.valueOf(this.f32113a), this.f32114b);
        }

        public boolean i() {
            return this.f32113a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = E9.b.a(parcel);
            E9.b.g(parcel, 1, i());
            E9.b.F(parcel, 2, h(), false);
            E9.b.b(parcel, a10);
        }
    }

    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f32117a;

        /* renamed from: b, reason: collision with root package name */
        public final String f32118b;
        private final byte[] zbb;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f32119a = false;

            /* renamed from: b, reason: collision with root package name */
            public String f32120b;
            private byte[] zbb;

            public PasskeysRequestOptions a() {
                return new PasskeysRequestOptions(this.f32119a, this.zbb, this.f32120b);
            }

            public a b(boolean z10) {
                this.f32119a = z10;
                return this;
            }
        }

        public PasskeysRequestOptions(boolean z10, byte[] bArr, String str) {
            if (z10) {
                AbstractC3191o.m(bArr);
                AbstractC3191o.m(str);
            }
            this.f32117a = z10;
            this.zbb = bArr;
            this.f32118b = str;
        }

        public static a g() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f32117a == passkeysRequestOptions.f32117a && Arrays.equals(this.zbb, passkeysRequestOptions.zbb) && Objects.equals(this.f32118b, passkeysRequestOptions.f32118b);
        }

        public byte[] h() {
            return this.zbb;
        }

        public int hashCode() {
            return (Objects.hash(Boolean.valueOf(this.f32117a), this.f32118b) * 31) + Arrays.hashCode(this.zbb);
        }

        public String i() {
            return this.f32118b;
        }

        public boolean j() {
            return this.f32117a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = E9.b.a(parcel);
            E9.b.g(parcel, 1, j());
            E9.b.l(parcel, 2, h(), false);
            E9.b.F(parcel, 3, i(), false);
            E9.b.b(parcel, a10);
        }
    }

    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f32121a;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public boolean f32122a = false;

            public PasswordRequestOptions a() {
                return new PasswordRequestOptions(this.f32122a);
            }

            public a b(boolean z10) {
                this.f32122a = z10;
                return this;
            }
        }

        public PasswordRequestOptions(boolean z10) {
            this.f32121a = z10;
        }

        public static a g() {
            return new a();
        }

        public boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f32121a == ((PasswordRequestOptions) obj).f32121a;
        }

        public boolean h() {
            return this.f32121a;
        }

        public int hashCode() {
            return AbstractC3189m.c(Boolean.valueOf(this.f32121a));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            int a10 = E9.b.a(parcel);
            E9.b.g(parcel, 1, h());
            E9.b.b(parcel, a10);
        }
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public PasswordRequestOptions f32123a;

        /* renamed from: b, reason: collision with root package name */
        public GoogleIdTokenRequestOptions f32124b;

        /* renamed from: c, reason: collision with root package name */
        public PasskeysRequestOptions f32125c;

        /* renamed from: d, reason: collision with root package name */
        public PasskeyJsonRequestOptions f32126d;

        /* renamed from: e, reason: collision with root package name */
        public String f32127e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f32128f;

        /* renamed from: g, reason: collision with root package name */
        public int f32129g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f32130h;

        public a() {
            PasswordRequestOptions.a g10 = PasswordRequestOptions.g();
            g10.b(false);
            this.f32123a = g10.a();
            GoogleIdTokenRequestOptions.a g11 = GoogleIdTokenRequestOptions.g();
            g11.b(false);
            this.f32124b = g11.a();
            PasskeysRequestOptions.a g12 = PasskeysRequestOptions.g();
            g12.b(false);
            this.f32125c = g12.a();
            PasskeyJsonRequestOptions.a g13 = PasskeyJsonRequestOptions.g();
            g13.b(false);
            this.f32126d = g13.a();
        }

        public BeginSignInRequest a() {
            return new BeginSignInRequest(this.f32123a, this.f32124b, this.f32127e, this.f32128f, this.f32129g, this.f32125c, this.f32126d, this.f32130h);
        }

        public a b(boolean z10) {
            this.f32128f = z10;
            return this;
        }

        public a c(GoogleIdTokenRequestOptions googleIdTokenRequestOptions) {
            this.f32124b = (GoogleIdTokenRequestOptions) AbstractC3191o.m(googleIdTokenRequestOptions);
            return this;
        }

        public a d(PasskeyJsonRequestOptions passkeyJsonRequestOptions) {
            this.f32126d = (PasskeyJsonRequestOptions) AbstractC3191o.m(passkeyJsonRequestOptions);
            return this;
        }

        public a e(PasskeysRequestOptions passkeysRequestOptions) {
            this.f32125c = (PasskeysRequestOptions) AbstractC3191o.m(passkeysRequestOptions);
            return this;
        }

        public a f(PasswordRequestOptions passwordRequestOptions) {
            this.f32123a = (PasswordRequestOptions) AbstractC3191o.m(passwordRequestOptions);
            return this;
        }

        public a g(boolean z10) {
            this.f32130h = z10;
            return this;
        }

        public final a h(String str) {
            this.f32127e = str;
            return this;
        }

        public final a i(int i10) {
            this.f32129g = i10;
            return this;
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z10, int i10, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z11) {
        this.f32089a = (PasswordRequestOptions) AbstractC3191o.m(passwordRequestOptions);
        this.f32090b = (GoogleIdTokenRequestOptions) AbstractC3191o.m(googleIdTokenRequestOptions);
        this.f32091c = str;
        this.f32092d = z10;
        this.f32093e = i10;
        if (passkeysRequestOptions == null) {
            PasskeysRequestOptions.a g10 = PasskeysRequestOptions.g();
            g10.b(false);
            passkeysRequestOptions = g10.a();
        }
        this.f32094f = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            PasskeyJsonRequestOptions.a g11 = PasskeyJsonRequestOptions.g();
            g11.b(false);
            passkeyJsonRequestOptions = g11.a();
        }
        this.f32095g = passkeyJsonRequestOptions;
        this.f32096h = z11;
    }

    public static a N(BeginSignInRequest beginSignInRequest) {
        AbstractC3191o.m(beginSignInRequest);
        a g10 = g();
        g10.c(beginSignInRequest.h());
        g10.f(beginSignInRequest.k());
        g10.e(beginSignInRequest.j());
        g10.d(beginSignInRequest.i());
        g10.b(beginSignInRequest.f32092d);
        g10.i(beginSignInRequest.f32093e);
        g10.g(beginSignInRequest.f32096h);
        String str = beginSignInRequest.f32091c;
        if (str != null) {
            g10.h(str);
        }
        return g10;
    }

    public static a g() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return AbstractC3189m.b(this.f32089a, beginSignInRequest.f32089a) && AbstractC3189m.b(this.f32090b, beginSignInRequest.f32090b) && AbstractC3189m.b(this.f32094f, beginSignInRequest.f32094f) && AbstractC3189m.b(this.f32095g, beginSignInRequest.f32095g) && AbstractC3189m.b(this.f32091c, beginSignInRequest.f32091c) && this.f32092d == beginSignInRequest.f32092d && this.f32093e == beginSignInRequest.f32093e && this.f32096h == beginSignInRequest.f32096h;
    }

    public GoogleIdTokenRequestOptions h() {
        return this.f32090b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32089a, this.f32090b, this.f32094f, this.f32095g, this.f32091c, Boolean.valueOf(this.f32092d), Integer.valueOf(this.f32093e), Boolean.valueOf(this.f32096h));
    }

    public PasskeyJsonRequestOptions i() {
        return this.f32095g;
    }

    public PasskeysRequestOptions j() {
        return this.f32094f;
    }

    public PasswordRequestOptions k() {
        return this.f32089a;
    }

    public boolean l() {
        return this.f32096h;
    }

    public boolean m() {
        return this.f32092d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, k(), i10, false);
        E9.b.D(parcel, 2, h(), i10, false);
        E9.b.F(parcel, 3, this.f32091c, false);
        E9.b.g(parcel, 4, m());
        E9.b.u(parcel, 5, this.f32093e);
        E9.b.D(parcel, 6, j(), i10, false);
        E9.b.D(parcel, 7, i(), i10, false);
        E9.b.g(parcel, 8, l());
        E9.b.b(parcel, a10);
    }
}
