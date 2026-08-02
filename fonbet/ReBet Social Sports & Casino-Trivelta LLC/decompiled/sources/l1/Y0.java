package l1;

import b1.C2368w;
import b1.InterfaceC2367v;
import e1.AbstractC4134a;
import e1.AbstractC4151s;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Y0 {

    /* renamed from: a, reason: collision with root package name */
    public final Deque f55478a;

    /* renamed from: b, reason: collision with root package name */
    public final Deque f55479b;

    /* renamed from: c, reason: collision with root package name */
    public final int f55480c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f55481d;

    public Y0(boolean z10, int i10) {
        this.f55480c = i10;
        this.f55481d = z10;
        this.f55478a = new ArrayDeque(i10);
        this.f55479b = new ArrayDeque(i10);
    }

    public int a() {
        return this.f55480c;
    }

    public final void b(InterfaceC2367v interfaceC2367v, int i10, int i11) {
        AbstractC4134a.g(this.f55478a.isEmpty());
        AbstractC4134a.g(this.f55479b.isEmpty());
        for (int i12 = 0; i12 < this.f55480c; i12++) {
            this.f55478a.add(interfaceC2367v.b(AbstractC4151s.r(i10, i11, this.f55481d), i10, i11));
        }
    }

    public void c() {
        Iterator i10 = i();
        while (i10.hasNext()) {
            ((C2368w) i10.next()).a();
        }
        this.f55478a.clear();
        this.f55479b.clear();
    }

    public void d(InterfaceC2367v interfaceC2367v, int i10, int i11) {
        if (!k()) {
            b(interfaceC2367v, i10, i11);
            return;
        }
        C2368w c2368w = (C2368w) i().next();
        if (c2368w.f24638d == i10 && c2368w.f24639e == i11) {
            return;
        }
        c();
        b(interfaceC2367v, i10, i11);
    }

    public void e() {
        this.f55478a.addAll(this.f55479b);
        this.f55479b.clear();
    }

    public void f() {
        AbstractC4134a.g(!this.f55479b.isEmpty());
        this.f55478a.add((C2368w) this.f55479b.remove());
    }

    public void g(C2368w c2368w) {
        AbstractC4134a.g(this.f55479b.contains(c2368w));
        this.f55479b.remove(c2368w);
        this.f55478a.add(c2368w);
    }

    public int h() {
        return !k() ? this.f55480c : this.f55478a.size();
    }

    public final Iterator i() {
        return com.google.common.collect.I.c(this.f55478a, this.f55479b).iterator();
    }

    public C2368w j() {
        if (this.f55479b.isEmpty()) {
            return null;
        }
        return (C2368w) this.f55479b.getLast();
    }

    public boolean k() {
        return i().hasNext();
    }

    public boolean l(C2368w c2368w) {
        return this.f55479b.contains(c2368w);
    }

    public C2368w m() {
        if (this.f55478a.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        C2368w c2368w = (C2368w) this.f55478a.remove();
        this.f55479b.add(c2368w);
        return c2368w;
    }
}
