package ru.ozon.app.android.travel.molecules.dto.counterInput.v2;

import GR.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;", "", "currentValue", "Lru/ozon/uni/atoms/data/text/TextDTO;", "decrementButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "incrementButton", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getCurrentValue", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getDecrementButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getIncrementButton", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "molecules_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CounterInputV2DTO {

    @NotNull
    private final TextDTO currentValue;

    @NotNull
    private final IconButtonV3DTO decrementButton;

    @NotNull
    private final IconButtonV3DTO incrementButton;

    public CounterInputV2DTO(@NotNull TextDTO currentValue, @NotNull IconButtonV3DTO decrementButton, @NotNull IconButtonV3DTO incrementButton) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(decrementButton, "decrementButton");
        Intrinsics.checkNotNullParameter(incrementButton, "incrementButton");
        this.currentValue = currentValue;
        this.decrementButton = decrementButton;
        this.incrementButton = incrementButton;
    }

    public static /* synthetic */ CounterInputV2DTO copy$default(CounterInputV2DTO counterInputV2DTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            textDTO = counterInputV2DTO.currentValue;
        }
        if ((i11 & 2) != 0) {
            iconButtonV3DTO = counterInputV2DTO.decrementButton;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO2 = counterInputV2DTO.incrementButton;
        }
        return counterInputV2DTO.copy(textDTO, iconButtonV3DTO, iconButtonV3DTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextDTO getCurrentValue() {
        return this.currentValue;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final IconButtonV3DTO getDecrementButton() {
        return this.decrementButton;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getIncrementButton() {
        return this.incrementButton;
    }

    @NotNull
    public final CounterInputV2DTO copy(@NotNull TextDTO currentValue, @NotNull IconButtonV3DTO decrementButton, @NotNull IconButtonV3DTO incrementButton) {
        Intrinsics.checkNotNullParameter(currentValue, "currentValue");
        Intrinsics.checkNotNullParameter(decrementButton, "decrementButton");
        Intrinsics.checkNotNullParameter(incrementButton, "incrementButton");
        return new CounterInputV2DTO(currentValue, decrementButton, incrementButton);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CounterInputV2DTO)) {
            return false;
        }
        CounterInputV2DTO counterInputV2DTO = (CounterInputV2DTO) other;
        return Intrinsics.d(this.currentValue, counterInputV2DTO.currentValue) && Intrinsics.d(this.decrementButton, counterInputV2DTO.decrementButton) && Intrinsics.d(this.incrementButton, counterInputV2DTO.incrementButton);
    }

    @NotNull
    public final TextDTO getCurrentValue() {
        return this.currentValue;
    }

    @NotNull
    public final IconButtonV3DTO getDecrementButton() {
        return this.decrementButton;
    }

    @NotNull
    public final IconButtonV3DTO getIncrementButton() {
        return this.incrementButton;
    }

    public int hashCode() {
        return this.incrementButton.hashCode() + b.c(this.decrementButton, this.currentValue.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "CounterInputV2DTO(currentValue=" + this.currentValue + ", decrementButton=" + this.decrementButton + ", incrementButton=" + this.incrementButton + ")";
    }
}
