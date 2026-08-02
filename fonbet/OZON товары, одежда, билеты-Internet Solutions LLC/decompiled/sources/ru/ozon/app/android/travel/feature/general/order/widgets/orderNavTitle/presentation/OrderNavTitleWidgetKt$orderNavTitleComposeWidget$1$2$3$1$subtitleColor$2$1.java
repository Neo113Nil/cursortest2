package ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation;

import S0.InterfaceC3978p0;
import android.animation.ArgbEvaluator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7807Z;
import l1.C7811b0;
import ru.ozon.app.android.travel.feature.general.order.widgets.orderNavTitle.presentation.OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll1/Z;", "invoke-QN2ZGVo", "()Ll1/Z;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$subtitleColor$2$1 extends AbstractC7737t implements Function0<C7807Z> {
    final /* synthetic */ InterfaceC3978p0<Float> $alphaState$delegate;
    final /* synthetic */ ArgbEvaluator $argbEvaluator;
    final /* synthetic */ int $collapsedSubtitleColor;
    final /* synthetic */ int $expandedSubtitleColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1$2$3$1$subtitleColor$2$1(ArgbEvaluator argbEvaluator, int i11, int i12, InterfaceC3978p0<Float> interfaceC3978p0) {
        super(0);
        this.$argbEvaluator = argbEvaluator;
        this.$collapsedSubtitleColor = i11;
        this.$expandedSubtitleColor = i12;
        this.$alphaState$delegate = interfaceC3978p0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke-QN2ZGVo, reason: not valid java name and merged with bridge method [inline-methods] */
    public final C7807Z invoke() {
        float invoke$lambda$2;
        ArgbEvaluator argbEvaluator = this.$argbEvaluator;
        invoke$lambda$2 = OrderNavTitleWidgetKt$orderNavTitleComposeWidget$1.AnonymousClass2.AnonymousClass3.AnonymousClass1.invoke$lambda$2(this.$alphaState$delegate);
        Object evaluate = argbEvaluator.evaluate(invoke$lambda$2, Integer.valueOf(this.$collapsedSubtitleColor), Integer.valueOf(this.$expandedSubtitleColor));
        Integer num = evaluate instanceof Integer ? (Integer) evaluate : null;
        if (num != null) {
            return C7807Z.m(C7811b0.b(num.intValue()));
        }
        return null;
    }
}
