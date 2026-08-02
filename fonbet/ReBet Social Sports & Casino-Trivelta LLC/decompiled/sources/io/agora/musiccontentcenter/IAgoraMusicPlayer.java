package io.agora.musiccontentcenter;

import io.agora.mediaplayer.IMediaPlayer;

/* loaded from: classes2.dex */
public interface IAgoraMusicPlayer extends IMediaPlayer {

    public enum MusicPlayMode {
        MUSIC_PLAY_MODE_ORIGINAL(0),
        MUSIC_PLAY_MODE_ACCOMPANY(1),
        MUSIC_PLAY_MODE_LEAD_SING(2);

        private final int value;

        MusicPlayMode(int i10) {
            this.value = i10;
        }

        public static MusicPlayMode valueOf(int i10) {
            if (i10 == 0) {
                return MUSIC_PLAY_MODE_ORIGINAL;
            }
            if (i10 == 1) {
                return MUSIC_PLAY_MODE_ACCOMPANY;
            }
            if (i10 != 2) {
                return null;
            }
            return MUSIC_PLAY_MODE_LEAD_SING;
        }

        public int getValue() {
            return this.value;
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    @Deprecated
    int destroy();

    @Override // io.agora.mediaplayer.IMediaPlayer
    String getPlaySrc();

    int open(long j10, long j11);

    @Override // io.agora.mediaplayer.IMediaPlayer
    int open(String str, long j10);

    int setPlayMode(MusicPlayMode musicPlayMode);

    @Override // io.agora.mediaplayer.IMediaPlayer
    int stop();
}
