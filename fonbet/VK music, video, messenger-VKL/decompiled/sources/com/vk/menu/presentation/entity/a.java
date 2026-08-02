package com.vk.menu.presentation.entity;

import android.content.Context;
import com.vk.menu.presentation.entity.TabMenuItemUiData;
import com.vk.metrics.eventtracking.b;
import com.vk.superapp.SuperAppFeatures;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.a68;
import xsna.e43;
import xsna.g620;
import xsna.g80;
import xsna.gbg0;
import xsna.k820;
import xsna.msy;

/* compiled from: MenuUiDataUtils.kt */
/* loaded from: classes.dex */
public final class a implements k820 {
    public static InterfaceC1268a b;
    public static final a a = new a();
    public static final Object c = msy.a(LazyThreadSafetyMode.NONE, new a68(7));
    public static final List<Integer> d = Collections.singletonList(Integer.valueOf(TabMenuItemUiData.MANAGED_GROUP.h()));

    /* compiled from: MenuUiDataUtils.kt */
    /* renamed from: com.vk.menu.presentation.entity.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC1268a {
        int M(int i);
    }

    public static int g(int i) {
        if (i == R.id.menu_feedback) {
            return g620.h();
        }
        if (i == R.id.menu_messages) {
            return g620.g();
        }
        if (i == R.id.menu_friends) {
            return g620.g;
        }
        if (i == R.id.menu_groups) {
            return g620.l;
        }
        if (i == R.id.menu_photos) {
            return g620.h;
        }
        if (i == R.id.menu_videos) {
            return g620.i;
        }
        if (i == R.id.menu_games) {
            return g620.j;
        }
        if (i == R.id.menu_support) {
            return g620.m;
        }
        if (i == R.id.menu_vk_pay) {
            return g620.n;
        }
        if (i == R.id.menu_fave) {
            return g620.r;
        }
        if (i == R.id.menu_market_orders) {
            return g620.v;
        }
        if (i == R.id.menu_calls) {
            return g620.w;
        }
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.k820
    public final List<String> a(SuperAppFeatures.RequestName requestName) {
        return ((g80) c.getValue()).a(requestName);
    }

    @Override // xsna.k820
    public final boolean b(int i) {
        return d.contains(Integer.valueOf(i));
    }

    @Override // xsna.k820
    public final int c(int i) {
        if (i == TabMenuItemUiData.HOME.h()) {
            return R.drawable.vk_icon_home_outline_28;
        }
        if (i == TabMenuItemUiData.HUB.h()) {
            return R.drawable.vk_icon_menu_outline_28;
        }
        if (i == TabMenuItemUiData.IM.h()) {
            return R.drawable.vk_icon_message_outline_28;
        }
        if (i == TabMenuItemUiData.CLIPS.h()) {
            return R.drawable.vk_icon_logo_clips_outline_28;
        }
        if (i == TabMenuItemUiData.FRIENDS.h()) {
            return R.drawable.vk_icon_users_outline_28;
        }
        if (i == TabMenuItemUiData.GROUPS.h()) {
            return R.drawable.vk_icon_users_3_outline_28;
        }
        if (i == TabMenuItemUiData.MUSIC.h()) {
            return R.drawable.vk_icon_music_outline_28;
        }
        if (i == TabMenuItemUiData.PROFILE.h()) {
            return R.drawable.vk_icon_profile_28;
        }
        if (i == TabMenuItemUiData.FEEDBACK.h()) {
            return R.drawable.vk_icon_notifications_28;
        }
        if (i == TabMenuItemUiData.VIDEO.h()) {
            return R.drawable.vk_icon_video_square_outline_28;
        }
        if (i == TabMenuItemUiData.GAMES.h()) {
            return R.drawable.vk_icon_game_outline_28;
        }
        if (i == TabMenuItemUiData.OVERVIEW.h()) {
            return R.drawable.vk_icon_search_outline_28;
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String b2 = gbg0.b(context.getResources(), i);
        b.a.a(new IllegalArgumentException("Unknown tabs item id: '" + b2 + "' (" + i + ')'));
        return 0;
    }

    @Override // xsna.k820
    public final List<Integer> d() {
        return d;
    }

    @Override // xsna.k820
    public final Integer e(String str) {
        TabMenuItemUiData.Companion.getClass();
        TabMenuItemUiData b2 = TabMenuItemUiData.a.b(str);
        if (b2 != null) {
            return Integer.valueOf(b2.h());
        }
        return null;
    }

    @Override // xsna.k820
    public final int f(int i) {
        if (i == TabMenuItemUiData.HOME.h()) {
            return R.string.newsfeed_header_title;
        }
        if (i == TabMenuItemUiData.HUB.h()) {
            return R.string.menu_apps;
        }
        if (i == TabMenuItemUiData.IM.h()) {
            return R.string.menu_im;
        }
        if (i == TabMenuItemUiData.CLIPS.h()) {
            return R.string.clips_title;
        }
        if (i == TabMenuItemUiData.FRIENDS.h()) {
            return R.string.friends;
        }
        if (i == TabMenuItemUiData.GROUPS.h()) {
            return R.string.groups;
        }
        if (i == TabMenuItemUiData.MUSIC.h()) {
            return R.string.music;
        }
        if (i == TabMenuItemUiData.PROFILE.h()) {
            return R.string.profile;
        }
        if (i == TabMenuItemUiData.FEEDBACK.h()) {
            return R.string.not_notifications;
        }
        if (i == TabMenuItemUiData.VIDEO.h()) {
            return R.string.video_title;
        }
        if (i == TabMenuItemUiData.OVERVIEW.h()) {
            return R.string.search;
        }
        if (i == TabMenuItemUiData.GAMES.h()) {
            return R.string.games;
        }
        if (i == TabMenuItemUiData.MANAGED_GROUP.h()) {
            return R.string.menu_managed_group;
        }
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        String b2 = gbg0.b(context.getResources(), i);
        b.a.a(new IllegalArgumentException("Unknown tabs item id: '" + b2 + "' (" + i + ')'));
        return 0;
    }
}
