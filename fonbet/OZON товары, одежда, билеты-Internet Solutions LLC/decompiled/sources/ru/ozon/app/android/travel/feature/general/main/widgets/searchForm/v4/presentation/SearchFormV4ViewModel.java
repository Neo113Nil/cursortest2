package ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation;

import Ae.C2399j;
import Ae.E0;
import Xc.a;
import Xc.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.data.SearchFormV4DTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.presentation.SearchFormV4VO;
import ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnScreenRefreshCallbacks;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\"B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\u0004J\u0015\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/utils/returnScreenRefresh/ReturnScreenRefreshCallbacks;", "<init>", "()V", "", "refresh", "Lxe/M;", "getViewModelScope", "()Lxe/M;", "onRefreshData", "onStartTimer", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "newVO", "updateVoData", "(Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;)V", "viewObject", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "getViewObject", "()Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4VO$Content;", "setViewObject", "LAe/w0;", "_refreshEventFlow", "LAe/w0;", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel$TimerState;", "timerState", "Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel$TimerState;", "Lxe/B0;", "timerJob", "Lxe/B0;", "LAe/B0;", "getRefreshEventFlow", "()LAe/B0;", "refreshEventFlow", "TimerState", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchFormV4ViewModel extends w0 implements ReturnScreenRefreshCallbacks {
    private B0 timerJob;
    private SearchFormV4VO.Content viewObject;

    @NotNull
    private final Ae.w0<Unit> _refreshEventFlow = E0.b(0, 0, null, 7);

    @NotNull
    private TimerState timerState = TimerState.NOT_INITIATED;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/searchForm/v4/presentation/SearchFormV4ViewModel$TimerState;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_INITIATED", "STARTED", "STOPPED", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimerState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TimerState[] $VALUES;
        public static final TimerState NOT_INITIATED = new TimerState("NOT_INITIATED", 0);
        public static final TimerState STARTED = new TimerState("STARTED", 1);
        public static final TimerState STOPPED = new TimerState("STOPPED", 2);

        private static final /* synthetic */ TimerState[] $values() {
            return new TimerState[]{NOT_INITIATED, STARTED, STOPPED};
        }

        static {
            TimerState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TimerState(String str, int i11) {
        }

        public static TimerState valueOf(String str) {
            return (TimerState) Enum.valueOf(TimerState.class, str);
        }

        public static TimerState[] values() {
            return (TimerState[]) $VALUES.clone();
        }
    }

    private final void refresh() {
        if (this.timerState == TimerState.STOPPED) {
            C10727i.c(x0.a(this), null, null, new SearchFormV4ViewModel$refresh$1(this, null), 3);
        }
    }

    @NotNull
    public final Ae.B0<Unit> getRefreshEventFlow() {
        return C2399j.a(this._refreshEventFlow);
    }

    @Override // ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnScreenRefreshCallbacks
    @NotNull
    public M getViewModelScope() {
        return x0.a(this);
    }

    public final SearchFormV4VO.Content getViewObject() {
        return this.viewObject;
    }

    @Override // ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnScreenRefreshCallbacks
    public void onRefreshData() {
        SearchFormV4DTO.AsyncFetchConfig asyncFetchConfig;
        SearchFormV4VO.Content content = this.viewObject;
        if (((content == null || (asyncFetchConfig = content.getAsyncFetchConfig()) == null) ? null : asyncFetchConfig.getDelay()) != null) {
            refresh();
        }
    }

    @Override // ru.ozon.app.android.travel.utils.returnScreenRefresh.ReturnScreenRefreshCallbacks
    public void onStartTimer() {
        SearchFormV4DTO.AsyncFetchConfig asyncFetchConfig;
        Integer delay;
        int intValue;
        B0 b02 = this.timerJob;
        if (b02 != null) {
            b02.j(null);
        }
        SearchFormV4VO.Content content = this.viewObject;
        if (content == null || (asyncFetchConfig = content.getAsyncFetchConfig()) == null || (delay = asyncFetchConfig.getDelay()) == null || (intValue = delay.intValue()) <= 0) {
            return;
        }
        this.timerJob = C10727i.c(x0.a(this), null, null, new SearchFormV4ViewModel$onStartTimer$1(this, intValue, null), 3);
    }

    public final void updateVoData(@NotNull SearchFormV4VO.Content newVO) {
        Intrinsics.checkNotNullParameter(newVO, "newVO");
        this.viewObject = newVO;
    }
}
