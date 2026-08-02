package ru.ozon.app.android.ugc.widgets.usersGradesV2.core;

import WZ.l;
import WZ.t;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.ugc.widgets.usersGradesV2.presentation.ContextQuestionItemVO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/ugc/widgets/usersGradesV2/presentation/ContextQuestionItemVO;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: ru.ozon.app.android.ugc.widgets.usersGradesV2.core.ComposableSingletons$UsersGradesComposeWidgetKt$lambda-1$1$1$1, reason: invalid class name */
/* loaded from: classes2.dex */
final class ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1$1$1 extends AbstractC7737t implements Function1<ContextQuestionItemVO, Unit> {
    final /* synthetic */ InterfaceC7851b $controller;
    final /* synthetic */ l $tokenizedAnalytics;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ComposableSingletons$UsersGradesComposeWidgetKt$lambda1$1$1$1(InterfaceC7851b interfaceC7851b, l lVar) {
        super(1);
        this.$controller = interfaceC7851b;
        this.$tokenizedAnalytics = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ContextQuestionItemVO contextQuestionItemVO) {
        invoke2(contextQuestionItemVO);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ContextQuestionItemVO it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$controller.update(new UsersGradesQuestionClicked(it));
        t cellTokenizedEvent = it.getCellTokenizedEvent();
        if (cellTokenizedEvent != null) {
            TokenizedAnalyticsExtKt.processClickEvents(this.$tokenizedAnalytics, cellTokenizedEvent);
        }
    }
}
