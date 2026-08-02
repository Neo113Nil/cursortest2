package com.vk.stat.scheme;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import ru.ok.android.webrtc.Privacy;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MobileOfficialAppsTabbarStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsTabbarStat$TabbarItemName {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MobileOfficialAppsTabbarStat$TabbarItemName[] $VALUES;

    @pmi0("clips")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName CLIPS;

    @pmi0("empty")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName EMPTY;

    @pmi0("friends")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName FRIENDS;

    @pmi0("games")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName GAMES;

    @pmi0("groups")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName GROUPS;

    @pmi0("home")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName HOME;

    @pmi0("hub")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName HUB;

    @pmi0("im")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName IM;

    @pmi0("managed_group")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName MANAGED_GROUP;

    @pmi0("music")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName MUSIC;

    @pmi0("overview")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName OVERVIEW;

    @pmi0(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE)
    public static final MobileOfficialAppsTabbarStat$TabbarItemName PROFILE;

    @pmi0("video")
    public static final MobileOfficialAppsTabbarStat$TabbarItemName VIDEO;

    static {
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName = new MobileOfficialAppsTabbarStat$TabbarItemName("HOME", 0);
        HOME = mobileOfficialAppsTabbarStat$TabbarItemName;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName2 = new MobileOfficialAppsTabbarStat$TabbarItemName("IM", 1);
        IM = mobileOfficialAppsTabbarStat$TabbarItemName2;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName3 = new MobileOfficialAppsTabbarStat$TabbarItemName("HUB", 2);
        HUB = mobileOfficialAppsTabbarStat$TabbarItemName3;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName4 = new MobileOfficialAppsTabbarStat$TabbarItemName("OVERVIEW", 3);
        OVERVIEW = mobileOfficialAppsTabbarStat$TabbarItemName4;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName5 = new MobileOfficialAppsTabbarStat$TabbarItemName("PROFILE", 4);
        PROFILE = mobileOfficialAppsTabbarStat$TabbarItemName5;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName6 = new MobileOfficialAppsTabbarStat$TabbarItemName(SignalingProtocol.MEDIA_OPTION_VIDEO, 5);
        VIDEO = mobileOfficialAppsTabbarStat$TabbarItemName6;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName7 = new MobileOfficialAppsTabbarStat$TabbarItemName("CLIPS", 6);
        CLIPS = mobileOfficialAppsTabbarStat$TabbarItemName7;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName8 = new MobileOfficialAppsTabbarStat$TabbarItemName(Privacy.FRIENDS, 7);
        FRIENDS = mobileOfficialAppsTabbarStat$TabbarItemName8;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName9 = new MobileOfficialAppsTabbarStat$TabbarItemName("GROUPS", 8);
        GROUPS = mobileOfficialAppsTabbarStat$TabbarItemName9;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName10 = new MobileOfficialAppsTabbarStat$TabbarItemName("MUSIC", 9);
        MUSIC = mobileOfficialAppsTabbarStat$TabbarItemName10;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName11 = new MobileOfficialAppsTabbarStat$TabbarItemName("GAMES", 10);
        GAMES = mobileOfficialAppsTabbarStat$TabbarItemName11;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName12 = new MobileOfficialAppsTabbarStat$TabbarItemName("EMPTY", 11);
        EMPTY = mobileOfficialAppsTabbarStat$TabbarItemName12;
        MobileOfficialAppsTabbarStat$TabbarItemName mobileOfficialAppsTabbarStat$TabbarItemName13 = new MobileOfficialAppsTabbarStat$TabbarItemName("MANAGED_GROUP", 12);
        MANAGED_GROUP = mobileOfficialAppsTabbarStat$TabbarItemName13;
        MobileOfficialAppsTabbarStat$TabbarItemName[] mobileOfficialAppsTabbarStat$TabbarItemNameArr = {mobileOfficialAppsTabbarStat$TabbarItemName, mobileOfficialAppsTabbarStat$TabbarItemName2, mobileOfficialAppsTabbarStat$TabbarItemName3, mobileOfficialAppsTabbarStat$TabbarItemName4, mobileOfficialAppsTabbarStat$TabbarItemName5, mobileOfficialAppsTabbarStat$TabbarItemName6, mobileOfficialAppsTabbarStat$TabbarItemName7, mobileOfficialAppsTabbarStat$TabbarItemName8, mobileOfficialAppsTabbarStat$TabbarItemName9, mobileOfficialAppsTabbarStat$TabbarItemName10, mobileOfficialAppsTabbarStat$TabbarItemName11, mobileOfficialAppsTabbarStat$TabbarItemName12, mobileOfficialAppsTabbarStat$TabbarItemName13};
        $VALUES = mobileOfficialAppsTabbarStat$TabbarItemNameArr;
        $ENTRIES = new asp(mobileOfficialAppsTabbarStat$TabbarItemNameArr);
    }

    private MobileOfficialAppsTabbarStat$TabbarItemName(String str, int i) {
    }

    public static zrp<MobileOfficialAppsTabbarStat$TabbarItemName> h() {
        return $ENTRIES;
    }

    public static MobileOfficialAppsTabbarStat$TabbarItemName valueOf(String str) {
        return (MobileOfficialAppsTabbarStat$TabbarItemName) Enum.valueOf(MobileOfficialAppsTabbarStat$TabbarItemName.class, str);
    }

    public static MobileOfficialAppsTabbarStat$TabbarItemName[] values() {
        return (MobileOfficialAppsTabbarStat$TabbarItemName[]) $VALUES.clone();
    }
}
