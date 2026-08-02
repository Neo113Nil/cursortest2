package defpackage;

import android.os.Bundle;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mjc {
    public static final HashMap h;
    public static final HashMap i;
    public final imf a;
    public final r38 b;
    public final l48 c;
    public final igf d;
    public final iu e;
    public final qy4 f;
    public final Executor g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        HashMap hashMap2 = new HashMap();
        i = hashMap2;
        hashMap.put(d48.a, lyf.UNSPECIFIED_RENDER_ERROR);
        hashMap.put(d48.b, lyf.IMAGE_FETCH_ERROR);
        hashMap.put(d48.c, lyf.IMAGE_DISPLAY_ERROR);
        hashMap.put(d48.d, lyf.IMAGE_UNSUPPORTED_FORMAT);
        hashMap2.put(c48.b, o45.AUTO);
        hashMap2.put(c48.c, o45.CLICK);
        hashMap2.put(c48.d, o45.SWIPE);
        hashMap2.put(c48.a, o45.UNKNOWN_DISMISS_TYPE);
    }

    public mjc(imf imfVar, iu iuVar, r38 r38Var, l48 l48Var, igf igfVar, qy4 qy4Var, Executor executor) {
        this.a = imfVar;
        this.e = iuVar;
        this.b = r38Var;
        this.c = l48Var;
        this.d = igfVar;
        this.f = qy4Var;
        this.g = executor;
    }

    public static boolean b(wa waVar) {
        String str;
        return (waVar == null || (str = waVar.a) == null || str.isEmpty()) ? false : true;
    }

    public final hi2 a(lw9 lw9Var, String str) {
        hi2 h2 = ii2.h();
        h2.l();
        r38 r38Var = this.b;
        r38Var.a();
        s48 s48Var = r38Var.c;
        h2.m(s48Var.e);
        h2.d((String) lw9Var.b.c);
        yw2 h3 = ax2.h();
        r38Var.a();
        h3.h(s48Var.b);
        h3.d(str);
        h2.h(h3);
        this.d.getClass();
        h2.i(System.currentTimeMillis());
        return h2;
    }

    public final void c(lw9 lw9Var, String str, boolean z) {
        yih yihVar = lw9Var.b;
        String str2 = (String) yihVar.c;
        String str3 = (String) yihVar.d;
        Bundle bundle = new Bundle();
        bundle.putString("_nmid", str2);
        bundle.putString("_nmn", str3);
        try {
            this.d.getClass();
            bundle.putInt("_ndt", (int) (System.currentTimeMillis() / 1000));
        } catch (NumberFormatException e) {
            e.getMessage();
        }
        bundle.toString();
        iu iuVar = this.e;
        if (iuVar != null) {
            iuVar.b("fiam", str, bundle);
            if (z) {
                iuVar.g("fiam:".concat(str2), "fiam");
            }
        }
    }
}
