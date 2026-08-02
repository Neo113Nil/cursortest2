package io.sentry.react;

import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.twilio.voice.EventKeys;
import io.sentry.C4744f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* loaded from: classes3.dex */
public final class z extends io.sentry.android.replay.a {
    public static String j(Object obj) {
        if (!(obj instanceof List)) {
            return null;
        }
        List list = (List) obj;
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int min = Math.min(3, list.size() - 1); min >= 0; min--) {
            Object obj2 = list.get(min);
            if (!(obj2 instanceof Map)) {
                return null;
            }
            Map map = (Map) obj2;
            Object obj3 = map.get("name");
            Object obj4 = map.get(AnnotatedPrivateKey.LABEL);
            boolean z10 = obj4 instanceof String;
            if (!(obj3 instanceof String) && !z10) {
                return null;
            }
            if (z10) {
                sb2.append(obj4);
            } else {
                sb2.append(obj3);
            }
            Object obj5 = map.get("element");
            Object obj6 = map.get("file");
            boolean z11 = obj5 instanceof String;
            boolean z12 = obj6 instanceof String;
            if (z11 && z12) {
                sb2.append('(');
                sb2.append(obj5);
                sb2.append(", ");
                sb2.append(obj6);
                sb2.append(')');
            } else if (z11) {
                sb2.append('(');
                sb2.append(obj5);
                sb2.append(')');
            } else if (z12) {
                sb2.append('(');
                sb2.append(obj6);
                sb2.append(')');
            }
            if (min > 0) {
                sb2.append(" > ");
            }
        }
        return sb2.toString();
    }

    @Override // io.sentry.android.replay.a, io.sentry.F1
    public io.sentry.rrweb.b a(C4744f c4744f) {
        if (c4744f.j() == null || "sentry.event".equals(c4744f.j()) || "sentry.transaction".equals(c4744f.j()) || "http".equals(c4744f.j())) {
            return null;
        }
        if (PointerEventHelper.POINTER_TYPE_TOUCH.equals(c4744f.j())) {
            return i(c4744f);
        }
        if ("ui.multiClick".equals(c4744f.j())) {
            return f(c4744f);
        }
        if ("navigation".equals(c4744f.j())) {
            return g(c4744f);
        }
        if ("xhr".equals(c4744f.j())) {
            return h(c4744f);
        }
        io.sentry.rrweb.b a10 = super.a(c4744f);
        if ((a10 instanceof io.sentry.rrweb.a) && "navigation".equals(((io.sentry.rrweb.a) a10).n())) {
            return null;
        }
        return a10;
    }

    public io.sentry.rrweb.b f(C4744f c4744f) {
        if (!(c4744f.k("path") instanceof List)) {
            return null;
        }
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t("ui.multiClick");
        aVar.x(j(c4744f.k("path")));
        l(aVar, c4744f);
        return aVar;
    }

    public io.sentry.rrweb.b g(C4744f c4744f) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t(c4744f.j());
        l(aVar, c4744f);
        return aVar;
    }

    public io.sentry.rrweb.b h(C4744f c4744f) {
        int intValue;
        Double valueOf = c4744f.k("start_timestamp") instanceof Number ? Double.valueOf(((Number) c4744f.k("start_timestamp")).doubleValue()) : null;
        Double valueOf2 = c4744f.k("end_timestamp") instanceof Number ? Double.valueOf(((Number) c4744f.k("end_timestamp")).doubleValue()) : null;
        String str = c4744f.k(EventKeys.URL) instanceof String ? (String) c4744f.k(EventKeys.URL) : null;
        if (valueOf == null || valueOf2 == null || str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (c4744f.k("method") instanceof String) {
            hashMap.put("method", c4744f.k("method"));
        }
        if ((c4744f.k("status_code") instanceof Number) && (intValue = ((Number) c4744f.k("status_code")).intValue()) > 0) {
            hashMap.put("statusCode", Integer.valueOf(intValue));
        }
        if (c4744f.k("request_body_size") instanceof Number) {
            hashMap.put("requestBodySize", Double.valueOf(((Number) c4744f.k("request_body_size")).doubleValue()));
        }
        if (c4744f.k("response_body_size") instanceof Number) {
            hashMap.put("responseBodySize", Double.valueOf(((Number) c4744f.k("response_body_size")).doubleValue()));
        }
        Map k10 = k(c4744f.k("request"));
        if (!k10.isEmpty()) {
            hashMap.put("request", k10);
        }
        Map k11 = k(c4744f.k("response"));
        if (!k11.isEmpty()) {
            hashMap.put("response", k11);
        }
        io.sentry.rrweb.i iVar = new io.sentry.rrweb.i();
        iVar.s("resource.http");
        iVar.u(valueOf.doubleValue() / 1000.0d);
        iVar.r(valueOf2.doubleValue() / 1000.0d);
        iVar.q(str);
        iVar.o(hashMap);
        return iVar;
    }

    public io.sentry.rrweb.b i(C4744f c4744f) {
        io.sentry.rrweb.a aVar = new io.sentry.rrweb.a();
        aVar.t("ui.tap");
        aVar.x(j(c4744f.k("path")));
        l(aVar, c4744f);
        return aVar;
    }

    public final Map k(Object obj) {
        if (!(obj instanceof Map)) {
            return new HashMap();
        }
        HashMap hashMap = new HashMap((Map) obj);
        hashMap.remove("_meta");
        return hashMap;
    }

    public final void l(io.sentry.rrweb.a aVar, C4744f c4744f) {
        aVar.w(c4744f.m());
        aVar.u(c4744f.l());
        aVar.f(c4744f.q().getTime());
        aVar.r(c4744f.q().getTime() / 1000.0d);
        aVar.s(Constants.COLLATION_DEFAULT);
    }
}
