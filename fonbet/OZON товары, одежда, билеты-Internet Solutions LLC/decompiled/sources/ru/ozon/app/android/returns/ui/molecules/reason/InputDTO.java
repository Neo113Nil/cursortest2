package ru.ozon.app.android.returns.ui.molecules.reason;

import Ih.a;
import Kk.C3532b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.data.components.RmsTextAreaDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/returns/ui/molecules/reason/InputDTO;", "", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "showValidationBorder", "", "validationBorderColor", "", "<init>", "(Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;Lru/ozon/uni/atoms/data/AtomActionDTO;ZLjava/lang/String;)V", "getTextArea", "()Lru/ozon/app/android/returns/ui/data/components/RmsTextAreaDto;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getShowValidationBorder", "()Z", "getValidationBorderColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class InputDTO {

    @NotNull
    private final AtomActionDTO action;
    private final boolean showValidationBorder;

    @NotNull
    private final RmsTextAreaDto textArea;
    private final String validationBorderColor;

    public InputDTO(@NotNull RmsTextAreaDto textArea, @NotNull AtomActionDTO action, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(action, "action");
        this.textArea = textArea;
        this.action = action;
        this.showValidationBorder = z11;
        this.validationBorderColor = str;
    }

    public static /* synthetic */ InputDTO copy$default(InputDTO inputDTO, RmsTextAreaDto rmsTextAreaDto, AtomActionDTO atomActionDTO, boolean z11, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rmsTextAreaDto = inputDTO.textArea;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = inputDTO.action;
        }
        if ((i11 & 4) != 0) {
            z11 = inputDTO.showValidationBorder;
        }
        if ((i11 & 8) != 0) {
            str = inputDTO.validationBorderColor;
        }
        return inputDTO.copy(rmsTextAreaDto, atomActionDTO, z11, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RmsTextAreaDto getTextArea() {
        return this.textArea;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowValidationBorder() {
        return this.showValidationBorder;
    }

    /* renamed from: component4, reason: from getter */
    public final String getValidationBorderColor() {
        return this.validationBorderColor;
    }

    @NotNull
    public final InputDTO copy(@NotNull RmsTextAreaDto textArea, @NotNull AtomActionDTO action, boolean showValidationBorder, String validationBorderColor) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(action, "action");
        return new InputDTO(textArea, action, showValidationBorder, validationBorderColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDTO)) {
            return false;
        }
        InputDTO inputDTO = (InputDTO) other;
        return Intrinsics.d(this.textArea, inputDTO.textArea) && Intrinsics.d(this.action, inputDTO.action) && this.showValidationBorder == inputDTO.showValidationBorder && Intrinsics.d(this.validationBorderColor, inputDTO.validationBorderColor);
    }

    @NotNull
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final boolean getShowValidationBorder() {
        return this.showValidationBorder;
    }

    @NotNull
    public final RmsTextAreaDto getTextArea() {
        return this.textArea;
    }

    public final String getValidationBorderColor() {
        return this.validationBorderColor;
    }

    public int hashCode() {
        int a11 = C3532b.a(a.b(this.action, this.textArea.hashCode() * 31, 31), 31, this.showValidationBorder);
        String str = this.validationBorderColor;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "InputDTO(textArea=" + this.textArea + ", action=" + this.action + ", showValidationBorder=" + this.showValidationBorder + ", validationBorderColor=" + this.validationBorderColor + ")";
    }
}
