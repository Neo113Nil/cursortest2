package ru.ozon.app.android.fresh.unsorted.widgets.flexButtons.data;

import B3.p;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\"#B?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO;", "", "buttons", "", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "spacers", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$Spacers;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "buttonsArrangement", "Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "<init>", "(Ljava/util/List;Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$Spacers;Ljava/util/Map;Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;)V", "getButtons", "()Ljava/util/List;", "getSpacers", "()Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "getButtonsArrangement", "()Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Spacers", "ButtonsArrangement", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class FlexButtonsDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ButtonV3DTO> buttons;
    private final ButtonsArrangement buttonsArrangement;
    private final Spacers spacers;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$ButtonsArrangement;", "", "<init>", "(Ljava/lang/String;I)V", "EVEN_SPREAD", "UNEVEN_SPREAD", "NO_SPREAD", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsArrangement {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsArrangement[] $VALUES;
        public static final ButtonsArrangement EVEN_SPREAD = new ButtonsArrangement("EVEN_SPREAD", 0);
        public static final ButtonsArrangement UNEVEN_SPREAD = new ButtonsArrangement("UNEVEN_SPREAD", 1);
        public static final ButtonsArrangement NO_SPREAD = new ButtonsArrangement("NO_SPREAD", 2);

        private static final /* synthetic */ ButtonsArrangement[] $values() {
            return new ButtonsArrangement[]{EVEN_SPREAD, UNEVEN_SPREAD, NO_SPREAD};
        }

        static {
            ButtonsArrangement[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsArrangement(String str, int i11) {
        }

        public static ButtonsArrangement valueOf(String str) {
            return (ButtonsArrangement) Enum.valueOf(ButtonsArrangement.class, str);
        }

        public static ButtonsArrangement[] values() {
            return (ButtonsArrangement[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/flexButtons/data/FlexButtonsDTO$Spacers;", "", "left", "Lru/ozon/uni/atoms/data/common/Paddings;", "right", "top", "bottom", "betweenButtons", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getLeft", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getRight", "getTop", "getBottom", "getBetweenButtons", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Spacers {
        public static final int $stable = 0;
        private final Paddings betweenButtons;
        private final Paddings bottom;
        private final Paddings left;
        private final Paddings right;
        private final Paddings top;

        public Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5) {
            this.left = paddings;
            this.right = paddings2;
            this.top = paddings3;
            this.bottom = paddings4;
            this.betweenButtons = paddings5;
        }

        public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, Paddings paddings4, Paddings paddings5, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                paddings = spacers.left;
            }
            if ((i11 & 2) != 0) {
                paddings2 = spacers.right;
            }
            if ((i11 & 4) != 0) {
                paddings3 = spacers.top;
            }
            if ((i11 & 8) != 0) {
                paddings4 = spacers.bottom;
            }
            if ((i11 & 16) != 0) {
                paddings5 = spacers.betweenButtons;
            }
            Paddings paddings6 = paddings5;
            Paddings paddings7 = paddings3;
            return spacers.copy(paddings, paddings2, paddings7, paddings4, paddings6);
        }

        /* renamed from: component1, reason: from getter */
        public final Paddings getLeft() {
            return this.left;
        }

        /* renamed from: component2, reason: from getter */
        public final Paddings getRight() {
            return this.right;
        }

        /* renamed from: component3, reason: from getter */
        public final Paddings getTop() {
            return this.top;
        }

        /* renamed from: component4, reason: from getter */
        public final Paddings getBottom() {
            return this.bottom;
        }

        /* renamed from: component5, reason: from getter */
        public final Paddings getBetweenButtons() {
            return this.betweenButtons;
        }

        @NotNull
        public final Spacers copy(Paddings left, Paddings right, Paddings top, Paddings bottom, Paddings betweenButtons) {
            return new Spacers(left, right, top, bottom, betweenButtons);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Spacers)) {
                return false;
            }
            Spacers spacers = (Spacers) other;
            return this.left == spacers.left && this.right == spacers.right && this.top == spacers.top && this.bottom == spacers.bottom && this.betweenButtons == spacers.betweenButtons;
        }

        public final Paddings getBetweenButtons() {
            return this.betweenButtons;
        }

        public final Paddings getBottom() {
            return this.bottom;
        }

        public final Paddings getLeft() {
            return this.left;
        }

        public final Paddings getRight() {
            return this.right;
        }

        public final Paddings getTop() {
            return this.top;
        }

        public int hashCode() {
            Paddings paddings = this.left;
            int hashCode = (paddings == null ? 0 : paddings.hashCode()) * 31;
            Paddings paddings2 = this.right;
            int hashCode2 = (hashCode + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
            Paddings paddings3 = this.top;
            int hashCode3 = (hashCode2 + (paddings3 == null ? 0 : paddings3.hashCode())) * 31;
            Paddings paddings4 = this.bottom;
            int hashCode4 = (hashCode3 + (paddings4 == null ? 0 : paddings4.hashCode())) * 31;
            Paddings paddings5 = this.betweenButtons;
            return hashCode4 + (paddings5 != null ? paddings5.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Paddings paddings = this.left;
            Paddings paddings2 = this.right;
            Paddings paddings3 = this.top;
            Paddings paddings4 = this.bottom;
            Paddings paddings5 = this.betweenButtons;
            StringBuilder b11 = p.b("Spacers(left=", paddings, ", right=", paddings2, ", top=");
            Lh.a.e(b11, paddings3, ", bottom=", paddings4, ", betweenButtons=");
            return D40.b.b(b11, paddings5, ")");
        }
    }

    public FlexButtonsDTO(@NotNull List<ButtonV3DTO> buttons, Spacers spacers, Map<String, TokenizedTrackingInfo> map, ButtonsArrangement buttonsArrangement) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        this.buttons = buttons;
        this.spacers = spacers;
        this.trackingInfo = map;
        this.buttonsArrangement = buttonsArrangement;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlexButtonsDTO copy$default(FlexButtonsDTO flexButtonsDTO, List list, Spacers spacers, Map map, ButtonsArrangement buttonsArrangement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = flexButtonsDTO.buttons;
        }
        if ((i11 & 2) != 0) {
            spacers = flexButtonsDTO.spacers;
        }
        if ((i11 & 4) != 0) {
            map = flexButtonsDTO.trackingInfo;
        }
        if ((i11 & 8) != 0) {
            buttonsArrangement = flexButtonsDTO.buttonsArrangement;
        }
        return flexButtonsDTO.copy(list, spacers, map, buttonsArrangement);
    }

    @NotNull
    public final List<ButtonV3DTO> component1() {
        return this.buttons;
    }

    /* renamed from: component2, reason: from getter */
    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonsArrangement getButtonsArrangement() {
        return this.buttonsArrangement;
    }

    @NotNull
    public final FlexButtonsDTO copy(@NotNull List<ButtonV3DTO> buttons, Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo, ButtonsArrangement buttonsArrangement) {
        Intrinsics.checkNotNullParameter(buttons, "buttons");
        return new FlexButtonsDTO(buttons, spacers, trackingInfo, buttonsArrangement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlexButtonsDTO)) {
            return false;
        }
        FlexButtonsDTO flexButtonsDTO = (FlexButtonsDTO) other;
        return Intrinsics.d(this.buttons, flexButtonsDTO.buttons) && Intrinsics.d(this.spacers, flexButtonsDTO.spacers) && Intrinsics.d(this.trackingInfo, flexButtonsDTO.trackingInfo) && this.buttonsArrangement == flexButtonsDTO.buttonsArrangement;
    }

    @NotNull
    public final List<ButtonV3DTO> getButtons() {
        return this.buttons;
    }

    public final ButtonsArrangement getButtonsArrangement() {
        return this.buttonsArrangement;
    }

    public final Spacers getSpacers() {
        return this.spacers;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.buttons.hashCode() * 31;
        Spacers spacers = this.spacers;
        int hashCode2 = (hashCode + (spacers == null ? 0 : spacers.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        ButtonsArrangement buttonsArrangement = this.buttonsArrangement;
        return hashCode3 + (buttonsArrangement != null ? buttonsArrangement.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FlexButtonsDTO(buttons=" + this.buttons + ", spacers=" + this.spacers + ", trackingInfo=" + this.trackingInfo + ", buttonsArrangement=" + this.buttonsArrangement + ")";
    }
}
