package defpackage;

import android.os.Trace;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fce {
    public final sg3 a;
    public final mg3 b;
    public final av8 c;
    public final Function2 d;
    public final boolean e;
    public final y0 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(hce.c);
    public long i = waa.v();
    public y0d j;
    public final qn2 k;
    public final hcc l;

    public fce(sg3 sg3Var, mg3 mg3Var, av8 av8Var, a1d a1dVar, Function2 function2, boolean z, y0 y0Var, Object obj) {
        this.a = sg3Var;
        this.b = mg3Var;
        this.c = av8Var;
        this.d = function2;
        this.e = z;
        this.f = y0Var;
        this.g = obj;
        y0d y0dVar = rrg.a;
        y0dVar.getClass();
        this.j = y0dVar;
        qn2 qn2Var = new qn2(2);
        qn2Var.m(a1dVar, av8Var.C());
        this.k = qn2Var;
        this.l = new hcc(y0Var.b);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (((hce) atomicReference.get()).ordinal()) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                case 3:
                case 4:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 5:
                    b();
                    hce hceVar = hce.f;
                    hce hceVar2 = hce.g;
                    while (!atomicReference.compareAndSet(hceVar, hceVar2)) {
                        if (atomicReference.get() != hceVar) {
                            h3f.b("Unexpected state change from: " + hceVar + " to: " + hceVar2 + '.');
                            return;
                        }
                    }
                    return;
                case 6:
                    throw new IllegalStateException("The paused composition has already been applied");
                default:
                    throw new ndd();
            }
        } catch (Exception e) {
            atomicReference.set(hce.a);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.U(this.f, this.k);
                    this.k.f();
                    this.k.g();
                    this.k.e();
                    this.a.q = null;
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    this.k.e();
                    this.a.q = null;
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final boolean c() {
        return ((hce) this.h.get()).compareTo(hce.f) >= 0;
    }

    public final void d() {
        AtomicReference atomicReference;
        hce hceVar = hce.d;
        hce hceVar2 = hce.f;
        do {
            atomicReference = this.h;
            if (atomicReference.compareAndSet(hceVar, hceVar2)) {
                return;
            }
        } while (atomicReference.get() == hceVar);
        h3f.b("Unexpected state change from: " + hceVar + " to: " + hceVar2 + '.');
    }

    public final boolean e(vfh vfhVar) {
        AtomicReference atomicReference = this.h;
        try {
            int ordinal = ((hce) atomicReference.get()).ordinal();
            sg3 sg3Var = this.a;
            mg3 mg3Var = this.b;
            switch (ordinal) {
                case 0:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                case 1:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 2:
                    av8 av8Var = this.c;
                    boolean z = this.e;
                    if (z) {
                        av8Var.z = 0;
                        av8Var.y = true;
                    }
                    try {
                        this.j = mg3Var.b(sg3Var, vfhVar, this.d);
                        hce hceVar = hce.c;
                        hce hceVar2 = hce.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(hceVar, hceVar2)) {
                                if (atomicReference.get() != hceVar) {
                                    h3f.b("Unexpected state change from: " + hceVar + " to: " + hceVar2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } finally {
                        if (z) {
                            av8Var.v();
                        }
                    }
                case 3:
                    hce hceVar3 = hce.d;
                    hce hceVar4 = hce.e;
                    while (true) {
                        if (!atomicReference.compareAndSet(hceVar3, hceVar4)) {
                            if (atomicReference.get() != hceVar3) {
                                h3f.b("Unexpected state change from: " + hceVar3 + " to: " + hceVar4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = waa.v();
                        this.j = mg3Var.q(sg3Var, vfhVar, this.j);
                        this.i = j;
                        hce hceVar5 = hce.e;
                        hce hceVar6 = hce.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(hceVar5, hceVar6)) {
                                if (atomicReference.get() != hceVar5) {
                                    h3f.b("Unexpected state change from: " + hceVar5 + " to: " + hceVar6 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            d();
                        }
                        return c();
                    } catch (Throwable th) {
                        this.i = j;
                        hce hceVar7 = hce.e;
                        hce hceVar8 = hce.d;
                        while (true) {
                            if (!atomicReference.compareAndSet(hceVar7, hceVar8)) {
                                if (atomicReference.get() != hceVar7) {
                                    h3f.b("Unexpected state change from: " + hceVar7 + " to: " + hceVar8 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 4:
                    sf3.b("Recursive call to resume()");
                    throw new fka();
                case 5:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been applied");
                default:
                    throw new ndd();
            }
        } catch (Exception e) {
            atomicReference.set(hce.a);
            throw e;
        }
    }
}
