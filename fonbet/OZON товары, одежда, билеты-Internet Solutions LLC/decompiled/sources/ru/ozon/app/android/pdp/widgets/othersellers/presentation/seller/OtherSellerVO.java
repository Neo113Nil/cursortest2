package ru.ozon.app.android.pdp.widgets.othersellers.presentation.seller;

import B0.C2454a;
import B3.p;
import C.C2702w;
import Fm.C3051a;
import T7.P;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.pdp.widgets.othersellers.data.OtherSellersDTO;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001VB¿\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\u0014\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b3\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b5\u0010&R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b@\u0010AR\u001f\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010B\u001a\u0004\bC\u0010DR\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010E\u001a\u0004\bF\u0010GR%\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010K\u001a\u0004\bL\u0010MR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010K\u001a\u0004\bN\u0010MR\u0019\u0010 \u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b \u0010K\u001a\u0004\bO\u0010MR%\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001a8\u0006¢\u0006\f\n\u0004\b!\u0010H\u001a\u0004\bP\u0010JR\u0019\u0010\"\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010Q\u001a\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020\u000b8\u0016X\u0096D¢\u0006\f\n\u0004\bT\u00104\u001a\u0004\bU\u0010&¨\u0006W"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lm10/m;", "Lm10/o;", "", "id", "productId", "", "index", "", "deeplink", "Lru/ozon/uni/atoms/data/badge/Badge;", "label", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "rating", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitle24Icon;", "cells", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;", "legalInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "toCartEventTokenizedEvent", "toFavEventTokenizedEvent", "unFavEventTokenizedEvent", "params", "selectedDeliverySchema", "<init>", "(JJILjava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;Ljava/util/Map;LWZ/t;LWZ/t;LWZ/t;Ljava/util/Map;Ljava/lang/Integer;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getProductId", "I", "getIndex", "Ljava/lang/String;", "getDeeplink", "Lru/ozon/uni/atoms/data/badge/Badge;", "getLabel", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "getRating", "()Lru/ozon/app/android/pdp/widgets/othersellers/data/OtherSellersDTO$Seller$Rating;", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getName", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;", "getLegalInfo", "()Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getToCartEventTokenizedEvent", "()LWZ/t;", "getToFavEventTokenizedEvent", "getUnFavEventTokenizedEvent", "getParams", "Ljava/lang/Integer;", "getSelectedDeliverySchema", "()Ljava/lang/Integer;", "widgetName", "getWidgetName", "LegalInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OtherSellerVO implements l20.c, InterfaceC8039a, m, o {
    private final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> cells;
    private final String deeplink;
    private final long id;
    private final int index;
    private final Badge label;
    private final LegalInfo legalInfo;

    @NotNull
    private final TextDTO name;
    private final Map<String, String> params;

    @NotNull
    private final Price price;
    private final long productId;
    private final OtherSellersDTO.Seller.Rating rating;
    private final Integer selectedDeliverySchema;
    private final t toCartEventTokenizedEvent;
    private final t toFavEventTokenizedEvent;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final t unFavEventTokenizedEvent;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/othersellers/presentation/seller/OtherSellerVO$LegalInfo;", "", "", "image", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "text", "LWZ/t;", "tokenizedEvent", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getText", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LegalInfo {

        @NotNull
        private final String image;

        @NotNull
        private final OzonSpannableString text;
        private final t tokenizedEvent;

        public LegalInfo(@NotNull String image, @NotNull OzonSpannableString text, t tVar) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(text, "text");
            this.image = image;
            this.text = text;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LegalInfo)) {
                return false;
            }
            LegalInfo legalInfo = (LegalInfo) other;
            return Intrinsics.d(this.image, legalInfo.image) && Intrinsics.d(this.text, legalInfo.text) && Intrinsics.d(this.tokenizedEvent, legalInfo.tokenizedEvent);
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final OzonSpannableString getText() {
            return this.text;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public int hashCode() {
            int c11 = P.c(this.text, this.image.hashCode() * 31, 31);
            t tVar = this.tokenizedEvent;
            return c11 + (tVar == null ? 0 : tVar.hashCode());
        }

        @NotNull
        public String toString() {
            String str = this.image;
            OzonSpannableString ozonSpannableString = this.text;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("LegalInfo(image=");
            sb2.append(str);
            sb2.append(", text=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", tokenizedEvent=");
            return Tl.b.d(sb2, tVar, ")");
        }
    }

    public OtherSellerVO(long j11, long j12, int i11, String str, Badge badge, OtherSellersDTO.Seller.Rating rating, @NotNull Price price, @NotNull TextDTO name, List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list, LegalInfo legalInfo, Map<String, TokenizedTrackingInfo> map, t tVar, t tVar2, t tVar3, Map<String, String> map2, Integer num) {
        Intrinsics.checkNotNullParameter(price, "price");
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j11;
        this.productId = j12;
        this.index = i11;
        this.deeplink = str;
        this.label = badge;
        this.rating = rating;
        this.price = price;
        this.name = name;
        this.cells = list;
        this.legalInfo = legalInfo;
        this.trackingInfo = map;
        this.toCartEventTokenizedEvent = tVar;
        this.toFavEventTokenizedEvent = tVar2;
        this.unFavEventTokenizedEvent = tVar3;
        this.params = map2;
        this.selectedDeliverySchema = num;
        this.widgetName = "pdp_other_seller";
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtherSellerVO)) {
            return false;
        }
        OtherSellerVO otherSellerVO = (OtherSellerVO) other;
        return this.id == otherSellerVO.id && this.productId == otherSellerVO.productId && this.index == otherSellerVO.index && Intrinsics.d(this.deeplink, otherSellerVO.deeplink) && Intrinsics.d(this.label, otherSellerVO.label) && Intrinsics.d(this.rating, otherSellerVO.rating) && Intrinsics.d(this.price, otherSellerVO.price) && Intrinsics.d(this.name, otherSellerVO.name) && Intrinsics.d(this.cells, otherSellerVO.cells) && Intrinsics.d(this.legalInfo, otherSellerVO.legalInfo) && Intrinsics.d(this.trackingInfo, otherSellerVO.trackingInfo) && Intrinsics.d(this.toCartEventTokenizedEvent, otherSellerVO.toCartEventTokenizedEvent) && Intrinsics.d(this.toFavEventTokenizedEvent, otherSellerVO.toFavEventTokenizedEvent) && Intrinsics.d(this.unFavEventTokenizedEvent, otherSellerVO.unFavEventTokenizedEvent) && Intrinsics.d(this.params, otherSellerVO.params) && Intrinsics.d(this.selectedDeliverySchema, otherSellerVO.selectedDeliverySchema);
    }

    public final List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> getCells() {
        return this.cells;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final Badge getLabel() {
        return this.label;
    }

    public final LegalInfo getLegalInfo() {
        return this.legalInfo;
    }

    @NotNull
    public final TextDTO getName() {
        return this.name;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final long getProductId() {
        return this.productId;
    }

    public final OtherSellersDTO.Seller.Rating getRating() {
        return this.rating;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public final t getToFavEventTokenizedEvent() {
        return this.toFavEventTokenizedEvent;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final t getUnFavEventTokenizedEvent() {
        return this.unFavEventTokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.index, Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.productId), 31);
        String str = this.deeplink;
        int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
        Badge badge = this.label;
        int hashCode2 = (hashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        OtherSellersDTO.Seller.Rating rating = this.rating;
        int a12 = Ns.b.a(this.name, C3051a.a(this.price, (hashCode2 + (rating == null ? 0 : rating.hashCode())) * 31, 31), 31);
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cells;
        int hashCode3 = (a12 + (list == null ? 0 : list.hashCode())) * 31;
        LegalInfo legalInfo = this.legalInfo;
        int hashCode4 = (hashCode3 + (legalInfo == null ? 0 : legalInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.toCartEventTokenizedEvent;
        int hashCode6 = (hashCode5 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        t tVar2 = this.toFavEventTokenizedEvent;
        int hashCode7 = (hashCode6 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
        t tVar3 = this.unFavEventTokenizedEvent;
        int hashCode8 = (hashCode7 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
        Map<String, String> map2 = this.params;
        int hashCode9 = (hashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num = this.selectedDeliverySchema;
        return hashCode9 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.productId;
        int i11 = this.index;
        String str = this.deeplink;
        Badge badge = this.label;
        OtherSellersDTO.Seller.Rating rating = this.rating;
        Price price = this.price;
        TextDTO textDTO = this.name;
        List<CellAtom.CellAtomWithSubtitle.CellWithSubtitle24Icon> list = this.cells;
        LegalInfo legalInfo = this.legalInfo;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.toCartEventTokenizedEvent;
        t tVar2 = this.toFavEventTokenizedEvent;
        t tVar3 = this.unFavEventTokenizedEvent;
        Map<String, String> map2 = this.params;
        Integer num = this.selectedDeliverySchema;
        StringBuilder d11 = C2702w.d(j11, "OtherSellerVO(id=", ", productId=");
        d11.append(j12);
        d11.append(", index=");
        d11.append(i11);
        d11.append(", deeplink=");
        d11.append(str);
        d11.append(", label=");
        d11.append(badge);
        d11.append(", rating=");
        d11.append(rating);
        d11.append(", price=");
        d11.append(price);
        d11.append(", name=");
        d11.append(textDTO);
        d11.append(", cells=");
        d11.append(list);
        d11.append(", legalInfo=");
        d11.append(legalInfo);
        d11.append(", trackingInfo=");
        d11.append(map);
        p.d(d11, ", toCartEventTokenizedEvent=", tVar, ", toFavEventTokenizedEvent=", tVar2);
        d11.append(", unFavEventTokenizedEvent=");
        d11.append(tVar3);
        d11.append(", params=");
        d11.append(map2);
        d11.append(", selectedDeliverySchema=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }
}
