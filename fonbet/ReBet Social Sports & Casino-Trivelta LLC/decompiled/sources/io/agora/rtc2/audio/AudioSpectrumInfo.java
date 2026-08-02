package io.agora.rtc2.audio;

import io.agora.base.internal.CalledByNative;

/* loaded from: classes3.dex */
public class AudioSpectrumInfo {
    private float[] audioSpectrumData;
    private int dataLength;

    @CalledByNative
    public AudioSpectrumInfo(float[] fArr, int i10) {
        this.audioSpectrumData = fArr;
        this.dataLength = i10;
    }

    public float[] getAudioSpectrumData() {
        return this.audioSpectrumData;
    }

    public int getDataLength() {
        return this.dataLength;
    }
}
