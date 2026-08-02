package ru.ozon.app.android.returns.creation.widgets.textAreaButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.returns.ui.molecules.textarea.v2.data.RmsTextAreaV2Dto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/textAreaButton/data/ReturnTextAreaButtonDto;", "", SelectionItemFormDTO.TEXT_AREA_FIELD_NAME, "Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTextArea", "()Lru/ozon/app/android/returns/ui/molecules/textarea/v2/data/RmsTextAreaV2Dto;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReturnTextAreaButtonDto {
    public static final int $stable = 8;

    @NotNull
    private final ButtonV3DTO button;

    @NotNull
    private final RmsTextAreaV2Dto textArea;

    public ReturnTextAreaButtonDto(@NotNull RmsTextAreaV2Dto textArea, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        this.textArea = textArea;
        this.button = button;
    }

    public static /* synthetic */ ReturnTextAreaButtonDto copy$default(ReturnTextAreaButtonDto returnTextAreaButtonDto, RmsTextAreaV2Dto rmsTextAreaV2Dto, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            rmsTextAreaV2Dto = returnTextAreaButtonDto.textArea;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO = returnTextAreaButtonDto.button;
        }
        return returnTextAreaButtonDto.copy(rmsTextAreaV2Dto, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final RmsTextAreaV2Dto getTextArea() {
        return this.textArea;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final ReturnTextAreaButtonDto copy(@NotNull RmsTextAreaV2Dto textArea, @NotNull ButtonV3DTO button) {
        Intrinsics.checkNotNullParameter(textArea, "textArea");
        Intrinsics.checkNotNullParameter(button, "button");
        return new ReturnTextAreaButtonDto(textArea, button);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnTextAreaButtonDto)) {
            return false;
        }
        ReturnTextAreaButtonDto returnTextAreaButtonDto = (ReturnTextAreaButtonDto) other;
        return Intrinsics.d(this.textArea, returnTextAreaButtonDto.textArea) && Intrinsics.d(this.button, returnTextAreaButtonDto.button);
    }

    @NotNull
    public final ButtonV3DTO getButton() {
        return this.button;
    }

    @NotNull
    public final RmsTextAreaV2Dto getTextArea() {
        return this.textArea;
    }

    public int hashCode() {
        return this.button.hashCode() + (this.textArea.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ReturnTextAreaButtonDto(textArea=" + this.textArea + ", button=" + this.button + ")";
    }
}
