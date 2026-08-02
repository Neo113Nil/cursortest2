package com.vk.core.fragments.internal.data;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.urd0;
import xsna.vu5;

/* compiled from: LaunchForResultInfo.kt */
/* loaded from: classes17.dex */
public final class LaunchForResultInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<LaunchForResultInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final int d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<LaunchForResultInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final LaunchForResultInfo a(Serializer serializer) {
            return new LaunchForResultInfo(serializer.H(), serializer.H(), serializer.u());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LaunchForResultInfo[i];
        }
    }

    public LaunchForResultInfo(String str, String str2, int i) {
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final String Ab() {
        return this.c;
    }

    public final int Bb() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LaunchForResultInfo)) {
            return false;
        }
        LaunchForResultInfo launchForResultInfo = (LaunchForResultInfo) obj;
        return epx.f(this.b, launchForResultInfo.b) && epx.f(this.c, launchForResultInfo.c) && this.d == launchForResultInfo.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LaunchForResultInfo(idFrom=");
        sb.append(this.b);
        sb.append(", idTo=");
        sb.append(this.c);
        sb.append(", reqCode=");
        return vu5.b(sb, this.d, ')');
    }

    public final String zb() {
        return this.b;
    }
}
