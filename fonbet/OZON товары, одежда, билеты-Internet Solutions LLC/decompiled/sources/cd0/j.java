package cd0;

import Jb0.r;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionFragment$observeViewModel$lambda$4$$inlined$repeatOnStarted$1", f = "PageSocialAdditionalOptionFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f56963d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f56964e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f56965f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ m f56966g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ r f56967h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageSocialAdditional.presentation.PageSocialAdditionalOptionFragment$observeViewModel$lambda$4$$inlined$repeatOnStarted$1$1", f = "PageSocialAdditionalOptionFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f56968d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f56969e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ m f56970f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f56971g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, n nVar, m mVar, r rVar) {
            super(2, dVar);
            this.f56969e = nVar;
            this.f56970f = mVar;
            this.f56971g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f56969e, this.f56970f, this.f56971g);
            aVar.f56968d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C10727i.c((M) this.f56968d, null, null, new k(this.f56969e.W0(), null, this.f56970f, this.f56971g), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(J j11, kotlin.coroutines.d dVar, n nVar, m mVar, r rVar) {
        super(2, dVar);
        this.f56964e = j11;
        this.f56965f = nVar;
        this.f56966g = mVar;
        this.f56967h = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f56964e, dVar, this.f56965f, this.f56966g, this.f56967h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f56963d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f56965f, this.f56966g, this.f56967h);
            this.f56963d = 1;
            if (C5412d0.b(this.f56964e, bVar, aVar2, this) == aVar) {
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
