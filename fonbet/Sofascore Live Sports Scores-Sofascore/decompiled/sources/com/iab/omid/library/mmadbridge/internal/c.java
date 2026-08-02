package com.iab.omid.library.mmadbridge.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes4.dex */
public class c {
    private static c c = new c();
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> a = new ArrayList<>();
    private final ArrayList<com.iab.omid.library.mmadbridge.adsession.a> b = new ArrayList<>();

    private c() {
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void b(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean d = d();
        this.a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        boolean d = d();
        this.b.add(aVar);
        if (d) {
            return;
        }
        i.c().d();
    }

    public boolean d() {
        return this.b.size() > 0;
    }

    public void a(com.iab.omid.library.mmadbridge.adsession.a aVar) {
        this.a.add(aVar);
    }

    public static c c() {
        return c;
    }

    public Collection<com.iab.omid.library.mmadbridge.adsession.a> b() {
        return Collections.unmodifiableCollection(this.a);
    }
}
