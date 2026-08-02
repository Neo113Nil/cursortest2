package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Deprecated
/* loaded from: classes.dex */
public final class BeginSignInRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<BeginSignInRequest> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public final PasswordRequestOptions f4313a;

    /* renamed from: b, reason: collision with root package name */
    public final GoogleIdTokenRequestOptions f4314b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4315c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4316d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4317e;

    /* renamed from: f, reason: collision with root package name */
    public final PasskeysRequestOptions f4318f;

    /* renamed from: g, reason: collision with root package name */
    public final PasskeyJsonRequestOptions f4319g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4320h;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Deprecated
    public static final class GoogleIdTokenRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<GoogleIdTokenRequestOptions> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4321a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4322b;

        /* renamed from: c, reason: collision with root package name */
        public final String f4323c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f4324d;

        /* renamed from: e, reason: collision with root package name */
        public final String f4325e;

        /* renamed from: f, reason: collision with root package name */
        public final ArrayList f4326f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f4327g;

        /* renamed from: h, reason: collision with root package name */
        public final List f4328h;

        /* renamed from: i, reason: collision with root package name */
        public final String f4329i;

        public GoogleIdTokenRequestOptions(boolean z5, String str, String str2, boolean z7, String str3, ArrayList arrayList, boolean z10, ArrayList arrayList2, String str4) {
            boolean z11 = true;
            if (z7 && z10) {
                z11 = false;
            }
            v.a("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true; the Verified Phone Number feature only works in sign-ups.", z11);
            this.f4321a = z5;
            if (z5) {
                v.i(str, "serverClientId must be provided if Google ID tokens are requested");
            }
            this.f4322b = str;
            this.f4323c = str2;
            this.f4324d = z7;
            ArrayList arrayList3 = null;
            if (arrayList != null && !arrayList.isEmpty()) {
                arrayList3 = new ArrayList(arrayList);
                Collections.sort(arrayList3);
            }
            this.f4326f = arrayList3;
            this.f4325e = str3;
            this.f4327g = z10;
            this.f4328h = arrayList2;
            this.f4329i = str4;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GoogleIdTokenRequestOptions)) {
                return false;
            }
            GoogleIdTokenRequestOptions googleIdTokenRequestOptions = (GoogleIdTokenRequestOptions) obj;
            return this.f4321a == googleIdTokenRequestOptions.f4321a && v.k(this.f4322b, googleIdTokenRequestOptions.f4322b) && v.k(this.f4323c, googleIdTokenRequestOptions.f4323c) && this.f4324d == googleIdTokenRequestOptions.f4324d && v.k(this.f4325e, googleIdTokenRequestOptions.f4325e) && v.k(this.f4326f, googleIdTokenRequestOptions.f4326f) && this.f4327g == googleIdTokenRequestOptions.f4327g && v.k(this.f4328h, googleIdTokenRequestOptions.f4328h) && v.k(this.f4329i, googleIdTokenRequestOptions.f4329i);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4321a), this.f4322b, this.f4323c, Boolean.valueOf(this.f4324d), this.f4325e, this.f4326f, Boolean.valueOf(this.f4327g), this.f4328h, this.f4329i});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            int V = h8.b.V(parcel, 20293);
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4321a ? 1 : 0);
            h8.b.O(parcel, 2, this.f4322b, false);
            h8.b.O(parcel, 3, this.f4323c, false);
            h8.b.U(parcel, 4, 4);
            parcel.writeInt(this.f4324d ? 1 : 0);
            h8.b.O(parcel, 5, this.f4325e, false);
            h8.b.P(parcel, 6, this.f4326f);
            h8.b.U(parcel, 7, 4);
            parcel.writeInt(this.f4327g ? 1 : 0);
            h8.b.R(parcel, 8, this.f4328h, false);
            h8.b.O(parcel, 9, this.f4329i, false);
            h8.b.W(parcel, V);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Deprecated
    public static final class PasskeyJsonRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeyJsonRequestOptions> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4330a;

        /* renamed from: b, reason: collision with root package name */
        public final String f4331b;

        public PasskeyJsonRequestOptions(boolean z5, String str) {
            if (z5) {
                v.h(str);
            }
            this.f4330a = z5;
            this.f4331b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeyJsonRequestOptions)) {
                return false;
            }
            PasskeyJsonRequestOptions passkeyJsonRequestOptions = (PasskeyJsonRequestOptions) obj;
            return this.f4330a == passkeyJsonRequestOptions.f4330a && v.k(this.f4331b, passkeyJsonRequestOptions.f4331b);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4330a), this.f4331b});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            int V = h8.b.V(parcel, 20293);
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4330a ? 1 : 0);
            h8.b.O(parcel, 2, this.f4331b, false);
            h8.b.W(parcel, V);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Deprecated
    public static final class PasskeysRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasskeysRequestOptions> CREATOR = new d();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4332a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f4333b;

        /* renamed from: c, reason: collision with root package name */
        public final String f4334c;

        public PasskeysRequestOptions(String str, boolean z5, byte[] bArr) {
            if (z5) {
                v.h(bArr);
                v.h(str);
            }
            this.f4332a = z5;
            this.f4333b = bArr;
            this.f4334c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PasskeysRequestOptions)) {
                return false;
            }
            PasskeysRequestOptions passkeysRequestOptions = (PasskeysRequestOptions) obj;
            return this.f4332a == passkeysRequestOptions.f4332a && Arrays.equals(this.f4333b, passkeysRequestOptions.f4333b) && Objects.equals(this.f4334c, passkeysRequestOptions.f4334c);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f4333b) + (Objects.hash(Boolean.valueOf(this.f4332a), this.f4334c) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            int V = h8.b.V(parcel, 20293);
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4332a ? 1 : 0);
            h8.b.G(parcel, 2, this.f4333b, false);
            h8.b.O(parcel, 3, this.f4334c, false);
            h8.b.W(parcel, V);
        }
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Deprecated
    public static final class PasswordRequestOptions extends AbstractSafeParcelable {

        @NonNull
        public static final Parcelable.Creator<PasswordRequestOptions> CREATOR = new e();

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4335a;

        public PasswordRequestOptions(boolean z5) {
            this.f4335a = z5;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof PasswordRequestOptions) && this.f4335a == ((PasswordRequestOptions) obj).f4335a;
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Boolean.valueOf(this.f4335a)});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i5) {
            int V = h8.b.V(parcel, 20293);
            h8.b.U(parcel, 1, 4);
            parcel.writeInt(this.f4335a ? 1 : 0);
            h8.b.W(parcel, V);
        }
    }

    public BeginSignInRequest(PasswordRequestOptions passwordRequestOptions, GoogleIdTokenRequestOptions googleIdTokenRequestOptions, String str, boolean z5, int i5, PasskeysRequestOptions passkeysRequestOptions, PasskeyJsonRequestOptions passkeyJsonRequestOptions, boolean z7) {
        v.h(passwordRequestOptions);
        this.f4313a = passwordRequestOptions;
        v.h(googleIdTokenRequestOptions);
        this.f4314b = googleIdTokenRequestOptions;
        this.f4315c = str;
        this.f4316d = z5;
        this.f4317e = i5;
        this.f4318f = passkeysRequestOptions == null ? new PasskeysRequestOptions(null, false, null) : passkeysRequestOptions;
        this.f4319g = passkeyJsonRequestOptions == null ? new PasskeyJsonRequestOptions(false, null) : passkeyJsonRequestOptions;
        this.f4320h = z7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BeginSignInRequest)) {
            return false;
        }
        BeginSignInRequest beginSignInRequest = (BeginSignInRequest) obj;
        return v.k(this.f4313a, beginSignInRequest.f4313a) && v.k(this.f4314b, beginSignInRequest.f4314b) && v.k(this.f4318f, beginSignInRequest.f4318f) && v.k(this.f4319g, beginSignInRequest.f4319g) && v.k(this.f4315c, beginSignInRequest.f4315c) && this.f4316d == beginSignInRequest.f4316d && this.f4317e == beginSignInRequest.f4317e && this.f4320h == beginSignInRequest.f4320h;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4313a, this.f4314b, this.f4318f, this.f4319g, this.f4315c, Boolean.valueOf(this.f4316d), Integer.valueOf(this.f4317e), Boolean.valueOf(this.f4320h)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = h8.b.V(parcel, 20293);
        h8.b.N(parcel, 1, this.f4313a, i5, false);
        h8.b.N(parcel, 2, this.f4314b, i5, false);
        h8.b.O(parcel, 3, this.f4315c, false);
        h8.b.U(parcel, 4, 4);
        parcel.writeInt(this.f4316d ? 1 : 0);
        h8.b.U(parcel, 5, 4);
        parcel.writeInt(this.f4317e);
        h8.b.N(parcel, 6, this.f4318f, i5, false);
        h8.b.N(parcel, 7, this.f4319g, i5, false);
        h8.b.U(parcel, 8, 4);
        parcel.writeInt(this.f4320h ? 1 : 0);
        h8.b.W(parcel, V);
    }
}
