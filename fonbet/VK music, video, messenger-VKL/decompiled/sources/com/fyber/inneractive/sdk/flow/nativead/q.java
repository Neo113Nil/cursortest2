package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.unity3d.services.core.network.model.HttpRequest;
import xsna.zr;

/* loaded from: classes12.dex */
public abstract class q {
    public static final String a;
    public static final String b;

    static {
        String b2 = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        a = zr.a("<html><head>", b2, "<script src='%s'></script></head><body></body></html>");
        b = zr.a("<html><head>", b2, "%s</head><body></body></html>");
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.N;
        if (str.startsWith(iAConfigManager.q ? HttpRequest.DEFAULT_SCHEME : "http")) {
            return String.format(a, str);
        }
        if (iAConfigManager.q && !str.startsWith(HttpRequest.DEFAULT_SCHEME)) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(b, str);
    }
}
