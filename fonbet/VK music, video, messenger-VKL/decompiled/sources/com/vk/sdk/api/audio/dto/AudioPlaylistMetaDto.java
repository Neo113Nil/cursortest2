package com.vk.sdk.api.audio.dto;

import com.mbridge.msdk.MBridgeConstans;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AudioPlaylistMetaDto.kt */
/* loaded from: classes5.dex */
public final class AudioPlaylistMetaDto {

    @pmi0(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)
    private final AudioPlaylistViewDto view;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioPlaylistMetaDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AudioPlaylistMetaDto) && this.view == ((AudioPlaylistMetaDto) obj).view;
    }

    public final int hashCode() {
        AudioPlaylistViewDto audioPlaylistViewDto = this.view;
        if (audioPlaylistViewDto == null) {
            return 0;
        }
        return audioPlaylistViewDto.hashCode();
    }

    public final String toString() {
        return "AudioPlaylistMetaDto(view=" + this.view + ")";
    }

    public AudioPlaylistMetaDto(AudioPlaylistViewDto audioPlaylistViewDto) {
        this.view = audioPlaylistViewDto;
    }

    public /* synthetic */ AudioPlaylistMetaDto(AudioPlaylistViewDto audioPlaylistViewDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : audioPlaylistViewDto);
    }
}
