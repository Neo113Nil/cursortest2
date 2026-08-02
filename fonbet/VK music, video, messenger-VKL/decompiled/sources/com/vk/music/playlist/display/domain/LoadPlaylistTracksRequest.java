package com.vk.music.playlist.display.domain;

import com.vk.api.generated.audio.dto.AudioAudioRawIdTrackedDto;
import com.vk.dto.music.Playlist;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.asp;
import xsna.epx;
import xsna.fw3;
import xsna.shy;
import xsna.zrp;

/* compiled from: LoadPlaylistTracksRequest.kt */
/* loaded from: classes3.dex */
public final class LoadPlaylistTracksRequest {
    public static final LoadPlaylistTracksRequest g = new LoadPlaylistTracksRequest(new Playlist(0, null, 0, null, null, null, null, null, null, false, 0, null, null, null, null, null, null, null, false, 0, 0, 0, null, null, null, null, null, false, false, false, null, null, null, 0, false, null, null, false, null, 0, -1, 255, null), 0, 0, EmptyList.b, State.COMPLETED, MusicPlaybackLaunchContext.d);
    public final Playlist a;
    public final int b;
    public final int c;
    public final List<AudioAudioRawIdTrackedDto> d;
    public final State e;
    public final MusicPlaybackLaunchContext f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LoadPlaylistTracksRequest.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State COMPLETED;
        public static final State ERROR;
        public static final State LOADING;

        static {
            State state = new State("LOADING", 0);
            LOADING = state;
            State state2 = new State("ERROR", 1);
            ERROR = state2;
            State state3 = new State("COMPLETED", 2);
            COMPLETED = state3;
            State[] stateArr = {state, state2, state3};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public LoadPlaylistTracksRequest(Playlist playlist, int i, int i2, List<AudioAudioRawIdTrackedDto> list, State state, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
        this.a = playlist;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = state;
        this.f = musicPlaybackLaunchContext;
    }

    public static LoadPlaylistTracksRequest a(LoadPlaylistTracksRequest loadPlaylistTracksRequest, int i, State state, int i2) {
        Playlist playlist = loadPlaylistTracksRequest.a;
        int i3 = loadPlaylistTracksRequest.b;
        if ((i2 & 4) != 0) {
            i = loadPlaylistTracksRequest.c;
        }
        int i4 = i;
        List<AudioAudioRawIdTrackedDto> list = loadPlaylistTracksRequest.d;
        if ((i2 & 16) != 0) {
            state = loadPlaylistTracksRequest.e;
        }
        MusicPlaybackLaunchContext musicPlaybackLaunchContext = loadPlaylistTracksRequest.f;
        loadPlaylistTracksRequest.getClass();
        return new LoadPlaylistTracksRequest(playlist, i3, i4, list, state, musicPlaybackLaunchContext);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoadPlaylistTracksRequest)) {
            return false;
        }
        LoadPlaylistTracksRequest loadPlaylistTracksRequest = (LoadPlaylistTracksRequest) obj;
        return epx.f(this.a, loadPlaylistTracksRequest.a) && this.b == loadPlaylistTracksRequest.b && this.c == loadPlaylistTracksRequest.c && epx.f(this.d, loadPlaylistTracksRequest.d) && this.e == loadPlaylistTracksRequest.e && epx.f(this.f, loadPlaylistTracksRequest.f);
    }

    public final int hashCode() {
        return this.f.b.hashCode() + ((this.e.hashCode() + fw3.a(shy.a(this.c, shy.a(this.b, this.a.hashCode() * 31, 31), 31), 31, this.d)) * 31);
    }

    public final String toString() {
        return "LoadPlaylistTracksRequest(fromIndex=" + this.b + ", toIndex=" + this.c + ", state=" + this.e + ')';
    }
}
