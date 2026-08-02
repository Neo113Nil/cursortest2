package com.vk.im.engine.internal.longpoll.response_handler;

import com.vk.im.engine.internal.longpoll.polling_tasks.socket.ChannelMasterServiceReporter;
import com.vk.im.engine.internal.longpoll.response_handler.a;
import com.vk.network.eventhub.api.MessageErrorHandler$ExpireStrategy;
import xsna.a500;
import xsna.nya;
import xsna.q500;
import xsna.swe0;
import xsna.w2w;

/* compiled from: NewChannelsLongPollLiveEventsHandlerEventHub.kt */
/* loaded from: classes2.dex */
public final class c extends LongPollLiveEventsHandlerImpl {
    public final w2w c;
    public final nya d;

    public c(w2w w2wVar, a500.a aVar, nya nyaVar) {
        super(w2wVar, aVar);
        this.c = w2wVar;
        this.d = nyaVar;
    }

    @Override // com.vk.im.engine.internal.longpoll.response_handler.LongPollLiveEventsHandlerImpl
    public final boolean b(a aVar) {
        if ((aVar instanceof a.b ? (a.b) aVar : null) == null) {
            throw new IllegalStateException("Unexpected update " + aVar);
        }
        a.b bVar = (a.b) aVar;
        Long l = bVar.c;
        long j = bVar.b;
        String str = bVar.a;
        nya nyaVar = this.d;
        w2w w2wVar = this.c;
        if (str != null) {
            if (l == null) {
                return true;
            }
            Long h = w2wVar.I0().system().h(str);
            if (l.equals(h)) {
                return true;
            }
            ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.OLD_TS_MISMATCH_CHANNEL, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
            nyaVar.a(new MessageErrorHandler$ExpireStrategy.b(str, j), "old channel " + str + " ts " + l + " doesn't match stored one " + h);
            return false;
        }
        if (l == null) {
            return true;
        }
        Long p = w2wVar.I0().system().p();
        q500 r = swe0.r(l.longValue(), j);
        if (p != null && r.f(p.longValue())) {
            return true;
        }
        ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.OLD_TS_MISMATCH_USER, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
        nyaVar.a(new MessageErrorHandler$ExpireStrategy.c(j), "old ts " + l + " doesn't match stored one (" + p + ')');
        return false;
    }

    @Override // com.vk.im.engine.internal.longpoll.response_handler.LongPollLiveEventsHandlerImpl
    public final void d(a aVar) {
        if ((aVar instanceof a.b ? (a.b) aVar : null) == null) {
            throw new IllegalStateException("Unexpected update " + aVar);
        }
        a.b bVar = (a.b) aVar;
        long j = bVar.b;
        String str = bVar.a;
        w2w w2wVar = this.c;
        if (str == null) {
            w2wVar.I0().system().l(j);
        } else {
            w2wVar.I0().system().o(j, str);
        }
    }
}
