package com.vk.music.player.playback;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlaybackQueueConfig.kt */
/* loaded from: classes3.dex */
public final class PlaybackQueueConfig {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PlaybackQueueConfig[] $VALUES;
    public static final a Companion;
    public static final PlaybackQueueConfig DEFAULT;
    public static final PlaybackQueueConfig MUSIC_CONFIG;
    public static final PlaybackQueueConfig MUSIC_WITHOUT_SOURCE_CONFIG;
    public static final PlaybackQueueConfig PODCAST_CONFIG;
    public static final PlaybackQueueConfig RADIO_CONFIG;
    public static final PlaybackQueueConfig VK_MIX_CONFIG;
    private final boolean endlessListeningEnabled;
    private final boolean loadMoreIfEndOfQueue;
    private final boolean loadTracksDirectly;
    private final boolean loadingAvailable;
    private final boolean loopEnabled;
    private boolean prefetchEnabled;
    private final boolean shuffleEnabled;

    /* compiled from: PlaybackQueueConfig.kt */
    public static final class a {
    }

    static {
        PlaybackQueueConfig playbackQueueConfig = new PlaybackQueueConfig("DEFAULT", 0, 63);
        DEFAULT = playbackQueueConfig;
        PlaybackQueueConfig playbackQueueConfig2 = new PlaybackQueueConfig("MUSIC_WITHOUT_SOURCE_CONFIG", 1, 57);
        MUSIC_WITHOUT_SOURCE_CONFIG = playbackQueueConfig2;
        PlaybackQueueConfig playbackQueueConfig3 = new PlaybackQueueConfig("MUSIC_CONFIG", 2, 56);
        MUSIC_CONFIG = playbackQueueConfig3;
        PlaybackQueueConfig playbackQueueConfig4 = new PlaybackQueueConfig("PODCAST_CONFIG", 3, 22);
        PODCAST_CONFIG = playbackQueueConfig4;
        PlaybackQueueConfig playbackQueueConfig5 = new PlaybackQueueConfig("VK_MIX_CONFIG", 4, 6);
        VK_MIX_CONFIG = playbackQueueConfig5;
        PlaybackQueueConfig playbackQueueConfig6 = new PlaybackQueueConfig("RADIO_CONFIG", 5, 62);
        RADIO_CONFIG = playbackQueueConfig6;
        PlaybackQueueConfig[] playbackQueueConfigArr = {playbackQueueConfig, playbackQueueConfig2, playbackQueueConfig3, playbackQueueConfig4, playbackQueueConfig5, playbackQueueConfig6};
        $VALUES = playbackQueueConfigArr;
        $ENTRIES = new asp(playbackQueueConfigArr);
        Companion = new a();
    }

    public PlaybackQueueConfig() {
        throw null;
    }

    public PlaybackQueueConfig(String str, int i, int i2) {
        boolean z = (i2 & 1) == 0;
        boolean z2 = (i2 & 2) == 0;
        boolean z3 = (i2 & 4) == 0;
        boolean z4 = (i2 & 8) == 0;
        boolean z5 = (i2 & 16) == 0;
        boolean z6 = (i2 & 32) == 0;
        this.loadingAvailable = z;
        this.shuffleEnabled = z2;
        this.loopEnabled = z3;
        this.prefetchEnabled = z4;
        this.endlessListeningEnabled = z5;
        this.loadTracksDirectly = z && z6;
        this.loadMoreIfEndOfQueue = z5;
    }

    public static PlaybackQueueConfig valueOf(String str) {
        return (PlaybackQueueConfig) Enum.valueOf(PlaybackQueueConfig.class, str);
    }

    public static PlaybackQueueConfig[] values() {
        return (PlaybackQueueConfig[]) $VALUES.clone();
    }

    public final boolean h() {
        return this.endlessListeningEnabled;
    }

    public final boolean i() {
        return this.loadMoreIfEndOfQueue;
    }

    public final boolean j() {
        return this.loadTracksDirectly;
    }

    public final boolean k() {
        return this.loadingAvailable;
    }

    public final boolean l() {
        return this.prefetchEnabled;
    }

    public final void m(boolean z) {
        this.prefetchEnabled = z;
    }
}
