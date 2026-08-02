package ru.ozon.uni.atoms.v3.holders.productMedia;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0000\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\u0010\u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\n"}, d2 = {"isSmallLabelDisabled", "", "smallLabel", "", "width", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;", "isLabelDisabled", "item", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "isIconDisabled", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductMediaUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductMediaDTO.Width.values().length];
            try {
                iArr[ProductMediaDTO.Width.WIDTH_900.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_1000.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_1100.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_1200.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isIconDisabled(@NotNull ProductMediaDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return (item.getIcon() != null && item.getSmallIcon() == null && item.getSmallLabel() == null) ? false : true;
    }

    public static final boolean isLabelDisabled(@NotNull ProductMediaDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return (item.getLabel() != null && item.getIcon() == null && item.getSmallIcon() == null && item.getSmallLabel() == null) ? false : true;
    }

    public static final boolean isSmallLabelDisabled(String str, ProductMediaDTO.Width width) {
        int i11 = width == null ? -1 : WhenMappings.$EnumSwitchMapping$0[width.ordinal()];
        return str == null || !(i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4);
    }
}
