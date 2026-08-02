package com.vk.metrics.performance.animation.motionlayout;

import java.util.Arrays;
import java.util.Locale;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MotionLayoutScreenType.kt */
/* loaded from: classes.dex */
public final class MotionLayoutScreenType {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MotionLayoutScreenType[] $VALUES;
    public static final MotionLayoutScreenType VIDEO_DISCOVERY;
    private final String framesKey;
    private final String freezeFramesKey;
    private final String freezeTimeKey;
    private final String timeKey;

    static {
        MotionLayoutScreenType motionLayoutScreenType = new MotionLayoutScreenType();
        VIDEO_DISCOVERY = motionLayoutScreenType;
        MotionLayoutScreenType[] motionLayoutScreenTypeArr = {motionLayoutScreenType};
        $VALUES = motionLayoutScreenTypeArr;
        $ENTRIES = new asp(motionLayoutScreenTypeArr);
    }

    public MotionLayoutScreenType() {
        String name = name();
        Locale locale = Locale.ROOT;
        this.timeKey = String.format("__app_animation_motion_layout_time_%s__", Arrays.copyOf(new Object[]{name.toLowerCase(locale)}, 1));
        this.framesKey = String.format("__app_animation_motion_layout_frames_%s__", Arrays.copyOf(new Object[]{name().toLowerCase(locale)}, 1));
        this.freezeTimeKey = String.format("__app_animation_motion_layout_freeze_time_%s__", Arrays.copyOf(new Object[]{name().toLowerCase(locale)}, 1));
        this.freezeFramesKey = String.format("__app_animation_motion_layout_freeze_frames_%s__", Arrays.copyOf(new Object[]{name().toLowerCase(locale)}, 1));
    }

    public static zrp<MotionLayoutScreenType> h() {
        return $ENTRIES;
    }

    public static MotionLayoutScreenType valueOf(String str) {
        return (MotionLayoutScreenType) Enum.valueOf(MotionLayoutScreenType.class, str);
    }

    public static MotionLayoutScreenType[] values() {
        return (MotionLayoutScreenType[]) $VALUES.clone();
    }

    public final String i() {
        return this.framesKey;
    }

    public final String j() {
        return this.freezeFramesKey;
    }

    public final String k() {
        return this.freezeTimeKey;
    }

    public final String l() {
        return this.timeKey;
    }
}
