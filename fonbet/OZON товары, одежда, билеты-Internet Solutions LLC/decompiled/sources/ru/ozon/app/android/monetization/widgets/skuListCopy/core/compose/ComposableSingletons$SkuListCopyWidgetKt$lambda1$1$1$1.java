package ru.ozon.app.android.monetization.widgets.skuListCopy.core.compose;

import WZ.l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.monetization.widgets.skuListCopy.presentation.SkuListCopyTrackingVI;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.composer.compose.widget.i;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.monetization.widgets.skuListCopy.core.compose.ComposableSingletons$SkuListCopyWidgetKt$lambda-1$1$1$1, reason: invalid class name */
/* loaded from: classes12.dex */
final class ComposableSingletons$SkuListCopyWidgetKt$lambda1$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ i<SkuListCopyTrackingVI> $this_content;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$SkuListCopyWidgetKt$lambda1$1$1$1(l lVar, i<SkuListCopyTrackingVI> iVar) {
        super(0);
        this.$tokenizedAnalytics = lVar;
        this.$this_content = iVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        TokenizedAnalyticsExtKt.processViewEvents(this.$tokenizedAnalytics, this.$this_content.b().getTokenizedEvent());
    }
}
