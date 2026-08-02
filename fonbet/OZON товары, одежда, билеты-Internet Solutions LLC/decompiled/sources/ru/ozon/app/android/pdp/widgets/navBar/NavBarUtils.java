package ru.ozon.app.android.pdp.widgets.navBar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mz.C8355a;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarConstants;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JS\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/NavBarUtils;", "Lru/ozon/app/android/pdp/widgets/navBar/NavBarConstants;", "", "isVisible", "", "minAlpha", "maxAlpha", "", "time", "isForcedInterpolated", "Lkotlin/Function1;", "", "newAlpha", "Landroid/animation/ValueAnimator;", "alphaAnimation", "(ZIIJZLkotlin/jvm/functions/Function1;)Landroid/animation/ValueAnimator;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface NavBarUtils extends NavBarConstants {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        @NotNull
        public static ValueAnimator alphaAnimation(@NotNull NavBarUtils navBarUtils, boolean z11, int i11, int i12, long j11, boolean z12, @NotNull Function1<? super Integer, Unit> newAlpha) {
            Intrinsics.checkNotNullParameter(newAlpha, "newAlpha");
            int i13 = z11 ? i11 : i12;
            if (z11) {
                i11 = i12;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(i13, i11);
            ofInt.setDuration(j11);
            if (z11 || z12) {
                ofInt.setInterpolator(new DecelerateInterpolator(2.0f));
            }
            ofInt.addUpdateListener(new C8355a(newAlpha, 1));
            Intrinsics.checkNotNullExpressionValue(ofInt, "apply(...)");
            return ofInt;
        }

        public static /* synthetic */ ValueAnimator alphaAnimation$default(NavBarUtils navBarUtils, boolean z11, int i11, int i12, long j11, boolean z12, Function1 function1, int i13, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: alphaAnimation");
            }
            if ((i13 & 2) != 0) {
                i11 = 0;
            }
            if ((i13 & 4) != 0) {
                i12 = 255;
            }
            if ((i13 & 8) != 0) {
                j11 = navBarUtils.getAnimationDuration();
            }
            if ((i13 & 16) != 0) {
                z12 = false;
            }
            return navBarUtils.alphaAnimation(z11, i11, i12, j11, z12, function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void alphaAnimation$lambda$2$lambda$1(Function1 function1, ValueAnimator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            Object animatedValue = animation.getAnimatedValue();
            Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
            if (num != null) {
                function1.invoke(Integer.valueOf(num.intValue()));
            }
        }

        public static long getAnimationDuration(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getAnimationDuration(navBarUtils);
        }

        public static float getButtonCornerRadius(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getButtonCornerRadius(navBarUtils);
        }

        public static int getColorIntByToken(@NotNull NavBarUtils navBarUtils, @NotNull Context context, @NotNull String token) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(token, "token");
            return StyleParser.INSTANCE.parseColor(context, token, UniColors.LAYER_FLOOR_1.getResId());
        }

        @NotNull
        public static String getInvisibleButtonBackground(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getInvisibleButtonBackground(navBarUtils);
        }

        @NotNull
        public static String getInvisibleIconTintColor(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getInvisibleIconTintColor(navBarUtils);
        }

        public static int getMaxAlpha(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getMaxAlpha(navBarUtils);
        }

        public static int getMinAlpha(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getMinAlpha(navBarUtils);
        }

        @NotNull
        public static String getNavBarBackground(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getNavBarBackground(navBarUtils);
        }

        public static int getNavbarBottomCornerRadius(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getNavbarBottomCornerRadius(navBarUtils);
        }

        @NotNull
        public static String getVisibleIconTintColor(@NotNull NavBarUtils navBarUtils) {
            return NavBarConstants.DefaultImpls.getVisibleIconTintColor(navBarUtils);
        }
    }

    @NotNull
    ValueAnimator alphaAnimation(boolean isVisible, int minAlpha, int maxAlpha, long time, boolean isForcedInterpolated, @NotNull Function1<? super Integer, Unit> newAlpha);
}
