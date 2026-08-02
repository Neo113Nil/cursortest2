package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public abstract class t45 {
    public static final ih2 a;
    public static final ih2 b;

    static {
        int i = 5;
        a = new ih2("UNDEFINED", i);
        b = new ih2("REUSABLE_CLAIMED", i);
    }

    public static final void a(rq3 rq3Var, Object obj) {
        if (!(rq3Var instanceof s45)) {
            rq3Var.resumeWith(obj);
            return;
        }
        s45 s45Var = (s45) rq3Var;
        au3 au3Var = s45Var.d;
        sq3 sq3Var = s45Var.e;
        Throwable a2 = w2g.a(obj);
        Object eb3Var = a2 == null ? obj : new eb3(a2, false);
        if (c(au3Var, sq3Var.getContext())) {
            s45Var.f = eb3Var;
            s45Var.c = 1;
            b(au3Var, sq3Var.getContext(), s45Var);
            return;
        }
        g26 a3 = cgj.a();
        if (a3.c >= 4294967296L) {
            s45Var.f = eb3Var;
            s45Var.c = 1;
            a3.j0(s45Var);
            return;
        }
        a3.n0(true);
        try {
            yda ydaVar = (yda) sq3Var.getContext().get(uic.g);
            if (ydaVar == null || ydaVar.isActive()) {
                Object obj2 = s45Var.g;
                CoroutineContext context = sq3Var.getContext();
                Object c = yfj.c(context, obj2);
                x9k c2 = c != yfj.a ? yt3.c(sq3Var, context, c) : null;
                try {
                    sq3Var.resumeWith(obj);
                    Unit unit = Unit.a;
                } finally {
                    if (c2 == null || c2.n0()) {
                        yfj.a(context, c);
                    }
                }
            } else {
                s45Var.resumeWith(y6a.x(ydaVar.k()));
            }
            while (a3.u0()) {
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void b(au3 au3Var, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            au3Var.i(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new q45(th, au3Var, coroutineContext);
        }
    }

    public static final boolean c(au3 au3Var, CoroutineContext coroutineContext) {
        try {
            return au3Var.e0(coroutineContext);
        } catch (Throwable th) {
            throw new q45(th, au3Var, coroutineContext);
        }
    }
}
