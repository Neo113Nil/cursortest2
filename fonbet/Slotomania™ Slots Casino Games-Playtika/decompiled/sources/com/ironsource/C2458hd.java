package com.ironsource;

/* renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2458hd {
    private boolean a;
    private boolean b;
    private boolean c;
    private EnumC2529ld d;
    private int e;
    private int f;

    /* renamed from: com.ironsource.hd$a */
    public static class a {
        private boolean a = true;
        private boolean b = false;
        private boolean c = false;
        private EnumC2529ld d = null;
        private int e = 0;
        private int f = 0;

        public a a(boolean z) {
            this.a = z;
            return this;
        }

        public a a(boolean z, EnumC2529ld enumC2529ld, int i) {
            this.b = z;
            if (enumC2529ld == null) {
                enumC2529ld = EnumC2529ld.PER_DAY;
            }
            this.d = enumC2529ld;
            this.e = i;
            return this;
        }

        public a a(boolean z, int i) {
            this.c = z;
            this.f = i;
            return this;
        }

        public C2458hd a() {
            return new C2458hd(this.a, this.b, this.c, this.d, this.e, this.f);
        }
    }

    private C2458hd(boolean z, boolean z2, boolean z3, EnumC2529ld enumC2529ld, int i, int i2) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = enumC2529ld;
        this.e = i;
        this.f = i2;
    }

    public EnumC2529ld a() {
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
}
