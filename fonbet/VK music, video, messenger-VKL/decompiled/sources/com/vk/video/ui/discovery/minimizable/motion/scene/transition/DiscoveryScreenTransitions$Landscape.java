package com.vk.video.ui.discovery.minimizable.motion.scene.transition;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.nmp0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryScreenTransitions.kt */
/* loaded from: classes7.dex */
public final class DiscoveryScreenTransitions$Landscape implements nmp0 {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoveryScreenTransitions$Landscape[] $VALUES;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryToDiscoveryWithDialog;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryToFullscreen;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryToHidden;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryToMiniplayer;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryToPreparedToPip;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryWithDialogToFullscreen;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryWithDialogToHidden;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryWithDialogToMiniplayer;
    public static final DiscoveryScreenTransitions$Landscape DiscoveryWithDialogToPreparedPip;
    public static final DiscoveryScreenTransitions$Landscape FullscreenToFullscreenWithBottomPromo;
    public static final DiscoveryScreenTransitions$Landscape FullscreenToFullscreenWithDialog;
    public static final DiscoveryScreenTransitions$Landscape FullscreenToFullscreenWithRightPromo;
    public static final DiscoveryScreenTransitions$Landscape FullscreenToFullscreenWithSimilar;
    public static final DiscoveryScreenTransitions$Landscape FullscreenToHidden;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithBottomPromoToDiscoverWithDialog;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithBottomPromoToDiscovery;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithBottomPromoToFullscreenWithDialog;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithBottomPromoToHidden;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithDialogToHidden;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithRightPromoToDiscovery;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithRightPromoToDiscoveryWithDialog;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithRightPromoToFullscreenWithDialog;
    public static final DiscoveryScreenTransitions$Landscape FullscreenWithRightPromoToHidden;
    public static final DiscoveryScreenTransitions$Landscape MiniplayerToFullscreen;
    public static final DiscoveryScreenTransitions$Landscape MiniplayerToFullscreenWithBottomPromo;
    public static final DiscoveryScreenTransitions$Landscape MiniplayerToFullscreenWithDialog;
    public static final DiscoveryScreenTransitions$Landscape MiniplayerToFullscreenWithRightPromo;
    public static final DiscoveryScreenTransitions$Landscape MiniplayerToHidden;
    private final int motionTransitionId;

    static {
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape = new DiscoveryScreenTransitions$Landscape("DiscoveryToHidden", 0, R.id.from_expanded_landscape_tablet_to_hidden_landscape);
        DiscoveryToHidden = discoveryScreenTransitions$Landscape;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape2 = new DiscoveryScreenTransitions$Landscape("DiscoveryWithDialogToHidden", 1, R.id.from_expanded_landscape_tablet_with_dialog_to_hidden_landscape);
        DiscoveryWithDialogToHidden = discoveryScreenTransitions$Landscape2;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape3 = new DiscoveryScreenTransitions$Landscape("DiscoveryToMiniplayer", 2, R.id.from_expanded_landscape_tablet_to_collapsed_landscape);
        DiscoveryToMiniplayer = discoveryScreenTransitions$Landscape3;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape4 = new DiscoveryScreenTransitions$Landscape("DiscoveryToPreparedToPip", 3, R.id.from_expanded_landscape_tablet_to_prepared_to_pip_landscape);
        DiscoveryToPreparedToPip = discoveryScreenTransitions$Landscape4;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape5 = new DiscoveryScreenTransitions$Landscape("DiscoveryToDiscoveryWithDialog", 4, R.id.from_expanded_landscape_tablet_to_expanded_landscape_tablet_with_dialog);
        DiscoveryToDiscoveryWithDialog = discoveryScreenTransitions$Landscape5;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape6 = new DiscoveryScreenTransitions$Landscape("DiscoveryWithDialogToMiniplayer", 5, R.id.from_expanded_landscape_tablet_with_dialog_to_collapsed_landscape);
        DiscoveryWithDialogToMiniplayer = discoveryScreenTransitions$Landscape6;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape7 = new DiscoveryScreenTransitions$Landscape("DiscoveryWithDialogToPreparedPip", 6, R.id.from_expanded_landscape_tablet_with_dialog_to_prepared_to_pip_landscape);
        DiscoveryWithDialogToPreparedPip = discoveryScreenTransitions$Landscape7;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape8 = new DiscoveryScreenTransitions$Landscape("DiscoveryToFullscreen", 7, R.id.from_expanded_landscape_tablet_to_fullscreen);
        DiscoveryToFullscreen = discoveryScreenTransitions$Landscape8;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape9 = new DiscoveryScreenTransitions$Landscape("DiscoveryWithDialogToFullscreen", 8, R.id.from_expanded_landscape_tablet_with_dialog_to_fullscreen);
        DiscoveryWithDialogToFullscreen = discoveryScreenTransitions$Landscape9;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape10 = new DiscoveryScreenTransitions$Landscape("MiniplayerToHidden", 9, R.id.from_collapsed_landscape_to_hidden_landscape);
        MiniplayerToHidden = discoveryScreenTransitions$Landscape10;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape11 = new DiscoveryScreenTransitions$Landscape("FullscreenToFullscreenWithDialog", 10, R.id.from_fullscreen_to_fullscreen_with_dialog);
        FullscreenToFullscreenWithDialog = discoveryScreenTransitions$Landscape11;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape12 = new DiscoveryScreenTransitions$Landscape("FullscreenToFullscreenWithRightPromo", 11, R.id.from_fullscreen_to_fullscreen_with_right_promo);
        FullscreenToFullscreenWithRightPromo = discoveryScreenTransitions$Landscape12;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape13 = new DiscoveryScreenTransitions$Landscape("FullscreenToFullscreenWithBottomPromo", 12, R.id.from_fullscreen_to_fullscreen_with_bottom_promo);
        FullscreenToFullscreenWithBottomPromo = discoveryScreenTransitions$Landscape13;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape14 = new DiscoveryScreenTransitions$Landscape("MiniplayerToFullscreen", 13, R.id.from_collapsed_landscape_to_fullscreen);
        MiniplayerToFullscreen = discoveryScreenTransitions$Landscape14;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape15 = new DiscoveryScreenTransitions$Landscape("MiniplayerToFullscreenWithDialog", 14, R.id.from_collapsed_landscape_to_fullscreen_with_dialog);
        MiniplayerToFullscreenWithDialog = discoveryScreenTransitions$Landscape15;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape16 = new DiscoveryScreenTransitions$Landscape("MiniplayerToFullscreenWithRightPromo", 15, R.id.from_collapsed_landscape_to_fullscreen_with_right_promo);
        MiniplayerToFullscreenWithRightPromo = discoveryScreenTransitions$Landscape16;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape17 = new DiscoveryScreenTransitions$Landscape("MiniplayerToFullscreenWithBottomPromo", 16, R.id.from_collapsed_landscape_to_fullscreen_with_bottom_promo);
        MiniplayerToFullscreenWithBottomPromo = discoveryScreenTransitions$Landscape17;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape18 = new DiscoveryScreenTransitions$Landscape("FullscreenToHidden", 17, R.id.from_fullscreen_to_hidden_landscape);
        FullscreenToHidden = discoveryScreenTransitions$Landscape18;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape19 = new DiscoveryScreenTransitions$Landscape("FullscreenToFullscreenWithSimilar", 18, R.id.from_fullscreen_to_fullscreen_with_similar_slider);
        FullscreenToFullscreenWithSimilar = discoveryScreenTransitions$Landscape19;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape20 = new DiscoveryScreenTransitions$Landscape("FullscreenWithDialogToHidden", 19, R.id.from_fullscreen_with_dialog_to_hidden_landscape);
        FullscreenWithDialogToHidden = discoveryScreenTransitions$Landscape20;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape21 = new DiscoveryScreenTransitions$Landscape("FullscreenWithRightPromoToHidden", 20, R.id.from_fullscreen_with_right_promo_to_hidden_landscape);
        FullscreenWithRightPromoToHidden = discoveryScreenTransitions$Landscape21;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape22 = new DiscoveryScreenTransitions$Landscape("FullscreenWithRightPromoToFullscreenWithDialog", 21, R.id.from_fullscreen_with_right_promo_to_fullscreen_with_dialog);
        FullscreenWithRightPromoToFullscreenWithDialog = discoveryScreenTransitions$Landscape22;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape23 = new DiscoveryScreenTransitions$Landscape("FullscreenWithRightPromoToDiscovery", 22, R.id.from_fullscreen_with_right_promo_to_expanded_landscape_tablet);
        FullscreenWithRightPromoToDiscovery = discoveryScreenTransitions$Landscape23;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape24 = new DiscoveryScreenTransitions$Landscape("FullscreenWithRightPromoToDiscoveryWithDialog", 23, R.id.from_fullscreen_with_right_promo_to_expanded_landscape_tablet_with_dialog);
        FullscreenWithRightPromoToDiscoveryWithDialog = discoveryScreenTransitions$Landscape24;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape25 = new DiscoveryScreenTransitions$Landscape("FullscreenWithBottomPromoToHidden", 24, R.id.from_fullscreen_with_bottom_promo_to_hidden_landscape);
        FullscreenWithBottomPromoToHidden = discoveryScreenTransitions$Landscape25;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape26 = new DiscoveryScreenTransitions$Landscape("FullscreenWithBottomPromoToFullscreenWithDialog", 25, R.id.from_fullscreen_with_bottom_promo_to_fullscreen_with_dialog);
        FullscreenWithBottomPromoToFullscreenWithDialog = discoveryScreenTransitions$Landscape26;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape27 = new DiscoveryScreenTransitions$Landscape("FullscreenWithBottomPromoToDiscovery", 26, R.id.from_fullscreen_with_bottom_promo_to_expanded_landscape_tablet);
        FullscreenWithBottomPromoToDiscovery = discoveryScreenTransitions$Landscape27;
        DiscoveryScreenTransitions$Landscape discoveryScreenTransitions$Landscape28 = new DiscoveryScreenTransitions$Landscape("FullscreenWithBottomPromoToDiscoverWithDialog", 27, R.id.from_fullscreen_with_bottom_promo_to_expanded_landscape_tablet_with_dialog);
        FullscreenWithBottomPromoToDiscoverWithDialog = discoveryScreenTransitions$Landscape28;
        DiscoveryScreenTransitions$Landscape[] discoveryScreenTransitions$LandscapeArr = {discoveryScreenTransitions$Landscape, discoveryScreenTransitions$Landscape2, discoveryScreenTransitions$Landscape3, discoveryScreenTransitions$Landscape4, discoveryScreenTransitions$Landscape5, discoveryScreenTransitions$Landscape6, discoveryScreenTransitions$Landscape7, discoveryScreenTransitions$Landscape8, discoveryScreenTransitions$Landscape9, discoveryScreenTransitions$Landscape10, discoveryScreenTransitions$Landscape11, discoveryScreenTransitions$Landscape12, discoveryScreenTransitions$Landscape13, discoveryScreenTransitions$Landscape14, discoveryScreenTransitions$Landscape15, discoveryScreenTransitions$Landscape16, discoveryScreenTransitions$Landscape17, discoveryScreenTransitions$Landscape18, discoveryScreenTransitions$Landscape19, discoveryScreenTransitions$Landscape20, discoveryScreenTransitions$Landscape21, discoveryScreenTransitions$Landscape22, discoveryScreenTransitions$Landscape23, discoveryScreenTransitions$Landscape24, discoveryScreenTransitions$Landscape25, discoveryScreenTransitions$Landscape26, discoveryScreenTransitions$Landscape27, discoveryScreenTransitions$Landscape28};
        $VALUES = discoveryScreenTransitions$LandscapeArr;
        $ENTRIES = new asp(discoveryScreenTransitions$LandscapeArr);
    }

    public DiscoveryScreenTransitions$Landscape(String str, int i, int i2) {
        this.motionTransitionId = i2;
    }

    public static zrp<DiscoveryScreenTransitions$Landscape> i() {
        return $ENTRIES;
    }

    public static DiscoveryScreenTransitions$Landscape valueOf(String str) {
        return (DiscoveryScreenTransitions$Landscape) Enum.valueOf(DiscoveryScreenTransitions$Landscape.class, str);
    }

    public static DiscoveryScreenTransitions$Landscape[] values() {
        return (DiscoveryScreenTransitions$Landscape[]) $VALUES.clone();
    }

    @Override // xsna.nmp0
    public final int h() {
        return this.motionTransitionId;
    }
}
