package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbiy {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a((zzbix) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        zzbjh.a(arrayList2, new zzbkq(4, "", "gad:dynamite_module:experiment_id"));
        zzbjh.a(arrayList2, zzble.a);
        zzbjh.a(arrayList2, zzble.b);
        zzbjh.a(arrayList2, zzble.c);
        zzbjh.a(arrayList2, zzble.d);
        zzbjh.a(arrayList2, zzble.e);
        zzbjh.a(arrayList2, zzble.u);
        zzbjh.a(arrayList2, zzble.f);
        zzbjh.a(arrayList2, zzble.m);
        zzbjh.a(arrayList2, zzble.n);
        zzbjh.a(arrayList2, zzble.o);
        zzbjh.a(arrayList2, zzble.p);
        zzbjh.a(arrayList2, zzble.q);
        zzbjh.a(arrayList2, zzble.r);
        zzbjh.a(arrayList2, zzble.s);
        zzbjh.a(arrayList2, zzble.t);
        zzbjh.a(arrayList2, zzble.g);
        zzbjh.a(arrayList2, zzble.h);
        zzbjh.a(arrayList2, zzble.i);
        zzbjh.a(arrayList2, zzble.j);
        zzbjh.a(arrayList2, zzble.k);
        zzbjh.a(arrayList2, zzble.l);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public final ArrayList b() {
        ArrayList a = a();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a((zzbix) it.next());
            if (!TextUtils.isEmpty(str)) {
                a.add(str);
            }
        }
        ArrayList arrayList = new ArrayList();
        zzbjh.a(arrayList, zzblt.a);
        a.addAll(arrayList);
        return a;
    }
}
