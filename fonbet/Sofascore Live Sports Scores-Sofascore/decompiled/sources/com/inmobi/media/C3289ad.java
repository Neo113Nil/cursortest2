package com.inmobi.media;

import defpackage.wv8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3289ad {
    public final Zc a;
    public final Yc b;

    public C3289ad(Jl jl, C3328c0 c3328c0, Ri ri) {
        c3328c0.getClass();
        ri.getClass();
        ArrayList arrayList = null;
        this.a = new Zc(c3328c0, jl != null ? jl.a : null, jl != null ? jl.b : null, 24);
        if (jl != null) {
            ArrayList arrayList2 = jl.d;
            arrayList = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = ((Je) next).b;
                str.getClass();
                if (Intrinsics.c(str, "Impression")) {
                    arrayList.add(next);
                }
            }
        }
        this.b = new Yc(this.a, new C3341cd(ri, arrayList));
    }

    public final void a(short s, List list) {
        list.getClass();
        this.b.c.a(new ep(wv8.o("[EVENTTYPE]", String.valueOf((int) s)), list));
    }
}
