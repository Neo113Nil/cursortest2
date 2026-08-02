package ru.ozon.app.android.account.orders.shipmentwidget.v2.presentation.atomelement.viewItem;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.text.TextPreset;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"mapToDisclaimerWrapper", "Lru/ozon/app/android/account/orders/shipmentwidget/v2/presentation/atomelement/viewItem/DisclaimerWrapper;", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DisclaimerWrapperKt {
    @NotNull
    public static final DisclaimerWrapper mapToDisclaimerWrapper(@NotNull DisclaimerAtom disclaimerAtom) {
        TextDTO textDTO;
        Intrinsics.checkNotNullParameter(disclaimerAtom, "<this>");
        IconDTO iconDTO = new IconDTO(null, null, IconDTO.IconShape.SHAPE_NONE, null, new CommonAtomIconDTO(disclaimerAtom.getIcon().getImage(), disclaimerAtom.getIcon().getTintColor()), null, null, null, null, null, null, null, null, null, null, null, 65515, null);
        DisclaimerAtom.Header header = disclaimerAtom.getHeader();
        if (header != null) {
            textDTO = new TextDTO(header.getText(), null, null, null, null, null, TextPreset.PRESET_CUSTOM, "tsCompactControl500Medium", header.getColor(), null, null, null, null, false, null, null, null, null, 0, 261694, null);
        } else {
            textDTO = null;
        }
        return new DisclaimerWrapper(iconDTO, textDTO, new TextDTO(disclaimerAtom.getBody().getText(), null, null, null, null, null, TextPreset.PRESET_CUSTOM, "tsCompact400Large", disclaimerAtom.getBody().getColor(), null, null, null, null, false, null, null, null, null, 0, 261694, null), disclaimerAtom.getBackgroundColor(), disclaimerAtom.getButtons());
    }
}
