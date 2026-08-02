package ru.ozon.app.android.returns.ui.molecules.textarea.viewObject;

import D3.h;
import Ih.a;
import Kk.C3532b;
import Lh.b;
import g.C6594f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.presentation.flexImages.ImageVI;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "Ll20/c;", "CellRow", "InputRow", "PickedImagesRow", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$CellRow;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$InputRow;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$PickedImagesRow;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ReasonRow extends c {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$CellRow;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(JLru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellRow implements ReasonRow {

        @NotNull
        private final CellDTO cell;
        private final long id;

        public CellRow(long j11, @NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = j11;
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellRow)) {
                return false;
            }
            CellRow cellRow = (CellRow) other;
            return this.id == cellRow.id && Intrinsics.d(this.cell, cellRow.cell);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.cell.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder e11 = h.e("CellRow(id=", this.id, ", cell=", this.cell);
            e11.append(")");
            return e11.toString();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static Integer getScrollWidgetKey(@NotNull ReasonRow reasonRow) {
            return null;
        }

        public static int getViewItemKey(@NotNull ReasonRow reasonRow) {
            return reasonRow.hashCode();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010\u0011¨\u0006'"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$InputRow;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "", "id", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "showValidationBorder", "", "validationBorderColor", "<init>", "(JLru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/String;)V", "copy", "(JLru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/String;)Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$InputRow;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;", "getTextArea", "()Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/TextAreaVO;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "Z", "getShowValidationBorder", "()Z", "Ljava/lang/String;", "getValidationBorderColor", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InputRow implements ReasonRow {

        @NotNull
        private final AtomActionDTO action;
        private final long id;
        private final boolean showValidationBorder;

        @NotNull
        private final TextAreaVO textArea;
        private final String validationBorderColor;

        public InputRow(long j11, @NotNull TextAreaVO textArea, @NotNull AtomActionDTO action, boolean z11, String str) {
            Intrinsics.checkNotNullParameter(textArea, "textArea");
            Intrinsics.checkNotNullParameter(action, "action");
            this.id = j11;
            this.textArea = textArea;
            this.action = action;
            this.showValidationBorder = z11;
            this.validationBorderColor = str;
        }

        public static /* synthetic */ InputRow copy$default(InputRow inputRow, long j11, TextAreaVO textAreaVO, AtomActionDTO atomActionDTO, boolean z11, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                j11 = inputRow.id;
            }
            long j12 = j11;
            if ((i11 & 2) != 0) {
                textAreaVO = inputRow.textArea;
            }
            TextAreaVO textAreaVO2 = textAreaVO;
            if ((i11 & 4) != 0) {
                atomActionDTO = inputRow.action;
            }
            AtomActionDTO atomActionDTO2 = atomActionDTO;
            if ((i11 & 8) != 0) {
                z11 = inputRow.showValidationBorder;
            }
            boolean z12 = z11;
            if ((i11 & 16) != 0) {
                str = inputRow.validationBorderColor;
            }
            return inputRow.copy(j12, textAreaVO2, atomActionDTO2, z12, str);
        }

        @NotNull
        public final InputRow copy(long id2, @NotNull TextAreaVO textArea, @NotNull AtomActionDTO action, boolean showValidationBorder, String validationBorderColor) {
            Intrinsics.checkNotNullParameter(textArea, "textArea");
            Intrinsics.checkNotNullParameter(action, "action");
            return new InputRow(id2, textArea, action, showValidationBorder, validationBorderColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputRow)) {
                return false;
            }
            InputRow inputRow = (InputRow) other;
            return this.id == inputRow.id && Intrinsics.d(this.textArea, inputRow.textArea) && Intrinsics.d(this.action, inputRow.action) && this.showValidationBorder == inputRow.showValidationBorder && Intrinsics.d(this.validationBorderColor, inputRow.validationBorderColor);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        public final boolean getShowValidationBorder() {
            return this.showValidationBorder;
        }

        @NotNull
        public final TextAreaVO getTextArea() {
            return this.textArea;
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            int a11 = C3532b.a(a.b(this.action, (this.textArea.hashCode() + (Long.hashCode(this.id) * 31)) * 31, 31), 31, this.showValidationBorder);
            String str = this.validationBorderColor;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            long j11 = this.id;
            TextAreaVO textAreaVO = this.textArea;
            AtomActionDTO atomActionDTO = this.action;
            boolean z11 = this.showValidationBorder;
            String str = this.validationBorderColor;
            StringBuilder sb2 = new StringBuilder("InputRow(id=");
            sb2.append(j11);
            sb2.append(", textArea=");
            sb2.append(textAreaVO);
            sb2.append(", action=");
            sb2.append(atomActionDTO);
            sb2.append(", showValidationBorder=");
            sb2.append(z11);
            return C6594f.a(", validationBorderColor=", str, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow$PickedImagesRow;", "Lru/ozon/app/android/returns/ui/molecules/textarea/viewObject/ReasonRow;", "", "id", "", "Lru/ozon/app/android/returns/ui/presentation/flexImages/ImageVI;", "items", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PickedImagesRow implements ReasonRow {
        private final long id;

        @NotNull
        private final List<ImageVI> items;

        /* JADX WARN: Multi-variable type inference failed */
        public PickedImagesRow(long j11, @NotNull List<? extends ImageVI> items) {
            Intrinsics.checkNotNullParameter(items, "items");
            this.id = j11;
            this.items = items;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PickedImagesRow)) {
                return false;
            }
            PickedImagesRow pickedImagesRow = (PickedImagesRow) other;
            return this.id == pickedImagesRow.id && Intrinsics.d(this.items, pickedImagesRow.items);
        }

        @Override // l20.c
        public long getId() {
            return this.id;
        }

        @NotNull
        public final List<ImageVI> getItems() {
            return this.items;
        }

        @Override // l20.c
        public Integer getScrollWidgetKey() {
            return DefaultImpls.getScrollWidgetKey(this);
        }

        @Override // l20.c
        public int getViewItemKey() {
            return DefaultImpls.getViewItemKey(this);
        }

        public int hashCode() {
            return this.items.hashCode() + (Long.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            StringBuilder b11 = b.b(this.id, "PickedImagesRow(id=", ", items=", this.items);
            b11.append(")");
            return b11.toString();
        }
    }
}
