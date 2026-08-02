package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import z9.l;

@Deprecated
/* loaded from: classes2.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new l();

    /* renamed from: a, reason: collision with root package name */
    public final String f32137a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32138b;

    /* renamed from: c, reason: collision with root package name */
    public final String f32139c;

    /* renamed from: d, reason: collision with root package name */
    public final String f32140d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32141e;

    /* renamed from: f, reason: collision with root package name */
    public final int f32142f;

    /* renamed from: g, reason: collision with root package name */
    public final List f32143g;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f32144a;

        /* renamed from: b, reason: collision with root package name */
        public String f32145b;

        /* renamed from: c, reason: collision with root package name */
        public String f32146c;

        /* renamed from: d, reason: collision with root package name */
        public List f32147d;

        /* renamed from: e, reason: collision with root package name */
        public String f32148e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f32149f;

        /* renamed from: g, reason: collision with root package name */
        public int f32150g;

        public GetSignInIntentRequest a() {
            return new GetSignInIntentRequest(this.f32144a, this.f32145b, this.f32146c, this.f32148e, this.f32149f, this.f32150g, this.f32147d);
        }

        public a b(String str) {
            this.f32145b = str;
            return this;
        }

        public a c(String str) {
            this.f32148e = str;
            return this;
        }

        public a d(boolean z10) {
            this.f32149f = z10;
            return this;
        }

        public a e(String str) {
            AbstractC3191o.m(str);
            this.f32144a = str;
            return this;
        }

        public final a f(String str) {
            this.f32146c = str;
            return this;
        }

        public final a g(int i10) {
            this.f32150g = i10;
            return this;
        }

        public final a h(List list) {
            this.f32147d = list;
            return this;
        }
    }

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z10, int i10, List list) {
        AbstractC3191o.m(str);
        this.f32137a = str;
        this.f32138b = str2;
        this.f32139c = str3;
        this.f32140d = str4;
        this.f32141e = z10;
        this.f32142f = i10;
        this.f32143g = list;
    }

    public static a g() {
        return new a();
    }

    public static a k(GetSignInIntentRequest getSignInIntentRequest) {
        AbstractC3191o.m(getSignInIntentRequest);
        a g10 = g();
        g10.e(getSignInIntentRequest.getServerClientId());
        g10.c(getSignInIntentRequest.i());
        g10.b(getSignInIntentRequest.h());
        g10.d(getSignInIntentRequest.f32141e);
        g10.g(getSignInIntentRequest.f32142f);
        g10.h(getSignInIntentRequest.f32143g);
        String str = getSignInIntentRequest.f32139c;
        if (str != null) {
            g10.f(str);
        }
        return g10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return AbstractC3189m.b(this.f32137a, getSignInIntentRequest.f32137a) && AbstractC3189m.b(this.f32140d, getSignInIntentRequest.f32140d) && AbstractC3189m.b(this.f32138b, getSignInIntentRequest.f32138b) && AbstractC3189m.b(Boolean.valueOf(this.f32141e), Boolean.valueOf(getSignInIntentRequest.f32141e)) && this.f32142f == getSignInIntentRequest.f32142f && AbstractC3189m.b(this.f32143g, getSignInIntentRequest.f32143g);
    }

    public String getServerClientId() {
        return this.f32137a;
    }

    public String h() {
        return this.f32138b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32137a, this.f32138b, this.f32140d, Boolean.valueOf(this.f32141e), Integer.valueOf(this.f32142f), this.f32143g);
    }

    public String i() {
        return this.f32140d;
    }

    public boolean j() {
        return this.f32141e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 1, getServerClientId(), false);
        E9.b.F(parcel, 2, h(), false);
        E9.b.F(parcel, 3, this.f32139c, false);
        E9.b.F(parcel, 4, i(), false);
        E9.b.g(parcel, 5, j());
        E9.b.u(parcel, 6, this.f32142f);
        E9.b.J(parcel, 7, this.f32143g, false);
        E9.b.b(parcel, a10);
    }
}
