package com.twilio.voice;

import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import java.util.List;

/* loaded from: classes4.dex */
public class PreflightOptions {
    private final String accessToken;
    private final IceOptions iceOptions;
    private final Call.EventListener insightsListener;
    private final List<AudioCodec> preferredAudioCodecs;

    public static class Builder {
        String accessToken;
        IceOptions iceOptions;
        Call.EventListener insightsListener;
        List<AudioCodec> preferredAudioCodecs;

        public Builder(@NonNull String str) {
            Preconditions.checkNotNull(str, "accessToken must not be null");
            this.accessToken = str;
        }

        @NonNull
        public PreflightOptions build() {
            return new PreflightOptions(this);
        }

        public Builder eventListener(Call.EventListener eventListener) {
            this.insightsListener = eventListener;
            return this;
        }

        @NonNull
        public Builder iceOptions(@NonNull IceOptions iceOptions) {
            Preconditions.checkNotNull(iceOptions, "iceOptions must not be null");
            this.iceOptions = iceOptions;
            return this;
        }

        @NonNull
        public Builder preferAudioCodecs(@NonNull List<AudioCodec> list) {
            Preconditions.checkNotNull(list, "preferredAudioCodecs must not be null");
            PreflightOptions.checkAudioCodecs(list);
            this.preferredAudioCodecs = list;
            return this;
        }
    }

    public static void checkAudioCodecs(@NonNull List<AudioCodec> list) {
        for (AudioCodec audioCodec : list) {
            Preconditions.checkNotNull(audioCodec);
            Preconditions.checkArgument(Constants.SUPPORTED_CODECS.contains(audioCodec.getClass()), String.format("Unsupported audio codec %s", audioCodec.getName()));
        }
    }

    @NonNull
    public String getAccessToken() {
        return this.accessToken;
    }

    public AudioCodec[] getAudioCodecsArray() {
        AudioCodec[] audioCodecArr = new AudioCodec[0];
        List<AudioCodec> list = this.preferredAudioCodecs;
        if (list == null || list.isEmpty()) {
            return audioCodecArr;
        }
        return (AudioCodec[]) this.preferredAudioCodecs.toArray(new AudioCodec[this.preferredAudioCodecs.size()]);
    }

    public Call.EventListener getEventListener() {
        return this.insightsListener;
    }

    public IceOptions getIceOptions() {
        return this.iceOptions;
    }

    public List<AudioCodec> getPreferredAudioCodecs() {
        return this.preferredAudioCodecs;
    }

    private PreflightOptions(Builder builder) {
        this.accessToken = builder.accessToken;
        this.iceOptions = builder.iceOptions;
        this.preferredAudioCodecs = builder.preferredAudioCodecs;
        this.insightsListener = builder.insightsListener;
    }
}
