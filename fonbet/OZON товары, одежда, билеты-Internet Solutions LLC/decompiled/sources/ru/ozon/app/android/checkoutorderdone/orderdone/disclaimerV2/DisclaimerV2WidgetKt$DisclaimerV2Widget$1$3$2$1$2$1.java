package ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2;

import Tg.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.di.DisclaimerV2Component;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/uni/atoms/af/AtomAction;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$2$1 extends AbstractC7737t implements Function1<AtomAction, Unit> {
    final /* synthetic */ DisclaimerV2Component $component;
    final /* synthetic */ Function1<b, Unit> $onAction;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.checkoutorderdone.orderdone.disclaimerV2.DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$2$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<Unit> {
        final /* synthetic */ AtomAction $action;
        final /* synthetic */ Function1<b, Unit> $onAction;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Function1<? super b, Unit> function1, AtomAction atomAction) {
            super(0);
            this.$onAction = function1;
            this.$action = atomAction;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onAction.invoke(this.$action);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DisclaimerV2WidgetKt$DisclaimerV2Widget$1$3$2$1$2$1(DisclaimerV2Component disclaimerV2Component, Function1<? super b, Unit> function1) {
        super(1);
        this.$component = disclaimerV2Component;
        this.$onAction = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AtomAction atomAction) {
        invoke2(atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        HandlersInhibitor.run$default(this.$component.getHandlersInhibitor(), 0L, new AnonymousClass1(this.$onAction, action), 1, null);
    }
}
