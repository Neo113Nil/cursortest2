package ru.ozon.app.android.composer.configurators;

import Ae.B0;
import Ae.C2399j;
import Ib0.b;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.composer.configurators.VKIDRefreshStateConfigurator$onResume$1", f = "VKIDRefreshStateConfigurator.kt", l = {22}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class VKIDRefreshStateConfigurator$onResume$1 extends j implements Function2<M, d<? super Unit>, Object> {
    int label;
    final /* synthetic */ VKIDRefreshStateConfigurator this$0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LIb0/b;", "it", "", "<anonymous>", "(LIb0/b;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.composer.configurators.VKIDRefreshStateConfigurator$onResume$1$1", f = "VKIDRefreshStateConfigurator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.composer.configurators.VKIDRefreshStateConfigurator$onResume$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<b, d<? super Unit>, Object> {
        int label;
        final /* synthetic */ VKIDRefreshStateConfigurator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(VKIDRefreshStateConfigurator vKIDRefreshStateConfigurator, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = vKIDRefreshStateConfigurator;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(b bVar, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(bVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.this$0.refreshPage();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VKIDRefreshStateConfigurator$onResume$1(VKIDRefreshStateConfigurator vKIDRefreshStateConfigurator, d<? super VKIDRefreshStateConfigurator$onResume$1> dVar) {
        super(2, dVar);
        this.this$0 = vKIDRefreshStateConfigurator;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new VKIDRefreshStateConfigurator$onResume$1(this.this$0, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ob0.a aVar;
        a aVar2 = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            aVar = this.this$0.ozonIdAppApi;
            B0<b> d11 = aVar.n().d();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (C2399j.h(d11, anonymousClass1, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((VKIDRefreshStateConfigurator$onResume$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
