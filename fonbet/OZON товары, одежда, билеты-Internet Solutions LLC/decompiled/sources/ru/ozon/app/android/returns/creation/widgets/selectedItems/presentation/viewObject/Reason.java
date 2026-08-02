package ru.ozon.app.android.returns.creation.widgets.selectedItems.presentation.viewObject;

import D3.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "", "None", "CellHolder", "ReasonInfo", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$CellHolder;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$None;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$ReasonInfo;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface Reason {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$CellHolder;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellHolder implements Reason {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO cell;

        public CellHolder(@NotNull CellDTO cell) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.cell = cell;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CellHolder) && Intrinsics.d(this.cell, ((CellHolder) other).cell);
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public int hashCode() {
            return this.cell.hashCode();
        }

        @NotNull
        public String toString() {
            return "CellHolder(cell=" + this.cell + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$None;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class None implements Reason {

        @NotNull
        public static final None INSTANCE = new None();

        private None() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof None);
        }

        public int hashCode() {
            return 946730117;
        }

        @NotNull
        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason$ReasonInfo;", "Lru/ozon/app/android/returns/creation/widgets/selectedItems/presentation/viewObject/Reason;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "images", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getImages", "()Ljava/util/List;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReasonInfo implements Reason {
        private final ButtonV3DTO button;
        private final List<IconDTO> images;
        private final TextDTO subtitle;

        @NotNull
        private final TextDTO title;

        public ReasonInfo(@NotNull TextDTO title, TextDTO textDTO, List<IconDTO> list, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = textDTO;
            this.images = list;
            this.button = buttonV3DTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReasonInfo)) {
                return false;
            }
            ReasonInfo reasonInfo = (ReasonInfo) other;
            return Intrinsics.d(this.title, reasonInfo.title) && Intrinsics.d(this.subtitle, reasonInfo.subtitle) && Intrinsics.d(this.images, reasonInfo.images) && Intrinsics.d(this.button, reasonInfo.button);
        }

        public final ButtonV3DTO getButton() {
            return this.button;
        }

        public final List<IconDTO> getImages() {
            return this.images;
        }

        public final TextDTO getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = this.title.hashCode() * 31;
            TextDTO textDTO = this.subtitle;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            List<IconDTO> list = this.images;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.button;
            return hashCode3 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.subtitle;
            List<IconDTO> list = this.images;
            ButtonV3DTO buttonV3DTO = this.button;
            StringBuilder g10 = g.g("ReasonInfo(title=", textDTO, ", subtitle=", textDTO2, ", images=");
            g10.append(list);
            g10.append(", button=");
            g10.append(buttonV3DTO);
            g10.append(")");
            return g10.toString();
        }
    }
}
