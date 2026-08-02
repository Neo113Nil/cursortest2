package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation;

import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/Stage;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class MainDrawMajorScreenAnimationView$animation$3 extends AbstractC7737t implements Function1<Stage, Unit> {
    final /* synthetic */ MainDrawMajorScreenAnimationView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainDrawMajorScreenAnimationView$animation$3(MainDrawMajorScreenAnimationView mainDrawMajorScreenAnimationView) {
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
        Intrinsics.checkNotNullParameter(addStage, "$this$addStage");
        appCompatImageView = this.this$0.carrotView;
        addStage.alpha(appCompatImageView, 1.0f, 0.0f);
    }
}
