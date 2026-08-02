package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MainDrawMajorScreenAnimationView$animation$1 extends AbstractC7737t implements Function1<Stage, Unit> {
    final /* synthetic */ MainDrawMajorScreenAnimationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenAnimationView$animation$1(MainDrawMajorScreenAnimationView mainDrawMajorScreenAnimationView) {
        super(1);
        this.this$0 = mainDrawMajorScreenAnimationView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Stage stage) {
        invoke2(stage);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Stage addStage) {
        AppCompatImageView appCompatImageView;
        float f7;
        float f11;
        AppCompatImageView appCompatImageView2;
        float f12;
        float f13;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        float f14;
        float f15;
        AppCompatImageView appCompatImageView5;
        float f16;
        float f17;
        AppCompatImageView appCompatImageView6;
        Intrinsics.checkNotNullParameter(addStage, "$this$addStage");
        appCompatImageView = this.this$0.footView;
        f7 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_X_START_FOOT;
        f11 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_X_END_FOOT;
        addStage.translationX(appCompatImageView, f7, f11);
        appCompatImageView2 = this.this$0.footView;
        f12 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_Y_START_FOOT;
        f13 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_Y_END_FOOT;
        addStage.translationY(appCompatImageView2, f12, f13);
        appCompatImageView3 = this.this$0.footView;
        addStage.rotation(appCompatImageView3, -34.0f, -36.0f);
        appCompatImageView4 = this.this$0.carrotView;
        f14 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_X_START_CARROT;
        f15 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_X_END_CARROT;
        addStage.translationX(appCompatImageView4, f14, f15);
        appCompatImageView5 = this.this$0.carrotView;
        f16 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_Y_START_CARROT;
        f17 = MainDrawMajorScreenAnimationView.STAGE_1_TRANSLATION_Y_END_CARROT;
        addStage.translationY(appCompatImageView5, f16, f17);
        appCompatImageView6 = this.this$0.carrotView;
        addStage.rotation(appCompatImageView6, -80.0f, -190.0f);
    }
}
