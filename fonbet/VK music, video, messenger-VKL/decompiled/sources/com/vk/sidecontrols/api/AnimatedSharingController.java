package com.vk.sidecontrols.api;

import java.util.ArrayList;
import xsna.asp;
import xsna.ml2;
import xsna.zrp;

/* compiled from: AnimatedSharingController.kt */
/* loaded from: classes5.dex */
public interface AnimatedSharingController {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedSharingController.kt */
    public static final class Strategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Strategy[] $VALUES;
        public static final a Companion;
        public static final Strategy LIKE_AND_REWATCH_ONCE_NO_STOP_FRAME;
        public static final Strategy LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME;
        public static final Strategy LIKE_EVERY_TIME_NO_STOP_FRAME;
        private final int value;

        /* compiled from: AnimatedSharingController.kt */
        public static final class a {
        }

        static {
            Strategy strategy = new Strategy("LIKE_AND_REWATCH_ONCE_NO_STOP_FRAME", 0, 1);
            LIKE_AND_REWATCH_ONCE_NO_STOP_FRAME = strategy;
            Strategy strategy2 = new Strategy("LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME", 1, 2);
            LIKE_AND_REWATCH_ONCE_WITH_STOP_FRAME = strategy2;
            Strategy strategy3 = new Strategy("LIKE_EVERY_TIME_NO_STOP_FRAME", 2, 3);
            LIKE_EVERY_TIME_NO_STOP_FRAME = strategy3;
            Strategy[] strategyArr = {strategy, strategy2, strategy3};
            $VALUES = strategyArr;
            $ENTRIES = new asp(strategyArr);
            Companion = new a();
        }

        public Strategy(String str, int i, int i2) {
            this.value = i2;
        }

        public static zrp<Strategy> h() {
            return $ENTRIES;
        }

        public static Strategy valueOf(String str) {
            return (Strategy) Enum.valueOf(Strategy.class, str);
        }

        public static Strategy[] values() {
            return (Strategy[]) $VALUES.clone();
        }

        public final int i() {
            return this.value;
        }
    }

    /* compiled from: AnimatedSharingController.kt */
    public interface a {
        void b(ArrayList arrayList, long j, Strategy strategy);

        void c();
    }

    void a(ml2 ml2Var);

    void b();

    void c();

    void d(ml2 ml2Var);

    void e();
}
