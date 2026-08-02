package com.google.android.gms.fido.fido2.api.common;

import R9.D;
import R9.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.AbstractC3189m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;

/* loaded from: classes2.dex */
public class AuthenticatorSelectionCriteria extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<AuthenticatorSelectionCriteria> CREATOR = new D();

    /* renamed from: a, reason: collision with root package name */
    public final Attachment f32894a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f32895b;

    /* renamed from: c, reason: collision with root package name */
    public final zzay f32896c;

    /* renamed from: d, reason: collision with root package name */
    public final ResidentKeyRequirement f32897d;

    public AuthenticatorSelectionCriteria(String str, Boolean bool, String str2, String str3) {
        Attachment a10;
        ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = Attachment.a(str);
            } catch (s | Attachment.a | ResidentKeyRequirement.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        this.f32894a = a10;
        this.f32895b = bool;
        this.f32896c = str2 == null ? null : zzay.a(str2);
        if (str3 != null) {
            residentKeyRequirement = ResidentKeyRequirement.a(str3);
        }
        this.f32897d = residentKeyRequirement;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorSelectionCriteria)) {
            return false;
        }
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) obj;
        return AbstractC3189m.b(this.f32894a, authenticatorSelectionCriteria.f32894a) && AbstractC3189m.b(this.f32895b, authenticatorSelectionCriteria.f32895b) && AbstractC3189m.b(this.f32896c, authenticatorSelectionCriteria.f32896c) && AbstractC3189m.b(i(), authenticatorSelectionCriteria.i());
    }

    public String g() {
        Attachment attachment = this.f32894a;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public Boolean h() {
        return this.f32895b;
    }

    public int hashCode() {
        return AbstractC3189m.c(this.f32894a, this.f32895b, this.f32896c, i());
    }

    public ResidentKeyRequirement i() {
        ResidentKeyRequirement residentKeyRequirement = this.f32897d;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        Boolean bool = this.f32895b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public String j() {
        if (i() == null) {
            return null;
        }
        return i().toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = E9.b.a(parcel);
        E9.b.F(parcel, 2, g(), false);
        E9.b.i(parcel, 3, h(), false);
        zzay zzayVar = this.f32896c;
        E9.b.F(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        E9.b.F(parcel, 5, j(), false);
        E9.b.b(parcel, a10);
    }
}
