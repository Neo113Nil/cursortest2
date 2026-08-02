package ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core;

import Sc.s;
import Wc.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableVI;
import ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.presentation.PromoPushEnableViewModel;
import ru.ozon.composer.compose.widget.i;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.storefront.feature.notifications.widgets.promopushenable.core.PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1", f = "PromoPushEnableComposeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ i<PromoPushEnableVI> $this_content;
    final /* synthetic */ PromoPushEnableViewModel $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1(PromoPushEnableViewModel promoPushEnableViewModel, i<PromoPushEnableVI> iVar, d<? super PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1> dVar) {
        super(2, dVar);
        this.$viewModel = promoPushEnableViewModel;
        this.$this_content = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1(this.$viewModel, this.$this_content, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        this.$viewModel.setInitData(this.$this_content.b());
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PromoPushEnableComposeWidgetKt$promoPushEnableComposeWidget$1$3$2$1$2$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
