package ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.NaviBlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.RoundedCornerVO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0004H\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"getRoundedCorners", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/RoundedCornerVO;", "model", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel;", "getFirstPositionCorner", "getSecondPositionCorner", "getPenultimatePositionCorner", "getLastPositionCorner", "hasTopCorners", "", "hasBottomCorners", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviBlocksCornerMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[NaviBlockPositionVO.values().length];
            try {
                iArr[NaviBlockPositionVO.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NaviBlockPositionVO.SECOND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[NaviBlockPositionVO.MIDDLE_EVEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[NaviBlockPositionVO.MIDDLE_ODD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[NaviBlockPositionVO.PENULTIMATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[NaviBlockPositionVO.LAST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[NaviBlockPositionVO.FIRST_PENULTIMATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[NaviBlockPositionVO.SECOND_LAST.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NaviBlocksDTO.RoundedCornersDTO.values().length];
            try {
                iArr2[NaviBlocksDTO.RoundedCornersDTO.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[NaviBlocksDTO.RoundedCornersDTO.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[NaviBlocksDTO.RoundedCornersDTO.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final RoundedCornerVO getFirstPositionCorner(NaviBlockModel naviBlockModel) {
        return hasTopCorners(naviBlockModel) ? RoundedCornerVO.TOP_LEFT : RoundedCornerVO.NONE;
    }

    private static final RoundedCornerVO getLastPositionCorner(NaviBlockModel naviBlockModel) {
        return hasBottomCorners(naviBlockModel) ? RoundedCornerVO.BOTTOM_RIGHT : RoundedCornerVO.NONE;
    }

    private static final RoundedCornerVO getPenultimatePositionCorner(NaviBlockModel naviBlockModel) {
        return hasBottomCorners(naviBlockModel) ? RoundedCornerVO.BOTTOM_LEFT : RoundedCornerVO.NONE;
    }

    @NotNull
    public static final List<RoundedCornerVO> getRoundedCorners(@NotNull NaviBlockModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ArrayList arrayList = new ArrayList();
        switch (WhenMappings.$EnumSwitchMapping$0[model.getPosition().ordinal()]) {
            case 1:
                arrayList.add(getFirstPositionCorner(model));
                return arrayList;
            case 2:
                arrayList.add(getSecondPositionCorner(model));
                return arrayList;
            case 3:
            case 4:
                arrayList.add(RoundedCornerVO.NONE);
                return arrayList;
            case 5:
                arrayList.add(getPenultimatePositionCorner(model));
                return arrayList;
            case 6:
                arrayList.add(getLastPositionCorner(model));
                return arrayList;
            case 7:
                arrayList.add(getFirstPositionCorner(model));
                arrayList.add(getPenultimatePositionCorner(model));
                return arrayList;
            case 8:
                arrayList.add(getSecondPositionCorner(model));
                arrayList.add(getLastPositionCorner(model));
                return arrayList;
            default:
                throw new o();
        }
    }

    private static final RoundedCornerVO getSecondPositionCorner(NaviBlockModel naviBlockModel) {
        return hasTopCorners(naviBlockModel) ? RoundedCornerVO.TOP_RIGHT : RoundedCornerVO.NONE;
    }

    private static final boolean hasBottomCorners(NaviBlockModel naviBlockModel) {
        NaviBlocksDTO.RoundedCornersDTO roundedCorners = naviBlockModel.getRoundedCorners();
        int i11 = roundedCorners == null ? -1 : WhenMappings.$EnumSwitchMapping$1[roundedCorners.ordinal()];
        return i11 == 1 || i11 == 3;
    }

    private static final boolean hasTopCorners(NaviBlockModel naviBlockModel) {
        NaviBlocksDTO.RoundedCornersDTO roundedCorners = naviBlockModel.getRoundedCorners();
        int i11 = roundedCorners == null ? -1 : WhenMappings.$EnumSwitchMapping$1[roundedCorners.ordinal()];
        return i11 == 1 || i11 == 2;
    }
}
