package com.vk.video.ui.discovery.minimizable.motion.scene.light.node;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.uoy;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiscoveryLayoutNodes.kt */
/* loaded from: classes7.dex */
public final class DiscoveryLayoutNodes implements uoy {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ DiscoveryLayoutNodes[] $VALUES;
    public static final DiscoveryLayoutNodes AboutVideoFullscreenRecycler;
    public static final DiscoveryLayoutNodes BottomPromoContainer;
    public static final DiscoveryLayoutNodes ContentContainer;
    public static final DiscoveryLayoutNodes ContentContainerBackground;
    public static final DiscoveryLayoutNodes CoverOverlayView;
    public static final DiscoveryLayoutNodes DialogContainer;
    public static final DiscoveryLayoutNodes FragmentContainerShadow;
    public static final DiscoveryLayoutNodes PlayerContainer;
    public static final DiscoveryLayoutNodes PlayerContainerShadow;
    public static final DiscoveryLayoutNodes RightPromoContainer;
    public static final DiscoveryLayoutNodes SliderContentContainer;
    public static final DiscoveryLayoutNodes SliderHeaderContainer;
    public static final DiscoveryLayoutNodes TabletRecommendationsBackground;
    public static final DiscoveryLayoutNodes TabletRecommendationsContainer;
    public static final DiscoveryLayoutNodes TouchSeekZone;
    private final int id;

    static {
        DiscoveryLayoutNodes discoveryLayoutNodes = new DiscoveryLayoutNodes("FragmentContainerShadow", 0, R.id.mainFragmentContainerShadow);
        FragmentContainerShadow = discoveryLayoutNodes;
        DiscoveryLayoutNodes discoveryLayoutNodes2 = new DiscoveryLayoutNodes("ContentContainerBackground", 1, R.id.relatedVideoItemsBackground);
        ContentContainerBackground = discoveryLayoutNodes2;
        DiscoveryLayoutNodes discoveryLayoutNodes3 = new DiscoveryLayoutNodes("ContentContainer", 2, R.id.contentContainer);
        ContentContainer = discoveryLayoutNodes3;
        DiscoveryLayoutNodes discoveryLayoutNodes4 = new DiscoveryLayoutNodes("TabletRecommendationsBackground", 3, R.id.tabletRecommendationsBackground);
        TabletRecommendationsBackground = discoveryLayoutNodes4;
        DiscoveryLayoutNodes discoveryLayoutNodes5 = new DiscoveryLayoutNodes("TabletRecommendationsContainer", 4, R.id.tabletRecommendationsContainer);
        TabletRecommendationsContainer = discoveryLayoutNodes5;
        DiscoveryLayoutNodes discoveryLayoutNodes6 = new DiscoveryLayoutNodes("PlayerContainer", 5, R.id.playerContainer);
        PlayerContainer = discoveryLayoutNodes6;
        DiscoveryLayoutNodes discoveryLayoutNodes7 = new DiscoveryLayoutNodes("PlayerContainerShadow", 6, R.id.playerShadow);
        PlayerContainerShadow = discoveryLayoutNodes7;
        DiscoveryLayoutNodes discoveryLayoutNodes8 = new DiscoveryLayoutNodes("RightPromoContainer", 7, R.id.rightPromoContainer);
        RightPromoContainer = discoveryLayoutNodes8;
        DiscoveryLayoutNodes discoveryLayoutNodes9 = new DiscoveryLayoutNodes("BottomPromoContainer", 8, R.id.bottomPromoContainer);
        BottomPromoContainer = discoveryLayoutNodes9;
        DiscoveryLayoutNodes discoveryLayoutNodes10 = new DiscoveryLayoutNodes("SliderHeaderContainer", 9, R.id.similar_slider_header);
        SliderHeaderContainer = discoveryLayoutNodes10;
        DiscoveryLayoutNodes discoveryLayoutNodes11 = new DiscoveryLayoutNodes("SliderContentContainer", 10, R.id.similar_slider);
        SliderContentContainer = discoveryLayoutNodes11;
        DiscoveryLayoutNodes discoveryLayoutNodes12 = new DiscoveryLayoutNodes("DialogContainer", 11, R.id.dialogContainer);
        DialogContainer = discoveryLayoutNodes12;
        DiscoveryLayoutNodes discoveryLayoutNodes13 = new DiscoveryLayoutNodes("TouchSeekZone", 12, R.id.touchable_seek_zone);
        TouchSeekZone = discoveryLayoutNodes13;
        DiscoveryLayoutNodes discoveryLayoutNodes14 = new DiscoveryLayoutNodes("CoverOverlayView", 13, R.id.cover_overlay_view);
        CoverOverlayView = discoveryLayoutNodes14;
        DiscoveryLayoutNodes discoveryLayoutNodes15 = new DiscoveryLayoutNodes("AboutVideoFullscreenRecycler", 14, R.id.about_video_fullscreen_recycler);
        AboutVideoFullscreenRecycler = discoveryLayoutNodes15;
        DiscoveryLayoutNodes[] discoveryLayoutNodesArr = {discoveryLayoutNodes, discoveryLayoutNodes2, discoveryLayoutNodes3, discoveryLayoutNodes4, discoveryLayoutNodes5, discoveryLayoutNodes6, discoveryLayoutNodes7, discoveryLayoutNodes8, discoveryLayoutNodes9, discoveryLayoutNodes10, discoveryLayoutNodes11, discoveryLayoutNodes12, discoveryLayoutNodes13, discoveryLayoutNodes14, discoveryLayoutNodes15};
        $VALUES = discoveryLayoutNodesArr;
        $ENTRIES = new asp(discoveryLayoutNodesArr);
    }

    public DiscoveryLayoutNodes(String str, int i, int i2) {
        this.id = i2;
    }

    public static DiscoveryLayoutNodes valueOf(String str) {
        return (DiscoveryLayoutNodes) Enum.valueOf(DiscoveryLayoutNodes.class, str);
    }

    public static DiscoveryLayoutNodes[] values() {
        return (DiscoveryLayoutNodes[]) $VALUES.clone();
    }
}
