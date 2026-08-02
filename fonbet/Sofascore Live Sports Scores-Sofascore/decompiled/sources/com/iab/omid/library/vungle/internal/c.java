package com.iab.omid.library.vungle.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class c {
    private static c c = new c();
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> a = new ArrayList<>();
    private final ArrayList<com.iab.omid.library.vungle.adsession.a> b = new ArrayList<>();

    private c() {
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> a() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void b(com.iab.omid.library.vungle.adsession.a aVar) {
        boolean d = d();
        this.a.remove(aVar);
        this.b.remove(aVar);
        if (!d || d()) {
            return;
        }
        i.c().e();
    }

    public void c(com.iab.omid.library.vungle.adsession.a aVar) {
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

    public void a(com.iab.omid.library.vungle.adsession.a aVar) {
        this.a.add(aVar);
    }

    public static c c() {
        return c;
    }

    public Collection<com.iab.omid.library.vungle.adsession.a> b() {
        return Collections.unmodifiableCollection(this.a);
    }
}
