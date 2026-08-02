package ru.ozon.app.android.ugc.widgets.ugccounters.presentation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\tR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\tR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\tR\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\t¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/ugc/widgets/ugccounters/presentation/UgcCountersImageConstants;", "", "<init>", "()V", "", "ELEMENT_SIZE_PX", "I", "IMAGE_SIZE_PX", "getIMAGE_SIZE_PX", "()I", "HORIZONTAL_OVERLAP_PX", "ELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX", "getELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX", "ADDITIONAL_WIDTH", "getADDITIONAL_WIDTH", "ELEMENT_SIZE_WITH_PADDINGS", "getELEMENT_SIZE_WITH_PADDINGS", "LEFT_OVERLAP", "getLEFT_OVERLAP", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCountersImageConstants {
    private static final int ADDITIONAL_WIDTH;
    private static final int ELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX;
    private static final int ELEMENT_SIZE_PX;
    private static final int ELEMENT_SIZE_WITH_PADDINGS;
    private static final int HORIZONTAL_OVERLAP_PX;
    private static final int IMAGE_SIZE_PX;

    @NotNull
    public static final UgcCountersImageConstants INSTANCE = new UgcCountersImageConstants();
    private static final int LEFT_OVERLAP;

    static {
        Dimens dimens = Dimens.INSTANCE;
        int dp_52 = dimens.getDP_52();
        ELEMENT_SIZE_PX = dp_52;
        IMAGE_SIZE_PX = (int) (dp_52 * 1.2d);
        int dp_20 = dimens.getDP_20();
        HORIZONTAL_OVERLAP_PX = dp_20;
        int dp_2 = dimens.getDP_2();
        ELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX = dp_2;
        int i11 = dp_2 * 2;
        ADDITIONAL_WIDTH = i11;
        ELEMENT_SIZE_WITH_PADDINGS = dp_52 + i11;
        LEFT_OVERLAP = dp_20 + i11;
    }

    private UgcCountersImageConstants() {
    }

    public final int getADDITIONAL_WIDTH() {
        return ADDITIONAL_WIDTH;
    }

    public final int getELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX() {
        return ELEMENTS_SEPARATOR_VISIBLE_WIDTH_PX;
    }

    public final int getELEMENT_SIZE_WITH_PADDINGS() {
        return ELEMENT_SIZE_WITH_PADDINGS;
    }

    public final int getIMAGE_SIZE_PX() {
        return IMAGE_SIZE_PX;
    }

    public final int getLEFT_OVERLAP() {
        return LEFT_OVERLAP;
    }
}
