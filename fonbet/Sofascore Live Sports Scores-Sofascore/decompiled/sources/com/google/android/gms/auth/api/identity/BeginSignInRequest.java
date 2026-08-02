package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
@Deprecated
/* loaded from: classes3.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new zbg();
    public final PasswordRequestOptions a;
    public final GoogleIdTokenRequestOptions b;
    public final String c;
    public final boolean d;
    public final int e;
    public final PasskeysRequestOptions f;
    public final PasskeyJsonRequestOptions g;
    public final boolean h;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Deprecated
    public static final class Builder {
        public PasswordRequestOptions a;
        public GoogleIdTokenRequestOptions b;
        public PasskeysRequestOptions c;
        public PasskeyJsonRequestOptions d;
        public String e;
        public boolean f;
        public int g;
        public boolean h;

        public Builder() {
            Parcelable.Creator<PasswordRequestOptions> creator = PasswordRequestOptions.CREATOR;
            new PasswordRequestOptions.Builder();
            this.a = new PasswordRequestOptions(false);
            Parcelable.Creator<GoogleIdTokenRequestOptions> creator2 = GoogleIdTokenRequestOptions.CREATOR;
            GoogleIdTokenRequestOptions.Builder builder = new GoogleIdTokenRequestOptions.Builder();
            builder.a = false;
            this.b = new GoogleIdTokenRequestOptions(builder.a, builder.b, null, true, null, null, false);
            Parcelable.Creator<PasskeysRequestOptions> creator3 = PasskeysRequestOptions.CREATOR;
            new PasskeysRequestOptions.Builder();
            this.c = new PasskeysRequestOptions(null, null, false);
            Parcelable.Creator<PasskeyJsonRequestOptions> creator4 = PasskeyJsonRequestOptions.CREATOR;
            new PasskeyJsonRequestOptions.Builder();
            this.d = new PasskeyJsonRequestOptions(false, null);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new zbm();
        public final boolean a;
        public final String b;
        public final String c;
        public final boolean d;
        public final String e;
        public final ArrayList f;
        public final boolean g;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {
            public boolean a = false;
            public String b = null;
        }

        public GoogleIdTokenRequestOptions(boolean z, String str, String str2, boolean z2, String str3, ArrayList arrayList, boolean z3) {
            boolean z4 = true;
            if (z2 && z3) {
                z4 = false;
            }
            Preconditions.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z4);
            this.a = z;
            if (z) {
                Preconditions.j(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.b = str;
            this.c = str2;
            this.d = z2;
            Parcelable.Creator<BeginSignInRequest> creator = BeginSignInRequest.CREATOR;
            ArrayList arrayList2 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList2 = new ArrayList(arrayList);
                Collections.sort(arrayList2);
            }
            this.f = arrayList2;
            this.e = str3;
            this.g = z3;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.a == googleIdTokenRequestOptions.a && Objects.a(this.b, googleIdTokenRequestOptions.b) && Objects.a(this.c, googleIdTokenRequestOptions.c) && this.d == googleIdTokenRequestOptions.d && Objects.a(this.e, googleIdTokenRequestOptions.e) && Objects.a(this.f, googleIdTokenRequestOptions.f) && this.g == googleIdTokenRequestOptions.g;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b, this.c, Boolean.valueOf(this.d), this.e, this.f, Boolean.valueOf(this.g)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            SafeParcelWriter.m(parcel, 2, this.b, false);
            SafeParcelWriter.m(parcel, 3, this.c, false);
            SafeParcelWriter.r(parcel, 4, 4);
            parcel.writeInt(this.d ? 1 : 0);
            SafeParcelWriter.m(parcel, 5, this.e, false);
            SafeParcelWriter.o(parcel, 6, this.f);
            SafeParcelWriter.r(parcel, 7, 4);
            parcel.writeInt(this.g ? 1 : 0);
            SafeParcelWriter.t(parcel, s);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new zbn();
        public final boolean a;
        public final String b;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {
        }

        public PasskeyJsonRequestOptions(boolean z, String str) {
            if (z) {
                Preconditions.i(str);
            }
            this.a = z;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.a == passkeyJsonRequestOptions.a && Objects.a(this.b, passkeyJsonRequestOptions.b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            SafeParcelWriter.m(parcel, 2, this.b, false);
            SafeParcelWriter.t(parcel, s);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new zbo();
        public final boolean a;
        public final byte[] b;
        public final String c;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {
        }

        public PasskeysRequestOptions(String str, byte[] bArr, boolean z) {
            if (z) {
                Preconditions.i(bArr);
                Preconditions.i(str);
            }
            this.a = z;
            this.b = bArr;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.a == passkeysRequestOptions.a && Arrays.equals(this.b, passkeysRequestOptions.b) && java.util.Objects.equals(this.c, passkeysRequestOptions.c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.b) + (java.util.Objects.hash(Boolean.valueOf(this.a), this.c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            SafeParcelWriter.c(parcel, 2, this.b, false);
            SafeParcelWriter.m(parcel, 3, this.c, false);
            SafeParcelWriter.t(parcel, s);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @SafeParcelable.Class
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new zbp();
        public final boolean a;

        /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
        public static final class Builder {
        }

        public PasswordRequestOptions(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.a == ((PasswordRequestOptions) obj).a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int s = SafeParcelWriter.s(parcel, 20293);
            SafeParcelWriter.r(parcel, 1, 4);
            parcel.writeInt(this.a ? 1 : 0);
            SafeParcelWriter.t(parcel, s);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z, int i, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z2) {
        Preconditions.i(passwordRequestOptions);
        this.a = passwordRequestOptions;
        Preconditions.i(googleIdTokenRequestOptions);
        this.b = googleIdTokenRequestOptions;
        this.c = str;
        this.d = z;
        this.e = i;
        if (passkeysRequestOptions == null) {
            Parcelable.Creator<PasskeysRequestOptions> creator = PasskeysRequestOptions.CREATOR;
            new PasskeysRequestOptions.Builder();
            passkeysRequestOptions = new PasskeysRequestOptions(null, null, false);
        }
        this.f = passkeysRequestOptions;
        if (passkeyJsonRequestOptions == null) {
            Parcelable.Creator<PasskeyJsonRequestOptions> creator2 = PasskeyJsonRequestOptions.CREATOR;
            new PasskeyJsonRequestOptions.Builder();
            passkeyJsonRequestOptions = new PasskeyJsonRequestOptions(false, null);
        }
        this.g = passkeyJsonRequestOptions;
        this.h = z2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return Objects.a(this.a, beginSignInRequest.a) && Objects.a(this.b, beginSignInRequest.b) && Objects.a(this.f, beginSignInRequest.f) && Objects.a(this.g, beginSignInRequest.g) && Objects.a(this.c, beginSignInRequest.c) && this.d == beginSignInRequest.d && this.e == beginSignInRequest.e && this.h == beginSignInRequest.h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.f, this.g, this.c, Boolean.valueOf(this.d), Integer.valueOf(this.e), Boolean.valueOf(this.h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.l(parcel, 1, this.a, i, false);
        SafeParcelWriter.l(parcel, 2, this.b, i, false);
        SafeParcelWriter.m(parcel, 3, this.c, false);
        SafeParcelWriter.r(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e);
        SafeParcelWriter.l(parcel, 6, this.f, i, false);
        SafeParcelWriter.l(parcel, 7, this.g, i, false);
        SafeParcelWriter.r(parcel, 8, 4);
        parcel.writeInt(this.h ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
