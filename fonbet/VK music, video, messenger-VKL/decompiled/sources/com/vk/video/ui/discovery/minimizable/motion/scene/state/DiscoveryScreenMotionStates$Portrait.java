package com.vk.video.ui.discovery.minimizable.motion.scene.state;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.nb30;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryScreenMotionStates.kt */
/* loaded from: classes7.dex */
public final class DiscoveryScreenMotionStates$Portrait implements nb30 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoveryScreenMotionStates$Portrait[] $VALUES;
    public static final DiscoveryScreenMotionStates$Portrait DialogFullscreen;
    public static final DiscoveryScreenMotionStates$Portrait Discovery;
    public static final DiscoveryScreenMotionStates$Portrait DiscoveryMatchVideoRatio;
    public static final DiscoveryScreenMotionStates$Portrait DiscoveryPreparedToPip;
    public static final DiscoveryScreenMotionStates$Portrait DiscoveryPreparedToPipMatchRatio;
    public static final DiscoveryScreenMotionStates$Portrait DiscoveryWithDialogUnderVideo;
    public static final DiscoveryScreenMotionStates$Portrait Fullscreen;
    public static final DiscoveryScreenMotionStates$Portrait Hidden;
    public static final DiscoveryScreenMotionStates$Portrait Miniplayer;
    public static final DiscoveryScreenMotionStates$Portrait ReadyToStart;
    private final int constraintStateId;

    static {
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait = new DiscoveryScreenMotionStates$Portrait("ReadyToStart", 0, R.id.discovery_enter_start);
        ReadyToStart = discoveryScreenMotionStates$Portrait;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait2 = new DiscoveryScreenMotionStates$Portrait("Discovery", 1, R.id.expanded);
        Discovery = discoveryScreenMotionStates$Portrait2;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait3 = new DiscoveryScreenMotionStates$Portrait("DiscoveryMatchVideoRatio", 2, R.id.expanded_match_ratio);
        DiscoveryMatchVideoRatio = discoveryScreenMotionStates$Portrait3;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait4 = new DiscoveryScreenMotionStates$Portrait("DiscoveryWithDialogUnderVideo", 3, R.id.dialog_under_video);
        DiscoveryWithDialogUnderVideo = discoveryScreenMotionStates$Portrait4;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait5 = new DiscoveryScreenMotionStates$Portrait("DialogFullscreen", 4, R.id.dialog_expanded);
        DialogFullscreen = discoveryScreenMotionStates$Portrait5;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait6 = new DiscoveryScreenMotionStates$Portrait("DiscoveryPreparedToPip", 5, R.id.prepared_to_pip);
        DiscoveryPreparedToPip = discoveryScreenMotionStates$Portrait6;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait7 = new DiscoveryScreenMotionStates$Portrait("DiscoveryPreparedToPipMatchRatio", 6, R.id.prepared_to_pip_match_ratio);
        DiscoveryPreparedToPipMatchRatio = discoveryScreenMotionStates$Portrait7;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait8 = new DiscoveryScreenMotionStates$Portrait("Fullscreen", 7, R.id.fullscreen_vertical);
        Fullscreen = discoveryScreenMotionStates$Portrait8;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait9 = new DiscoveryScreenMotionStates$Portrait("Miniplayer", 8, R.id.collapsed);
        Miniplayer = discoveryScreenMotionStates$Portrait9;
        DiscoveryScreenMotionStates$Portrait discoveryScreenMotionStates$Portrait10 = new DiscoveryScreenMotionStates$Portrait("Hidden", 9, R.id.hidden);
        Hidden = discoveryScreenMotionStates$Portrait10;
        DiscoveryScreenMotionStates$Portrait[] discoveryScreenMotionStates$PortraitArr = {discoveryScreenMotionStates$Portrait, discoveryScreenMotionStates$Portrait2, discoveryScreenMotionStates$Portrait3, discoveryScreenMotionStates$Portrait4, discoveryScreenMotionStates$Portrait5, discoveryScreenMotionStates$Portrait6, discoveryScreenMotionStates$Portrait7, discoveryScreenMotionStates$Portrait8, discoveryScreenMotionStates$Portrait9, discoveryScreenMotionStates$Portrait10};
        $VALUES = discoveryScreenMotionStates$PortraitArr;
        $ENTRIES = new asp(discoveryScreenMotionStates$PortraitArr);
    }

    public DiscoveryScreenMotionStates$Portrait(String str, int i, int i2) {
        this.constraintStateId = i2;
    }

    public static zrp<DiscoveryScreenMotionStates$Portrait> i() {
        return $ENTRIES;
    }

    public static DiscoveryScreenMotionStates$Portrait valueOf(String str) {
        return (DiscoveryScreenMotionStates$Portrait) Enum.valueOf(DiscoveryScreenMotionStates$Portrait.class, str);
    }

    public static DiscoveryScreenMotionStates$Portrait[] values() {
        return (DiscoveryScreenMotionStates$Portrait[]) $VALUES.clone();
    }

    @Override // xsna.nb30
    public final int h() {
        return this.constraintStateId;
    }
}
