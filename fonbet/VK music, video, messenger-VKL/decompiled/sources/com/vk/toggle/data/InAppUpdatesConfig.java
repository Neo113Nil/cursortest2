package com.vk.toggle.data;

import java.util.concurrent.TimeUnit;
import xsna.asp;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: InAppUpdatesConfig.kt */
/* loaded from: classes11.dex */
public final class InAppUpdatesConfig {
    public static final a k = new a();
    public static final long l;
    public static final InAppUpdatesConfig m;
    public final boolean a;
    public final boolean b;
    public final StoreUpdater c;
    public final StoreUpdater d;
    public final boolean e;
    public final long f;
    public final String g;
    public final InternalOpenStrategy h;
    public final String i;
    public final String j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InAppUpdatesConfig.kt */
    public static final class InternalOpenStrategy {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InternalOpenStrategy[] $VALUES;
        public static final InternalOpenStrategy BROWSER;
        public static final InternalOpenStrategy CUSTOM_TABS;

        static {
            InternalOpenStrategy internalOpenStrategy = new InternalOpenStrategy("CUSTOM_TABS", 0);
            CUSTOM_TABS = internalOpenStrategy;
            InternalOpenStrategy internalOpenStrategy2 = new InternalOpenStrategy("BROWSER", 1);
            BROWSER = internalOpenStrategy2;
            InternalOpenStrategy[] internalOpenStrategyArr = {internalOpenStrategy, internalOpenStrategy2};
            $VALUES = internalOpenStrategyArr;
            $ENTRIES = new asp(internalOpenStrategyArr);
        }

        public InternalOpenStrategy() {
            throw null;
        }

        public static InternalOpenStrategy valueOf(String str) {
            return (InternalOpenStrategy) Enum.valueOf(InternalOpenStrategy.class, str);
        }

        public static InternalOpenStrategy[] values() {
            return (InternalOpenStrategy[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: InAppUpdatesConfig.kt */
    public static final class StoreUpdater {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StoreUpdater[] $VALUES;
        public static final StoreUpdater ANY;
        public static final a Companion;
        public static final StoreUpdater GMS;
        public static final StoreUpdater NONE;
        public static final StoreUpdater RUSTORE;
        private final String storeName;

        /* compiled from: InAppUpdatesConfig.kt */
        public static final class a {
            public static StoreUpdater a(String str) {
                int hashCode = str.hashCode();
                if (hashCode != 96748) {
                    if (hashCode != 102477) {
                        if (hashCode == 1555586174 && str.equals("rustore")) {
                            return StoreUpdater.RUSTORE;
                        }
                    } else if (str.equals("gms")) {
                        return StoreUpdater.GMS;
                    }
                } else if (str.equals("any")) {
                    return StoreUpdater.ANY;
                }
                return StoreUpdater.NONE;
            }
        }

        static {
            StoreUpdater storeUpdater = new StoreUpdater("GMS", 0, "gms");
            GMS = storeUpdater;
            StoreUpdater storeUpdater2 = new StoreUpdater("RUSTORE", 1, "rustore");
            RUSTORE = storeUpdater2;
            StoreUpdater storeUpdater3 = new StoreUpdater("NONE", 2, "none");
            NONE = storeUpdater3;
            StoreUpdater storeUpdater4 = new StoreUpdater("ANY", 3, "any");
            ANY = storeUpdater4;
            StoreUpdater[] storeUpdaterArr = {storeUpdater, storeUpdater2, storeUpdater3, storeUpdater4};
            $VALUES = storeUpdaterArr;
            $ENTRIES = new asp(storeUpdaterArr);
            Companion = new a();
        }

        public StoreUpdater(String str, int i, String str2) {
            this.storeName = str2;
        }

        public static StoreUpdater valueOf(String str) {
            return (StoreUpdater) Enum.valueOf(StoreUpdater.class, str);
        }

        public static StoreUpdater[] values() {
            return (StoreUpdater[]) $VALUES.clone();
        }
    }

    /* compiled from: InAppUpdatesConfig.kt */
    public static final class a {
    }

    static {
        long millis = TimeUnit.DAYS.toMillis(7L);
        l = millis;
        StoreUpdater storeUpdater = StoreUpdater.NONE;
        m = new InAppUpdatesConfig(false, false, storeUpdater, storeUpdater, false, millis, "https://android-ac.vk-apps.com/latest", InternalOpenStrategy.CUSTOM_TABS, null, null);
    }

    public InAppUpdatesConfig(boolean z, boolean z2, StoreUpdater storeUpdater, StoreUpdater storeUpdater2, boolean z3, long j, String str, InternalOpenStrategy internalOpenStrategy, String str2, String str3) {
        this.a = z;
        this.b = z2;
        this.c = storeUpdater;
        this.d = storeUpdater2;
        this.e = z3;
        this.f = j;
        this.g = str;
        this.h = internalOpenStrategy;
        this.i = str2;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InAppUpdatesConfig)) {
            return false;
        }
        InAppUpdatesConfig inAppUpdatesConfig = (InAppUpdatesConfig) obj;
        return this.a == inAppUpdatesConfig.a && this.b == inAppUpdatesConfig.b && this.c == inAppUpdatesConfig.c && this.d == inAppUpdatesConfig.d && this.e == inAppUpdatesConfig.e && this.f == inAppUpdatesConfig.f && epx.f(this.g, inAppUpdatesConfig.g) && this.h == inAppUpdatesConfig.h && epx.f(this.i, inAppUpdatesConfig.i) && epx.f(this.j, inAppUpdatesConfig.j);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + urd0.a(bh10.a(qoy.b((this.d.hashCode() + ((this.c.hashCode() + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31, 31, this.e), 31, this.f), 31, this.g)) * 31;
        String str = this.i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.j;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InAppUpdatesConfig(gmsEngineEnabled=");
        sb.append(this.a);
        sb.append(", rustoreEngineEnabled=");
        sb.append(this.b);
        sb.append(", moveUsersFrom=");
        sb.append(this.c);
        sb.append(", moveUsersTo=");
        sb.append(this.d);
        sb.append(", internalInAppEngineEnabled=");
        sb.append(this.e);
        sb.append(", updateTimeIntervalMs=");
        sb.append(this.f);
        sb.append(", baseUrl=");
        sb.append(this.g);
        sb.append(", internalOpenStrategy=");
        sb.append(this.h);
        sb.append(", updateTitle=");
        sb.append(this.i);
        sb.append(", updateSubtitle=");
        return ho8.a(sb, this.j, ')');
    }
}
