package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.view.NavLikezoneCaruselBanner;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/constraintlayout/widget/d;", "", "invoke", "(Landroidx/constraintlayout/widget/d;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes2.dex */
final class NavLikezoneCaruselBanner$View$setupTopCenterAlign$1 extends AbstractC7737t implements Function1<d, Unit> {
    final /* synthetic */ NavLikezoneCaruselBanner.View this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavLikezoneCaruselBanner$View$setupTopCenterAlign$1(NavLikezoneCaruselBanner.View view) {
        super(1);
        this.this$0 = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(d dVar) {
        invoke2(dVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(d updateConstraints) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        TextAtomV2View textAtomV2View;
        AppCompatImageView appCompatImageView4;
        TextAtomV2View textAtomV2View2;
        TextAtomV2View textAtomV2View3;
        TextAtomV2View textAtomV2View4;
        TextAtomV2View textAtomV2View5;
        TextAtomV2View textAtomV2View6;
        TextAtomV2View textAtomV2View7;
        BadgeView badgeView;
        TextAtomV2View textAtomV2View8;
        BadgeView badgeView2;
        BadgeView badgeView3;
        Intrinsics.checkNotNullParameter(updateConstraints, "$this$updateConstraints");
        this.this$0.clearAll(updateConstraints);
        appCompatImageView = this.this$0.imageView;
        ConstraintSetExtKt.layoutConstraintTopToTopOfParent(updateConstraints, appCompatImageView);
        appCompatImageView2 = this.this$0.imageView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, appCompatImageView2);
        appCompatImageView3 = this.this$0.imageView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, appCompatImageView3);
        textAtomV2View = this.this$0.titleView;
        appCompatImageView4 = this.this$0.imageView;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, textAtomV2View, appCompatImageView4);
        textAtomV2View2 = this.this$0.titleView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, textAtomV2View2);
        textAtomV2View3 = this.this$0.titleView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, textAtomV2View3);
        textAtomV2View4 = this.this$0.subtitleView;
        textAtomV2View5 = this.this$0.titleView;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, textAtomV2View4, textAtomV2View5);
        textAtomV2View6 = this.this$0.subtitleView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, textAtomV2View6);
        textAtomV2View7 = this.this$0.subtitleView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, textAtomV2View7);
        badgeView = this.this$0.badgeView;
        textAtomV2View8 = this.this$0.subtitleView;
        ConstraintSetExtKt.layoutConstraintTopToBottomOf(updateConstraints, badgeView, textAtomV2View8);
        badgeView2 = this.this$0.badgeView;
        ConstraintSetExtKt.layoutConstraintStartToStartOfParent(updateConstraints, badgeView2);
        badgeView3 = this.this$0.badgeView;
        ConstraintSetExtKt.layoutConstraintEndToEndOfParent(updateConstraints, badgeView3);
    }
}
