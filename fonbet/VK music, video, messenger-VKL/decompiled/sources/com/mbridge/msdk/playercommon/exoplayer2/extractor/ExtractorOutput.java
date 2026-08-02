package com.mbridge.msdk.playercommon.exoplayer2.extractor;

/* loaded from: classes14.dex */
public interface ExtractorOutput {
    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i, int i2);
}
