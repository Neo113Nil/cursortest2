package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v1.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v1.EmptyStateDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u001b\u001cB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO;", "", "emptyState", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "buttonsPosition", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ButtonsPosition;", "appearance", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ViewAppearance;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ButtonsPosition;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ViewAppearance;)V", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v1/EmptyStateDTO;", "getButtonsPosition", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ButtonsPosition;", "getAppearance", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ViewAppearance;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ViewAppearance", "ButtonsPosition", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateWidgetDTO {
    public static final int $stable = 8;

    @NotNull
    private final ViewAppearance appearance;
    private final ButtonsPosition buttonsPosition;

    @NotNull
    private final EmptyStateDTO emptyState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ButtonsPosition;", "", "<init>", "(Ljava/lang/String;I)V", "AT_BOTTOM", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsPosition[] $VALUES;

        @i(name = "AT_BOTTOM")
        public static final ButtonsPosition AT_BOTTOM = new ButtonsPosition("AT_BOTTOM", 0);

        private static final /* synthetic */ ButtonsPosition[] $values() {
            return new ButtonsPosition[]{AT_BOTTOM};
        }

        static {
            ButtonsPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ButtonsPosition(String str, int i11) {
        }

        public static ButtonsPosition valueOf(String str) {
            return (ButtonsPosition) Enum.valueOf(ButtonsPosition.class, str);
        }

        public static ButtonsPosition[] values() {
            return (ButtonsPosition[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v1/data/EmptyStateWidgetDTO$ViewAppearance;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_APPEARANCE_FULL", "VIEW_APPEARANCE_WRAP", "VIEW_APPEARANCE_OVERLAY", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ViewAppearance {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ViewAppearance[] $VALUES;

        @i(name = "VIEW_APPEARANCE_FULL")
        public static final ViewAppearance VIEW_APPEARANCE_FULL = new ViewAppearance("VIEW_APPEARANCE_FULL", 0);

        @i(name = "VIEW_APPEARANCE_WRAP")
        public static final ViewAppearance VIEW_APPEARANCE_WRAP = new ViewAppearance("VIEW_APPEARANCE_WRAP", 1);

        @i(name = "VIEW_APPEARANCE_OVERLAY")
        public static final ViewAppearance VIEW_APPEARANCE_OVERLAY = new ViewAppearance("VIEW_APPEARANCE_OVERLAY", 2);

        private static final /* synthetic */ ViewAppearance[] $values() {
            return new ViewAppearance[]{VIEW_APPEARANCE_FULL, VIEW_APPEARANCE_WRAP, VIEW_APPEARANCE_OVERLAY};
        }

        static {
            ViewAppearance[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ViewAppearance(String str, int i11) {
        }

        public static ViewAppearance valueOf(String str) {
            return (ViewAppearance) Enum.valueOf(ViewAppearance.class, str);
        }

        public static ViewAppearance[] values() {
            return (ViewAppearance[]) $VALUES.clone();
        }
    }

    public EmptyStateWidgetDTO(@NotNull EmptyStateDTO emptyState, ButtonsPosition buttonsPosition, @NotNull ViewAppearance appearance) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.emptyState = emptyState;
        this.buttonsPosition = buttonsPosition;
        this.appearance = appearance;
    }

    public static /* synthetic */ EmptyStateWidgetDTO copy$default(EmptyStateWidgetDTO emptyStateWidgetDTO, EmptyStateDTO emptyStateDTO, ButtonsPosition buttonsPosition, ViewAppearance viewAppearance, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            emptyStateDTO = emptyStateWidgetDTO.emptyState;
        }
        if ((i11 & 2) != 0) {
            buttonsPosition = emptyStateWidgetDTO.buttonsPosition;
        }
        if ((i11 & 4) != 0) {
            viewAppearance = emptyStateWidgetDTO.appearance;
        }
        return emptyStateWidgetDTO.copy(emptyStateDTO, buttonsPosition, viewAppearance);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    /* renamed from: component2, reason: from getter */
    public final ButtonsPosition getButtonsPosition() {
        return this.buttonsPosition;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ViewAppearance getAppearance() {
        return this.appearance;
    }

    @NotNull
    public final EmptyStateWidgetDTO copy(@NotNull EmptyStateDTO emptyState, ButtonsPosition buttonsPosition, @NotNull ViewAppearance appearance) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        return new EmptyStateWidgetDTO(emptyState, buttonsPosition, appearance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateWidgetDTO)) {
            return false;
        }
        EmptyStateWidgetDTO emptyStateWidgetDTO = (EmptyStateWidgetDTO) other;
        return Intrinsics.d(this.emptyState, emptyStateWidgetDTO.emptyState) && this.buttonsPosition == emptyStateWidgetDTO.buttonsPosition && this.appearance == emptyStateWidgetDTO.appearance;
    }

    @NotNull
    public final ViewAppearance getAppearance() {
        return this.appearance;
    }

    public final ButtonsPosition getButtonsPosition() {
        return this.buttonsPosition;
    }

    @NotNull
    public final EmptyStateDTO getEmptyState() {
        return this.emptyState;
    }

    public int hashCode() {
        int hashCode = this.emptyState.hashCode() * 31;
        ButtonsPosition buttonsPosition = this.buttonsPosition;
        return this.appearance.hashCode() + ((hashCode + (buttonsPosition == null ? 0 : buttonsPosition.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "EmptyStateWidgetDTO(emptyState=" + this.emptyState + ", buttonsPosition=" + this.buttonsPosition + ", appearance=" + this.appearance + ")";
    }

    public /* synthetic */ EmptyStateWidgetDTO(EmptyStateDTO emptyStateDTO, ButtonsPosition buttonsPosition, ViewAppearance viewAppearance, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(emptyStateDTO, buttonsPosition, (i11 & 4) != 0 ? ViewAppearance.VIEW_APPEARANCE_FULL : viewAppearance);
    }
}
