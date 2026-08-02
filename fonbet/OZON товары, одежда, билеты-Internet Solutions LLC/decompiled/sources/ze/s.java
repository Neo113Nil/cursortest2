package ze;

import Sc.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.B0;
import xe.C10737n;
import xe.G;
import xe.M;
import xe.O;

/* loaded from: classes.dex */
public final class s {

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
    static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        u f108957d;

        /* renamed from: e, reason: collision with root package name */
        Function0 f108958e;

        /* renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108959f;

        /* renamed from: g, reason: collision with root package name */
        int f108960g;

        a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f108959f = obj;
            this.f108960g |= LinearLayoutManager.INVALID_OFFSET;
            return s.a(null, null, this);
        }
    }

    static final class b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ C10737n f108961a;

        b(C10737n c10737n) {
            this.f108961a = c10737n;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            r.Companion companion = Sc.r.INSTANCE;
            Unit unit = Unit.f71690a;
            this.f108961a.resumeWith(unit);
            return unit;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(@NotNull u<?> uVar, @NotNull Function0<Unit> function0, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a frame;
        int i11;
        try {
            if (dVar instanceof a) {
                frame = (a) dVar;
                int i12 = frame.f108960g;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    frame.f108960g = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = frame.f108959f;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = frame.f108960g;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        if (frame.getContext().get(B0.f105374o0) != uVar) {
                            throw new IllegalStateException("awaitClose() can only be invoked from the producer context");
                        }
                        frame.f108957d = uVar;
                        frame.f108958e = function0;
                        frame.f108960g = 1;
                        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
                        c10737n.o();
                        uVar.a(new b(c10737n));
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
                        function0 = frame.f108958e;
                        Sc.s.b(obj);
                    }
                    function0.invoke();
                    return Unit.f71690a;
                }
            }
            if (i11 != 0) {
            }
            function0.invoke();
            return Unit.f71690a;
        } catch (Throwable th2) {
            function0.invoke();
            throw th2;
        }
        frame = new a(dVar);
        Object obj2 = frame.f108959f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = frame.f108960g;
    }

    @NotNull
    public static final w c(@NotNull M m11, @NotNull CoroutineContext coroutineContext, int i11, @NotNull EnumC11113a enumC11113a, @NotNull O o11, @NotNull Function2 function2) {
        t tVar = new t(G.c(m11, coroutineContext), k.a(i11, 4, enumC11113a));
        tVar.y0(o11, tVar, function2);
        return tVar;
    }

    public static w d(M m11, int i11, Function2 function2, int i12) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f71771a;
        if ((i12 & 2) != 0) {
            i11 = 0;
        }
        return c(m11, gVar, i11, EnumC11113a.SUSPEND, O.DEFAULT, function2);
    }
}
