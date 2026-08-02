package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation;

import Sc.o;
import WZ.t;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.common.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 %2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001%B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u000b\u001a\u00020\u0010*\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000b\u0010\u0011J\u001b\u0010\u000b\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0014J\u0013\u0010\u000b\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u000b\u0010\u0017J\u001b\u0010\u000b\u001a\u00020\u0019*\u00020\u00182\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u001aJ\u001b\u0010\u000b\u001a\u00020\u001c*\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u001dJ\u001b\u0010\u001f\u001a\u00020\u001e*\u00020\u001b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO;J)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;", "", "swipeBackgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;JLjava/lang/String;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;J)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;J)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;J)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "toFavoriteState", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;J)Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO;Ll20/d;)Ljava/util/List;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileMapper implements Function2<CartTileDTO, d, List<? extends CartTileVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileMapper$Companion;", "", "<init>", "()V", "SKU_KEY", "", "ADULT_KEY", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final FreshFavoriteState toFavoriteState(CartTileDTO.TileItem.FavoriteButton favoriteButton, long j11) {
        String orDefault;
        String orDefault2;
        Map<String, String> params = favoriteButton.getFavoriteAction().getParams();
        Long valueOf = (params == null || (orDefault2 = params.getOrDefault("sku", null)) == null) ? null : Long.valueOf(Long.parseLong(orDefault2));
        boolean isFavorite = favoriteButton.isFavorite();
        Map<String, String> params2 = favoriteButton.getFavoriteAction().getParams();
        boolean parseBoolean = (params2 == null || (orDefault = params2.getOrDefault(FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, null)) == null) ? false : Boolean.parseBoolean(orDefault);
        String link = favoriteButton.getFavoriteAction().getLink();
        String link2 = favoriteButton.getUnfavoriteAction().getLink();
        Map<String, TokenizedTrackingInfo> trackingInfo = favoriteButton.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo2 = favoriteButton.getTrackingInfo();
        return new FreshFavoriteState(valueOf, isFavorite, parseBoolean, link, b11, link2, trackingInfo2 != null ? x.b(trackingInfo2, Long.valueOf(j11), null) : null);
    }

    private final CartTileVO toVO(CartTileDTO cartTileDTO, long j11) {
        List<CartTileDTO.TileItem> tiles = cartTileDTO.getTiles();
        ArrayList arrayList = new ArrayList(C7714v.z(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((CartTileDTO.TileItem) it.next(), j11, cartTileDTO.getSwipeBackgroundColor()));
        }
        return new CartTileVO(j11, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CartTileVO> invoke(@NotNull CartTileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final CartTileVO.TileItem toVO(CartTileDTO.TileItem tileItem, long j11, String str) {
        TextDTO textDTO;
        String str2;
        t tVar;
        Integer timer;
        t tVar2;
        Long valueOf;
        String image = tileItem.getImage();
        TextDTO title = tileItem.getTitle();
        CartTileVO.TileItem.TileControl vo = toVO(tileItem.getTileControl(), j11);
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(tileItem.getAction(), null);
        AtomActionDTO deleteAction = tileItem.getDeleteAction();
        AtomAction atomAction2 = deleteAction != null ? AtomActionMapperKt.toAtomAction(deleteAction, null) : null;
        PriceDTO price = tileItem.getPrice();
        int px = tileItem.getRadius().getPx();
        CartTileVO.TileItem.Spacers vo2 = toVO(tileItem.getSpacers());
        AtomAction atomAction3 = atomAction2;
        TextDTO weightText = tileItem.getWeightText();
        TextDTO description = tileItem.getDescription();
        CartTileDTO.TileItem.Separator separator = tileItem.getSeparator();
        String backgroundColor = tileItem.getBackgroundColor();
        CartTileDTO.TileItem.Checkbox checkbox = tileItem.getCheckbox();
        CartTileVO.TileItem.CheckboxWrapper vo3 = checkbox != null ? toVO(checkbox, j11) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = tileItem.getTrackingInfo();
        if (trackingInfo != null) {
            textDTO = title;
            str2 = 0;
            tVar = x.b(trackingInfo, Long.valueOf(j11), null);
        } else {
            textDTO = title;
            str2 = 0;
            tVar = null;
        }
        Map<String, TokenizedTrackingInfo> deleteTrackingInfo = tileItem.getDeleteTrackingInfo();
        t b11 = deleteTrackingInfo != null ? x.b(deleteTrackingInfo, Long.valueOf(j11), str2) : str2;
        Map<String, TokenizedTrackingInfo> tapDeleteTrackingInfo = tileItem.getTapDeleteTrackingInfo();
        t tVar3 = b11;
        t b12 = tapDeleteTrackingInfo != null ? x.b(tapDeleteTrackingInfo, Long.valueOf(j11), str2) : str2;
        Map<String, TokenizedTrackingInfo> swipeTrackingInfo = tileItem.getSwipeTrackingInfo();
        t tVar4 = b12;
        t b13 = swipeTrackingInfo != null ? x.b(swipeTrackingInfo, Long.valueOf(j11), str2) : str2;
        CartTileDTO.TileItem.FavoriteButton favoriteButton = tileItem.getFavoriteButton();
        CartTileVO.TileItem.FavoriteButton vo4 = favoriteButton != null ? toVO(favoriteButton, j11) : str2;
        boolean z11 = tileItem.getTileControl() instanceof CartTileDTO.TileItem.TileControl.UnavailableControl;
        Integer timer2 = tileItem.getTimer();
        if ((timer2 != null && timer2.intValue() == 0) || (timer = tileItem.getTimer()) == null) {
            tVar2 = b13;
            valueOf = null;
        } else {
            int intValue = timer.intValue();
            tVar2 = b13;
            valueOf = Long.valueOf(intValue);
        }
        return new CartTileVO.TileItem(j11, image, textDTO, vo, atomAction, atomAction3, price, px, vo2, weightText, description, separator, backgroundColor, vo3, tVar, tVar3, tVar4, tVar2, vo4, z11, str, null, valueOf, tileItem.getDelayedRefresh(), 2097152, null);
    }

    private final CartTileVO.TileItem.CheckboxWrapper toVO(CartTileDTO.TileItem.Checkbox checkbox, long j11) {
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(checkbox.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = checkbox.getTrackingInfo();
        return new CartTileVO.TileItem.CheckboxWrapper(atomAction, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, checkbox.getCheckbox());
    }

    private final CartTileVO.TileItem.Spacers toVO(CartTileDTO.TileItem.Spacers spacers) {
        return new CartTileVO.TileItem.Spacers(spacers.getVertical().getPx(), spacers.getHorizontal().getPx(), spacers.getBetween().getPx());
    }

    private final CartTileVO.TileItem.TileControl toVO(CartTileDTO.TileItem.TileControl tileControl, long j11) {
        if (tileControl instanceof CartTileDTO.TileItem.TileControl.AvailableControl) {
            return new CartTileVO.TileItem.TileControl.AvailableControl(CartPickerMapperKt.toVO(((CartTileDTO.TileItem.TileControl.AvailableControl) tileControl).getCartPicker(), j11));
        }
        if (tileControl instanceof CartTileDTO.TileItem.TileControl.UnavailableControl) {
            CartTileDTO.TileItem.TileControl.UnavailableControl unavailableControl = (CartTileDTO.TileItem.TileControl.UnavailableControl) tileControl;
            return new CartTileVO.TileItem.TileControl.UnavailableControl(unavailableControl.getButton(), unavailableControl.getBinButton());
        }
        throw new o();
    }

    private final CartTileVO.TileItem.FavoriteButton toVO(CartTileDTO.TileItem.FavoriteButton favoriteButton, long j11) {
        return new CartTileVO.TileItem.FavoriteButton(favoriteButton.getIcon(), favoriteButton.getSelectedIconColor(), favoriteButton.getUnselectedIconColor(), toFavoriteState(favoriteButton, j11));
    }
}
