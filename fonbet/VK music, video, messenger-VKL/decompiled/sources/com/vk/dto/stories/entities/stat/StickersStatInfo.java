package com.vk.dto.stories.entities.stat;

import com.vk.core.serialize.Serializer;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.shy;
import xsna.zcl;

/* compiled from: StickersStatInfo.kt */
/* loaded from: classes18.dex */
public final class StickersStatInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StickersStatInfo> CREATOR = new a();
    public final String b;
    public final long c;
    public final int d;
    public final String e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<StickersStatInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final StickersStatInfo a(Serializer serializer) {
            return new StickersStatInfo(serializer.H(), serializer.w(), serializer.u(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickersStatInfo[i];
        }
    }

    public /* synthetic */ StickersStatInfo(String str, long j, int i, String str2, int i2, zcl zclVar) {
        this(str, j, i, (i2 & 8) != 0 ? null : str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.Y(this.c);
        serializer.S(this.d);
        serializer.j0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersStatInfo)) {
            return false;
        }
        StickersStatInfo stickersStatInfo = (StickersStatInfo) obj;
        return epx.f(this.b, stickersStatInfo.b) && this.c == stickersStatInfo.c && this.d == stickersStatInfo.d && epx.f(this.e, stickersStatInfo.e);
    }

    public final int hashCode() {
        String str = this.b;
        int a2 = shy.a(this.d, bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31);
        String str2 = this.e;
        return a2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersStatInfo(type=");
        sb.append(this.b);
        sb.append(", stickerId=");
        sb.append(this.c);
        sb.append(", stickerPackId=");
        sb.append(this.d);
        sb.append(", style=");
        return ho8.a(sb, this.e, ')');
    }

    public final long zb() {
        return this.c;
    }

    public StickersStatInfo(String str, long j, int i, String str2) {
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = str2;
    }
}
