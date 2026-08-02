package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import Ae.InterfaceC2397i;
import S0.InterfaceC3978p0;
import Sc.s;
import Wc.a;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5427n;
import androidx.lifecycle.H;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavBar.presentation.OrderNavBarViewModel;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1", f = "OrderNavTitleWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3978p0<Float> $alphaState$delegate;
    final /* synthetic */ AbstractC5434v $lifecycle;
    final /* synthetic */ OrderNavBarViewModel $orderNavBarViewModel;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "alpha", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1$1", f = "OrderNavTitleWidget.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<Float, d<? super Unit>, Object> {
        final /* synthetic */ InterfaceC3978p0<Float> $alphaState$delegate;
        /* synthetic */ float F$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3978p0<Float> interfaceC3978p0, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$alphaState$delegate = interfaceC3978p0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$alphaState$delegate, dVar);
            anonymousClass1.F$0 = ((Number) obj).floatValue();
            return anonymousClass1;
        }

        public final Object invoke(float f7, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(Float.valueOf(f7), dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1.AnonymousClass2.AnonymousClass3.AnonymousClass1.invoke$lambda$3(this.$alphaState$delegate, this.F$0);
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Float f7, d<? super Unit> dVar) {
            return invoke(f7.floatValue(), dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LAe/i;", "", "", "it", "", "<anonymous>", "(LAe/i;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1$2", f = "OrderNavTitleWidget.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1$2, reason: invalid class name */
    static final class AnonymousClass2 extends j implements InterfaceC6511n<InterfaceC2397i<? super Float>, Throwable, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass2(d<? super AnonymousClass2> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Float> interfaceC2397i, Throwable th2, d<? super Unit> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar);
            anonymousClass2.L$0 = th2;
            return anonymousClass2.invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            Lm0.a.f17149a.e((Throwable) this.L$0);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1(OrderNavBarViewModel orderNavBarViewModel, AbstractC5434v abstractC5434v, InterfaceC3978p0<Float> interfaceC3978p0, d<? super OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1> dVar) {
        super(2, dVar);
        this.$orderNavBarViewModel = orderNavBarViewModel;
        this.$lifecycle = abstractC5434v;
        this.$alphaState$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1(this.$orderNavBarViewModel, this.$lifecycle, this.$alphaState$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        C2399j.C(new C(new C2408n0(C5427n.a(this.$orderNavBarViewModel.alphaUpdate(), this.$lifecycle, AbstractC5434v.b.CREATED), new AnonymousClass1(this.$alphaState$delegate, null)), new AnonymousClass2(null)), H.a(this.$lifecycle));
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$1$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
