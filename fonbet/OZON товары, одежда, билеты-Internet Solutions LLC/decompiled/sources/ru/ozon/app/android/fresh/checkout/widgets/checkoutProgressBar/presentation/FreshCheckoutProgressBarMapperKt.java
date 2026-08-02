package ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.checkout.widgets.checkoutProgressBar.data.FreshProgressBarDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;", "", "stateId", "Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "toVO", "(Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/data/FreshProgressBarDTO;Ljava/lang/String;)Lru/ozon/app/android/fresh/checkout/widgets/checkoutProgressBar/presentation/FreshProgressBarVO;", "widgets-checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshCheckoutProgressBarMapperKt {
    @NotNull
    public static final FreshProgressBarVO toVO(@NotNull FreshProgressBarDTO freshProgressBarDTO, @NotNull String stateId) {
        TextAtom copy$default;
        Integer maxLines;
        Intrinsics.checkNotNullParameter(freshProgressBarDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = ("FreshProgressBar-" + stateId).hashCode();
        TextAtom title = freshProgressBarDTO.getTitle();
        if (((title == null || (maxLines = title.getMaxLines()) == null) ? 0 : maxLines.intValue()) > 0) {
            copy$default = freshProgressBarDTO.getTitle();
        } else {
            TextAtom title2 = freshProgressBarDTO.getTitle();
            copy$default = title2 != null ? TextAtom.copy$default(title2, null, null, null, 5, null, null, null, 119, null) : null;
        }
        return new FreshProgressBarVO(hashCode, Long.parseLong(freshProgressBarDTO.getDuration()), copy$default);
    }
}
