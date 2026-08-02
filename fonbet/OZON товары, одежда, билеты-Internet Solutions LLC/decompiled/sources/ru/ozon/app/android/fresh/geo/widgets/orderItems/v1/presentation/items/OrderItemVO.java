package ru.ozon.app.android.fresh.geo.widgets.orderItems.v1.presentation.items;

import B90.C2619v;
import Bl.C2639a;
import G.g;
import Kk.C3532b;
import Lh.a;
import Ve.C4598rp;
import WZ.t;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b \b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002By\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\u000e\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010)R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u00107\u001a\u0004\b8\u00109R%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u001f\u0010\u0018\u001a\n\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/geo/widgets/orderItems/v1/presentation/items/OrderItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", AppMeasurementSdk.ConditionalUserProperty.NAME, "totalPrice", "priceDetails", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "image", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "favoriteProduct", "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "", "hasBottomSeparator", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "<init>", "(JLru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/af/AtomAction;Ljava/lang/String;Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;Lru/ozon/uni/atoms/data/badge/Badge;ZLjava/util/Map;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getName", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTotalPrice", "getPriceDetails", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/lang/String;", "getImage", "Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "getFavoriteProduct", "()Lru/ozon/app/android/favorites/data/favoritebutton/favoriteproduct/FavoriteProductMolecule;", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "Z", "getHasBottomSeparator", "()Z", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "widgets-geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class OrderItemVO implements c {

    @NotNull
    private final AtomAction action;
    private final Badge badge;

    @NotNull
    private final FavoriteProductMolecule favoriteProduct;
    private final boolean hasBottomSeparator;
    private final long id;

    @NotNull
    private final String image;

    @NotNull
    private final TextAtom name;
    private final TextAtom priceDetails;
    private final t tokenizedEvent;

    @NotNull
    private final TextAtom totalPrice;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public OrderItemVO(long j11, @NotNull TextAtom name, @NotNull TextAtom totalPrice, TextAtom textAtom, @NotNull AtomAction action, @NotNull String image, @NotNull FavoriteProductMolecule favoriteProduct, Badge badge, boolean z11, Map<String, TokenizedTrackingInfo> map, t tVar) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(favoriteProduct, "favoriteProduct");
        this.id = j11;
        this.name = name;
        this.totalPrice = totalPrice;
        this.priceDetails = textAtom;
        this.action = action;
        this.image = image;
        this.favoriteProduct = favoriteProduct;
        this.badge = badge;
        this.hasBottomSeparator = z11;
        this.trackingInfo = map;
        this.tokenizedEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OrderItemVO)) {
            return false;
        }
        OrderItemVO orderItemVO = (OrderItemVO) other;
        return this.id == orderItemVO.id && Intrinsics.d(this.name, orderItemVO.name) && Intrinsics.d(this.totalPrice, orderItemVO.totalPrice) && Intrinsics.d(this.priceDetails, orderItemVO.priceDetails) && Intrinsics.d(this.action, orderItemVO.action) && Intrinsics.d(this.image, orderItemVO.image) && Intrinsics.d(this.favoriteProduct, orderItemVO.favoriteProduct) && Intrinsics.d(this.badge, orderItemVO.badge) && this.hasBottomSeparator == orderItemVO.hasBottomSeparator && Intrinsics.d(this.trackingInfo, orderItemVO.trackingInfo) && Intrinsics.d(this.tokenizedEvent, orderItemVO.tokenizedEvent);
    }

    @NotNull
    public final AtomAction getAction() {
        return this.action;
    }

    public final Badge getBadge() {
        return this.badge;
    }

    @NotNull
    public final FavoriteProductMolecule getFavoriteProduct() {
        return this.favoriteProduct;
    }

    public final boolean getHasBottomSeparator() {
        return this.hasBottomSeparator;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final TextAtom getName() {
        return this.name;
    }

    public final TextAtom getPriceDetails() {
        return this.priceDetails;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @NotNull
    public final TextAtom getTotalPrice() {
        return this.totalPrice;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = C2619v.b(C2619v.b(Long.hashCode(this.id) * 31, 31, this.name), 31, this.totalPrice);
        TextAtom textAtom = this.priceDetails;
        int hashCode = (this.favoriteProduct.hashCode() + g.a(C4598rp.a(this.action, (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31, 31), 31, this.image)) * 31;
        Badge badge = this.badge;
        int a11 = C3532b.a((hashCode + (badge == null ? 0 : badge.hashCode())) * 31, 31, this.hasBottomSeparator);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (a11 + (map == null ? 0 : map.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextAtom textAtom = this.name;
        TextAtom textAtom2 = this.totalPrice;
        TextAtom textAtom3 = this.priceDetails;
        AtomAction atomAction = this.action;
        String str = this.image;
        FavoriteProductMolecule favoriteProductMolecule = this.favoriteProduct;
        Badge badge = this.badge;
        boolean z11 = this.hasBottomSeparator;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        t tVar = this.tokenizedEvent;
        StringBuilder c11 = C2639a.c("OrderItemVO(id=", j11, ", name=", textAtom);
        C2639a.e(", totalPrice=", ", priceDetails=", c11, textAtom2, textAtom3);
        c11.append(", action=");
        c11.append(atomAction);
        c11.append(", image=");
        c11.append(str);
        c11.append(", favoriteProduct=");
        c11.append(favoriteProductMolecule);
        c11.append(", badge=");
        c11.append(badge);
        c11.append(", hasBottomSeparator=");
        c11.append(z11);
        c11.append(", trackingInfo=");
        c11.append(map);
        return a.b(c11, ", tokenizedEvent=", tVar, ")");
    }
}
