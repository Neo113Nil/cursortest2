package com.vk.dto.stories.entities.stat;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.shy;

/* compiled from: DrawingStatInfo.kt */
/* loaded from: classes18.dex */
public final class DrawingStatInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<DrawingStatInfo> CREATOR = new a();
    public final int b;
    public final int c;
    public final String d;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<DrawingStatInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DrawingStatInfo a(Serializer serializer) {
            int u = serializer.u();
            int u2 = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            return new DrawingStatInfo(u, u2, H);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DrawingStatInfo[i];
        }
    }

    public DrawingStatInfo(int i, int i2, String str) {
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.S(this.c);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawingStatInfo)) {
            return false;
        }
        DrawingStatInfo drawingStatInfo = (DrawingStatInfo) obj;
        return this.b == drawingStatInfo.b && this.c == drawingStatInfo.c && epx.f(this.d, drawingStatInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DrawingStatInfo(brushId=");
        sb.append(this.b);
        sb.append(", brushSize=");
        sb.append(this.c);
        sb.append(", brushColor=");
        return ho8.a(sb, this.d, ')');
    }
}
