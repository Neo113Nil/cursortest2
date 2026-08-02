package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import z9.p;

@Deprecated
/* loaded from: classes2.dex */
public class SavePasswordRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<SavePasswordRequest> CREATOR = new p();

    /* renamed from: a, reason: collision with root package name */
    public final SignInPassword f32170a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32171b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32172c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public SignInPassword f32173a;

        /* renamed from: b, reason: collision with root package name */
        public String f32174b;

        /* renamed from: c, reason: collision with root package name */
        public int f32175c;

        public SavePasswordRequest a() {
            return new SavePasswordRequest(this.f32173a, this.f32174b, this.f32175c);
        }

        public a b(SignInPassword signInPassword) {
            this.f32173a = signInPassword;
            return this;
        }

        public final a c(int i10) {
            this.f32175c = i10;
            return this;
        }

        public final a d(String str) {
            this.f32174b = str;
            return this;
        }
    }

    public SavePasswordRequest(SignInPassword signInPassword, String str, int i10) {
        this.f32170a = (SignInPassword) AbstractC3191o.m(signInPassword);
        this.f32171b = str;
        this.f32172c = i10;
    }

    public static a g() {
        return new a();
    }

    public static a i(SavePasswordRequest savePasswordRequest) {
        AbstractC3191o.m(savePasswordRequest);
        a g10 = g();
        g10.b(savePasswordRequest.h());
        g10.c(savePasswordRequest.f32172c);
        String str = savePasswordRequest.f32171b;
        if (str != null) {
            g10.d(str);
        }
        return g10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SavePasswordRequest)) {
            return false;
        }
        SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
        return AbstractC3189m.b(this.f32170a, savePasswordRequest.f32170a) && AbstractC3189m.b(this.f32171b, savePasswordRequest.f32171b) && this.f32172c == savePasswordRequest.f32172c;
    }

    public SignInPassword h() {
        return this.f32170a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32170a, this.f32171b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.D(parcel, 1, h(), i10, false);
        E9.b.F(parcel, 2, this.f32171b, false);
        E9.b.u(parcel, 3, this.f32172c);
        E9.b.b(parcel, a10);
    }
}
