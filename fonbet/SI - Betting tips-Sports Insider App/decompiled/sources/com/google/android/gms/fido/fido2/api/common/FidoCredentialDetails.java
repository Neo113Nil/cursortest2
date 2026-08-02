package com.google.android.gms.fido.fido2.api.common;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import g6.v;
import h8.b;
import java.util.Arrays;
import k7.r0;
import y6.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FidoCredentialDetails extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<FidoCredentialDetails> CREATOR = new n(2);

    /* renamed from: a, reason: collision with root package name */
    public final String f4699a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4700b;

    /* renamed from: c, reason: collision with root package name */
    public final r0 f4701c;

    /* renamed from: d, reason: collision with root package name */
    public final r0 f4702d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4703e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f4704f;

    /* renamed from: g, reason: collision with root package name */
    public final long f4705g;

    /* renamed from: h, reason: collision with root package name */
    public final Account f4706h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4707i;

    public FidoCredentialDetails(String str, String str2, byte[] bArr, byte[] bArr2, boolean z5, boolean z7, long j, Account account, boolean z10) {
        r0 h10 = bArr == null ? null : r0.h(bArr.length, bArr);
        r0 r0Var = r0.f18913c;
        r0 h11 = r0.h(bArr2.length, bArr2);
        this.f4699a = str;
        this.f4700b = str2;
        this.f4701c = h10;
        this.f4702d = h11;
        this.f4703e = z5;
        this.f4704f = z7;
        this.f4705g = j;
        this.f4706h = account;
        this.f4707i = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FidoCredentialDetails)) {
            return false;
        }
        FidoCredentialDetails fidoCredentialDetails = (FidoCredentialDetails) obj;
        return v.k(this.f4699a, fidoCredentialDetails.f4699a) && v.k(this.f4700b, fidoCredentialDetails.f4700b) && v.k(this.f4701c, fidoCredentialDetails.f4701c) && v.k(this.f4702d, fidoCredentialDetails.f4702d) && this.f4703e == fidoCredentialDetails.f4703e && this.f4704f == fidoCredentialDetails.f4704f && this.f4707i == fidoCredentialDetails.f4707i && this.f4705g == fidoCredentialDetails.f4705g && v.k(this.f4706h, fidoCredentialDetails.f4706h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4699a, this.f4700b, this.f4701c, this.f4702d, Boolean.valueOf(this.f4703e), Boolean.valueOf(this.f4704f), Boolean.valueOf(this.f4707i), Long.valueOf(this.f4705g), this.f4706h});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i5) {
        int V = b.V(parcel, 20293);
        b.O(parcel, 1, this.f4699a, false);
        b.O(parcel, 2, this.f4700b, false);
        r0 r0Var = this.f4701c;
        b.G(parcel, 3, r0Var == null ? null : r0Var.i(), false);
        b.G(parcel, 4, this.f4702d.i(), false);
        b.U(parcel, 5, 4);
        parcel.writeInt(this.f4703e ? 1 : 0);
        b.U(parcel, 6, 4);
        parcel.writeInt(this.f4704f ? 1 : 0);
        b.U(parcel, 7, 8);
        parcel.writeLong(this.f4705g);
        b.N(parcel, 8, this.f4706h, i5, false);
        b.U(parcel, 9, 4);
        parcel.writeInt(this.f4707i ? 1 : 0);
        b.W(parcel, V);
    }
}
