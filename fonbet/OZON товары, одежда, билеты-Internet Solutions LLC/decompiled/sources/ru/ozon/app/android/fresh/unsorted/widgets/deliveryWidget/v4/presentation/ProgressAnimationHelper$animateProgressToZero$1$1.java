package ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class ProgressAnimationHelper$animateProgressToZero$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $onEnd;
    final /* synthetic */ ProgressAnimationHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProgressAnimationHelper$animateProgressToZero$1$1(ProgressAnimationHelper progressAnimationHelper, Function0<Unit> function0) {
        super(0);
        this.this$0 = progressAnimationHelper;
        this.$onEnd = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View view;
        View view2;
        View view3;
        view = this.this$0.progressView;
        ViewExtKt.gone(view);
        view2 = this.this$0.progressView;
        view2.setScaleX(1.0f);
        ProgressAnimationHelper progressAnimationHelper = this.this$0;
        view3 = progressAnimationHelper.progressView;
        progressAnimationHelper.setViewWidth(view3, 0);
        this.$onEnd.invoke();
    }
}
