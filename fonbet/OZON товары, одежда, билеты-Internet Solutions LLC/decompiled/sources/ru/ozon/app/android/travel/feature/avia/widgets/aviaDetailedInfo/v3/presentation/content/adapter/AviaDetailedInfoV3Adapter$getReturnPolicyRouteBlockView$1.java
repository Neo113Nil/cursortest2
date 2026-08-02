package ru.ozon.app.android.travel.feature.avia.widgets.aviaDetailedInfo.v3.presentation.content.adapter;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes10.dex */
final class AviaDetailedInfoV3Adapter$getReturnPolicyRouteBlockView$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ int $dp10;
    final /* synthetic */ IconView $logo;
    final /* synthetic */ TextAtomV2View $route;
    final /* synthetic */ TextAtomV2View $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AviaDetailedInfoV3Adapter$getReturnPolicyRouteBlockView$1(IconView iconView, TextAtomV2View textAtomV2View, int i11, TextAtomV2View textAtomV2View2) {
        super(1);
        this.$logo = iconView;
        this.$route = textAtomV2View;
        this.$dp10 = i11;
        this.$text = textAtomV2View2;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d applyConstraint) {
        Intrinsics.checkNotNullParameter(applyConstraint, "$this$applyConstraint");
        ConstraintLayoutExtensionsKt.topToParent(applyConstraint, this.$logo);
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.$logo);
        ConstraintLayoutExtensionsKt.startToEnd(applyConstraint, this.$route, this.$logo, this.$dp10);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.$route);
        ConstraintLayoutExtensionsKt.topToTop(applyConstraint, this.$route, this.$logo);
        ConstraintLayoutExtensionsKt.bottomToBottom(applyConstraint, this.$route, this.$logo);
        ConstraintLayoutExtensionsKt.topToBottom(applyConstraint, this.$text, this.$logo, this.$dp10);
        ConstraintLayoutExtensionsKt.startToParent(applyConstraint, this.$text);
        ConstraintLayoutExtensionsKt.endToParent(applyConstraint, this.$text);
    }
}
