package cd0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import Jb0.r;
import Sc.s;
import dd0.C6181a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionFragment$observeViewModel$lambda$4$lambda$3$$inlined$collectFlow$1", f = "PageSocialAdditionalOptionFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class k extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56972d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f56973e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ m f56974f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ r f56975g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ m f56976a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f56977b;

        public a(m mVar, r rVar) {
            this.f56976a = mVar;
            this.f56977b = rVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            m.w(this.f56976a, this.f56977b, (C6181a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(C2406m0 c2406m0, kotlin.coroutines.d dVar, m mVar, r rVar) {
        super(2, dVar);
        this.f56973e = c2406m0;
        this.f56974f = mVar;
        this.f56975g = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new k(this.f56973e, dVar, this.f56974f, this.f56975g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((k) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56972d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f56974f, this.f56975g);
            this.f56972d = 1;
            if (this.f56973e.collect(aVar2, this) == aVar) {
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
