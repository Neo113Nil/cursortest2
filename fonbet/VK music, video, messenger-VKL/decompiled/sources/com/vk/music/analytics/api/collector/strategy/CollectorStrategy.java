package com.vk.music.analytics.api.collector.strategy;

import xsna.asp;
import xsna.ax1;
import xsna.iwa0;
import xsna.t940;
import xsna.zrp;

/* compiled from: CollectorStrategy.kt */
/* loaded from: classes3.dex */
public interface CollectorStrategy<T extends t940> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CollectorStrategy.kt */
    public static final class OverflowStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ OverflowStrategy[] $VALUES;
        public static final OverflowStrategy IGNORE_NEW_EVENTS;
        public static final OverflowStrategy REMOVE_OLDEST;

        static {
            OverflowStrategy overflowStrategy = new OverflowStrategy("IGNORE_NEW_EVENTS", 0);
            IGNORE_NEW_EVENTS = overflowStrategy;
            OverflowStrategy overflowStrategy2 = new OverflowStrategy("REMOVE_OLDEST", 1);
            REMOVE_OLDEST = overflowStrategy2;
            OverflowStrategy[] overflowStrategyArr = {overflowStrategy, overflowStrategy2};
            $VALUES = overflowStrategyArr;
            $ENTRIES = new asp(overflowStrategyArr);
        }

        public OverflowStrategy() {
            throw null;
        }

        public static OverflowStrategy valueOf(String str) {
            return (OverflowStrategy) Enum.valueOf(OverflowStrategy.class, str);
        }

        public static OverflowStrategy[] values() {
            return (OverflowStrategy[]) $VALUES.clone();
        }
    }

    ax1 g(iwa0 iwa0Var);

    boolean j(iwa0 iwa0Var);
}
