package xe;

import De.C2866i;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class l1 {
    public static final Object a(@NotNull kotlin.coroutines.d<? super Unit> frame) {
        Object obj;
        CoroutineContext context = frame.getContext();
        E0.f(context);
        kotlin.coroutines.d b11 = Wc.b.b(frame);
        C2866i c2866i = b11 instanceof C2866i ? (C2866i) b11 : null;
        if (c2866i == null) {
            obj = Unit.f71690a;
        } else {
            I i11 = c2866i.f6623d;
            if (i11.t(context)) {
                c2866i.f6625f = Unit.f71690a;
                c2866i.f105427c = 1;
                i11.r(context, c2866i);
            } else {
                k1 k1Var = new k1();
                CoroutineContext plus = context.plus(k1Var);
                Unit unit = Unit.f71690a;
                c2866i.f6625f = unit;
                c2866i.f105427c = 1;
                i11.r(plus, c2866i);
                if (k1Var.f105476a) {
                    AbstractC10732k0 b12 = Z0.b();
                    if (!b12.K0()) {
                        if (b12.H0()) {
                            c2866i.f6625f = unit;
                            c2866i.f105427c = 1;
                            b12.z(c2866i);
                            obj = Wc.a.COROUTINE_SUSPENDED;
                        } else {
                            b12.E0(true);
                            try {
                                c2866i.run();
                                do {
                                } while (b12.M0());
                            } finally {
                                try {
                                } finally {
                                }
                            }
                        }
                    }
                    obj = Unit.f71690a;
                }
            }
            obj = Wc.a.COROUTINE_SUSPENDED;
        }
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (obj == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return obj == aVar ? obj : Unit.f71690a;
    }
}
