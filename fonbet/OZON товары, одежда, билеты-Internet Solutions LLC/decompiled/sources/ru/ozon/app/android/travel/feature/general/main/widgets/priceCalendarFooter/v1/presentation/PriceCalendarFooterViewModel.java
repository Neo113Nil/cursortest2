package ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation;

import AA.c;
import AA.d;
import Bc.r;
import Xc.a;
import androidx.lifecycle.C5415f;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import io.reactivex.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import org.joda.time.format.b;
import ru.ozon.app.android.travel.calendar.view.vo.CalendarVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterApi;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.data.PriceCalendarFooterMapper;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0002'(B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001c\u0010#\u001a\n \"*\u0004\u0018\u00010!0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;", "api", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;)V", "", "", "params", "Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;", "input", "", "createRequestBody", "(Ljava/util/Map;Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;)Ljava/util/Map;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateVoResult;", "updateVoLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "vo", "", "initWith", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;)V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "performUpdateStateRequest", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/calendar/view/vo/CalendarVO;)V", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterApi;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterMapper;", "mapper", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/data/PriceCalendarFooterMapper;", "lastVo", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "Lorg/joda/time/format/b;", "kotlin.jvm.PlatformType", "dateFormatter", "Lorg/joda/time/format/b;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "UpdateVoResult", "UpdateState", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PriceCalendarFooterViewModel extends w0 {

    @NotNull
    private final PriceCalendarFooterApi api;
    private final b dateFormatter;
    private PriceCalendarFooterVO lastVo;

    @NotNull
    private final PriceCalendarFooterMapper mapper;

    @NotNull
    private final SingleLiveEvent<UpdateVoResult> updateVoLiveData;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateState;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateState {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ UpdateState[] $VALUES;
        public static final UpdateState SUCCESS = new UpdateState("SUCCESS", 0);
        public static final UpdateState ERROR = new UpdateState("ERROR", 1);

        private static final /* synthetic */ UpdateState[] $values() {
            return new UpdateState[]{SUCCESS, ERROR};
        }

        static {
            UpdateState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
        }

        private UpdateState(String str, int i11) {
        }

        public static UpdateState valueOf(String str) {
            return (UpdateState) Enum.valueOf(UpdateState.class, str);
        }

        public static UpdateState[] values() {
            return (UpdateState[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateVoResult;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "vo", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateState;", "state", "<init>", "(Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "getVo", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateState;", "getState", "()Lru/ozon/app/android/travel/feature/general/main/widgets/priceCalendarFooter/v1/presentation/PriceCalendarFooterViewModel$UpdateState;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateVoResult {

        @NotNull
        private final UpdateState state;

        @NotNull
        private final PriceCalendarFooterVO vo;

        public UpdateVoResult(@NotNull PriceCalendarFooterVO vo, @NotNull UpdateState state) {
            Intrinsics.checkNotNullParameter(vo, "vo");
            Intrinsics.checkNotNullParameter(state, "state");
            this.vo = vo;
            this.state = state;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateVoResult)) {
                return false;
            }
            UpdateVoResult updateVoResult = (UpdateVoResult) other;
            return Intrinsics.d(this.vo, updateVoResult.vo) && this.state == updateVoResult.state;
        }

        @NotNull
        public final UpdateState getState() {
            return this.state;
        }

        @NotNull
        public final PriceCalendarFooterVO getVo() {
            return this.vo;
        }

        public int hashCode() {
            return this.state.hashCode() + (this.vo.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateVoResult(vo=" + this.vo + ", state=" + this.state + ")";
        }
    }

    public PriceCalendarFooterViewModel(@NotNull PriceCalendarFooterApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.mapper = new PriceCalendarFooterMapper();
        this.dateFormatter = org.joda.time.format.a.b("yyyy-MM-dd");
        this.updateVoLiveData = new SingleLiveEvent<>();
    }

    private final Map<String, Object> createRequestBody(Map<String, String> params, CalendarVO input) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String h11 = input.getStartSelectedDate() != null ? this.dateFormatter.h(input.getStartSelectedDate()) : "";
        String h12 = input.getEndSelectedDate() != null ? this.dateFormatter.h(input.getEndSelectedDate()) : "";
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        linkedHashMap.put("startDate", h11);
        linkedHashMap.put("endDate", h12);
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PriceCalendarFooterVO performUpdateStateRequest$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (PriceCalendarFooterVO) function1.invoke(p02);
    }

    public final void initWith(@NotNull PriceCalendarFooterVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        this.lastVo = vo;
        SingleLiveEvent<UpdateVoResult> singleLiveEvent = this.updateVoLiveData;
        if (vo != null) {
            singleLiveEvent.setValue(new UpdateVoResult(vo, UpdateState.SUCCESS));
        } else {
            Intrinsics.n("lastVo");
            throw null;
        }
    }

    public final void performUpdateStateRequest(@NotNull AtomActionDTO action, @NotNull CalendarVO input) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(input, "input");
        C5415f.a(this).d();
        String link = action.getLink();
        if (link == null) {
            return;
        }
        Map<String, Object> createRequestBody = createRequestBody(action.getParams(), input);
        y<PriceCalendarFooterDTO> updateWidgetState = this.api.updateWidgetState(link, createRequestBody);
        c cVar = new c(new PriceCalendarFooterViewModel$performUpdateStateRequest$1(this, createRequestBody), 6);
        updateWidgetState.getClass();
        C5415f.a(this).a(new r(updateWidgetState, cVar).j(Mc.a.b()).g(C8125a.a()).h(new d(new PriceCalendarFooterViewModel$performUpdateStateRequest$2(this), 13), new Cw.c(new PriceCalendarFooterViewModel$performUpdateStateRequest$3(this), 16)));
    }

    @NotNull
    public final P<UpdateVoResult> updateVoLiveData() {
        return this.updateVoLiveData;
    }
}
