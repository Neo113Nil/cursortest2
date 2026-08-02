package ru.ozon.app.android.saleBadge.presentation;

import A00.a;
import S0.A1;
import S0.InterfaceC3978p0;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.saleBadge.presentation.SaleBadgeWidgetKt$SaleBadgeWidget$4$1", f = "SaleBadgeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class SaleBadgeWidgetKt$SaleBadgeWidget$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ A1<a> $composerEvent$delegate;
    final /* synthetic */ InterfaceC3978p0<Boolean> $isRefreshing$delegate;
    final /* synthetic */ SaleBadgeViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SaleBadgeWidgetKt$SaleBadgeWidget$4$1(SaleBadgeViewModel saleBadgeViewModel, A1<? extends a> a12, InterfaceC3978p0<Boolean> interfaceC3978p0, d<? super SaleBadgeWidgetKt$SaleBadgeWidget$4$1> dVar) {
        super(2, dVar);
        this.$viewModel = saleBadgeViewModel;
        this.$composerEvent$delegate = a12;
        this.$isRefreshing$delegate = interfaceC3978p0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new SaleBadgeWidgetKt$SaleBadgeWidget$4$1(this.$viewModel, this.$composerEvent$delegate, this.$isRefreshing$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a SaleBadgeWidget$lambda$0;
        a SaleBadgeWidget$lambda$02;
        boolean SaleBadgeWidget$lambda$2;
        a SaleBadgeWidget$lambda$03;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        SaleBadgeWidget$lambda$0 = SaleBadgeWidgetKt.SaleBadgeWidget$lambda$0(this.$composerEvent$delegate);
        if (!(SaleBadgeWidget$lambda$0 instanceof a.u.b)) {
            SaleBadgeWidget$lambda$02 = SaleBadgeWidgetKt.SaleBadgeWidget$lambda$0(this.$composerEvent$delegate);
            if (!Intrinsics.d(SaleBadgeWidget$lambda$02, a.u.c.f253a)) {
                SaleBadgeWidget$lambda$2 = SaleBadgeWidgetKt.SaleBadgeWidget$lambda$2(this.$isRefreshing$delegate);
                if (SaleBadgeWidget$lambda$2) {
                    SaleBadgeWidget$lambda$03 = SaleBadgeWidgetKt.SaleBadgeWidget$lambda$0(this.$composerEvent$delegate);
                    if (SaleBadgeWidget$lambda$03 instanceof a.C2370k) {
                        this.$viewModel.reset();
                        SaleBadgeWidgetKt.SaleBadgeWidget$lambda$3(this.$isRefreshing$delegate, false);
                    }
                }
                return Unit.f71690a;
            }
        }
        SaleBadgeWidgetKt.SaleBadgeWidget$lambda$3(this.$isRefreshing$delegate, true);
        this.$viewModel.resetState();
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((SaleBadgeWidgetKt$SaleBadgeWidget$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
