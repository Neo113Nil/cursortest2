package com.vk.profilelist.api;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProfileListTab.kt */
/* loaded from: classes5.dex */
public final class ProfileListTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ProfileListTab[] $VALUES;
    public static final ProfileListTab FOLLOWERS;
    public static final ProfileListTab FRIENDS;
    public static final ProfileListTab GROUP_MEMBERS;
    public static final ProfileListTab SUBSCRIPTIONS;

    static {
        ProfileListTab profileListTab = new ProfileListTab("FOLLOWERS", 0);
        FOLLOWERS = profileListTab;
        ProfileListTab profileListTab2 = new ProfileListTab(Privacy.FRIENDS, 1);
        FRIENDS = profileListTab2;
        ProfileListTab profileListTab3 = new ProfileListTab("SUBSCRIPTIONS", 2);
        SUBSCRIPTIONS = profileListTab3;
        ProfileListTab profileListTab4 = new ProfileListTab("GROUP_MEMBERS", 3);
        GROUP_MEMBERS = profileListTab4;
        ProfileListTab[] profileListTabArr = {profileListTab, profileListTab2, profileListTab3, profileListTab4};
        $VALUES = profileListTabArr;
        $ENTRIES = new asp(profileListTabArr);
    }

    public ProfileListTab() {
        throw null;
    }

    public static ProfileListTab valueOf(String str) {
        return (ProfileListTab) Enum.valueOf(ProfileListTab.class, str);
    }

    public static ProfileListTab[] values() {
        return (ProfileListTab[]) $VALUES.clone();
    }
}
