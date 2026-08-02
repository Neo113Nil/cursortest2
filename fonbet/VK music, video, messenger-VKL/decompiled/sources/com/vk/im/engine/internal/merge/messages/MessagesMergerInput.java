package com.vk.im.engine.internal.merge.messages;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: ServerMessagesToCacheMerger.kt */
/* loaded from: classes2.dex */
public final class MessagesMergerInput {
    public final Peer a;
    public final int b;
    public final List<Msg> c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;
    public final Boolean g;
    public final MsgSource h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ServerMessagesToCacheMerger.kt */
    public static final class MsgSource {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MsgSource[] $VALUES;
        public static final MsgSource API;
        public static final MsgSource WEBSOCKET;

        static {
            MsgSource msgSource = new MsgSource("WEBSOCKET", 0);
            WEBSOCKET = msgSource;
            MsgSource msgSource2 = new MsgSource("API", 1);
            API = msgSource2;
            MsgSource[] msgSourceArr = {msgSource, msgSource2};
            $VALUES = msgSourceArr;
            $ENTRIES = new asp(msgSourceArr);
        }

        public MsgSource() {
            throw null;
        }

        public static MsgSource valueOf(String str) {
            return (MsgSource) Enum.valueOf(MsgSource.class, str);
        }

        public static MsgSource[] values() {
            return (MsgSource[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesMergerInput(Peer peer, int i, List<? extends Msg> list, boolean z, boolean z2, Boolean bool, Boolean bool2, MsgSource msgSource) {
        this.a = peer;
        this.b = i;
        this.c = list;
        this.d = z;
        this.e = z2;
        this.f = bool;
        this.g = bool2;
        this.h = msgSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMergerInput)) {
            return false;
        }
        MessagesMergerInput messagesMergerInput = (MessagesMergerInput) obj;
        return epx.f(this.a, messagesMergerInput.a) && this.b == messagesMergerInput.b && epx.f(this.c, messagesMergerInput.c) && this.d == messagesMergerInput.d && this.e == messagesMergerInput.e && epx.f(this.f, messagesMergerInput.f) && epx.f(this.g, messagesMergerInput.g) && this.h == messagesMergerInput.h;
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(fw3.a(shy.a(this.b, Long.hashCode(this.a.b) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
        Boolean bool = this.f;
        int hashCode = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.g;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MsgSource msgSource = this.h;
        return hashCode2 + (msgSource != null ? msgSource.hashCode() : 0);
    }

    public final String toString() {
        return "peer=" + this.a + " anchorCnvMsgId=" + this.b + " msgList=" + this.c.size() + " msgSource=" + this.h + " forceTrimHistoryBefore=" + this.d + " forceTrimHistoryAfter=" + this.e + " forceHasSpaceBefore=" + this.f + " forceHasSpaceAfter=" + this.g;
    }
}
