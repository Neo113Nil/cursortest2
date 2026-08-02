package ru.ozon.app.android.account.orders.datechangedcomplaintform.data;

import G.g;
import K1.G;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.CheckboxTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/DeliveryDateChangedComplaintFormDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "reasons", "", "Lru/ozon/uni/atoms/data/cell/CheckboxTitleSubtitleCellDTO;", "comment", "Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;", "submitButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getReasons", "()Ljava/util/List;", "getComment", "()Lru/ozon/app/android/account/orders/datechangedcomplaintform/data/Input;", "getSubmitButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DeliveryDateChangedComplaintFormDTO {
    public static final int $stable = 8;

    @NotNull
    private final Input comment;

    @NotNull
    private final List<CheckboxTitleSubtitleCellDTO> reasons;

    @NotNull
    private final ButtonV3DTO submitButton;

    @NotNull
    private final TextDTO title;

    public DeliveryDateChangedComplaintFormDTO(@NotNull TextDTO title, @NotNull List<CheckboxTitleSubtitleCellDTO> reasons, @NotNull Input comment, @NotNull ButtonV3DTO submitButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        this.title = title;
        this.reasons = reasons;
        this.comment = comment;
        this.submitButton = submitButton;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeliveryDateChangedComplaintFormDTO copy$default(DeliveryDateChangedComplaintFormDTO deliveryDateChangedComplaintFormDTO, TextDTO textDTO, List list, Input input, ButtonV3DTO buttonV3DTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = deliveryDateChangedComplaintFormDTO.title;
        }
        if ((i11 & 2) != 0) {
            list = deliveryDateChangedComplaintFormDTO.reasons;
        }
        if ((i11 & 4) != 0) {
            input = deliveryDateChangedComplaintFormDTO.comment;
        }
        if ((i11 & 8) != 0) {
            buttonV3DTO = deliveryDateChangedComplaintFormDTO.submitButton;
        }
        return deliveryDateChangedComplaintFormDTO.copy(textDTO, list, input, buttonV3DTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getTitle() {
        return this.title;
    }

    @NotNull
    public final List<CheckboxTitleSubtitleCellDTO> component2() {
        return this.reasons;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Input getComment() {
        return this.comment;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final DeliveryDateChangedComplaintFormDTO copy(@NotNull TextDTO title, @NotNull List<CheckboxTitleSubtitleCellDTO> reasons, @NotNull Input comment, @NotNull ButtonV3DTO submitButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(reasons, "reasons");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(submitButton, "submitButton");
        return new DeliveryDateChangedComplaintFormDTO(title, reasons, comment, submitButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeliveryDateChangedComplaintFormDTO)) {
            return false;
        }
        DeliveryDateChangedComplaintFormDTO deliveryDateChangedComplaintFormDTO = (DeliveryDateChangedComplaintFormDTO) other;
        return Intrinsics.d(this.title, deliveryDateChangedComplaintFormDTO.title) && Intrinsics.d(this.reasons, deliveryDateChangedComplaintFormDTO.reasons) && Intrinsics.d(this.comment, deliveryDateChangedComplaintFormDTO.comment) && Intrinsics.d(this.submitButton, deliveryDateChangedComplaintFormDTO.submitButton);
    }

    @NotNull
    public final Input getComment() {
        return this.comment;
    }

    @NotNull
    public final List<CheckboxTitleSubtitleCellDTO> getReasons() {
        return this.reasons;
    }

    @NotNull
    public final ButtonV3DTO getSubmitButton() {
        return this.submitButton;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.submitButton.hashCode() + ((this.comment.hashCode() + g.b(this.title.hashCode() * 31, 31, this.reasons)) * 31);
    }

    @NotNull
    public String toString() {
        TextDTO textDTO = this.title;
        List<CheckboxTitleSubtitleCellDTO> list = this.reasons;
        Input input = this.comment;
        ButtonV3DTO buttonV3DTO = this.submitButton;
        StringBuilder e11 = G.e("DeliveryDateChangedComplaintFormDTO(title=", textDTO, ", reasons=", list, ", comment=");
        e11.append(input);
        e11.append(", submitButton=");
        e11.append(buttonV3DTO);
        e11.append(")");
        return e11.toString();
    }
}
