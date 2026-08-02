package i70;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment$observeUiState$$inlined$observe$1", f = "OfflinePayFragment.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f65968d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f65969e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ OfflinePayFragment f65970f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f65971g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ OfflinePayFragment f65972h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.pay.OfflinePayFragment$observeUiState$$inlined$observe$1$1", f = "OfflinePayFragment.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f65973d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f65974e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OfflinePayFragment f65975f;

        /* renamed from: i70.f$a$a, reason: collision with other inner class name */
        public static final class C1084a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OfflinePayFragment f65976a;

            public C1084a(OfflinePayFragment offlinePayFragment) {
                this.f65976a = offlinePayFragment;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                j70.g gVar = (j70.g) t2;
                if (gVar != null) {
                    OfflinePayFragment.B(this.f65976a, gVar);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflinePayFragment offlinePayFragment) {
            super(2, dVar);
            this.f65974e = interfaceC2395h;
            this.f65975f = offlinePayFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f65974e, dVar, this.f65975f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f65973d;
            if (i11 == 0) {
                s.b(obj);
                C1084a c1084a = new C1084a(this.f65975f);
                this.f65973d = 1;
                if (this.f65974e.collect(c1084a, this) == aVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(OfflinePayFragment offlinePayFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflinePayFragment offlinePayFragment2) {
        super(2, dVar);
        this.f65970f = offlinePayFragment;
        this.f65971g = interfaceC2395h;
        this.f65972h = offlinePayFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        f fVar = new f(this.f65970f, this.f65971g, dVar, this.f65972h);
        fVar.f65969e = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f65968d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f65969e)) {
                J viewLifecycleOwner = this.f65970f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f65971g, null, this.f65972h);
                this.f65968d = 1;
                if (C5412d0.b(viewLifecycleOwner, bVar, aVar2, this) == aVar) {
                    return aVar;
                }
            }
            return Unit.f71690a;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        return Unit.f71690a;
    }
}
