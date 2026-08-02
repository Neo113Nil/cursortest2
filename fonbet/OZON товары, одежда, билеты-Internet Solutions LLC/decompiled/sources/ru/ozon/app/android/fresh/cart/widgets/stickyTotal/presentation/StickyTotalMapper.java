package ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.Spacers;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.data.StickyTotalDTO;
import ru.ozon.app.android.fresh.cart.widgets.stickyTotal.presentation.StickyTotalVO;
import ru.ozon.app.android.fresh.common.utils.ExtentionsKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00152*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0015B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e*\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "info", "toVO", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;Ll20/d;)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO;", "", "widgetId", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "resolveState", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;J)Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$State;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StickyTotalMapper implements Function2<StickyTotalDTO, d, List<? extends StickyTotalVO>> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalMapper$Companion;", "", "<init>", "()V", "getStickyTotalTypeFromDTO", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/presentation/StickyTotalVO$Type;", "dto", "Lru/ozon/app/android/fresh/cart/widgets/stickyTotal/data/StickyTotalDTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StickyTotalVO.Type getStickyTotalTypeFromDTO(@NotNull StickyTotalDTO dto) {
            ButtonV3DTO button;
            Intrinsics.checkNotNullParameter(dto, "dto");
            boolean z11 = dto.getPrice() == null && dto.getUnfavorablePrice() == null;
            StickyTotalDTO.StickyControl.ActionButton actionButton = dto.getActionButton();
            if (actionButton == null || (button = actionButton.getButton()) == null) {
                button = dto.getButton();
            }
            if (z11 && button != null) {
                return StickyTotalVO.Type.BUTTON_ONLY;
            }
            if (dto.getButton() != null) {
                return StickyTotalVO.Type.CART;
            }
            if ((dto.getStickyControl() != null && (dto.getStickyControl() instanceof StickyTotalDTO.StickyControl.ActionButton)) || (dto.getActionButton() != null && dto.getCountPicker() == null)) {
                return StickyTotalVO.Type.COMBO;
            }
            if (dto.getActionButton() != null && dto.getEnableAsync()) {
                return StickyTotalVO.Type.PDP_ASYNC;
            }
            if (dto.getActionButton() != null) {
                return StickyTotalVO.Type.PDP;
            }
            return null;
        }

        private Companion() {
        }
    }

    private final StickyTotalVO.State resolveState(StickyTotalDTO stickyTotalDTO, long j11) {
        ButtonV3DTO button;
        boolean z11 = stickyTotalDTO.getPrice() == null && stickyTotalDTO.getUnfavorablePrice() == null;
        StickyTotalDTO.StickyControl.ActionButton actionButton = stickyTotalDTO.getActionButton();
        if (actionButton == null || (button = actionButton.getButton()) == null) {
            button = stickyTotalDTO.getButton();
        }
        if (z11 && button != null) {
            return new StickyTotalVO.State.ButtonOnly(button);
        }
        if (stickyTotalDTO.getButton() != null) {
            return new StickyTotalVO.State.Cart(stickyTotalDTO.getButton());
        }
        if (stickyTotalDTO.getStickyControl() != null && (stickyTotalDTO.getStickyControl() instanceof StickyTotalDTO.StickyControl.ActionButton)) {
            ButtonV3DTO button2 = ((StickyTotalDTO.StickyControl.ActionButton) stickyTotalDTO.getStickyControl()).getButton();
            AtomActionDTO action = ((StickyTotalDTO.StickyControl.ActionButton) stickyTotalDTO.getStickyControl()).getAction();
            return new StickyTotalVO.State.Combo(button2, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, ((StickyTotalDTO.StickyControl.ActionButton) stickyTotalDTO.getStickyControl()).getDelay() != null ? r2.intValue() : 0L);
        }
        if (stickyTotalDTO.getActionButton() != null && stickyTotalDTO.getCountPicker() == null) {
            ButtonV3DTO button3 = stickyTotalDTO.getActionButton().getButton();
            AtomActionDTO action2 = stickyTotalDTO.getActionButton().getAction();
            return new StickyTotalVO.State.Combo(button3, action2 != null ? AtomActionMapperKt.toAtomAction(action2, null) : null, stickyTotalDTO.getActionButton().getDelay() != null ? r2.intValue() : 0L);
        }
        if (stickyTotalDTO.getActionButton() == null || stickyTotalDTO.getCountPicker() == null) {
            return null;
        }
        Map<String, TokenizedTrackingInfo> incrementTrackingInfo = stickyTotalDTO.getCountPicker().getQuantity().getChangeQuantityAction().getIncrementTrackingInfo();
        Map<String, TokenizedTrackingInfo> decrementTrackingInfo = stickyTotalDTO.getCountPicker().getQuantity().getChangeQuantityAction().getDecrementTrackingInfo();
        Map<String, TokenizedTrackingInfo> trackingInfo = stickyTotalDTO.getCountPicker().getQuantity().getDecrementRemoveAction().getTrackingInfo();
        boolean z12 = stickyTotalDTO.getCountPicker().getQuantity().getValue() != 0;
        ButtonV3DTO button4 = stickyTotalDTO.getActionButton().getButton();
        AtomActionDTO action3 = stickyTotalDTO.getActionButton().getAction();
        return new StickyTotalVO.State.Pdp(z12, button4, action3 != null ? AtomActionMapperKt.toAtomAction(action3, null) : null, stickyTotalDTO.getActionButton().getDelay() != null ? r0.intValue() : 0L, CartPickerMapperKt.toVO(stickyTotalDTO.getCountPicker(), j11), incrementTrackingInfo, decrementTrackingInfo, trackingInfo);
    }

    private final StickyTotalVO toVO(StickyTotalDTO stickyTotalDTO, d dVar) {
        long id2 = ExtentionsKt.getId(dVar);
        PriceDTO price = stickyTotalDTO.getPrice();
        StickyTotalVO.State resolveState = resolveState(stickyTotalDTO, id2);
        PriceDTO unfavorablePrice = stickyTotalDTO.getUnfavorablePrice();
        Spacers spacers = stickyTotalDTO.getSpacers();
        Spacers spacers2 = spacers == null ? new Spacers(null, null, null, null, null, 31, null) : spacers;
        String borderColor = stickyTotalDTO.getBorderColor();
        String backgroundColor = stickyTotalDTO.getBackgroundColor();
        boolean enableAsync = stickyTotalDTO.getEnableAsync();
        String a11 = dVar.c().a();
        Map<String, TokenizedTrackingInfo> trackingInfo = stickyTotalDTO.getTrackingInfo();
        t mapToTokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(id2), null, 2, null) : null;
        Boolean isRoundedCorners = stickyTotalDTO.isRoundedCorners();
        boolean booleanValue = isRoundedCorners != null ? isRoundedCorners.booleanValue() : true;
        CommonControlSettings priceDetailsControlSettings = stickyTotalDTO.getPriceDetailsControlSettings();
        return new StickyTotalVO(id2, price, resolveState, unfavorablePrice, borderColor, backgroundColor, spacers2, enableAsync, a11, mapToTokenizedEvent$default, booleanValue, priceDetailsControlSettings != null ? priceDetailsControlSettings.toAtomAction() : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<StickyTotalVO> invoke(@NotNull StickyTotalDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }
}
