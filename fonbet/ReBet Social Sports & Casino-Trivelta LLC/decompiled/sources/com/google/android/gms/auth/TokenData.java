package com.google.android.gms.auth;

import E9.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import v9.C6678m;

/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<TokenData> CREATOR = new C6678m();

    /* renamed from: a, reason: collision with root package name */
    public final int f32012a;

    /* renamed from: b, reason: collision with root package name */
    public final String f32013b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f32014c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f32015d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f32016e;

    /* renamed from: f, reason: collision with root package name */
    public final List f32017f;

    /* renamed from: g, reason: collision with root package name */
    public final String f32018g;

    public TokenData(int i10, String str, Long l10, boolean z10, boolean z11, List list, String str2) {
        this.f32012a = i10;
        this.f32013b = AbstractC3191o.g(str);
        this.f32014c = l10;
        this.f32015d = z10;
        this.f32016e = z11;
        this.f32017f = list;
        this.f32018g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.f32013b, tokenData.f32013b) && AbstractC3189m.b(this.f32014c, tokenData.f32014c) && this.f32015d == tokenData.f32015d && this.f32016e == tokenData.f32016e && AbstractC3189m.b(this.f32017f, tokenData.f32017f) && AbstractC3189m.b(this.f32018g, tokenData.f32018g);
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32013b, this.f32014c, Boolean.valueOf(this.f32015d), Boolean.valueOf(this.f32016e), this.f32017f, this.f32018g);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = b.a(parcel);
        b.u(parcel, 1, this.f32012a);
        b.F(parcel, 2, this.f32013b, false);
        b.A(parcel, 3, this.f32014c, false);
        b.g(parcel, 4, this.f32015d);
        b.g(parcel, 5, this.f32016e);
        b.H(parcel, 6, this.f32017f, false);
        b.F(parcel, 7, this.f32018g, false);
        b.b(parcel, a10);
    }

    public final String zza() {
        return this.f32013b;
    }
}
