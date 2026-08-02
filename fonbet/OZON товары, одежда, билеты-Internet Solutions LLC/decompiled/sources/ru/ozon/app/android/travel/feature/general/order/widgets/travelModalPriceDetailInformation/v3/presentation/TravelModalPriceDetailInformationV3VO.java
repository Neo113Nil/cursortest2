package ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation;

import Ak.C2436a;
import B90.C2619v;
import Bl.C2639a;
import D3.h;
import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.core.widgets.reviewGalleryV2.data.ReviewGalleryV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004 !\"#B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", CommentV3DTO.HEADER_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceSectionVO;", "priceSections", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getHeader", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/util/List;", "getPriceSections", "()Ljava/util/List;", "PriceItem", "PriceSectionVO", "PriceDetailsVO", "PriceVO", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TravelModalPriceDetailInformationV3VO implements c {
    private final TextAtom header;
    private final long id;

    @NotNull
    private final List<PriceSectionVO> priceSections;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b\b\u0010 R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "totalPrice", "", "isPricesVisible", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceVO;", "prices", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTotalPrice", "Z", "()Z", "Ljava/util/List;", "getPrices", "()Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceDetailsVO implements PriceItem {
        private final long id;
        private final boolean isPricesVisible;
        private final List<PriceVO> prices;

        @NotNull
        private final TextAtom title;
        private final TextAtom totalPrice;

        public PriceDetailsVO(long j11, @NotNull TextAtom title, TextAtom textAtom, boolean z11, List<PriceVO> list) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.id = j11;
            this.title = title;
            this.totalPrice = textAtom;
            this.isPricesVisible = z11;
            this.prices = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceDetailsVO)) {
                return false;
            }
            PriceDetailsVO priceDetailsVO = (PriceDetailsVO) other;
            return this.id == priceDetailsVO.id && Intrinsics.d(this.title, priceDetailsVO.title) && Intrinsics.d(this.totalPrice, priceDetailsVO.totalPrice) && this.isPricesVisible == priceDetailsVO.isPricesVisible && Intrinsics.d(this.prices, priceDetailsVO.prices);
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO.PriceItem
        public long getId() {
            return this.id;
        }

        public final List<PriceVO> getPrices() {
            return this.prices;
        }

        @NotNull
        public final TextAtom getTitle() {
            return this.title;
        }

        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.title);
            TextAtom textAtom = this.totalPrice;
            int a11 = C3532b.a((b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31, this.isPricesVisible);
            List<PriceVO> list = this.prices;
            return a11 + (list != null ? list.hashCode() : 0);
        }

        /* renamed from: isPricesVisible, reason: from getter */
        public final boolean getIsPricesVisible() {
            return this.isPricesVisible;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.totalPrice;
            boolean z11 = this.isPricesVisible;
            List<PriceVO> list = this.prices;
            StringBuilder c11 = C2639a.c("PriceDetailsVO(id=", j11, ", title=", textAtom);
            c11.append(", totalPrice=");
            c11.append(textAtom2);
            c11.append(", isPricesVisible=");
            c11.append(z11);
            return h.c(c11, ", prices=", list, ")");
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceItem;", "", "id", "", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceDetailsVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceVO;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface PriceItem {
        long getId();
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b\t\u0010#R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b\n\u0010#R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceSectionVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "totalPrice", "", "isTitleGone", "isPriceDetailsVisible", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceDetailsVO;", "priceDetails", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;ZZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getSubtitle", "getTotalPrice", "Z", "()Z", "Ljava/util/List;", "getPriceDetails", "()Ljava/util/List;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceSectionVO implements PriceItem {
        private final long id;
        private final boolean isPriceDetailsVisible;
        private final boolean isTitleGone;
        private final List<PriceDetailsVO> priceDetails;
        private final TextAtom subtitle;
        private final TextAtom title;
        private final TextAtom totalPrice;

        public PriceSectionVO(long j11, TextAtom textAtom, TextAtom textAtom2, TextAtom textAtom3, boolean z11, boolean z12, List<PriceDetailsVO> list) {
            this.id = j11;
            this.title = textAtom;
            this.subtitle = textAtom2;
            this.totalPrice = textAtom3;
            this.isTitleGone = z11;
            this.isPriceDetailsVisible = z12;
            this.priceDetails = list;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceSectionVO)) {
                return false;
            }
            PriceSectionVO priceSectionVO = (PriceSectionVO) other;
            return this.id == priceSectionVO.id && Intrinsics.d(this.title, priceSectionVO.title) && Intrinsics.d(this.subtitle, priceSectionVO.subtitle) && Intrinsics.d(this.totalPrice, priceSectionVO.totalPrice) && this.isTitleGone == priceSectionVO.isTitleGone && this.isPriceDetailsVisible == priceSectionVO.isPriceDetailsVisible && Intrinsics.d(this.priceDetails, priceSectionVO.priceDetails);
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO.PriceItem
        public long getId() {
            return this.id;
        }

        public final List<PriceDetailsVO> getPriceDetails() {
            return this.priceDetails;
        }

        public final TextAtom getSubtitle() {
            return this.subtitle;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public final TextAtom getTotalPrice() {
            return this.totalPrice;
        }

        public int hashCode() {
            int hashCode = Long.hashCode(this.id) * 31;
            TextAtom textAtom = this.title;
            int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
            TextAtom textAtom2 = this.subtitle;
            int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
            TextAtom textAtom3 = this.totalPrice;
            int a11 = C3532b.a(C3532b.a((hashCode3 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31, 31, this.isTitleGone), 31, this.isPriceDetailsVisible);
            List<PriceDetailsVO> list = this.priceDetails;
            return a11 + (list != null ? list.hashCode() : 0);
        }

        /* renamed from: isPriceDetailsVisible, reason: from getter */
        public final boolean getIsPriceDetailsVisible() {
            return this.isPriceDetailsVisible;
        }

        /* renamed from: isTitleGone, reason: from getter */
        public final boolean getIsTitleGone() {
            return this.isTitleGone;
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.title;
            TextAtom textAtom2 = this.subtitle;
            TextAtom textAtom3 = this.totalPrice;
            boolean z11 = this.isTitleGone;
            boolean z12 = this.isPriceDetailsVisible;
            List<PriceDetailsVO> list = this.priceDetails;
            StringBuilder c11 = C2639a.c("PriceSectionVO(id=", j11, ", title=", textAtom);
            C2639a.e(", subtitle=", ", totalPrice=", c11, textAtom2, textAtom3);
            C2436a.e(", isTitleGone=", ", isPriceDetailsVisible=", c11, z11, z12);
            return h.c(c11, ", priceDetails=", list, ")");
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelModalPriceDetailInformation/v3/presentation/TravelModalPriceDetailInformationV3VO$PriceItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", ReviewGalleryV2DTO.ReviewGalleryV2Item.ItemsContainerDTO.PRODUCT_FIELD_NAME, "price", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getProduct", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getPrice", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PriceVO implements PriceItem {
        public static final int $stable = TextAtom.$stable;
        private final long id;
        private final TextAtom price;

        @NotNull
        private final TextAtom product;

        public PriceVO(long j11, @NotNull TextAtom product, TextAtom textAtom) {
            Intrinsics.checkNotNullParameter(product, "product");
            this.id = j11;
            this.product = product;
            this.price = textAtom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PriceVO)) {
                return false;
            }
            PriceVO priceVO = (PriceVO) other;
            return this.id == priceVO.id && Intrinsics.d(this.product, priceVO.product) && Intrinsics.d(this.price, priceVO.price);
        }

        @Override // ru.ozon.app.android.travel.feature.general.order.widgets.travelModalPriceDetailInformation.v3.presentation.TravelModalPriceDetailInformationV3VO.PriceItem
        public long getId() {
            return this.id;
        }

        public final TextAtom getPrice() {
            return this.price;
        }

        @NotNull
        public final TextAtom getProduct() {
            return this.product;
        }

        public int hashCode() {
            int b11 = C2619v.b(Long.hashCode(this.id) * 31, 31, this.product);
            TextAtom textAtom = this.price;
            return b11 + (textAtom == null ? 0 : textAtom.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAtom textAtom = this.product;
            TextAtom textAtom2 = this.price;
            StringBuilder c11 = C2639a.c("PriceVO(id=", j11, ", product=", textAtom);
            c11.append(", price=");
            c11.append(textAtom2);
            c11.append(")");
            return c11.toString();
        }
    }

    public TravelModalPriceDetailInformationV3VO(long j11, TextAtom textAtom, @NotNull List<PriceSectionVO> priceSections) {
        Intrinsics.checkNotNullParameter(priceSections, "priceSections");
        this.id = j11;
        this.header = textAtom;
        this.priceSections = priceSections;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelModalPriceDetailInformationV3VO)) {
            return false;
        }
        TravelModalPriceDetailInformationV3VO travelModalPriceDetailInformationV3VO = (TravelModalPriceDetailInformationV3VO) other;
        return this.id == travelModalPriceDetailInformationV3VO.id && Intrinsics.d(this.header, travelModalPriceDetailInformationV3VO.header) && Intrinsics.d(this.priceSections, travelModalPriceDetailInformationV3VO.priceSections);
    }

    public final TextAtom getHeader() {
        return this.header;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<PriceSectionVO> getPriceSections() {
        return this.priceSections;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        TextAtom textAtom = this.header;
        return this.priceSections.hashCode() + ((hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.header;
        return h.c(C2639a.c("TravelModalPriceDetailInformationV3VO(id=", j11, ", header=", textAtom), ", priceSections=", this.priceSections, ")");
    }
}
