package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation;

import Sc.o;
import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerMapperKt;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileDTO;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.app.android.fresh.common.utils.ExtentionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u000e*\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u000b\u001a\u00020\u0011*\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u001b\u0010\u000b\u001a\u00020\u0014*\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\u0015J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;J)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem;J)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Spacers;)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$Spacers;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;J)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO$TileItem$TileControl;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;Ll20/d;)Ljava/util/List;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReorderTileMapper implements Function2<ReorderTileDTO, d, List<? extends ReorderTileVO>> {
    private final ReorderTileVO toVO(ReorderTileDTO reorderTileDTO, long j11) {
        List<ReorderTileDTO.TileItem> tiles = reorderTileDTO.getTiles();
        ArrayList arrayList = new ArrayList(C7714v.z(tiles, 10));
        Iterator<T> it = tiles.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((ReorderTileDTO.TileItem) it.next(), j11));
        }
        return new ReorderTileVO(j11, arrayList);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<ReorderTileVO> invoke(@NotNull ReorderTileDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, ExtentionsKt.getId(widgetInfo)));
    }

    private final ReorderTileVO.TileItem toVO(ReorderTileDTO.TileItem tileItem, long j11) {
        String image = tileItem.getImage();
        List<AtomDTO> innerAtoms = tileItem.getInnerAtoms();
        ReorderTileVO.TileItem.TileControl vo = toVO(tileItem.getTileControl(), j11);
        AtomActionDTO action = tileItem.getAction();
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, null) : null;
        int px = tileItem.getRadius().getPx();
        ReorderTileVO.TileItem.Spacers vo2 = toVO(tileItem.getSpacers());
        ReorderTileDTO.TileItem.Separator separator = tileItem.getSeparator();
        String backgroundColor = tileItem.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = tileItem.getTrackingInfo();
        return new ReorderTileVO.TileItem(j11, image, innerAtoms, vo, atomAction, px, vo2, separator, backgroundColor, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null, tileItem.getTrackingInfo(), tileItem.getTileControl() instanceof ReorderTileDTO.TileItem.TileControl.UnavailableControl, false, 4096, null);
    }

    private final ReorderTileVO.TileItem.Spacers toVO(ReorderTileDTO.TileItem.Spacers spacers) {
        return new ReorderTileVO.TileItem.Spacers(spacers.getVertical().getPx(), spacers.getHorizontal().getPx(), spacers.getBetween().getPx());
    }

    private final ReorderTileVO.TileItem.TileControl toVO(ReorderTileDTO.TileItem.TileControl tileControl, long j11) {
        if (tileControl instanceof ReorderTileDTO.TileItem.TileControl.AvailableControl) {
            ReorderTileDTO.TileItem.TileControl.AvailableControl availableControl = (ReorderTileDTO.TileItem.TileControl.AvailableControl) tileControl;
            CartPickerDTO cartPicker = availableControl.getCartPicker();
            return new ReorderTileVO.TileItem.TileControl.AvailableControl(cartPicker != null ? CartPickerMapperKt.toVO(cartPicker, j11) : null, availableControl.getQuantity());
        }
        if (tileControl instanceof ReorderTileDTO.TileItem.TileControl.UnavailableControl) {
            ReorderTileDTO.TileItem.TileControl.UnavailableControl unavailableControl = (ReorderTileDTO.TileItem.TileControl.UnavailableControl) tileControl;
            return new ReorderTileVO.TileItem.TileControl.UnavailableControl(unavailableControl.getButton(), unavailableControl.getQuantity());
        }
        throw new o();
    }
}
