package ru.ozon.app.android.pdp.widgets.navBar;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/navBar/NavBarConstants;", "", "", "getAnimationDuration", "()J", "animationDuration", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface NavBarConstants {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static long getAnimationDuration(@NotNull NavBarConstants navBarConstants) {
            return 300L;
        }

        public static float getButtonCornerRadius(@NotNull NavBarConstants navBarConstants) {
            float f7;
            f7 = NavBarUtilsKt.BUTTON_CORNER_RADIUS;
            return f7;
        }

        @NotNull
        public static String getInvisibleButtonBackground(@NotNull NavBarConstants navBarConstants) {
            return UniColors.CLEAR_LIGHT_KEY_700.getToken();
        }

        @NotNull
        public static String getInvisibleIconTintColor(@NotNull NavBarConstants navBarConstants) {
            return UniColors.GRAPHIC_TERTIARY_ON_LIGHT.getToken();
        }

        public static int getMaxAlpha(@NotNull NavBarConstants navBarConstants) {
            return 255;
        }

        public static int getMinAlpha(@NotNull NavBarConstants navBarConstants) {
            return 0;
        }

        @NotNull
        public static String getNavBarBackground(@NotNull NavBarConstants navBarConstants) {
            return UniColors.LAYER_FLOOR_1.getToken();
        }

        public static int getNavbarBottomCornerRadius(@NotNull NavBarConstants navBarConstants) {
            int i11;
            i11 = NavBarUtilsKt.NAV_BAR_CORNER_RADIUS;
            return i11;
        }

        @NotNull
        public static String getVisibleIconTintColor(@NotNull NavBarConstants navBarConstants) {
            return UniColors.GRAPHIC_TERTIARY.getToken();
        }
    }

    long getAnimationDuration();
}
