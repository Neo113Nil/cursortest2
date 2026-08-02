package com.inmobi.media;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class P3 {
    public static final String a(String str, Map map) {
        str.getClass();
        map.getClass();
        for (Map.Entry entry : map.entrySet()) {
            str = kotlin.text.c.r(str, (String) entry.getKey(), (String) entry.getValue(), false);
        }
        return str;
    }

    public static final Object a(Function0 function0) {
        function0.getClass();
        try {
            p2g p2gVar = w2g.b;
            return function0.invoke();
        } catch (Error e) {
            p2g p2gVar2 = w2g.b;
            return new u2g(e);
        } catch (Exception e2) {
            p2g p2gVar3 = w2g.b;
            return new u2g(e2);
        }
    }
}
