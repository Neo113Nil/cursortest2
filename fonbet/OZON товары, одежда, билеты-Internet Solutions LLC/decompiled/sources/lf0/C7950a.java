package lf0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.C5418g0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.navigation.core.integration.jetpack.ActivityScreenNavigator$addResultListener$1", f = "ActivityScreenNavigator.kt", l = {221}, m = "invokeSuspend")
/* renamed from: lf0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C7950a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f73279d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f73280e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C5418g0 f73281f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ String f73282g;

    /* renamed from: lf0.a$a, reason: collision with other inner class name */
    static final class C1235a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ M f73283a;

        C1235a(M m11) {
            this.f73283a = m11;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(Object obj, kotlin.coroutines.d dVar) {
            ((j) obj).getClass();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C7950a(C5418g0 c5418g0, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f73281f = c5418g0;
        this.f73282g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C7950a c7950a = new C7950a(this.f73281f, this.f73282g, dVar);
        c7950a.f73280e = obj;
        return c7950a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C7950a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f73279d;
        if (i11 == 0) {
            s.b(obj);
            M m11 = (M) this.f73280e;
            C2406m0 c2406m0 = new C2406m0(this.f73281f.d(this.f73282g));
            C1235a c1235a = new C1235a(m11);
            this.f73279d = 1;
            if (c2406m0.collect(c1235a, this) == aVar) {
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
