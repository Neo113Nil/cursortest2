package com.vk.community.design.view.components.compose;

import com.vungle.ads.internal.protos.Sdk;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityCard.kt */
/* loaded from: classes17.dex */
public final class CommunityCardMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityCardMode[] $VALUES;
    public static final CommunityCardMode Square;
    public static final CommunityCardMode Vertical;
    public static final CommunityCardMode VideoSquare;
    private final float cardWidth;
    private final float imageAspectRatio;

    static {
        float f = Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE;
        CommunityCardMode communityCardMode = new CommunityCardMode("Vertical", f, 0.75714284f, 0);
        Vertical = communityCardMode;
        CommunityCardMode communityCardMode2 = new CommunityCardMode("Square", f, 1.0f, 1);
        Square = communityCardMode2;
        CommunityCardMode communityCardMode3 = new CommunityCardMode("VideoSquare", 154, 1.0f, 2);
        VideoSquare = communityCardMode3;
        CommunityCardMode[] communityCardModeArr = {communityCardMode, communityCardMode2, communityCardMode3};
        $VALUES = communityCardModeArr;
        $ENTRIES = new asp(communityCardModeArr);
    }

    public CommunityCardMode(String str, float f, float f2, int i) {
        this.cardWidth = f;
        this.imageAspectRatio = f2;
    }

    public static CommunityCardMode valueOf(String str) {
        return (CommunityCardMode) Enum.valueOf(CommunityCardMode.class, str);
    }

    public static CommunityCardMode[] values() {
        return (CommunityCardMode[]) $VALUES.clone();
    }

    public final float h() {
        return this.cardWidth;
    }

    public final float i() {
        return this.imageAspectRatio;
    }
}
