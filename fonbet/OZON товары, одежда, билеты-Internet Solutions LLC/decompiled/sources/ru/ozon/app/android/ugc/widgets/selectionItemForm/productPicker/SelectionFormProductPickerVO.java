package ru.ozon.app.android.ugc.widgets.selectionItemForm.productPicker;

import De.C2860c;
import G.g;
import Kk.C3532b;
import Ns.b;
import WZ.t;
import WZ.x;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.actionHandlers.ugc.updateSelectionFormMobile.data.ProductPickerDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \"2\u00060\u0001j\u0002`\u0002:\u0002\"#B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;", "addProduct", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "products", "", "uploadValue", "<init>", "(JLru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;", "getAddProduct", "()Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;", "Ljava/util/List;", "getProducts", "()Ljava/util/List;", "getUploadValue", "Companion", "AddProductVO", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SelectionFormProductPickerVO implements c {

    @NotNull
    private final AddProductVO addProduct;
    private final long id;

    @NotNull
    private final List<CellDTO> products;

    @NotNull
    private final List<String> uploadValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$AddProductVO;", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "icon", "", "isProductsEmpty", "", "backgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "tokenizedEvent", "<init>", "(Lru/ozon/uni/atoms/data/icon/IconDTO;ZLjava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AddProductVO {
        private final AtomAction action;
        private final String backgroundColor;

        @NotNull
        private final IconDTO icon;
        private final boolean isProductsEmpty;
        private final t tokenizedEvent;

        public AddProductVO(@NotNull IconDTO icon, boolean z11, String str, AtomAction atomAction, t tVar) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
            this.isProductsEmpty = z11;
            this.backgroundColor = str;
            this.action = atomAction;
            this.tokenizedEvent = tVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AddProductVO)) {
                return false;
            }
            AddProductVO addProductVO = (AddProductVO) other;
            return Intrinsics.d(this.icon, addProductVO.icon) && this.isProductsEmpty == addProductVO.isProductsEmpty && Intrinsics.d(this.backgroundColor, addProductVO.backgroundColor) && Intrinsics.d(this.action, addProductVO.action) && Intrinsics.d(this.tokenizedEvent, addProductVO.tokenizedEvent);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final IconDTO getIcon() {
            return this.icon;
        }

        public int hashCode() {
            int a11 = C3532b.a(this.icon.hashCode() * 31, 31, this.isProductsEmpty);
            String str = this.backgroundColor;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            AtomAction atomAction = this.action;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            return hashCode2 + (tVar != null ? tVar.hashCode() : 0);
        }

        /* renamed from: isProductsEmpty, reason: from getter */
        public final boolean getIsProductsEmpty() {
            return this.isProductsEmpty;
        }

        @NotNull
        public String toString() {
            IconDTO iconDTO = this.icon;
            boolean z11 = this.isProductsEmpty;
            String str = this.backgroundColor;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            StringBuilder sb2 = new StringBuilder("AddProductVO(icon=");
            sb2.append(iconDTO);
            sb2.append(", isProductsEmpty=");
            sb2.append(z11);
            sb2.append(", backgroundColor=");
            b.d(str, ", action=", ", tokenizedEvent=", sb2, atomAction);
            return Tl.b.d(sb2, tVar, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO$Companion;", "", "<init>", "()V", "createFromProductPickerDTO", "Lru/ozon/app/android/ugc/widgets/selectionItemForm/productPicker/SelectionFormProductPickerVO;", "voId", "", "productPickerDTO", "Lru/ozon/app/android/actionHandlers/ugc/updateSelectionFormMobile/data/ProductPickerDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final SelectionFormProductPickerVO createFromProductPickerDTO(long voId, @NotNull ProductPickerDTO productPickerDTO) {
            Intrinsics.checkNotNullParameter(productPickerDTO, "productPickerDTO");
            IconDTO icon = productPickerDTO.getAddProduct().getIcon();
            boolean isEmpty = productPickerDTO.getProducts().isEmpty();
            String backgroundColor = productPickerDTO.getAddProduct().getBackgroundColor();
            AtomActionDTO action = productPickerDTO.getAddProduct().getAction();
            AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, productPickerDTO.getAddProduct().getTrackingInfo()) : null;
            Map<String, TokenizedTrackingInfo> trackingInfo = productPickerDTO.getAddProduct().getTrackingInfo();
            return new SelectionFormProductPickerVO(voId, new AddProductVO(icon, isEmpty, backgroundColor, atomAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(voId), null) : null), productPickerDTO.getProducts(), productPickerDTO.getUploadValue());
        }

        private Companion() {
        }
    }

    public SelectionFormProductPickerVO(long j11, @NotNull AddProductVO addProduct, @NotNull List<CellDTO> products, @NotNull List<String> uploadValue) {
        Intrinsics.checkNotNullParameter(addProduct, "addProduct");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(uploadValue, "uploadValue");
        this.id = j11;
        this.addProduct = addProduct;
        this.products = products;
        this.uploadValue = uploadValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectionFormProductPickerVO)) {
            return false;
        }
        SelectionFormProductPickerVO selectionFormProductPickerVO = (SelectionFormProductPickerVO) other;
        return this.id == selectionFormProductPickerVO.id && Intrinsics.d(this.addProduct, selectionFormProductPickerVO.addProduct) && Intrinsics.d(this.products, selectionFormProductPickerVO.products) && Intrinsics.d(this.uploadValue, selectionFormProductPickerVO.uploadValue);
    }

    @NotNull
    public final AddProductVO getAddProduct() {
        return this.addProduct;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<CellDTO> getProducts() {
        return this.products;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<String> getUploadValue() {
        return this.uploadValue;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.uploadValue.hashCode() + g.b((this.addProduct.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31, this.products);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        AddProductVO addProductVO = this.addProduct;
        List<CellDTO> list = this.products;
        List<String> list2 = this.uploadValue;
        StringBuilder sb2 = new StringBuilder("SelectionFormProductPickerVO(id=");
        sb2.append(j11);
        sb2.append(", addProduct=");
        sb2.append(addProductVO);
        C2860c.g(", products=", ", uploadValue=", sb2, list, list2);
        sb2.append(")");
        return sb2.toString();
    }
}
