package ru.ozon.app.android.pdp.widgets.outofstock.presentation;

import C.C2702w;
import Fm.C3051a;
import G.g;
import Kk.C3532b;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.price.Price;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\"\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002ABB\u008d\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ®\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\u000f2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b(\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b+\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b\u0010\u00106R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R%\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0016\u0010:\u001a\u0004\b=\u0010<R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010>\u001a\u0004\b?\u0010@¨\u0006C"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "sku", "", "deeplink", "image", "Lru/ozon/uni/atoms/data/price/Price;", "price", "Lru/ozon/uni/atoms/data/text/TextDTO;", "deliveryInfo", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;", "sellerInfo", "", "isInCart", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$TrackingInfo;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "rawTrackingInfo", "params", "", "selectedDeliverySchema", "<init>", "(JJLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;ZLru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$TrackingInfo;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;)V", "copy", "(JJLjava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/price/Price;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;ZLru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$TrackingInfo;Ljava/util/Map;Ljava/util/Map;Ljava/lang/Integer;)Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "getSku", "Ljava/lang/String;", "getDeeplink", "getImage", "Lru/ozon/uni/atoms/data/price/Price;", "getPrice", "()Lru/ozon/uni/atoms/data/price/Price;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getDeliveryInfo", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;", "getSellerInfo", "()Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;", "Z", "()Z", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$TrackingInfo;", "getTrackingInfo", "()Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$TrackingInfo;", "Ljava/util/Map;", "getRawTrackingInfo", "()Ljava/util/Map;", "getParams", "Ljava/lang/Integer;", "getSelectedDeliverySchema", "()Ljava/lang/Integer;", "SellerInfo", "TrackingInfo", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class OutOfStockVO implements c {

    @NotNull
    private final String deeplink;
    private final TextDTO deliveryInfo;
    private final long id;
    private final String image;
    private final boolean isInCart;
    private final Map<String, String> params;

    @NotNull
    private final Price price;
    private final Map<String, TokenizedTrackingInfo> rawTrackingInfo;
    private final Integer selectedDeliverySchema;
    private final SellerInfo sellerInfo;
    private final long sku;
    private final TrackingInfo trackingInfo;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$SellerInfo;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", "atom", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SellerInfo {
        private final AtomActionDTO action;

        @NotNull
        private final TextDTO atom;

        public SellerInfo(@NotNull TextDTO atom, AtomActionDTO atomActionDTO) {
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.atom = atom;
            this.action = atomActionDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SellerInfo)) {
                return false;
            }
            SellerInfo sellerInfo = (SellerInfo) other;
            return Intrinsics.d(this.atom, sellerInfo.atom) && Intrinsics.d(this.action, sellerInfo.action);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final TextDTO getAtom() {
            return this.atom;
        }

        public int hashCode() {
            int hashCode = this.atom.hashCode() * 31;
            AtomActionDTO atomActionDTO = this.action;
            return hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "SellerInfo(atom=" + this.atom + ", action=" + this.action + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockVO$TrackingInfo;", "", "LWZ/t;", "widget", "addToCart", "<init>", "(LWZ/t;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LWZ/t;", "getWidget", "()LWZ/t;", "getAddToCart", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrackingInfo {
        private final t addToCart;
        private final t widget;

        public TrackingInfo(t tVar, t tVar2) {
            this.widget = tVar;
            this.addToCart = tVar2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrackingInfo)) {
                return false;
            }
            TrackingInfo trackingInfo = (TrackingInfo) other;
            return Intrinsics.d(this.widget, trackingInfo.widget) && Intrinsics.d(this.addToCart, trackingInfo.addToCart);
        }

        public final t getWidget() {
            return this.widget;
        }

        public int hashCode() {
            t tVar = this.widget;
            int hashCode = (tVar == null ? 0 : tVar.hashCode()) * 31;
            t tVar2 = this.addToCart;
            return hashCode + (tVar2 != null ? tVar2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "TrackingInfo(widget=" + this.widget + ", addToCart=" + this.addToCart + ")";
        }
    }

    public OutOfStockVO(long j11, long j12, @NotNull String deeplink, String str, @NotNull Price price, TextDTO textDTO, SellerInfo sellerInfo, boolean z11, TrackingInfo trackingInfo, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2, Integer num) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(price, "price");
        this.id = j11;
        this.sku = j12;
        this.deeplink = deeplink;
        this.image = str;
        this.price = price;
        this.deliveryInfo = textDTO;
        this.sellerInfo = sellerInfo;
        this.isInCart = z11;
        this.trackingInfo = trackingInfo;
        this.rawTrackingInfo = map;
        this.params = map2;
        this.selectedDeliverySchema = num;
    }

    @NotNull
    public final OutOfStockVO copy(long id2, long sku, @NotNull String deeplink, String image, @NotNull Price price, TextDTO deliveryInfo, SellerInfo sellerInfo, boolean isInCart, TrackingInfo trackingInfo, Map<String, TokenizedTrackingInfo> rawTrackingInfo, Map<String, String> params, Integer selectedDeliverySchema) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Intrinsics.checkNotNullParameter(price, "price");
        return new OutOfStockVO(id2, sku, deeplink, image, price, deliveryInfo, sellerInfo, isInCart, trackingInfo, rawTrackingInfo, params, selectedDeliverySchema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutOfStockVO)) {
            return false;
        }
        OutOfStockVO outOfStockVO = (OutOfStockVO) other;
        return this.id == outOfStockVO.id && this.sku == outOfStockVO.sku && Intrinsics.d(this.deeplink, outOfStockVO.deeplink) && Intrinsics.d(this.image, outOfStockVO.image) && Intrinsics.d(this.price, outOfStockVO.price) && Intrinsics.d(this.deliveryInfo, outOfStockVO.deliveryInfo) && Intrinsics.d(this.sellerInfo, outOfStockVO.sellerInfo) && this.isInCart == outOfStockVO.isInCart && Intrinsics.d(this.trackingInfo, outOfStockVO.trackingInfo) && Intrinsics.d(this.rawTrackingInfo, outOfStockVO.rawTrackingInfo) && Intrinsics.d(this.params, outOfStockVO.params) && Intrinsics.d(this.selectedDeliverySchema, outOfStockVO.selectedDeliverySchema);
    }

    @NotNull
    public final String getDeeplink() {
        return this.deeplink;
    }

    public final TextDTO getDeliveryInfo() {
        return this.deliveryInfo;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final String getImage() {
        return this.image;
    }

    public final Map<String, String> getParams() {
        return this.params;
    }

    @NotNull
    public final Price getPrice() {
        return this.price;
    }

    public final Map<String, TokenizedTrackingInfo> getRawTrackingInfo() {
        return this.rawTrackingInfo;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final Integer getSelectedDeliverySchema() {
        return this.selectedDeliverySchema;
    }

    public final SellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    public final long getSku() {
        return this.sku;
    }

    public final TrackingInfo getTrackingInfo() {
        return this.trackingInfo;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int a11 = g.a(Pk0.c.a(Long.hashCode(this.id) * 31, 31, this.sku), 31, this.deeplink);
        String str = this.image;
        int a12 = C3051a.a(this.price, (a11 + (str == null ? 0 : str.hashCode())) * 31, 31);
        TextDTO textDTO = this.deliveryInfo;
        int hashCode = (a12 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
        SellerInfo sellerInfo = this.sellerInfo;
        int a13 = C3532b.a((hashCode + (sellerInfo == null ? 0 : sellerInfo.hashCode())) * 31, 31, this.isInCart);
        TrackingInfo trackingInfo = this.trackingInfo;
        int hashCode2 = (a13 + (trackingInfo == null ? 0 : trackingInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.rawTrackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.params;
        int hashCode4 = (hashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Integer num = this.selectedDeliverySchema;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    /* renamed from: isInCart, reason: from getter */
    public final boolean getIsInCart() {
        return this.isInCart;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        long j12 = this.sku;
        String str = this.deeplink;
        String str2 = this.image;
        Price price = this.price;
        TextDTO textDTO = this.deliveryInfo;
        SellerInfo sellerInfo = this.sellerInfo;
        boolean z11 = this.isInCart;
        TrackingInfo trackingInfo = this.trackingInfo;
        Map<String, TokenizedTrackingInfo> map = this.rawTrackingInfo;
        Map<String, String> map2 = this.params;
        Integer num = this.selectedDeliverySchema;
        StringBuilder d11 = C2702w.d(j11, "OutOfStockVO(id=", ", sku=");
        d11.append(j12);
        d11.append(", deeplink=");
        d11.append(str);
        d11.append(", image=");
        d11.append(str2);
        d11.append(", price=");
        d11.append(price);
        d11.append(", deliveryInfo=");
        d11.append(textDTO);
        d11.append(", sellerInfo=");
        d11.append(sellerInfo);
        d11.append(", isInCart=");
        d11.append(z11);
        d11.append(", trackingInfo=");
        d11.append(trackingInfo);
        d11.append(", rawTrackingInfo=");
        d11.append(map);
        d11.append(", params=");
        d11.append(map2);
        d11.append(", selectedDeliverySchema=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }
}
