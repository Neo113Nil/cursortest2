package ru.ozon.app.android.travel.feature.general.common.widgets.timeoutAndAction.v2.presentation;

import E0.C2942q;
import Xc.a;
import Xc.b;
import g.C6594f;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u001f B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "state", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "Ljava/lang/String;", "getAsyncData", "State", "TimerMode", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TimeoutAndActionV2VO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJR\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R%\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;", "timerMode", "", "deadline", "pollingDelayMs", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "asyncParameters", "<init>", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;JJLru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)V", "copy", "(Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;JJLru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$State;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;", "getTimerMode", "()Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;", "J", "getDeadline", "()J", "getPollingDelayMs", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getAsyncParameters", "()Ljava/util/Map;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class State {
        private final AtomAction action;
        private final Map<String, Object> asyncParameters;
        private final long deadline;
        private final long pollingDelayMs;

        @NotNull
        private final TimerMode timerMode;

        public State(@NotNull TimerMode timerMode, long j11, long j12, AtomAction atomAction, Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(timerMode, "timerMode");
            this.timerMode = timerMode;
            this.deadline = j11;
            this.pollingDelayMs = j12;
            this.action = atomAction;
            this.asyncParameters = map;
        }

        public static /* synthetic */ State copy$default(State state, TimerMode timerMode, long j11, long j12, AtomAction atomAction, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                timerMode = state.timerMode;
            }
            if ((i11 & 2) != 0) {
                j11 = state.deadline;
            }
            if ((i11 & 4) != 0) {
                j12 = state.pollingDelayMs;
            }
            if ((i11 & 8) != 0) {
                atomAction = state.action;
            }
            if ((i11 & 16) != 0) {
                map = state.asyncParameters;
            }
            long j13 = j12;
            return state.copy(timerMode, j11, j13, atomAction, map);
        }

        @NotNull
        public final State copy(@NotNull TimerMode timerMode, long deadline, long pollingDelayMs, AtomAction action, Map<String, ? extends Object> asyncParameters) {
            Intrinsics.checkNotNullParameter(timerMode, "timerMode");
            return new State(timerMode, deadline, pollingDelayMs, action, asyncParameters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof State)) {
                return false;
            }
            State state = (State) other;
            return this.timerMode == state.timerMode && this.deadline == state.deadline && this.pollingDelayMs == state.pollingDelayMs && Intrinsics.d(this.action, state.action) && Intrinsics.d(this.asyncParameters, state.asyncParameters);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final Map<String, Object> getAsyncParameters() {
            return this.asyncParameters;
        }

        public final long getDeadline() {
            return this.deadline;
        }

        public final long getPollingDelayMs() {
            return this.pollingDelayMs;
        }

        @NotNull
        public final TimerMode getTimerMode() {
            return this.timerMode;
        }

        public int hashCode() {
            int a11 = Pk0.c.a(Pk0.c.a(this.timerMode.hashCode() * 31, 31, this.deadline), 31, this.pollingDelayMs);
            AtomAction atomAction = this.action;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            Map<String, Object> map = this.asyncParameters;
            return hashCode + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TimerMode timerMode = this.timerMode;
            long j11 = this.deadline;
            long j12 = this.pollingDelayMs;
            AtomAction atomAction = this.action;
            Map<String, Object> map = this.asyncParameters;
            StringBuilder sb2 = new StringBuilder("State(timerMode=");
            sb2.append(timerMode);
            sb2.append(", deadline=");
            sb2.append(j11);
            C2942q.f(sb2, ", pollingDelayMs=", j12, ", action=");
            sb2.append(atomAction);
            sb2.append(", asyncParameters=");
            sb2.append(map);
            sb2.append(")");
            return sb2.toString();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/timeoutAndAction/v2/presentation/TimeoutAndActionV2VO$TimerMode;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "START_IMMEDIATE", "POLLING", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimerMode {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TimerMode[] $VALUES;
        public static final TimerMode PENDING = new TimerMode("PENDING", 0);
        public static final TimerMode START_IMMEDIATE = new TimerMode("START_IMMEDIATE", 1);
        public static final TimerMode POLLING = new TimerMode("POLLING", 2);

        private static final /* synthetic */ TimerMode[] $values() {
            return new TimerMode[]{PENDING, START_IMMEDIATE, POLLING};
        }

        static {
            TimerMode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TimerMode(String str, int i11) {
        }

        public static TimerMode valueOf(String str) {
            return (TimerMode) Enum.valueOf(TimerMode.class, str);
        }

        public static TimerMode[] values() {
            return (TimerMode[]) $VALUES.clone();
        }
    }

    public TimeoutAndActionV2VO(long j11, @NotNull State state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.asyncData = str;
    }

    public static /* synthetic */ TimeoutAndActionV2VO copy$default(TimeoutAndActionV2VO timeoutAndActionV2VO, long j11, State state, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = timeoutAndActionV2VO.id;
        }
        if ((i11 & 2) != 0) {
            state = timeoutAndActionV2VO.state;
        }
        if ((i11 & 4) != 0) {
            str = timeoutAndActionV2VO.asyncData;
        }
        return timeoutAndActionV2VO.copy(j11, state, str);
    }

    @NotNull
    public final TimeoutAndActionV2VO copy(long id2, @NotNull State state, String asyncData) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new TimeoutAndActionV2VO(id2, state, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeoutAndActionV2VO)) {
            return false;
        }
        TimeoutAndActionV2VO timeoutAndActionV2VO = (TimeoutAndActionV2VO) other;
        return this.id == timeoutAndActionV2VO.id && Intrinsics.d(this.state, timeoutAndActionV2VO.state) && Intrinsics.d(this.asyncData, timeoutAndActionV2VO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
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
    public final State getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("TimeoutAndActionV2VO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }
}
