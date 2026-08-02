package ru.ozon.app.android.travel.utils.timerFlow;

import Ae.C;
import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import C.C2702w;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import Xc.a;
import Xc.b;
import androidx.recyclerview.widget.LinearLayoutManager;
import ed.InterfaceC6346b;
import java.time.Duration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import xe.E0;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0004&'()B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\u0011\u001a\u00020\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0016\u001a\u00020\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0082@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\tH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J9\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0!2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow;", "", "T", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;", "elapsedTimeProvider", "<init>", "(Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;)V", "LAe/i;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "", "startTimestamp", "endTimestamp", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerFormatter;", "formatter", "", "startTimer", "(LAe/i;JJLru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerFormatter;Lkotlin/coroutines/d;)Ljava/lang/Object;", "millis", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "timerProgress", "emitTimeRunning", "(LAe/i;JLru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerFormatter;Lkotlin/coroutines/d;)Ljava/lang/Object;", "emitTimeExpired", "(LAe/i;Lkotlin/coroutines/d;)Ljava/lang/Object;", "startTime", "endTime", "computeTimerProgress", "(JJ)Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "", "invalidTimeRangeError", "(JJ)Ljava/lang/Void;", "LAe/h;", "getTimer", "(JJLru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerFormatter;)LAe/h;", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;", "Companion", "State", "TimerFormatter", "TimerProgress", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimerFlow<T> {

    @NotNull
    private final CoroutineDispatcherProvider dispatcherProvider;

    @NotNull
    private final ElapsedTimeProvider elapsedTimeProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$Companion;", "", "<init>", "()V", "MILLIS_IN_SECOND", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002:\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "T", "", "Running", "Expired", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State$Expired;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State$Running;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State<T> {

        @InterfaceC6346b
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State$Expired;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "timerProgress", "constructor-impl", "(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;)Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "", "toString-impl", "(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;)I", "hashCode", "", "other", "", "equals-impl", "(Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;Ljava/lang/Object;)Z", "equals", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "getTimerProgress", "()Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Expired implements State {

            @NotNull
            private final TimerProgress timerProgress;

            private /* synthetic */ Expired(TimerProgress timerProgress) {
                this.timerProgress = timerProgress;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Expired m1450boximpl(TimerProgress timerProgress) {
                return new Expired(timerProgress);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static TimerProgress m1451constructorimpl(@NotNull TimerProgress timerProgress) {
                Intrinsics.checkNotNullParameter(timerProgress, "timerProgress");
                return timerProgress;
            }

            /* renamed from: constructor-impl$default, reason: not valid java name */
            public static /* synthetic */ TimerProgress m1452constructorimpl$default(TimerProgress timerProgress, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                if ((i11 & 1) != 0) {
                    timerProgress = TimerProgress.AFTER;
                }
                return m1451constructorimpl(timerProgress);
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1453equalsimpl(TimerProgress timerProgress, Object obj) {
                return (obj instanceof Expired) && timerProgress == ((Expired) obj).getTimerProgress();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1454hashCodeimpl(TimerProgress timerProgress) {
                return timerProgress.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1455toStringimpl(TimerProgress timerProgress) {
                return "Expired(timerProgress=" + timerProgress + ")";
            }

            public boolean equals(Object obj) {
                return m1453equalsimpl(this.timerProgress, obj);
            }

            public int hashCode() {
                return m1454hashCodeimpl(this.timerProgress);
            }

            public String toString() {
                return m1455toStringimpl(this.timerProgress);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ TimerProgress getTimerProgress() {
                return this.timerProgress;
            }
        }

        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000*\n\b\u0002\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00020\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State$Running;", "", "T", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$State;", "formatedTime", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "timerProgress", "<init>", "(Ljava/lang/Object;Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getFormatedTime", "()Ljava/lang/Object;", "Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "getTimerProgress", "()Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Running<T> implements State<T> {

            @NotNull
            private final T formatedTime;

            @NotNull
            private final TimerProgress timerProgress;

            public Running(@NotNull T formatedTime, @NotNull TimerProgress timerProgress) {
                Intrinsics.checkNotNullParameter(formatedTime, "formatedTime");
                Intrinsics.checkNotNullParameter(timerProgress, "timerProgress");
                this.formatedTime = formatedTime;
                this.timerProgress = timerProgress;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Running)) {
                    return false;
                }
                Running running = (Running) other;
                return Intrinsics.d(this.formatedTime, running.formatedTime) && this.timerProgress == running.timerProgress;
            }

            @NotNull
            public final T getFormatedTime() {
                return this.formatedTime;
            }

            @NotNull
            public final TimerProgress getTimerProgress() {
                return this.timerProgress;
            }

            public int hashCode() {
                return this.timerProgress.hashCode() + (this.formatedTime.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Running(formatedTime=" + this.formatedTime + ", timerProgress=" + this.timerProgress + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0001\u0010\u0001 \u0001*\u00020\u00022\u00020\u0002J\u0015\u0010\u0003\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00020\u0005H&¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerFormatter;", "T", "", "formatRemaining", "millis", "", "(J)Ljava/lang/Object;", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface TimerFormatter<T> {
        @NotNull
        T formatRemaining(long millis);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/utils/timerFlow/TimerFlow$TimerProgress;", "", "<init>", "(Ljava/lang/String;I)V", "BEFORE", "DURING", "AFTER", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TimerProgress {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ TimerProgress[] $VALUES;
        public static final TimerProgress BEFORE = new TimerProgress("BEFORE", 0);
        public static final TimerProgress DURING = new TimerProgress("DURING", 1);
        public static final TimerProgress AFTER = new TimerProgress("AFTER", 2);

        private static final /* synthetic */ TimerProgress[] $values() {
            return new TimerProgress[]{BEFORE, DURING, AFTER};
        }

        static {
            TimerProgress[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private TimerProgress(String str, int i11) {
        }

        public static TimerProgress valueOf(String str) {
            return (TimerProgress) Enum.valueOf(TimerProgress.class, str);
        }

        public static TimerProgress[] values() {
            return (TimerProgress[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TimerProgress.values().length];
            try {
                iArr[TimerProgress.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimerProgress.DURING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimerProgress.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TimerFlow(@NotNull CoroutineDispatcherProvider dispatcherProvider, @NotNull ElapsedTimeProvider elapsedTimeProvider) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(elapsedTimeProvider, "elapsedTimeProvider");
        this.dispatcherProvider = dispatcherProvider;
        this.elapsedTimeProvider = elapsedTimeProvider;
    }

    private final TimerProgress computeTimerProgress(long startTime, long endTime) {
        if (startTime > endTime && startTime > 0) {
            invalidTimeRangeError(startTime, endTime);
            throw new C4005g();
        }
        boolean z11 = false;
        long j11 = 0;
        boolean z12 = startTime > j11;
        if (startTime <= j11 && j11 < endTime) {
            z11 = true;
        }
        return z12 ? TimerProgress.BEFORE : z11 ? TimerProgress.DURING : TimerProgress.AFTER;
    }

    private final Object emitTimeExpired(InterfaceC2397i<? super State<? extends T>> interfaceC2397i, d<? super Unit> dVar) {
        Object emit = interfaceC2397i.emit(State.Expired.m1450boximpl(State.Expired.m1452constructorimpl$default(null, 1, null)), dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    private final Object emitTimeRunning(InterfaceC2397i<? super State<? extends T>> interfaceC2397i, long j11, TimerProgress timerProgress, TimerFormatter<? extends T> timerFormatter, d<? super Unit> dVar) {
        Object emit = interfaceC2397i.emit(new State.Running(timerFormatter.formatRemaining(j11), timerProgress), dVar);
        return emit == Wc.a.COROUTINE_SUSPENDED ? emit : Unit.f71690a;
    }

    private final Void invalidTimeRangeError(long startTimestamp, long endTimestamp) {
        StringBuilder d11 = C2702w.d(startTimestamp, "Invalid TimerFlow configuration: startTimestamp (", ") cannot be greater than endTimestamp (");
        d11.append(endTimestamp);
        d11.append(").");
        throw new IllegalStateException(d11.toString().toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0174, code lost:
    
        if (r19.startTimer(r20, r4, r6, r24, r2) == r3) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x018d, code lost:
    
        if (r19.emitTimeExpired(r20, r2) == r3) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0138 -> B:22:0x0145). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object startTimer(InterfaceC2397i<? super State<? extends T>> interfaceC2397i, long j11, long j12, TimerFormatter<? extends T> timerFormatter, d<? super Unit> dVar) {
        TimerFlow$startTimer$1 timerFlow$startTimer$1;
        int i11;
        long j13;
        long j14;
        TimerFlow<T> timerFlow;
        TimerProgress timerProgress;
        TimerFlow$startTimer$1 timerFlow$startTimer$12;
        long j15;
        long j16;
        InterfaceC2397i<? super State<? extends T>> interfaceC2397i2;
        long j17;
        long j18;
        TimerFormatter<? extends T> timerFormatter2;
        long j19;
        long j21;
        TimerFlow<T> timerFlow2;
        InterfaceC2397i<? super State<? extends T>> interfaceC2397i3;
        TimerProgress timerProgress2;
        TimerFormatter<? extends T> timerFormatter3;
        Duration ofMillis;
        if (dVar instanceof TimerFlow$startTimer$1) {
            timerFlow$startTimer$1 = (TimerFlow$startTimer$1) dVar;
            int i12 = timerFlow$startTimer$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                timerFlow$startTimer$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = timerFlow$startTimer$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = timerFlow$startTimer$1.label;
                int i13 = 1;
                if (i11 != 0) {
                    j13 = 0;
                    s.b(obj);
                    E0.f(timerFlow$startTimer$1.getContext());
                    long provideTime = this.elapsedTimeProvider.provideTime();
                    TimerProgress computeTimerProgress = computeTimerProgress(j11 - provideTime, j12 - provideTime);
                    int i14 = WhenMappings.$EnumSwitchMapping$0[computeTimerProgress.ordinal()];
                    if (i14 == 1) {
                        j14 = j11;
                    } else if (i14 == 2) {
                        j14 = j12;
                    } else {
                        if (i14 != 3) {
                            throw new o();
                        }
                        j14 = 0;
                    }
                    timerFlow = this;
                    timerProgress = computeTimerProgress;
                    timerFlow$startTimer$12 = timerFlow$startTimer$1;
                    j15 = j14 - provideTime;
                    j16 = j14;
                    interfaceC2397i2 = interfaceC2397i;
                    j17 = j11;
                    j18 = j12;
                    timerFormatter2 = timerFormatter;
                    if (j15 > j13) {
                    }
                    InterfaceC2397i<? super State<? extends T>> interfaceC2397i4 = interfaceC2397i2;
                    TimerFormatter<? extends T> timerFormatter4 = timerFormatter2;
                    TimerFlow$startTimer$1 timerFlow$startTimer$13 = timerFlow$startTimer$12;
                    TimerFlow timerFlow3 = timerFlow;
                    if (timerProgress != TimerProgress.AFTER) {
                    }
                    return aVar;
                }
                if (i11 == 1) {
                    j13 = 0;
                    long j22 = timerFlow$startTimer$1.J$2;
                    j18 = timerFlow$startTimer$1.J$1;
                    j21 = timerFlow$startTimer$1.J$0;
                    TimerProgress timerProgress3 = (TimerProgress) timerFlow$startTimer$1.L$3;
                    TimerFormatter<? extends T> timerFormatter5 = (TimerFormatter) timerFlow$startTimer$1.L$2;
                    InterfaceC2397i<? super State<? extends T>> interfaceC2397i5 = (InterfaceC2397i) timerFlow$startTimer$1.L$1;
                    TimerFlow<T> timerFlow4 = (TimerFlow) timerFlow$startTimer$1.L$0;
                    s.b(obj);
                    timerFormatter3 = timerFormatter5;
                    timerProgress2 = timerProgress3;
                    interfaceC2397i3 = interfaceC2397i5;
                    timerFlow2 = timerFlow4;
                    j19 = j22;
                    ofMillis = Duration.ofMillis(1000L);
                    Intrinsics.checkNotNullExpressionValue(ofMillis, "ofMillis(...)");
                    timerFlow$startTimer$1.L$0 = timerFlow2;
                    timerFlow$startTimer$1.L$1 = interfaceC2397i3;
                    timerFlow$startTimer$1.L$2 = timerFormatter3;
                    timerFlow$startTimer$1.L$3 = timerProgress2;
                    timerFlow$startTimer$1.J$0 = j21;
                    timerFlow$startTimer$1.J$1 = j18;
                    timerFlow$startTimer$1.J$2 = j19;
                    timerFlow$startTimer$1.label = 2;
                    if (Ke.a.a(ofMillis, timerFlow$startTimer$1) != aVar) {
                    }
                    return aVar;
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        s.b(obj);
                        return Unit.f71690a;
                    }
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                long j23 = timerFlow$startTimer$1.J$2;
                long j24 = timerFlow$startTimer$1.J$1;
                long j25 = timerFlow$startTimer$1.J$0;
                TimerProgress timerProgress4 = (TimerProgress) timerFlow$startTimer$1.L$3;
                j13 = 0;
                TimerFormatter<? extends T> timerFormatter6 = (TimerFormatter) timerFlow$startTimer$1.L$2;
                InterfaceC2397i<? super State<? extends T>> interfaceC2397i6 = (InterfaceC2397i) timerFlow$startTimer$1.L$1;
                TimerFlow<T> timerFlow5 = (TimerFlow) timerFlow$startTimer$1.L$0;
                s.b(obj);
                interfaceC2397i2 = interfaceC2397i6;
                timerFlow$startTimer$12 = timerFlow$startTimer$1;
                timerFormatter2 = timerFormatter6;
                timerProgress = timerProgress4;
                j17 = j25;
                j18 = j24;
                timerFlow = timerFlow5;
                j16 = j23;
                j15 = j16 - timerFlow.elapsedTimeProvider.provideTime();
                i13 = 1;
                if (j15 > j13 || !E0.i(timerFlow$startTimer$12.getContext())) {
                    InterfaceC2397i<? super State<? extends T>> interfaceC2397i42 = interfaceC2397i2;
                    TimerFormatter<? extends T> timerFormatter42 = timerFormatter2;
                    TimerFlow$startTimer$1 timerFlow$startTimer$132 = timerFlow$startTimer$12;
                    TimerFlow timerFlow32 = timerFlow;
                    if (timerProgress != TimerProgress.AFTER) {
                        timerFlow$startTimer$132.L$0 = null;
                        timerFlow$startTimer$132.L$1 = null;
                        timerFlow$startTimer$132.L$2 = null;
                        timerFlow$startTimer$132.L$3 = null;
                        timerFlow$startTimer$132.label = 3;
                    } else {
                        timerFlow$startTimer$132.L$0 = null;
                        timerFlow$startTimer$132.L$1 = null;
                        timerFlow$startTimer$132.L$2 = null;
                        timerFlow$startTimer$132.L$3 = null;
                        timerFlow$startTimer$132.label = 4;
                    }
                } else {
                    timerFlow$startTimer$12.L$0 = timerFlow;
                    timerFlow$startTimer$12.L$1 = interfaceC2397i2;
                    timerFlow$startTimer$12.L$2 = timerFormatter2;
                    timerFlow$startTimer$12.L$3 = timerProgress;
                    timerFlow$startTimer$12.J$0 = j17;
                    timerFlow$startTimer$12.J$1 = j18;
                    timerFlow$startTimer$12.J$2 = j16;
                    timerFlow$startTimer$12.label = i13;
                    InterfaceC2397i<? super State<? extends T>> interfaceC2397i7 = interfaceC2397i2;
                    TimerFormatter<? extends T> timerFormatter7 = timerFormatter2;
                    TimerFlow$startTimer$1 timerFlow$startTimer$14 = timerFlow$startTimer$12;
                    TimerFlow<T> timerFlow6 = timerFlow;
                    timerFlow$startTimer$1 = timerFlow$startTimer$14;
                    if (timerFlow6.emitTimeRunning(interfaceC2397i7, j15, timerProgress, timerFormatter7, timerFlow$startTimer$14) != aVar) {
                        j19 = j16;
                        timerFormatter3 = timerFormatter7;
                        j21 = j17;
                        timerProgress2 = timerProgress;
                        timerFlow2 = timerFlow6;
                        interfaceC2397i3 = interfaceC2397i7;
                        ofMillis = Duration.ofMillis(1000L);
                        Intrinsics.checkNotNullExpressionValue(ofMillis, "ofMillis(...)");
                        timerFlow$startTimer$1.L$0 = timerFlow2;
                        timerFlow$startTimer$1.L$1 = interfaceC2397i3;
                        timerFlow$startTimer$1.L$2 = timerFormatter3;
                        timerFlow$startTimer$1.L$3 = timerProgress2;
                        timerFlow$startTimer$1.J$0 = j21;
                        timerFlow$startTimer$1.J$1 = j18;
                        timerFlow$startTimer$1.J$2 = j19;
                        timerFlow$startTimer$1.label = 2;
                        if (Ke.a.a(ofMillis, timerFlow$startTimer$1) != aVar) {
                            TimerFlow$startTimer$1 timerFlow$startTimer$15 = timerFlow$startTimer$1;
                            timerFormatter2 = timerFormatter3;
                            interfaceC2397i2 = interfaceC2397i3;
                            long j26 = j21;
                            timerFlow$startTimer$12 = timerFlow$startTimer$15;
                            j16 = j19;
                            timerFlow = timerFlow2;
                            timerProgress = timerProgress2;
                            j17 = j26;
                            j15 = j16 - timerFlow.elapsedTimeProvider.provideTime();
                            i13 = 1;
                            if (j15 > j13) {
                            }
                            InterfaceC2397i<? super State<? extends T>> interfaceC2397i422 = interfaceC2397i2;
                            TimerFormatter<? extends T> timerFormatter422 = timerFormatter2;
                            TimerFlow$startTimer$1 timerFlow$startTimer$1322 = timerFlow$startTimer$12;
                            TimerFlow timerFlow322 = timerFlow;
                            if (timerProgress != TimerProgress.AFTER) {
                            }
                        }
                    }
                }
                return aVar;
            }
        }
        timerFlow$startTimer$1 = new TimerFlow$startTimer$1(this, dVar);
        Object obj2 = timerFlow$startTimer$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = timerFlow$startTimer$1.label;
        int i132 = 1;
        if (i11 != 0) {
        }
    }

    @NotNull
    public final InterfaceC2395h<State<T>> getTimer(long startTimestamp, long endTimestamp, @NotNull TimerFormatter<? extends T> formatter) {
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        return C2399j.B(new C(C2399j.o(C2399j.A(new TimerFlow$getTimer$1(this, startTimestamp, endTimestamp, formatter, null))), new TimerFlow$getTimer$2(null)), this.dispatcherProvider.getDefault());
    }
}
