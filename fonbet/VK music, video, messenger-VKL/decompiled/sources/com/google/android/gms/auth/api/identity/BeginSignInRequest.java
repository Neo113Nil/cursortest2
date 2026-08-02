package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import xsna.dq70;
import xsna.exc0;
import xsna.ozg0;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
@Deprecated
/* loaded from: classes12.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new com.google.android.gms.auth.api.identity.a();
    public final PasswordRequestOptions b;
    public final GoogleIdTokenRequestOptions c;

    @Nullable
    public final String d;
    public final boolean e;
    public final int f;
    public final PasskeysRequestOptions g;
    public final PasskeyJsonRequestOptions h;
    public final boolean i;

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();
        public final boolean b;

        @Nullable
        public final String c;

        @Nullable
        public final String d;
        public final boolean e;

        @Nullable
        public final String f;

        @Nullable
        public final ArrayList g;
        public final boolean h;

        /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
        public static final class a {
            public boolean a;
            public boolean b;

            @NonNull
            public final GoogleIdTokenRequestOptions a() {
                return new GoogleIdTokenRequestOptions(this.a, null, null, this.b, null, null, false);
            }
        }

        public GoogleIdTokenRequestOptions(boolean z, @Nullable String str, @Nullable String str2, boolean z2, @Nullable String str3, @Nullable ArrayList arrayList, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            exc0.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.b = z;
            if (z) {
                exc0.j(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.c = str;
            this.d = str2;
            this.e = z2;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.g = arrayList2;
            this.f = str3;
            this.h = z3;
        }

        @NonNull
        public static a i() {
            a aVar = new a();
            aVar.a = false;
            aVar.b = true;
            return aVar;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.b == googleIdTokenRequestOptions.b && dq70.b(this.c, googleIdTokenRequestOptions.c) && dq70.b(this.d, googleIdTokenRequestOptions.d) && this.e == googleIdTokenRequestOptions.e && dq70.b(this.f, googleIdTokenRequestOptions.f) && dq70.b(this.g, googleIdTokenRequestOptions.g) && this.h == googleIdTokenRequestOptions.h;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c, this.d, Boolean.valueOf(this.e), this.f, this.g, Boolean.valueOf(this.h)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b ? 1 : 0);
            ozg0.q(parcel, 2, this.c, false);
            ozg0.q(parcel, 3, this.d, false);
            ozg0.v(parcel, 4, 4);
            parcel.writeInt(this.e ? 1 : 0);
            ozg0.q(parcel, 5, this.f, false);
            ozg0.s(parcel, this.g, 6);
            ozg0.v(parcel, 7, 4);
            parcel.writeInt(this.h ? 1 : 0);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();
        public final boolean b;
        public final String c;

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                exc0.i(str);
            }
            this.b = z;
            this.c = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.b == passkeyJsonRequestOptions.b && dq70.b(this.c, passkeyJsonRequestOptions.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b), this.c});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b ? 1 : 0);
            ozg0.q(parcel, 2, this.c, false);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();
        public final boolean b;
        public final byte[] c;
        public final String d;

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                exc0.i(bArr);
                exc0.i(str);
            }
            this.b = z;
            this.c = bArr;
            this.d = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.b == passkeysRequestOptions.b && Arrays.equals(this.c, passkeysRequestOptions.c) && Objects.equals(this.d, passkeysRequestOptions.d);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.c) + (Objects.hash(Boolean.valueOf(this.b), this.d) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b ? 1 : 0);
            ozg0.e(parcel, 2, this.c, false);
            ozg0.q(parcel, 3, this.d, false);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();
        public final boolean b;

        public PasswordRequestOptions(boolean z) {
            this.b = z;
        }

        public final boolean equals(@Nullable Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.b == ((PasswordRequestOptions) obj).b;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.b)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int w = ozg0.w(20293, parcel);
            ozg0.v(parcel, 1, 4);
            parcel.writeInt(this.b ? 1 : 0);
            ozg0.x(w, parcel);
        }
    }

    /* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
    @Deprecated
    public static final class a {
        public PasswordRequestOptions a;
        public GoogleIdTokenRequestOptions b;
        public PasskeysRequestOptions c;
        public PasskeyJsonRequestOptions d;

        @Nullable
        public String e;
        public boolean f;
        public int g;
        public boolean h;

        @NonNull
        public final BeginSignInRequest a() {
            return new BeginSignInRequest(this.a, this.b, this.e, this.f, this.g, this.c, this.d, this.h);
        }

        @NonNull
        public final void b(@NonNull String str) {
            this.e = str;
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, @Nullable String str, boolean z, int i, @Nullable PasskeysRequestOptions passkeysRequestOptions, @Nullable PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        exc0.i(passwordRequestOptions);
        this.b = passwordRequestOptions;
        exc0.i(googleIdTokenRequestOptions);
        this.c = googleIdTokenRequestOptions;
        this.d = str;
        this.e = z;
        this.f = i;
        this.g = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, null, false) : passkeysRequestOptions;
        this.h = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.i = z2;
    }

    @NonNull
    public static a b(@NonNull BeginSignInRequest beginSignInRequest) {
        exc0.i(beginSignInRequest);
        a aVar = new a();
        aVar.a = new PasswordRequestOptions(false);
        GoogleIdTokenRequestOptions.a i = GoogleIdTokenRequestOptions.i();
        i.a = false;
        aVar.b = i.a();
        aVar.c = new PasskeysRequestOptions(null, null, false);
        aVar.d = new PasskeyJsonRequestOptions(false, null);
        GoogleIdTokenRequestOptions googleIdTokenRequestOptions = beginSignInRequest.c;
        exc0.i(googleIdTokenRequestOptions);
        aVar.b = googleIdTokenRequestOptions;
        PasswordRequestOptions passwordRequestOptions = beginSignInRequest.b;
        exc0.i(passwordRequestOptions);
        aVar.a = passwordRequestOptions;
        PasskeysRequestOptions passkeysRequestOptions = beginSignInRequest.g;
        exc0.i(passkeysRequestOptions);
        aVar.c = passkeysRequestOptions;
        PasskeyJsonRequestOptions passkeyJsonRequestOptions = beginSignInRequest.h;
        exc0.i(passkeyJsonRequestOptions);
        aVar.d = passkeyJsonRequestOptions;
        aVar.f = beginSignInRequest.e;
        aVar.g = beginSignInRequest.f;
        aVar.h = beginSignInRequest.i;
        String str = beginSignInRequest.d;
        if (str != null) {
            aVar.e = str;
        }
        return aVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return dq70.b(this.b, beginSignInRequest.b) && dq70.b(this.c, beginSignInRequest.c) && dq70.b(this.g, beginSignInRequest.g) && dq70.b(this.h, beginSignInRequest.h) && dq70.b(this.d, beginSignInRequest.d) && this.e == beginSignInRequest.e && this.f == beginSignInRequest.f && this.i == beginSignInRequest.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.g, this.h, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f), Boolean.valueOf(this.i)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int w = ozg0.w(20293, parcel);
        ozg0.p(parcel, 1, this.b, i, false);
        ozg0.p(parcel, 2, this.c, i, false);
        ozg0.q(parcel, 3, this.d, false);
        ozg0.v(parcel, 4, 4);
        parcel.writeInt(this.e ? 1 : 0);
        ozg0.v(parcel, 5, 4);
        parcel.writeInt(this.f);
        ozg0.p(parcel, 6, this.g, i, false);
        ozg0.p(parcel, 7, this.h, i, false);
        ozg0.v(parcel, 8, 4);
        parcel.writeInt(this.i ? 1 : 0);
        ozg0.x(w, parcel);
    }
}
