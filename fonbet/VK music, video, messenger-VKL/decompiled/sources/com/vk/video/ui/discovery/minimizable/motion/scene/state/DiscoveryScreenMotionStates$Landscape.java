package com.vk.video.ui.discovery.minimizable.motion.scene.state;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.nb30;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryScreenMotionStates.kt */
/* loaded from: classes7.dex */
public final class DiscoveryScreenMotionStates$Landscape implements nb30 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoveryScreenMotionStates$Landscape[] $VALUES;
    public static final DiscoveryScreenMotionStates$Landscape Discovery;
    public static final DiscoveryScreenMotionStates$Landscape DiscoveryPreparedToPip;
    public static final DiscoveryScreenMotionStates$Landscape DiscoveryWithDialog;
    public static final DiscoveryScreenMotionStates$Landscape Fullscreen;
    public static final DiscoveryScreenMotionStates$Landscape FullscreenWithBottomPromo;
    public static final DiscoveryScreenMotionStates$Landscape FullscreenWithDialog;
    public static final DiscoveryScreenMotionStates$Landscape FullscreenWithRightPromo;
    public static final DiscoveryScreenMotionStates$Landscape FullscreenWithSimilar;
    public static final DiscoveryScreenMotionStates$Landscape Hidden;
    public static final DiscoveryScreenMotionStates$Landscape Miniplayer;
    private final int constraintStateId;

    static {
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape = new DiscoveryScreenMotionStates$Landscape("Discovery", 0, R.id.expanded_landscape_tablet);
        Discovery = discoveryScreenMotionStates$Landscape;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape2 = new DiscoveryScreenMotionStates$Landscape("DiscoveryWithDialog", 1, R.id.expanded_landscape_tablet_with_dialog);
        DiscoveryWithDialog = discoveryScreenMotionStates$Landscape2;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape3 = new DiscoveryScreenMotionStates$Landscape("DiscoveryPreparedToPip", 2, R.id.prepared_to_pip_landscape);
        DiscoveryPreparedToPip = discoveryScreenMotionStates$Landscape3;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape4 = new DiscoveryScreenMotionStates$Landscape("Fullscreen", 3, R.id.fullscreen);
        Fullscreen = discoveryScreenMotionStates$Landscape4;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape5 = new DiscoveryScreenMotionStates$Landscape("FullscreenWithDialog", 4, R.id.fullscreen_with_dialog);
        FullscreenWithDialog = discoveryScreenMotionStates$Landscape5;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape6 = new DiscoveryScreenMotionStates$Landscape("FullscreenWithSimilar", 5, R.id.fullscreen_with_similar_slider);
        FullscreenWithSimilar = discoveryScreenMotionStates$Landscape6;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape7 = new DiscoveryScreenMotionStates$Landscape("FullscreenWithRightPromo", 6, R.id.fullscreen_with_right_promo);
        FullscreenWithRightPromo = discoveryScreenMotionStates$Landscape7;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape8 = new DiscoveryScreenMotionStates$Landscape("FullscreenWithBottomPromo", 7, R.id.fullscreen_with_bottom_promo);
        FullscreenWithBottomPromo = discoveryScreenMotionStates$Landscape8;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape9 = new DiscoveryScreenMotionStates$Landscape("Miniplayer", 8, R.id.collapsed_landscape);
        Miniplayer = discoveryScreenMotionStates$Landscape9;
        DiscoveryScreenMotionStates$Landscape discoveryScreenMotionStates$Landscape10 = new DiscoveryScreenMotionStates$Landscape("Hidden", 9, R.id.hidden_landscape);
        Hidden = discoveryScreenMotionStates$Landscape10;
        DiscoveryScreenMotionStates$Landscape[] discoveryScreenMotionStates$LandscapeArr = {discoveryScreenMotionStates$Landscape, discoveryScreenMotionStates$Landscape2, discoveryScreenMotionStates$Landscape3, discoveryScreenMotionStates$Landscape4, discoveryScreenMotionStates$Landscape5, discoveryScreenMotionStates$Landscape6, discoveryScreenMotionStates$Landscape7, discoveryScreenMotionStates$Landscape8, discoveryScreenMotionStates$Landscape9, discoveryScreenMotionStates$Landscape10};
        $VALUES = discoveryScreenMotionStates$LandscapeArr;
        $ENTRIES = new asp(discoveryScreenMotionStates$LandscapeArr);
    }

    public DiscoveryScreenMotionStates$Landscape(String str, int i, int i2) {
        this.constraintStateId = i2;
    }

    public static zrp<DiscoveryScreenMotionStates$Landscape> i() {
        return $ENTRIES;
    }

    public static DiscoveryScreenMotionStates$Landscape valueOf(String str) {
        return (DiscoveryScreenMotionStates$Landscape) Enum.valueOf(DiscoveryScreenMotionStates$Landscape.class, str);
    }

    public static DiscoveryScreenMotionStates$Landscape[] values() {
        return (DiscoveryScreenMotionStates$Landscape[]) $VALUES.clone();
    }

    @Override // xsna.nb30
    public final int h() {
        return this.constraintStateId;
    }
}
