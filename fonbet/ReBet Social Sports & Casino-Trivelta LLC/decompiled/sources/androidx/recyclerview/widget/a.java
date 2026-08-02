package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import java.util.ArrayList;
import java.util.List;
import x0.InterfaceC6775d;

/* loaded from: classes.dex */
public final class a implements r.a {

    /* renamed from: a, reason: collision with root package name */
    public InterfaceC6775d f22968a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f22969b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f22970c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0396a f22971d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f22972e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f22973f;

    /* renamed from: g, reason: collision with root package name */
    public final r f22974g;

    /* renamed from: h, reason: collision with root package name */
    public int f22975h;

    /* renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0396a {
        void a(int i10, int i11);

        void b(b bVar);

        void c(b bVar);

        void d(int i10, int i11);

        void e(int i10, int i11, Object obj);

        RecyclerView.F f(int i10);

        void g(int i10, int i11);

        void h(int i10, int i11);
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f22976a;

        /* renamed from: b, reason: collision with root package name */
        public int f22977b;

        /* renamed from: c, reason: collision with root package name */
        public Object f22978c;

        /* renamed from: d, reason: collision with root package name */
        public int f22979d;

        public b(int i10, int i11, int i12, Object obj) {
            this.f22976a = i10;
            this.f22977b = i11;
            this.f22979d = i12;
            this.f22978c = obj;
        }

        public String a() {
            int i10 = this.f22976a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f22976a;
            if (i10 != bVar.f22976a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f22979d - this.f22977b) == 1 && this.f22979d == bVar.f22977b && this.f22977b == bVar.f22979d) {
                return true;
            }
            if (this.f22979d != bVar.f22979d || this.f22977b != bVar.f22977b) {
                return false;
            }
            Object obj2 = this.f22978c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f22978c)) {
                    return false;
                }
            } else if (bVar.f22978c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f22976a * 31) + this.f22977b) * 31) + this.f22979d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f22977b + "c:" + this.f22979d + ",p:" + this.f22978c + "]";
        }
    }

    public a(InterfaceC0396a interfaceC0396a) {
        this(interfaceC0396a, false);
    }

    @Override // androidx.recyclerview.widget.r.a
    public b a(int i10, int i11, int i12, Object obj) {
        b bVar = (b) this.f22968a.acquire();
        if (bVar == null) {
            return new b(i10, i11, i12, obj);
        }
        bVar.f22976a = i10;
        bVar.f22977b = i11;
        bVar.f22979d = i12;
        bVar.f22978c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.r.a
    public void b(b bVar) {
        if (this.f22973f) {
            return;
        }
        bVar.f22978c = null;
        this.f22968a.release(bVar);
    }

    public final void c(b bVar) {
        v(bVar);
    }

    public final void d(b bVar) {
        v(bVar);
    }

    public int e(int i10) {
        int size = this.f22969b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f22969b.get(i11);
            int i12 = bVar.f22976a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f22977b;
                    if (i13 <= i10) {
                        int i14 = bVar.f22979d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f22977b;
                    if (i15 == i10) {
                        i10 = bVar.f22979d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f22979d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f22977b <= i10) {
                i10 += bVar.f22979d;
            }
        }
        return i10;
    }

    public final void f(b bVar) {
        boolean z10;
        char c10;
        int i10 = bVar.f22977b;
        int i11 = bVar.f22979d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f22971d.f(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    v(a(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f22979d) {
            b(bVar);
            bVar = a(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    public final void g(b bVar) {
        int i10 = bVar.f22977b;
        int i11 = bVar.f22979d + i10;
        int i12 = 0;
        boolean z10 = -1;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f22971d.f(i10) != null || h(i10)) {
                if (!z10) {
                    k(a(4, i13, i12, bVar.f22978c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    v(a(4, i13, i12, bVar.f22978c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f22979d) {
            Object obj = bVar.f22978c;
            b(bVar);
            bVar = a(4, i13, i12, obj);
        }
        if (z10) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    public final boolean h(int i10) {
        int size = this.f22970c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = (b) this.f22970c.get(i11);
            int i12 = bVar.f22976a;
            if (i12 == 8) {
                if (n(bVar.f22979d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f22977b;
                int i14 = bVar.f22979d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f22970c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f22971d.c((b) this.f22970c.get(i10));
        }
        x(this.f22970c);
        this.f22975h = 0;
    }

    public void j() {
        i();
        int size = this.f22969b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f22969b.get(i10);
            int i11 = bVar.f22976a;
            if (i11 == 1) {
                this.f22971d.c(bVar);
                this.f22971d.g(bVar.f22977b, bVar.f22979d);
            } else if (i11 == 2) {
                this.f22971d.c(bVar);
                this.f22971d.h(bVar.f22977b, bVar.f22979d);
            } else if (i11 == 4) {
                this.f22971d.c(bVar);
                this.f22971d.e(bVar.f22977b, bVar.f22979d, bVar.f22978c);
            } else if (i11 == 8) {
                this.f22971d.c(bVar);
                this.f22971d.a(bVar.f22977b, bVar.f22979d);
            }
            Runnable runnable = this.f22972e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f22969b);
        this.f22975h = 0;
    }

    public final void k(b bVar) {
        int i10;
        int i11 = bVar.f22976a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z10 = z(bVar.f22977b, i11);
        int i12 = bVar.f22977b;
        int i13 = bVar.f22976a;
        if (i13 == 2) {
            i10 = 0;
        } else {
            if (i13 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f22979d; i15++) {
            int z11 = z(bVar.f22977b + (i10 * i15), bVar.f22976a);
            int i16 = bVar.f22976a;
            if (i16 == 2 ? z11 != z10 : !(i16 == 4 && z11 == z10 + 1)) {
                b a10 = a(i16, z10, i14, bVar.f22978c);
                l(a10, i12);
                b(a10);
                if (bVar.f22976a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                z10 = z11;
            } else {
                i14++;
            }
        }
        Object obj = bVar.f22978c;
        b(bVar);
        if (i14 > 0) {
            b a11 = a(bVar.f22976a, z10, i14, obj);
            l(a11, i12);
            b(a11);
        }
    }

    public void l(b bVar, int i10) {
        this.f22971d.b(bVar);
        int i11 = bVar.f22976a;
        if (i11 == 2) {
            this.f22971d.h(i10, bVar.f22979d);
        } else {
            if (i11 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f22971d.e(i10, bVar.f22979d, bVar.f22978c);
        }
    }

    public int m(int i10) {
        return n(i10, 0);
    }

    public int n(int i10, int i11) {
        int size = this.f22970c.size();
        while (i11 < size) {
            b bVar = (b) this.f22970c.get(i11);
            int i12 = bVar.f22976a;
            if (i12 == 8) {
                int i13 = bVar.f22977b;
                if (i13 == i10) {
                    i10 = bVar.f22979d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f22979d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f22977b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f22979d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f22979d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean o(int i10) {
        return (i10 & this.f22975h) != 0;
    }

    public boolean p() {
        return this.f22969b.size() > 0;
    }

    public boolean q() {
        return (this.f22970c.isEmpty() || this.f22969b.isEmpty()) ? false : true;
    }

    public boolean r(int i10, int i11, Object obj) {
        if (i11 < 1) {
            return false;
        }
        this.f22969b.add(a(4, i10, i11, obj));
        this.f22975h |= 4;
        return this.f22969b.size() == 1;
    }

    public boolean s(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f22969b.add(a(1, i10, i11, null));
        this.f22975h |= 1;
        return this.f22969b.size() == 1;
    }

    public boolean t(int i10, int i11, int i12) {
        if (i10 == i11) {
            return false;
        }
        if (i12 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f22969b.add(a(8, i10, i11, null));
        this.f22975h |= 8;
        return this.f22969b.size() == 1;
    }

    public boolean u(int i10, int i11) {
        if (i11 < 1) {
            return false;
        }
        this.f22969b.add(a(2, i10, i11, null));
        this.f22975h |= 2;
        return this.f22969b.size() == 1;
    }

    public final void v(b bVar) {
        this.f22970c.add(bVar);
        int i10 = bVar.f22976a;
        if (i10 == 1) {
            this.f22971d.g(bVar.f22977b, bVar.f22979d);
            return;
        }
        if (i10 == 2) {
            this.f22971d.d(bVar.f22977b, bVar.f22979d);
            return;
        }
        if (i10 == 4) {
            this.f22971d.e(bVar.f22977b, bVar.f22979d, bVar.f22978c);
        } else {
            if (i10 == 8) {
                this.f22971d.a(bVar.f22977b, bVar.f22979d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void w() {
        this.f22974g.b(this.f22969b);
        int size = this.f22969b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f22969b.get(i10);
            int i11 = bVar.f22976a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f22972e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f22969b.clear();
    }

    public void x(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            b((b) list.get(i10));
        }
        list.clear();
    }

    public void y() {
        x(this.f22969b);
        x(this.f22970c);
        this.f22975h = 0;
    }

    public final int z(int i10, int i11) {
        int i12;
        int i13;
        for (int size = this.f22970c.size() - 1; size >= 0; size--) {
            b bVar = (b) this.f22970c.get(size);
            int i14 = bVar.f22976a;
            if (i14 == 8) {
                int i15 = bVar.f22977b;
                int i16 = bVar.f22979d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 < i13 || i10 > i12) {
                    if (i10 < i15) {
                        if (i11 == 1) {
                            bVar.f22977b = i15 + 1;
                            bVar.f22979d = i16 + 1;
                        } else if (i11 == 2) {
                            bVar.f22977b = i15 - 1;
                            bVar.f22979d = i16 - 1;
                        }
                    }
                } else if (i13 == i15) {
                    if (i11 == 1) {
                        bVar.f22979d = i16 + 1;
                    } else if (i11 == 2) {
                        bVar.f22979d = i16 - 1;
                    }
                    i10++;
                } else {
                    if (i11 == 1) {
                        bVar.f22977b = i15 + 1;
                    } else if (i11 == 2) {
                        bVar.f22977b = i15 - 1;
                    }
                    i10--;
                }
            } else {
                int i17 = bVar.f22977b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= bVar.f22979d;
                    } else if (i14 == 2) {
                        i10 += bVar.f22979d;
                    }
                } else if (i11 == 1) {
                    bVar.f22977b = i17 + 1;
                } else if (i11 == 2) {
                    bVar.f22977b = i17 - 1;
                }
            }
        }
        for (int size2 = this.f22970c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = (b) this.f22970c.get(size2);
            if (bVar2.f22976a == 8) {
                int i18 = bVar2.f22979d;
                if (i18 == bVar2.f22977b || i18 < 0) {
                    this.f22970c.remove(size2);
                    b(bVar2);
                }
            } else if (bVar2.f22979d <= 0) {
                this.f22970c.remove(size2);
                b(bVar2);
            }
        }
        return i10;
    }

    public a(InterfaceC0396a interfaceC0396a, boolean z10) {
        this.f22968a = new Pools$SimplePool(30);
        this.f22969b = new ArrayList();
        this.f22970c = new ArrayList();
        this.f22975h = 0;
        this.f22971d = interfaceC0396a;
        this.f22973f = z10;
        this.f22974g = new r(this);
    }
}
