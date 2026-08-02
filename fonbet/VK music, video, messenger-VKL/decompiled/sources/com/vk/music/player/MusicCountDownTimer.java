package com.vk.music.player;

import android.os.CountDownTimer;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.asp;
import xsna.bn40;
import xsna.izs;
import xsna.s3q0;
import xsna.zrp;

/* compiled from: MusicCountDownTimer.kt */
/* loaded from: classes.dex */
public final class MusicCountDownTimer {
    public static final long g;
    public static final long h;
    public static final String i;
    public long b;
    public CountDownTimer d;
    public long f;
    public final long a = g;
    public State c = State.FINISHED;
    public final LinkedHashSet e = new LinkedHashSet();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MusicCountDownTimer.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State FINISHED;
        public static final State TICKING;

        static {
            State state = new State("FINISHED", 0);
            FINISHED = state;
            State state2 = new State("TICKING", 1);
            TICKING = state2;
            State[] stateArr = {state, state2};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: MusicCountDownTimer.kt */
    public interface a {
        void n0();

        void s0(long j);

        void u0();
    }

    /* compiled from: MusicCountDownTimer.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<a, s3q0> {
        public static final b b = new b(1, a.class, "onTimerCanceled", "onTimerCanceled()V", 0);

        @Override // xsna.izs
        public final s3q0 invoke(a aVar) {
            aVar.u0();
            return s3q0.a;
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        g = timeUnit.toMillis(1L);
        h = timeUnit.toMillis(15L);
        String canonicalName = MusicCountDownTimer.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "";
        }
        i = canonicalName;
    }

    public final void a() {
        bn40.f(i, "countDownTimer = ", String.valueOf(this.d));
        CountDownTimer countDownTimer = this.d;
        if (countDownTimer == null) {
            return;
        }
        this.f = 0L;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        b(b.b);
    }

    public final void b(izs<? super a, s3q0> izsVar) {
        bn40.f(i, "handleFinish");
        this.d = null;
        this.f = 0L;
        this.c = State.FINISHED;
        this.b = 0L;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            izsVar.invoke(it.next());
        }
    }
}
