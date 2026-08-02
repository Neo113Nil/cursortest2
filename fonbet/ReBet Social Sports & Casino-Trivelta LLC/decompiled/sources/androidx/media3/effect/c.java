package androidx.media3.effect;

import androidx.media3.effect.i;
import androidx.media3.effect.r;
import b1.C2368w;
import b1.InterfaceC2367v;
import e1.AbstractC4134a;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements i.b, i.c {

    /* renamed from: a, reason: collision with root package name */
    public final i f20682a;

    /* renamed from: b, reason: collision with root package name */
    public final h f20683b;

    /* renamed from: c, reason: collision with root package name */
    public final r f20684c;

    public c(InterfaceC2367v interfaceC2367v, i iVar, i iVar2, r rVar) {
        AbstractC4134a.b(iVar != iVar2, "Creating a self loop in the chain: " + iVar);
        this.f20682a = iVar;
        this.f20683b = new h(interfaceC2367v, iVar2, rVar);
        this.f20684c = rVar;
    }

    @Override // androidx.media3.effect.i.b
    public synchronized void a() {
        this.f20683b.a();
        r rVar = this.f20684c;
        final i iVar = this.f20682a;
        Objects.requireNonNull(iVar);
        rVar.j(new r.b() { // from class: l1.k
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.i.this.flush();
            }
        });
    }

    @Override // androidx.media3.effect.i.b
    public void b(final C2368w c2368w) {
        this.f20684c.j(new r.b() { // from class: l1.j
            @Override // androidx.media3.effect.r.b
            public final void run() {
                androidx.media3.effect.c.this.f20682a.m(c2368w);
            }
        });
    }

    @Override // androidx.media3.effect.i.c
    public synchronized void c() {
        this.f20683b.h();
    }

    @Override // androidx.media3.effect.i.c
    public synchronized void d(C2368w c2368w, long j10) {
        this.f20683b.g(c2368w, j10);
    }

    @Override // androidx.media3.effect.i.b
    public synchronized void e() {
        this.f20683b.e();
    }
}
