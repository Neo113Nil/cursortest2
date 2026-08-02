package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.view;

import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.molecules.view.shimmer.RoundedShimmerView;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class NotificationSubscriptionLoadingView$setConstraints$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ NotificationSubscriptionLoadingView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationSubscriptionLoadingView$setConstraints$1(NotificationSubscriptionLoadingView notificationSubscriptionLoadingView) {
        super(1);
        this.this$0 = notificationSubscriptionLoadingView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        RoundedShimmerView roundedShimmerView;
        RoundedShimmerView roundedShimmerView2;
        RoundedShimmerView roundedShimmerView3;
        RoundedShimmerView roundedShimmerView4;
        RoundedShimmerView roundedShimmerView5;
        int i11;
        RoundedShimmerView roundedShimmerView6;
        RoundedShimmerView roundedShimmerView7;
        RoundedShimmerView roundedShimmerView8;
        RoundedShimmerView roundedShimmerView9;
        RoundedShimmerView roundedShimmerView10;
        RoundedShimmerView roundedShimmerView11;
        int i12;
        RoundedShimmerView roundedShimmerView12;
        RoundedShimmerView roundedShimmerView13;
        RoundedShimmerView roundedShimmerView14;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        roundedShimmerView = this.this$0.checkboxShimmerView;
        ConstraintLayoutExtensionsKt.startToParent(updateConstraints, roundedShimmerView);
        roundedShimmerView2 = this.this$0.checkboxShimmerView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, roundedShimmerView2);
        roundedShimmerView3 = this.this$0.checkboxShimmerView;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, roundedShimmerView3);
        roundedShimmerView4 = this.this$0.titleShimmerView;
        roundedShimmerView5 = this.this$0.checkboxShimmerView;
        i11 = this.this$0.dp10;
        ConstraintLayoutExtensionsKt.startToEnd(updateConstraints, roundedShimmerView4, roundedShimmerView5, i11);
        roundedShimmerView6 = this.this$0.titleShimmerView;
        ConstraintLayoutExtensionsKt.topToParent(updateConstraints, roundedShimmerView6);
        roundedShimmerView7 = this.this$0.titleShimmerView;
        ConstraintLayoutExtensionsKt.endToParent(updateConstraints, roundedShimmerView7);
        roundedShimmerView8 = this.this$0.subtitleShimmerView;
        roundedShimmerView9 = this.this$0.titleShimmerView;
        ConstraintLayoutExtensionsKt.startToStart(updateConstraints, roundedShimmerView8, roundedShimmerView9);
        roundedShimmerView10 = this.this$0.subtitleShimmerView;
        roundedShimmerView11 = this.this$0.titleShimmerView;
        i12 = this.this$0.dp4;
        ConstraintLayoutExtensionsKt.topToBottom(updateConstraints, roundedShimmerView10, roundedShimmerView11, i12);
        roundedShimmerView12 = this.this$0.subtitleShimmerView;
        roundedShimmerView13 = this.this$0.titleShimmerView;
        ConstraintLayoutExtensionsKt.endToEnd(updateConstraints, roundedShimmerView12, roundedShimmerView13);
        roundedShimmerView14 = this.this$0.subtitleShimmerView;
        ConstraintLayoutExtensionsKt.bottomToParent(updateConstraints, roundedShimmerView14);
    }
}
