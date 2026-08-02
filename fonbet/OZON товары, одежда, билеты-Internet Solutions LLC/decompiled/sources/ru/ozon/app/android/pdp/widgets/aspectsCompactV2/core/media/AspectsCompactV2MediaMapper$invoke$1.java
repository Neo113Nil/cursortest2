package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.media;

import WZ.t;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.media.AspectsCompactMediaVariantV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTOKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2MediaMapper$invoke$1 extends AbstractC7737t implements Function1<List<? extends AspectsV2DTO.VariantV2>, List<? extends AspectsCompactVO$Variant>> {
    final /* synthetic */ long $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2MediaMapper$invoke$1(long j11) {
        super(1);
        this.$id = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends AspectsCompactVO$Variant> invoke(List<? extends AspectsV2DTO.VariantV2> list) {
        return invoke2((List<AspectsV2DTO.VariantV2>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<AspectsCompactVO$Variant> invoke2(List<AspectsV2DTO.VariantV2> variants) {
        TextDTO textDTO;
        PriceDTO priceDTO;
        PriceDTO copy;
        Intrinsics.checkNotNullParameter(variants, "variants");
        List<AspectsV2DTO.VariantV2> list = variants;
        long j11 = this.$id;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AspectsV2DTO.VariantV2 variantV2 : list) {
            AspectsV2DTO.VariantType variant = variantV2.getVariant();
            Intrinsics.g(variant, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO.VariantType.Media");
            AspectsV2DTO.VariantType.Media media = (AspectsV2DTO.VariantType.Media) variant;
            PriceDTO price = media.getPrice();
            OzonSpannableString ozonSpannableString = new OzonSpannableString();
            String refreshDeeplink = variantV2.getRefreshDeeplink();
            boolean isAvailable = AspectsV2DTOKt.isAvailable(variantV2);
            boolean isSelected = AspectsV2DTOKt.isSelected(variantV2);
            boolean isEnabled = AspectsV2DTOKt.isEnabled(variantV2);
            Map<String, TokenizedTrackingInfo> trackingInfo = variantV2.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            if (price != null) {
                textDTO = null;
                copy = price.copy((r29 & 1) != 0 ? price.price : null, (r29 & 2) != 0 ? price.discount : null, (r29 & 4) != 0 ? price.backgroundCapacity : null, (r29 & 8) != 0 ? price.priceStyle : AspectsV2DTOKt.isAvailable(variantV2) ? price.getPriceStyle() : PriceDTO.PriceStyle.copy$default(price.getPriceStyle(), PriceDTO.PriceStyle.StyleType.UNAVAILABLE, null, null, 6, null), (r29 & 16) != 0 ? price.preset : null, (r29 & 32) != 0 ? price.paddingLeft : null, (r29 & 64) != 0 ? price.paddingRight : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? price.paddingTop : null, (r29 & 256) != 0 ? price.paddingBottom : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? price.context : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? price.testInfo : null, (r29 & 2048) != 0 ? price.trackingInfo : null, (r29 & 4096) != 0 ? price.discountColor : null, (r29 & 8192) != 0 ? price.isStrikethroughLineHidden : false);
                priceDTO = copy;
            } else {
                textDTO = null;
                priceDTO = null;
            }
            String imageUrl = media.getImageUrl();
            TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(media.getTitle(), null, null, null, null, null, null, null, null, AspectsV2DTOKt.isAvailable(variantV2) ? media.getTitle().getTextColor() : UniColors.TEXT_SECONDARY.getToken(), 1, null, true, 1279, null);
            TextAtom subtitle = media.getSubtitle();
            arrayList.add(new AspectsCompactMediaVariantV2VO(ozonSpannableString, refreshDeeplink, isSelected, isAvailable, isEnabled, tokenizedEvent$default, dsTextAtom$default, imageUrl, priceDTO, subtitle != null ? TextMapperKt.dsTextAtom$default(subtitle, null, null, null, null, null, null, null, null, AspectsV2DTOKt.isAvailable(variantV2) ? media.getSubtitle().getTextColor() : UniColors.TEXT_SECONDARY.getToken(), 1, null, false, 3327, null) : textDTO));
        }
        return arrayList;
    }
}
