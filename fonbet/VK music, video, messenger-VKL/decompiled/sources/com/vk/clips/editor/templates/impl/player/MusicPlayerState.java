package com.vk.clips.editor.templates.impl.player;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.unity3d.services.UnityAdsConstants;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MusicPlayerI.kt */
/* loaded from: classes16.dex */
public final class MusicPlayerState {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MusicPlayerState[] $VALUES;
    public static final MusicPlayerState OTHER;
    public static final MusicPlayerState PREPARED;
    public static final MusicPlayerState PROGRESS;
    public static final MusicPlayerState STOPPED;
    private final float progress;

    static {
        MusicPlayerState musicPlayerState = new MusicPlayerState("PREPARED", 0);
        PREPARED = musicPlayerState;
        MusicPlayerState musicPlayerState2 = new MusicPlayerState("STOPPED", 1);
        STOPPED = musicPlayerState2;
        MusicPlayerState musicPlayerState3 = new MusicPlayerState("PROGRESS", 2);
        PROGRESS = musicPlayerState3;
        MusicPlayerState musicPlayerState4 = new MusicPlayerState(NativeAdContent.ViewTag.OTHER, 3);
        OTHER = musicPlayerState4;
        MusicPlayerState[] musicPlayerStateArr = {musicPlayerState, musicPlayerState2, musicPlayerState3, musicPlayerState4};
        $VALUES = musicPlayerStateArr;
        $ENTRIES = new asp(musicPlayerStateArr);
    }

    public MusicPlayerState() {
        throw null;
    }

    public MusicPlayerState(String str, int i) {
        this.progress = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public static MusicPlayerState valueOf(String str) {
        return (MusicPlayerState) Enum.valueOf(MusicPlayerState.class, str);
    }

    public static MusicPlayerState[] values() {
        return (MusicPlayerState[]) $VALUES.clone();
    }
}
