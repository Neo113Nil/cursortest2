package xe;

import Sc.C4005g;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import ve.EnumC10311b;

/* loaded from: classes.dex */
public final class Y {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Wc.a a(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        X frame;
        int i11;
        if (cVar instanceof X) {
            frame = (X) cVar;
            int i12 = frame.f105422e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                frame.f105422e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = frame.f105421d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = frame.f105422e;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    frame.f105422e = 1;
                    C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                    c10737n.o();
                    Object n11 = c10737n.n();
                    if (n11 == aVar) {
                        Intrinsics.checkNotNullParameter(frame, "frame");
                    }
                    if (n11 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                throw new C4005g();
            }
        }
        frame = new X(cVar);
        Object obj2 = frame.f105421d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f105422e;
        if (i11 != 0) {
        }
        throw new C4005g();
    }

    public static final Object b(long j11, @NotNull kotlin.coroutines.d<? super Unit> frame) {
        if (j11 <= 0) {
            return Unit.f71690a;
        }
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        if (j11 < Long.MAX_VALUE) {
            d(c10737n.getContext()).o(j11, c10737n);
        }
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    public static final Object c(long j11, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object b11 = b(e(j11), dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    @NotNull
    public static final W d(@NotNull CoroutineContext coroutineContext) {
        CoroutineContext.Element element = coroutineContext.get(kotlin.coroutines.e.INSTANCE);
        W w11 = element instanceof W ? (W) element : null;
        return w11 == null ? T.a() : w11;
    }

    public static final long e(long j11) {
        b.Companion companion = kotlin.time.b.INSTANCE;
        boolean z11 = j11 > 0;
        if (z11) {
            return kotlin.time.b.h(kotlin.time.b.l(j11, kotlin.time.c.h(999999L, EnumC10311b.NANOSECONDS)));
        }
        if (z11) {
            throw new Sc.o();
        }
        return 0L;
    }
}
