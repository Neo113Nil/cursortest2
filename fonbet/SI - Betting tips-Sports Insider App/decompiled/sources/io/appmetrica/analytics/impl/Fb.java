package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Fb {

    /* renamed from: a, reason: collision with root package name */
    public final O2 f12220a;

    /* renamed from: b, reason: collision with root package name */
    public final C0167g2 f12221b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f12222c;

    public Fb(O2 o22, C0167g2 c0167g2) {
        ArrayList arrayList = new ArrayList();
        this.f12222c = arrayList;
        this.f12220a = o22;
        arrayList.add(o22);
        this.f12221b = c0167g2;
        arrayList.add(c0167g2);
    }

    public final synchronized void a() {
        Iterator it = this.f12222c.iterator();
        while (it.hasNext()) {
            ((InterfaceC0313lk) it.next()).onCreate();
        }
    }

    public final synchronized void a(C0328ma c0328ma) {
        this.f12222c.add(c0328ma);
    }
}
