package com.google.android.material.carousel;

import ja.AbstractC5104a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final float f35114a;

    /* renamed from: b, reason: collision with root package name */
    public int f35115b;

    /* renamed from: c, reason: collision with root package name */
    public final List f35116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f35117d;

    /* renamed from: e, reason: collision with root package name */
    public final int f35118e;

    /* renamed from: f, reason: collision with root package name */
    public final int f35119f;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final float f35120a;

        /* renamed from: b, reason: collision with root package name */
        public final int f35121b;

        /* renamed from: d, reason: collision with root package name */
        public c f35123d;

        /* renamed from: e, reason: collision with root package name */
        public c f35124e;

        /* renamed from: c, reason: collision with root package name */
        public final List f35122c = new ArrayList();

        /* renamed from: f, reason: collision with root package name */
        public int f35125f = -1;

        /* renamed from: g, reason: collision with root package name */
        public int f35126g = -1;

        /* renamed from: h, reason: collision with root package name */
        public float f35127h = 0.0f;

        /* renamed from: i, reason: collision with root package name */
        public int f35128i = -1;

        public b(float f10, int i10) {
            this.f35120a = f10;
            this.f35121b = i10;
        }

        public static float j(float f10, float f11, int i10, int i11) {
            return (f10 - (i10 * f11)) + (i11 * f11);
        }

        public b a(float f10, float f11, float f12) {
            return d(f10, f11, f12, false, true);
        }

        public b b(float f10, float f11, float f12) {
            return c(f10, f11, f12, false);
        }

        public b c(float f10, float f11, float f12, boolean z10) {
            return d(f10, f11, f12, z10, false);
        }

        public b d(float f10, float f11, float f12, boolean z10, boolean z11) {
            float f13;
            float f14 = f12 / 2.0f;
            float f15 = f10 - f14;
            float f16 = f14 + f10;
            int i10 = this.f35121b;
            if (f16 > i10) {
                f13 = Math.abs(f16 - Math.max(f16 - f12, i10));
            } else {
                f13 = 0.0f;
                if (f15 < 0.0f) {
                    f13 = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
                }
            }
            return e(f10, f11, f12, z10, z11, f13);
        }

        public b e(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
            return f(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
        }

        public b f(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
            if (f12 <= 0.0f) {
                return this;
            }
            if (z11) {
                if (z10) {
                    throw new IllegalArgumentException("Anchor keylines cannot be focal.");
                }
                int i10 = this.f35128i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f35128i = this.f35122c.size();
            }
            c cVar = new c(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
            if (z10) {
                if (this.f35123d == null) {
                    this.f35123d = cVar;
                    this.f35125f = this.f35122c.size();
                }
                if (this.f35126g != -1 && this.f35122c.size() - this.f35126g > 1) {
                    throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
                }
                if (f12 != this.f35123d.f35132d) {
                    throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
                }
                this.f35124e = cVar;
                this.f35126g = this.f35122c.size();
            } else {
                if (this.f35123d == null && cVar.f35132d < this.f35127h) {
                    throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
                }
                if (this.f35124e != null && cVar.f35132d > this.f35127h) {
                    throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
                }
            }
            this.f35127h = cVar.f35132d;
            this.f35122c.add(cVar);
            return this;
        }

        public b g(float f10, float f11, float f12, int i10) {
            return h(f10, f11, f12, i10, false);
        }

        public b h(float f10, float f11, float f12, int i10, boolean z10) {
            if (i10 > 0 && f12 > 0.0f) {
                for (int i11 = 0; i11 < i10; i11++) {
                    c((i11 * f12) + f10, f11, f12, z10);
                }
            }
            return this;
        }

        public h i() {
            if (this.f35123d == null) {
                throw new IllegalStateException("There must be a keyline marked as focal.");
            }
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < this.f35122c.size(); i10++) {
                c cVar = (c) this.f35122c.get(i10);
                arrayList.add(new c(j(this.f35123d.f35130b, this.f35120a, this.f35125f, i10), cVar.f35130b, cVar.f35131c, cVar.f35132d, cVar.f35133e, cVar.f35134f, cVar.f35135g, cVar.f35136h));
            }
            return new h(this.f35120a, arrayList, this.f35125f, this.f35126g, this.f35121b);
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final float f35129a;

        /* renamed from: b, reason: collision with root package name */
        public final float f35130b;

        /* renamed from: c, reason: collision with root package name */
        public final float f35131c;

        /* renamed from: d, reason: collision with root package name */
        public final float f35132d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f35133e;

        /* renamed from: f, reason: collision with root package name */
        public final float f35134f;

        /* renamed from: g, reason: collision with root package name */
        public final float f35135g;

        /* renamed from: h, reason: collision with root package name */
        public final float f35136h;

        public c(float f10, float f11, float f12, float f13) {
            this(f10, f11, f12, f13, false, 0.0f, 0.0f, 0.0f);
        }

        public static c a(c cVar, c cVar2, float f10) {
            return new c(AbstractC5104a.a(cVar.f35129a, cVar2.f35129a, f10), AbstractC5104a.a(cVar.f35130b, cVar2.f35130b, f10), AbstractC5104a.a(cVar.f35131c, cVar2.f35131c, f10), AbstractC5104a.a(cVar.f35132d, cVar2.f35132d, f10));
        }

        public c(float f10, float f11, float f12, float f13, boolean z10, float f14, float f15, float f16) {
            this.f35129a = f10;
            this.f35130b = f11;
            this.f35131c = f12;
            this.f35132d = f13;
            this.f35133e = z10;
            this.f35134f = f14;
            this.f35135g = f15;
            this.f35136h = f16;
        }
    }

    public static h o(h hVar, h hVar2, float f10) {
        if (hVar.g() != hVar2.g()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List h10 = hVar.h();
        List h11 = hVar2.h();
        if (h10.size() != h11.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < hVar.h().size(); i10++) {
            arrayList.add(c.a((c) h10.get(i10), (c) h11.get(i10), f10));
        }
        return new h(hVar.g(), arrayList, AbstractC5104a.c(hVar.c(), hVar2.c(), f10), AbstractC5104a.c(hVar.j(), hVar2.j(), f10), hVar.f35119f);
    }

    public static h p(h hVar, int i10) {
        b bVar = new b(hVar.g(), i10);
        float f10 = (i10 - hVar.k().f35130b) - (hVar.k().f35132d / 2.0f);
        int size = hVar.h().size() - 1;
        while (size >= 0) {
            c cVar = (c) hVar.h().get(size);
            bVar.d((cVar.f35132d / 2.0f) + f10, cVar.f35131c, cVar.f35132d, size >= hVar.c() && size <= hVar.j(), cVar.f35133e);
            f10 += cVar.f35132d;
            size--;
        }
        return bVar.i();
    }

    public int a() {
        return this.f35119f;
    }

    public c b() {
        return (c) this.f35116c.get(this.f35117d);
    }

    public int c() {
        return this.f35117d;
    }

    public c d() {
        return (c) this.f35116c.get(0);
    }

    public c e() {
        for (int i10 = 0; i10 < this.f35116c.size(); i10++) {
            c cVar = (c) this.f35116c.get(i10);
            if (!cVar.f35133e) {
                return cVar;
            }
        }
        return null;
    }

    public List f() {
        return this.f35116c.subList(this.f35117d, this.f35118e + 1);
    }

    public float g() {
        return this.f35114a;
    }

    public List h() {
        return this.f35116c;
    }

    public c i() {
        return (c) this.f35116c.get(this.f35118e);
    }

    public int j() {
        return this.f35118e;
    }

    public c k() {
        return (c) this.f35116c.get(r0.size() - 1);
    }

    public c l() {
        for (int size = this.f35116c.size() - 1; size >= 0; size--) {
            c cVar = (c) this.f35116c.get(size);
            if (!cVar.f35133e) {
                return cVar;
            }
        }
        return null;
    }

    public int m() {
        Iterator it = this.f35116c.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((c) it.next()).f35133e) {
                i10++;
            }
        }
        return this.f35116c.size() - i10;
    }

    public int n() {
        return this.f35115b;
    }

    public h(float f10, List list, int i10, int i11, int i12) {
        this.f35114a = f10;
        this.f35116c = Collections.unmodifiableList(list);
        this.f35117d = i10;
        this.f35118e = i11;
        while (i10 <= i11) {
            if (((c) list.get(i10)).f35134f == 0.0f) {
                this.f35115b++;
            }
            i10++;
        }
        this.f35119f = i12;
    }
}
