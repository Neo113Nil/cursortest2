package com.vk.pushes.dto;

import com.vk.core.serialize.Serializer;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.vu5;
import xsna.zcl;

/* compiled from: PushMessage.kt */
/* loaded from: classes5.dex */
public final class PushMessage extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<PushMessage> CREATOR = new a();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final boolean g;
    public final long h;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<PushMessage> {
        @Override // com.vk.core.serialize.Serializer.c
        public final PushMessage a(Serializer serializer) {
            int u = serializer.u();
            String H = serializer.H();
            if (H == null) {
                H = "";
            }
            String H2 = serializer.H();
            return new PushMessage(u, H, H2 != null ? H2 : "", serializer.H(), serializer.w(), serializer.m(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushMessage[i];
        }
    }

    public /* synthetic */ PushMessage(int i, String str, String str2, String str3, long j, boolean z, long j2, int i2, zcl zclVar) {
        this(i, str, str2, str3, j, (i2 & 32) != 0 ? false : z, j2);
    }

    public static PushMessage zb(PushMessage pushMessage, int i, String str, String str2, String str3, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            i = pushMessage.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            str = pushMessage.c;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = pushMessage.d;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            str3 = pushMessage.e;
        }
        String str6 = str3;
        long j = pushMessage.f;
        boolean z2 = (i2 & 32) != 0 ? pushMessage.g : z;
        long j2 = pushMessage.h;
        pushMessage.getClass();
        return new PushMessage(i3, str4, str5, str6, j, z2, j2);
    }

    public final int Ab() {
        return this.b;
    }

    public final boolean Bb() {
        return this.g;
    }

    public final String Cb() {
        return this.c;
    }

    public final long Db() {
        return this.h;
    }

    public final long Eb() {
        return this.f;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.S(this.b);
        serializer.j0(this.c);
        serializer.j0(this.d);
        serializer.j0(this.e);
        serializer.Y(this.f);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.Y(this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PushMessage)) {
            return false;
        }
        PushMessage pushMessage = (PushMessage) obj;
        return this.b == pushMessage.b && epx.f(this.c, pushMessage.c) && epx.f(this.d, pushMessage.d) && epx.f(this.e, pushMessage.e) && this.f == pushMessage.f && this.g == pushMessage.g && this.h == pushMessage.h;
    }

    public final String getMessage() {
        return this.d;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.d);
        String str = this.e;
        return Long.hashCode(this.h) + qoy.b(bh10.a((a2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PushMessage(cmid=");
        sb.append(this.b);
        sb.append(", sender=");
        sb.append(this.c);
        sb.append(", message=");
        sb.append(this.d);
        sb.append(", imageUrl=");
        sb.append(this.e);
        sb.append(", timeMs=");
        sb.append(this.f);
        sb.append(", removedFromNotifyPanel=");
        sb.append(this.g);
        sb.append(", senderPeerDialogId=");
        return vu5.a(')', this.h, sb);
    }

    public PushMessage(int i, String str, String str2, String str3, long j, boolean z, long j2) {
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = z;
        this.h = j2;
    }
}
