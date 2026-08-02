package defpackage;

import android.net.Uri;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgChannel;
import com.google.ads.interactivemedia.v3.impl.JavaScriptMessage$MsgType;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgDataWebViewCompat;
import com.google.ads.interactivemedia.v3.impl.data.RequestLoadedAssetData;
import com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration;
import com.google.ads.interactivemedia.v3.impl.data.UiElementImpl;
import com.google.ads.interactivemedia.v3.impl.data.WebViewInitData;
import com.ironsource.L6;
import java.net.MalformedURLException;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class s7o {
    public static final i5p b;
    public final h9p a;

    static {
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = JavaScriptMessage$MsgChannel.webViewLoaded;
        i5p a = z3p.a(JavaScriptMessage$MsgType.initialized, WebViewInitData.JavaScriptNativeBridgeInitData.class);
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel2 = JavaScriptMessage$MsgChannel.adsLoader;
        i5p a2 = z3p.a(JavaScriptMessage$MsgType.streamRequestComplete, RequestLoadedAssetData.class);
        kda.X(javaScriptMessage$MsgChannel, a);
        kda.X(javaScriptMessage$MsgChannel2, a2);
        b = i5p.m(2, new Object[]{javaScriptMessage$MsgChannel, a, javaScriptMessage$MsgChannel2, a2}, null);
    }

    public s7o(TestingConfiguration testingConfiguration) {
        i9p i9pVar = new i9p();
        i9pVar.a(e9k.class, UiElementImpl.GSON_TYPE_ADAPTER);
        i9pVar.e = true;
        i9pVar.a(wnn.class, new p7o());
        i9pVar.c.add(new t1p());
        if (testingConfiguration != null && testingConfiguration.enableStrictJsonParsing()) {
            u9p u9pVar = w9p.a;
            Objects.requireNonNull(u9pVar);
            i9pVar.g.addFirst(u9pVar);
        }
        this.a = i9pVar.b();
    }

    public final lda a(String str) {
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (path == null) {
            throw new MalformedURLException("URL must have message.");
        }
        String queryParameter = parse.getQueryParameter(L6.e1);
        if (queryParameter == null) {
            throw new MalformedURLException("Session id must be provided in message.");
        }
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = (JavaScriptMessage$MsgChannel) Enum.valueOf(JavaScriptMessage$MsgChannel.class, path.substring(1));
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = (JavaScriptMessage$MsgType) Enum.valueOf(JavaScriptMessage$MsgType.class, parse.getQueryParameter("type"));
        String queryParameter2 = parse.getQueryParameter("data");
        Object obj = i5p.g;
        Object obj2 = b.get(javaScriptMessage$MsgChannel);
        if (obj2 != null) {
            obj = obj2;
        }
        Object obj3 = ((z3p) obj).get(javaScriptMessage$MsgType);
        if (obj3 == null) {
            obj3 = JavaScriptMsgData.class;
        }
        return new lda(javaScriptMessage$MsgChannel, javaScriptMessage$MsgType, queryParameter, this.a.f(queryParameter2, new z6n((Class) obj3)), null);
    }

    public final lda b(String str) {
        z6n z6nVar = new z6n(JavaScriptMsgDataWebViewCompat.class);
        h9p h9pVar = this.a;
        JavaScriptMsgDataWebViewCompat javaScriptMsgDataWebViewCompat = (JavaScriptMsgDataWebViewCompat) h9pVar.f(str, z6nVar);
        if (javaScriptMsgDataWebViewCompat.sid() == null) {
            yhk.s("Session id must be provided in message.");
            return null;
        }
        JavaScriptMessage$MsgChannel javaScriptMessage$MsgChannel = (JavaScriptMessage$MsgChannel) Enum.valueOf(JavaScriptMessage$MsgChannel.class, javaScriptMsgDataWebViewCompat.name());
        JavaScriptMessage$MsgType javaScriptMessage$MsgType = (JavaScriptMessage$MsgType) Enum.valueOf(JavaScriptMessage$MsgType.class, javaScriptMsgDataWebViewCompat.type());
        String sid = javaScriptMsgDataWebViewCompat.sid();
        String data = javaScriptMsgDataWebViewCompat.data();
        Object obj = i5p.g;
        Object obj2 = b.get(javaScriptMessage$MsgChannel);
        if (obj2 != null) {
            obj = obj2;
        }
        Object obj3 = ((z3p) obj).get(javaScriptMessage$MsgType);
        if (obj3 == null) {
            obj3 = JavaScriptMsgData.class;
        }
        return new lda(javaScriptMessage$MsgChannel, javaScriptMessage$MsgType, sid, h9pVar.f(data, new z6n((Class) obj3)), javaScriptMsgDataWebViewCompat.id());
    }
}
