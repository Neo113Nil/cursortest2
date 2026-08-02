package com.vk.movika.sdk.player.base.listener;

import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.zrp;

/* loaded from: classes3.dex */
public interface PlaybackStateListener {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class PlaybackState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PlaybackState[] $VALUES;
        public static final PlaybackState BUFFERING;
        public static final PlaybackState ENDED;
        public static final PlaybackState IDLE;
        public static final PlaybackState READY;

        static {
            PlaybackState playbackState = new PlaybackState("IDLE", 0);
            IDLE = playbackState;
            PlaybackState playbackState2 = new PlaybackState("READY", 1);
            READY = playbackState2;
            PlaybackState playbackState3 = new PlaybackState("BUFFERING", 2);
            BUFFERING = playbackState3;
            PlaybackState playbackState4 = new PlaybackState(SignalingProtocol.STATE_ENDED, 3);
            ENDED = playbackState4;
            PlaybackState[] playbackStateArr = {playbackState, playbackState2, playbackState3, playbackState4};
            $VALUES = playbackStateArr;
            $ENTRIES = new asp(playbackStateArr);
        }

        public PlaybackState() {
            throw null;
        }

        public static PlaybackState valueOf(String str) {
            return (PlaybackState) Enum.valueOf(PlaybackState.class, str);
        }

        public static PlaybackState[] values() {
            return (PlaybackState[]) $VALUES.clone();
        }
    }

    void i(PlaybackState playbackState);
}
