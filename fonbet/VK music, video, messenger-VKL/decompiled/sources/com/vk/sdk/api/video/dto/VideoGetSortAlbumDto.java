package com.vk.sdk.api.video.dto;

import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VideoGetSortAlbumDto.kt */
/* loaded from: classes5.dex */
public final class VideoGetSortAlbumDto {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ VideoGetSortAlbumDto[] $VALUES;

    @pmi0("0")
    public static final VideoGetSortAlbumDto TYPE_0;

    @pmi0("1")
    public static final VideoGetSortAlbumDto TYPE_1;
    private final int value;

    static {
        VideoGetSortAlbumDto videoGetSortAlbumDto = new VideoGetSortAlbumDto("TYPE_0", 0, 0);
        TYPE_0 = videoGetSortAlbumDto;
        VideoGetSortAlbumDto videoGetSortAlbumDto2 = new VideoGetSortAlbumDto("TYPE_1", 1, 1);
        TYPE_1 = videoGetSortAlbumDto2;
        VideoGetSortAlbumDto[] videoGetSortAlbumDtoArr = {videoGetSortAlbumDto, videoGetSortAlbumDto2};
        $VALUES = videoGetSortAlbumDtoArr;
        $ENTRIES = new asp(videoGetSortAlbumDtoArr);
    }

    private VideoGetSortAlbumDto(String str, int i, int i2) {
        this.value = i2;
    }

    public static VideoGetSortAlbumDto valueOf(String str) {
        return (VideoGetSortAlbumDto) Enum.valueOf(VideoGetSortAlbumDto.class, str);
    }

    public static VideoGetSortAlbumDto[] values() {
        return (VideoGetSortAlbumDto[]) $VALUES.clone();
    }
}
