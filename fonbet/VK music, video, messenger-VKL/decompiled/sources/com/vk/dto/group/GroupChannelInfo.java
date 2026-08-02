package com.vk.dto.group;

import com.vk.core.serialize.Serializer;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;

/* compiled from: GroupChannelInfo.kt */
/* loaded from: classes18.dex */
public final class GroupChannelInfo extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<GroupChannelInfo> CREATOR = new b();
    public final boolean b;
    public final boolean c;
    public final String d;

    /* compiled from: GroupChannelInfo.kt */
    public static final class a {
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<GroupChannelInfo> {
        @Override // com.vk.core.serialize.Serializer.c
        public final GroupChannelInfo a(Serializer serializer) {
            boolean m = serializer.m();
            boolean m2 = serializer.m();
            String I = serializer.I();
            if (I == null) {
                I = "";
            }
            return new GroupChannelInfo(m, m2, I);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new GroupChannelInfo[i];
        }
    }

    public GroupChannelInfo(boolean z, boolean z2, String str) {
        this.b = z;
        this.c = z2;
        this.d = str;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.j0(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupChannelInfo)) {
            return false;
        }
        GroupChannelInfo groupChannelInfo = (GroupChannelInfo) obj;
        return this.b == groupChannelInfo.b && this.c == groupChannelInfo.c && epx.f(this.d, groupChannelInfo.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(Boolean.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupChannelInfo(canPost=");
        sb.append(this.b);
        sb.append(", hasPosts=");
        sb.append(this.c);
        sb.append(", channelUrl=");
        return ho8.a(sb, this.d, ')');
    }
}
