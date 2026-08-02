package ru.ozon.app.android.cart.common.product;

import G.g;
import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.badge.Badge;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\u001f\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0006¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b&\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b(\u0010$¨\u0006*"}, d2 = {"Lru/ozon/app/android/cart/common/product/ProductVO;", "", "", "id", "Lru/ozon/app/android/cart/common/product/ProductVO$Image;", "image", "", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO;", "dynamicElements", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "getAccessoriesAction", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/cart/common/product/ProductVO$Image;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/af/AtomAction;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/app/android/cart/common/product/ProductVO$Image;", "getImage", "()Lru/ozon/app/android/cart/common/product/ProductVO$Image;", "Ljava/util/List;", "getDynamicElements", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "getGetAccessoriesAction", "Image", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductVO {
    private final AtomAction action;

    @NotNull
    private final List<DynamicElementVO> dynamicElements;
    private final AtomAction getAccessoriesAction;

    @NotNull
    private final String id;

    @NotNull
    private final Image image;
    private final t trackingInfo;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cart/common/product/ProductVO$Image;", "", "", ImagesContract.URL, "Lru/ozon/uni/atoms/data/badge/Badge;", "badge", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/badge/Badge;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUrl", "Lru/ozon/uni/atoms/data/badge/Badge;", "getBadge", "()Lru/ozon/uni/atoms/data/badge/Badge;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image {
        public static final int $stable = Badge.$stable;
        private final Badge badge;

        @NotNull
        private final String url;

        public Image(@NotNull String url, Badge badge) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
            this.badge = badge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.url, image.url) && Intrinsics.d(this.badge, image.badge);
        }

        public final Badge getBadge() {
            return this.badge;
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            int hashCode = this.url.hashCode() * 31;
            Badge badge = this.badge;
            return hashCode + (badge == null ? 0 : badge.hashCode());
        }

        @NotNull
        public String toString() {
            return "Image(url=" + this.url + ", badge=" + this.badge + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProductVO(@NotNull String id2, @NotNull Image image, @NotNull List<? extends DynamicElementVO> dynamicElements, AtomAction atomAction, t tVar, AtomAction atomAction2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        this.id = id2;
        this.image = image;
        this.dynamicElements = dynamicElements;
        this.action = atomAction;
        this.trackingInfo = tVar;
        this.getAccessoriesAction = atomAction2;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVO)) {
            return false;
        }
        ProductVO productVO = (ProductVO) other;
        return Intrinsics.d(this.id, productVO.id) && Intrinsics.d(this.image, productVO.image) && Intrinsics.d(this.dynamicElements, productVO.dynamicElements) && Intrinsics.d(this.action, productVO.action) && Intrinsics.d(this.trackingInfo, productVO.trackingInfo) && Intrinsics.d(this.getAccessoriesAction, productVO.getAccessoriesAction);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    @NotNull
    public final List<DynamicElementVO> getDynamicElements() {
        return this.dynamicElements;
    }

    public final AtomAction getGetAccessoriesAction() {
        return this.getAccessoriesAction;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Image getImage() {
        return this.image;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b((this.image.hashCode() + (this.id.hashCode() * 31)) * 31, 31, this.dynamicElements);
        AtomAction atomAction = this.action;
        int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.trackingInfo;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        AtomAction atomAction2 = this.getAccessoriesAction;
        return hashCode2 + (atomAction2 != null ? atomAction2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ProductVO(id=" + this.id + ", image=" + this.image + ", dynamicElements=" + this.dynamicElements + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", getAccessoriesAction=" + this.getAccessoriesAction + ")";
    }
}
