package ru.ozon.app.android.fresh.unsorted.widgets.swapButton.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/swapButton/data/SwapButtonDTO;", "", "firstButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "secondButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "getFirstButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSecondButton", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SwapButtonDTO {
    public static final int $stable = 0;

    @NotNull
    private final ButtonV3DTO firstButton;
    private final ButtonV3DTO secondButton;

    public SwapButtonDTO(@NotNull ButtonV3DTO firstButton, ButtonV3DTO buttonV3DTO) {
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        this.firstButton = firstButton;
        this.secondButton = buttonV3DTO;
    }

    public static /* synthetic */ SwapButtonDTO copy$default(SwapButtonDTO swapButtonDTO, ButtonV3DTO buttonV3DTO, ButtonV3DTO buttonV3DTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            buttonV3DTO = swapButtonDTO.firstButton;
        }
        if ((i11 & 2) != 0) {
            buttonV3DTO2 = swapButtonDTO.secondButton;
        }
        return swapButtonDTO.copy(buttonV3DTO, buttonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3DTO getFirstButton() {
        return this.firstButton;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonV3DTO getSecondButton() {
        return this.secondButton;
    }

    @NotNull
    public final SwapButtonDTO copy(@NotNull ButtonV3DTO firstButton, ButtonV3DTO secondButton) {
        Intrinsics.checkNotNullParameter(firstButton, "firstButton");
        return new SwapButtonDTO(firstButton, secondButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwapButtonDTO)) {
            return false;
        }
        SwapButtonDTO swapButtonDTO = (SwapButtonDTO) other;
        return Intrinsics.d(this.firstButton, swapButtonDTO.firstButton) && Intrinsics.d(this.secondButton, swapButtonDTO.secondButton);
    }

    @NotNull
    public final ButtonV3DTO getFirstButton() {
        return this.firstButton;
    }

    public final ButtonV3DTO getSecondButton() {
        return this.secondButton;
    }

    public int hashCode() {
        int hashCode = this.firstButton.hashCode() * 31;
        ButtonV3DTO buttonV3DTO = this.secondButton;
        return hashCode + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "SwapButtonDTO(firstButton=" + this.firstButton + ", secondButton=" + this.secondButton + ")";
    }
}
