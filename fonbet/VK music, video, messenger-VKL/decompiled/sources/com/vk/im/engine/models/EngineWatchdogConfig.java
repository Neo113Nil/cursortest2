package com.vk.im.engine.models;

import java.util.Map;
import xsna.asp;
import xsna.jgp;
import xsna.vu5;
import xsna.zrp;

/* compiled from: EngineWatchdogConfig.kt */
/* loaded from: classes.dex */
public final class EngineWatchdogConfig {
    public static final EngineWatchdogConfig b = new EngineWatchdogConfig(jgp.b);
    public final Object a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: EngineWatchdogConfig.kt */
    public static final class WatchdogName {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ WatchdogName[] $VALUES;
        public static final WatchdogName INTERNAL_QUEUE_EXECUTOR;
        public static final WatchdogName TASK_EXECUTOR;
        private final String jsonKey;

        static {
            WatchdogName watchdogName = new WatchdogName("INTERNAL_QUEUE_EXECUTOR", 0, "InternalQueueExecutor");
            INTERNAL_QUEUE_EXECUTOR = watchdogName;
            WatchdogName watchdogName2 = new WatchdogName("TASK_EXECUTOR", 1, "TaskExecutor");
            TASK_EXECUTOR = watchdogName2;
            WatchdogName[] watchdogNameArr = {watchdogName, watchdogName2};
            $VALUES = watchdogNameArr;
            $ENTRIES = new asp(watchdogNameArr);
        }

        public WatchdogName(String str, int i, String str2) {
            this.jsonKey = str2;
        }

        public static WatchdogName valueOf(String str) {
            return (WatchdogName) Enum.valueOf(WatchdogName.class, str);
        }

        public static WatchdogName[] values() {
            return (WatchdogName[]) $VALUES.clone();
        }

        public final String h() {
            return this.jsonKey;
        }
    }

    /* compiled from: EngineWatchdogConfig.kt */
    public static final class a {
        public final long a;
        public final long b;

        public a(long j, long j2) {
            this.a = j;
            this.b = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Timings(hangTimeoutMillis=");
            sb.append(this.a);
            sb.append(", stuckTimeoutMillis=");
            return vu5.a(')', this.b, sb);
        }
    }

    public EngineWatchdogConfig(Map<WatchdogName, a> map) {
        this.a = map;
    }
}
