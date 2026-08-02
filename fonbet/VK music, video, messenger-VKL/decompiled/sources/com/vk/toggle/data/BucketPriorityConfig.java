package com.vk.toggle.data;

import xsna.asp;
import xsna.qoy;
import xsna.shy;
import xsna.zrp;

/* compiled from: BucketPriorityConfig.kt */
/* loaded from: classes11.dex */
public final class BucketPriorityConfig {
    public static final a e = new a();
    public static final BucketPriorityConfig f = new BucketPriorityConfig(0);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final BucketStrategy d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BucketPriorityConfig.kt */
    public static final class BucketStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ BucketStrategy[] $VALUES;
        public static final a Companion;
        public static final BucketStrategy FAIR;
        public static final BucketStrategy STEAL;
        public static final BucketStrategy STEAL_LESS;
        private final String id;

        /* compiled from: BucketPriorityConfig.kt */
        public static final class a {
        }

        static {
            BucketStrategy bucketStrategy = new BucketStrategy("FAIR", 0, "fair");
            FAIR = bucketStrategy;
            BucketStrategy bucketStrategy2 = new BucketStrategy("STEAL", 1, "steal");
            STEAL = bucketStrategy2;
            BucketStrategy bucketStrategy3 = new BucketStrategy("STEAL_LESS", 2, "steal_less");
            STEAL_LESS = bucketStrategy3;
            BucketStrategy[] bucketStrategyArr = {bucketStrategy, bucketStrategy2, bucketStrategy3};
            $VALUES = bucketStrategyArr;
            $ENTRIES = new asp(bucketStrategyArr);
            Companion = new a();
        }

        public BucketStrategy(String str, int i, String str2) {
            this.id = str2;
        }

        public static BucketStrategy valueOf(String str) {
            return (BucketStrategy) Enum.valueOf(BucketStrategy.class, str);
        }

        public static BucketStrategy[] values() {
            return (BucketStrategy[]) $VALUES.clone();
        }
    }

    /* compiled from: BucketPriorityConfig.kt */
    public static final class a {
    }

    public BucketPriorityConfig() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BucketPriorityConfig)) {
            return false;
        }
        BucketPriorityConfig bucketPriorityConfig = (BucketPriorityConfig) obj;
        return this.a == bucketPriorityConfig.a && this.b == bucketPriorityConfig.b && this.c == bucketPriorityConfig.c && this.d == bucketPriorityConfig.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + qoy.b(shy.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "BucketPriorityConfig(isEnabled=" + this.a + ", slotSize=" + this.b + ", disableTMRI=" + this.c + ", strategy=" + this.d + ')';
    }

    public BucketPriorityConfig(boolean z, int i, boolean z2, BucketStrategy bucketStrategy) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = bucketStrategy;
    }

    public /* synthetic */ BucketPriorityConfig(int i) {
        this(false, 4, false, BucketStrategy.FAIR);
    }
}
