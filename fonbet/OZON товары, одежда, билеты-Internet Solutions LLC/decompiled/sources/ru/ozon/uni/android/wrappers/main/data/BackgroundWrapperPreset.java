package ru.ozon.uni.android.wrappers.main.data;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0014\u0010\u0010\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u0014\u0010\u0012\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0007R\u0014\u0010\u0014\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0007R\u0014\u0010\u0016\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0007R\u0014\u0010\u0018\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0007R\u0014\u0010\u001a\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0007¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperPreset;", "", "<init>", "()V", "button300", "Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "getButton300$uni_release", "()Lru/ozon/uni/android/wrappers/main/data/BackgroundWrapperSettings;", "button400", "getButton400$uni_release", "button500", "getButton500$uni_release", "button600", "getButton600$uni_release", "button700", "getButton700$uni_release", "fillData500", "getFillData500$uni_release", "fillData600", "getFillData600$uni_release", "fillData700", "getFillData700$uni_release", "horizontalCard400", "getHorizontalCard400$uni_release", "horizontalCard500", "getHorizontalCard500$uni_release", "horizontalCard600", "getHorizontalCard600$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BackgroundWrapperPreset {

    @NotNull
    public static final BackgroundWrapperPreset INSTANCE = new BackgroundWrapperPreset();

    @NotNull
    private static final BackgroundWrapperSettings button300;

    @NotNull
    private static final BackgroundWrapperSettings button400;

    @NotNull
    private static final BackgroundWrapperSettings button500;

    @NotNull
    private static final BackgroundWrapperSettings button600;

    @NotNull
    private static final BackgroundWrapperSettings button700;

    @NotNull
    private static final BackgroundWrapperSettings fillData500;

    @NotNull
    private static final BackgroundWrapperSettings fillData600;

    @NotNull
    private static final BackgroundWrapperSettings fillData700;

    @NotNull
    private static final BackgroundWrapperSettings horizontalCard400;

    @NotNull
    private static final BackgroundWrapperSettings horizontalCard500;

    @NotNull
    private static final BackgroundWrapperSettings horizontalCard600;

    static {
        BackgroundWrapperSize backgroundWrapperSize = BackgroundWrapperSize.SIZE_200;
        BackgroundPadding backgroundPadding = BackgroundPadding.PADDING_300;
        BackgroundWrapperCorners backgroundWrapperCorners = BackgroundWrapperCorners.INSTANCE;
        Corners cornersAll = backgroundWrapperCorners.getCornersAll();
        BackgroundMargin backgroundMargin = BackgroundMargin.MARGIN_NONE;
        button300 = new BackgroundWrapperSettings(backgroundWrapperSize, backgroundPadding, null, backgroundPadding, null, cornersAll, backgroundMargin, 20, null);
        BackgroundWrapperSize backgroundWrapperSize2 = BackgroundWrapperSize.SIZE_300;
        BackgroundPadding backgroundPadding2 = BackgroundPadding.PADDING_400;
        BackgroundPadding backgroundPadding3 = null;
        BackgroundPadding backgroundPadding4 = null;
        int i11 = 20;
        DefaultConstructorMarker defaultConstructorMarker = null;
        button400 = new BackgroundWrapperSettings(backgroundWrapperSize2, backgroundPadding2, backgroundPadding3, backgroundPadding2, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        BackgroundPadding backgroundPadding5 = BackgroundPadding.PADDING_500;
        button500 = new BackgroundWrapperSettings(backgroundWrapperSize2, backgroundPadding5, backgroundPadding3, backgroundPadding5, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        BackgroundWrapperSize backgroundWrapperSize3 = BackgroundWrapperSize.SIZE_400;
        button600 = new BackgroundWrapperSettings(backgroundWrapperSize3, backgroundPadding5, backgroundPadding3, backgroundPadding5, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        BackgroundWrapperSize backgroundWrapperSize4 = BackgroundWrapperSize.SIZE_500;
        BackgroundPadding backgroundPadding6 = BackgroundPadding.PADDING_800;
        button700 = new BackgroundWrapperSettings(backgroundWrapperSize4, backgroundPadding6, backgroundPadding3, backgroundPadding6, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        fillData500 = new BackgroundWrapperSettings(backgroundWrapperSize2, backgroundPadding5, backgroundPadding3, BackgroundPadding.PADDING_250, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        fillData600 = new BackgroundWrapperSettings(backgroundWrapperSize3, BackgroundPadding.PADDING_700, backgroundPadding3, backgroundPadding2, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        fillData700 = new BackgroundWrapperSettings(backgroundWrapperSize4, backgroundPadding6, backgroundPadding3, backgroundPadding5, backgroundPadding4, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        BackgroundPadding backgroundPadding7 = BackgroundPadding.PADDING_350;
        horizontalCard400 = new BackgroundWrapperSettings(backgroundWrapperSize3, backgroundPadding, null, backgroundPadding7, null, backgroundWrapperCorners.getCornersAll(), backgroundMargin, 20, null);
        BackgroundPadding backgroundPadding8 = null;
        BackgroundPadding backgroundPadding9 = null;
        horizontalCard500 = new BackgroundWrapperSettings(backgroundWrapperSize4, backgroundPadding7, backgroundPadding8, backgroundPadding2, backgroundPadding9, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
        horizontalCard600 = new BackgroundWrapperSettings(backgroundWrapperSize4, backgroundPadding2, backgroundPadding8, backgroundPadding5, backgroundPadding9, backgroundWrapperCorners.getCornersAll(), backgroundMargin, i11, defaultConstructorMarker);
    }

    private BackgroundWrapperPreset() {
    }

    @NotNull
    public final BackgroundWrapperSettings getButton300$uni_release() {
        return button300;
    }

    @NotNull
    public final BackgroundWrapperSettings getButton400$uni_release() {
        return button400;
    }

    @NotNull
    public final BackgroundWrapperSettings getButton500$uni_release() {
        return button500;
    }

    @NotNull
    public final BackgroundWrapperSettings getButton600$uni_release() {
        return button600;
    }

    @NotNull
    public final BackgroundWrapperSettings getButton700$uni_release() {
        return button700;
    }

    @NotNull
    public final BackgroundWrapperSettings getFillData500$uni_release() {
        return fillData500;
    }

    @NotNull
    public final BackgroundWrapperSettings getFillData600$uni_release() {
        return fillData600;
    }

    @NotNull
    public final BackgroundWrapperSettings getFillData700$uni_release() {
        return fillData700;
    }

    @NotNull
    public final BackgroundWrapperSettings getHorizontalCard400$uni_release() {
        return horizontalCard400;
    }

    @NotNull
    public final BackgroundWrapperSettings getHorizontalCard500$uni_release() {
        return horizontalCard500;
    }

    @NotNull
    public final BackgroundWrapperSettings getHorizontalCard600$uni_release() {
        return horizontalCard600;
    }
}
