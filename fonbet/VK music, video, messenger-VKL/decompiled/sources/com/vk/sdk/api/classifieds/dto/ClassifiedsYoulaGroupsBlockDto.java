package com.vk.sdk.api.classifieds.dto;

import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaGroupsBlockDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaGroupsBlockDto {

    @pmi0("friends")
    private final ClassifiedsYoulaCarouselFriendsDto friends;

    @pmi0("items")
    private final List<ClassifiedsYoulaGroupsBlockItemDto> items;

    public ClassifiedsYoulaGroupsBlockDto(List<ClassifiedsYoulaGroupsBlockItemDto> list, ClassifiedsYoulaCarouselFriendsDto classifiedsYoulaCarouselFriendsDto) {
        this.items = list;
        this.friends = classifiedsYoulaCarouselFriendsDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaGroupsBlockDto)) {
            return false;
        }
        ClassifiedsYoulaGroupsBlockDto classifiedsYoulaGroupsBlockDto = (ClassifiedsYoulaGroupsBlockDto) obj;
        return epx.f(this.items, classifiedsYoulaGroupsBlockDto.items) && epx.f(this.friends, classifiedsYoulaGroupsBlockDto.friends);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        ClassifiedsYoulaCarouselFriendsDto classifiedsYoulaCarouselFriendsDto = this.friends;
        return hashCode + (classifiedsYoulaCarouselFriendsDto == null ? 0 : classifiedsYoulaCarouselFriendsDto.hashCode());
    }

    public final String toString() {
        return "ClassifiedsYoulaGroupsBlockDto(items=" + this.items + ", friends=" + this.friends + ")";
    }

    public /* synthetic */ ClassifiedsYoulaGroupsBlockDto(List list, ClassifiedsYoulaCarouselFriendsDto classifiedsYoulaCarouselFriendsDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : classifiedsYoulaCarouselFriendsDto);
    }
}
