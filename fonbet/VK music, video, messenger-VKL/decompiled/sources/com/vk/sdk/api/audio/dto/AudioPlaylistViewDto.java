package com.vk.sdk.api.audio.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AudioPlaylistViewDto.kt */
/* loaded from: classes5.dex */
public final class AudioPlaylistViewDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ AudioPlaylistViewDto[] $VALUES;

    @pmi0("compact")
    public static final AudioPlaylistViewDto COMPACT;
    private final String value;

    static {
        AudioPlaylistViewDto audioPlaylistViewDto = new AudioPlaylistViewDto("COMPACT", 0, "compact");
        COMPACT = audioPlaylistViewDto;
        AudioPlaylistViewDto[] audioPlaylistViewDtoArr = {audioPlaylistViewDto};
        $VALUES = audioPlaylistViewDtoArr;
        $ENTRIES = new asp(audioPlaylistViewDtoArr);
    }

    private AudioPlaylistViewDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static AudioPlaylistViewDto valueOf(String str) {
        return (AudioPlaylistViewDto) Enum.valueOf(AudioPlaylistViewDto.class, str);
    }

    public static AudioPlaylistViewDto[] values() {
        return (AudioPlaylistViewDto[]) $VALUES.clone();
    }
}
