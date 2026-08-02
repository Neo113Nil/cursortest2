package g70;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment;
import xe.M;
import xe.N;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment$observeUiState$$inlined$observe$1", f = "OfflineMainFragment.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f63943d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f63944e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ OfflineMainFragment f63945f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f63946g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ OfflineMainFragment f63947h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.features.offline.presentation.main.OfflineMainFragment$observeUiState$$inlined$observe$1$1", f = "OfflineMainFragment.kt", l = {34}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f63948d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ InterfaceC2395h f63949e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ OfflineMainFragment f63950f;

        /* renamed from: g70.b$a$a, reason: collision with other inner class name */
        public static final class C1036a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OfflineMainFragment f63951a;

            public C1036a(OfflineMainFragment offlineMainFragment) {
                this.f63951a = offlineMainFragment;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // Ae.InterfaceC2397i
            public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
                h70.a aVar = (h70.a) t2;
                if (aVar != null) {
                    OfflineMainFragment.x(this.f63951a, aVar);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflineMainFragment offlineMainFragment) {
            super(2, dVar);
            this.f63949e = interfaceC2395h;
            this.f63950f = offlineMainFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f63949e, dVar, this.f63950f);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f63948d;
            if (i11 == 0) {
                s.b(obj);
                C1036a c1036a = new C1036a(this.f63950f);
                this.f63948d = 1;
                if (this.f63949e.collect(c1036a, this) == aVar) {
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
    public b(OfflineMainFragment offlineMainFragment, InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, OfflineMainFragment offlineMainFragment2) {
        super(2, dVar);
        this.f63945f = offlineMainFragment;
        this.f63946g = interfaceC2395h;
        this.f63947h = offlineMainFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        b bVar = new b(this.f63945f, this.f63946g, dVar, this.f63947h);
        bVar.f63944e = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f63943d;
        if (i11 == 0) {
            s.b(obj);
            if (N.f((M) this.f63944e)) {
                J viewLifecycleOwner = this.f63945f.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
                a aVar2 = new a(this.f63946g, null, this.f63947h);
                this.f63943d = 1;
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
