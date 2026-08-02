package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.mapper;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2CellItemDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.cellItem.CartSplitV2CellItemVO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0001\u0018\u0000 \u00112*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0011B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2CellItemMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "Ll20/d;", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;J)Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/cellItem/CartSplitV2CellItemVO;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;Ll20/d;)Ljava/util/List;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2CellItemMapper implements Function2<CartSplitV2CellItemDTOV2, d, List<? extends CartSplitV2CellItemVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/mapper/CartSplitV2CellItemMapper$Companion;", "", "<init>", "()V", "DEFAULT_HIDDING_TIME", "", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final CartSplitV2CellItemVO toVO(CartSplitV2CellItemDTOV2 cartSplitV2CellItemDTOV2, long j11) {
        long id2 = cartSplitV2CellItemDTOV2.getId();
        CellDTO cell = cartSplitV2CellItemDTOV2.getCell();
        long intValue = cartSplitV2CellItemDTOV2.getHidingTimeMls() != null ? r1.intValue() : 5000L;
        String strokeColor = cartSplitV2CellItemDTOV2.getStrokeColor();
        Boolean isLast = cartSplitV2CellItemDTOV2.isLast();
        return new CartSplitV2CellItemVO(j11, id2, cell, intValue, strokeColor, isLast != null ? isLast.booleanValue() : false, cartSplitV2CellItemDTOV2.getExternalPaddings());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartSplitV2CellItemVO> invoke(@NotNull CartSplitV2CellItemDTOV2 state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        long id2 = state.getId();
        return C7714v.a0(toVO(state, (d11 + "_" + id2).hashCode()));
    }
}
