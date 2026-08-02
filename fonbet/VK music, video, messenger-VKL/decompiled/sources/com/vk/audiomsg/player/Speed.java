package com.vk.audiomsg.player;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Speed.kt */
/* loaded from: classes.dex */
public final class Speed {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ Speed[] $VALUES;
    public static final a Companion;
    public static final Speed X1;
    public static final Speed X1_5;
    public static final Speed X2;
    private final int id;
    private final float value;

    /* compiled from: Speed.kt */
    public static final class a {
    }

    /* compiled from: Speed.kt */
    /* loaded from: classes15.dex */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Speed.values().length];
            try {
                iArr[Speed.X1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Speed.X1_5.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Speed.X2.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        Speed speed = new Speed(1.0f, 0, 1, "X1");
        X1 = speed;
        Speed speed2 = new Speed(1.5f, 1, 2, "X1_5");
        X1_5 = speed2;
        Speed speed3 = new Speed(2.0f, 2, 3, "X2");
        X2 = speed3;
        Speed[] speedArr = {speed, speed2, speed3};
        $VALUES = speedArr;
        $ENTRIES = new asp(speedArr);
        Companion = new a();
    }

    public Speed(float f, int i, int i2, String str) {
        this.id = i2;
        this.value = f;
    }

    public static Speed valueOf(String str) {
        return (Speed) Enum.valueOf(Speed.class, str);
    }

    public static Speed[] values() {
        return (Speed[]) $VALUES.clone();
    }

    public final int h() {
        return this.id;
    }

    public final float i() {
        return this.value;
    }
}
