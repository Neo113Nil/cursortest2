package com.vk.movika.sdk.base.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import xsna.c5g;
import xsna.epx;
import xsna.g5g;
import xsna.on00;
import xsna.qr;

/* loaded from: classes3.dex */
public final class s {
    public final u a;
    public final ArrayList b;
    public final ArrayList c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final Chapter h;

    public s(u uVar, ArrayList arrayList, ArrayList arrayList2) {
        this.a = uVar;
        this.b = arrayList;
        this.c = arrayList2;
        int e = on00.e(c5g.u(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e < 16 ? 16 : e);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            linkedHashMap.put(((Chapter) next).a, next);
        }
        this.d = linkedHashMap;
        ArrayList arrayList3 = this.b;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            g5g.y(((Chapter) it2.next()).d, arrayList4);
        }
        int e2 = on00.e(c5g.u(arrayList4, 10));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(e2 < 16 ? 16 : e2);
        Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            Object next2 = it3.next();
            linkedHashMap2.put(((f) next2).a, next2);
        }
        this.e = linkedHashMap2;
        ArrayList arrayList5 = this.b;
        ArrayList arrayList6 = new ArrayList();
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            g5g.y(((Chapter) it4.next()).e, arrayList6);
        }
        int e3 = on00.e(c5g.u(arrayList6, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(e3 < 16 ? 16 : e3);
        Iterator it5 = arrayList6.iterator();
        while (it5.hasNext()) {
            Object next3 = it5.next();
            linkedHashMap3.put(((a) next3).a, next3);
        }
        this.f = linkedHashMap3;
        ArrayList arrayList7 = this.c;
        int e4 = on00.e(c5g.u(arrayList7, 10));
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(e4 >= 16 ? e4 : 16);
        Iterator it6 = arrayList7.iterator();
        while (it6.hasNext()) {
            Object next4 = it6.next();
            linkedHashMap4.put(((v) next4).a, next4);
        }
        this.g = linkedHashMap4;
        Iterator it7 = this.b.iterator();
        while (it7.hasNext()) {
            Chapter chapter = (Chapter) it7.next();
            if (epx.f(chapter.a, this.a.f)) {
                this.h = chapter;
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public final Chapter a(String str) {
        return (Chapter) this.d.get(str);
    }

    public final f b(String str) {
        return (f) this.e.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b.equals(sVar.b) && this.c.equals(sVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + qr.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Manifest(metadata=" + this.a + ", chapters=" + this.b + ", videos=" + this.c + ")";
    }
}
