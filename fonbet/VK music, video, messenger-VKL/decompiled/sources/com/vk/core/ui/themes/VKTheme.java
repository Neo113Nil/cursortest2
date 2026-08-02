package com.vk.core.ui.themes;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: VkTheme.kt */
/* loaded from: classes.dex */
public final class VKTheme extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VKTheme> CREATOR = new a();
    public final boolean b;
    public final int c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VKTheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VKTheme a(Serializer serializer) {
            boolean m = serializer.m();
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new VKTheme(m, u, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VKTheme[i];
        }
    }

    public VKTheme(boolean z, int i, String str) {
        this.b = z;
        this.c = i;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.S(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VKTheme)) {
            return false;
        }
        VKTheme vKTheme = (VKTheme) obj;
        return this.b == vKTheme.b && this.c == vKTheme.c && epx.f(this.d, vKTheme.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Boolean.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VKTheme(light=");
        sb.append(this.b);
        sb.append(", themeResId=");
        sb.append(this.c);
        sb.append(", themeName=");
        return ho8.a(sb, this.d, ')');
    }
}
