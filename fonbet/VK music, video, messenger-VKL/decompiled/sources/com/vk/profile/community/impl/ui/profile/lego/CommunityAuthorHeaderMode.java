package com.vk.profile.community.impl.ui.profile.lego;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CommunityAuthorHeaderMode.kt */
/* loaded from: classes5.dex */
public final class CommunityAuthorHeaderMode {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ CommunityAuthorHeaderMode[] $VALUES;
    public static final a Companion;
    public static final CommunityAuthorHeaderMode Legacy;
    public static final CommunityAuthorHeaderMode Lego;

    /* compiled from: CommunityAuthorHeaderMode.kt */
    public static final class a {
    }

    static {
        CommunityAuthorHeaderMode communityAuthorHeaderMode = new CommunityAuthorHeaderMode("Legacy", 0);
        Legacy = communityAuthorHeaderMode;
        CommunityAuthorHeaderMode communityAuthorHeaderMode2 = new CommunityAuthorHeaderMode("Lego", 1);
        Lego = communityAuthorHeaderMode2;
        CommunityAuthorHeaderMode[] communityAuthorHeaderModeArr = {communityAuthorHeaderMode, communityAuthorHeaderMode2};
        $VALUES = communityAuthorHeaderModeArr;
        $ENTRIES = new asp(communityAuthorHeaderModeArr);
        Companion = new a();
    }

    public CommunityAuthorHeaderMode() {
        throw null;
    }

    public static CommunityAuthorHeaderMode valueOf(String str) {
        return (CommunityAuthorHeaderMode) Enum.valueOf(CommunityAuthorHeaderMode.class, str);
    }

    public static CommunityAuthorHeaderMode[] values() {
        return (CommunityAuthorHeaderMode[]) $VALUES.clone();
    }
}
