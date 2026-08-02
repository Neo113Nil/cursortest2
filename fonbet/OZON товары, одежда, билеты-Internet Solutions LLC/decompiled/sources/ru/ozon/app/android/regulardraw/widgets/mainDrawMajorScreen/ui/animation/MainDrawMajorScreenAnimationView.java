package ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.R$drawable;
import ru.ozon.app.android.regulardraw.widgets.mainDrawMajorScreen.ui.animation.StageAnimation;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B1\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0010\u001a\u00020\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0013R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/MainDrawMajorScreenAnimationView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "footView", "Landroidx/appcompat/widget/AppCompatImageView;", "carrotView", "animation", "Lru/ozon/app/android/regulardraw/widgets/mainDrawMajorScreen/ui/animation/StageAnimation;", "startAnimation", "", "doOnCompleted", "Lkotlin/Function0;", "Companion", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MainDrawMajorScreenAnimationView extends FrameLayout {

    @NotNull
    private final StageAnimation animation;

    @NotNull
    private final AppCompatImageView carrotView;

    @NotNull
    private final AppCompatImageView footView;
    public static final int $stable = 8;
    private static final int dp216 = ResourceExtKt.toPx(216);
    private static final int dp168 = ResourceExtKt.toPx(168);
    private static final int dp106 = ResourceExtKt.toPx(106);
    private static final int dp26 = ResourceExtKt.toPx(26);
    private static final int dp42 = ResourceExtKt.toPx(42);
    private static final float STAGE_1_TRANSLATION_X_START_FOOT = ResourceExtKt.toPxF(6);
    private static final float STAGE_1_TRANSLATION_X_END_FOOT = ResourceExtKt.toPxF(80);
    private static final float STAGE_1_TRANSLATION_Y_START_FOOT = ResourceExtKt.toPxF(92);
    private static final float STAGE_1_TRANSLATION_Y_END_FOOT = ResourceExtKt.toPxF(70);
    private static final float STAGE_1_TRANSLATION_X_START_CARROT = ResourceExtKt.toPxF(64);
    private static final float STAGE_1_TRANSLATION_X_END_CARROT = ResourceExtKt.toPxF(146);
    private static final float STAGE_1_TRANSLATION_Y_START_CARROT = ResourceExtKt.toPxF(57);
    private static final float STAGE_1_TRANSLATION_Y_END_CARROT = ResourceExtKt.toPxF(34);
    private static final float STAGE_2_TRANSLATION_Y_END_FOOT = ResourceExtKt.toPxF(20);
    private static final float STAGE_2_TRANSLATION_X_END_CARROT = ResourceExtKt.toPxF(166);
    private static final float STAGE_2_TRANSLATION_Y_END_CARROT = ResourceExtKt.toPxF(86);

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MainDrawMajorScreenAnimationView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void startAnimation(Function0<Unit> doOnCompleted) {
        setVisibility(0);
        this.animation.start(doOnCompleted);
    }

    public /* synthetic */ MainDrawMajorScreenAnimationView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDrawMajorScreenAnimationView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new FrameLayout.LayoutParams(dp106, dp26));
        appCompatImageView.setRotation(-34.0f);
        appCompatImageView.setImageDrawable(a.getDrawable(context, R$drawable.super_prize_progress_anim_foot));
        this.footView = appCompatImageView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context);
        int i13 = dp42;
        appCompatImageView2.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
        appCompatImageView2.setImageDrawable(a.getDrawable(context, R$drawable.super_prize_progress_anim_carrot));
        this.carrotView = appCompatImageView2;
        this.animation = new StageAnimation.Default().addStage(800L, 900L, new MainDrawMajorScreenAnimationView$animation$1(this)).addStage(1L, 600L, new MainDrawMajorScreenAnimationView$animation$2(this)).addStage(1L, 250L, new MainDrawMajorScreenAnimationView$animation$3(this)).build();
        setLayoutParams(new FrameLayout.LayoutParams(dp216, dp168));
        setVisibility(8);
        addView(appCompatImageView);
        addView(appCompatImageView2);
    }
}
