package ru.ozon.app.android.autopicker.view.productpickersearch.presentation;

import B0.C2454a;
import B90.C2618u;
import Cm.e;
import Ds.C2880a;
import G.g;
import Kk.C3532b;
import Lh.a;
import Pk0.f;
import Ql.c;
import c8.C5766e;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0019\b\u0086\b\u0018\u00002\u00020\u0001:\u0001/Bw\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u0003\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b$\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010!\u001a\u0004\b%\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b&\u0010\u0016R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b*\u0010\u0016R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010!\u001a\u0004\b.\u0010\u0016¨\u00060"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO;", "", "", "isTree", "hasSectionTitles", "hasMultiselection", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "searchHint", "enableButton", "buttonTitle", "buttonSubtitle", "", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "items", "keyName", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "currentState", "trackingInfoId", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "getHasSectionTitles", "getHasMultiselection", "Ljava/lang/String;", "getTitle", "getSearchHint", "getEnableButton", "getButtonTitle", "getButtonSubtitle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getKeyName", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "getCurrentState", "()Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "getTrackingInfoId", "ProductPickerSearchItem", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductPickerSearchVO {
    private final String buttonSubtitle;

    @NotNull
    private final String buttonTitle;

    @NotNull
    private final ProductPickerDetailsDTO.CurrentState currentState;
    private final boolean enableButton;
    private final boolean hasMultiselection;
    private final boolean hasSectionTitles;
    private final boolean isTree;

    @NotNull
    private final List<ProductPickerSearchItem> items;
    private final String keyName;
    private final String searchHint;

    @NotNull
    private final String title;
    private final String trackingInfoId;

    public ProductPickerSearchVO(boolean z11, boolean z12, boolean z13, @NotNull String title, String str, boolean z14, @NotNull String buttonTitle, String str2, @NotNull List<ProductPickerSearchItem> items, String str3, @NotNull ProductPickerDetailsDTO.CurrentState currentState, String str4) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(currentState, "currentState");
        this.isTree = z11;
        this.hasSectionTitles = z12;
        this.hasMultiselection = z13;
        this.title = title;
        this.searchHint = str;
        this.enableButton = z14;
        this.buttonTitle = buttonTitle;
        this.buttonSubtitle = str2;
        this.items = items;
        this.keyName = str3;
        this.currentState = currentState;
        this.trackingInfoId = str4;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductPickerSearchVO)) {
            return false;
        }
        ProductPickerSearchVO productPickerSearchVO = (ProductPickerSearchVO) other;
        return this.isTree == productPickerSearchVO.isTree && this.hasSectionTitles == productPickerSearchVO.hasSectionTitles && this.hasMultiselection == productPickerSearchVO.hasMultiselection && Intrinsics.d(this.title, productPickerSearchVO.title) && Intrinsics.d(this.searchHint, productPickerSearchVO.searchHint) && this.enableButton == productPickerSearchVO.enableButton && Intrinsics.d(this.buttonTitle, productPickerSearchVO.buttonTitle) && Intrinsics.d(this.buttonSubtitle, productPickerSearchVO.buttonSubtitle) && Intrinsics.d(this.items, productPickerSearchVO.items) && Intrinsics.d(this.keyName, productPickerSearchVO.keyName) && Intrinsics.d(this.currentState, productPickerSearchVO.currentState) && Intrinsics.d(this.trackingInfoId, productPickerSearchVO.trackingInfoId);
    }

    public final String getButtonSubtitle() {
        return this.buttonSubtitle;
    }

    @NotNull
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @NotNull
    public final ProductPickerDetailsDTO.CurrentState getCurrentState() {
        return this.currentState;
    }

    public final boolean getHasMultiselection() {
        return this.hasMultiselection;
    }

    public final boolean getHasSectionTitles() {
        return this.hasSectionTitles;
    }

    @NotNull
    public final List<ProductPickerSearchItem> getItems() {
        return this.items;
    }

    public final String getKeyName() {
        return this.keyName;
    }

    public final String getSearchHint() {
        return this.searchHint;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final String getTrackingInfoId() {
        return this.trackingInfoId;
    }

    public int hashCode() {
        int a11 = g.a(C3532b.a(C3532b.a(Boolean.hashCode(this.isTree) * 31, 31, this.hasSectionTitles), 31, this.hasMultiselection), 31, this.title);
        String str = this.searchHint;
        int a12 = g.a(C3532b.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.enableButton), 31, this.buttonTitle);
        String str2 = this.buttonSubtitle;
        int b11 = g.b((a12 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.items);
        String str3 = this.keyName;
        int hashCode = (this.currentState.hashCode() + ((b11 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        String str4 = this.trackingInfoId;
        return hashCode + (str4 != null ? str4.hashCode() : 0);
    }

    /* renamed from: isTree, reason: from getter */
    public final boolean getIsTree() {
        return this.isTree;
    }

    @NotNull
    public String toString() {
        boolean z11 = this.isTree;
        boolean z12 = this.hasSectionTitles;
        boolean z13 = this.hasMultiselection;
        String str = this.title;
        String str2 = this.searchHint;
        boolean z14 = this.enableButton;
        String str3 = this.buttonTitle;
        String str4 = this.buttonSubtitle;
        List<ProductPickerSearchItem> list = this.items;
        String str5 = this.keyName;
        ProductPickerDetailsDTO.CurrentState currentState = this.currentState;
        String str6 = this.trackingInfoId;
        StringBuilder d11 = a.d("ProductPickerSearchVO(isTree=", ", hasSectionTitles=", ", hasMultiselection=", z11, z12);
        C5766e.a(", title=", str, ", searchHint=", d11, z13);
        C2880a.c(str2, ", enableButton=", ", buttonTitle=", d11, z14);
        Nh.a.h(d11, str3, ", buttonSubtitle=", str4, ", items=");
        e.i(", keyName=", str5, ", currentState=", d11, list);
        d11.append(currentState);
        d11.append(", trackingInfoId=");
        d11.append(str6);
        d11.append(")");
        return d11.toString();
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0086\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u00022\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0011HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010\u0018R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001e\u001a\u0004\b(\u0010\u001aR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b\f\u0010*R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b\r\u0010*R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b\u000e\u0010*R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b\u000f\u0010*R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "", "", "treeIndex", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/Type;", "type", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "offset", "", "isCollapsed", "isHidden", "isSelected", "isFound", "childrenCount", "", "children", "<init>", "(ILjava/lang/CharSequence;Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/Type;Ljava/lang/String;IZZZZILjava/util/List;)V", "copy", "(ILjava/lang/CharSequence;Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/Type;Ljava/lang/String;IZZZZILjava/util/List;)Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/ProductPickerSearchVO$ProductPickerSearchItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getTreeIndex", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/Type;", "getType", "()Lru/ozon/app/android/autopicker/view/productpickersearch/presentation/adapter/Type;", "Ljava/lang/String;", "getValue", "getOffset", "Z", "()Z", "getChildrenCount", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ProductPickerSearchItem {

        @NotNull
        private final List<ProductPickerSearchItem> children;
        private final int childrenCount;
        private final boolean isCollapsed;
        private final boolean isFound;
        private final boolean isHidden;
        private final boolean isSelected;
        private final int offset;

        @NotNull
        private final CharSequence title;
        private final int treeIndex;

        @NotNull
        private final Type type;
        private final String value;

        public ProductPickerSearchItem(int i11, @NotNull CharSequence title, @NotNull Type type, String str, int i12, boolean z11, boolean z12, boolean z13, boolean z14, int i13, @NotNull List<ProductPickerSearchItem> children) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(children, "children");
            this.treeIndex = i11;
            this.title = title;
            this.type = type;
            this.value = str;
            this.offset = i12;
            this.isCollapsed = z11;
            this.isHidden = z12;
            this.isSelected = z13;
            this.isFound = z14;
            this.childrenCount = i13;
            this.children = children;
        }

        public static /* synthetic */ ProductPickerSearchItem copy$default(ProductPickerSearchItem productPickerSearchItem, int i11, CharSequence charSequence, Type type, String str, int i12, boolean z11, boolean z12, boolean z13, boolean z14, int i13, List list, int i14, Object obj) {
            if ((i14 & 1) != 0) {
                i11 = productPickerSearchItem.treeIndex;
            }
            if ((i14 & 2) != 0) {
                charSequence = productPickerSearchItem.title;
            }
            if ((i14 & 4) != 0) {
                type = productPickerSearchItem.type;
            }
            if ((i14 & 8) != 0) {
                str = productPickerSearchItem.value;
            }
            if ((i14 & 16) != 0) {
                i12 = productPickerSearchItem.offset;
            }
            if ((i14 & 32) != 0) {
                z11 = productPickerSearchItem.isCollapsed;
            }
            if ((i14 & 64) != 0) {
                z12 = productPickerSearchItem.isHidden;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z13 = productPickerSearchItem.isSelected;
            }
            if ((i14 & 256) != 0) {
                z14 = productPickerSearchItem.isFound;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i13 = productPickerSearchItem.childrenCount;
            }
            if ((i14 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                list = productPickerSearchItem.children;
            }
            int i15 = i13;
            List list2 = list;
            boolean z15 = z13;
            boolean z16 = z14;
            boolean z17 = z11;
            boolean z18 = z12;
            int i16 = i12;
            Type type2 = type;
            return productPickerSearchItem.copy(i11, charSequence, type2, str, i16, z17, z18, z15, z16, i15, list2);
        }

        @NotNull
        public final ProductPickerSearchItem copy(int treeIndex, @NotNull CharSequence title, @NotNull Type type, String value, int offset, boolean isCollapsed, boolean isHidden, boolean isSelected, boolean isFound, int childrenCount, @NotNull List<ProductPickerSearchItem> children) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(children, "children");
            return new ProductPickerSearchItem(treeIndex, title, type, value, offset, isCollapsed, isHidden, isSelected, isFound, childrenCount, children);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductPickerSearchItem)) {
                return false;
            }
            ProductPickerSearchItem productPickerSearchItem = (ProductPickerSearchItem) other;
            return this.treeIndex == productPickerSearchItem.treeIndex && Intrinsics.d(this.title, productPickerSearchItem.title) && this.type == productPickerSearchItem.type && Intrinsics.d(this.value, productPickerSearchItem.value) && this.offset == productPickerSearchItem.offset && this.isCollapsed == productPickerSearchItem.isCollapsed && this.isHidden == productPickerSearchItem.isHidden && this.isSelected == productPickerSearchItem.isSelected && this.isFound == productPickerSearchItem.isFound && this.childrenCount == productPickerSearchItem.childrenCount && Intrinsics.d(this.children, productPickerSearchItem.children);
        }

        @NotNull
        public final List<ProductPickerSearchItem> getChildren() {
            return this.children;
        }

        public final int getChildrenCount() {
            return this.childrenCount;
        }

        public final int getOffset() {
            return this.offset;
        }

        @NotNull
        public final CharSequence getTitle() {
            return this.title;
        }

        public final int getTreeIndex() {
            return this.treeIndex;
        }

        @NotNull
        public final Type getType() {
            return this.type;
        }

        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            int hashCode = (this.type.hashCode() + ((this.title.hashCode() + (Integer.hashCode(this.treeIndex) * 31)) * 31)) * 31;
            String str = this.value;
            return this.children.hashCode() + C2454a.a(this.childrenCount, C3532b.a(C3532b.a(C3532b.a(C3532b.a(C2454a.a(this.offset, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.isCollapsed), 31, this.isHidden), 31, this.isSelected), 31, this.isFound), 31);
        }

        /* renamed from: isCollapsed, reason: from getter */
        public final boolean getIsCollapsed() {
            return this.isCollapsed;
        }

        /* renamed from: isFound, reason: from getter */
        public final boolean getIsFound() {
            return this.isFound;
        }

        /* renamed from: isHidden, reason: from getter */
        public final boolean getIsHidden() {
            return this.isHidden;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @NotNull
        public String toString() {
            int i11 = this.treeIndex;
            CharSequence charSequence = this.title;
            Type type = this.type;
            String str = this.value;
            int i12 = this.offset;
            boolean z11 = this.isCollapsed;
            boolean z12 = this.isHidden;
            boolean z13 = this.isSelected;
            boolean z14 = this.isFound;
            int i13 = this.childrenCount;
            List<ProductPickerSearchItem> list = this.children;
            StringBuilder sb2 = new StringBuilder("ProductPickerSearchItem(treeIndex=");
            sb2.append(i11);
            sb2.append(", title=");
            sb2.append((Object) charSequence);
            sb2.append(", type=");
            sb2.append(type);
            sb2.append(", value=");
            sb2.append(str);
            sb2.append(", offset=");
            c.d(sb2, i12, ", isCollapsed=", z11, ", isHidden=");
            f.c(", isSelected=", ", isFound=", sb2, z12, z13);
            sb2.append(z14);
            sb2.append(", childrenCount=");
            sb2.append(i13);
            sb2.append(", children=");
            return C2618u.h(sb2, list, ")");
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ProductPickerSearchItem(int r3, java.lang.CharSequence r4, ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type r5, java.lang.String r6, int r7, boolean r8, boolean r9, boolean r10, boolean r11, int r12, java.util.List r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
            /*
                r2 = this;
                r15 = r14 & 1
                if (r15 == 0) goto L5
                r3 = -1
            L5:
                r15 = r14 & 8
                if (r15 == 0) goto La
                r6 = 0
            La:
                r15 = r14 & 16
                r0 = 1
                if (r15 == 0) goto L10
                r7 = r0
            L10:
                r15 = r14 & 32
                r1 = 0
                if (r15 == 0) goto L16
                r8 = r1
            L16:
                r15 = r14 & 64
                if (r15 == 0) goto L1b
                r9 = r1
            L1b:
                r15 = r14 & 128(0x80, float:1.8E-43)
                if (r15 == 0) goto L20
                r10 = r1
            L20:
                r15 = r14 & 256(0x100, float:3.59E-43)
                if (r15 == 0) goto L25
                r11 = r0
            L25:
                r14 = r14 & 512(0x200, float:7.17E-43)
                if (r14 == 0) goto L36
                r14 = r1
                r12 = r10
                r15 = r13
                r10 = r8
                r13 = r11
                r8 = r6
                r11 = r9
                r6 = r4
                r9 = r7
                r4 = r2
                r7 = r5
            L34:
                r5 = r3
                goto L42
            L36:
                r14 = r12
                r15 = r13
                r12 = r10
                r13 = r11
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                goto L34
            L42:
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.autopicker.view.productpickersearch.presentation.ProductPickerSearchVO.ProductPickerSearchItem.<init>(int, java.lang.CharSequence, ru.ozon.app.android.autopicker.view.productpickersearch.presentation.adapter.Type, java.lang.String, int, boolean, boolean, boolean, boolean, int, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }

    public /* synthetic */ ProductPickerSearchVO(boolean z11, boolean z12, boolean z13, String str, String str2, boolean z14, String str3, String str4, List list, String str5, ProductPickerDetailsDTO.CurrentState currentState, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, z12, z13, str, str2, (i11 & 32) != 0 ? false : z14, str3, str4, list, str5, currentState, str6);
    }
}
