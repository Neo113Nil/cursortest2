package androidx.media3.effect;

import androidx.media3.effect.i;
import androidx.media3.effect.r;
import b1.C2368w;
import b1.InterfaceC2367v;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import l1.C5367l0;
import l1.Z0;

/* loaded from: classes.dex */
public final class h implements i.b {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2367v f20779a;

    /* renamed from: b, reason: collision with root package name */
    public final i f20780b;

    /* renamed from: c, reason: collision with root package name */
    public final r f20781c;

    /* renamed from: d, reason: collision with root package name */
    public final Queue f20782d = new ArrayDeque();

    /* renamed from: e, reason: collision with root package name */
    public int f20783e;

    public h(InterfaceC2367v interfaceC2367v, i iVar, r rVar) {
        this.f20779a = interfaceC2367v;
        this.f20780b = iVar;
        this.f20781c = rVar;
    }

    @Override // androidx.media3.effect.i.b
    public synchronized void a() {
        this.f20783e = 0;
        this.f20782d.clear();
    }

    @Override // androidx.media3.effect.i.b
    public synchronized void e() {
        final Z0 z02 = (Z0) this.f20782d.poll();
        if (z02 == null) {
            this.f20783e++;
            return;
        }
        this.f20781c.j(new r.b() { // from class: l1.n0
            @Override // androidx.media3.effect.r.b
            public final void run() {
                r0.f20780b.c(androidx.media3.effect.h.this.f20779a, r1.f55483a, z02.f55484b);
            }
        });
        Z0 z03 = (Z0) this.f20782d.peek();
        if (z03 != null && z03.f55484b == Long.MIN_VALUE) {
            r rVar = this.f20781c;
            i iVar = this.f20780b;
            Objects.requireNonNull(iVar);
            rVar.j(new C5367l0(iVar));
            this.f20782d.remove();
        }
    }

    public synchronized int f() {
        return this.f20782d.size();
    }

    public synchronized void g(final C2368w c2368w, final long j10) {
        try {
            if (this.f20783e > 0) {
                this.f20781c.j(new r.b() { // from class: l1.m0
                    @Override // androidx.media3.effect.r.b
                    public final void run() {
                        r0.f20780b.c(androidx.media3.effect.h.this.f20779a, c2368w, j10);
                    }
                });
                this.f20783e--;
            } else {
                this.f20782d.add(new Z0(c2368w, j10));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void h() {
        try {
            if (this.f20782d.isEmpty()) {
                r rVar = this.f20781c;
                i iVar = this.f20780b;
                Objects.requireNonNull(iVar);
                rVar.j(new C5367l0(iVar));
            } else {
                this.f20782d.add(new Z0(C2368w.f24634f, Long.MIN_VALUE));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
