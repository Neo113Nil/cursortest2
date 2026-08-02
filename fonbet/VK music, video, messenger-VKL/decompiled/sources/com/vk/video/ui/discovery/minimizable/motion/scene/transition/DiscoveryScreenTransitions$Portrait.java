package com.vk.video.ui.discovery.minimizable.motion.scene.transition;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.nmp0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryScreenTransitions.kt */
/* loaded from: classes7.dex */
public final class DiscoveryScreenTransitions$Portrait implements nmp0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoveryScreenTransitions$Portrait[] $VALUES;
    public static final DiscoveryScreenTransitions$Portrait DialogFullscreenToHidden;
    public static final DiscoveryScreenTransitions$Portrait DialogFullscreenToMiniplayer;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryMatchVideoRatioToDiscovery;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryMatchVideoRatioToDiscoveryWithDialogUnderVideo;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryMatchVideoRatioToFullscreenVertical;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryToDiscoveryPreparedToPip;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryToDiscoveryWithDialogUnderVideo;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryToFullscreenVertical;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryToMiniplayer;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryVideoMatchRatioToMiniplayer;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryVideoMatchRatioToPreparedToPip;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryWithDialogUnderVideoToDialogFullscreen;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryWithDialogUnderVideoToDiscoveryPreparedToPip;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryWithDialogUnderVideoToHidden;
    public static final DiscoveryScreenTransitions$Portrait DiscoveryWithDialogUnderVideoToMiniplayer;
    public static final DiscoveryScreenTransitions$Portrait FullscreenDialogToDiscovery;
    public static final DiscoveryScreenTransitions$Portrait FullscreenDialogToDiscoveryMatchVideoRatio;
    public static final DiscoveryScreenTransitions$Portrait FullscreenToDiscoveryWithDialogUnderVideo;
    public static final DiscoveryScreenTransitions$Portrait FullscreenToHidden;
    public static final DiscoveryScreenTransitions$Portrait FullscreenToMiniplayer;
    public static final DiscoveryScreenTransitions$Portrait HiddenToDiscovery;
    public static final DiscoveryScreenTransitions$Portrait HiddenToDiscoveryMatchVideoRatio;
    public static final DiscoveryScreenTransitions$Portrait MiniplayerToHidden;
    public static final DiscoveryScreenTransitions$Portrait ReadyToStartToDiscovery;
    public static final DiscoveryScreenTransitions$Portrait ReadyToStartToDiscoveryMatchVideoRatio;
    private final int motionTransitionId;

    static {
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait = new DiscoveryScreenTransitions$Portrait("ReadyToStartToDiscovery", 0, R.id.from_discovery_enter_start_to_expanded);
        ReadyToStartToDiscovery = discoveryScreenTransitions$Portrait;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait2 = new DiscoveryScreenTransitions$Portrait("ReadyToStartToDiscoveryMatchVideoRatio", 1, R.id.from_discovery_enter_start_to_expanded_match_ratio);
        ReadyToStartToDiscoveryMatchVideoRatio = discoveryScreenTransitions$Portrait2;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait3 = new DiscoveryScreenTransitions$Portrait("HiddenToDiscovery", 2, R.id.from_hidden_to_expanded);
        HiddenToDiscovery = discoveryScreenTransitions$Portrait3;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait4 = new DiscoveryScreenTransitions$Portrait("HiddenToDiscoveryMatchVideoRatio", 3, R.id.from_hidden_to_expanded_match_ratio);
        HiddenToDiscoveryMatchVideoRatio = discoveryScreenTransitions$Portrait4;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait5 = new DiscoveryScreenTransitions$Portrait("DiscoveryToMiniplayer", 4, R.id.from_expanded_to_collapsed);
        DiscoveryToMiniplayer = discoveryScreenTransitions$Portrait5;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait6 = new DiscoveryScreenTransitions$Portrait("DiscoveryToDiscoveryWithDialogUnderVideo", 5, R.id.from_expanded_to_dialog_under_video);
        DiscoveryToDiscoveryWithDialogUnderVideo = discoveryScreenTransitions$Portrait6;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait7 = new DiscoveryScreenTransitions$Portrait("DiscoveryToDiscoveryPreparedToPip", 6, R.id.from_expanded_to_prepared_to_pip);
        DiscoveryToDiscoveryPreparedToPip = discoveryScreenTransitions$Portrait7;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait8 = new DiscoveryScreenTransitions$Portrait("DiscoveryVideoMatchRatioToMiniplayer", 7, R.id.from_expanded_match_ratio_to_collapsed);
        DiscoveryVideoMatchRatioToMiniplayer = discoveryScreenTransitions$Portrait8;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait9 = new DiscoveryScreenTransitions$Portrait("DiscoveryVideoMatchRatioToPreparedToPip", 8, R.id.from_expanded_match_ratio_to_prepared_to_pip);
        DiscoveryVideoMatchRatioToPreparedToPip = discoveryScreenTransitions$Portrait9;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait10 = new DiscoveryScreenTransitions$Portrait("DiscoveryMatchVideoRatioToDiscovery", 9, R.id.from_expanded_match_ratio_to_expanded);
        DiscoveryMatchVideoRatioToDiscovery = discoveryScreenTransitions$Portrait10;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait11 = new DiscoveryScreenTransitions$Portrait("DiscoveryToFullscreenVertical", 10, R.id.from_expanded_to_fullscreen_vertical);
        DiscoveryToFullscreenVertical = discoveryScreenTransitions$Portrait11;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait12 = new DiscoveryScreenTransitions$Portrait("DiscoveryMatchVideoRatioToFullscreenVertical", 11, R.id.from_expanded_match_ratio_to_fullscreen_vertical);
        DiscoveryMatchVideoRatioToFullscreenVertical = discoveryScreenTransitions$Portrait12;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait13 = new DiscoveryScreenTransitions$Portrait("FullscreenToDiscoveryWithDialogUnderVideo", 12, R.id.from_fullscreen_vertical_to_dialog_under_video);
        FullscreenToDiscoveryWithDialogUnderVideo = discoveryScreenTransitions$Portrait13;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait14 = new DiscoveryScreenTransitions$Portrait("DiscoveryWithDialogUnderVideoToDialogFullscreen", 13, R.id.from_dialog_under_video_to_dialog_expanded);
        DiscoveryWithDialogUnderVideoToDialogFullscreen = discoveryScreenTransitions$Portrait14;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait15 = new DiscoveryScreenTransitions$Portrait("DiscoveryMatchVideoRatioToDiscoveryWithDialogUnderVideo", 14, R.id.from_expanded_match_ratio_to_dialog_under_video);
        DiscoveryMatchVideoRatioToDiscoveryWithDialogUnderVideo = discoveryScreenTransitions$Portrait15;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait16 = new DiscoveryScreenTransitions$Portrait("FullscreenDialogToDiscovery", 15, R.id.from_dialog_expanded_to_expanded);
        FullscreenDialogToDiscovery = discoveryScreenTransitions$Portrait16;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait17 = new DiscoveryScreenTransitions$Portrait("FullscreenDialogToDiscoveryMatchVideoRatio", 16, R.id.from_dialog_expanded_to_expanded_match_ratio);
        FullscreenDialogToDiscoveryMatchVideoRatio = discoveryScreenTransitions$Portrait17;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait18 = new DiscoveryScreenTransitions$Portrait("DialogFullscreenToMiniplayer", 17, R.id.from_dialog_expanded_to_collapsed);
        DialogFullscreenToMiniplayer = discoveryScreenTransitions$Portrait18;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait19 = new DiscoveryScreenTransitions$Portrait("DialogFullscreenToHidden", 18, R.id.from_dialog_expanded_to_hidden);
        DialogFullscreenToHidden = discoveryScreenTransitions$Portrait19;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait20 = new DiscoveryScreenTransitions$Portrait("DiscoveryWithDialogUnderVideoToMiniplayer", 19, R.id.from_dialog_under_video_to_collapsed);
        DiscoveryWithDialogUnderVideoToMiniplayer = discoveryScreenTransitions$Portrait20;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait21 = new DiscoveryScreenTransitions$Portrait("DiscoveryWithDialogUnderVideoToDiscoveryPreparedToPip", 20, R.id.from_dialog_under_video_to_prepared_to_pip);
        DiscoveryWithDialogUnderVideoToDiscoveryPreparedToPip = discoveryScreenTransitions$Portrait21;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait22 = new DiscoveryScreenTransitions$Portrait("DiscoveryWithDialogUnderVideoToHidden", 21, R.id.from_dialog_under_video_to_hidden);
        DiscoveryWithDialogUnderVideoToHidden = discoveryScreenTransitions$Portrait22;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait23 = new DiscoveryScreenTransitions$Portrait("MiniplayerToHidden", 22, R.id.from_collapsed_to_hidden);
        MiniplayerToHidden = discoveryScreenTransitions$Portrait23;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait24 = new DiscoveryScreenTransitions$Portrait("FullscreenToHidden", 23, R.id.from_fullscreen_vertical_to_hidden);
        FullscreenToHidden = discoveryScreenTransitions$Portrait24;
        DiscoveryScreenTransitions$Portrait discoveryScreenTransitions$Portrait25 = new DiscoveryScreenTransitions$Portrait("FullscreenToMiniplayer", 24, R.id.from_fullscreen_vertical_to_collapsed);
        FullscreenToMiniplayer = discoveryScreenTransitions$Portrait25;
        DiscoveryScreenTransitions$Portrait[] discoveryScreenTransitions$PortraitArr = {discoveryScreenTransitions$Portrait, discoveryScreenTransitions$Portrait2, discoveryScreenTransitions$Portrait3, discoveryScreenTransitions$Portrait4, discoveryScreenTransitions$Portrait5, discoveryScreenTransitions$Portrait6, discoveryScreenTransitions$Portrait7, discoveryScreenTransitions$Portrait8, discoveryScreenTransitions$Portrait9, discoveryScreenTransitions$Portrait10, discoveryScreenTransitions$Portrait11, discoveryScreenTransitions$Portrait12, discoveryScreenTransitions$Portrait13, discoveryScreenTransitions$Portrait14, discoveryScreenTransitions$Portrait15, discoveryScreenTransitions$Portrait16, discoveryScreenTransitions$Portrait17, discoveryScreenTransitions$Portrait18, discoveryScreenTransitions$Portrait19, discoveryScreenTransitions$Portrait20, discoveryScreenTransitions$Portrait21, discoveryScreenTransitions$Portrait22, discoveryScreenTransitions$Portrait23, discoveryScreenTransitions$Portrait24, discoveryScreenTransitions$Portrait25};
        $VALUES = discoveryScreenTransitions$PortraitArr;
        $ENTRIES = new asp(discoveryScreenTransitions$PortraitArr);
    }

    public DiscoveryScreenTransitions$Portrait(String str, int i, int i2) {
        this.motionTransitionId = i2;
    }

    public static zrp<DiscoveryScreenTransitions$Portrait> i() {
        return $ENTRIES;
    }

    public static DiscoveryScreenTransitions$Portrait valueOf(String str) {
        return (DiscoveryScreenTransitions$Portrait) Enum.valueOf(DiscoveryScreenTransitions$Portrait.class, str);
    }

    public static DiscoveryScreenTransitions$Portrait[] values() {
        return (DiscoveryScreenTransitions$Portrait[]) $VALUES.clone();
    }

    @Override // xsna.nmp0
    public final int h() {
        return this.motionTransitionId;
    }
}
