package com.vk.auth.passkey;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: PasskeyCheckInfo.kt */
/* loaded from: classes15.dex */
public final class PasskeyCheckInfo implements Parcelable {
    public static final Parcelable.Creator<PasskeyCheckInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final PasskeyAlternative d;
    public final PasskeyWebAuthScreen e;
    public final boolean f;
    public final boolean g;

    /* compiled from: PasskeyCheckInfo.kt */
    public static final class a implements Parcelable.Creator<PasskeyCheckInfo> {
        @Override // android.os.Parcelable.Creator
        public final PasskeyCheckInfo createFromParcel(Parcel parcel) {
            return new PasskeyCheckInfo(parcel.readString(), parcel.readString(), PasskeyAlternative.CREATOR.createFromParcel(parcel), PasskeyWebAuthScreen.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PasskeyCheckInfo[] newArray(int i) {
            return new PasskeyCheckInfo[i];
        }
    }

    public PasskeyCheckInfo(String str, String str2, PasskeyAlternative passkeyAlternative, PasskeyWebAuthScreen passkeyWebAuthScreen, boolean z, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = passkeyAlternative;
        this.e = passkeyWebAuthScreen;
        this.f = z;
        this.g = z2;
    }

    public final PasskeyAlternative d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PasskeyCheckInfo)) {
            return false;
        }
        PasskeyCheckInfo passkeyCheckInfo = (PasskeyCheckInfo) obj;
        return epx.f(this.b, passkeyCheckInfo.b) && epx.f(this.c, passkeyCheckInfo.c) && this.d == passkeyCheckInfo.d && this.e == passkeyCheckInfo.e && this.f == passkeyCheckInfo.f && this.g == passkeyCheckInfo.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b((this.e.hashCode() + ((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PasskeyCheckInfo(login=");
        sb.append(this.b);
        sb.append(", sid=");
        sb.append(this.c);
        sb.append(", alternative=");
        sb.append(this.d);
        sb.append(", passkeyWebScreen=");
        sb.append(this.e);
        sb.append(", isLoginPhone=");
        sb.append(this.f);
        sb.append(", afterPhoneReuse=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e.name());
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public /* synthetic */ PasskeyCheckInfo(String str, String str2, PasskeyAlternative passkeyAlternative, PasskeyWebAuthScreen passkeyWebAuthScreen, boolean z, boolean z2, int i, zcl zclVar) {
        this(str, str2, passkeyAlternative, passkeyWebAuthScreen, z, (i & 32) != 0 ? false : z2);
    }
}
