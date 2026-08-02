package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.Priority;
import java.util.Map;
import java.util.Set;
import xsna.zuf;

/* loaded from: classes.dex */
public abstract class SchedulerConfig {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DEVICE_CHARGING;
        public static final Flag DEVICE_IDLE;
        public static final Flag NETWORK_UNMETERED;

        static {
            Flag flag = new Flag("NETWORK_UNMETERED", 0);
            NETWORK_UNMETERED = flag;
            Flag flag2 = new Flag("DEVICE_IDLE", 1);
            DEVICE_IDLE = flag2;
            Flag flag3 = new Flag("DEVICE_CHARGING", 2);
            DEVICE_CHARGING = flag3;
            $VALUES = new Flag[]{flag, flag2, flag3};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    public static abstract class a {
        public abstract long a();

        public abstract Set<Flag> b();

        public abstract long c();
    }

    public abstract zuf a();

    public final long b(Priority priority, long j, int i) {
        long C = j - a().C();
        a aVar = c().get(priority);
        long a2 = aVar.a();
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * a2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((a2 > 1 ? a2 : 2L) * r12))), C), aVar.c());
    }

    public abstract Map<Priority, a> c();
}
