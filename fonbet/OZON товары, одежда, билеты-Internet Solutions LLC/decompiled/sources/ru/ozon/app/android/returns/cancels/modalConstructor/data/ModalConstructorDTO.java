package ru.ozon.app.android.returns.cancels.modalConstructor.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.padding.VerticalPadding;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001:\u0006\u0016\u0017\u0018\u0019\u001a\u001bB!\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO;", "", "items", "", "verticalPadding", "Lru/ozon/app/android/cscore/padding/VerticalPadding;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/cscore/padding/VerticalPadding;)V", "getItems", "()Ljava/util/List;", "getVerticalPadding", "()Lru/ozon/app/android/cscore/padding/VerticalPadding;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "DisclaimerWrapperDTO", "ButtonWrapperDTO", "CellListDTO", "HorizontalScrollImagesDTO", "PaddingDTO", "Separator", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ModalConstructorDTO {

    @NotNull
    private final List<Object> items;
    private final VerticalPadding verticalPadding;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$ButtonWrapperDTO;", "", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "padding", "Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ButtonWrapperDTO {

        @NotNull
        private final ButtonV3DTO button;
        private final PaddingDTO padding;

        public ButtonWrapperDTO(@NotNull ButtonV3DTO button, PaddingDTO paddingDTO) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.button = button;
            this.padding = paddingDTO;
        }

        public static /* synthetic */ ButtonWrapperDTO copy$default(ButtonWrapperDTO buttonWrapperDTO, ButtonV3DTO buttonV3DTO, PaddingDTO paddingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = buttonWrapperDTO.button;
            }
            if ((i11 & 2) != 0) {
                paddingDTO = buttonWrapperDTO.padding;
            }
            return buttonWrapperDTO.copy(buttonV3DTO, paddingDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        /* renamed from: component2, reason: from getter */
        public final PaddingDTO getPadding() {
            return this.padding;
        }

        @NotNull
        public final ButtonWrapperDTO copy(@NotNull ButtonV3DTO button, PaddingDTO padding) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new ButtonWrapperDTO(button, padding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ButtonWrapperDTO)) {
                return false;
            }
            ButtonWrapperDTO buttonWrapperDTO = (ButtonWrapperDTO) other;
            return Intrinsics.d(this.button, buttonWrapperDTO.button) && Intrinsics.d(this.padding, buttonWrapperDTO.padding);
        }

        @NotNull
        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final PaddingDTO getPadding() {
            return this.padding;
        }

        public int hashCode() {
            int hashCode = this.button.hashCode() * 31;
            PaddingDTO paddingDTO = this.padding;
            return hashCode + (paddingDTO == null ? 0 : paddingDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "ButtonWrapperDTO(button=" + this.button + ", padding=" + this.padding + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$CellListDTO;", "", "cellList", "", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "padding", "Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;)V", "getCellList", "()Ljava/util/List;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellListDTO {

        @NotNull
        private final List<CellDTO> cellList;
        private final PaddingDTO padding;

        public CellListDTO(@NotNull List<CellDTO> cellList, PaddingDTO paddingDTO) {
            Intrinsics.checkNotNullParameter(cellList, "cellList");
            this.cellList = cellList;
            this.padding = paddingDTO;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CellListDTO copy$default(CellListDTO cellListDTO, List list, PaddingDTO paddingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = cellListDTO.cellList;
            }
            if ((i11 & 2) != 0) {
                paddingDTO = cellListDTO.padding;
            }
            return cellListDTO.copy(list, paddingDTO);
        }

        @NotNull
        public final List<CellDTO> component1() {
            return this.cellList;
        }

        /* renamed from: component2, reason: from getter */
        public final PaddingDTO getPadding() {
            return this.padding;
        }

        @NotNull
        public final CellListDTO copy(@NotNull List<CellDTO> cellList, PaddingDTO padding) {
            Intrinsics.checkNotNullParameter(cellList, "cellList");
            return new CellListDTO(cellList, padding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellListDTO)) {
                return false;
            }
            CellListDTO cellListDTO = (CellListDTO) other;
            return Intrinsics.d(this.cellList, cellListDTO.cellList) && Intrinsics.d(this.padding, cellListDTO.padding);
        }

        @NotNull
        public final List<CellDTO> getCellList() {
            return this.cellList;
        }

        public final PaddingDTO getPadding() {
            return this.padding;
        }

        public int hashCode() {
            int hashCode = this.cellList.hashCode() * 31;
            PaddingDTO paddingDTO = this.padding;
            return hashCode + (paddingDTO == null ? 0 : paddingDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "CellListDTO(cellList=" + this.cellList + ", padding=" + this.padding + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$DisclaimerWrapperDTO;", "", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "padding", "Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "<init>", "(Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;)V", "getDisclaimer", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerWrapperDTO {

        @NotNull
        private final DisclaimerDTO disclaimer;
        private final PaddingDTO padding;

        public DisclaimerWrapperDTO(@NotNull DisclaimerDTO disclaimer, PaddingDTO paddingDTO) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            this.disclaimer = disclaimer;
            this.padding = paddingDTO;
        }

        public static /* synthetic */ DisclaimerWrapperDTO copy$default(DisclaimerWrapperDTO disclaimerWrapperDTO, DisclaimerDTO disclaimerDTO, PaddingDTO paddingDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                disclaimerDTO = disclaimerWrapperDTO.disclaimer;
            }
            if ((i11 & 2) != 0) {
                paddingDTO = disclaimerWrapperDTO.padding;
            }
            return disclaimerWrapperDTO.copy(disclaimerDTO, paddingDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        /* renamed from: component2, reason: from getter */
        public final PaddingDTO getPadding() {
            return this.padding;
        }

        @NotNull
        public final DisclaimerWrapperDTO copy(@NotNull DisclaimerDTO disclaimer, PaddingDTO padding) {
            Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
            return new DisclaimerWrapperDTO(disclaimer, padding);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerWrapperDTO)) {
                return false;
            }
            DisclaimerWrapperDTO disclaimerWrapperDTO = (DisclaimerWrapperDTO) other;
            return Intrinsics.d(this.disclaimer, disclaimerWrapperDTO.disclaimer) && Intrinsics.d(this.padding, disclaimerWrapperDTO.padding);
        }

        @NotNull
        public final DisclaimerDTO getDisclaimer() {
            return this.disclaimer;
        }

        public final PaddingDTO getPadding() {
            return this.padding;
        }

        public int hashCode() {
            int hashCode = this.disclaimer.hashCode() * 31;
            PaddingDTO paddingDTO = this.padding;
            return hashCode + (paddingDTO == null ? 0 : paddingDTO.hashCode());
        }

        @NotNull
        public String toString() {
            return "DisclaimerWrapperDTO(disclaimer=" + this.disclaimer + ", padding=" + this.padding + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "", "top", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "bottom", "left", "right", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getTop", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getBottom", "getLeft", "getRight", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PaddingDTO {
        private final CommonCellSettings.LayoutPadding bottom;
        private final CommonCellSettings.LayoutPadding left;
        private final CommonCellSettings.LayoutPadding right;
        private final CommonCellSettings.LayoutPadding top;

        public PaddingDTO() {
            this(null, null, null, null, 15, null);
        }

        public static /* synthetic */ PaddingDTO copy$default(PaddingDTO paddingDTO, CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = paddingDTO.top;
            }
            if ((i11 & 2) != 0) {
                layoutPadding2 = paddingDTO.bottom;
            }
            if ((i11 & 4) != 0) {
                layoutPadding3 = paddingDTO.left;
            }
            if ((i11 & 8) != 0) {
                layoutPadding4 = paddingDTO.right;
            }
            return paddingDTO.copy(layoutPadding, layoutPadding2, layoutPadding3, layoutPadding4);
        }

        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        /* renamed from: component4, reason: from getter */
        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        @NotNull
        public final PaddingDTO copy(CommonCellSettings.LayoutPadding top, CommonCellSettings.LayoutPadding bottom, CommonCellSettings.LayoutPadding left, CommonCellSettings.LayoutPadding right) {
            return new PaddingDTO(top, bottom, left, right);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PaddingDTO)) {
                return false;
            }
            PaddingDTO paddingDTO = (PaddingDTO) other;
            return this.top == paddingDTO.top && this.bottom == paddingDTO.bottom && this.left == paddingDTO.left && this.right == paddingDTO.right;
        }

        public final CommonCellSettings.LayoutPadding getBottom() {
            return this.bottom;
        }

        public final CommonCellSettings.LayoutPadding getLeft() {
            return this.left;
        }

        public final CommonCellSettings.LayoutPadding getRight() {
            return this.right;
        }

        public final CommonCellSettings.LayoutPadding getTop() {
            return this.top;
        }

        public int hashCode() {
            CommonCellSettings.LayoutPadding layoutPadding = this.top;
            int hashCode = (layoutPadding == null ? 0 : layoutPadding.hashCode()) * 31;
            CommonCellSettings.LayoutPadding layoutPadding2 = this.bottom;
            int hashCode2 = (hashCode + (layoutPadding2 == null ? 0 : layoutPadding2.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding3 = this.left;
            int hashCode3 = (hashCode2 + (layoutPadding3 == null ? 0 : layoutPadding3.hashCode())) * 31;
            CommonCellSettings.LayoutPadding layoutPadding4 = this.right;
            return hashCode3 + (layoutPadding4 != null ? layoutPadding4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "PaddingDTO(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ")";
        }

        public PaddingDTO(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4) {
            this.top = layoutPadding;
            this.bottom = layoutPadding2;
            this.left = layoutPadding3;
            this.right = layoutPadding4;
        }

        public /* synthetic */ PaddingDTO(CommonCellSettings.LayoutPadding layoutPadding, CommonCellSettings.LayoutPadding layoutPadding2, CommonCellSettings.LayoutPadding layoutPadding3, CommonCellSettings.LayoutPadding layoutPadding4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding, (i11 & 2) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding2, (i11 & 4) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding3, (i11 & 8) != 0 ? CommonCellSettings.LayoutPadding.NONE : layoutPadding4);
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$Separator;", "", "height", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "<init>", "(Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;)V", "getHeight", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Separator {

        @NotNull
        private final CommonCellSettings.LayoutPadding height;

        public Separator(@NotNull CommonCellSettings.LayoutPadding height) {
            Intrinsics.checkNotNullParameter(height, "height");
            this.height = height;
        }

        public static /* synthetic */ Separator copy$default(Separator separator, CommonCellSettings.LayoutPadding layoutPadding, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                layoutPadding = separator.height;
            }
            return separator.copy(layoutPadding);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final CommonCellSettings.LayoutPadding getHeight() {
            return this.height;
        }

        @NotNull
        public final Separator copy(@NotNull CommonCellSettings.LayoutPadding height) {
            Intrinsics.checkNotNullParameter(height, "height");
            return new Separator(height);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Separator) && this.height == ((Separator) other).height;
        }

        @NotNull
        public final CommonCellSettings.LayoutPadding getHeight() {
            return this.height;
        }

        public int hashCode() {
            return this.height.hashCode();
        }

        @NotNull
        public String toString() {
            return "Separator(height=" + this.height + ")";
        }
    }

    public ModalConstructorDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = DisclaimerWrapperDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonWrapperDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListDTO.class), @ProtoOneOfSignature(name = "scrollImages", type = HorizontalScrollImagesDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.verticalPadding = verticalPadding;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ModalConstructorDTO copy$default(ModalConstructorDTO modalConstructorDTO, List list, VerticalPadding verticalPadding, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = modalConstructorDTO.items;
        }
        if ((i11 & 2) != 0) {
            verticalPadding = modalConstructorDTO.verticalPadding;
        }
        return modalConstructorDTO.copy(list, verticalPadding);
    }

    @NotNull
    public final List<Object> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    @NotNull
    public final ModalConstructorDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "text", type = TextDTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class), @ProtoOneOfSignature(name = "disclaimer", type = DisclaimerWrapperDTO.class), @ProtoOneOfSignature(name = "button", type = ButtonWrapperDTO.class), @ProtoOneOfSignature(name = "cellList", type = CellListDTO.class), @ProtoOneOfSignature(name = "scrollImages", type = HorizontalScrollImagesDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends Object> items, VerticalPadding verticalPadding) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new ModalConstructorDTO(items, verticalPadding);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalConstructorDTO)) {
            return false;
        }
        ModalConstructorDTO modalConstructorDTO = (ModalConstructorDTO) other;
        return Intrinsics.d(this.items, modalConstructorDTO.items) && Intrinsics.d(this.verticalPadding, modalConstructorDTO.verticalPadding);
    }

    @NotNull
    public final List<Object> getItems() {
        return this.items;
    }

    public final VerticalPadding getVerticalPadding() {
        return this.verticalPadding;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        VerticalPadding verticalPadding = this.verticalPadding;
        return hashCode + (verticalPadding == null ? 0 : verticalPadding.hashCode());
    }

    @NotNull
    public String toString() {
        return "ModalConstructorDTO(items=" + this.items + ", verticalPadding=" + this.verticalPadding + ")";
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$HorizontalScrollImagesDTO;", "", "scrollImages", "", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImageDTO;", "paddingBetweenImages", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "padding", "Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "showBackground", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;Z)V", "getScrollImages", "()Ljava/util/List;", "getPaddingBetweenImages", "()Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "getPadding", "()Lru/ozon/app/android/returns/cancels/modalConstructor/data/ModalConstructorDTO$PaddingDTO;", "getShowBackground", "()Z", "setShowBackground", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "cancels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HorizontalScrollImagesDTO {
        private final PaddingDTO padding;
        private final CommonCellSettings.LayoutPadding paddingBetweenImages;

        @NotNull
        private final List<ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO> scrollImages;
        private transient boolean showBackground;

        public HorizontalScrollImagesDTO(@NotNull List<ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO> scrollImages, CommonCellSettings.LayoutPadding layoutPadding, PaddingDTO paddingDTO, boolean z11) {
            Intrinsics.checkNotNullParameter(scrollImages, "scrollImages");
            this.scrollImages = scrollImages;
            this.paddingBetweenImages = layoutPadding;
            this.padding = paddingDTO;
            this.showBackground = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HorizontalScrollImagesDTO copy$default(HorizontalScrollImagesDTO horizontalScrollImagesDTO, List list, CommonCellSettings.LayoutPadding layoutPadding, PaddingDTO paddingDTO, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = horizontalScrollImagesDTO.scrollImages;
            }
            if ((i11 & 2) != 0) {
                layoutPadding = horizontalScrollImagesDTO.paddingBetweenImages;
            }
            if ((i11 & 4) != 0) {
                paddingDTO = horizontalScrollImagesDTO.padding;
            }
            if ((i11 & 8) != 0) {
                z11 = horizontalScrollImagesDTO.showBackground;
            }
            return horizontalScrollImagesDTO.copy(list, layoutPadding, paddingDTO, z11);
        }

        @NotNull
        public final List<ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO> component1() {
            return this.scrollImages;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonCellSettings.LayoutPadding getPaddingBetweenImages() {
            return this.paddingBetweenImages;
        }

        /* renamed from: component3, reason: from getter */
        public final PaddingDTO getPadding() {
            return this.padding;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getShowBackground() {
            return this.showBackground;
        }

        @NotNull
        public final HorizontalScrollImagesDTO copy(@NotNull List<ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO> scrollImages, CommonCellSettings.LayoutPadding paddingBetweenImages, PaddingDTO padding, boolean showBackground) {
            Intrinsics.checkNotNullParameter(scrollImages, "scrollImages");
            return new HorizontalScrollImagesDTO(scrollImages, paddingBetweenImages, padding, showBackground);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HorizontalScrollImagesDTO)) {
                return false;
            }
            HorizontalScrollImagesDTO horizontalScrollImagesDTO = (HorizontalScrollImagesDTO) other;
            return Intrinsics.d(this.scrollImages, horizontalScrollImagesDTO.scrollImages) && this.paddingBetweenImages == horizontalScrollImagesDTO.paddingBetweenImages && Intrinsics.d(this.padding, horizontalScrollImagesDTO.padding) && this.showBackground == horizontalScrollImagesDTO.showBackground;
        }

        public final PaddingDTO getPadding() {
            return this.padding;
        }

        public final CommonCellSettings.LayoutPadding getPaddingBetweenImages() {
            return this.paddingBetweenImages;
        }

        @NotNull
        public final List<ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImageDTO> getScrollImages() {
            return this.scrollImages;
        }

        public final boolean getShowBackground() {
            return this.showBackground;
        }

        public int hashCode() {
            int hashCode = this.scrollImages.hashCode() * 31;
            CommonCellSettings.LayoutPadding layoutPadding = this.paddingBetweenImages;
            int hashCode2 = (hashCode + (layoutPadding == null ? 0 : layoutPadding.hashCode())) * 31;
            PaddingDTO paddingDTO = this.padding;
            return Boolean.hashCode(this.showBackground) + ((hashCode2 + (paddingDTO != null ? paddingDTO.hashCode() : 0)) * 31);
        }

        public final void setShowBackground(boolean z11) {
            this.showBackground = z11;
        }

        @NotNull
        public String toString() {
            return "HorizontalScrollImagesDTO(scrollImages=" + this.scrollImages + ", paddingBetweenImages=" + this.paddingBetweenImages + ", padding=" + this.padding + ", showBackground=" + this.showBackground + ")";
        }

        public /* synthetic */ HorizontalScrollImagesDTO(List list, CommonCellSettings.LayoutPadding layoutPadding, PaddingDTO paddingDTO, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i11 & 2) != 0 ? CommonCellSettings.LayoutPadding.PADDING_300 : layoutPadding, paddingDTO, (i11 & 8) != 0 ? false : z11);
        }
    }
}
