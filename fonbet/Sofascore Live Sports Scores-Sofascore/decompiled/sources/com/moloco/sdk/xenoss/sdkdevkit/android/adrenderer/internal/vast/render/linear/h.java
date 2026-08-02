package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import defpackage.k13;
import defpackage.n13;
import defpackage.zzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class h {
    public final com.moloco.sdk.internal.services.events.c a;
    public List b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;
    public final List g;
    public final List h;
    public final List i;
    public final n j;
    public final f1 k;
    public final ArrayList l;
    public int m;
    public final ArrayList n;
    public int o;

    public h(com.moloco.sdk.internal.services.events.c cVar, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, List list10, List list11, List list12, List list13, List list14, List list15) {
        n nVar = new n();
        f1 b = g1.b();
        cVar.getClass();
        b.getClass();
        this.a = cVar;
        this.b = list;
        this.c = list8;
        this.d = list9;
        this.e = list10;
        this.f = list11;
        this.g = list12;
        this.h = list13;
        this.i = list14;
        this.j = nVar;
        this.k = b;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list2 != null) {
            ArrayList arrayList3 = new ArrayList(k13.r(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new a((String) it.next(), 0L));
            }
            arrayList.addAll(arrayList3);
        }
        if (list3 != null) {
            ArrayList arrayList4 = new ArrayList(k13.r(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(new a((String) it2.next(), 0L));
            }
            arrayList.addAll(arrayList4);
        }
        if (list4 != null) {
            ArrayList arrayList5 = new ArrayList(k13.r(list4, 10));
            Iterator it3 = list4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(new i((String) it3.next(), 25));
            }
            arrayList2.addAll(arrayList5);
        }
        if (list5 != null) {
            ArrayList arrayList6 = new ArrayList(k13.r(list5, 10));
            Iterator it4 = list5.iterator();
            while (it4.hasNext()) {
                arrayList6.add(new i((String) it4.next(), 50));
            }
            arrayList2.addAll(arrayList6);
        }
        if (list6 != null) {
            ArrayList arrayList7 = new ArrayList(k13.r(list6, 10));
            Iterator it5 = list6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(new i((String) it5.next(), 75));
            }
            arrayList2.addAll(arrayList7);
        }
        if (list7 != null) {
            ArrayList arrayList8 = new ArrayList(k13.r(list7, 10));
            Iterator it6 = list7.iterator();
            while (it6.hasNext()) {
                arrayList8.add(new i((String) it6.next(), 100));
            }
            arrayList2.addAll(arrayList8);
        }
        if (list15 != null) {
            Iterator it7 = list15.iterator();
            while (it7.hasNext()) {
                j jVar = (j) it7.next();
                y yVar = jVar.b;
                String str = jVar.a;
                if (yVar instanceof x) {
                    arrayList.add(new a(str, ((x) yVar).a));
                } else {
                    if (!(yVar instanceof w)) {
                        zzl.b();
                        throw null;
                    }
                    arrayList2.add(new i(str, ((w) yVar).a));
                }
            }
        }
        if (arrayList.size() > 1) {
            n13.u(new m(1), arrayList);
        }
        this.l = arrayList;
        if (arrayList2.size() > 1) {
            n13.u(new m(2), arrayList2);
        }
        this.n = arrayList2;
    }
}
