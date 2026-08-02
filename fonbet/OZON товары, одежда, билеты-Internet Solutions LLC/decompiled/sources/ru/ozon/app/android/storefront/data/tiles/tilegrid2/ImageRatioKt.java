package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"toConstraintLayoutRatio", "", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "default", "tiles_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageRatioKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ImageRatio.values().length];
            try {
                iArr[ImageRatio.IMAGE_RATIO_1_1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ImageRatio.IMAGE_RATIO_3_4.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final String toConstraintLayoutRatio(ImageRatio imageRatio, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "default");
        int i11 = imageRatio == null ? -1 : WhenMappings.$EnumSwitchMapping$0[imageRatio.ordinal()];
        if (i11 == -1) {
            return str;
        }
        if (i11 == 1) {
            return "H,1:1";
        }
        if (i11 == 2) {
            return "H,3:4";
        }
        throw new o();
    }

    public static /* synthetic */ String toConstraintLayoutRatio$default(ImageRatio imageRatio, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "H,1:1";
        }
        return toConstraintLayoutRatio(imageRatio, str);
    }
}
