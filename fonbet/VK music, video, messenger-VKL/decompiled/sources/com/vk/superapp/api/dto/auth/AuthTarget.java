package com.vk.superapp.api.dto.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.sdk.auth.AccountProfileType;
import defpackage.q0;
import xsna.qoy;

/* compiled from: AuthTarget.kt */
/* loaded from: classes11.dex */
public final class AuthTarget implements Parcelable {
    public static final Parcelable.Creator<AuthTarget> CREATOR = new a();
    public final AccountProfileType b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* compiled from: AuthTarget.kt */
    public static final class a implements Parcelable.Creator<AuthTarget> {
        @Override // android.os.Parcelable.Creator
        public final AuthTarget createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            AccountProfileType valueOf = AccountProfileType.valueOf(parcel.readString());
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            if (parcel.readInt() != 0) {
                z = z2;
            }
            return new AuthTarget(valueOf, z5, z3, z4, z);
        }

        @Override // android.os.Parcelable.Creator
        public final AuthTarget[] newArray(int i) {
            return new AuthTarget[i];
        }
    }

    public AuthTarget() {
        this(null, false, false, false, false, 31, null);
    }

    public static AuthTarget a(AuthTarget authTarget, AccountProfileType accountProfileType, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            accountProfileType = authTarget.b;
        }
        AccountProfileType accountProfileType2 = accountProfileType;
        if ((i & 2) != 0) {
            z = authTarget.c;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = authTarget.d;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = authTarget.e;
        }
        boolean z6 = authTarget.f;
        authTarget.getClass();
        return new AuthTarget(accountProfileType2, z4, z5, z3, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthTarget)) {
            return false;
        }
        AuthTarget authTarget = (AuthTarget) obj;
        return this.b == authTarget.b && this.c == authTarget.c && this.d == authTarget.d && this.e == authTarget.e && this.f == authTarget.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + qoy.b(qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AuthTarget(accountProfileType=");
        sb.append(this.b);
        sb.append(", isDirectLogin=");
        sb.append(this.c);
        sb.append(", isExchangeLogin=");
        sb.append(this.d);
        sb.append(", isRestoreLogin=");
        sb.append(this.e);
        sb.append(", isSilentAuthByLogin=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public AuthTarget(AccountProfileType accountProfileType, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = accountProfileType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AuthTarget(com.vk.api.sdk.auth.AccountProfileType r2, boolean r3, boolean r4, boolean r5, boolean r6, int r7, xsna.zcl r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            com.vk.api.sdk.auth.AccountProfileType r2 = com.vk.api.sdk.auth.AccountProfileType.NORMAL
        L6:
            r8 = r7 & 2
            r0 = 0
            if (r8 == 0) goto Lc
            r3 = r0
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = r0
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L16
            r5 = r0
        L16:
            r7 = r7 & 16
            if (r7 == 0) goto L21
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L27
        L21:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L27:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.superapp.api.dto.auth.AuthTarget.<init>(com.vk.api.sdk.auth.AccountProfileType, boolean, boolean, boolean, boolean, int, xsna.zcl):void");
    }
}
