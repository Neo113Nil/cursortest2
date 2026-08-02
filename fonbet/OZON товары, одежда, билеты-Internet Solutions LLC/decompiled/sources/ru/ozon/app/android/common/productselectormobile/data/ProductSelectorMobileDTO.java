package ru.ozon.app.android.common.productselectormobile.data;

import B90.C2618u;
import N3.C3660k;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.tag.TagV3Atom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003JM\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "image", "actionButton", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "resetButton", "filter", "Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO$FilterTag;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO$FilterTag;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getImage", "getActionButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "getResetButton", "getFilter", "()Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO$FilterTag;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "FilterTag", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ProductSelectorMobileDTO {

    @NotNull
    private final ButtonV3Atom.SmallButton actionButton;
    private final FilterTag filter;
    private final String image;
    private final ButtonV3Atom.SmallButton resetButton;
    private final String subtitle;

    @NotNull
    private final String title;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/common/productselectormobile/data/ProductSelectorMobileDTO$FilterTag;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "tags", "", "Lru/ozon/uni/atoms/data/tag/TagV3Atom$TagAtom;", "<init>", "(Lru/ozon/uni/atoms/utils/OzonSpannableString;Ljava/util/List;)V", "getTitle", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getTags", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "product-selector-mobile_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FilterTag {

        @NotNull
        private final List<TagV3Atom.TagAtom> tags;
        private final OzonSpannableString title;

        public FilterTag(OzonSpannableString ozonSpannableString, @NotNull List<TagV3Atom.TagAtom> tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.title = ozonSpannableString;
            this.tags = tags;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FilterTag copy$default(FilterTag filterTag, OzonSpannableString ozonSpannableString, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                ozonSpannableString = filterTag.title;
            }
            if ((i11 & 2) != 0) {
                list = filterTag.tags;
            }
            return filterTag.copy(ozonSpannableString, list);
        }

        /* renamed from: component1, reason: from getter */
        public final OzonSpannableString getTitle() {
            return this.title;
        }

        @NotNull
        public final List<TagV3Atom.TagAtom> component2() {
            return this.tags;
        }

        @NotNull
        public final FilterTag copy(OzonSpannableString title, @NotNull List<TagV3Atom.TagAtom> tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            return new FilterTag(title, tags);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilterTag)) {
                return false;
            }
            FilterTag filterTag = (FilterTag) other;
            return Intrinsics.d(this.title, filterTag.title) && Intrinsics.d(this.tags, filterTag.tags);
        }

        @NotNull
        public final List<TagV3Atom.TagAtom> getTags() {
            return this.tags;
        }

        public final OzonSpannableString getTitle() {
            return this.title;
        }

        public int hashCode() {
            OzonSpannableString ozonSpannableString = this.title;
            return this.tags.hashCode() + ((ozonSpannableString == null ? 0 : ozonSpannableString.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            OzonSpannableString ozonSpannableString = this.title;
            return "FilterTag(title=" + ((Object) ozonSpannableString) + ", tags=" + this.tags + ")";
        }
    }

    public ProductSelectorMobileDTO(@NotNull String title, String str, String str2, @NotNull ButtonV3Atom.SmallButton actionButton, ButtonV3Atom.SmallButton smallButton, FilterTag filterTag) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        this.title = title;
        this.subtitle = str;
        this.image = str2;
        this.actionButton = actionButton;
        this.resetButton = smallButton;
        this.filter = filterTag;
    }

    public static /* synthetic */ ProductSelectorMobileDTO copy$default(ProductSelectorMobileDTO productSelectorMobileDTO, String str, String str2, String str3, ButtonV3Atom.SmallButton smallButton, ButtonV3Atom.SmallButton smallButton2, FilterTag filterTag, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = productSelectorMobileDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = productSelectorMobileDTO.subtitle;
        }
        if ((i11 & 4) != 0) {
            str3 = productSelectorMobileDTO.image;
        }
        if ((i11 & 8) != 0) {
            smallButton = productSelectorMobileDTO.actionButton;
        }
        if ((i11 & 16) != 0) {
            smallButton2 = productSelectorMobileDTO.resetButton;
        }
        if ((i11 & 32) != 0) {
            filterTag = productSelectorMobileDTO.filter;
        }
        ButtonV3Atom.SmallButton smallButton3 = smallButton2;
        FilterTag filterTag2 = filterTag;
        return productSelectorMobileDTO.copy(str, str2, str3, smallButton, smallButton3, filterTag2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3Atom.SmallButton getActionButton() {
        return this.actionButton;
    }

    /* renamed from: component5, reason: from getter */
    public final ButtonV3Atom.SmallButton getResetButton() {
        return this.resetButton;
    }

    /* renamed from: component6, reason: from getter */
    public final FilterTag getFilter() {
        return this.filter;
    }

    @NotNull
    public final ProductSelectorMobileDTO copy(@NotNull String title, String subtitle, String image, @NotNull ButtonV3Atom.SmallButton actionButton, ButtonV3Atom.SmallButton resetButton, FilterTag filter) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actionButton, "actionButton");
        return new ProductSelectorMobileDTO(title, subtitle, image, actionButton, resetButton, filter);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductSelectorMobileDTO)) {
            return false;
        }
        ProductSelectorMobileDTO productSelectorMobileDTO = (ProductSelectorMobileDTO) other;
        return Intrinsics.d(this.title, productSelectorMobileDTO.title) && Intrinsics.d(this.subtitle, productSelectorMobileDTO.subtitle) && Intrinsics.d(this.image, productSelectorMobileDTO.image) && Intrinsics.d(this.actionButton, productSelectorMobileDTO.actionButton) && Intrinsics.d(this.resetButton, productSelectorMobileDTO.resetButton) && Intrinsics.d(this.filter, productSelectorMobileDTO.filter);
    }

    @NotNull
    public final ButtonV3Atom.SmallButton getActionButton() {
        return this.actionButton;
    }

    public final FilterTag getFilter() {
        return this.filter;
    }

    public final String getImage() {
        return this.image;
    }

    public final ButtonV3Atom.SmallButton getResetButton() {
        return this.resetButton;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image;
        int c11 = C2618u.c(this.actionButton, (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        ButtonV3Atom.SmallButton smallButton = this.resetButton;
        int hashCode3 = (c11 + (smallButton == null ? 0 : smallButton.hashCode())) * 31;
        FilterTag filterTag = this.filter;
        return hashCode3 + (filterTag != null ? filterTag.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.image;
        ButtonV3Atom.SmallButton smallButton = this.actionButton;
        ButtonV3Atom.SmallButton smallButton2 = this.resetButton;
        FilterTag filterTag = this.filter;
        StringBuilder d11 = C3660k.d("ProductSelectorMobileDTO(title=", str, ", subtitle=", str2, ", image=");
        d11.append(str3);
        d11.append(", actionButton=");
        d11.append(smallButton);
        d11.append(", resetButton=");
        d11.append(smallButton2);
        d11.append(", filter=");
        d11.append(filterTag);
        d11.append(")");
        return d11.toString();
    }
}
