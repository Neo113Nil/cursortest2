package com.inmobi.media;

import defpackage.dr6;
import defpackage.g9i;
import defpackage.ku3;
import defpackage.xw3;
import defpackage.yda;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Ka {
    public final ku3 a;
    public final String b;
    public final Map c;

    public Ka(ku3 ku3Var) {
        ku3Var.getClass();
        this.a = ku3Var;
        this.b = "Ka";
        this.c = Collections.synchronizedMap(new LinkedHashMap());
    }

    public final void a(String str, Function2 function2) {
        str.getClass();
        function2.getClass();
        g9i L = xw3.L(this.a, null, null, new Ja(function2, null), 3);
        Map map = this.c;
        map.getClass();
        Object obj = map.get(str);
        if (obj == null) {
            obj = new CopyOnWriteArrayList();
            map.put(str, obj);
        }
        ((List) obj).add(L);
        L.n(new dr6(18, this, str, L));
    }

    public static final Unit a(Ka ka, String str, yda ydaVar, Throwable th) {
        ka.b.getClass();
        List list = (List) ka.c.get(str);
        if (list != null) {
            list.remove(ydaVar);
        }
        return Unit.a;
    }
}
