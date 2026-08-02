package com.twilio.voice;

import androidx.annotation.NonNull;
import com.twilio.voice.AudioOptions;
import com.twilio.voice.Call;
import com.twilio.voice.CallOptions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class AcceptOptions extends CallOptions {
    private final Map<String, String> callInviteMessage;

    public static class Builder extends CallOptions.Builder {
        private final CallInvite callInvite;

        public Builder() {
            this.callInvite = null;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public /* bridge */ /* synthetic */ CallOptions.Builder audioTracks(@NonNull List list) {
            return audioTracks((List<LocalAudioTrack>) list);
        }

        @NonNull
        public AcceptOptions build() {
            CallOptions.checkAudioTracksReleased(this.audioTracks);
            return new AcceptOptions(this);
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
        public Builder enableDscp(@NonNull boolean z10) {
            super.enableDscp(z10);
            return this;
        }

        @Override // com.twilio.voice.CallOptions.Builder
        @NonNull
        public Builder enableIceGatheringOnAnyAddressPorts(@NonNull boolean z10) {
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

        public Builder(@NonNull CallInvite callInvite, boolean z10) {
            Preconditions.checkNotNull(callInvite);
            this.callInvite = callInvite;
        }
    }

    private long createNativeAcceptOptionsBuilder() {
        CallOptions.checkAudioTracksReleased(this.audioTracks);
        return nativeCreate(getLocalAudioTracksArray(), this.iceOptions, this.enableDscp, this.enableIceGatheringOnAnyAddressPorts, getAudioCodecsArray(), this.platformInfo);
    }

    private native long nativeCreate(LocalAudioTrack[] localAudioTrackArr, IceOptions iceOptions, boolean z10, boolean z11, AudioCodec[] audioCodecArr, PlatformInfo platformInfo);

    private AcceptOptions() {
        this.callInviteMessage = null;
    }

    private AcceptOptions(Builder builder) {
        Map<String, String> map;
        List<LocalAudioTrack> list = builder.audioTracks;
        this.audioTracks = list == null ? new ArrayList<>() : list;
        this.iceOptions = builder.iceOptions;
        this.enableDscp = builder.enableDscp;
        this.enableIceGatheringOnAnyAddressPorts = builder.enableIceGatheringOnAnyAddressPorts;
        this.preferredAudioCodecs = builder.preferredAudioCodecs;
        if (builder.callInvite != null) {
            map = builder.callInvite.callInviteMessage;
        } else {
            map = new HashMap<>();
        }
        this.callInviteMessage = map;
        this.platformInfo = new PlatformInfo();
        this.callMessageListener = builder.callMessageListener;
        AudioOptions audioOptions = builder.audioOptions;
        this.audioOptions = audioOptions == null ? new AudioOptions.Builder().build() : audioOptions;
    }
}
