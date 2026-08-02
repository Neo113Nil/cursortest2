package ru.ozon.app.android.pdp.widgets.aspectsV2.core.imagetitle;

import WZ.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.base.AspectsCompactVO$Variant;
import ru.ozon.app.android.pdp.ui.configurators.aspectsV2.imageTitle.AspectsImageTitleVariantV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTOKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsV2ImageTitleMapper$invoke$1 extends AbstractC7737t implements Function1<List<? extends AspectsV2DTO.VariantV2>, List<? extends AspectsCompactVO$Variant>> {
    final /* synthetic */ long $id;
    final /* synthetic */ AspectsV2ImageTitleMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsV2ImageTitleMapper$invoke$1(long j11, AspectsV2ImageTitleMapper aspectsV2ImageTitleMapper) {
        super(1);
        this.$id = j11;
        this.this$0 = aspectsV2ImageTitleMapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends AspectsCompactVO$Variant> invoke(List<? extends AspectsV2DTO.VariantV2> list) {
        return invoke2((List<AspectsV2DTO.VariantV2>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<AspectsCompactVO$Variant> invoke2(List<AspectsV2DTO.VariantV2> variants) {
        t tVar;
        AspectsImageTitleVariantV2VO.ImageVariant color;
        Context context;
        Intrinsics.checkNotNullParameter(variants, "variants");
        List<AspectsV2DTO.VariantV2> list = variants;
        long j11 = this.$id;
        AspectsV2ImageTitleMapper aspectsV2ImageTitleMapper = this.this$0;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AspectsV2DTO.VariantV2 variantV2 : list) {
            AspectsV2DTO.VariantType variant = variantV2.getVariant();
            Intrinsics.g(variant, "null cannot be cast to non-null type ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO.VariantType.ImageTitle");
            AspectsV2DTO.VariantType.ImageTitle imageTitle = (AspectsV2DTO.VariantType.ImageTitle) variant;
            OzonSpannableString ozonSpannableString = new OzonSpannableString();
            String refreshDeeplink = variantV2.getRefreshDeeplink();
            boolean isAvailable = AspectsV2DTOKt.isAvailable(variantV2);
            boolean isSelected = AspectsV2DTOKt.isSelected(variantV2);
            boolean isEnabled = AspectsV2DTOKt.isEnabled(variantV2);
            Map<String, TokenizedTrackingInfo> trackingInfo = variantV2.getTrackingInfo();
            ArrayList arrayList2 = null;
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(imageTitle.getTitle(), null, null, null, null, null, null, null, null, AspectsV2DTOKt.isAvailable(variantV2) ? imageTitle.getTitle().getTextStyle() : UniColors.TEXT_SECONDARY.getToken(), 2, null, false, 3327, null);
            String imageUrl = imageTitle.getImageUrl();
            if (imageUrl != null) {
                color = new AspectsImageTitleVariantV2VO.ImageVariant.Image(imageUrl);
                tVar = tokenizedEvent$default;
            } else {
                List<String> colors = imageTitle.getColors();
                if (colors != null) {
                    arrayList2 = new ArrayList();
                    for (String str : colors) {
                        StyleParser styleParser = StyleParser.INSTANCE;
                        t tVar2 = tokenizedEvent$default;
                        context = aspectsV2ImageTitleMapper.context;
                        Integer parseColor = styleParser.parseColor(context, str);
                        if (parseColor != null) {
                            arrayList2.add(parseColor);
                        }
                        tokenizedEvent$default = tVar2;
                    }
                }
                tVar = tokenizedEvent$default;
                List list2 = arrayList2;
                if (arrayList2 == null) {
                    list2 = K.f71697a;
                }
                color = new AspectsImageTitleVariantV2VO.ImageVariant.Color(list2);
            }
            arrayList.add(new AspectsImageTitleVariantV2VO(ozonSpannableString, refreshDeeplink, isSelected, isAvailable, isEnabled, tVar, dsTextAtom$default, color));
        }
        return arrayList;
    }
}
