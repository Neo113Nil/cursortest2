package ru.ozon.uni.android.ds.compose.component.rating;

import S0.InterfaceC3970l0;
import Sc.s;
import Wc.a;
import androidx.compose.foundation.gestures.C5177u;
import androidx.compose.foundation.gestures.w;
import k1.C7459e;
import kd.InterfaceC7663b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import x1.F;
import x1.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx1/F;", "", "<anonymous>", "(Lx1/F;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt$DsRating$1$1$1", f = "DsRating.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class DsRatingKt$DsRating$1$1$1 extends j implements Function2<F, d<? super Unit>, Object> {
    final /* synthetic */ Function0<Unit> $onClick;
    final /* synthetic */ Function1<Float, Unit> $onSelected;
    final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;
    final /* synthetic */ float $totalWidth;
    private /* synthetic */ Object L$0;
    int label;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt$DsRating$1$1$1$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ Function0<Unit> $onClick;
        final /* synthetic */ Function1<Float, Unit> $onSelected;
        final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super Float, Unit> function1, Function0<Unit> function0, InterfaceC3970l0 interfaceC3970l0) {
            super(0);
            this.$onSelected = function1;
            this.$onClick = function0;
            this.$selectedIndex$delegate = interfaceC3970l0;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            float floatValue;
            Function1<Float, Unit> function1 = this.$onSelected;
            if (function1 != null) {
                floatValue = this.$selectedIndex$delegate.getFloatValue();
                function1.invoke(Float.valueOf(floatValue));
            }
            Function0<Unit> function0 = this.$onClick;
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx1/x;", "change", "", "<unused var>", "", "invoke", "(Lx1/x;F)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    /* renamed from: ru.ozon.uni.android.ds.compose.component.rating.DsRatingKt$DsRating$1$1$1$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    static final class AnonymousClass2 extends AbstractC7737t implements Function2<x, Float, Unit> {
        final /* synthetic */ F $$this$pointerInput;
        final /* synthetic */ InterfaceC3970l0 $selectedIndex$delegate;
        final /* synthetic */ float $totalWidth;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(F f7, float f11, InterfaceC3970l0 interfaceC3970l0) {
            super(2);
            this.$$this$pointerInput = f7;
            this.$totalWidth = f11;
            this.$selectedIndex$delegate = interfaceC3970l0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(x xVar, Float f7) {
            invoke(xVar, f7.floatValue());
            return Unit.f71690a;
        }

        public final void invoke(x change, float f7) {
            InterfaceC7663b interfaceC7663b;
            Intrinsics.checkNotNullParameter(change, "change");
            Float valueOf = Float.valueOf((((int) C7459e.g(change.f())) / ((int) (this.$$this$pointerInput.v1(this.$totalWidth) / 5))) + 1);
            interfaceC7663b = DsRatingKt.INDEX_RANGE;
            this.$selectedIndex$delegate.h(((Number) h.i(Float.valueOf(((Number) h.i(valueOf, interfaceC7663b)).floatValue()), h.l(1.0f, 5.0f))).floatValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DsRatingKt$DsRating$1$1$1(Function1<? super Float, Unit> function1, Function0<Unit> function0, InterfaceC3970l0 interfaceC3970l0, float f7, d<? super DsRatingKt$DsRating$1$1$1> dVar) {
        super(2, dVar);
        this.$onSelected = function1;
        this.$onClick = function0;
        this.$selectedIndex$delegate = interfaceC3970l0;
        this.$totalWidth = f7;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        DsRatingKt$DsRating$1$1$1 dsRatingKt$DsRating$1$1$1 = new DsRatingKt$DsRating$1$1$1(this.$onSelected, this.$onClick, this.$selectedIndex$delegate, this.$totalWidth, dVar);
        dsRatingKt$DsRating$1$1$1.L$0 = obj;
        return dsRatingKt$DsRating$1$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object g10;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            F f7 = (F) this.L$0;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onSelected, this.$onClick, this.$selectedIndex$delegate);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(f7, this.$totalWidth, this.$selectedIndex$delegate);
            this.label = 1;
            g10 = C5177u.g(f7, w.f39267b, anonymousClass1, androidx.compose.foundation.gestures.x.f39268b, anonymousClass2, this);
            if (g10 == aVar) {
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
    public final Object invoke(F f7, d<? super Unit> dVar) {
        return ((DsRatingKt$DsRating$1$1$1) create(f7, dVar)).invokeSuspend(Unit.f71690a);
    }
}
