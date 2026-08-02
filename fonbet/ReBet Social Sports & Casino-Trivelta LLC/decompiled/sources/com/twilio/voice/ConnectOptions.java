package com.twilio.voice;

import android.util.Pair;
import androidx.annotation.NonNull;
import com.twilio.voice.AudioOptions;
import com.twilio.voice.Call;
import com.twilio.voice.CallOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class ConnectOptions extends CallOptions {
    private final String accessToken;
    private Call.EventListener eventListener;
    private final Map<String, String> params;

    public static class Builder extends CallOptions.Builder {
        private final String accessToken;
        private Map<String, String> params;

        public Builder(@NonNull String str) {
            Preconditions.checkNotNull(str, "accessToken must not be null");
            this.accessToken = str;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public /* bridge */ /* synthetic */ CallOptions.Builder audioTracks(@NonNull List list) {
            return audioTracks((List<LocalAudioTrack>) list);
        }

        @NonNull
        public ConnectOptions build() {
            CallOptions.checkAudioTracksReleased(this.audioTracks);
            Map<String, String> map = this.params;
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    boolean z10 = false;
                    Preconditions.checkState(entry.getKey() != null, "params entry key should not be null");
                    if (entry.getValue() != null) {
                        z10 = true;
                    }
                    Preconditions.checkState(z10, "params entry value should not be null");
                }
            }
            return new ConnectOptions(this);
        }

        public Builder eventListener(Call.EventListener eventListener) {
            this.eventListener = eventListener;
            return this;
        }

        @NonNull
        public Builder params(@NonNull Map<String, String> map) {
            Preconditions.checkNotNull(map, "params must not be null");
            this.params = map;
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public /* bridge */ /* synthetic */ CallOptions.Builder preferAudioCodecs(@NonNull List list) {
            return preferAudioCodecs((List<AudioCodec>) list);
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder audioOptions(@NonNull AudioOptions audioOptions) {
            Preconditions.checkNotNull(audioOptions, "audioOptions must not be null.");
            super.audioOptions(audioOptions);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder audioTracks(@NonNull List<LocalAudioTrack> list) {
            Preconditions.checkNotNull(list, "audioTracks must not be null");
            super.audioTracks(list);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder callMessageListener(@NonNull Call.CallMessageListener callMessageListener) {
            return (Builder) super.callMessageListener(callMessageListener);
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder enableDscp(boolean z10) {
            super.enableDscp(z10);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder enableIceGatheringOnAnyAddressPorts(boolean z10) {
            super.enableIceGatheringOnAnyAddressPorts(z10);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder iceOptions(@NonNull IceOptions iceOptions) {
            Preconditions.checkNotNull(iceOptions, "iceOptions must not be null");
            super.iceOptions(iceOptions);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder preferAudioCodecs(@NonNull List<AudioCodec> list) {
            Preconditions.checkNotNull(list, "preferredAudioCodecs must not be null");
            CallOptions.checkAudioCodecs(list);
            super.preferAudioCodecs(list);
            return this;
        }
    }

    private long createNativeConnectOptionsBuilder() {
        CallOptions.checkAudioTracksReleased(this.audioTracks);
        Pair<String[], String[]> mapToArrays = Utils.mapToArrays(this.params);
        return nativeCreate(this.accessToken, (String[]) mapToArrays.first, (String[]) mapToArrays.second, getLocalAudioTracksArray(), this.iceOptions, this.enableDscp, this.enableIceGatheringOnAnyAddressPorts, getAudioCodecsArray(), this.platformInfo);
    }

    private native long nativeCreate(String str, String[] strArr, String[] strArr2, LocalAudioTrack[] localAudioTrackArr, IceOptions iceOptions, boolean z10, boolean z11, AudioCodec[] audioCodecArr, PlatformInfo platformInfo);

    @NonNull
    public String getAccessToken() {
        return this.accessToken;
    }

    public Call.EventListener getEventListener() {
        return this.eventListener;
    }

    @NonNull
    public Map<String, String> getParams() {
        return this.params;
    }

    private ConnectOptions() {
        this.accessToken = "";
        this.params = new HashMap();
    }

    private ConnectOptions(Builder builder) {
        this.accessToken = builder.accessToken;
        List<LocalAudioTrack> list = builder.audioTracks;
        this.audioTracks = list == null ? new ArrayList<>() : list;
        this.iceOptions = builder.iceOptions;
        this.preferredAudioCodecs = builder.preferredAudioCodecs;
        this.params = builder.params == null ? new HashMap<>() : builder.params;
        this.platformInfo = new PlatformInfo();
        this.eventListener = builder.eventListener;
        this.enableDscp = builder.enableDscp;
        this.enableIceGatheringOnAnyAddressPorts = builder.enableIceGatheringOnAnyAddressPorts;
        this.callMessageListener = builder.callMessageListener;
        AudioOptions audioOptions = builder.audioOptions;
        this.audioOptions = audioOptions == null ? new AudioOptions.Builder().build() : audioOptions;
    }
}
