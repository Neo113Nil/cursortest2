package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.data;

import T7.P;
import Xc.a;
import Xc.b;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0001$BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003JT\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u000bHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "", "timeSeconds", "", "mode", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO$TimerStartMode;", "pollingDelayMs", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "asyncParameters", "", "", "<init>", "(Ljava/lang/Integer;Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO$TimerStartMode;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "getTimeSeconds", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMode", "()Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO$TimerStartMode;", "getPollingDelayMs", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getAsyncParameters", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO$TimerStartMode;Ljava/lang/Integer;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO;", "equals", "", "other", "hashCode", "toString", "TimerStartMode", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TimeoutAndActionV2DTO {
    public static final int $stable = 8;
    private final AtomActionDTO action;
    private final Map<String, Object> asyncParameters;

    @EnumNullFallback
    @NotNull
    private final TimerStartMode mode;
    private final Integer pollingDelayMs;
    private final Integer timeSeconds;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/data/TimeoutAndActionV2DTO$TimerStartMode;", "", "<init>", "(Ljava/lang/String;I)V", "IMMEDIATE", "PENDING", "POLLING", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimerStartMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TimerStartMode[] $VALUES;

        @i(name = "IMMEDIATE")
        public static final TimerStartMode IMMEDIATE = new TimerStartMode("IMMEDIATE", 0);

        @i(name = "PENDING")
        public static final TimerStartMode PENDING = new TimerStartMode("PENDING", 1);

        @i(name = "POLLING")
        public static final TimerStartMode POLLING = new TimerStartMode("POLLING", 2);

        private static final /* synthetic */ TimerStartMode[] $values() {
            return new TimerStartMode[]{IMMEDIATE, PENDING, POLLING};
        }

        static {
            TimerStartMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TimerStartMode(String str, int i11) {
        }

        public static TimerStartMode valueOf(String str) {
            return (TimerStartMode) Enum.valueOf(TimerStartMode.class, str);
        }

        public static TimerStartMode[] values() {
            return (TimerStartMode[]) $VALUES.clone();
        }
    }

    public TimeoutAndActionV2DTO(Integer num, @NotNull TimerStartMode mode, Integer num2, AtomActionDTO atomActionDTO, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.timeSeconds = num;
        this.mode = mode;
        this.pollingDelayMs = num2;
        this.action = atomActionDTO;
        this.asyncParameters = map;
    }

    public static /* synthetic */ TimeoutAndActionV2DTO copy$default(TimeoutAndActionV2DTO timeoutAndActionV2DTO, Integer num, TimerStartMode timerStartMode, Integer num2, AtomActionDTO atomActionDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = timeoutAndActionV2DTO.timeSeconds;
        }
        if ((i11 & 2) != 0) {
            timerStartMode = timeoutAndActionV2DTO.mode;
        }
        if ((i11 & 4) != 0) {
            num2 = timeoutAndActionV2DTO.pollingDelayMs;
        }
        if ((i11 & 8) != 0) {
            atomActionDTO = timeoutAndActionV2DTO.action;
        }
        if ((i11 & 16) != 0) {
            map = timeoutAndActionV2DTO.asyncParameters;
        }
        Map map2 = map;
        Integer num3 = num2;
        return timeoutAndActionV2DTO.copy(num, timerStartMode, num3, atomActionDTO, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final Integer getTimeSeconds() {
        return this.timeSeconds;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TimerStartMode getMode() {
        return this.mode;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getPollingDelayMs() {
        return this.pollingDelayMs;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, Object> component5() {
        return this.asyncParameters;
    }

    @NotNull
    public final TimeoutAndActionV2DTO copy(Integer timeSeconds, @NotNull TimerStartMode mode, Integer pollingDelayMs, AtomActionDTO action, Map<String, ? extends Object> asyncParameters) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new TimeoutAndActionV2DTO(timeSeconds, mode, pollingDelayMs, action, asyncParameters);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutAndActionV2DTO)) {
            return false;
        }
        TimeoutAndActionV2DTO timeoutAndActionV2DTO = (TimeoutAndActionV2DTO) other;
        return Intrinsics.d(this.timeSeconds, timeoutAndActionV2DTO.timeSeconds) && this.mode == timeoutAndActionV2DTO.mode && Intrinsics.d(this.pollingDelayMs, timeoutAndActionV2DTO.pollingDelayMs) && Intrinsics.d(this.action, timeoutAndActionV2DTO.action) && Intrinsics.d(this.asyncParameters, timeoutAndActionV2DTO.asyncParameters);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final Map<String, Object> getAsyncParameters() {
        return this.asyncParameters;
    }

    @NotNull
    public final TimerStartMode getMode() {
        return this.mode;
    }

    public final Integer getPollingDelayMs() {
        return this.pollingDelayMs;
    }

    public final Integer getTimeSeconds() {
        return this.timeSeconds;
    }

    public int hashCode() {
        Integer num = this.timeSeconds;
        int hashCode = (this.mode.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        Integer num2 = this.pollingDelayMs;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.action;
        int hashCode3 = (hashCode2 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        Map<String, Object> map = this.asyncParameters;
        return hashCode3 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        Integer num = this.timeSeconds;
        TimerStartMode timerStartMode = this.mode;
        Integer num2 = this.pollingDelayMs;
        AtomActionDTO atomActionDTO = this.action;
        Map<String, Object> map = this.asyncParameters;
        StringBuilder sb2 = new StringBuilder("TimeoutAndActionV2DTO(timeSeconds=");
        sb2.append(num);
        sb2.append(", mode=");
        sb2.append(timerStartMode);
        sb2.append(", pollingDelayMs=");
        sb2.append(num2);
        sb2.append(", action=");
        sb2.append(atomActionDTO);
        sb2.append(", asyncParameters=");
        return P.f(sb2, map, ")");
    }

    public /* synthetic */ TimeoutAndActionV2DTO(Integer num, TimerStartMode timerStartMode, Integer num2, AtomActionDTO atomActionDTO, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i11 & 2) != 0 ? TimerStartMode.IMMEDIATE : timerStartMode, num2, atomActionDTO, map);
    }
}
