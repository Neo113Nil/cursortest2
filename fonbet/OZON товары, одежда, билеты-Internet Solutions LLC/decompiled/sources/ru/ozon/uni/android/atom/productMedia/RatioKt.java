package ru.ozon.uni.android.atom.productMedia;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0004"}, d2 = {"mapProductMediaRatio", "Lru/ozon/uni/android/atom/productMedia/Ratio;", "ratio", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Ratio;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RatioKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductMediaDTO.Ratio.values().length];
            try {
                iArr[ProductMediaDTO.Ratio.RATIO_3_4.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductMediaDTO.Ratio.RATIO_4_3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final Ratio mapProductMediaRatio(ProductMediaDTO.Ratio ratio) {
        int i11 = ratio == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ratio.ordinal()];
        return i11 != 1 ? i11 != 2 ? Ratio.RATIO_1_1 : Ratio.RATIO_4_3 : Ratio.RATIO_3_4;
    }
}
