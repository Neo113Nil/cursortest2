package com.vk.im.engine.models.channels;

import com.vk.core.serialize.Serializer;
import xsna.vu5;
import xsna.zcl;

/* compiled from: ChannelNotificationsSettings.kt */
/* loaded from: classes2.dex */
public final class ChannelNotificationsSettings extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<ChannelNotificationsSettings> CREATOR = new a();
    public final boolean b;
    public final long c;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<ChannelNotificationsSettings> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ChannelNotificationsSettings a(Serializer serializer) {
            return new ChannelNotificationsSettings(serializer, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChannelNotificationsSettings[i];
        }
    }

    public ChannelNotificationsSettings() {
        this(false, 0L, 3, null);
    }

    public final boolean Ab() {
        return this.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.L(this.b ? (byte) 1 : (byte) 0);
        serializer.Y(this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChannelNotificationsSettings)) {
            return false;
        }
        ChannelNotificationsSettings channelNotificationsSettings = (ChannelNotificationsSettings) obj;
        return this.b == channelNotificationsSettings.b && this.c == channelNotificationsSettings.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChannelNotificationsSettings(isEnabled=");
        sb.append(this.b);
        sb.append(", disableDuration=");
        return vu5.a(')', this.c, sb);
    }

    public final long zb() {
        return this.c;
    }

    public /* synthetic */ ChannelNotificationsSettings(boolean z, long j, int i, zcl zclVar) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? 0L : j);
    }

    public ChannelNotificationsSettings(boolean z, long j) {
        this.b = z;
        this.c = j;
    }

    public ChannelNotificationsSettings(Serializer serializer, zcl zclVar) {
        this(serializer.m(), serializer.w());
    }
}
