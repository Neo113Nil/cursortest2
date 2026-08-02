package com.mbridge.msdk.config.component.load.downloader;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    private long a;
    private long b;
    private long c;
    private long d;
    private int e;
    private int f;
    private int g;

    private d(b bVar) {
        this.a = bVar.a;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.b = bVar.b;
        this.g = bVar.g;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.d;
    }

    public int e() {
        return this.g;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b {
        private long a;
        private long b;
        private long c;
        private long d;
        private int e;
        private int f;
        private int g;

        public b(d dVar) {
            this.a = 20000L;
            this.b = 10L;
            this.c = 20000L;
            this.d = 20000L;
            this.e = 64;
            this.f = 20;
            this.g = 10;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(dVar)) {
                this.c = dVar.c();
                this.a = dVar.a();
                this.e = dVar.f();
                this.d = dVar.d();
                this.f = dVar.g();
                this.b = dVar.b();
                this.g = dVar.e();
            }
        }

        public d a() {
            return new d(this);
        }

        public b a(int i) {
            this.g = i;
            return this;
        }

        public b() {
            this(null);
        }
    }
}
