package com.vk.sdk.api.messages.dto;

import com.ironsource.Hb;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: MessagesLongpollParamsDto.kt */
/* loaded from: classes5.dex */
public final class MessagesLongpollParamsDto {

    @pmi0("key")
    private final String key;

    @pmi0("pts")
    private final Integer pts;

    @pmi0(Hb.a)
    private final String server;

    @pmi0("ts")
    private final int ts;

    public MessagesLongpollParamsDto(String str, String str2, int i, Integer num) {
        this.server = str;
        this.key = str2;
        this.ts = i;
        this.pts = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesLongpollParamsDto)) {
            return false;
        }
        MessagesLongpollParamsDto messagesLongpollParamsDto = (MessagesLongpollParamsDto) obj;
        return epx.f(this.server, messagesLongpollParamsDto.server) && epx.f(this.key, messagesLongpollParamsDto.key) && this.ts == messagesLongpollParamsDto.ts && epx.f(this.pts, messagesLongpollParamsDto.pts);
    }

    public final int hashCode() {
        int a = shy.a(this.ts, urd0.a(this.server.hashCode() * 31, 31, this.key), 31);
        Integer num = this.pts;
        return a + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String str = this.server;
        String str2 = this.key;
        int i = this.ts;
        Integer num = this.pts;
        StringBuilder a = xe9.a("MessagesLongpollParamsDto(server=", str, ", key=", str2, ", ts=");
        a.append(i);
        a.append(", pts=");
        a.append(num);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ MessagesLongpollParamsDto(String str, String str2, int i, Integer num, int i2, zcl zclVar) {
        this(str, str2, i, (i2 & 8) != 0 ? null : num);
    }
}
