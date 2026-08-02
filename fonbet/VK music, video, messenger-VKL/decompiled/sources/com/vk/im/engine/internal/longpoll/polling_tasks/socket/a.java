package com.vk.im.engine.internal.longpoll.polling_tasks.socket;

import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.im.engine.internal.longpoll.polling_tasks.socket.ChannelMasterServiceReporter;
import com.vk.im.engine.internal.longpoll.polling_tasks.socket.SocketError;
import com.vk.im.engine.internal.longpoll.response_handler.a;
import com.vk.im.engine.internal.longpoll.response_handler.c;
import com.vk.log.L;
import com.vk.metrics.eventtracking.b;
import com.vk.metrics.trackers.CriticalException;
import com.vk.network.eventhub.api.Message;
import com.vk.network.eventhub.api.MessageErrorHandler$ExpireStrategy;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.a500;
import xsna.a94;
import xsna.bpn0;
import xsna.chb;
import xsna.dhb;
import xsna.epx;
import xsna.laq;
import xsna.lh;
import xsna.nd1;
import xsna.nya;
import xsna.ozp;
import xsna.w2w;
import xsna.x3i;

/* compiled from: ChannelEventHubMessageHandler.kt */
/* loaded from: classes2.dex */
public final class a extends ozp {
    public final w2w a;
    public final x3i b;
    public final nya c;
    public final laq d;
    public final c g;
    public final byte e = 1;
    public final dhb f = new dhb();
    public final bpn0 h = new bpn0(new nd1(4));

    /* compiled from: ChannelEventHubMessageHandler.kt */
    /* renamed from: com.vk.im.engine.internal.longpoll.polling_tasks.socket.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1116a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocketError.values().length];
            try {
                iArr[SocketError.INTERNAL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocketError.UNEXPECTED_DATA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SocketError.OFFSET_IS_TOO_OLD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SocketError.FLOOD_CONTROL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(w2w w2wVar, x3i x3iVar, nya nyaVar, a500.a aVar, laq laqVar) {
        this.a = w2wVar;
        this.b = x3iVar;
        this.c = nyaVar;
        this.d = laqVar;
        this.g = new c(w2wVar, aVar, nyaVar);
    }

    public static String e(JSONObject jSONObject) {
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("channel");
        String optString2 = optJSONObject != null ? optJSONObject.optString("label") : null;
        if (optJSONObject == null || (optString = optJSONObject.optString("queue")) == null || !epx.f(optString2, "big_channel")) {
            return null;
        }
        return optString;
    }

    @Override // xsna.ozp
    public final byte a() {
        return this.e;
    }

    @Override // xsna.ozp
    public final boolean b(Message message) {
        Object obj;
        MessageErrorHandler$ExpireStrategy bVar;
        JSONObject a = message.a();
        JSONObject optJSONObject = a.optJSONObject("error");
        if (optJSONObject == null) {
            JSONObject optJSONObject2 = a.optJSONObject("result");
            if (optJSONObject2 == null) {
                return false;
            }
            laq laqVar = this.d;
            if (laqVar != null) {
                laqVar.c();
            }
            if (optJSONObject2.has("success")) {
                this.b.invoke();
                return true;
            }
            String e = e(a);
            this.f.getClass();
            try {
                chb b = dhb.b(optJSONObject2);
                long j = b.a;
                Long l = b.b;
                this.g.a(b.c, new a.b(e, l, j), "TaskSocketLiveImplEventHub");
                if (e == null) {
                    this.a.I0().u(new lh(7, optJSONObject2, this));
                }
                return true;
            } catch (JSONException e2) {
                throw new VKApiIllegalResponseException(e2);
            }
        }
        SocketError.a aVar = SocketError.Companion;
        int optInt = optJSONObject.optInt("code");
        aVar.getClass();
        Iterator<E> it = SocketError.i().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((SocketError) obj).h() == optInt) {
                break;
            }
        }
        SocketError socketError = (SocketError) obj;
        if (socketError == null) {
            socketError = SocketError.UNKNOWN;
        }
        int i = C1116a.$EnumSwitchMapping$0[socketError.ordinal()];
        nya nyaVar = this.c;
        if (i == 1) {
            ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.INTERNAL_ERROR, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
            nyaVar.b(optJSONObject.optString("message"));
            return true;
        }
        if (i == 2) {
            ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.UNEXPECTED_DATA, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
            nyaVar.a(MessageErrorHandler$ExpireStrategy.a.a, "UNEXPECTED_DATA");
            return true;
        }
        if (i == 3) {
            String e3 = e(a);
            long j2 = optJSONObject.getJSONObject("data").getLong("new offset");
            if (e3 == null) {
                ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.OFFSET_TOO_OLD_USER, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
                bVar = new MessageErrorHandler$ExpireStrategy.c(j2);
            } else {
                ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.OFFSET_TOO_OLD_CHANNEL, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
                bVar = new MessageErrorHandler$ExpireStrategy.b(e3, j2);
            }
            nyaVar.a(bVar, "OFFSET_IS_TOO_OLD");
            return true;
        }
        if (i == 4) {
            ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.FLOOD_CONTROL, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
            nyaVar.b(optJSONObject.optString("message"));
            return true;
        }
        ChannelMasterServiceReporter.b.a(ChannelMasterServiceReporter.ErrorReason.UNKNOWN, ChannelMasterServiceReporter.ErrorSource.WEBSOCKET);
        String jSONObject = optJSONObject.toString();
        nyaVar.getClass();
        b.a.a(new CriticalException("Unknown error: ".concat(jSONObject)));
        nyaVar.a.b();
        return true;
    }

    @Override // xsna.ozp
    public final void c(IllegalArgumentException illegalArgumentException) {
        b.a.a(illegalArgumentException);
    }

    @Override // xsna.ozp
    public final void d(Message message) {
        L.c("ChannelEventHubMessageHandler", new a94(3, message, this));
    }
}
