package ru.ozon.app.android.travel.feature.general.common.widgets.emptyState.v2.data;

import C.o0;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.emptyState.v2.EmptyStateV2DTO;
import ru.ozon.app.android.travel.molecules.dto.quickFiltersRowList.QuickFiltersRowListDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002$%B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO;", "", "emptyState", "Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "filtersBlock", "Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;", "appearance", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$WidgetAppearance;", "buttonsPosition", "Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$ButtonsPosition;", "backgroundColor", "", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$WidgetAppearance;Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$ButtonsPosition;Ljava/lang/String;)V", "getEmptyState", "()Lru/ozon/app/android/travel/molecules/dto/emptyState/v2/EmptyStateV2DTO;", "getFiltersBlock", "()Lru/ozon/app/android/travel/molecules/dto/quickFiltersRowList/QuickFiltersRowListDTO;", "getAppearance", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$WidgetAppearance;", "getButtonsPosition", "()Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$ButtonsPosition;", "getBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "WidgetAppearance", "ButtonsPosition", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class EmptyStateV2WidgetDTO {
    public static final int $stable = 8;

    @EnumNullFallback
    @NotNull
    private final WidgetAppearance appearance;
    private final String backgroundColor;

    @EnumNullFallback
    private final ButtonsPosition buttonsPosition;

    @NotNull
    private final EmptyStateV2DTO emptyState;
    private final QuickFiltersRowListDTO filtersBlock;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$ButtonsPosition;", "", "<init>", "(Ljava/lang/String;I)V", "AT_BOTTOM", "UNDER_TEXT", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ButtonsPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ButtonsPosition[] $VALUES;

        @i(name = "AT_BOTTOM")
        public static final ButtonsPosition AT_BOTTOM = new ButtonsPosition("AT_BOTTOM", 0);

        @i(name = "UNDER_TEXT")
        public static final ButtonsPosition UNDER_TEXT = new ButtonsPosition("UNDER_TEXT", 1);

        private static final /* synthetic */ ButtonsPosition[] $values() {
            return new ButtonsPosition[]{AT_BOTTOM, UNDER_TEXT};
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
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/emptyState/v2/data/EmptyStateV2WidgetDTO$WidgetAppearance;", "", "<init>", "(Ljava/lang/String;I)V", "VIEW_APPEARANCE_FULL", "VIEW_APPEARANCE_WRAP", "VIEW_APPEARANCE_OVERLAY", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WidgetAppearance {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ WidgetAppearance[] $VALUES;

        @i(name = "VIEW_APPEARANCE_FULL")
        public static final WidgetAppearance VIEW_APPEARANCE_FULL = new WidgetAppearance("VIEW_APPEARANCE_FULL", 0);

        @i(name = "VIEW_APPEARANCE_WRAP")
        public static final WidgetAppearance VIEW_APPEARANCE_WRAP = new WidgetAppearance("VIEW_APPEARANCE_WRAP", 1);

        @i(name = "VIEW_APPEARANCE_OVERLAY")
        public static final WidgetAppearance VIEW_APPEARANCE_OVERLAY = new WidgetAppearance("VIEW_APPEARANCE_OVERLAY", 2);

        private static final /* synthetic */ WidgetAppearance[] $values() {
            return new WidgetAppearance[]{VIEW_APPEARANCE_FULL, VIEW_APPEARANCE_WRAP, VIEW_APPEARANCE_OVERLAY};
        }

        static {
            WidgetAppearance[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private WidgetAppearance(String str, int i11) {
        }

        public static WidgetAppearance valueOf(String str) {
            return (WidgetAppearance) Enum.valueOf(WidgetAppearance.class, str);
        }

        public static WidgetAppearance[] values() {
            return (WidgetAppearance[]) $VALUES.clone();
        }
    }

    public EmptyStateV2WidgetDTO(@NotNull EmptyStateV2DTO emptyState, QuickFiltersRowListDTO quickFiltersRowListDTO, @NotNull WidgetAppearance appearance, ButtonsPosition buttonsPosition, String str) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        this.emptyState = emptyState;
        this.filtersBlock = quickFiltersRowListDTO;
        this.appearance = appearance;
        this.buttonsPosition = buttonsPosition;
        this.backgroundColor = str;
    }

    public static /* synthetic */ EmptyStateV2WidgetDTO copy$default(EmptyStateV2WidgetDTO emptyStateV2WidgetDTO, EmptyStateV2DTO emptyStateV2DTO, QuickFiltersRowListDTO quickFiltersRowListDTO, WidgetAppearance widgetAppearance, ButtonsPosition buttonsPosition, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            emptyStateV2DTO = emptyStateV2WidgetDTO.emptyState;
        }
        if ((i11 & 2) != 0) {
            quickFiltersRowListDTO = emptyStateV2WidgetDTO.filtersBlock;
        }
        if ((i11 & 4) != 0) {
            widgetAppearance = emptyStateV2WidgetDTO.appearance;
        }
        if ((i11 & 8) != 0) {
            buttonsPosition = emptyStateV2WidgetDTO.buttonsPosition;
        }
        if ((i11 & 16) != 0) {
            str = emptyStateV2WidgetDTO.backgroundColor;
        }
        String str2 = str;
        WidgetAppearance widgetAppearance2 = widgetAppearance;
        return emptyStateV2WidgetDTO.copy(emptyStateV2DTO, quickFiltersRowListDTO, widgetAppearance2, buttonsPosition, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final EmptyStateV2DTO getEmptyState() {
        return this.emptyState;
    }

    /* renamed from: component2, reason: from getter */
    public final QuickFiltersRowListDTO getFiltersBlock() {
        return this.filtersBlock;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final WidgetAppearance getAppearance() {
        return this.appearance;
    }

    /* renamed from: component4, reason: from getter */
    public final ButtonsPosition getButtonsPosition() {
        return this.buttonsPosition;
    }

    /* renamed from: component5, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final EmptyStateV2WidgetDTO copy(@NotNull EmptyStateV2DTO emptyState, QuickFiltersRowListDTO filtersBlock, @NotNull WidgetAppearance appearance, ButtonsPosition buttonsPosition, String backgroundColor) {
        Intrinsics.checkNotNullParameter(emptyState, "emptyState");
        Intrinsics.checkNotNullParameter(appearance, "appearance");
        return new EmptyStateV2WidgetDTO(emptyState, filtersBlock, appearance, buttonsPosition, backgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2WidgetDTO)) {
            return false;
        }
        EmptyStateV2WidgetDTO emptyStateV2WidgetDTO = (EmptyStateV2WidgetDTO) other;
        return Intrinsics.d(this.emptyState, emptyStateV2WidgetDTO.emptyState) && Intrinsics.d(this.filtersBlock, emptyStateV2WidgetDTO.filtersBlock) && this.appearance == emptyStateV2WidgetDTO.appearance && this.buttonsPosition == emptyStateV2WidgetDTO.buttonsPosition && Intrinsics.d(this.backgroundColor, emptyStateV2WidgetDTO.backgroundColor);
    }

    @NotNull
    public final WidgetAppearance getAppearance() {
        return this.appearance;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final ButtonsPosition getButtonsPosition() {
        return this.buttonsPosition;
    }

    @NotNull
    public final EmptyStateV2DTO getEmptyState() {
        return this.emptyState;
    }

    public final QuickFiltersRowListDTO getFiltersBlock() {
        return this.filtersBlock;
    }

    public int hashCode() {
        int hashCode = this.emptyState.hashCode() * 31;
        QuickFiltersRowListDTO quickFiltersRowListDTO = this.filtersBlock;
        int hashCode2 = (this.appearance.hashCode() + ((hashCode + (quickFiltersRowListDTO == null ? 0 : quickFiltersRowListDTO.hashCode())) * 31)) * 31;
        ButtonsPosition buttonsPosition = this.buttonsPosition;
        int hashCode3 = (hashCode2 + (buttonsPosition == null ? 0 : buttonsPosition.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        EmptyStateV2DTO emptyStateV2DTO = this.emptyState;
        QuickFiltersRowListDTO quickFiltersRowListDTO = this.filtersBlock;
        WidgetAppearance widgetAppearance = this.appearance;
        ButtonsPosition buttonsPosition = this.buttonsPosition;
        String str = this.backgroundColor;
        StringBuilder sb2 = new StringBuilder("EmptyStateV2WidgetDTO(emptyState=");
        sb2.append(emptyStateV2DTO);
        sb2.append(", filtersBlock=");
        sb2.append(quickFiltersRowListDTO);
        sb2.append(", appearance=");
        sb2.append(widgetAppearance);
        sb2.append(", buttonsPosition=");
        sb2.append(buttonsPosition);
        sb2.append(", backgroundColor=");
        return o0.c(sb2, str, ")");
    }

    public /* synthetic */ EmptyStateV2WidgetDTO(EmptyStateV2DTO emptyStateV2DTO, QuickFiltersRowListDTO quickFiltersRowListDTO, WidgetAppearance widgetAppearance, ButtonsPosition buttonsPosition, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(emptyStateV2DTO, quickFiltersRowListDTO, (i11 & 4) != 0 ? WidgetAppearance.VIEW_APPEARANCE_FULL : widgetAppearance, buttonsPosition, str);
    }
}
