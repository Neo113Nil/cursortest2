package ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormVariantPicker;

import Ak.C2436a;
import Bi.b;
import D3.h;
import G.g;
import Pk0.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.InputSelectButtonDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001,B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010#R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010)\u001a\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "uploadKey", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "selectionButton", "", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem;", "variants", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;Ljava/util/List;)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;Ljava/util/List;)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getUploadKey", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "getSelectionButton", "()Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;", "setSelectionButton", "(Lru/ozon/uni/atoms/data/controls/button/InputSelectButtonDTO;)V", "Ljava/util/List;", "getVariants", "()Ljava/util/List;", "VariantPickerItem", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class VariantPickerVO implements c {
    private final long id;

    @NotNull
    private InputSelectButtonDTO selectionButton;

    @NotNull
    private final TextDTO title;

    @NotNull
    private final String uploadKey;
    private final List<VariantPickerItem> variants;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem;", "", "Header", "Variant", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Header;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface VariantPickerItem {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Header;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "variantsHeader", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getVariantsHeader", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Header implements VariantPickerItem {

            @NotNull
            private final TextDTO variantsHeader;

            public Header(@NotNull TextDTO variantsHeader) {
                Intrinsics.checkNotNullParameter(variantsHeader, "variantsHeader");
                this.variantsHeader = variantsHeader;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Header) && Intrinsics.d(this.variantsHeader, ((Header) other).variantsHeader);
            }

            @NotNull
            public final TextDTO getVariantsHeader() {
                return this.variantsHeader;
            }

            public int hashCode() {
                return this.variantsHeader.hashCode();
            }

            @NotNull
            public String toString() {
                return "Header(variantsHeader=" + this.variantsHeader + ")";
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u0007\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;", "Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "variantCell", "", "isSelected", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)V", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Z)Lru/ozon/app/android/ugc/widgets/reviewFormMobile/reviewFormVariantPicker/VariantPickerVO$VariantPickerItem$Variant;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getVariantCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Z", "()Z", "setSelected", "(Z)V", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Variant implements VariantPickerItem {

            @NotNull
            private final String id;
            private boolean isSelected;

            @NotNull
            private final CellDTO variantCell;

            public Variant(@NotNull String id2, @NotNull CellDTO variantCell, boolean z11) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(variantCell, "variantCell");
                this.id = id2;
                this.variantCell = variantCell;
                this.isSelected = z11;
            }

            public static /* synthetic */ Variant copy$default(Variant variant, String str, CellDTO cellDTO, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = variant.id;
                }
                if ((i11 & 2) != 0) {
                    cellDTO = variant.variantCell;
                }
                if ((i11 & 4) != 0) {
                    z11 = variant.isSelected;
                }
                return variant.copy(str, cellDTO, z11);
            }

            @NotNull
            public final Variant copy(@NotNull String id2, @NotNull CellDTO variantCell, boolean isSelected) {
                Intrinsics.checkNotNullParameter(id2, "id");
                Intrinsics.checkNotNullParameter(variantCell, "variantCell");
                return new Variant(id2, variantCell, isSelected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Variant)) {
                    return false;
                }
                Variant variant = (Variant) other;
                return Intrinsics.d(this.id, variant.id) && Intrinsics.d(this.variantCell, variant.variantCell) && this.isSelected == variant.isSelected;
            }

            @NotNull
            public final String getId() {
                return this.id;
            }

            @NotNull
            public final CellDTO getVariantCell() {
                return this.variantCell;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSelected) + b.c(this.variantCell, this.id.hashCode() * 31, 31);
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                String str = this.id;
                CellDTO cellDTO = this.variantCell;
                boolean z11 = this.isSelected;
                StringBuilder sb2 = new StringBuilder("Variant(id=");
                sb2.append(str);
                sb2.append(", variantCell=");
                sb2.append(cellDTO);
                sb2.append(", isSelected=");
                return a.a(")", sb2, z11);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VariantPickerVO(long j11, @NotNull String uploadKey, @NotNull TextDTO title, @NotNull InputSelectButtonDTO selectionButton, List<? extends VariantPickerItem> list) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectionButton, "selectionButton");
        this.id = j11;
        this.uploadKey = uploadKey;
        this.title = title;
        this.selectionButton = selectionButton;
        this.variants = list;
    }

    public static /* synthetic */ VariantPickerVO copy$default(VariantPickerVO variantPickerVO, long j11, String str, TextDTO textDTO, InputSelectButtonDTO inputSelectButtonDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = variantPickerVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            str = variantPickerVO.uploadKey;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            textDTO = variantPickerVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 8) != 0) {
            inputSelectButtonDTO = variantPickerVO.selectionButton;
        }
        InputSelectButtonDTO inputSelectButtonDTO2 = inputSelectButtonDTO;
        if ((i11 & 16) != 0) {
            list = variantPickerVO.variants;
        }
        return variantPickerVO.copy(j12, str2, textDTO2, inputSelectButtonDTO2, list);
    }

    @NotNull
    public final VariantPickerVO copy(long id2, @NotNull String uploadKey, @NotNull TextDTO title, @NotNull InputSelectButtonDTO selectionButton, List<? extends VariantPickerItem> variants) {
        Intrinsics.checkNotNullParameter(uploadKey, "uploadKey");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(selectionButton, "selectionButton");
        return new VariantPickerVO(id2, uploadKey, title, selectionButton, variants);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VariantPickerVO)) {
            return false;
        }
        VariantPickerVO variantPickerVO = (VariantPickerVO) other;
        return this.id == variantPickerVO.id && Intrinsics.d(this.uploadKey, variantPickerVO.uploadKey) && Intrinsics.d(this.title, variantPickerVO.title) && Intrinsics.d(this.selectionButton, variantPickerVO.selectionButton) && Intrinsics.d(this.variants, variantPickerVO.variants);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final InputSelectButtonDTO getSelectionButton() {
        return this.selectionButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final String getUploadKey() {
        return this.uploadKey;
    }

    public final List<VariantPickerItem> getVariants() {
        return this.variants;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.selectionButton.hashCode() + Ns.b.a(this.title, g.a(Long.hashCode(this.id) * 31, 31, this.uploadKey), 31)) * 31;
        List<VariantPickerItem> list = this.variants;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.uploadKey;
        TextDTO textDTO = this.title;
        InputSelectButtonDTO inputSelectButtonDTO = this.selectionButton;
        List<VariantPickerItem> list = this.variants;
        StringBuilder c11 = C2436a.c(j11, "VariantPickerVO(id=", ", uploadKey=", str);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", selectionButton=");
        c11.append(inputSelectButtonDTO);
        return h.c(c11, ", variants=", list, ")");
    }
}
