package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

import S0.InterfaceC3972m0;
import Sc.s;
import WZ.t;
import Wc.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.AppOnboardingVI;
import xe.M;
import y0.b0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$Content$3$1", f = "Content.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContentKt$Content$3$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ InterfaceC3972m0 $lastPage$delegate;
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ List<AppOnboardingVI.Content.Page> $pages;
    final /* synthetic */ Function1<t, Unit> $trackBackSwipe;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentKt$Content$3$1(b0 b0Var, List<AppOnboardingVI.Content.Page> list, Function1<? super t, Unit> function1, InterfaceC3972m0 interfaceC3972m0, d<? super ContentKt$Content$3$1> dVar) {
        super(2, dVar);
        this.$pagerState = b0Var;
        this.$pages = list;
        this.$trackBackSwipe = function1;
        this.$lastPage$delegate = interfaceC3972m0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContentKt$Content$3$1(this.$pagerState, this.$pages, this.$trackBackSwipe, this.$lastPage$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int intValue;
        int intValue2;
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        int M11 = this.$pagerState.M();
        intValue = this.$lastPage$delegate.getIntValue();
        if (M11 < intValue) {
            List<AppOnboardingVI.Content.Page> list = this.$pages;
            intValue2 = this.$lastPage$delegate.getIntValue();
            t tokenizedEvent = list.get(intValue2).getTokenizedEvent();
            if (tokenizedEvent != null) {
                this.$trackBackSwipe.invoke(tokenizedEvent);
            }
        }
        this.$lastPage$delegate.d(M11);
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ContentKt$Content$3$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
