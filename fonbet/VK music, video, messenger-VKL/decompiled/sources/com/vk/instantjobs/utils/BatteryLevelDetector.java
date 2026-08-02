package com.vk.instantjobs.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import xsna.asp;
import xsna.kal;
import xsna.zrp;

/* compiled from: BatteryLevelDetector.kt */
/* loaded from: classes.dex */
public final class BatteryLevelDetector {
    public final kal a;
    public volatile Level b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BatteryLevelDetector.kt */
    public static final class Level {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level LOW;
        public static final Level NORMAL;

        static {
            Level level = new Level("NORMAL", 0);
            NORMAL = level;
            Level level2 = new Level("LOW", 1);
            LOW = level2;
            Level[] levelArr = {level, level2};
            $VALUES = levelArr;
            $ENTRIES = new asp(levelArr);
        }

        public Level() {
            throw null;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    /* compiled from: BatteryLevelDetector.kt */
    public final class PowerConnectionReceiver extends BroadcastReceiver {
        public PowerConnectionReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            BatteryLevelDetector batteryLevelDetector = BatteryLevelDetector.this;
            Level level = ((float) intent.getIntExtra("level", 100)) / ((float) intent.getIntExtra("scale", 100)) < 0.16f ? Level.LOW : Level.NORMAL;
            if (batteryLevelDetector.b != level) {
                batteryLevelDetector.b = level;
                batteryLevelDetector.a.invoke(level);
            }
        }
    }

    public BatteryLevelDetector(Context context, kal kalVar) {
        this.a = kalVar;
        Level level = Level.NORMAL;
        this.b = level;
        Intent registerReceiver = context.registerReceiver(new PowerConnectionReceiver(), new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            Level level2 = ((float) registerReceiver.getIntExtra("level", 100)) / ((float) registerReceiver.getIntExtra("scale", 100)) < 0.16f ? Level.LOW : level;
            if (level2 != null) {
                level = level2;
            }
        }
        this.b = level;
    }
}
