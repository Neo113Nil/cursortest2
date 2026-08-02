package com.vk.sdk.api.classifieds.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;

/* compiled from: ClassifiedsYoulaCarouselFriendsDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaCarouselFriendsDto {

    @pmi0("items")
    private final List<ClassifiedsYoulaCarouselFriendsItemDto> items;

    @pmi0("text")
    private final String text;

    public ClassifiedsYoulaCarouselFriendsDto(String str, List<ClassifiedsYoulaCarouselFriendsItemDto> list) {
        this.text = str;
        this.items = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaCarouselFriendsDto)) {
            return false;
        }
        ClassifiedsYoulaCarouselFriendsDto classifiedsYoulaCarouselFriendsDto = (ClassifiedsYoulaCarouselFriendsDto) obj;
        return epx.f(this.text, classifiedsYoulaCarouselFriendsDto.text) && epx.f(this.items, classifiedsYoulaCarouselFriendsDto.items);
    }

    public final int hashCode() {
        return this.items.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        return "ClassifiedsYoulaCarouselFriendsDto(text=" + this.text + ", items=" + this.items + ")";
    }
}
