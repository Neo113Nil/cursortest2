package com.vk.dto.user;

import com.vk.core.serialize.Serializer;
import com.vk.dto.user.Platform;
import xsna.p3v0;
import xsna.qoy;
import xsna.shy;
import xsna.zcl;

/* compiled from: OnlineInfo.kt */
/* loaded from: classes18.dex */
public final class VisibleStatus extends OnlineInfo {
    public static final Serializer.c<VisibleStatus> CREATOR = new a();
    public static final VisibleStatus f = new VisibleStatus(0, false, 0, null, 15, null);
    public final long b;
    public final boolean c;
    public final int d;
    public final Platform e;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VisibleStatus> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VisibleStatus a(Serializer serializer) {
            return new VisibleStatus(serializer, null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VisibleStatus[i];
        }
    }

    public VisibleStatus() {
        this(0L, false, 0, null, 15, null);
    }

    public final boolean Cb() {
        return p3v0.a.contains(Integer.valueOf(this.d));
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.Y(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
        serializer.S(this.d);
        serializer.S(this.e.h());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleStatus)) {
            return false;
        }
        VisibleStatus visibleStatus = (VisibleStatus) obj;
        return this.b == visibleStatus.b && this.c == visibleStatus.c && this.d == visibleStatus.d && this.e == visibleStatus.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + shy.a(this.d, qoy.b(Long.hashCode(this.b) * 31, 31, this.c), 31);
    }

    public final String toString() {
        return "VisibleStatus(lastSeenMs=" + this.b + ", isOnline=" + this.c + ", lastSeenAppId=" + this.d + ", platform=" + this.e + ')';
    }

    public /* synthetic */ VisibleStatus(long j, boolean z, int i, Platform platform, int i2, zcl zclVar) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? Platform.WEB : platform);
    }

    public VisibleStatus(long j, boolean z, int i, Platform platform) {
        super(null);
        this.b = j;
        this.c = z;
        this.d = i;
        this.e = platform;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VisibleStatus(Serializer serializer, zcl zclVar) {
        this(r1, r3, r4, r6 == null ? Platform.NONE : r6);
        Platform platform;
        long w = serializer.w();
        boolean m = serializer.m();
        int u = serializer.u();
        Platform.a aVar = Platform.Companion;
        int u2 = serializer.u();
        aVar.getClass();
        Platform[] values = Platform.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                platform = null;
                break;
            }
            platform = values[i];
            if (platform.h() == u2) {
                break;
            } else {
                i++;
            }
        }
    }
}
