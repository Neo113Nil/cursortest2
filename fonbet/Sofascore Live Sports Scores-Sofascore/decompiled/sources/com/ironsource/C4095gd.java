package com.ironsource;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.gd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4095gd {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC4166kd d;
    private int e;
    private int f;

    private C4095gd(boolean z, boolean z2, boolean z3, EnumC4166kd enumC4166kd, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC4166kd;
        this.e = i;
        this.f = i2;
    }

    public EnumC4166kd a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        return this.b;
    }

    public boolean e() {
        return this.a;
    }

    public boolean f() {
        return this.c;
    }

    public /* synthetic */ C4095gd(boolean z, boolean z2, boolean z3, EnumC4166kd enumC4166kd, int i, int i2, int i3) {
        this(z, z2, z3, enumC4166kd, i, i2);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.gd$a */
    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC4166kd d = null;
        private int e = 0;
        private int f = 0;

        public C4095gd a() {
            return new C4095gd(this.a, this.b, this.c, this.d, this.e, this.f, 0);
        }

        public a a(boolean z, EnumC4166kd enumC4166kd, int i) {
            this.b = z;
            if (enumC4166kd == null) {
                enumC4166kd = EnumC4166kd.PER_DAY;
            }
            this.d = enumC4166kd;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public a a(boolean z) {
            this.a = z;
            return this;
        }
    }
}
