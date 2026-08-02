package ru.ozon.uni.android.ds.compose.component.price;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"toSize", "Lru/ozon/uni/android/ds/compose/component/price/DsPriceSize;", "Lru/ozon/uni/atoms/data/price/PriceDTO$Preset;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DsPriceSizeKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PriceDTO.Preset.values().length];
            try {
                iArr[PriceDTO.Preset.SIZE_200.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PriceDTO.Preset.SIZE_300.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceDTO.Preset.SIZE_400.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceDTO.Preset.SIZE_500.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PriceDTO.Preset.SIZE_600.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PriceDTO.Preset.SIZE_800.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final DsPriceSize toSize(@NotNull PriceDTO.Preset preset) {
        Intrinsics.checkNotNullParameter(preset, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[preset.ordinal()]) {
            case 1:
                return DsPriceSize.SIZE_200;
            case 2:
                return DsPriceSize.SIZE_300;
            case 3:
                return DsPriceSize.SIZE_400;
            case 4:
                return DsPriceSize.SIZE_500;
            case 5:
                return DsPriceSize.SIZE_600;
            case 6:
                return DsPriceSize.SIZE_800;
            default:
                throw new o();
        }
    }
}
