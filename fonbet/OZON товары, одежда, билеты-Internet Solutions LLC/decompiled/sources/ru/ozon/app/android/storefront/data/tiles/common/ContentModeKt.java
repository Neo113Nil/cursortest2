package ru.ozon.app.android.storefront.data.tiles.common;

import android.widget.ImageView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"mapScaleType", "Landroid/widget/ImageView$ScaleType;", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "tiles_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ContentModeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentMode.values().length];
            try {
                iArr[ContentMode.SCALE_ASPECT_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentMode.SCALE_ASPECT_FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContentMode.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final ImageView.ScaleType mapScaleType(ContentMode contentMode) {
        int i11 = contentMode == null ? -1 : WhenMappings.$EnumSwitchMapping$0[contentMode.ordinal()];
        if (i11 == 1) {
            return ImageView.ScaleType.CENTER_CROP;
        }
        if (i11 != 2 && i11 == 3) {
            return ImageView.ScaleType.FIT_CENTER;
        }
        return ImageView.ScaleType.FIT_CENTER;
    }
}
