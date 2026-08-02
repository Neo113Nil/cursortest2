package ru.ozon.app.android.checkoutcomposer.common.configurator;

import A00.a;
import Sc.s;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import l10.InterfaceC7851b;
import ru.ozon.app.android.checkoutcomposer.common.scrollToWidget.CheckoutScrollToWidgetKeyRepository;
import ru.ozon.app.android.composer.ConfiguratorReferences;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA00/a$k;", "it", "", "<anonymous>", "(LA00/a$k;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.checkoutcomposer.common.configurator.ScrollToWidgetConfigurator$onComposerInitialized$1$1", f = "ScrollToWidgetConfigurator.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ScrollToWidgetConfigurator$onComposerInitialized$1$1 extends j implements Function2<a.C2370k, d<? super Unit>, Object> {
    final /* synthetic */ ConfiguratorReferences $refs;
    int label;
    final /* synthetic */ ScrollToWidgetConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollToWidgetConfigurator$onComposerInitialized$1$1(ScrollToWidgetConfigurator scrollToWidgetConfigurator, ConfiguratorReferences configuratorReferences, d<? super ScrollToWidgetConfigurator$onComposerInitialized$1$1> dVar) {
        super(2, dVar);
        this.this$0 = scrollToWidgetConfigurator;
        this.$refs = configuratorReferences;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new ScrollToWidgetConfigurator$onComposerInitialized$1$1(this.this$0, this.$refs, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a.C2370k c2370k, d<? super Unit> dVar) {
        return ((ScrollToWidgetConfigurator$onComposerInitialized$1$1) create(c2370k, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CheckoutScrollToWidgetKeyRepository checkoutScrollToWidgetKeyRepository;
        int scrollOffset;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        s.b(obj);
        checkoutScrollToWidgetKeyRepository = this.this$0.checkoutScrollToWidgetKeyRepository;
        String popScrollWidgetKey = checkoutScrollToWidgetKeyRepository.popScrollWidgetKey();
        if (popScrollWidgetKey == null) {
            return Unit.f71690a;
        }
        InterfaceC7851b controller = this.$refs.getController();
        scrollOffset = this.this$0.getScrollOffset();
        controller.i(scrollOffset, popScrollWidgetKey);
        return Unit.f71690a;
    }
}
