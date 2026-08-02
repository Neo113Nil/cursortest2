package ru.ozon.app.android.checkoutcomposer.total;

import Ih.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.total.models.CheckoutProgressBarVO;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalDTO;
import ru.ozon.app.android.checkoutcomposer.total.models.TotalVO;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVOKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001b\u0010\b\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\b\u0010\u000e\u001a\u0013\u0010\b\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\b\u0010\u0011\u001a\u0013\u0010\b\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\b\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;", "", "stateId", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;", "toNormalVO", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;", "Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$ProgressBar;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/total/models/CheckoutProgressBarVO;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;", "", "widgetId", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$Summary;J)Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$Summary;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$InteractiveActions;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$InteractiveActions;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;", "Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;", "(Lru/ozon/app/android/checkoutcomposer/total/models/TotalDTO$AdditionalInfo;)Lru/ozon/app/android/checkoutcomposer/total/models/TotalVO$AdditionalInfo;", "checkout_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TotalMappersKt {
    @NotNull
    public static final TotalVO toNormalVO(@NotNull TotalDTO totalDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(totalDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long hashCode = ("Normal-" + stateId).hashCode();
        TotalVO.InteractiveActions vo = toVO(totalDTO.getInteractiveActions());
        TotalDTO.ProgressBar progressBar = totalDTO.getProgressBar();
        CheckoutProgressBarVO vo2 = progressBar != null ? toVO(progressBar, stateId) : null;
        TotalVO.AdditionalInfo vo3 = toVO(totalDTO.getAdditionalInfo());
        TotalDTO.Summary summary = totalDTO.getSummary();
        TotalVO.Summary vo4 = summary != null ? toVO(summary, hashCode) : null;
        Boolean showVerticalSeparator = totalDTO.getShowVerticalSeparator();
        return new TotalVO(hashCode, vo4, vo, vo3, vo2, showVerticalSeparator != null ? showVerticalSeparator.booleanValue() : true);
    }

    @NotNull
    public static final CheckoutProgressBarVO toVO(@NotNull TotalDTO.ProgressBar progressBar, @NotNull String stateId) {
        TextAtom copy$default;
        Integer maxLines;
        Intrinsics.checkNotNullParameter(progressBar, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        long a11 = a.a("ProgressBar-", stateId);
        long parseLong = Long.parseLong(progressBar.getDuration());
        TextAtom title = progressBar.getTitle();
        if (((title == null || (maxLines = title.getMaxLines()) == null) ? 0 : maxLines.intValue()) > 0) {
            copy$default = progressBar.getTitle();
        } else {
            TextAtom title2 = progressBar.getTitle();
            copy$default = title2 != null ? TextAtom.copy$default(title2, null, null, null, 5, null, null, null, 119, null) : null;
        }
        return new CheckoutProgressBarVO(a11, parseLong, copy$default);
    }

    private static final TotalVO.Summary toVO(TotalDTO.Summary summary, long j11) {
        ArrayList arrayList;
        TotalVO.Summary.Header header = new TotalVO.Summary.Header(summary.getHeader().getTitle(), summary.getHeader().getInfo());
        List<TotalDTO.Summary.Price> prices = summary.getPrices();
        ArrayList arrayList2 = new ArrayList(C7714v.z(prices, 10));
        for (TotalDTO.Summary.Price price : prices) {
            arrayList2.add(new TotalVO.Summary.Price(price.getLeft().getTitle(), price.getLeft().getSubtitle(), price.getLeft().getImage(), price.getLeft().getButton(), price.getRight().getOriginalPrice(), price.getRight().getPrice(), price.getRight().getSubtitle()));
        }
        List<TotalDTO.Summary.FooterPrice> footerPrices = summary.getFooterPrices();
        if (footerPrices != null) {
            List<TotalDTO.Summary.FooterPrice> list = footerPrices;
            arrayList = new ArrayList(C7714v.z(list, 10));
            for (TotalDTO.Summary.FooterPrice footerPrice : list) {
                arrayList.add(new TotalVO.Summary.FooterPrice(footerPrice.getLeft().getTitle(), footerPrice.getLeft().getSubtitle(), footerPrice.getRight().getPrice(), footerPrice.getLeft().getSmallBorderlessButton()));
            }
        } else {
            arrayList = null;
        }
        OzonSpannableString title = summary.getFooter().getTitle();
        OzonSpannableString subtitle = summary.getFooter().getSubtitle();
        OzonSpannableString price2 = summary.getFooter().getPrice();
        String priceColor = summary.getFooter().getPriceColor();
        PartnerBanksDTO partnerBanksMolecule = summary.getFooter().getPartnerBanksMolecule();
        return new TotalVO.Summary(header, arrayList2, new TotalVO.Summary.Footer(title, subtitle, price2, priceColor, partnerBanksMolecule != null ? PartnerBanksVOKt.toVO$default(partnerBanksMolecule, j11, null, 2, null) : null), arrayList);
    }

    private static final TotalVO.InteractiveActions toVO(TotalDTO.InteractiveActions interactiveActions) {
        List<AtomDTO> hints = interactiveActions.getHints();
        return new TotalVO.InteractiveActions(interactiveActions.getButton(), (hints == null || hints.isEmpty()) ? null : hints, interactiveActions.getButtonColor(), interactiveActions.getTotalButton(), interactiveActions.getButtonTextColor());
    }

    private static final TotalVO.AdditionalInfo toVO(TotalDTO.AdditionalInfo additionalInfo) {
        List<AtomDTO> hints = additionalInfo.getHints();
        if (hints == null || hints.isEmpty()) {
            hints = null;
        }
        return new TotalVO.AdditionalInfo(hints);
    }
}
