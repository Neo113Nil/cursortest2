package defpackage;

import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.t;
import defpackage.gim;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class nxl {
    public static String a(n4m n4mVar) {
        wul wulVar;
        oql oqlVar;
        q5m a = z7m.a();
        String str = null;
        String str2 = (a == null || (oqlVar = a.a) == null) ? null : oqlVar.b;
        StringBuilder sb = new StringBuilder();
        q5m a2 = z7m.a();
        sb.append(a2 != null ? a2.d : null);
        sb.append("://");
        q5m a3 = z7m.a();
        sb.append(a3 != null ? a3.c : null);
        sb.append('/');
        q5m a4 = z7m.a();
        if (a4 != null && (wulVar = a4.b) != null) {
            str = wulVar.b;
        }
        sb.append(str);
        sb.append('/');
        sb.append(n4mVar.a);
        return c(str2, n4mVar, sb.toString());
    }

    public static String b(n4m n4mVar, xlm xlmVar) {
        wul wulVar;
        oql oqlVar;
        q5m a = z7m.a();
        String str = null;
        String str2 = (a == null || (oqlVar = a.a) == null) ? null : oqlVar.a;
        StringBuilder sb = new StringBuilder();
        q5m a2 = z7m.a();
        sb.append(a2 != null ? a2.d : null);
        sb.append("://");
        q5m a3 = z7m.a();
        sb.append(a3 != null ? a3.c : null);
        sb.append('/');
        q5m a4 = z7m.a();
        if (a4 != null && (wulVar = a4.b) != null) {
            str = wulVar.a;
        }
        sb.append(str);
        sb.append('/');
        sb.append(xlmVar.a);
        sb.append('/');
        sb.append(n4mVar.a);
        return c(str2, n4mVar, sb.toString());
    }

    public static String c(String str, n4m n4mVar, String str2) {
        String str3;
        String str4;
        try {
            str3 = n4mVar.d;
            if (str3 == null) {
                str3 = "";
            }
            gim gimVar = n4mVar.b;
            str4 = gimVar instanceof gim.d ? ((gim.d) gimVar).a.e : "";
        } catch (Exception e) {
            if (e instanceof IllegalArgumentException) {
                t tVar = new t();
                tVar.g = fn0.p("id", String.valueOf(n4mVar.a));
                tVar.b(e.getMessage());
                j1m.a(tVar);
            } else {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            }
        }
        if (StringsKt.R(str3)) {
            throw new IllegalArgumentException("title can't be empty");
        }
        if (StringsKt.R(str2)) {
            throw new IllegalArgumentException("url can't be empty");
        }
        if (str != null) {
            y4m[] y4mVarArr = y4m.a;
            return c.r(c.r(c.r(str, "[[TITLE]]", str3, false), "[[URL]]", str2, false), "[[DESCRIPTION]]", str4, false);
        }
        return "";
    }

    public static String d(n4m n4mVar) {
        wul wulVar;
        oql oqlVar;
        q5m a = z7m.a();
        String str = null;
        String str2 = (a == null || (oqlVar = a.a) == null) ? null : oqlVar.c;
        StringBuilder sb = new StringBuilder();
        q5m a2 = z7m.a();
        sb.append(a2 != null ? a2.d : null);
        sb.append("://");
        q5m a3 = z7m.a();
        sb.append(a3 != null ? a3.c : null);
        sb.append('/');
        q5m a4 = z7m.a();
        if (a4 != null && (wulVar = a4.b) != null) {
            str = wulVar.c;
        }
        sb.append(str);
        sb.append('/');
        sb.append(n4mVar.a);
        return c(str2, n4mVar, sb.toString());
    }
}
