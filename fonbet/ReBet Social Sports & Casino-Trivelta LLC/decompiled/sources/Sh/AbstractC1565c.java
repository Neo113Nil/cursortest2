package Sh;

import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Sh.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1565c {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10783a = AtomicReferenceFieldUpdater.newUpdater(AbstractC1565c.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10784b = AtomicReferenceFieldUpdater.newUpdater(AbstractC1565c.class, Object.class, "_prev$volatile");
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ Object _prev$volatile;

    public AbstractC1565c(AbstractC1565c abstractC1565c) {
        this._prev$volatile = abstractC1565c;
    }

    public final void c() {
        f10784b.set(this, null);
    }

    public final AbstractC1565c d() {
        AbstractC1565c h10 = h();
        while (h10 != null && h10.k()) {
            h10 = (AbstractC1565c) f10784b.get(h10);
        }
        return h10;
    }

    public final AbstractC1565c e() {
        AbstractC1565c f10;
        AbstractC1565c f11 = f();
        Intrinsics.checkNotNull(f11);
        while (f11.k() && (f10 = f11.f()) != null) {
            f11 = f10;
        }
        return f11;
    }

    public final AbstractC1565c f() {
        Object g10 = g();
        if (g10 == AbstractC1564b.f10782a) {
            return null;
        }
        return (AbstractC1565c) g10;
    }

    public final Object g() {
        return f10783a.get(this);
    }

    public final AbstractC1565c h() {
        return (AbstractC1565c) f10784b.get(this);
    }

    public abstract boolean k();

    public final boolean l() {
        return f() == null;
    }

    public final boolean m() {
        return AbstractC4221b.a(f10783a, this, null, AbstractC1564b.f10782a);
    }

    public final void n() {
        Object obj;
        if (l()) {
            return;
        }
        while (true) {
            AbstractC1565c d10 = d();
            AbstractC1565c e10 = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10784b;
            do {
                obj = atomicReferenceFieldUpdater.get(e10);
            } while (!AbstractC4221b.a(atomicReferenceFieldUpdater, e10, obj, ((AbstractC1565c) obj) == null ? null : d10));
            if (d10 != null) {
                f10783a.set(d10, e10);
            }
            if (!e10.k() || e10.l()) {
                if (d10 == null || !d10.k()) {
                    return;
                }
            }
        }
    }

    public final boolean o(AbstractC1565c abstractC1565c) {
        return AbstractC4221b.a(f10783a, this, null, abstractC1565c);
    }
}
