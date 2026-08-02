package com.vk.sdk.api.ads.dto;

import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AdsStoriesDto.kt */
/* loaded from: classes5.dex */
public final class AdsStoriesDto {

    @pmi0("owner")
    private final AdsStoriesOwnerDto owner;

    @pmi0("stories")
    private final List<AdsStoryItemDto> stories;

    @pmi0("stories_disclaimers_text")
    private final String storiesDisclaimersText;

    public AdsStoriesDto() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdsStoriesDto)) {
            return false;
        }
        AdsStoriesDto adsStoriesDto = (AdsStoriesDto) obj;
        return epx.f(this.stories, adsStoriesDto.stories) && epx.f(this.owner, adsStoriesDto.owner) && epx.f(this.storiesDisclaimersText, adsStoriesDto.storiesDisclaimersText);
    }

    public final int hashCode() {
        List<AdsStoryItemDto> list = this.stories;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        AdsStoriesOwnerDto adsStoriesOwnerDto = this.owner;
        int hashCode2 = (hashCode + (adsStoriesOwnerDto == null ? 0 : adsStoriesOwnerDto.hashCode())) * 31;
        String str = this.storiesDisclaimersText;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        List<AdsStoryItemDto> list = this.stories;
        AdsStoriesOwnerDto adsStoriesOwnerDto = this.owner;
        String str = this.storiesDisclaimersText;
        StringBuilder sb = new StringBuilder("AdsStoriesDto(stories=");
        sb.append(list);
        sb.append(", owner=");
        sb.append(adsStoriesOwnerDto);
        sb.append(", storiesDisclaimersText=");
        return i5s.a(sb, str, ")");
    }

    public AdsStoriesDto(List<AdsStoryItemDto> list, AdsStoriesOwnerDto adsStoriesOwnerDto, String str) {
        this.stories = list;
        this.owner = adsStoriesOwnerDto;
        this.storiesDisclaimersText = str;
    }

    public /* synthetic */ AdsStoriesDto(List list, AdsStoriesOwnerDto adsStoriesOwnerDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : adsStoriesOwnerDto, (i & 4) != 0 ? null : str);
    }
}
