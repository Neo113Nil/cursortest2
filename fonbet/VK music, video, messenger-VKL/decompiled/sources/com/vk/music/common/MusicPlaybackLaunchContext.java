package com.vk.music.common;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.Ad;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.myc0;
import xsna.pzl;
import xsna.t750;

/* loaded from: classes3.dex */
public final class MusicPlaybackLaunchContext extends Serializer.StreamParcelableAdapter implements t750 {
    public static final MusicPlaybackLaunchContext A;
    public static final MusicPlaybackLaunchContext B;
    public static final MusicPlaybackLaunchContext C;
    public static final Serializer.c<MusicPlaybackLaunchContext> CREATOR;
    public static final MusicPlaybackLaunchContext D;
    public static final MusicPlaybackLaunchContext E;
    public static final MusicPlaybackLaunchContext F;
    public static final MusicPlaybackLaunchContext G;
    public static final MusicPlaybackLaunchContext H;
    public static final MusicPlaybackLaunchContext I;
    public static final MusicPlaybackLaunchContext J;
    public static final MusicPlaybackLaunchContext K;
    public static final MusicPlaybackLaunchContext L;
    public static final MusicPlaybackLaunchContext M;
    public static final MusicPlaybackLaunchContext N;
    public static final MusicPlaybackLaunchContext O;
    public static final MusicPlaybackLaunchContext P;
    public static final MusicPlaybackLaunchContext Q;
    public static final HashMap c;
    public static final MusicPlaybackLaunchContext d;
    public static final MusicPlaybackLaunchContext e;
    public static final MusicPlaybackLaunchContext f;
    public static final MusicPlaybackLaunchContext g;
    public static final MusicPlaybackLaunchContext h;
    public static final MusicPlaybackLaunchContext i;
    public static final MusicPlaybackLaunchContext j;
    public static final MusicPlaybackLaunchContext k;
    public static final MusicPlaybackLaunchContext l;
    public static final MusicPlaybackLaunchContext m;
    public static final MusicPlaybackLaunchContext n;
    public static final MusicPlaybackLaunchContext o;
    public static final MusicPlaybackLaunchContext p;
    public static final MusicPlaybackLaunchContext q;
    public static final MusicPlaybackLaunchContext r;
    public static final MusicPlaybackLaunchContext s;
    public static final MusicPlaybackLaunchContext t;
    public static final MusicPlaybackLaunchContext u;
    public static final MusicPlaybackLaunchContext v;
    public static final MusicPlaybackLaunchContext w;
    public static final MusicPlaybackLaunchContext x;
    public static final MusicPlaybackLaunchContext y;
    public static final MusicPlaybackLaunchContext z;
    public Bundle b;

    public class a extends Serializer.c<MusicPlaybackLaunchContext> {
        @Override // com.vk.core.serialize.Serializer.c
        public final MusicPlaybackLaunchContext a(@NonNull Serializer serializer) {
            MusicPlaybackLaunchContext musicPlaybackLaunchContext = new MusicPlaybackLaunchContext();
            musicPlaybackLaunchContext.b = new Bundle();
            musicPlaybackLaunchContext.b = serializer.o(MusicPlaybackLaunchContext.class.getClassLoader());
            return musicPlaybackLaunchContext;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MusicPlaybackLaunchContext[i];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        d = new MusicPlaybackLaunchContext("other", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = new MusicPlaybackLaunchContext("my_music", 101);
        e = musicPlaybackLaunchContext;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2 = new MusicPlaybackLaunchContext("my_playlists", 101);
        f = musicPlaybackLaunchContext2;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext3 = new MusicPlaybackLaunchContext("my_user_profile", 101);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext4 = new MusicPlaybackLaunchContext("user_profile", 102);
        g = musicPlaybackLaunchContext4;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext5 = new MusicPlaybackLaunchContext("user_status", 104);
        h = musicPlaybackLaunchContext5;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext6 = new MusicPlaybackLaunchContext("user_wall", 104);
        i = musicPlaybackLaunchContext6;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext7 = new MusicPlaybackLaunchContext("user_playlists", 101);
        j = musicPlaybackLaunchContext7;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext8 = new MusicPlaybackLaunchContext("group_profile", 103);
        k = musicPlaybackLaunchContext8;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext9 = new MusicPlaybackLaunchContext("group_status", 104);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext10 = new MusicPlaybackLaunchContext("group_wall", 104);
        l = musicPlaybackLaunchContext10;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext11 = new MusicPlaybackLaunchContext("group_playlists", 103);
        m = musicPlaybackLaunchContext11;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext12 = new MusicPlaybackLaunchContext("recoms_mix", ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED);
        n = musicPlaybackLaunchContext12;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext13 = new MusicPlaybackLaunchContext("search", 110);
        o = musicPlaybackLaunchContext13;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext14 = new MusicPlaybackLaunchContext("feed", 105);
        p = musicPlaybackLaunchContext14;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext15 = new MusicPlaybackLaunchContext("im", Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE);
        q = musicPlaybackLaunchContext15;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext16 = new MusicPlaybackLaunchContext("replies", 104);
        r = musicPlaybackLaunchContext16;
        s = new MusicPlaybackLaunchContext("wiki", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext17 = new MusicPlaybackLaunchContext("bookmarks", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        t = musicPlaybackLaunchContext17;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext18 = new MusicPlaybackLaunchContext("headphones_popup", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        u = musicPlaybackLaunchContext18;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext19 = new MusicPlaybackLaunchContext("episode", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        v = musicPlaybackLaunchContext19;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext20 = new MusicPlaybackLaunchContext("music_kids_podcast_episode", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        w = musicPlaybackLaunchContext20;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext21 = new MusicPlaybackLaunchContext("podcasts_list_page", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        x = musicPlaybackLaunchContext21;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext22 = new MusicPlaybackLaunchContext("music_kids_podcast_page", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        y = musicPlaybackLaunchContext22;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext23 = new MusicPlaybackLaunchContext("episode_list", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        z = musicPlaybackLaunchContext23;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext24 = new MusicPlaybackLaunchContext("player", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        A = musicPlaybackLaunchContext24;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext25 = new MusicPlaybackLaunchContext("feed_recommended", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        B = musicPlaybackLaunchContext25;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext26 = new MusicPlaybackLaunchContext("wall", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        C = musicPlaybackLaunchContext26;
        D = new MusicPlaybackLaunchContext("podcast_group_profile_tab", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext27 = new MusicPlaybackLaunchContext("superapp_widget", 102);
        E = musicPlaybackLaunchContext27;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext28 = new MusicPlaybackLaunchContext("similar_tracks", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        F = musicPlaybackLaunchContext28;
        G = new MusicPlaybackLaunchContext(t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIP_GRID), 102);
        H = new MusicPlaybackLaunchContext("search_android_auto", 110);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext29 = new MusicPlaybackLaunchContext("music_downloaded_offline", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        I = musicPlaybackLaunchContext29;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext30 = new MusicPlaybackLaunchContext("music_downloaded_online", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        J = musicPlaybackLaunchContext30;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext31 = new MusicPlaybackLaunchContext("audiobook_listened", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        K = musicPlaybackLaunchContext31;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext32 = new MusicPlaybackLaunchContext("audiobook_listened_my_shelf", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        L = musicPlaybackLaunchContext32;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext33 = new MusicPlaybackLaunchContext("vk_mix", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        M = musicPlaybackLaunchContext33;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext34 = new MusicPlaybackLaunchContext("snippet_feed", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        N = musicPlaybackLaunchContext34;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext35 = new MusicPlaybackLaunchContext("news_feed_recommended_playlists", 105);
        O = musicPlaybackLaunchContext35;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext36 = new MusicPlaybackLaunchContext("link", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        P = musicPlaybackLaunchContext36;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext37 = new MusicPlaybackLaunchContext("smart_link", Sdk.SDKError.Reason.ASSET_WRITE_ERROR_VALUE);
        Q = musicPlaybackLaunchContext37;
        hashMap.put(musicPlaybackLaunchContext.t(), musicPlaybackLaunchContext);
        hashMap.put(musicPlaybackLaunchContext2.t(), musicPlaybackLaunchContext2);
        hashMap.put(musicPlaybackLaunchContext3.t(), musicPlaybackLaunchContext3);
        hashMap.put(musicPlaybackLaunchContext4.t(), musicPlaybackLaunchContext4);
        hashMap.put(musicPlaybackLaunchContext5.t(), musicPlaybackLaunchContext5);
        hashMap.put(musicPlaybackLaunchContext6.t(), musicPlaybackLaunchContext6);
        hashMap.put(musicPlaybackLaunchContext7.t(), musicPlaybackLaunchContext7);
        hashMap.put(musicPlaybackLaunchContext8.t(), musicPlaybackLaunchContext8);
        hashMap.put(musicPlaybackLaunchContext9.t(), musicPlaybackLaunchContext9);
        hashMap.put(musicPlaybackLaunchContext10.t(), musicPlaybackLaunchContext10);
        hashMap.put(musicPlaybackLaunchContext11.t(), musicPlaybackLaunchContext11);
        hashMap.put(musicPlaybackLaunchContext12.t(), musicPlaybackLaunchContext12);
        hashMap.put(musicPlaybackLaunchContext13.t(), musicPlaybackLaunchContext13);
        hashMap.put(musicPlaybackLaunchContext14.t(), musicPlaybackLaunchContext14);
        hashMap.put(musicPlaybackLaunchContext15.t(), musicPlaybackLaunchContext15);
        hashMap.put(musicPlaybackLaunchContext16.t(), musicPlaybackLaunchContext16);
        hashMap.put(musicPlaybackLaunchContext17.t(), musicPlaybackLaunchContext17);
        hashMap.put(musicPlaybackLaunchContext18.t(), musicPlaybackLaunchContext18);
        hashMap.put(musicPlaybackLaunchContext19.t(), musicPlaybackLaunchContext19);
        hashMap.put(musicPlaybackLaunchContext20.t(), musicPlaybackLaunchContext20);
        hashMap.put(musicPlaybackLaunchContext21.t(), musicPlaybackLaunchContext21);
        hashMap.put(musicPlaybackLaunchContext22.t(), musicPlaybackLaunchContext22);
        hashMap.put(musicPlaybackLaunchContext23.t(), musicPlaybackLaunchContext23);
        hashMap.put(musicPlaybackLaunchContext24.t(), musicPlaybackLaunchContext24);
        hashMap.put(musicPlaybackLaunchContext25.t(), musicPlaybackLaunchContext25);
        hashMap.put(musicPlaybackLaunchContext26.t(), musicPlaybackLaunchContext26);
        hashMap.put(musicPlaybackLaunchContext27.t(), musicPlaybackLaunchContext27);
        hashMap.put(musicPlaybackLaunchContext28.t(), musicPlaybackLaunchContext28);
        hashMap.put(musicPlaybackLaunchContext30.t(), musicPlaybackLaunchContext30);
        hashMap.put(musicPlaybackLaunchContext29.t(), musicPlaybackLaunchContext29);
        hashMap.put(musicPlaybackLaunchContext31.t(), musicPlaybackLaunchContext31);
        hashMap.put(musicPlaybackLaunchContext32.t(), musicPlaybackLaunchContext32);
        hashMap.put(musicPlaybackLaunchContext33.t(), musicPlaybackLaunchContext33);
        hashMap.put(musicPlaybackLaunchContext34.t(), musicPlaybackLaunchContext34);
        hashMap.put(musicPlaybackLaunchContext35.t(), musicPlaybackLaunchContext35);
        hashMap.put(musicPlaybackLaunchContext36.t(), musicPlaybackLaunchContext36);
        hashMap.put(musicPlaybackLaunchContext37.t(), musicPlaybackLaunchContext37);
        CREATOR = new a();
    }

    public MusicPlaybackLaunchContext(String str, int i2) {
        Bundle bundle = new Bundle();
        this.b = bundle;
        bundle.putString("__META_SOURCE", str);
        bundle.putInt("__META_AD_CATEGORY", i2);
        bundle.putInt("__META_META_PODCASTS_STATE", 0);
        bundle.putString("__META_TITLE", "");
    }

    @NonNull
    public static MusicPlaybackLaunchContext Fb(String str) {
        MusicPlaybackLaunchContext musicPlaybackLaunchContext;
        MusicPlaybackLaunchContext musicPlaybackLaunchContext2;
        boolean equals = "fave".equals(str);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext3 = d;
        if (equals) {
            musicPlaybackLaunchContext = t;
        } else if ("news".equals(str)) {
            musicPlaybackLaunchContext = p;
        } else if ("comments".equals(str)) {
            musicPlaybackLaunchContext = r;
        } else {
            boolean equals2 = "wall_user".equals(str);
            MusicPlaybackLaunchContext musicPlaybackLaunchContext4 = i;
            if (!equals2 && (str == null || !str.startsWith(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE))) {
                boolean equals3 = "wall_group".equals(str);
                musicPlaybackLaunchContext4 = l;
                if (!equals3 && (str == null || !str.startsWith("club"))) {
                    musicPlaybackLaunchContext = ("discover".equals(str) || "discover_full".equals(str)) ? B : Ad.d.equals(str) ? C : musicPlaybackLaunchContext3;
                }
            }
            musicPlaybackLaunchContext = musicPlaybackLaunchContext4;
        }
        HashMap hashMap = c;
        if (hashMap.containsKey(str) && (musicPlaybackLaunchContext2 = (MusicPlaybackLaunchContext) hashMap.get(str)) != null) {
            musicPlaybackLaunchContext = musicPlaybackLaunchContext2;
        }
        return musicPlaybackLaunchContext == musicPlaybackLaunchContext3 ? TextUtils.isEmpty(str) ? musicPlaybackLaunchContext3 : new MusicPlaybackLaunchContext(str, ApiInvocationException.ErrorCodes.PARAM_SESSION_KEY_CHANGED) : musicPlaybackLaunchContext;
    }

    @NonNull
    public static String Mb(t750 t750Var) {
        return (t750Var == null || t750Var.t() == null) ? "unknown" : t750Var.t();
    }

    public final MusicPlaybackLaunchContext Ab() {
        MusicPlaybackLaunchContext zb = zb();
        zb.b.putBoolean("__META_PLAYER_SHUFFLED", true);
        return zb;
    }

    public final MusicPlaybackLaunchContext Bb(@NonNull String str) {
        MusicPlaybackLaunchContext zb = zb();
        zb.b.putString("__META_CATALOG_BLOCK_ID", str);
        return zb;
    }

    public final MusicPlaybackLaunchContext Cb(@NonNull String str) {
        MusicPlaybackLaunchContext zb = zb();
        zb.b.putString("__META_LAUNCH_ORIGIN", str);
        return zb;
    }

    public final MusicPlaybackLaunchContext Db(@NonNull Playlist playlist) {
        int i2 = playlist.b;
        String str = playlist.h;
        UserId userId = playlist.c;
        MusicPlaybackLaunchContext zb = zb();
        Bundle bundle = zb.b;
        bundle.putParcelable("__META_OWNER_ID", userId);
        bundle.putString("__META_TITLE", str);
        Set<Integer> set = Playlist.P;
        bundle.putString("__META_PLAYLIST_PID", Playlist.a.a(i2, userId));
        return zb;
    }

    public final MusicPlaybackLaunchContext Eb(int i2) {
        MusicPlaybackLaunchContext zb = zb();
        Bundle bundle = zb.b;
        bundle.putInt("__META_META_PODCASTS_STATE", i2 | bundle.getInt("__META_META_PODCASTS_STATE"));
        return zb;
    }

    @NonNull
    public final String Gb() {
        String string = this.b.getString("__META_LAUNCH_ORIGIN");
        return string != null ? string : "unknown";
    }

    @NonNull
    public final String Hb() {
        return this.b.getString("__META_LAUNCH_POINT", "");
    }

    public final Integer Ib() {
        Bundle bundle = this.b;
        if (bundle.containsKey("__META_PLAYER_MINI_APP_SOURCE")) {
            return Integer.valueOf(bundle.getInt("__META_PLAYER_MINI_APP_SOURCE"));
        }
        return null;
    }

    @NonNull
    public final String Jb() {
        return this.b.getString("__META_PLAYER_TYPE", "");
    }

    @NonNull
    public final String Kb() {
        return this.b.getString("__META_PLAYLIST_PID", "");
    }

    public final String Lb() {
        String t2;
        String string = this.b.getString("__META_CATALOG_BLOCK_ID", "");
        if (string.isEmpty() && (t2 = t()) != null && !t2.isEmpty()) {
            string = t2;
        }
        String Gb = Gb();
        return Gb.equals("unknown") ? string : string.isEmpty() ? Gb : pzl.b(string, "&", Gb);
    }

    public final boolean Nb(int i2) {
        return (i2 & this.b.getInt("__META_META_PODCASTS_STATE", 0)) != 0;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.K(this.b);
    }

    public final void Ob() {
        Bundle bundle = this.b;
        if (myc0.f(bundle.getString("__META_PLAYLIST_PID"))) {
            bundle.remove("__META_PLAYLIST_PID");
            bundle.remove("__META_OWNER_ID");
            bundle.remove("__META_TITLE");
        } else if (bundle.containsKey("__META_DEPRECATED_MUSIC_CATALOG_SECTION_ID")) {
            bundle.remove("__META_DEPRECATED_MUSIC_CATALOG_SECTION_ID");
            bundle.remove("__META_TITLE");
        } else if (bundle.containsKey("__META_OWNER_ID")) {
            bundle.remove("__META_OWNER_ID");
            bundle.remove("__META_OWNER_NAME");
        } else if (Ib() != null) {
            bundle.remove("__META_PLAYER_MINI_APP_SOURCE");
        }
    }

    public final void Pb(String str) {
        this.b.putString("__META_SOURCE", str);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MusicPlaybackLaunchContext)) {
            return false;
        }
        Bundle bundle = this.b;
        Bundle bundle2 = ((MusicPlaybackLaunchContext) obj).b;
        if (bundle.keySet().size() == bundle2.keySet().size()) {
            for (String str : bundle.keySet()) {
                if (bundle2.containsKey(str) && Objects.equals(bundle.get(str), bundle2.get(str))) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // xsna.t750
    public final String t() {
        return this.b.getString("__META_SOURCE");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerRefer(source=");
        Bundle bundle = this.b;
        sb.append(bundle.getString("__META_SOURCE"));
        sb.append(" ownerId=");
        sb.append(bundle.getParcelable("__META_OWNER_ID"));
        sb.append(" ownerName=");
        sb.append(bundle.getString("__META_OWNER_NAME"));
        sb.append(" adCategory=");
        sb.append(bundle.getInt("__META_AD_CATEGORY"));
        sb.append(" playlistPid=");
        sb.append(bundle.getString("__META_PLAYLIST_PID"));
        sb.append(" title=");
        sb.append(bundle.getString("__META_TITLE"));
        sb.append(" playingContext=");
        sb.append(bundle.getString("__META_DEPRECATED_MUSIC_CATALOG_SECTION_ID"));
        sb.append(" stateExpanded=");
        sb.append(Nb(4));
        sb.append(" stateFullPlayer=");
        sb.append(this.b.getBoolean("__META_PLAYER_FULL_SCREEN"));
        sb.append(" stateShuffleAll=");
        sb.append(this.b.getBoolean("__META_PLAYER_SHUFFLED"));
        sb.append(")");
        return sb.toString();
    }

    public final MusicPlaybackLaunchContext zb() {
        Bundle bundle = this.b;
        Bundle bundle2 = new Bundle();
        bundle2.putAll(bundle);
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = new MusicPlaybackLaunchContext();
        new Bundle();
        musicPlaybackLaunchContext.b = bundle2;
        return musicPlaybackLaunchContext;
    }
}
