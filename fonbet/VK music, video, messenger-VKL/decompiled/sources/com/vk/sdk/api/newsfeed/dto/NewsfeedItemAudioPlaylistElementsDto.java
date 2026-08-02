package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.audio.dto.AudioPlaylistDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemAudioPlaylistElementsDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemAudioPlaylistElementsDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<AudioPlaylistDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemAudioPlaylistElementsDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemAudioPlaylistElementsDto)) {
            return false;
        }
        NewsfeedItemAudioPlaylistElementsDto newsfeedItemAudioPlaylistElementsDto = (NewsfeedItemAudioPlaylistElementsDto) obj;
        return epx.f(this.count, newsfeedItemAudioPlaylistElementsDto.count) && epx.f(this.items, newsfeedItemAudioPlaylistElementsDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AudioPlaylistDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemAudioPlaylistElementsDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public NewsfeedItemAudioPlaylistElementsDto(Integer num, List<AudioPlaylistDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemAudioPlaylistElementsDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
