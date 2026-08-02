package com.vk.voip.ui.watchmovie.selectsource.dialog.ui;

import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VoipSelectMovieViewTabs.kt */
/* loaded from: classes7.dex */
public final class VoipSelectMovieViewTabs {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VoipSelectMovieViewTabs[] $VALUES;
    public static final VoipSelectMovieViewTabs ADDED;
    public static final VoipSelectMovieViewTabs PLAYLISTS;
    public static final VoipSelectMovieViewTabs RECOMMENDED;
    public static final VoipSelectMovieViewTabs UPLOADED;
    public final int titleRes;

    static {
        VoipSelectMovieViewTabs voipSelectMovieViewTabs = new VoipSelectMovieViewTabs("RECOMMENDED", 0, R.string.voip_select_video_tab_recommended);
        RECOMMENDED = voipSelectMovieViewTabs;
        VoipSelectMovieViewTabs voipSelectMovieViewTabs2 = new VoipSelectMovieViewTabs("PLAYLISTS", 1, R.string.voip_select_video_tab_playlists);
        PLAYLISTS = voipSelectMovieViewTabs2;
        VoipSelectMovieViewTabs voipSelectMovieViewTabs3 = new VoipSelectMovieViewTabs("ADDED", 2, R.string.voip_select_video_tab_added);
        ADDED = voipSelectMovieViewTabs3;
        VoipSelectMovieViewTabs voipSelectMovieViewTabs4 = new VoipSelectMovieViewTabs("UPLOADED", 3, R.string.voip_select_video_tab_uploaded);
        UPLOADED = voipSelectMovieViewTabs4;
        VoipSelectMovieViewTabs[] voipSelectMovieViewTabsArr = {voipSelectMovieViewTabs, voipSelectMovieViewTabs2, voipSelectMovieViewTabs3, voipSelectMovieViewTabs4};
        $VALUES = voipSelectMovieViewTabsArr;
        $ENTRIES = new asp(voipSelectMovieViewTabsArr);
    }

    public VoipSelectMovieViewTabs(String str, int i, int i2) {
        this.titleRes = i2;
    }

    public static zrp<VoipSelectMovieViewTabs> h() {
        return $ENTRIES;
    }

    public static VoipSelectMovieViewTabs valueOf(String str) {
        return (VoipSelectMovieViewTabs) Enum.valueOf(VoipSelectMovieViewTabs.class, str);
    }

    public static VoipSelectMovieViewTabs[] values() {
        return (VoipSelectMovieViewTabs[]) $VALUES.clone();
    }
}
