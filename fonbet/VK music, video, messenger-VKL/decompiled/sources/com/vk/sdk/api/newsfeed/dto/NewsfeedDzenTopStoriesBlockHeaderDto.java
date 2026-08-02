package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: NewsfeedDzenTopStoriesBlockHeaderDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenTopStoriesBlockHeaderDto {

    @pmi0("description")
    private final String description;

    @pmi0("hidden")
    private final Boolean hidden;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("info")
    private final NewsfeedDzenTopStoriesBlockHeaderInfoDto info;

    @pmi0("is_bold")
    private final Boolean isBold;

    @pmi0("title")
    private final String title;

    public NewsfeedDzenTopStoriesBlockHeaderDto(String str, String str2, NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto, Boolean bool, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, Boolean bool2) {
        this.title = str;
        this.description = str2;
        this.info = newsfeedDzenTopStoriesBlockHeaderInfoDto;
        this.hidden = bool;
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.isBold = bool2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenTopStoriesBlockHeaderDto)) {
            return false;
        }
        NewsfeedDzenTopStoriesBlockHeaderDto newsfeedDzenTopStoriesBlockHeaderDto = (NewsfeedDzenTopStoriesBlockHeaderDto) obj;
        return epx.f(this.title, newsfeedDzenTopStoriesBlockHeaderDto.title) && epx.f(this.description, newsfeedDzenTopStoriesBlockHeaderDto.description) && epx.f(this.info, newsfeedDzenTopStoriesBlockHeaderDto.info) && epx.f(this.hidden, newsfeedDzenTopStoriesBlockHeaderDto.hidden) && epx.f(this.image, newsfeedDzenTopStoriesBlockHeaderDto.image) && epx.f(this.isBold, newsfeedDzenTopStoriesBlockHeaderDto.isBold);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto = this.info;
        int hashCode3 = (hashCode2 + (newsfeedDzenTopStoriesBlockHeaderInfoDto == null ? 0 : newsfeedDzenTopStoriesBlockHeaderInfoDto.hashCode())) * 31;
        Boolean bool = this.hidden;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        int hashCode5 = (hashCode4 + (newsfeedNewsfeedItemHeaderImageDto == null ? 0 : newsfeedNewsfeedItemHeaderImageDto.hashCode())) * 31;
        Boolean bool2 = this.isBold;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto = this.info;
        Boolean bool = this.hidden;
        NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto = this.image;
        Boolean bool2 = this.isBold;
        StringBuilder a = xe9.a("NewsfeedDzenTopStoriesBlockHeaderDto(title=", str, ", description=", str2, ", info=");
        a.append(newsfeedDzenTopStoriesBlockHeaderInfoDto);
        a.append(", hidden=");
        a.append(bool);
        a.append(", image=");
        a.append(newsfeedNewsfeedItemHeaderImageDto);
        a.append(", isBold=");
        a.append(bool2);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ NewsfeedDzenTopStoriesBlockHeaderDto(String str, String str2, NewsfeedDzenTopStoriesBlockHeaderInfoDto newsfeedDzenTopStoriesBlockHeaderInfoDto, Boolean bool, NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, Boolean bool2, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : newsfeedDzenTopStoriesBlockHeaderInfoDto, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : newsfeedNewsfeedItemHeaderImageDto, (i & 32) != 0 ? null : bool2);
    }
}
