package com.vk.appredirects.entity;

import android.content.ComponentName;
import com.vkontakte.android.R;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: App.kt */
/* loaded from: classes15.dex */
public final class App {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ App[] $VALUES;
    public static final App VK_APP;
    public static final App VK_CALLS;
    public static final App VK_CLIPS;
    public static final App VK_DATING;
    public static final App VK_ME;
    public static final App VK_MUSIC;
    public static final App VK_TV;
    public static final App VK_VIDEO;
    private final int iconResId;
    private final String providerAuthority;
    private final ComponentName redirectComponent;

    static {
        App app2 = new App("VK_APP", 0, "com.vkontakte.android.vk_app_redirect_provider", new ComponentName("com.vkontakte.android", "com.vkontakte.android.LinkRedirActivity"), R.drawable.vk_icon_logo_vk_color_large_32);
        VK_APP = app2;
        App app3 = new App("VK_ME", 1, "com.vkontakte.android.vk_me_redirect_provider", new ComponentName("com.vk.im", "com.vk.links.ImLinkRedirActivity"), R.drawable.vk_icon_logo_vk_me_icon_96);
        VK_ME = app3;
        App app4 = new App("VK_CALLS", 2, "com.vkontakte.android.vk_calls_redirect_provider", new ComponentName("com.vk.calls", "com.vk.calls.link.CallsLinkRedirActivity"), R.drawable.vk_icon_logo_vk_calls_color_32);
        VK_CALLS = app4;
        App app5 = new App("VK_CLIPS", 3, "com.vkontakte.android.vk_clips_redirect_provider", new ComponentName("com.vk.clips", "com.vk.clips.links.ClipsLinkRedirActivity"), R.drawable.vk_icon_logo_vk_clips_color_32);
        VK_CLIPS = app5;
        App app6 = new App("VK_VIDEO", 4, "com.vkontakte.android.vk_video_redirect_provider", new ComponentName("com.vk.vkvideo", "com.vk.video.features.links.VkVideoLinkRedirActivity"), R.drawable.vk_icon_logo_vk_video_color_28);
        VK_VIDEO = app6;
        App app7 = new App("VK_TV", 5, "com.vk.tv.vk_tv_redirect_provider", new ComponentName("com.vk.tv", "com.vk.tv.presentation.base.links.TvLinkRedirectActivity"), R.drawable.vk_icon_logo_vk_video_color_56);
        VK_TV = app7;
        App app8 = new App("VK_DATING", 6, "com.vkontakte.android.vk_dating_redirect_provider", new ComponentName("com.vk.love", "com.vk.dating.bridges.links.VkDatingLinkRedirectActivity"), R.drawable.vk_icon_logo_vk_dating_80_color);
        VK_DATING = app8;
        App app9 = new App("VK_MUSIC", 7, "com.vkontakte.android.vk_music_redirect_provider", new ComponentName("com.uma.musicvk", "com.vk.music.link.VkMusicLinkRedirectActivity"), R.drawable.vk_icon_logo_vk_music_color_28);
        VK_MUSIC = app9;
        App[] appArr = {app2, app3, app4, app5, app6, app7, app8, app9};
        $VALUES = appArr;
        $ENTRIES = new asp(appArr);
    }

    public App(String str, int i, String str2, ComponentName componentName, int i2) {
        this.providerAuthority = str2;
        this.redirectComponent = componentName;
        this.iconResId = i2;
    }

    public static App valueOf(String str) {
        return (App) Enum.valueOf(App.class, str);
    }

    public static App[] values() {
        return (App[]) $VALUES.clone();
    }

    public final int h() {
        return this.iconResId;
    }

    public final String i() {
        return this.providerAuthority;
    }

    public final ComponentName j() {
        return this.redirectComponent;
    }
}
