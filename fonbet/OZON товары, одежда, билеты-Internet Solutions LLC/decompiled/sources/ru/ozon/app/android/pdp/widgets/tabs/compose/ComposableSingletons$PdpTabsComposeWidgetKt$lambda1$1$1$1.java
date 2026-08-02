package ru.ozon.app.android.pdp.widgets.tabs.compose;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LWZ/t;", "it", "", "invoke", "(LWZ/t;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* renamed from: ru.ozon.app.android.pdp.widgets.tabs.compose.ComposableSingletons$PdpTabsComposeWidgetKt$lambda-1$1$1$1, reason: invalid class name */
/* loaded from: classes13.dex */
final class ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1$1$1 extends AbstractC7737t implements Function1<t, Unit> {
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$PdpTabsComposeWidgetKt$lambda1$1$1$1(l lVar) {
        super(1);
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(t tVar) {
        invoke2(tVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(t it) {
        Intrinsics.checkNotNullParameter(it, "it");
        TokenizedAnalyticsExtKt.processViewEvents(this.$tokenizedAnalytics, it);
    }
}
