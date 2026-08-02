package io.agora.rtc2.internal;

import com.twilio.voice.AudioFormat;

/* loaded from: classes3.dex */
public class AudioRecordingConfiguration {
    public String filePath;
    public int sampleRate = AudioFormat.AUDIO_SAMPLE_RATE_32000;
    public boolean codec = true;
    public int fileRecordOption = 3;
    public int quality = 1;
    public int recordingChannel = 1;
}
