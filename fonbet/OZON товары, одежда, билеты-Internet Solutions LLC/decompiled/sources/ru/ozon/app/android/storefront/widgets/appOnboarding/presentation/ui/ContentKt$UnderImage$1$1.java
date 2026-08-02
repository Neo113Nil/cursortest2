package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import S0.InterfaceC3970l0;
import S0.n1;
import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import xe.M;
import y0.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$UnderImage$1$1", f = "Content.kt", l = {121}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContentKt$UnderImage$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ InterfaceC3970l0 $rotation$delegate;
    int label;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$UnderImage$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Float> {
        final /* synthetic */ b0 $pagerState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(b0 b0Var) {
            super(0);
            this.$pagerState = b0Var;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(this.$pagerState.s());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "offset", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$UnderImage$1$1$2", f = "Content.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$UnderImage$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements Function2<Float, d<? super Unit>, Object> {
        final /* synthetic */ b0 $pagerState;
        final /* synthetic */ InterfaceC3970l0 $rotation$delegate;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(b0 b0Var, InterfaceC3970l0 interfaceC3970l0, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$pagerState = b0Var;
            this.$rotation$delegate = interfaceC3970l0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$pagerState, this.$rotation$delegate, dVar);
            anonymousClass2.F$0 = ((Number) obj).floatValue();
            return anonymousClass2;
        }

        public final Object invoke(float f7, d<? super Unit> dVar) {
            return ((AnonymousClass2) create(Float.valueOf(f7), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            this.$rotation$delegate.h((this.F$0 * (-75.0f)) + (this.$pagerState.r() * (-75.0f)));
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f7, d<? super Unit> dVar) {
            return invoke(f7.floatValue(), dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentKt$UnderImage$1$1(b0 b0Var, InterfaceC3970l0 interfaceC3970l0, d<? super ContentKt$UnderImage$1$1> dVar) {
        super(2, dVar);
        this.$pagerState = b0Var;
        this.$rotation$delegate = interfaceC3970l0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContentKt$UnderImage$1$1(this.$pagerState, this.$rotation$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2395h m11 = n1.m(new AnonymousClass1(this.$pagerState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$pagerState, this.$rotation$delegate, null);
            this.label = 1;
            if (C2399j.h(m11, anonymousClass2, this) == aVar) {
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

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ContentKt$UnderImage$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
