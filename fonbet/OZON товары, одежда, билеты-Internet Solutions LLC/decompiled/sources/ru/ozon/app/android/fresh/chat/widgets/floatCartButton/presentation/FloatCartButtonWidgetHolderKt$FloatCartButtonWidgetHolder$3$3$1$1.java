package ru.ozon.app.android.fresh.chat.widgets.floatCartButton.presentation;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ FloatCartButtonVO $item;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    FloatCartButtonWidgetHolderKt$FloatCartButtonWidgetHolder$3$3$1$1(FloatCartButtonVO floatCartButtonVO, Function1<? super AtomAction, Unit> function1, l lVar) {
        super(0);
        this.$item = floatCartButtonVO;
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AtomAction action = this.$item.getAction();
        if (action != null) {
            this.$actionHandler.invoke(action);
        }
        t tokenizedEvent = this.$item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, tokenizedEvent, null, 2, null);
        }
    }
}
