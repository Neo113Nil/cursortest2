package io.agora.musiccontentcenter;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes2.dex */
public interface IMusicContentCenterEventHandler {
    @CalledByNative
    void onLyricResult(String str, long j10, String str2, int i10);

    @CalledByNative
    void onMusicChartsResult(String str, MusicChartInfo[] musicChartInfoArr, int i10);

    @CalledByNative
    void onMusicCollectionResult(String str, int i10, int i11, int i12, Music[] musicArr, int i13);

    @CalledByNative
    void onPreLoadEvent(String str, long j10, int i10, String str2, int i11, int i12);

    @CalledByNative
    void onSongSimpleInfoResult(String str, long j10, String str2, int i10);
}
