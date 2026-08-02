package ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation;

import WZ.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.data.CheckoutButtonDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.checkoutButton.presentation.CheckoutButtonVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\f\u0010\u0000\u001a\u00020\u0005*\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"toVO", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO;", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO;", "widgetId", "", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/presentation/CheckoutButtonVO$Spacers;", "Lru/ozon/app/android/fresh/common/widgets/molecules/checkoutButton/data/CheckoutButtonDTO$Spacers;", "widgets_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckoutButtonMapperKt {
    @NotNull
    public static final CheckoutButtonVO toVO(@NotNull CheckoutButtonDTO checkoutButtonDTO, long j11) {
        Intrinsics.checkNotNullParameter(checkoutButtonDTO, "<this>");
        TextDTO title = checkoutButtonDTO.getTitle();
        TextDTO subtitle = checkoutButtonDTO.getSubtitle();
        CheckoutButtonDTO.Price price = checkoutButtonDTO.getPrice();
        String backgroundColor = checkoutButtonDTO.getBackgroundColor();
        CheckoutButtonDTO.Spacers spacers = checkoutButtonDTO.getSpacers();
        if (spacers == null) {
            spacers = new CheckoutButtonDTO.Spacers(null, null, null, null, 15, null);
        }
        CheckoutButtonVO.Spacers vo = toVO(spacers);
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(checkoutButtonDTO.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo = checkoutButtonDTO.getTrackingInfo();
        return new CheckoutButtonVO(title, subtitle, price, backgroundColor, vo, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }

    private static final CheckoutButtonVO.Spacers toVO(CheckoutButtonDTO.Spacers spacers) {
        return new CheckoutButtonVO.Spacers(UiExtKt.toPx(spacers.getTop().getPx()), UiExtKt.toPx(spacers.getBottom().getPx()), UiExtKt.toPx(spacers.getLeft().getPx()), UiExtKt.toPx(spacers.getRight().getPx()));
    }
}
