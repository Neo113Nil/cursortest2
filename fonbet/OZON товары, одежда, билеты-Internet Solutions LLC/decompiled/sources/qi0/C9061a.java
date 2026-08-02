package qi0;

import Sc.r;
import Sc.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.utils.CoroutinesKt$runParallelsBlocking$2", f = "Coroutines.kt", l = {15}, m = "invokeSuspend")
/* renamed from: qi0.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9061a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f82120d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f82121e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1[] f82122f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.debug.menu.shared.utils.CoroutinesKt$runParallelsBlocking$2$1$1", f = "Coroutines.kt", l = {12}, m = "invokeSuspend")
    /* renamed from: qi0.a$a, reason: collision with other inner class name */
    public static final class C1394a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f82123d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f82124e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f82125f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1394a(Function1 function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f82125f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C1394a c1394a = new C1394a(this.f82125f, dVar);
            c1394a.f82124e = obj;
            return c1394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1394a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f82123d;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    Function1 function1 = this.f82125f;
                    r.Companion companion = r.INSTANCE;
                    this.f82123d = 1;
                    if (function1.invoke(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                Unit unit = Unit.f71690a;
                r.Companion companion2 = r.INSTANCE;
            } catch (Throwable th2) {
                r.Companion companion3 = r.INSTANCE;
                s.a(th2);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9061a(Function1[] function1Arr, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f82122f = function1Arr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C9061a c9061a = new C9061a(this.f82122f, dVar);
        c9061a.f82121e = obj;
        return c9061a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C9061a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f82120d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f82121e;
            Function1[] function1Arr = this.f82122f;
            ArrayList arrayList = new ArrayList(function1Arr.length);
            for (Function1 function1 : function1Arr) {
                arrayList.add(C10727i.c(m11, null, null, new C1394a(function1, null), 3));
            }
            this.f82120d = 1;
            if (C10721f.c(arrayList, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
