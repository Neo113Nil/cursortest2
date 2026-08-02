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
public abstract class cg9 {
    public static final v79[] a;
    public static final Map b;

    static {
        v79 v79Var = new v79("", v79.i);
        gc2 gc2Var = v79.f;
        v79 v79Var2 = new v79(C4094gc.a, gc2Var);
        v79 v79Var3 = new v79(C4094gc.b, gc2Var);
        gc2 gc2Var2 = v79.g;
        v79 v79Var4 = new v79("/", gc2Var2);
        v79 v79Var5 = new v79("/index.html", gc2Var2);
        gc2 gc2Var3 = v79.h;
        v79 v79Var6 = new v79("http", gc2Var3);
        v79 v79Var7 = new v79(HttpRequest.DEFAULT_SCHEME, gc2Var3);
        gc2 gc2Var4 = v79.e;
        v79[] v79VarArr = {v79Var, v79Var2, v79Var3, v79Var4, v79Var5, v79Var6, v79Var7, new v79("200", gc2Var4), new v79("204", gc2Var4), new v79("206", gc2Var4), new v79("304", gc2Var4), new v79("400", gc2Var4), new v79("404", gc2Var4), new v79("500", gc2Var4), new v79("accept-charset", ""), new v79("accept-encoding", "gzip, deflate"), new v79("accept-language", ""), new v79("accept-ranges", ""), new v79("accept", ""), new v79("access-control-allow-origin", ""), new v79("age", ""), new v79("allow", ""), new v79("authorization", ""), new v79("cache-control", ""), new v79("content-disposition", ""), new v79("content-encoding", ""), new v79("content-language", ""), new v79("content-length", ""), new v79("content-location", ""), new v79("content-range", ""), new v79("content-type", ""), new v79("cookie", ""), new v79("date", ""), new v79(DownloadModel.ETAG, ""), new v79("expect", ""), new v79("expires", ""), new v79("from", ""), new v79("host", ""), new v79("if-match", ""), new v79("if-modified-since", ""), new v79("if-none-match", ""), new v79("if-range", ""), new v79("if-unmodified-since", ""), new v79("last-modified", ""), new v79("link", ""), new v79("location", ""), new v79("max-forwards", ""), new v79("proxy-authenticate", ""), new v79("proxy-authorization", ""), new v79("range", ""), new v79("referer", ""), new v79(ToolBar.REFRESH, ""), new v79("retry-after", ""), new v79(Fb.a, ""), new v79("set-cookie", ""), new v79("strict-transport-security", ""), new v79("transfer-encoding", ""), new v79("user-agent", ""), new v79("vary", ""), new v79("via", ""), new v79("www-authenticate", "")};
        a = v79VarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(v79VarArr[i].a)) {
                linkedHashMap.put(v79VarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        b = unmodifiableMap;
    }

    public static void a(gc2 gc2Var) {
        gc2Var.getClass();
        int h = gc2Var.h();
        for (int i = 0; i < h; i++) {
            byte m = gc2Var.m(i);
            if (65 <= m && m < 91) {
                is8.e("PROTOCOL_ERROR response malformed: mixed case name: ".concat(gc2Var.w()));
                return;
            }
        }
    }
}
