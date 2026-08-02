package com.vk.clips.config.viewers.api.experiments.models;

import org.json.JSONObject;
import xsna.asp;
import xsna.cqm0;
import xsna.zrp;

/* compiled from: ClipsRtmpLivePlaybackSettings.kt */
/* loaded from: classes16.dex */
public final class ClipsRtmpLivePlaybackSettings {
    public static final ClipsRtmpLivePlaybackSettings c;
    public final Player a;
    public final Player b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ClipsRtmpLivePlaybackSettings.kt */
    public static final class Player {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Player[] $VALUES;
        public static final Player EXO;
        public static final Player LIVE;
        public static final Player NONE;

        static {
            Player player = new Player("LIVE", 0);
            LIVE = player;
            Player player2 = new Player("EXO", 1);
            EXO = player2;
            Player player3 = new Player("NONE", 2);
            NONE = player3;
            Player[] playerArr = {player, player2, player3};
            $VALUES = playerArr;
            $ENTRIES = new asp(playerArr);
        }

        public Player() {
            throw null;
        }

        public static Player valueOf(String str) {
            return (Player) Enum.valueOf(Player.class, str);
        }

        public static Player[] values() {
            return (Player[]) $VALUES.clone();
        }
    }

    /* compiled from: ClipsRtmpLivePlaybackSettings.kt */
    public static final class a {
        public static ClipsRtmpLivePlaybackSettings a() {
            return ClipsRtmpLivePlaybackSettings.c;
        }

        public static Player b(String str, String str2, JSONObject jSONObject) {
            Object opt = jSONObject != null ? jSONObject.opt(str) : null;
            String str3 = opt instanceof String ? (String) opt : null;
            if (str3 != null) {
                str2 = str3;
            }
            String m = cqm0.m(str2);
            return m.equals("live") ? Player.LIVE : m.equals("exo") ? Player.EXO : Player.NONE;
        }
    }

    static {
        Player player = Player.NONE;
        c = new ClipsRtmpLivePlaybackSettings(player, player);
    }

    public ClipsRtmpLivePlaybackSettings(Player player, Player player2) {
        this.a = player;
        this.b = player2;
    }

    public final boolean a() {
        Player player = Player.NONE;
        return (this.b == player && this.a == player) ? false : true;
    }

    public final boolean b(boolean z, boolean z2) {
        if (z) {
            Player player = this.b;
            player.getClass();
            if (player == Player.LIVE) {
                return true;
            }
        }
        if (!z2) {
            return false;
        }
        Player player2 = this.a;
        player2.getClass();
        return player2 == Player.LIVE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsRtmpLivePlaybackSettings)) {
            return false;
        }
        ClipsRtmpLivePlaybackSettings clipsRtmpLivePlaybackSettings = (ClipsRtmpLivePlaybackSettings) obj;
        return this.a == clipsRtmpLivePlaybackSettings.a && this.b == clipsRtmpLivePlaybackSettings.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClipsRtmpLivePlaybackSettings {RTMP: " + this.a.name() + ", OKMP: " + this.b.name() + '}';
    }
}
