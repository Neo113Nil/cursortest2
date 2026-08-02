package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7738u;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data.TimeoutAndActionV2DTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation.TimeoutAndActionV2VO;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.app.android.travel.utils.extensions.DateExtensionsKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007B\u0007¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\b*\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u0012R\u0018\u0010\u001f\u001a\u00020\u000b*\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u00020!*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "<init>", "()V", "", "id", "", "asyncData", "toVo", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;JLjava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "map", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;", "mapTimerMode", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "Lkotlin/Long$Companion;", "getZero", "(Lkotlin/jvm/internal/u;)J", "zero", "Lkotlin/Int$Companion;", "", "(Lkotlin/jvm/internal/r;)I", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TimeoutAndActionV2Mapper implements Function2<TimeoutAndActionV2DTO, d, List<? extends TimeoutAndActionV2VO>>, AsyncWidgetStateMapper<TimeoutAndActionV2DTO, TimeoutAndActionV2VO.State> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimeoutAndActionV2DTO.TimerStartMode.values().length];
            try {
                iArr[TimeoutAndActionV2DTO.TimerStartMode.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeoutAndActionV2DTO.TimerStartMode.PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeoutAndActionV2DTO.TimerStartMode.POLLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getZero(r rVar) {
        return 0;
    }

    private final TimeoutAndActionV2VO.State map(TimeoutAndActionV2DTO timeoutAndActionV2DTO) {
        TimeoutAndActionV2VO.TimerMode mapTimerMode = mapTimerMode(timeoutAndActionV2DTO);
        Integer timeSeconds = timeoutAndActionV2DTO.getTimeSeconds();
        long timestamp = DateExtensionsKt.toTimestamp(timeSeconds != null ? timeSeconds.intValue() : getZero(r.f71817a));
        long intValue = timeoutAndActionV2DTO.getPollingDelayMs() != null ? r4.intValue() : getZero(C7738u.f71818a);
        AtomActionDTO action = timeoutAndActionV2DTO.getAction();
        return new TimeoutAndActionV2VO.State(mapTimerMode, timestamp, intValue, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null, timeoutAndActionV2DTO.getAsyncParameters());
    }

    private final TimeoutAndActionV2VO.TimerMode mapTimerMode(TimeoutAndActionV2DTO timeoutAndActionV2DTO) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[timeoutAndActionV2DTO.getMode().ordinal()];
        if (i11 == 1) {
            return TimeoutAndActionV2VO.TimerMode.START_IMMEDIATE;
        }
        if (i11 == 2) {
            return TimeoutAndActionV2VO.TimerMode.PENDING;
        }
        if (i11 == 3) {
            return TimeoutAndActionV2VO.TimerMode.POLLING;
        }
        throw new o();
    }

    private final TimeoutAndActionV2VO toVo(TimeoutAndActionV2DTO timeoutAndActionV2DTO, long j11, String str) {
        return new TimeoutAndActionV2VO(j11, map(timeoutAndActionV2DTO), str);
    }

    private final long getZero(C7738u c7738u) {
        return 0L;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TimeoutAndActionV2VO> invoke(@NotNull TimeoutAndActionV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d().hashCode(), widgetInfo.c().a()));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public TimeoutAndActionV2VO.State mapAsyncState(@NotNull TimeoutAndActionV2DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return map(state);
    }
}
