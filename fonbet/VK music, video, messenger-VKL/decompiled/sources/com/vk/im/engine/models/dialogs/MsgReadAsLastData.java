package com.vk.im.engine.models.dialogs;

import java.util.Iterator;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: MsgReadAsLastData.kt */
/* loaded from: classes2.dex */
public final class MsgReadAsLastData {
    public final int a;
    public final int b;
    public final boolean c;
    public final Integer d;
    public final MsgType e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MsgReadAsLastData.kt */
    public static final class MsgType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MsgType[] $VALUES;
        public static final MsgType CHANNEL_POST;
        public static final MsgType CLIP;
        public static final a Companion;
        public static final MsgType WALL_POST;
        private final String stringValue;

        /* compiled from: MsgReadAsLastData.kt */
        public static final class a {
            public static MsgType a(String str) {
                Object obj;
                Iterator<E> it = MsgType.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((MsgType) obj).i(), str)) {
                        break;
                    }
                }
                return (MsgType) obj;
            }
        }

        static {
            MsgType msgType = new MsgType("CLIP", 0, "clip");
            CLIP = msgType;
            MsgType msgType2 = new MsgType("WALL_POST", 1, "w_post");
            WALL_POST = msgType2;
            MsgType msgType3 = new MsgType("CHANNEL_POST", 2, "c_post");
            CHANNEL_POST = msgType3;
            MsgType[] msgTypeArr = {msgType, msgType2, msgType3};
            $VALUES = msgTypeArr;
            $ENTRIES = new asp(msgTypeArr);
            Companion = new a();
        }

        public MsgType(String str, int i, String str2) {
            this.stringValue = str2;
        }

        public static zrp<MsgType> h() {
            return $ENTRIES;
        }

        public static MsgType valueOf(String str) {
            return (MsgType) Enum.valueOf(MsgType.class, str);
        }

        public static MsgType[] values() {
            return (MsgType[]) $VALUES.clone();
        }

        public final String i() {
            return this.stringValue;
        }
    }

    public MsgReadAsLastData(int i, int i2, boolean z, Integer num, MsgType msgType) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = num;
        this.e = msgType;
    }

    public static MsgReadAsLastData a(MsgReadAsLastData msgReadAsLastData) {
        return new MsgReadAsLastData(msgReadAsLastData.a, msgReadAsLastData.b, true, msgReadAsLastData.d, msgReadAsLastData.e);
    }

    public final int b() {
        return this.a;
    }

    public final Integer c() {
        return this.d;
    }

    public final MsgType d() {
        return this.e;
    }

    public final int e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MsgReadAsLastData)) {
            return false;
        }
        MsgReadAsLastData msgReadAsLastData = (MsgReadAsLastData) obj;
        return this.a == msgReadAsLastData.a && this.b == msgReadAsLastData.b && this.c == msgReadAsLastData.c && epx.f(this.d, msgReadAsLastData.d) && this.e == msgReadAsLastData.e;
    }

    public final boolean f() {
        return this.c;
    }

    public final int hashCode() {
        int b = qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Integer num = this.d;
        return this.e.hashCode() + ((b + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "MsgReadAsLastData(cnvMsgId=" + this.a + ", readCount=" + this.b + ", isShowReplyEventSent=" + this.c + ", linkedCnvMsgId=" + this.d + ", msgType=" + this.e + ')';
    }
}
