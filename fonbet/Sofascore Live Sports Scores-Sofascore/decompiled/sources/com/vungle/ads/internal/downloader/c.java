package com.vungle.ads.internal.downloader;

import defpackage.fn0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c {
    public int a;
    public int b;
    public long c;
    public long d;
    public long e;

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final void c(long j) {
        this.c = j;
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Progress(status=");
        a.append(this.a);
        a.append(", percent=");
        a.append(this.b);
        a.append(", startAt=");
        a.append(this.c);
        a.append(", readed=");
        a.append(this.d);
        a.append(", total=");
        return fn0.n(a, this.e, ')');
    }

    public final void a(int i) {
        this.b = i;
    }

    public final void b(int i) {
        this.a = i;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void b(long j) {
        this.e = j;
    }
}
