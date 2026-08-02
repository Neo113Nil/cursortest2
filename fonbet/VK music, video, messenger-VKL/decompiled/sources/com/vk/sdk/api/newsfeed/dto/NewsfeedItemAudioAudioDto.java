package com.vk.sdk.api.newsfeed.dto;

import com.vk.sdk.api.audio.dto.AudioAudioDto;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemAudioAudioDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedItemAudioAudioDto {

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<AudioAudioDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemAudioAudioDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemAudioAudioDto)) {
            return false;
        }
        NewsfeedItemAudioAudioDto newsfeedItemAudioAudioDto = (NewsfeedItemAudioAudioDto) obj;
        return epx.f(this.count, newsfeedItemAudioAudioDto.count) && epx.f(this.items, newsfeedItemAudioAudioDto.items);
    }

    public final int hashCode() {
        Integer num = this.count;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<AudioAudioDto> list = this.items;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedItemAudioAudioDto(count=" + this.count + ", items=" + this.items + ")";
    }

    public NewsfeedItemAudioAudioDto(Integer num, List<AudioAudioDto> list) {
        this.count = num;
        this.items = list;
    }

    public /* synthetic */ NewsfeedItemAudioAudioDto(Integer num, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }
}
