package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.util.g1;
import com.fyber.inneractive.sdk.web.i0;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class f {
    public String a;
    public final Map b;
    public final i0 c;
    public final g1 d;

    public f(Map map, i0 i0Var, g1 g1Var) {
        this.b = map;
        this.d = g1Var;
        this.c = i0Var;
    }

    public final int a(String str) {
        String str2 = (String) this.b.get(str);
        if (str2 == null) {
            return -1;
        }
        try {
            return Integer.parseInt(str2, 10);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public abstract void a();

    public abstract boolean b();
}
