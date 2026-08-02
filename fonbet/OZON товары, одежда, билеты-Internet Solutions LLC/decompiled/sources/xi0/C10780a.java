package xi0;

import Sc.r;
import Sc.s;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10721f;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.tracker.debug.menu.shared.utils.CoroutinesKt$runParallelsBlocking$2", f = "Coroutines.kt", l = {15}, m = "invokeSuspend")
/* renamed from: xi0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10780a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f105578d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f105579e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function1[] f105580f;

    @e(c = "ru.ozon.tracker.debug.menu.shared.utils.CoroutinesKt$runParallelsBlocking$2$1$1", f = "Coroutines.kt", l = {12}, m = "invokeSuspend")
    /* renamed from: xi0.a$a, reason: collision with other inner class name */
    public static final class C2283a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f105581d;

        /* renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f105582e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Function1 f105583f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2283a(Function1 function1, kotlin.coroutines.d dVar) {
            super(2, dVar);
            this.f105583f = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C2283a c2283a = new C2283a(this.f105583f, dVar);
            c2283a.f105582e = obj;
            return c2283a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C2283a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105581d;
            try {
                if (i11 == 0) {
                    s.b(obj);
                    Function1 function1 = this.f105583f;
                    r.Companion companion = r.INSTANCE;
                    this.f105581d = 1;
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
    public C10780a(Function1[] function1Arr, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f105580f = function1Arr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C10780a c10780a = new C10780a(this.f105580f, dVar);
        c10780a.f105579e = obj;
        return c10780a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C10780a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f105578d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f105579e;
            Function1[] function1Arr = this.f105580f;
            ArrayList arrayList = new ArrayList(function1Arr.length);
            for (Function1 function1 : function1Arr) {
                arrayList.add(C10727i.c(m11, null, null, new C2283a(function1, null), 3));
            }
            this.f105578d = 1;
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
