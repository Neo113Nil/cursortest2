package ru.ozon.app.android.cart.totalV3.data;

import Sc.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.data.TotalDTO;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.DataButtonDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000z\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0001H\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0002*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0007*\u00020\bH\u0002\u001a\f\u0010\u0000\u001a\u00020\t*\u00020\nH\u0002\u001a\f\u0010\u0000\u001a\u00020\u000b*\u00020\fH\u0002\u001a\u0014\u0010\u0000\u001a\u00020\r*\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0006H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0015*\u00020\u0016H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0017*\u00020\u0018H\u0002\u001a\f\u0010\u0000\u001a\u00020\u0019*\u00020\u001aH\u0002\u001a\f\u0010\u0000\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a\f\u0010\u0000\u001a\u00020\u001d*\u00020\u001eH\u0002¨\u0006\u001f"}, d2 = {"toVO", "", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO;", "widgetId", "", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$PriceCardVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$PriceCardDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$DividerVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$DividerDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$HorizontalMarginsVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$HorizontalMarginsDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalButtonVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$TotalButtonDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$TotalTextVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$TotalTextDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$SpaceVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$SpaceDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceLinePartVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceLinePartDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceLineVO$PriceWithCommonVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceLineDTO$PriceWithCommonDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$TextWithIconVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$TextWithIconDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$PriceBlockVO$IconWithPositionVO$PositionVO;", "Lru/ozon/app/android/cart/totalV3/data/TotalDTO$TotalItem$PriceBlockDTO$IconWithPositionDTO$PositionDTO;", "cart_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalMapperKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TotalDTO.TotalItem.PriceBlockDTO.IconWithPositionDTO.PositionDTO.values().length];
            try {
                iArr[TotalDTO.TotalItem.PriceBlockDTO.IconWithPositionDTO.PositionDTO.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TotalDTO.TotalItem.PriceBlockDTO.IconWithPositionDTO.PositionDTO.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final List<TotalVO.TotalItemVO> toVO(@NotNull List<? extends TotalDTO.TotalItem> list) {
        TotalVO.TotalItemVO vo;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends TotalDTO.TotalItem> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            TotalDTO.TotalItem totalItem = (TotalDTO.TotalItem) obj;
            long j11 = i11;
            if (totalItem instanceof TotalDTO.TotalItem.PriceBlockDTO) {
                vo = toVO((TotalDTO.TotalItem.PriceBlockDTO) totalItem, j11);
            } else if (totalItem instanceof TotalDTO.TotalItem.TotalButtonDTO) {
                vo = toVO((TotalDTO.TotalItem.TotalButtonDTO) totalItem, j11);
            } else if (totalItem instanceof TotalDTO.TotalItem.TotalTextDTO) {
                vo = toVO((TotalDTO.TotalItem.TotalTextDTO) totalItem, j11);
            } else if (totalItem instanceof TotalDTO.TotalItem.SpaceDTO) {
                vo = toVO((TotalDTO.TotalItem.SpaceDTO) totalItem, j11);
            } else {
                if (!(totalItem instanceof TotalDTO.TotalItem.PriceLineDTO)) {
                    throw new o();
                }
                vo = toVO((TotalDTO.TotalItem.PriceLineDTO) totalItem, j11);
            }
            arrayList.add(vo);
            i11 = i12;
        }
        return arrayList;
    }

    private static final TotalVO.TotalItemVO toVO(TotalDTO.TotalItem.PriceBlockDTO priceBlockDTO, long j11) {
        TotalVO.TotalItemVO.PriceBlockVO.PriceCardVO vo = toVO(priceBlockDTO.getLeftPriceCart());
        TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO rightPriceCart = priceBlockDTO.getRightPriceCart();
        TotalVO.TotalItemVO.PriceBlockVO.PriceCardVO vo2 = rightPriceCart != null ? toVO(rightPriceCart) : null;
        TotalDTO.TotalItem.PriceBlockDTO.DividerDTO divider = priceBlockDTO.getDivider();
        TotalVO.TotalItemVO.PriceBlockVO.DividerVO vo3 = divider != null ? toVO(divider) : null;
        TotalDTO.HorizontalMarginsDTO margins = priceBlockDTO.getMargins();
        return new TotalVO.TotalItemVO.PriceBlockVO(j11, vo, vo2, vo3, margins != null ? toVO(margins) : null);
    }

    private static final TotalVO.TotalItemVO.PriceBlockVO.PriceCardVO toVO(TotalDTO.TotalItem.PriceBlockDTO.PriceCardDTO priceCardDTO) {
        AtomActionDTO action;
        PriceDTO price = priceCardDTO.getPrice();
        TotalVO.TotalItemVO.PriceBlockVO.TextWithIconVO vo = toVO(priceCardDTO.getTextWithIcon());
        CommonControlSettings common = priceCardDTO.getCommon();
        return new TotalVO.TotalItemVO.PriceBlockVO.PriceCardVO(price, vo, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, priceCardDTO.getCommon().getTrackingInfo()), priceCardDTO.getBackgroundColor(), priceCardDTO.getTopPadding(), priceCardDTO.getBottomPadding(), priceCardDTO.getLeftPadding(), priceCardDTO.getRightPadding());
    }

    private static final TotalVO.TotalItemVO.PriceBlockVO.DividerVO toVO(TotalDTO.TotalItem.PriceBlockDTO.DividerDTO dividerDTO) {
        return new TotalVO.TotalItemVO.PriceBlockVO.DividerVO(dividerDTO.getHeight(), dividerDTO.getWidth(), dividerDTO.getColor(), toVO(dividerDTO.getMargins()));
    }

    private static final TotalVO.HorizontalMarginsVO toVO(TotalDTO.HorizontalMarginsDTO horizontalMarginsDTO) {
        return new TotalVO.HorizontalMarginsVO(horizontalMarginsDTO.getMarginLeft(), horizontalMarginsDTO.getMarginRight());
    }

    private static final TotalVO.TotalItemVO.TotalButtonVO toVO(TotalDTO.TotalItem.TotalButtonDTO totalButtonDTO, long j11) {
        DataButtonDTO button = totalButtonDTO.getButton();
        CommonControlSettings common = totalButtonDTO.getButton().getCommon();
        DataButtonDTO copy$default = DataButtonDTO.copy$default(button, null, null, Boolean.valueOf((common != null ? common.getAction() : null) != null), Boolean.valueOf(totalButtonDTO.getButton().getData() == null), null, null, null, null, 243, null);
        TotalDTO.HorizontalMarginsDTO margins = totalButtonDTO.getMargins();
        return new TotalVO.TotalItemVO.TotalButtonVO(j11, copy$default, margins != null ? toVO(margins) : null);
    }

    private static final TotalVO.TotalItemVO.TotalTextVO toVO(TotalDTO.TotalItem.TotalTextDTO totalTextDTO, long j11) {
        TextDTO copy$default = TextDTO.copy$default(totalTextDTO.getText(), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
        TotalDTO.HorizontalMarginsDTO margins = totalTextDTO.getMargins();
        return new TotalVO.TotalItemVO.TotalTextVO(j11, copy$default, margins != null ? toVO(margins) : null);
    }

    private static final TotalVO.TotalItemVO.SpaceVO toVO(TotalDTO.TotalItem.SpaceDTO spaceDTO, long j11) {
        return new TotalVO.TotalItemVO.SpaceVO(j11, spaceDTO.getHeight());
    }

    private static final TotalVO.TotalItemVO.PriceLineVO toVO(TotalDTO.TotalItem.PriceLineDTO priceLineDTO, long j11) {
        TotalDTO.TotalItem.PriceLineDTO.PriceLinePartDTO left = priceLineDTO.getLeft();
        TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO vo = left != null ? toVO(left) : null;
        TotalDTO.TotalItem.PriceLineDTO.PriceLinePartDTO right = priceLineDTO.getRight();
        TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO vo2 = right != null ? toVO(right) : null;
        TotalDTO.HorizontalMarginsDTO margins = priceLineDTO.getMargins();
        return new TotalVO.TotalItemVO.PriceLineVO(j11, vo, vo2, margins != null ? toVO(margins) : null);
    }

    private static final TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO toVO(TotalDTO.TotalItem.PriceLineDTO.PriceLinePartDTO priceLinePartDTO) {
        TextDTO text = priceLinePartDTO.getText();
        TotalDTO.TotalItem.PriceLineDTO.PriceWithCommonDTO priceWithCommon = priceLinePartDTO.getPriceWithCommon();
        return new TotalVO.TotalItemVO.PriceLineVO.PriceLinePartVO(text, priceWithCommon != null ? toVO(priceWithCommon) : null);
    }

    private static final TotalVO.TotalItemVO.PriceLineVO.PriceWithCommonVO toVO(TotalDTO.TotalItem.PriceLineDTO.PriceWithCommonDTO priceWithCommonDTO) {
        AtomActionDTO action;
        PriceDTO price = priceWithCommonDTO.getPrice();
        CommonControlSettings common = priceWithCommonDTO.getCommon();
        return new TotalVO.TotalItemVO.PriceLineVO.PriceWithCommonVO(price, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, priceWithCommonDTO.getCommon().getTrackingInfo()));
    }

    private static final TotalVO.TotalItemVO.PriceBlockVO.TextWithIconVO toVO(TotalDTO.TotalItem.PriceBlockDTO.TextWithIconDTO textWithIconDTO) {
        TextDTO text = textWithIconDTO.getText();
        TotalDTO.TotalItem.PriceBlockDTO.IconWithPositionDTO iconWithPosition = textWithIconDTO.getIconWithPosition();
        return new TotalVO.TotalItemVO.PriceBlockVO.TextWithIconVO(text, iconWithPosition != null ? toVO(iconWithPosition) : null);
    }

    private static final TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO toVO(TotalDTO.TotalItem.PriceBlockDTO.IconWithPositionDTO iconWithPositionDTO) {
        return new TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO(iconWithPositionDTO.getIcon(), toVO(iconWithPositionDTO.getPosition()));
    }

    private static final TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO.PositionVO toVO(TotalDTO.TotalItem.PriceBlockDTO.IconWithPositionDTO.PositionDTO positionDTO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[positionDTO.ordinal()];
        if (i11 == 1) {
            return TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO.PositionVO.START;
        }
        if (i11 == 2) {
            return TotalVO.TotalItemVO.PriceBlockVO.IconWithPositionVO.PositionVO.END;
        }
        throw new o();
    }
}
