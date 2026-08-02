package com.vk.dto.badges;

import android.os.Bundle;
import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.uf3;

/* compiled from: BadgeUnlockInfo.kt */
/* loaded from: classes18.dex */
public final class UnlockButton implements Serializer.StreamParcelable {
    public static final Serializer.c<UnlockButton> CREATOR = new a();
    public final String b;
    public final String c;
    public final Bundle d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<UnlockButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final UnlockButton a(Serializer serializer) {
            return new UnlockButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UnlockButton[i];
        }
    }

    public UnlockButton(String str, String str2, Bundle bundle) {
        this.b = str;
        this.c = str2;
        this.d = bundle;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.K(this.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnlockButton)) {
            return false;
        }
        UnlockButton unlockButton = (UnlockButton) obj;
        return epx.f(this.b, unlockButton.b) && epx.f(this.c, unlockButton.c) && epx.f(this.d, unlockButton.d);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Bundle bundle = this.d;
        return hashCode2 + (bundle != null ? bundle.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UnlockButton(title=");
        sb.append(this.b);
        sb.append(", linkUrl=");
        sb.append(this.c);
        sb.append(", linkAwayParams=");
        return uf3.c(sb, this.d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UnlockButton(Serializer serializer) {
        this(r0 == null ? "" : r0, serializer.H(), serializer.o(Bundle.class.getClassLoader()));
        String H = serializer.H();
    }
}
