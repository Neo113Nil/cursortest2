package io.invertase.firebase.messaging;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.ViewProps;
import com.google.firebase.messaging.RemoteMessage;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class u {
    public static Lg.b a(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        createMap.putMap("error", Lg.m.b(exc));
        return new Lg.b("messaging_message_send_error", createMap);
    }

    public static Lg.b b(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        return new Lg.b("messaging_message_sent", createMap);
    }

    public static Lg.b c() {
        return new Lg.b("messaging_message_deleted", Arguments.createMap());
    }

    public static Lg.b d(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("token", str);
        return new Lg.b("messaging_token_refresh", createMap);
    }

    public static RemoteMessage e(ReadableMap readableMap) {
        RemoteMessage.b bVar = new RemoteMessage.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.f(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.d(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.e(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.c(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey(EventKeys.DATA)) {
            ReadableMap map = readableMap.getMap(EventKeys.DATA);
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                bVar.a(nextKey, map.getString(nextKey));
            }
        }
        return bVar.b();
    }

    public static Lg.b f(WritableMap writableMap, Boolean bool) {
        return new Lg.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", writableMap);
    }

    public static WritableMap g(RemoteMessage.c cVar) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (cVar.o() != null) {
            createMap.putString("title", cVar.o());
        }
        if (cVar.q() != null) {
            createMap.putString("titleLocKey", cVar.q());
        }
        if (cVar.p() != null) {
            createMap.putArray("titleLocArgs", Arguments.fromJavaArgs((Object[]) cVar.p()));
        }
        if (cVar.a() != null) {
            createMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            createMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            createMap.putArray("bodyLocArgs", Arguments.fromJavaArgs((Object[]) cVar.b()));
        }
        if (cVar.d() != null) {
            createMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            createMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            createMap2.putString(ViewProps.COLOR, cVar.f());
        }
        if (cVar.g() != null) {
            createMap2.putString("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            createMap2.putString("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            createMap2.putString("link", cVar.i().toString());
        }
        if (cVar.k() != null) {
            createMap2.putInt("count", cVar.k().intValue());
        }
        if (cVar.l() != null) {
            createMap2.putInt(EventKeys.PRIORITY, cVar.l().intValue());
        }
        if (cVar.m() != null) {
            createMap2.putString("sound", cVar.m());
        }
        if (cVar.n() != null) {
            createMap2.putString("ticker", cVar.n());
        }
        if (cVar.r() != null) {
            createMap2.putInt("visibility", cVar.r().intValue());
        }
        createMap.putMap(Constants.PLATFORM_ANDROID, createMap2);
        return createMap;
    }

    public static Lg.b h(RemoteMessage remoteMessage, Boolean bool) {
        return new Lg.b(bool.booleanValue() ? "messaging_notification_opened" : "messaging_message_received", i(remoteMessage));
    }

    public static WritableMap i(RemoteMessage remoteMessage) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (remoteMessage.g() != null) {
            createMap.putString("collapseKey", remoteMessage.g());
        }
        if (remoteMessage.i() != null) {
            createMap.putString("from", remoteMessage.i());
        }
        if (remoteMessage.Z() != null) {
            createMap.putString("to", remoteMessage.Z());
        }
        if (remoteMessage.j() != null) {
            createMap.putString("messageId", remoteMessage.j());
        }
        if (remoteMessage.l() != null) {
            createMap.putString("messageType", remoteMessage.l());
        }
        if (remoteMessage.h().size() > 0) {
            for (Map.Entry entry : remoteMessage.h().entrySet()) {
                createMap2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        createMap.putMap(EventKeys.DATA, createMap2);
        createMap.putDouble("ttl", remoteMessage.a0());
        createMap.putDouble("sentTime", remoteMessage.Y());
        createMap.putInt(EventKeys.PRIORITY, remoteMessage.O());
        createMap.putInt("originalPriority", remoteMessage.N());
        if (remoteMessage.m() != null) {
            createMap.putMap("notification", g(remoteMessage.m()));
        }
        return createMap;
    }
}
