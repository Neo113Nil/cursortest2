package Jc;

import Ic.AbstractC1350d;
import Ic.r;
import Jc.c;
import android.view.MotionEvent;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.Event;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d implements r {

    /* renamed from: a, reason: collision with root package name */
    public final ReactApplicationContext f6102a;

    /* renamed from: b, reason: collision with root package name */
    public final Hc.i f6103b;

    public d(ReactApplicationContext reactApplicationContext) {
        Intrinsics.checkNotNullParameter(reactApplicationContext, "reactApplicationContext");
        this.f6102a = reactApplicationContext;
        this.f6103b = new Hc.i();
    }

    @Override // Ic.r
    public void a(AbstractC1350d handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        f(handler);
    }

    @Override // Ic.r
    public void b(AbstractC1350d handler, MotionEvent event) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(event, "event");
        d(handler);
    }

    @Override // Ic.r
    public void c(AbstractC1350d handler, int i10, int i11) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        e(handler, i10, i11);
    }

    public final void d(AbstractC1350d abstractC1350d) {
        AbstractC1350d.c a10;
        if (abstractC1350d.T() < 0 || abstractC1350d.S() != 4 || (a10 = e.f6104a.a(abstractC1350d)) == null) {
            return;
        }
        int F10 = abstractC1350d.F();
        if (F10 == 1) {
            i(c.a.c(c.f6097d, abstractC1350d, a10.c(abstractC1350d), false, 4, null));
            return;
        }
        if (F10 == 2) {
            h(c.f6097d.b(abstractC1350d, a10.c(abstractC1350d), true));
        } else if (F10 == 3) {
            g("onGestureHandlerEvent", c.f6097d.a(a10.c(abstractC1350d)));
        } else {
            if (F10 != 4) {
                return;
            }
            g("onGestureHandlerEvent", c.f6097d.a(a10.c(abstractC1350d)));
        }
    }

    public final void e(AbstractC1350d abstractC1350d, int i10, int i11) {
        AbstractC1350d.c a10;
        if (abstractC1350d.T() >= 0 && (a10 = e.f6104a.a(abstractC1350d)) != null) {
            int F10 = abstractC1350d.F();
            if (F10 == 1) {
                i(m.f6127d.b(abstractC1350d, i10, i11, a10.c(abstractC1350d)));
                return;
            }
            if (F10 == 2 || F10 == 3) {
                g("onGestureHandlerStateChange", m.f6127d.a(a10.c(abstractC1350d), i10, i11));
            } else {
                if (F10 != 4) {
                    return;
                }
                g("onGestureHandlerStateChange", m.f6127d.a(a10.c(abstractC1350d), i10, i11));
            }
        }
    }

    public final void f(AbstractC1350d abstractC1350d) {
        if (abstractC1350d.T() < 0) {
            return;
        }
        if (abstractC1350d.S() == 2 || abstractC1350d.S() == 4 || abstractC1350d.S() == 0 || abstractC1350d.W() != null) {
            int F10 = abstractC1350d.F();
            if (F10 == 1) {
                i(n.f6132c.b(abstractC1350d));
            } else {
                if (F10 != 4) {
                    return;
                }
                g("onGestureHandlerEvent", n.f6132c.a(abstractC1350d));
            }
        }
    }

    public final void g(String str, WritableMap writableMap) {
        a.a(this.f6102a).emit(str, writableMap);
    }

    public final void h(c cVar) {
        Hc.h.a(this.f6102a, cVar);
    }

    public final void i(Event event) {
        this.f6103b.a(event, this.f6102a);
    }
}
