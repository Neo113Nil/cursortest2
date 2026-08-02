package ru.ozon.app.android.cml.delivery.widgets.cellList.data.buttons;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/cml/delivery/widgets/cellList/data/buttons/ButtonsDTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonTopMargin", "Lru/ozon/uni/atoms/data/common/Paddings;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getButtons", "()Ljava/util/List;", "getButtonTopMargin", "()Lru/ozon/uni/atoms/data/common/Paddings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ButtonsDTO {
    private final Paddings buttonTopMargin;

    @NotNull
    private final List<ButtonV3DTO> buttons;

    public ButtonsDTO(@NotNull List<ButtonV3DTO> buttons, Paddings paddings) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.buttons = buttons;
        this.buttonTopMargin = paddings;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ButtonsDTO copy$default(ButtonsDTO buttonsDTO, List list, Paddings paddings, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = buttonsDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            paddings = buttonsDTO.buttonTopMargin;
        }
        return buttonsDTO.copy(list, paddings);
    }

    @NotNull
    public final List<ButtonV3DTO> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final Paddings getButtonTopMargin() {
        return this.buttonTopMargin;
    }

    @NotNull
    public final ButtonsDTO copy(@NotNull List<ButtonV3DTO> buttons, Paddings buttonTopMargin) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new ButtonsDTO(buttons, buttonTopMargin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsDTO)) {
            return false;
        }
        ButtonsDTO buttonsDTO = (ButtonsDTO) other;
        return Intrinsics.d(this.buttons, buttonsDTO.buttons) && this.buttonTopMargin == buttonsDTO.buttonTopMargin;
    }

    public final Paddings getButtonTopMargin() {
        return this.buttonTopMargin;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        Paddings paddings = this.buttonTopMargin;
        return hashCode + (paddings == null ? 0 : paddings.hashCode());
    }

    @NotNull
    public String toString() {
        return "ButtonsDTO(buttons=" + this.buttons + ", buttonTopMargin=" + this.buttonTopMargin + ")";
    }
}
