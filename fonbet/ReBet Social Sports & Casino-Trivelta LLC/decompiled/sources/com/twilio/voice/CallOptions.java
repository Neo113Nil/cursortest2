package com.twilio.voice;

import androidx.annotation.NonNull;
import com.twilio.voice.Call;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class CallOptions {
    AudioOptions audioOptions;
    List<LocalAudioTrack> audioTracks;
    Call.CallMessageListener callMessageListener;
    boolean enableDscp;
    boolean enableIceGatheringOnAnyAddressPorts;
    IceOptions iceOptions;
    PlatformInfo platformInfo;
    List<AudioCodec> preferredAudioCodecs;

    public static abstract class Builder {
        AudioOptions audioOptions;
        List<LocalAudioTrack> audioTracks;
        IceOptions iceOptions;
        List<AudioCodec> preferredAudioCodecs;
        boolean enableDscp = true;
        boolean enableIceGatheringOnAnyAddressPorts = false;
        Call.EventListener eventListener = null;
        Call.CallMessageListener callMessageListener = null;

        public Builder audioOptions(@NonNull AudioOptions audioOptions) {
            Preconditions.checkNotNull(audioOptions, "audioOptions must not be null.");
            this.audioOptions = audioOptions;
            return this;
        }

        public Builder audioTracks(@NonNull List<LocalAudioTrack> list) {
            Preconditions.checkNotNull(list, "audioTracks must not be null");
            this.audioTracks = new ArrayList(list);
            return this;
        }

        public Builder callMessageListener(@NonNull Call.CallMessageListener callMessageListener) {
            this.callMessageListener = callMessageListener;
            return this;
        }

        public Builder enableDscp(boolean z10) {
            this.enableDscp = z10;
            return this;
        }

        public Builder enableIceGatheringOnAnyAddressPorts(boolean z10) {
            this.enableIceGatheringOnAnyAddressPorts = z10;
            return this;
        }

        public Builder iceOptions(@NonNull IceOptions iceOptions) {
            Preconditions.checkNotNull(iceOptions, "iceOptions must not be null");
            this.iceOptions = iceOptions;
            return this;
        }

        public Builder preferAudioCodecs(@NonNull List<AudioCodec> list) {
            Preconditions.checkNotNull(list, "preferredAudioCodecs must not be null");
            this.preferredAudioCodecs = new ArrayList(list);
            return this;
        }
    }

    public static void checkAudioCodecs(@NonNull List<AudioCodec> list) {
        for (AudioCodec audioCodec : list) {
            Preconditions.checkNotNull(audioCodec);
            Preconditions.checkArgument(Constants.SUPPORTED_CODECS.contains(audioCodec.getClass()), String.format("Unsupported audio codec %s", audioCodec.getName()));
        }
    }

    public static void checkAudioTracksReleased(List<LocalAudioTrack> list) {
        if (list != null) {
            Iterator<LocalAudioTrack> it = list.iterator();
            while (it.hasNext()) {
                Preconditions.checkState(!it.next().isReleased(), "LocalAudioTrack cannot be released");
            }
        }
    }

    public AudioCodec[] getAudioCodecsArray() {
        AudioCodec[] audioCodecArr = new AudioCodec[0];
        List<AudioCodec> list = this.preferredAudioCodecs;
        if (list == null || list.isEmpty()) {
            return audioCodecArr;
        }
        return (AudioCodec[]) this.preferredAudioCodecs.toArray(new AudioCodec[this.preferredAudioCodecs.size()]);
    }

    public AudioOptions getAudioOptions() {
        return this.audioOptions;
    }

    public List<LocalAudioTrack> getAudioTracks() {
        return this.audioTracks;
    }

    public Call.CallMessageListener getCallMessageListener() {
        return this.callMessageListener;
    }

    public IceOptions getIceOptions() {
        return this.iceOptions;
    }

    public LocalAudioTrack[] getLocalAudioTracksArray() {
        LocalAudioTrack[] localAudioTrackArr = new LocalAudioTrack[0];
        if (this.audioTracks.isEmpty()) {
            return localAudioTrackArr;
        }
        return (LocalAudioTrack[]) this.audioTracks.toArray(new LocalAudioTrack[this.audioTracks.size()]);
    }

    public List<AudioCodec> getPreferredAudioCodecs() {
        return this.preferredAudioCodecs;
    }

    public boolean isDscpEnabled() {
        return this.enableDscp;
    }

    public boolean isIceGatheringOnAnyAddressPortsEnabled() {
        return this.enableIceGatheringOnAnyAddressPorts;
    }
}
