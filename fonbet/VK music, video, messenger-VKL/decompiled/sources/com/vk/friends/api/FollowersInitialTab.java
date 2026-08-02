package com.vk.friends.api;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FollowersInitialTab.kt */
/* loaded from: classes11.dex */
public final class FollowersInitialTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ FollowersInitialTab[] $VALUES;
    public static final FollowersInitialTab FOLLOWERS;
    public static final FollowersInitialTab FRIENDS;
    public static final FollowersInitialTab MUTUAL;
    public static final FollowersInitialTab ONLINE;

    static {
        FollowersInitialTab followersInitialTab = new FollowersInitialTab(Privacy.FRIENDS, 0);
        FRIENDS = followersInitialTab;
        FollowersInitialTab followersInitialTab2 = new FollowersInitialTab("ONLINE", 1);
        ONLINE = followersInitialTab2;
        FollowersInitialTab followersInitialTab3 = new FollowersInitialTab("MUTUAL", 2);
        MUTUAL = followersInitialTab3;
        FollowersInitialTab followersInitialTab4 = new FollowersInitialTab("FOLLOWERS", 3);
        FOLLOWERS = followersInitialTab4;
        FollowersInitialTab[] followersInitialTabArr = {followersInitialTab, followersInitialTab2, followersInitialTab3, followersInitialTab4};
        $VALUES = followersInitialTabArr;
        $ENTRIES = new asp(followersInitialTabArr);
    }

    public FollowersInitialTab() {
        throw null;
    }

    public static FollowersInitialTab valueOf(String str) {
        return (FollowersInitialTab) Enum.valueOf(FollowersInitialTab.class, str);
    }

    public static FollowersInitialTab[] values() {
        return (FollowersInitialTab[]) $VALUES.clone();
    }
}
