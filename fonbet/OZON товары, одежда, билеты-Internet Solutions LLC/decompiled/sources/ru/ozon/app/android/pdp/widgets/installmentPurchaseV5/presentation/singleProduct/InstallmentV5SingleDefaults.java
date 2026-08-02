package ru.ozon.app.android.pdp.widgets.installmentPurchaseV5.presentation.singleProduct;

import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0015\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/widgets/installmentPurchaseV5/presentation/singleProduct/InstallmentV5SingleDefaults;", "", "<init>", "()V", "LZ1/h;", "MAX_LEFT_BLOCK_WIDTH", "F", "getMAX_LEFT_BLOCK_WIDTH-D9Ej5fM", "()F", "MAIN_BLOCK_RADIUS", "getMAIN_BLOCK_RADIUS-D9Ej5fM", "MAIN_BLOCK_SELECT_RADIUS", "getMAIN_BLOCK_SELECT_RADIUS-D9Ej5fM", "", "ONBOARDING_WITH_TITLE_TOP_MARGIN", "I", "getONBOARDING_WITH_TITLE_TOP_MARGIN", "()I", "ONBOARDING_TOP_MARGIN", "getONBOARDING_TOP_MARGIN", "ONBOARDING_BOTTOM_MARGIN", "getONBOARDING_BOTTOM_MARGIN", "", "ONBOARDING_RADIUS", "getONBOARDING_RADIUS", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class InstallmentV5SingleDefaults {

    @NotNull
    public static final InstallmentV5SingleDefaults INSTANCE = new InstallmentV5SingleDefaults();
    private static final float MAX_LEFT_BLOCK_WIDTH = m.e.DEFAULT_DRAG_ANIMATION_DURATION;
    private static final float MAIN_BLOCK_RADIUS = CornerRadius.RADIUS_500.m1866getDpD9Ej5fM();
    private static final float MAIN_BLOCK_SELECT_RADIUS = CornerRadius.RADIUS_525.m1866getDpD9Ej5fM();
    private static final int ONBOARDING_WITH_TITLE_TOP_MARGIN = UiExtKt.toPx(32);
    private static final int ONBOARDING_TOP_MARGIN = UiExtKt.toPx(10);
    private static final int ONBOARDING_BOTTOM_MARGIN = UiExtKt.toPx(10);
    private static final float ONBOARDING_RADIUS = UiExtKt.toPxF(CornerRadius.RADIUS_600.m1866getDpD9Ej5fM());

    private InstallmentV5SingleDefaults() {
    }

    /* renamed from: getMAIN_BLOCK_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m881getMAIN_BLOCK_RADIUSD9Ej5fM() {
        return MAIN_BLOCK_RADIUS;
    }

    /* renamed from: getMAIN_BLOCK_SELECT_RADIUS-D9Ej5fM, reason: not valid java name */
    public final float m882getMAIN_BLOCK_SELECT_RADIUSD9Ej5fM() {
        return MAIN_BLOCK_SELECT_RADIUS;
    }

    /* renamed from: getMAX_LEFT_BLOCK_WIDTH-D9Ej5fM, reason: not valid java name */
    public final float m883getMAX_LEFT_BLOCK_WIDTHD9Ej5fM() {
        return MAX_LEFT_BLOCK_WIDTH;
    }

    public final int getONBOARDING_BOTTOM_MARGIN() {
        return ONBOARDING_BOTTOM_MARGIN;
    }

    public final float getONBOARDING_RADIUS() {
        return ONBOARDING_RADIUS;
    }

    public final int getONBOARDING_TOP_MARGIN() {
        return ONBOARDING_TOP_MARGIN;
    }

    public final int getONBOARDING_WITH_TITLE_TOP_MARGIN() {
        return ONBOARDING_WITH_TITLE_TOP_MARGIN;
    }
}
