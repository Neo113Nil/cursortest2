package ru.ozon.app.android.fresh.main.utils;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/fresh/main/utils/RoundedViewCorners;", "", "<init>", "()V", "cornerRadius", "", "topCorners", "", "getTopCorners", "()[F", "bottomCorners", "getBottomCorners", "fullCorners", "getFullCorners", "noneCorners", "getNoneCorners", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class RoundedViewCorners {

    @NotNull
    public static final RoundedViewCorners INSTANCE = new RoundedViewCorners();

    @NotNull
    private static final float[] bottomCorners;
    private static final float cornerRadius;

    @NotNull
    private static final float[] fullCorners;

    @NotNull
    private static final float[] noneCorners;

    @NotNull
    private static final float[] topCorners;

    static {
        float pxF = ResourceExtKt.toPxF(24);
        cornerRadius = pxF;
        topCorners = new float[]{pxF, pxF, pxF, pxF, 0.0f, 0.0f, 0.0f, 0.0f};
        bottomCorners = new float[]{0.0f, 0.0f, 0.0f, 0.0f, pxF, pxF, pxF, pxF};
        fullCorners = new float[]{pxF, pxF, pxF, pxF, pxF, pxF, pxF, pxF};
        noneCorners = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    }

    private RoundedViewCorners() {
    }

    @NotNull
    public final float[] getBottomCorners() {
        return bottomCorners;
    }

    @NotNull
    public final float[] getFullCorners() {
        return fullCorners;
    }

    @NotNull
    public final float[] getNoneCorners() {
        return noneCorners;
    }

    @NotNull
    public final float[] getTopCorners() {
        return topCorners;
    }
}
