package com.ironsource;

/* renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4354hd {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC4425ld d;
    private int e;
    private int f;

    /* renamed from: com.ironsource.hd$a */
    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC4425ld d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(boolean z, EnumC4425ld enumC4425ld, int i) {
            this.b = z;
            if (enumC4425ld == null) {
                enumC4425ld = EnumC4425ld.PER_DAY;
            }
            this.d = enumC4425ld;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public C4354hd a() {
            return new C4354hd(this.a, this.b, this.c, this.d, this.e, this.f, 0);
        }
    }

    public /* synthetic */ C4354hd(boolean z, boolean z2, boolean z3, EnumC4425ld enumC4425ld, int i, int i2, int i3) {
        this(z, z2, z3, enumC4425ld, i, i2);
    }

    public EnumC4425ld a() {
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

    private C4354hd(boolean z, boolean z2, boolean z3, EnumC4425ld enumC4425ld, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC4425ld;
        this.e = i;
        this.f = i2;
    }
}
