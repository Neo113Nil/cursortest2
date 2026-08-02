package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000e\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "invoke", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)Lkotlin/Unit;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class WiseBeakViewHolder$onPull$1 extends AbstractC7737t implements Function2<AtomAction, t, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $actionHandler;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    WiseBeakViewHolder$onPull$1(Function1<? super AtomAction, Unit> function1, l lVar) {
        super(2);
        this.$actionHandler = function1;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AtomAction atomAction, t tVar) {
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processAnyEvents$default(this.$tokenizedAnalytics, tVar, null, 2, null);
        }
        if (atomAction == null) {
            return null;
        }
        this.$actionHandler.invoke(atomAction);
        return Unit.f71690a;
    }
}
