package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i9p {
    public nbp a = nbp.c;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean e;
    public final c9p f;
    public final ArrayDeque g;
    public final int h;
    public final int i;

    public i9p() {
        c9p c9pVar = h9p.g;
        this.e = false;
        this.f = h9p.g;
        this.h = 1;
        this.i = 2;
        this.g = new ArrayDeque();
    }

    public final void a(Class cls, Object obj) {
        Objects.requireNonNull(obj);
        boolean z = obj instanceof p7o;
        if (!z && !(obj instanceof map)) {
            String name = obj.getClass().getName();
            a70.p(wt3.m("Class ", name, new StringBuilder(name.length() + 71), " does not implement any supported type adapter class or interface"));
            return;
        }
        if (cls == Object.class) {
            a70.p("Cannot override built-in adapter for ".concat(cls.toString()));
            return;
        }
        ArrayList arrayList = this.c;
        if (z) {
            z6n z6nVar = new z6n(cls);
            arrayList.add(new gfp(obj, z6nVar, z6nVar.b == z6nVar.a));
        }
        if (obj instanceof map) {
            w4n w4nVar = a6n.a;
            arrayList.add(new ydp(new z6n(cls), (map) obj));
        }
    }

    public final h9p b() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = new ArrayList(arrayList2.size() + size + 3);
        arrayList3.addAll(arrayList);
        Collections.reverse(arrayList3);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        Collections.reverse(arrayList4);
        arrayList3.addAll(arrayList4);
        boolean z = x6n.a;
        nbp nbpVar = this.a;
        HashMap hashMap = new HashMap(this.b);
        boolean z2 = this.e;
        new ArrayList(arrayList);
        new ArrayList(arrayList2);
        ArrayList arrayList5 = new ArrayList(this.g);
        return new h9p(nbpVar, hashMap, this.f, z2, arrayList3, this.h, this.i, arrayList5);
    }
}
