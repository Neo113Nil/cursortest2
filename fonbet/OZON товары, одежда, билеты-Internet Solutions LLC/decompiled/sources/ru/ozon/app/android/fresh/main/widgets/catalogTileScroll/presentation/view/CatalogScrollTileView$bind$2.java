package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.view;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n\u0018\u00010\u0000j\u0004\u0018\u0001`\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "event", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "invoke", "(LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class CatalogScrollTileView$bind$2 extends AbstractC7737t implements Function2<t, AtomAction, Unit> {
    final /* synthetic */ Function1<AtomAction, Unit> $handler;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CatalogScrollTileView$bind$2(l lVar, Function1<? super AtomAction, Unit> function1) {
        super(2);
        this.$tokenizedAnalytics = lVar;
        this.$handler = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(t tVar, AtomAction atomAction) {
        invoke2(tVar, atomAction);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t tVar, AtomAction atomAction) {
        Function1<AtomAction, Unit> function1;
        if (tVar != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(this.$tokenizedAnalytics, tVar, null, 2, null);
        }
        if (atomAction == null || (function1 = this.$handler) == null) {
            return;
        }
        function1.invoke(atomAction);
    }
}
