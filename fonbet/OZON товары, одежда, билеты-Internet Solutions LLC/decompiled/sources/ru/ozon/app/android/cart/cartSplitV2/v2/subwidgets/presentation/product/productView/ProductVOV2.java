package ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView;

import B90.C2618u;
import G.g;
import Tl.b;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementVOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.CheckboxVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.productMedia.ProductMediaDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0012Jr\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u001f\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b/\u0010\"¨\u00060"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductVOV2;", "", "", "id", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/dynamicElementV2/DynamicElementVOV2;", "dynamicElements", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingInfo", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "media", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CheckboxVO;", "checkbox", "bottomDynamicElements", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CheckboxVO;Ljava/util/List;)V", "copy", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CheckboxVO;Ljava/util/List;)Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/product/productView/ProductVOV2;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getDynamicElements", "()Ljava/util/List;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingInfo", "()LWZ/t;", "Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "getMedia", "()Lru/ozon/uni/atoms/data/productMedia/ProductMediaDTO;", "Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CheckboxVO;", "getCheckbox", "()Lru/ozon/app/android/cart/cartSplitV2/v2/subwidgets/presentation/CheckboxVO;", "getBottomDynamicElements", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductVOV2 {
    private final AtomAction action;
    private final List<DynamicElementVOV2> bottomDynamicElements;
    private final CheckboxVO checkbox;

    @NotNull
    private final List<DynamicElementVOV2> dynamicElements;

    @NotNull
    private final String id;
    private final ProductMediaDTO media;
    private final t trackingInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductVOV2(@NotNull String id2, @NotNull List<? extends DynamicElementVOV2> dynamicElements, AtomAction atomAction, t tVar, ProductMediaDTO productMediaDTO, CheckboxVO checkboxVO, List<? extends DynamicElementVOV2> list) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        this.id = id2;
        this.dynamicElements = dynamicElements;
        this.action = atomAction;
        this.trackingInfo = tVar;
        this.media = productMediaDTO;
        this.checkbox = checkboxVO;
        this.bottomDynamicElements = list;
    }

    public static /* synthetic */ ProductVOV2 copy$default(ProductVOV2 productVOV2, String str, List list, AtomAction atomAction, t tVar, ProductMediaDTO productMediaDTO, CheckboxVO checkboxVO, List list2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productVOV2.id;
        }
        if ((i11 & 2) != 0) {
            list = productVOV2.dynamicElements;
        }
        if ((i11 & 4) != 0) {
            atomAction = productVOV2.action;
        }
        if ((i11 & 8) != 0) {
            tVar = productVOV2.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            productMediaDTO = productVOV2.media;
        }
        if ((i11 & 32) != 0) {
            checkboxVO = productVOV2.checkbox;
        }
        if ((i11 & 64) != 0) {
            list2 = productVOV2.bottomDynamicElements;
        }
        CheckboxVO checkboxVO2 = checkboxVO;
        List list3 = list2;
        ProductMediaDTO productMediaDTO2 = productMediaDTO;
        AtomAction atomAction2 = atomAction;
        return productVOV2.copy(str, list, atomAction2, tVar, productMediaDTO2, checkboxVO2, list3);
    }

    @NotNull
    public final ProductVOV2 copy(@NotNull String id2, @NotNull List<? extends DynamicElementVOV2> dynamicElements, AtomAction action, t trackingInfo, ProductMediaDTO media, CheckboxVO checkbox, List<? extends DynamicElementVOV2> bottomDynamicElements) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(dynamicElements, "dynamicElements");
        return new ProductVOV2(id2, dynamicElements, action, trackingInfo, media, checkbox, bottomDynamicElements);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductVOV2)) {
            return false;
        }
        ProductVOV2 productVOV2 = (ProductVOV2) other;
        return Intrinsics.d(this.id, productVOV2.id) && Intrinsics.d(this.dynamicElements, productVOV2.dynamicElements) && Intrinsics.d(this.action, productVOV2.action) && Intrinsics.d(this.trackingInfo, productVOV2.trackingInfo) && Intrinsics.d(this.media, productVOV2.media) && Intrinsics.d(this.checkbox, productVOV2.checkbox) && Intrinsics.d(this.bottomDynamicElements, productVOV2.bottomDynamicElements);
    }

    public final AtomAction getAction() {
        return this.action;
    }

    public final List<DynamicElementVOV2> getBottomDynamicElements() {
        return this.bottomDynamicElements;
    }

    public final CheckboxVO getCheckbox() {
        return this.checkbox;
    }

    @NotNull
    public final List<DynamicElementVOV2> getDynamicElements() {
        return this.dynamicElements;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final ProductMediaDTO getMedia() {
        return this.media;
    }

    public final t getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int b11 = g.b(this.id.hashCode() * 31, 31, this.dynamicElements);
        AtomAction atomAction = this.action;
        int hashCode = (b11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
        t tVar = this.trackingInfo;
        int hashCode2 = (hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31;
        ProductMediaDTO productMediaDTO = this.media;
        int hashCode3 = (hashCode2 + (productMediaDTO == null ? 0 : productMediaDTO.hashCode())) * 31;
        CheckboxVO checkboxVO = this.checkbox;
        int hashCode4 = (hashCode3 + (checkboxVO == null ? 0 : checkboxVO.hashCode())) * 31;
        List<DynamicElementVOV2> list = this.bottomDynamicElements;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<DynamicElementVOV2> list = this.dynamicElements;
        AtomAction atomAction = this.action;
        t tVar = this.trackingInfo;
        ProductMediaDTO productMediaDTO = this.media;
        CheckboxVO checkboxVO = this.checkbox;
        List<DynamicElementVOV2> list2 = this.bottomDynamicElements;
        StringBuilder f7 = b.f("ProductVOV2(id=", str, ", dynamicElements=", ", action=", list);
        f7.append(atomAction);
        f7.append(", trackingInfo=");
        f7.append(tVar);
        f7.append(", media=");
        f7.append(productMediaDTO);
        f7.append(", checkbox=");
        f7.append(checkboxVO);
        f7.append(", bottomDynamicElements=");
        return C2618u.h(f7, list2, ")");
    }
}
