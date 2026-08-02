package ru.ozon.app.android.storefront.widgets.naviCategories.data;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviCategories.data.NaviCategoriesDTO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.BlockPositionVO;
import ru.ozon.app.android.storefront.widgets.naviCategories.presentation.RoundedCornerVO;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0002*\u00020\u0004H\u0002\u001a\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0004H\u0002\u001a\f\u0010\u0007\u001a\u00020\u0002*\u00020\u0004H\u0002\u001a\f\u0010\b\u001a\u00020\u0002*\u00020\u0004H\u0002\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0004H\u0002\u001a\f\u0010\u000b\u001a\u00020\n*\u00020\u0004H\u0002¨\u0006\f"}, d2 = {"getRoundedCorners", "", "Lru/ozon/app/android/storefront/widgets/naviCategories/presentation/RoundedCornerVO;", "model", "Lru/ozon/app/android/storefront/widgets/naviCategories/data/NaviCategoriesModel;", "getTopLeftCorner", "getTopRightCorner", "getBottomLeftCorner", "getBottomRightCorner", "hasTopCorners", "", "hasBottomCorners", "storefront_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RoundedCornerMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BlockPositionVO.values().length];
            try {
                iArr[BlockPositionVO.TOP_MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockPositionVO.MIDDLE_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlockPositionVO.MIDDLE_MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlockPositionVO.MIDDLE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BlockPositionVO.BOTTOM_MIDDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BlockPositionVO.TOP_BOTTOM_MIDDLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BlockPositionVO.TOP_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BlockPositionVO.TOP_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BlockPositionVO.BOTTOM_LEFT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BlockPositionVO.BOTTOM_RIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BlockPositionVO.TOP_BOTTOM_LEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BlockPositionVO.TOP_BOTTOM_RIGHT.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[NaviCategoriesDTO.RoundedCornersDTO.values().length];
            try {
                iArr2[NaviCategoriesDTO.RoundedCornersDTO.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[NaviCategoriesDTO.RoundedCornersDTO.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[NaviCategoriesDTO.RoundedCornersDTO.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[NaviCategoriesDTO.RoundedCornersDTO.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final RoundedCornerVO getBottomLeftCorner(NaviCategoriesModel naviCategoriesModel) {
        return hasBottomCorners(naviCategoriesModel) ? RoundedCornerVO.BOTTOM_LEFT : RoundedCornerVO.NONE;
    }

    private static final RoundedCornerVO getBottomRightCorner(NaviCategoriesModel naviCategoriesModel) {
        return hasBottomCorners(naviCategoriesModel) ? RoundedCornerVO.BOTTOM_RIGHT : RoundedCornerVO.NONE;
    }

    @NotNull
    public static final List<RoundedCornerVO> getRoundedCorners(@NotNull NaviCategoriesModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        ArrayList arrayList = new ArrayList();
        switch (WhenMappings.$EnumSwitchMapping$0[model.getPosition().ordinal()]) {
            case 7:
                arrayList.add(getTopLeftCorner(model));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return arrayList;
            case 8:
                arrayList.add(getTopRightCorner(model));
                return arrayList;
            case 9:
                arrayList.add(getBottomLeftCorner(model));
                return arrayList;
            case 10:
                arrayList.add(getBottomRightCorner(model));
                return arrayList;
            case 11:
                arrayList.add(getTopLeftCorner(model));
                arrayList.add(getBottomLeftCorner(model));
                return arrayList;
            case 12:
                arrayList.add(getTopRightCorner(model));
                arrayList.add(getBottomRightCorner(model));
                return arrayList;
            default:
                throw new o();
        }
    }

    private static final RoundedCornerVO getTopLeftCorner(NaviCategoriesModel naviCategoriesModel) {
        return hasTopCorners(naviCategoriesModel) ? RoundedCornerVO.TOP_LEFT : RoundedCornerVO.NONE;
    }

    private static final RoundedCornerVO getTopRightCorner(NaviCategoriesModel naviCategoriesModel) {
        return hasTopCorners(naviCategoriesModel) ? RoundedCornerVO.TOP_RIGHT : RoundedCornerVO.NONE;
    }

    private static final boolean hasBottomCorners(NaviCategoriesModel naviCategoriesModel) {
        NaviCategoriesDTO.RoundedCornersDTO roundedCorners = naviCategoriesModel.getRoundedCorners();
        int i11 = roundedCorners == null ? -1 : WhenMappings.$EnumSwitchMapping$1[roundedCorners.ordinal()];
        if (i11 == -1) {
            return false;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return false;
            }
            if (i11 != 3) {
                if (i11 == 4) {
                    return false;
                }
                throw new o();
            }
        }
        return true;
    }

    private static final boolean hasTopCorners(NaviCategoriesModel naviCategoriesModel) {
        NaviCategoriesDTO.RoundedCornersDTO roundedCorners = naviCategoriesModel.getRoundedCorners();
        int i11 = roundedCorners == null ? -1 : WhenMappings.$EnumSwitchMapping$1[roundedCorners.ordinal()];
        if (i11 == -1) {
            return false;
        }
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        throw new o();
    }
}
