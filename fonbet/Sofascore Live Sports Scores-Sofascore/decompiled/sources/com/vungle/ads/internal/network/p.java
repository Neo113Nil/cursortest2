package com.vungle.ads.internal.network;

import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class p {
    public final String a;
    public g b;
    public Map c;
    public String d;
    public Boolean e;
    public int f;
    public boolean g;
    public int h;
    public String i;
    public com.vungle.ads.internal.util.s j;

    public p(String str) {
        str.getClass();
        this.a = str;
        this.b = g.GET;
        this.f = 3;
        this.g = true;
        this.h = 5;
    }

    public final q a() {
        return new q(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final void b() {
        this.b = g.GET;
    }

    public final void c() {
        this.b = g.POST;
    }

    public final p d() {
        this.e = Boolean.TRUE;
        return this;
    }

    public final p b(String str) {
        this.i = str;
        return this;
    }

    public final p a(Map map) {
        this.c = map;
        return this;
    }

    public final p a(String str) {
        this.d = str;
        return this;
    }

    public final p a(boolean z) {
        this.g = z;
        return this;
    }

    public final p a(com.vungle.ads.internal.util.s sVar) {
        this.j = sVar;
        return this;
    }

    public final p a(g gVar) {
        gVar.getClass();
        this.b = gVar;
        return this;
    }
}
