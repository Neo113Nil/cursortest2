package ru.ozon.app.android.checkoutcomposer.celllist.presentation;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.celllist.data.CheckoutCellListWidgetDTO;
import ru.ozon.app.android.checkoutgeo.checkout.views.checkoutCellList.CheckoutCellListDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0010\u001a\u00020\u00022\n\u0010\u0012\u001a\u00060\u0003j\u0002`\u0011H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/celllist/presentation/CheckoutCellListMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/checkoutcomposer/celllist/data/CheckoutCellListWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/checkoutcomposer/celllist/presentation/CheckoutCellListVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/celllist/data/CheckoutCellListWidgetDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/celllist/presentation/CheckoutCellListVO;", "Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "toCheckoutCellListWithDisabledControls", "(Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;)Lru/ozon/app/android/checkoutgeo/checkout/views/checkoutCellList/CheckoutCellListDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/checkoutcomposer/celllist/data/CheckoutCellListWidgetDTO;Ll20/d;)Ljava/util/List;", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CheckoutCellListMapper implements Function2<CheckoutCellListWidgetDTO, d, List<? extends CheckoutCellListVO>> {
    private final CheckoutCellListDTO toCheckoutCellListWithDisabledControls(CheckoutCellListDTO checkoutCellListDTO) {
        ArrayList arrayList = new ArrayList();
        for (CellDTO cellDTO : checkoutCellListDTO.getCells()) {
            CellDTO.Settings settings = cellDTO.getSettings();
            arrayList.add(CellDTO.copy$default(cellDTO, null, settings != null ? CellDTO.Settings.copy$default(settings, null, null, null, null, null, null, null, null, null, Boolean.TRUE, null, 1535, null) : null, null, null, null, 29, null));
        }
        return CheckoutCellListDTO.copy$default(checkoutCellListDTO, arrayList, null, null, null, null, null, 62, null);
    }

    private final CheckoutCellListVO toVO(CheckoutCellListWidgetDTO checkoutCellListWidgetDTO, String str) {
        long hashCode = str.hashCode();
        CheckoutCellListDTO checkoutCellListWithDisabledControls = Intrinsics.d(checkoutCellListWidgetDTO.isAutoToggleDisabled(), Boolean.TRUE) ? toCheckoutCellListWithDisabledControls(checkoutCellListWidgetDTO.getCheckoutCellList()) : checkoutCellListWidgetDTO.getCheckoutCellList();
        Boolean isSticky = checkoutCellListWidgetDTO.isSticky();
        return new CheckoutCellListVO(hashCode, checkoutCellListWithDisabledControls, isSticky != null ? isSticky.booleanValue() : false);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CheckoutCellListVO> invoke(@NotNull CheckoutCellListWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo.d()));
    }
}
