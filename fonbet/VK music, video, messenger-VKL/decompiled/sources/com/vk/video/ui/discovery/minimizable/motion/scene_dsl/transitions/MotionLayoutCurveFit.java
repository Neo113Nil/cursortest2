package com.vk.video.ui.discovery.minimizable.motion.scene_dsl.transitions;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MotionLayoutCurveFit.kt */
/* loaded from: classes7.dex */
public final class MotionLayoutCurveFit {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MotionLayoutCurveFit[] $VALUES;
    public static final MotionLayoutCurveFit LINEAR;
    public static final MotionLayoutCurveFit SPLINE;

    static {
        MotionLayoutCurveFit motionLayoutCurveFit = new MotionLayoutCurveFit("SPLINE", 0);
        SPLINE = motionLayoutCurveFit;
        MotionLayoutCurveFit motionLayoutCurveFit2 = new MotionLayoutCurveFit("LINEAR", 1);
        LINEAR = motionLayoutCurveFit2;
        MotionLayoutCurveFit[] motionLayoutCurveFitArr = {motionLayoutCurveFit, motionLayoutCurveFit2};
        $VALUES = motionLayoutCurveFitArr;
        $ENTRIES = new asp(motionLayoutCurveFitArr);
    }

    public MotionLayoutCurveFit() {
        throw null;
    }

    public static MotionLayoutCurveFit valueOf(String str) {
        return (MotionLayoutCurveFit) Enum.valueOf(MotionLayoutCurveFit.class, str);
    }

    public static MotionLayoutCurveFit[] values() {
        return (MotionLayoutCurveFit[]) $VALUES.clone();
    }
}
