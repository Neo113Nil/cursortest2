package ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.dto.asyncAction.AsyncActionDTO;
import ru.ozon.app.android.travel.molecules.dto.travelFiltersButton.TravelFiltersButtonDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO;", "", "button", "Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "counterPosition", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO$CounterPosition;", "backgroundColor", "", "asyncBehavior", "Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO$CounterPosition;Ljava/lang/String;Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;)V", "getButton", "()Lru/ozon/app/android/travel/molecules/dto/travelFiltersButton/TravelFiltersButtonDTO;", "getCounterPosition", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO$CounterPosition;", "getBackgroundColor", "()Ljava/lang/String;", "getAsyncBehavior", "()Lru/ozon/app/android/travel/molecules/dto/asyncAction/AsyncActionDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "CounterPosition", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FiltersButtonWithCounterDTO {
    public static final int $stable = 8;
    private final AsyncActionDTO asyncBehavior;
    private final String backgroundColor;

    @NotNull
    private final TravelFiltersButtonDTO button;
    private final CounterPosition counterPosition;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/data/FiltersButtonWithCounterDTO$CounterPosition;", "", "<init>", "(Ljava/lang/String;I)V", "RIGHT", "RIGHT_TOP", "RIGHT_TOP_OVERLAY", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CounterPosition {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ CounterPosition[] $VALUES;

        @i(name = "RIGHT")
        public static final CounterPosition RIGHT = new CounterPosition("RIGHT", 0);

        @i(name = "RIGHT_TOP")
        public static final CounterPosition RIGHT_TOP = new CounterPosition("RIGHT_TOP", 1);

        @i(name = "RIGHT_TOP_OVERLAY")
        public static final CounterPosition RIGHT_TOP_OVERLAY = new CounterPosition("RIGHT_TOP_OVERLAY", 2);

        private static final /* synthetic */ CounterPosition[] $values() {
            return new CounterPosition[]{RIGHT, RIGHT_TOP, RIGHT_TOP_OVERLAY};
        }

        static {
            CounterPosition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private CounterPosition(String str, int i11) {
        }

        public static CounterPosition valueOf(String str) {
            return (CounterPosition) Enum.valueOf(CounterPosition.class, str);
        }

        public static CounterPosition[] values() {
            return (CounterPosition[]) $VALUES.clone();
        }
    }

    public FiltersButtonWithCounterDTO(@NotNull TravelFiltersButtonDTO button, CounterPosition counterPosition, String str, AsyncActionDTO asyncActionDTO) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.counterPosition = counterPosition;
        this.backgroundColor = str;
        this.asyncBehavior = asyncActionDTO;
    }

    public static /* synthetic */ FiltersButtonWithCounterDTO copy$default(FiltersButtonWithCounterDTO filtersButtonWithCounterDTO, TravelFiltersButtonDTO travelFiltersButtonDTO, CounterPosition counterPosition, String str, AsyncActionDTO asyncActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            travelFiltersButtonDTO = filtersButtonWithCounterDTO.button;
        }
        if ((i11 & 2) != 0) {
            counterPosition = filtersButtonWithCounterDTO.counterPosition;
        }
        if ((i11 & 4) != 0) {
            str = filtersButtonWithCounterDTO.backgroundColor;
        }
        if ((i11 & 8) != 0) {
            asyncActionDTO = filtersButtonWithCounterDTO.asyncBehavior;
        }
        return filtersButtonWithCounterDTO.copy(travelFiltersButtonDTO, counterPosition, str, asyncActionDTO);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TravelFiltersButtonDTO getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final CounterPosition getCounterPosition() {
        return this.counterPosition;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component4, reason: from getter */
    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    @NotNull
    public final FiltersButtonWithCounterDTO copy(@NotNull TravelFiltersButtonDTO button, CounterPosition counterPosition, String backgroundColor, AsyncActionDTO asyncBehavior) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new FiltersButtonWithCounterDTO(button, counterPosition, backgroundColor, asyncBehavior);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersButtonWithCounterDTO)) {
            return false;
        }
        FiltersButtonWithCounterDTO filtersButtonWithCounterDTO = (FiltersButtonWithCounterDTO) other;
        return Intrinsics.d(this.button, filtersButtonWithCounterDTO.button) && this.counterPosition == filtersButtonWithCounterDTO.counterPosition && Intrinsics.d(this.backgroundColor, filtersButtonWithCounterDTO.backgroundColor) && Intrinsics.d(this.asyncBehavior, filtersButtonWithCounterDTO.asyncBehavior);
    }

    public final AsyncActionDTO getAsyncBehavior() {
        return this.asyncBehavior;
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final TravelFiltersButtonDTO getButton() {
        return this.button;
    }

    public final CounterPosition getCounterPosition() {
        return this.counterPosition;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        CounterPosition counterPosition = this.counterPosition;
        int hashCode2 = (hashCode + (counterPosition == null ? 0 : counterPosition.hashCode())) * 31;
        String str = this.backgroundColor;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        AsyncActionDTO asyncActionDTO = this.asyncBehavior;
        return hashCode3 + (asyncActionDTO != null ? asyncActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FiltersButtonWithCounterDTO(button=" + this.button + ", counterPosition=" + this.counterPosition + ", backgroundColor=" + this.backgroundColor + ", asyncBehavior=" + this.asyncBehavior + ")";
    }
}
