package com.vk.dto.stories.entities.stat;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.urd0;

/* compiled from: TextStatInfo.kt */
/* loaded from: classes18.dex */
public final class TextStatInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<TextStatInfo> CREATOR = new a();
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<TextStatInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final TextStatInfo a(Serializer serializer) {
            String str;
            int i;
            String str2;
            String str3;
            String str4;
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            if (H2 == null) {
                H2 = "";
            }
            int u = serializer.u();
            String H3 = serializer.H();
            if (H3 == null) {
                H3 = "";
            }
            String H4 = serializer.H();
            if (H4 == null) {
                H4 = "";
            }
            String H5 = serializer.H();
            if (H5 == null) {
                String str5 = H4;
                str4 = "";
                str = H2;
                i = u;
                str2 = H3;
                str3 = str5;
            } else {
                str = H2;
                i = u;
                str2 = H3;
                str3 = H4;
                str4 = H5;
            }
            return new TextStatInfo(H, str, i, str2, str3, str4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextStatInfo[i];
        }
    }

    public TextStatInfo(String str, String str2, int i, String str3, String str4, String str5) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
        serializer.j0(this.f);
        serializer.j0(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextStatInfo)) {
            return false;
        }
        TextStatInfo textStatInfo = (TextStatInfo) obj;
        return epx.f(this.b, textStatInfo.b) && epx.f(this.c, textStatInfo.c) && this.d == textStatInfo.d && epx.f(this.e, textStatInfo.e) && epx.f(this.f, textStatInfo.f) && epx.f(this.g, textStatInfo.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + urd0.a(urd0.a(shy.a(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextStatInfo(text=");
        sb.append(this.b);
        sb.append(", fontName=");
        sb.append(this.c);
        sb.append(", fontSize=");
        sb.append(this.d);
        sb.append(", color=");
        sb.append(this.e);
        sb.append(", backgroundStyleName=");
        sb.append(this.f);
        sb.append(", alignmentName=");
        return ho8.a(sb, this.g, ')');
    }
}
