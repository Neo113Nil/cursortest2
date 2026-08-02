package ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation;

import Sc.o;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.data.AnimationType;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\b\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\u0007\u001a5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroid/view/View;", "Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;", "animationType", "", "applyTileAnimation", "(Landroid/view/View;Lru/ozon/app/android/fresh/main/widgets/catalogTileScroll/data/AnimationType;)V", "startScaling", "(Landroid/view/View;)V", "startScaleUp", "startScaleDown", "", "fromScale", "toScale", "", "duration", "Lkotlin/Function0;", "onEnd", "Landroid/view/animation/ScaleAnimation;", "createScaleAnimation", "(FFJLkotlin/jvm/functions/Function0;)Landroid/view/animation/ScaleAnimation;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CatalogTileAnimationsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnimationType.values().length];
            try {
                iArr[AnimationType.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationType.SCALING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationType.BORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyTileAnimation(@NotNull View view, @NotNull AnimationType animationType) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(animationType, "animationType");
        int i11 = WhenMappings.$EnumSwitchMapping$0[animationType.ordinal()];
        if (i11 == 1) {
            view.clearAnimation();
        } else if (i11 == 2) {
            startScaling(view);
        } else {
            if (i11 != 3) {
                throw new o();
            }
            view.clearAnimation();
        }
    }

    private static final ScaleAnimation createScaleAnimation(float f7, float f11, long j11, final Function0<Unit> function0) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(f7, f11, f7, f11, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setDuration(j11);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogTileScroll.presentation.CatalogTileAnimationsKt$createScaleAnimation$1$1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                function0.invoke();
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
        return scaleAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startScaleDown(View view) {
        view.startAnimation(createScaleAnimation(1.3f, 1.0f, 1700L, new CatalogTileAnimationsKt$startScaleDown$animation$1(view)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startScaleUp(View view) {
        view.startAnimation(createScaleAnimation(1.0f, 1.3f, 2200L, new CatalogTileAnimationsKt$startScaleUp$animation$1(view)));
    }

    private static final void startScaling(View view) {
        view.clearAnimation();
        startScaleUp(view);
    }
}
