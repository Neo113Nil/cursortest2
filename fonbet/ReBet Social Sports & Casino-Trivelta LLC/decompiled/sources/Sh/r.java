package Sh;

import f0.AbstractC4221b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes5.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10809a = AtomicReferenceFieldUpdater.newUpdater(r.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile;

    public r(boolean z10) {
        this._cur$volatile = new C1580s(8, z10);
    }

    public final boolean a(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10809a;
        while (true) {
            C1580s c1580s = (C1580s) atomicReferenceFieldUpdater.get(this);
            int a10 = c1580s.a(obj);
            if (a10 == 0) {
                return true;
            }
            if (a10 == 1) {
                AbstractC4221b.a(f10809a, this, c1580s, c1580s.l());
            } else if (a10 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10809a;
        while (true) {
            C1580s c1580s = (C1580s) atomicReferenceFieldUpdater.get(this);
            if (c1580s.d()) {
                return;
            } else {
                AbstractC4221b.a(f10809a, this, c1580s, c1580s.l());
            }
        }
    }

    public final int c() {
        return ((C1580s) f10809a.get(this)).g();
    }

    public final Object e() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f10809a;
        while (true) {
            C1580s c1580s = (C1580s) atomicReferenceFieldUpdater.get(this);
            Object m10 = c1580s.m();
            if (m10 != C1580s.f10813h) {
                return m10;
            }
            AbstractC4221b.a(f10809a, this, c1580s, c1580s.l());
        }
    }
}
