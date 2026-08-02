package ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui;

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
@e(c = "ru.ozon.app.android.storefront.widgets.appOnboarding.presentation.ui.ContentKt$Content$4$1", f = "Content.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ContentKt$Content$4$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b0 $pagerState;
    final /* synthetic */ List<AppOnboardingVI.Content.Page> $pages;
    final /* synthetic */ Function1<t, Unit> $trackPageView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ContentKt$Content$4$1(List<AppOnboardingVI.Content.Page> list, b0 b0Var, Function1<? super t, Unit> function1, d<? super ContentKt$Content$4$1> dVar) {
        super(2, dVar);
        this.$pages = list;
        this.$pagerState = b0Var;
        this.$trackPageView = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ContentKt$Content$4$1(this.$pages, this.$pagerState, this.$trackPageView, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        t tokenizedEvent = this.$pages.get(this.$pagerState.r()).getTokenizedEvent();
        if (tokenizedEvent != null) {
            this.$trackPageView.invoke(tokenizedEvent);
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ContentKt$Content$4$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
