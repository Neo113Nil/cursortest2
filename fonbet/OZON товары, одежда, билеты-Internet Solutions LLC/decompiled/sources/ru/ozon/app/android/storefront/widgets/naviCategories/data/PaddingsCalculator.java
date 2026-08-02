package ru.ozon.app.android.storefront.widgets.naviCategories.data;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.BlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.PaddingsVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviCategories/data/PaddingsCalculator;", "", "isDoubleSpanSize", "", "<init>", "(Z)V", "dp4", "", "dp8", "dp16", "calculatePaddings", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/PaddingsVO;", "position", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/BlockPositionVO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PaddingsCalculator {
    private final boolean isDoubleSpanSize;
    private final int dp4 = ResourceExtKt.toPx(4);
    private final int dp8 = ResourceExtKt.toPx(8);
    private final int dp16 = ResourceExtKt.toPx(16);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockPositionVO.values().length];
            try {
                iArr[BlockPositionVO.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockPositionVO.MIDDLE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockPositionVO.BOTTOM_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockPositionVO.TOP_BOTTOM_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockPositionVO.TOP_MIDDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockPositionVO.MIDDLE_MIDDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockPositionVO.BOTTOM_MIDDLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlockPositionVO.TOP_BOTTOM_MIDDLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlockPositionVO.TOP_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlockPositionVO.MIDDLE_RIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlockPositionVO.BOTTOM_RIGHT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlockPositionVO.TOP_BOTTOM_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PaddingsCalculator(boolean z11) {
        this.isDoubleSpanSize = z11;
    }

    @NotNull
    public final PaddingsVO calculatePaddings(@NotNull BlockPositionVO position) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(position, "position");
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i14 = 0;
        switch (iArr[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i11 = this.dp16;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i11 = this.dp8;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                if (!this.isDoubleSpanSize) {
                    i11 = 0;
                    break;
                } else {
                    i11 = this.dp8;
                    break;
                }
            default:
                throw new o();
        }
        switch (iArr[position.ordinal()]) {
            case 1:
            case 4:
            case 5:
            case 8:
            case 9:
            case 12:
                i12 = this.dp16;
                break;
            case 2:
            case 3:
            case 6:
            case 7:
            case 10:
            case 11:
                i12 = this.dp4;
                break;
            default:
                throw new o();
        }
        switch (iArr[position.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                if (this.isDoubleSpanSize) {
                    i14 = this.dp8;
                    break;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i14 = this.dp8;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                i14 = this.dp16;
                break;
            default:
                throw new o();
        }
        switch (iArr[position.ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 9:
            case 10:
                i13 = this.dp4;
                break;
            case 3:
            case 4:
            case 7:
            case 8:
            case 11:
            case 12:
                i13 = this.dp16;
                break;
            default:
                throw new o();
        }
        return new PaddingsVO(i11, i12, i14, i13);
    }
}
