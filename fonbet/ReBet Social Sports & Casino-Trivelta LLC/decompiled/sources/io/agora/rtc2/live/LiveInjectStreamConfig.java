package io.agora.rtc2.live;

import com.twilio.voice.AudioFormat;

/* loaded from: classes3.dex */
public class LiveInjectStreamConfig {
    public int width = 0;
    public int height = 0;
    public int videoGop = 30;
    public int videoFramerate = 15;
    public int videoBitrate = 400;
    public AudioSampleRateType audioSampleRate = AudioSampleRateType.TYPE_44100;
    public int audioBitrate = 48;
    public int audioChannels = 1;

    public enum AudioSampleRateType {
        TYPE_32000(AudioFormat.AUDIO_SAMPLE_RATE_32000),
        TYPE_44100(AudioFormat.AUDIO_SAMPLE_RATE_44100),
        TYPE_48000(AudioFormat.AUDIO_SAMPLE_RATE_48000);

        private int value;

        AudioSampleRateType(int i10) {
            this.value = i10;
        }

        public static int getValue(AudioSampleRateType audioSampleRateType) {
            return audioSampleRateType.value;
        }
    }
}
