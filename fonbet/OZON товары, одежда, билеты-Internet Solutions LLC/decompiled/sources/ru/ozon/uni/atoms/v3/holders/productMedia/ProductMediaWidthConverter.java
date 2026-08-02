package ru.ozon.uni.atoms.v3.holders.productMedia;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/v3/holders/productMedia/ProductMediaWidthConverter;", "", "<init>", "()V", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;", "width", "", "convertWidthToIconSize$uni_release", "(Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO$Width;)I", "convertWidthToIconSize", "convertWidthToSmallIconWidth$uni_release", "convertWidthToSmallIconWidth", "convertWidthToLabelStyle$uni_release", "convertWidthToLabelStyle", "convertWidthToTextPaddings$uni_release", "convertWidthToTextPaddings", "convertWidthToSmallLabelStyle$uni_release", "convertWidthToSmallLabelStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductMediaWidthConverter {

    @NotNull
    public static final ProductMediaWidthConverter INSTANCE = new ProductMediaWidthConverter();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductMediaDTO.Width.values().length];
            try {
                iArr[ProductMediaDTO.Width.WIDTH_300.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_400.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_500.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_600.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_700.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_800.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_900.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_1000.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_1100.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ProductMediaDTO.Width.WIDTH_1200.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private ProductMediaWidthConverter() {
    }

    public final int convertWidthToIconSize$uni_release(@NotNull ProductMediaDTO.Width width) {
        int i11;
        Intrinsics.checkNotNullParameter(width, "width");
        switch (WhenMappings.$EnumSwitchMapping$0[width.ordinal()]) {
            case 1:
                i11 = 16;
                break;
            case 2:
                i11 = 20;
                break;
            case 3:
                i11 = 24;
                break;
            case 4:
                i11 = 32;
                break;
            case 5:
                i11 = 40;
                break;
            case 6:
                i11 = 48;
                break;
            default:
                i11 = 64;
                break;
        }
        return UiExtKt.toPx(i11);
    }

    public final int convertWidthToLabelStyle$uni_release(@NotNull ProductMediaDTO.Width width) {
        Intrinsics.checkNotNullParameter(width, "width");
        switch (WhenMappings.$EnumSwitchMapping$0[width.ordinal()]) {
            case 1:
                return UniTextStyles.BODY_CONTROL_300_X_SMALL.getResId();
            case 2:
                return UniTextStyles.BODY_CONTROL_400_SMALL.getResId();
            case 3:
                return UniTextStyles.BODY_CONTROL_500_MEDIUM.getResId();
            case 4:
                return UniTextStyles.HEADLINE_400_SMALL.getResId();
            case 5:
                return UniTextStyles.HEADLINE_500_MEDIUM.getResId();
            case 6:
                return UniTextStyles.HEADLINE_700_X_LARGE.getResId();
            default:
                return UniTextStyles.HEADLINE_800_X_X_LARGE.getResId();
        }
    }

    public final int convertWidthToSmallIconWidth$uni_release(@NotNull ProductMediaDTO.Width width) {
        int i11;
        Intrinsics.checkNotNullParameter(width, "width");
        switch (WhenMappings.$EnumSwitchMapping$0[width.ordinal()]) {
            case 1:
            case 2:
                i11 = 12;
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                i11 = 16;
                break;
            case 9:
            case 10:
                i11 = 24;
                break;
            default:
                throw new o();
        }
        return UiExtKt.toPx(i11);
    }

    public final int convertWidthToSmallLabelStyle$uni_release(@NotNull ProductMediaDTO.Width width) {
        Intrinsics.checkNotNullParameter(width, "width");
        switch (WhenMappings.$EnumSwitchMapping$0[width.ordinal()]) {
            case 7:
            case 8:
                return UniTextStyles.COMPACT_400_SMALL.getResId();
            case 9:
            case 10:
                return UniTextStyles.COMPACT_500_MEDIUM.getResId();
            default:
                return UniTextStyles.BODY_CONTROL_300_X_SMALL.getResId();
        }
    }

    public final int convertWidthToTextPaddings$uni_release(@NotNull ProductMediaDTO.Width width) {
        int i11;
        Intrinsics.checkNotNullParameter(width, "width");
        switch (WhenMappings.$EnumSwitchMapping$0[width.ordinal()]) {
            case 1:
                i11 = 2;
                break;
            case 2:
                i11 = 4;
                break;
            case 3:
                i11 = 6;
                break;
            case 4:
                i11 = 8;
                break;
            case 5:
                i11 = 10;
                break;
            case 6:
                i11 = 12;
                break;
            default:
                i11 = 16;
                break;
        }
        return UiExtKt.toPx(i11);
    }
}
