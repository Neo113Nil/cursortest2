package com.vk.sdk.api.audio.dto;

import xsna.epx;
import xsna.gq;
import xsna.pmi0;

/* compiled from: AudioGenreDto.kt */
/* loaded from: classes5.dex */
public final class AudioGenreDto {

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    public AudioGenreDto(int i, String str) {
        this.id = i;
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioGenreDto)) {
            return false;
        }
        AudioGenreDto audioGenreDto = (AudioGenreDto) obj;
        return this.id == audioGenreDto.id && epx.f(this.name, audioGenreDto.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (Integer.hashCode(this.id) * 31);
    }

    public final String toString() {
        return gq.b(this.id, "AudioGenreDto(id=", ", name=", this.name, ")");
    }
}
