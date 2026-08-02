package com.vk.pushes.msg;

import com.vk.dto.common.Source;
import com.vk.dto.common.b;
import com.vk.dto.messages.MsgIdType;
import com.vk.movika.sdk.base.observable.u;
import java.util.Collections;
import xsna.a1w;
import xsna.hfb;
import xsna.o2b;
import xsna.p60;
import xsna.pya;
import xsna.t140;
import xsna.vdg0;
import xsna.yeb;

/* compiled from: ChannelMsgPushInfoLoader.kt */
/* loaded from: classes.dex */
public final class ChannelMsgPushInfoLoader {
    public final Source a;
    public final a1w b;

    /* compiled from: ChannelMsgPushInfoLoader.kt */
    /* loaded from: classes5.dex */
    public static final class ChannelMessagePushLoaderException extends Exception {
        public ChannelMessagePushLoaderException(String str) {
            super(str);
        }
    }

    public ChannelMsgPushInfoLoader(Source source, a1w a1wVar) {
        this.a = source;
        this.b = a1wVar;
    }

    public final pya a(long j) {
        return ((yeb) vdg0.a(this.b.n(this, new hfb(Collections.singletonList(b.e(j)), this.a)), new p60(13))).a(j);
    }

    public final t140 b(long j, int i, MsgIdType msgIdType) {
        return (t140) vdg0.a(this.b.n(this, new o2b(j, Collections.singletonList(Integer.valueOf(i)), msgIdType, this.a, true, false, "ChannelMsgPushInfoLoader")), new u(9));
    }
}
