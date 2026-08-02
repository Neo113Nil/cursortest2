package u5;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import android.view.View;
import android.view.Window;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.C;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.x;
import s5.C6339a;
import y5.C6855b;
import z5.AbstractC6930a;

/* renamed from: u5.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6523d implements InterfaceC6524e {

    /* renamed from: a, reason: collision with root package name */
    public static final C6523d f66138a;

    /* renamed from: b, reason: collision with root package name */
    public static final P f66139b;

    /* renamed from: c, reason: collision with root package name */
    public static final x f66140c;

    /* renamed from: d, reason: collision with root package name */
    public static final C f66141d;

    /* renamed from: e, reason: collision with root package name */
    public static final x f66142e;

    /* renamed from: f, reason: collision with root package name */
    public static final C f66143f;

    /* renamed from: g, reason: collision with root package name */
    public static final Lazy f66144g;

    /* renamed from: h, reason: collision with root package name */
    public static C6855b f66145h;

    /* renamed from: i, reason: collision with root package name */
    public static final C6525f f66146i;

    /* renamed from: u5.d$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f66147n;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((a) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f66147n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            try {
                C6525f.m(C6523d.f66146i, false, 1, null);
            } catch (Throwable th2) {
                E5.b.f3006a.c("Failed to start layout observer", th2);
            }
            return Unit.INSTANCE;
        }
    }

    /* renamed from: u5.d$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f66148n;

        /* renamed from: u5.d$b$a */
        public static final class a implements InterfaceC5322g {

            /* renamed from: a, reason: collision with root package name */
            public static final a f66149a = new a();

            @Override // kotlinx.coroutines.flow.InterfaceC5322g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(y5.e eVar, Continuation continuation) {
                Object emit = C6523d.f66142e.emit(eVar, continuation);
                return emit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : Unit.INSTANCE;
            }
        }

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((b) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f66148n;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5321f k10 = AbstractC5323h.k(C6523d.f66146i.k());
                    a aVar = a.f66149a;
                    this.f66148n = 1;
                    if (k10.collect(aVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            } catch (Throwable th2) {
                E5.b.f3006a.c("Error collecting hierarchy flow", th2);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        C6523d c6523d = new C6523d();
        f66138a = c6523d;
        P a10 = C6339a.f64787a.a();
        f66139b = a10;
        x b10 = E.b(1, 0, null, 6, null);
        f66140c = b10;
        f66141d = AbstractC5323h.a(b10);
        x b11 = E.b(1, 0, null, 6, null);
        f66142e = b11;
        f66143f = AbstractC5323h.a(b11);
        f66144g = LazyKt.lazy(new Function0() { // from class: u5.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                h n10;
                n10 = C6523d.n();
                return n10;
            }
        });
        f66145h = new C6855b(false, null, false, null, 15, null);
        f66146i = new C6525f(a10, new Function0() { // from class: u5.b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                y5.e l10;
                l10 = C6523d.l();
                return l10;
            }
        }, 1);
        c6523d.k().c().add(new b5.d() { // from class: u5.c
            @Override // b5.d
            public final void a(Object obj) {
                C6523d.e((List) obj);
            }
        });
        c6523d.m();
        AbstractC1459k.d(a10, C1452g0.c(), null, new a(null), 2, null);
        AbstractC1459k.d(a10, null, null, new b(null), 3, null);
    }

    public static final void e(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        f66138a.m();
    }

    public static final y5.e l() {
        return f66138a.a();
    }

    public static final h n() {
        return h.f66166c.b();
    }

    @Override // u5.InterfaceC6524e
    public y5.e a() {
        return p(AbstractC6930a.h(k().b()));
    }

    public final C h() {
        return f66141d;
    }

    public final C6855b i() {
        return f66145h;
    }

    public final List j() {
        return k().b();
    }

    public final h k() {
        return (h) f66144g.getValue();
    }

    public final void m() {
        x xVar = f66140c;
        List b10 = k().b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b10.iterator();
        while (it.hasNext()) {
            Window f10 = AbstractC6930a.f((View) it.next());
            if (f10 != null) {
                arrayList.add(f10);
            }
        }
        xVar.a(CollectionsKt.toList(arrayList));
    }

    public final void o(C6855b c6855b) {
        Intrinsics.checkNotNullParameter(c6855b, "<set-?>");
        f66145h = c6855b;
    }

    public final y5.e p(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6930a.i((View) it.next()));
        }
        return new y5.e(arrayList);
    }
}
