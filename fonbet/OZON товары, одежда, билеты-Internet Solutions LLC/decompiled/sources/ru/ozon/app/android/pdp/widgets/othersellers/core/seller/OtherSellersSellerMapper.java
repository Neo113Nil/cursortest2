package ru.ozon.app.android.pdp.widgets.othersellers.core.seller;

import WZ.t;
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
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.widgets.othersellers.data.OtherSellersDTO;
import ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller.OtherSellerVO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/core/seller/OtherSellersSellerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtherSellersSellerMapper implements Function2<OtherSellersDTO, d, List<? extends OtherSellerVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OtherSellerVO> invoke(@NotNull OtherSellersDTO state, @NotNull d widgetInfo) {
        Iterator it;
        OtherSellersDTO.Seller seller;
        long j11;
        long j12;
        String str;
        int i11;
        OtherSellerVO.LegalInfo legalInfo;
        long j13;
        t tVar;
        t tVar2;
        Intrinsics.checkNotNullParameter(state, "state");
        d widgetInfo2 = widgetInfo;
        Intrinsics.checkNotNullParameter(widgetInfo2, "widgetInfo");
        List<OtherSellersDTO.Seller> sellers = state.getSellers();
        ArrayList arrayList = new ArrayList(C7714v.z(sellers, 10));
        Iterator it2 = sellers.iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            OtherSellersDTO.Seller seller2 = (OtherSellersDTO.Seller) next;
            Price price = seller2.getPrice();
            long hashCode = (i12 + " " + widgetInfo2.d()).hashCode();
            long sku = seller2.getSku();
            Price copy$default = Price.copy$default(price, price.getStyle() == null ? Price.StyleType.STYLE_TYPE_MEDIUM_LARGE : price.getStyle(), null, null, null, null, null, null, null, null, null, null, null, 4094, null);
            TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(seller2.getName());
            String deeplink = seller2.getDeeplink();
            Badge label = seller2.getLabel();
            OtherSellersDTO.Seller.Rating productRating = seller2.getProductRating();
            List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells = seller2.getCells();
            OtherSellersDTO.Seller.LegalInfo legalInfo2 = seller2.getLegalInfo();
            if (legalInfo2 != null) {
                it = it2;
                String image = legalInfo2.getImage();
                OzonSpannableString text = legalInfo2.getText();
                seller = seller2;
                Map<String, TokenizedTrackingInfo> trackingInfo = seller2.getLegalInfo().getTrackingInfo();
                j11 = hashCode;
                if (trackingInfo != null) {
                    j12 = sku;
                    str = null;
                    i11 = 2;
                    tVar2 = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
                } else {
                    j12 = sku;
                    str = null;
                    i11 = 2;
                    tVar2 = null;
                }
                legalInfo = new OtherSellerVO.LegalInfo(image, text, tVar2);
            } else {
                it = it2;
                seller = seller2;
                j11 = hashCode;
                j12 = sku;
                str = null;
                i11 = 2;
                legalInfo = null;
            }
            long j14 = j12;
            Map<String, TokenizedTrackingInfo> trackingInfo2 = seller.getTrackingInfo();
            Map<String, TokenizedTrackingInfo> toCartTrackingInfo = seller.getToCartTrackingInfo();
            Object tokenizedEvent$default = toCartTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(toCartTrackingInfo, Long.valueOf(j11), str, i11, str) : str;
            Map<String, TokenizedTrackingInfo> toFavTrackingInfo = seller.getToFavTrackingInfo();
            Object tokenizedEvent$default2 = toFavTrackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(toFavTrackingInfo, Long.valueOf(j11), str, i11, str) : str;
            Map<String, TokenizedTrackingInfo> unfavTrackingInfo = seller.getUnfavTrackingInfo();
            t tVar3 = tokenizedEvent$default;
            if (unfavTrackingInfo != null) {
                j13 = j11;
                tVar = TrackingInfoMapperKt.toTokenizedEvent$default(unfavTrackingInfo, Long.valueOf(j11), str, i11, str);
            } else {
                j13 = j11;
                tVar = str;
            }
            arrayList.add(new OtherSellerVO(j13, j14, i12, deeplink, label, productRating, copy$default, dsTextAtom, cells, legalInfo, trackingInfo2, tVar3, tokenizedEvent$default2, tVar, seller.getParams(), seller.getSelectedDeliverySchema()));
            widgetInfo2 = widgetInfo;
            i12 = i13;
            it2 = it;
        }
        return arrayList;
    }
}
