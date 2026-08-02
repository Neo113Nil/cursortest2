package com.vk.sdk.api.status.dto;

import com.vk.sdk.api.audio.dto.AudioAudioDto;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StatusStatusDto.kt */
/* loaded from: classes5.dex */
public final class StatusStatusDto {

    @pmi0("audio")
    private final AudioAudioDto audio;

    @pmi0("text")
    private final String text;

    public StatusStatusDto(String str, AudioAudioDto audioAudioDto) {
        this.text = str;
        this.audio = audioAudioDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatusStatusDto)) {
            return false;
        }
        StatusStatusDto statusStatusDto = (StatusStatusDto) obj;
        return epx.f(this.text, statusStatusDto.text) && epx.f(this.audio, statusStatusDto.audio);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        AudioAudioDto audioAudioDto = this.audio;
        return hashCode + (audioAudioDto == null ? 0 : audioAudioDto.hashCode());
    }

    public final String toString() {
        return "StatusStatusDto(text=" + this.text + ", audio=" + this.audio + ")";
    }

    public /* synthetic */ StatusStatusDto(String str, AudioAudioDto audioAudioDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : audioAudioDto);
    }
}
