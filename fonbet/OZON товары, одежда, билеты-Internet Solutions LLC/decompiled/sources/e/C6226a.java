package e;

import g.C6598j;
import kotlin.Unit;

/* renamed from: e.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C6226a<I> {

    /* renamed from: a, reason: collision with root package name */
    private C6598j f61680a;

    public final void a(Object obj) {
        Unit unit;
        C6598j c6598j = this.f61680a;
        if (c6598j != null) {
            c6598j.a(obj);
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void b(C6598j c6598j) {
        this.f61680a = c6598j;
    }

    public final void c() {
        Unit unit;
        C6598j c6598j = this.f61680a;
        if (c6598j != null) {
            c6598j.b();
            unit = Unit.f71690a;
        } else {
            unit = null;
        }
        if (unit == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}
