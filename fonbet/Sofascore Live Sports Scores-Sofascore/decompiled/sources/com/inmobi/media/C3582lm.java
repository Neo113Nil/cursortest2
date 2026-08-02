package com.inmobi.media;

import defpackage.iii;
import defpackage.k13;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.lm, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3582lm {
    public final AtomicInteger a;
    public final Zc b;
    public final C3556km c;

    public C3582lm(Jl jl, C3328c0 c3328c0, Fn fn) {
        int a;
        int i;
        jl.getClass();
        c3328c0.getClass();
        fn.getClass();
        this.a = new AtomicInteger(0);
        this.b = new Zc(c3328c0, jl.a, jl.b, 24);
        ArrayList arrayList = jl.d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Je je = (Je) next;
            if (!(je instanceof W5)) {
                String str = je.b;
                str.getClass();
                if (!str.equals("Impression") && !str.equals("click")) {
                    arrayList2.add(next);
                }
            }
        }
        ArrayList arrayList3 = jl.d;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (next2 instanceof W5) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(k13.r(arrayList4, 10));
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            W5 w5 = (W5) it3.next();
            int i2 = jl.c;
            w5.getClass();
            boolean n = kotlin.text.c.n(w5.c, "%", false);
            String str2 = w5.c;
            if (n) {
                try {
                    i = Integer.parseInt(iii.D(1, str2));
                } catch (Exception unused) {
                    i = 0;
                }
                a = (i2 * i) / 100;
            } else {
                a = AbstractC3504im.a(str2);
            }
            arrayList5.add(new U5(w5.a, a));
        }
        this.c = new C3556km(this.b, new C3608mm(fn, arrayList2, arrayList5));
    }
}
