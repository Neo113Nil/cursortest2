package com.vk.superapp.vibration.js.bridge.impl;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import xsna.asp;
import xsna.zrp;

/* compiled from: VibrationUtils.kt */
/* loaded from: classes6.dex */
public final class VibrationUtils {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VibrationUtils.kt */
    public static final class VibrationPattern {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ VibrationPattern[] $VALUES;
        public static final VibrationPattern Error;
        public static final VibrationPattern Heavy;
        public static final VibrationPattern Light;
        public static final VibrationPattern Medium;
        public static final VibrationPattern Selection;
        public static final VibrationPattern Success;
        public static final VibrationPattern Warning;
        private final long[] oldSDKTimings;
        private final Integer predefinedEffect;
        private final a waveform;

        static {
            VibrationPattern vibrationPattern = new VibrationPattern("Light", 0, new a(new long[]{0, 50}, new int[]{0, 110}), new long[]{0, 20}, 2);
            Light = vibrationPattern;
            VibrationPattern vibrationPattern2 = new VibrationPattern("Medium", 1, new a(new long[]{0, 43}, new int[]{0, 180}), new long[]{0, 43}, 0);
            Medium = vibrationPattern2;
            VibrationPattern vibrationPattern3 = new VibrationPattern("Heavy", 2, new a(new long[]{0, 60}, new int[]{0, 255}), new long[]{0, 61}, 5);
            Heavy = vibrationPattern3;
            VibrationPattern vibrationPattern4 = new VibrationPattern("Success", 3, new a(new long[]{0, 35, 65, 21}, new int[]{0, 250, 0, 180}), new long[]{0, 35, 65, 21}, 0);
            Success = vibrationPattern4;
            VibrationPattern vibrationPattern5 = new VibrationPattern("Warning", 4, new a(new long[]{0, 30, 40, 30, 50, 60}, new int[]{255, 255, 255, 255, 255, 255}), new long[]{0, 30, 40, 30, 50, 60}, 1);
            Warning = vibrationPattern5;
            VibrationPattern vibrationPattern6 = new VibrationPattern("Error", 5, new a(new long[]{0, 27, 45, 50}, new int[]{0, 120, 0, 250}), new long[]{0, 27, 45, 50}, 1);
            Error = vibrationPattern6;
            VibrationPattern vibrationPattern7 = new VibrationPattern("Selection", 6, new a(new long[]{0, 100}, new int[]{0, 100}), new long[]{0, 70}, 2);
            Selection = vibrationPattern7;
            VibrationPattern[] vibrationPatternArr = {vibrationPattern, vibrationPattern2, vibrationPattern3, vibrationPattern4, vibrationPattern5, vibrationPattern6, vibrationPattern7};
            $VALUES = vibrationPatternArr;
            $ENTRIES = new asp(vibrationPatternArr);
        }

        public VibrationPattern(String str, int i, a aVar, long[] jArr, Integer num) {
            this.waveform = aVar;
            this.oldSDKTimings = jArr;
            this.predefinedEffect = num;
        }

        public static VibrationPattern valueOf(String str) {
            return (VibrationPattern) Enum.valueOf(VibrationPattern.class, str);
        }

        public static VibrationPattern[] values() {
            return (VibrationPattern[]) $VALUES.clone();
        }

        public final long[] h() {
            return this.oldSDKTimings;
        }

        public final Integer i() {
            return this.predefinedEffect;
        }

        public final a j() {
            return this.waveform;
        }
    }

    /* compiled from: VibrationUtils.kt */
    public static final class a {
        public final long[] a;
        public final int[] b;

        public a(long[] jArr, int[] iArr) {
            this.a = jArr;
            this.b = iArr;
        }
    }

    public static boolean a(Context context, VibrationPattern vibrationPattern, boolean z) {
        VibrationEffect createPredefined;
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        if (vibrator == null || !vibrator.hasVibrator()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 34 && vibrationPattern.i() != null) {
            Integer i = vibrationPattern.i();
            createPredefined = VibrationEffect.createPredefined(i != null ? i.intValue() : -1);
            vibrator.vibrate(createPredefined);
            return true;
        }
        if (vibrator.hasAmplitudeControl() && !z) {
            vibrator.vibrate(VibrationEffect.createWaveform(vibrationPattern.j().a, vibrationPattern.j().b, -1));
            return true;
        }
        if (z) {
            return false;
        }
        vibrator.vibrate(vibrationPattern.h(), -1);
        return true;
    }
}
