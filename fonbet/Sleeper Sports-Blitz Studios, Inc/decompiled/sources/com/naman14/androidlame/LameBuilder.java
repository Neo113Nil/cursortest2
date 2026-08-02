package com.naman14.androidlame;

import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* loaded from: classes8.dex */
public class LameBuilder {
    public String id3tagTitle = null;
    public String id3tagAlbum = null;
    public String id3tagArtist = null;
    public String id3tagComment = null;
    public String id3tagYear = null;
    public int inSampleRate = AudioConstants.AUDIO_SAMPLE_RATE;
    public int outSampleRate = 0;
    public int outChannel = 2;
    public int outBitrate = 128;
    public float scaleInput = 1.0f;
    public int quality = 5;
    public Mode mode = Mode.DEFAULT;
    public VbrMode vbrMode = VbrMode.VBR_OFF;
    public int vbrQuality = 5;
    public int abrMeanBitrate = 128;
    public int lowpassFreq = 0;
    public int highpassFreq = 0;

    public enum Mode {
        STEREO,
        JSTEREO,
        MONO,
        DEFAULT
    }

    public enum VbrMode {
        VBR_OFF,
        VBR_RH,
        VBR_MTRH,
        VBR_ABR,
        VBR_DEFAUT
    }

    public LameBuilder setQuality(int i) {
        this.quality = i;
        return this;
    }

    public LameBuilder setInSampleRate(int i) {
        this.inSampleRate = i;
        return this;
    }

    public LameBuilder setOutSampleRate(int i) {
        this.outSampleRate = i;
        return this;
    }

    public LameBuilder setOutBitrate(int i) {
        this.outBitrate = i;
        return this;
    }

    public LameBuilder setOutChannels(int i) {
        this.outChannel = i;
        return this;
    }

    public LameBuilder setId3tagTitle(String str) {
        this.id3tagTitle = str;
        return this;
    }

    public LameBuilder setId3tagArtist(String str) {
        this.id3tagArtist = str;
        return this;
    }

    public LameBuilder setId3tagAlbum(String str) {
        this.id3tagAlbum = str;
        return this;
    }

    public LameBuilder setId3tagComment(String str) {
        this.id3tagComment = str;
        return this;
    }

    public LameBuilder setId3tagYear(String str) {
        this.id3tagYear = str;
        return this;
    }

    public LameBuilder setScaleInput(float f) {
        this.scaleInput = f;
        return this;
    }

    public LameBuilder setMode(Mode mode) {
        this.mode = mode;
        return this;
    }

    public LameBuilder setVbrMode(VbrMode vbrMode) {
        this.vbrMode = vbrMode;
        return this;
    }

    public LameBuilder setVbrQuality(int i) {
        this.vbrQuality = i;
        return this;
    }

    public LameBuilder setAbrMeanBitrate(int i) {
        this.abrMeanBitrate = i;
        return this;
    }

    public LameBuilder setLowpassFreqency(int i) {
        this.lowpassFreq = i;
        return this;
    }

    public LameBuilder setHighpassFreqency(int i) {
        this.highpassFreq = i;
        return this;
    }

    public AndroidLame build() {
        return new AndroidLame(this);
    }
}
