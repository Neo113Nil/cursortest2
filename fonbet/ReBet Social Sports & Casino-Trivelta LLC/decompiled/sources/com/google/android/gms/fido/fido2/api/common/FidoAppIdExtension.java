package com.google.android.gms.fido.fido2.api.common;

import R9.J;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes2.dex */
public class FidoAppIdExtension extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoAppIdExtension> CREATOR = new J();

    /* renamed from: a, reason: collision with root package name */
    public final String f32916a;

    public FidoAppIdExtension(String str) {
        this.f32916a = (String) AbstractC3191o.m(str);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FidoAppIdExtension) {
            return this.f32916a.equals(((FidoAppIdExtension) obj).f32916a);
        }
        return false;
    }

    public String g() {
        return this.f32916a;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32916a);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, g(), false);
        E9.b.b(parcel, a10);
    }
}
