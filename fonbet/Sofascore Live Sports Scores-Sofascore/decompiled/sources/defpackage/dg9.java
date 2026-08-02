package defpackage;

import com.ironsource.C4094gc;
import com.ironsource.Fb;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.unity3d.services.core.network.model.HttpRequest;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class dg9 {
    public static final gc2 a;
    public static final x79[] b;
    public static final Map c;

    static {
        gc2 gc2Var = gc2.d;
        a = q1f.o(":");
        x79 x79Var = new x79("", x79.h);
        gc2 gc2Var2 = x79.e;
        x79 x79Var2 = new x79(C4094gc.a, gc2Var2);
        x79 x79Var3 = new x79(C4094gc.b, gc2Var2);
        gc2 gc2Var3 = x79.f;
        x79 x79Var4 = new x79("/", gc2Var3);
        x79 x79Var5 = new x79("/index.html", gc2Var3);
        gc2 gc2Var4 = x79.g;
        x79 x79Var6 = new x79("http", gc2Var4);
        x79 x79Var7 = new x79(HttpRequest.DEFAULT_SCHEME, gc2Var4);
        gc2 gc2Var5 = x79.d;
        x79[] x79VarArr = {x79Var, x79Var2, x79Var3, x79Var4, x79Var5, x79Var6, x79Var7, new x79("200", gc2Var5), new x79("204", gc2Var5), new x79("206", gc2Var5), new x79("304", gc2Var5), new x79("400", gc2Var5), new x79("404", gc2Var5), new x79("500", gc2Var5), new x79("accept-charset", ""), new x79("accept-encoding", "gzip, deflate"), new x79("accept-language", ""), new x79("accept-ranges", ""), new x79("accept", ""), new x79("access-control-allow-origin", ""), new x79("age", ""), new x79("allow", ""), new x79("authorization", ""), new x79("cache-control", ""), new x79("content-disposition", ""), new x79("content-encoding", ""), new x79("content-language", ""), new x79("content-length", ""), new x79("content-location", ""), new x79("content-range", ""), new x79("content-type", ""), new x79("cookie", ""), new x79("date", ""), new x79(DownloadModel.ETAG, ""), new x79("expect", ""), new x79("expires", ""), new x79("from", ""), new x79("host", ""), new x79("if-match", ""), new x79("if-modified-since", ""), new x79("if-none-match", ""), new x79("if-range", ""), new x79("if-unmodified-since", ""), new x79("last-modified", ""), new x79("link", ""), new x79("location", ""), new x79("max-forwards", ""), new x79("proxy-authenticate", ""), new x79("proxy-authorization", ""), new x79("range", ""), new x79("referer", ""), new x79(ToolBar.REFRESH, ""), new x79("retry-after", ""), new x79(Fb.a, ""), new x79("set-cookie", ""), new x79("strict-transport-security", ""), new x79("transfer-encoding", ""), new x79("user-agent", ""), new x79("vary", ""), new x79("via", ""), new x79("www-authenticate", "")};
        b = x79VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(x79VarArr[i].a)) {
                linkedHashMap.put(x79VarArr[i].a, Integer.valueOf(i));
            }
        }
        c = Collections.unmodifiableMap(linkedHashMap);
    }

    public static void a(gc2 gc2Var) {
        int h = gc2Var.h();
        for (int i = 0; i < h; i++) {
            byte m = gc2Var.m(i);
            if (m >= 65 && m <= 90) {
                is8.e("PROTOCOL_ERROR response malformed: mixed case name: ".concat(gc2Var.w()));
                return;
            }
        }
    }
}
