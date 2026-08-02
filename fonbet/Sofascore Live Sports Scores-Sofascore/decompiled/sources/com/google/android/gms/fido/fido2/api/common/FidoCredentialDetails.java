package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fido.zzgx;
import defpackage.xgo;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@SafeParcelable.Class
/* loaded from: classes3.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new zzy();
    public final String a;
    public final String b;
    public final xgo c;
    public final xgo d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final Account h;
    public final boolean i;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z, boolean z2, long j, Account account, boolean z3) {
        xgo r = bArr == null ? null : zzgx.r(bArr.length, bArr);
        xgo xgoVar = zzgx.b;
        xgo r2 = zzgx.r(bArr2.length, bArr2);
        this.a = str;
        this.b = str2;
        this.c = r;
        this.d = r2;
        this.e = z;
        this.f = z2;
        this.g = j;
        this.h = account;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return Objects.a(this.a, fidoCredentialDetails.a) && Objects.a(this.b, fidoCredentialDetails.b) && Objects.a(this.c, fidoCredentialDetails.c) && Objects.a(this.d, fidoCredentialDetails.d) && this.e == fidoCredentialDetails.e && this.f == fidoCredentialDetails.f && this.i == fidoCredentialDetails.i && this.g == fidoCredentialDetails.g && Objects.a(this.h, fidoCredentialDetails.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), Boolean.valueOf(this.f), Boolean.valueOf(this.i), Long.valueOf(this.g), this.h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int s = SafeParcelWriter.s(parcel, 20293);
        SafeParcelWriter.m(parcel, 1, this.a, false);
        SafeParcelWriter.m(parcel, 2, this.b, false);
        xgo xgoVar = this.c;
        SafeParcelWriter.c(parcel, 3, xgoVar == null ? null : xgoVar.s(), false);
        SafeParcelWriter.c(parcel, 4, this.d.s(), false);
        SafeParcelWriter.r(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        SafeParcelWriter.r(parcel, 6, 4);
        parcel.writeInt(this.f ? 1 : 0);
        SafeParcelWriter.r(parcel, 7, 8);
        parcel.writeLong(this.g);
        SafeParcelWriter.l(parcel, 8, this.h, i, false);
        SafeParcelWriter.r(parcel, 9, 4);
        parcel.writeInt(this.i ? 1 : 0);
        SafeParcelWriter.t(parcel, s);
    }
}
