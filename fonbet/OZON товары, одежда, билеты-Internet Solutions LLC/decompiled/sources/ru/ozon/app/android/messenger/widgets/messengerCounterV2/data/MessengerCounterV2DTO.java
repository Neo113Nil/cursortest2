package ru.ozon.app.android.messenger.widgets.messengerCounterV2.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.indicator.IndicatorDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/messenger/widgets/messengerCounterV2/data/MessengerCounterV2DTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "unreadCount", "Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getUnreadCount", "()Lru/ozon/uni/atoms/data/indicator/IndicatorDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "messenger_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class MessengerCounterV2DTO {
    public static final int $stable = ButtonV3Atom.SmallIconButton.$stable;

    @NotNull
    private final ButtonV3Atom.SmallIconButton button;
    private final IndicatorDTO unreadCount;

    public MessengerCounterV2DTO(@NotNull ButtonV3Atom.SmallIconButton button, IndicatorDTO indicatorDTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.unreadCount = indicatorDTO;
    }

    public static /* synthetic */ MessengerCounterV2DTO copy$default(MessengerCounterV2DTO messengerCounterV2DTO, ButtonV3Atom.SmallIconButton smallIconButton, IndicatorDTO indicatorDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = messengerCounterV2DTO.button;
        }
        if ((i11 & 2) != 0) {
            indicatorDTO = messengerCounterV2DTO.unreadCount;
        }
        return messengerCounterV2DTO.copy(smallIconButton, indicatorDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final IndicatorDTO getUnreadCount() {
        return this.unreadCount;
    }

    @NotNull
    public final MessengerCounterV2DTO copy(@NotNull ButtonV3Atom.SmallIconButton button, IndicatorDTO unreadCount) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new MessengerCounterV2DTO(button, unreadCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessengerCounterV2DTO)) {
            return false;
        }
        MessengerCounterV2DTO messengerCounterV2DTO = (MessengerCounterV2DTO) other;
        return Intrinsics.d(this.button, messengerCounterV2DTO.button) && Intrinsics.d(this.unreadCount, messengerCounterV2DTO.unreadCount);
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    public final IndicatorDTO getUnreadCount() {
        return this.unreadCount;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        IndicatorDTO indicatorDTO = this.unreadCount;
        return hashCode + (indicatorDTO == null ? 0 : indicatorDTO.hashCode());
    }

    @NotNull
    public String toString() {
        return "MessengerCounterV2DTO(button=" + this.button + ", unreadCount=" + this.unreadCount + ")";
    }
}
