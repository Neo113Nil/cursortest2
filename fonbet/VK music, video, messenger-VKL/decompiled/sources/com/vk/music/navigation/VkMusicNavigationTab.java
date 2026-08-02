package com.vk.music.navigation;

import android.net.Uri;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Locale;
import xsna.asp;
import xsna.epx;
import xsna.jeq0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VkMusicNavigationTab.kt */
/* loaded from: classes3.dex */
public final class VkMusicNavigationTab {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VkMusicNavigationTab[] $VALUES;
    public static final a Companion;
    public static final VkMusicNavigationTab EXPLORE;
    public static final VkMusicNavigationTab GENERAL;
    public static final VkMusicNavigationTab KIDS;
    public static final VkMusicNavigationTab MY_MUSIC;
    public static final VkMusicNavigationTab PODCASTS;
    public static final VkMusicNavigationTab RADIO;
    private final String iconId;
    private final String sectionName;
    private final int titleResId;

    /* compiled from: VkMusicNavigationTab.kt */
    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x003b A[EDGE_INSN: B:21:0x003b->B:17:0x003b BREAK  A[LOOP:0: B:11:0x0023->B:20:?], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static VkMusicNavigationTab a(String str) {
            String str2;
            Iterator<E> it;
            Uri g;
            String str3;
            Object obj = null;
            if (str != null && (g = jeq0.g(str)) != null) {
                try {
                    str3 = g.getQueryParameter("section");
                } catch (Exception unused) {
                    str3 = null;
                }
                if (str3 != null) {
                    str2 = str3.toLowerCase(Locale.ROOT);
                    it = VkMusicNavigationTab.h().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (epx.f(((VkMusicNavigationTab) next).i(), str2)) {
                            obj = next;
                            break;
                        }
                    }
                    return (VkMusicNavigationTab) obj;
                }
            }
            str2 = null;
            it = VkMusicNavigationTab.h().iterator();
            while (true) {
                if (it.hasNext()) {
                }
            }
            return (VkMusicNavigationTab) obj;
        }
    }

    static {
        VkMusicNavigationTab vkMusicNavigationTab = new VkMusicNavigationTab(0, R.string.navigation_tab_general, "GENERAL", "note_music_sa_28", "general");
        GENERAL = vkMusicNavigationTab;
        VkMusicNavigationTab vkMusicNavigationTab2 = new VkMusicNavigationTab(1, R.string.navigation_tab_explore, "EXPLORE", "compass_music_sa_28", "explore");
        EXPLORE = vkMusicNavigationTab2;
        VkMusicNavigationTab vkMusicNavigationTab3 = new VkMusicNavigationTab(2, R.string.navigation_tab_books, "PODCASTS", "podcast_books_music_sa_28", "podcasts");
        PODCASTS = vkMusicNavigationTab3;
        VkMusicNavigationTab vkMusicNavigationTab4 = new VkMusicNavigationTab(3, R.string.navigation_tab_kids, "KIDS", "horse_toy_music_sa_28", "audio_kids");
        KIDS = vkMusicNavigationTab4;
        VkMusicNavigationTab vkMusicNavigationTab5 = new VkMusicNavigationTab(4, R.string.navigation_tab_radio, "RADIO", "radio_music_sa_28", "radiostations");
        RADIO = vkMusicNavigationTab5;
        VkMusicNavigationTab vkMusicNavigationTab6 = new VkMusicNavigationTab(5, R.string.navigation_tab_my_music, "MY_MUSIC", "heart_list_music_sa_28", "all");
        MY_MUSIC = vkMusicNavigationTab6;
        VkMusicNavigationTab[] vkMusicNavigationTabArr = {vkMusicNavigationTab, vkMusicNavigationTab2, vkMusicNavigationTab3, vkMusicNavigationTab4, vkMusicNavigationTab5, vkMusicNavigationTab6};
        $VALUES = vkMusicNavigationTabArr;
        $ENTRIES = new asp(vkMusicNavigationTabArr);
        Companion = new a();
    }

    public VkMusicNavigationTab(int i, int i2, String str, String str2, String str3) {
        this.iconId = str2;
        this.sectionName = str3;
        this.titleResId = i2;
    }

    public static zrp<VkMusicNavigationTab> h() {
        return $ENTRIES;
    }

    public static VkMusicNavigationTab valueOf(String str) {
        return (VkMusicNavigationTab) Enum.valueOf(VkMusicNavigationTab.class, str);
    }

    public static VkMusicNavigationTab[] values() {
        return (VkMusicNavigationTab[]) $VALUES.clone();
    }

    public final String i() {
        return this.sectionName;
    }
}
