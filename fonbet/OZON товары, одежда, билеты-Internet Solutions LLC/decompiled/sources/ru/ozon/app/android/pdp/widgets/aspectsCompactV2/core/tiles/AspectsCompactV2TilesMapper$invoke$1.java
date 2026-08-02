package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.tiles;

import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
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
import ru.ozon.app.android.pdp.ui.configurators.aspectsCompactV2.tiles.AspectsCompactTilesVariantV2VO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTO;
import ru.ozon.app.android.pdp.widgets.aspectsV2.data.AspectsV2DTOKt;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/ui/configurators/aspectsCompactV2/base/AspectsCompactVO$Variant;", "variants", "Lru/ozon/app/android/pdp/widgets/aspectsV2/data/AspectsV2DTO$VariantV2;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AspectsCompactV2TilesMapper$invoke$1 extends AbstractC7737t implements Function1<List<? extends AspectsV2DTO.VariantV2>, List<? extends AspectsCompactVO$Variant>> {
    final /* synthetic */ long $id;
    final /* synthetic */ AspectsCompactV2TilesMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AspectsCompactV2TilesMapper$invoke$1(AspectsCompactV2TilesMapper aspectsCompactV2TilesMapper, long j11) {
        super(1);
        this.this$0 = aspectsCompactV2TilesMapper;
        this.$id = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends AspectsCompactVO$Variant> invoke(List<? extends AspectsV2DTO.VariantV2> list) {
        return invoke2((List<AspectsV2DTO.VariantV2>) list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        r2 = r34.this$0.asTiles(r2);
     */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<AspectsCompactVO$Variant> invoke2(List<AspectsV2DTO.VariantV2> variants) {
        Object obj;
        AspectsV2DTO.VariantType.Tiles asTiles;
        AspectsV2DTO.VariantType.Tiles asTiles2;
        AspectsV2DTO.VariantType.Tiles asTiles3;
        Intrinsics.checkNotNullParameter(variants, "variants");
        List<AspectsV2DTO.VariantV2> list = variants;
        AspectsCompactV2TilesMapper aspectsCompactV2TilesMapper = this.this$0;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            asTiles3 = aspectsCompactV2TilesMapper.asTiles(((AspectsV2DTO.VariantV2) obj).getVariant());
            if (asTiles3.getPrice() != null) {
                break;
            }
        }
        AspectsV2DTO.VariantV2 variantV2 = (AspectsV2DTO.VariantV2) obj;
        PriceDTO price = (variantV2 == null || (r2 = variantV2.getVariant()) == null || asTiles2 == null) ? null : asTiles2.getPrice();
        AspectsCompactV2TilesMapper aspectsCompactV2TilesMapper2 = this.this$0;
        long j11 = this.$id;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (AspectsV2DTO.VariantV2 variantV22 : list) {
            asTiles = aspectsCompactV2TilesMapper2.asTiles(variantV22.getVariant());
            OzonSpannableString ozonSpannableString = new OzonSpannableString();
            String refreshDeeplink = variantV22.getRefreshDeeplink();
            boolean isAvailable = AspectsV2DTOKt.isAvailable(variantV22);
            boolean isSelected = AspectsV2DTOKt.isSelected(variantV22);
            boolean isEnabled = AspectsV2DTOKt.isEnabled(variantV22);
            Map<String, TokenizedTrackingInfo> trackingInfo = variantV22.getTrackingInfo();
            t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
            PriceDTO price2 = asTiles.getPrice();
            arrayList.add(new AspectsCompactTilesVariantV2VO(ozonSpannableString, refreshDeeplink, isSelected, isAvailable, isEnabled, tokenizedEvent$default, asTiles.getImageUrl(), price2 == null ? price != null ? new PriceDTO(C7714v.a0(new PriceDTO.Component(null, "", null, null, 13, null)), null, null, price.getPriceStyle(), price.getPreset(), null, null, null, null, null, null, null, null, false, 16358, null) : null : price2));
        }
        return arrayList;
    }
}
