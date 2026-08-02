package ru.ozon.app.android.travel.feature.general.common.widgets.filtersButtonWithCounter.presentation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelFiltersButton.TravelFiltersButtonVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u001c\u001dB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;)Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "FiltersButtonWithCounterState", "CounterPosition", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FiltersButtonWithCounterVO implements c {
    public static final int $stable = TravelFiltersButtonVO.$stable | AsyncActionVO.$stable;
    private final long id;

    @NotNull
    private final FiltersButtonWithCounterState state;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "", "Right", "RightTop", "RightTopOverlay", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition$Right;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition$RightTop;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition$RightTopOverlay;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CounterPosition {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition$Right;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Right implements CounterPosition {

            @NotNull
            public static final Right INSTANCE = new Right();

            private Right() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Right);
            }

            public int hashCode() {
                return -524042037;
            }

            @NotNull
            public String toString() {
                return "Right";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition$RightTop;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RightTop implements CounterPosition {

            @NotNull
            public static final RightTop INSTANCE = new RightTop();

            private RightTop() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RightTop);
            }

            public int hashCode() {
                return 469880970;
            }

            @NotNull
            public String toString() {
                return "RightTop";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition$RightTopOverlay;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RightTopOverlay implements CounterPosition {

            @NotNull
            public static final RightTopOverlay INSTANCE = new RightTopOverlay();

            private RightTopOverlay() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RightTopOverlay);
            }

            public int hashCode() {
                return -1495057306;
            }

            @NotNull
            public String toString() {
                return "RightTopOverlay";
            }
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ>\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010\u000f¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/HasAsyncAction;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "asyncAction", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "button", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "counterPosition", "", "backgroundColor", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;Ljava/lang/String;)V", "copy", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$FiltersButtonWithCounterState;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "getAsyncAction", "()Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "getButton", "()Lru/ozon/app/android/travel/molecules/view/travelFiltersButton/TravelFiltersButtonVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "getCounterPosition", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filtersButtonWithCounter/presentation/FiltersButtonWithCounterVO$CounterPosition;", "Ljava/lang/String;", "getBackgroundColor", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FiltersButtonWithCounterState implements HasAsyncAction {
        public static final int $stable = TravelFiltersButtonVO.$stable | AsyncActionVO.$stable;
        private final AsyncActionVO asyncAction;
        private final String backgroundColor;

        @NotNull
        private final TravelFiltersButtonVO button;
        private final CounterPosition counterPosition;

        public FiltersButtonWithCounterState(AsyncActionVO asyncActionVO, @NotNull TravelFiltersButtonVO button, CounterPosition counterPosition, String str) {
            Intrinsics.checkNotNullParameter(button, "button");
            this.asyncAction = asyncActionVO;
            this.button = button;
            this.counterPosition = counterPosition;
            this.backgroundColor = str;
        }

        public static /* synthetic */ FiltersButtonWithCounterState copy$default(FiltersButtonWithCounterState filtersButtonWithCounterState, AsyncActionVO asyncActionVO, TravelFiltersButtonVO travelFiltersButtonVO, CounterPosition counterPosition, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                asyncActionVO = filtersButtonWithCounterState.asyncAction;
            }
            if ((i11 & 2) != 0) {
                travelFiltersButtonVO = filtersButtonWithCounterState.button;
            }
            if ((i11 & 4) != 0) {
                counterPosition = filtersButtonWithCounterState.counterPosition;
            }
            if ((i11 & 8) != 0) {
                str = filtersButtonWithCounterState.backgroundColor;
            }
            return filtersButtonWithCounterState.copy(asyncActionVO, travelFiltersButtonVO, counterPosition, str);
        }

        @NotNull
        public final FiltersButtonWithCounterState copy(AsyncActionVO asyncAction, @NotNull TravelFiltersButtonVO button, CounterPosition counterPosition, String backgroundColor) {
            Intrinsics.checkNotNullParameter(button, "button");
            return new FiltersButtonWithCounterState(asyncAction, button, counterPosition, backgroundColor);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FiltersButtonWithCounterState)) {
                return false;
            }
            FiltersButtonWithCounterState filtersButtonWithCounterState = (FiltersButtonWithCounterState) other;
            return Intrinsics.d(this.asyncAction, filtersButtonWithCounterState.asyncAction) && Intrinsics.d(this.button, filtersButtonWithCounterState.button) && Intrinsics.d(this.counterPosition, filtersButtonWithCounterState.counterPosition) && Intrinsics.d(this.backgroundColor, filtersButtonWithCounterState.backgroundColor);
        }

        @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction
        public AsyncActionVO getAsyncAction() {
            return this.asyncAction;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final TravelFiltersButtonVO getButton() {
            return this.button;
        }

        public final CounterPosition getCounterPosition() {
            return this.counterPosition;
        }

        public int hashCode() {
            AsyncActionVO asyncActionVO = this.asyncAction;
            int hashCode = (this.button.hashCode() + ((asyncActionVO == null ? 0 : asyncActionVO.hashCode()) * 31)) * 31;
            CounterPosition counterPosition = this.counterPosition;
            int hashCode2 = (hashCode + (counterPosition == null ? 0 : counterPosition.hashCode())) * 31;
            String str = this.backgroundColor;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FiltersButtonWithCounterState(asyncAction=" + this.asyncAction + ", button=" + this.button + ", counterPosition=" + this.counterPosition + ", backgroundColor=" + this.backgroundColor + ")";
        }
    }

    public FiltersButtonWithCounterVO(long j11, @NotNull FiltersButtonWithCounterState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ FiltersButtonWithCounterVO copy$default(FiltersButtonWithCounterVO filtersButtonWithCounterVO, long j11, FiltersButtonWithCounterState filtersButtonWithCounterState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = filtersButtonWithCounterVO.id;
        }
        if ((i11 & 2) != 0) {
            filtersButtonWithCounterState = filtersButtonWithCounterVO.state;
        }
        return filtersButtonWithCounterVO.copy(j11, filtersButtonWithCounterState);
    }

    @NotNull
    public final FiltersButtonWithCounterVO copy(long id2, @NotNull FiltersButtonWithCounterState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new FiltersButtonWithCounterVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiltersButtonWithCounterVO)) {
            return false;
        }
        FiltersButtonWithCounterVO filtersButtonWithCounterVO = (FiltersButtonWithCounterVO) other;
        return this.id == filtersButtonWithCounterVO.id && Intrinsics.d(this.state, filtersButtonWithCounterVO.state);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final FiltersButtonWithCounterState getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.state.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "FiltersButtonWithCounterVO(id=" + this.id + ", state=" + this.state + ")";
    }
}
