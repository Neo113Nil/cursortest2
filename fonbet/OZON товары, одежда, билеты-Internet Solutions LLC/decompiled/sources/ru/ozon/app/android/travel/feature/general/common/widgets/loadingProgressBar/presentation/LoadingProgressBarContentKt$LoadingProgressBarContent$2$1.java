package ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import m0.C7980b;
import m0.C8004n;
import m0.C8008p;
import m0.G;
import m0.T0;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.feature.general.common.widgets.loadingProgressBar.presentation.LoadingProgressBarContentKt$LoadingProgressBarContent$2$1", f = "LoadingProgressBarContent.kt", l = {46, 53}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class LoadingProgressBarContentKt$LoadingProgressBarContent$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ C7980b<Float, C8008p> $progress;
    final /* synthetic */ LoadingProgressBarVI $state;
    final /* synthetic */ LoadingProgressBarViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoadingProgressBarContentKt$LoadingProgressBarContent$2$1(LoadingProgressBarViewModel loadingProgressBarViewModel, LoadingProgressBarVI loadingProgressBarVI, C7980b<Float, C8008p> c7980b, d<? super LoadingProgressBarContentKt$LoadingProgressBarContent$2$1> dVar) {
        super(2, dVar);
        this.$viewModel = loadingProgressBarViewModel;
        this.$state = loadingProgressBarVI;
        this.$progress = c7980b;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new LoadingProgressBarContentKt$LoadingProgressBarContent$2$1(this.$viewModel, this.$state, this.$progress, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        if (m0.C7980b.f(r4, r5, r6, null, r10, 12) == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
    
        if (r11.m(r4, r10) == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            this.$viewModel.startOrRestart(this.$state.getMaxLoadingTimeMs(), this.$state.getTargetProgressValue());
            C7980b<Float, C8008p> c7980b = this.$progress;
            Float f7 = new Float(this.$viewModel.calculateProgress());
            this.label = 1;
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            s.b(obj);
        }
        float floatValue = this.$progress.k().floatValue();
        if (floatValue >= this.$state.getTargetProgressValue()) {
            return Unit.f71690a;
        }
        int targetProgressValue = (int) ((1.0f - (floatValue / this.$state.getTargetProgressValue())) * this.$state.getMaxLoadingTimeMs());
        int i12 = targetProgressValue >= 1 ? targetProgressValue : 1;
        C7980b<Float, C8008p> c7980b2 = this.$progress;
        Float f11 = new Float(this.$state.getTargetProgressValue());
        T0 d11 = C8004n.d(i12, 0, G.b(), 2);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((LoadingProgressBarContentKt$LoadingProgressBarContent$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
