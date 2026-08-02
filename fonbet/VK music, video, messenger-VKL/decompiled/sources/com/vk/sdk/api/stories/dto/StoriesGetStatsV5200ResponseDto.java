package com.vk.sdk.api.stories.dto;

import com.vk.dto.hints.HintCategories;
import com.vk.movika.sdk.base.model.history.b;
import java.util.List;
import xsna.epx;
import xsna.pmi0;
import xsna.xe9;
import xsna.xq;
import xsna.zcl;

/* compiled from: StoriesGetStatsV5200ResponseDto.kt */
/* loaded from: classes5.dex */
public final class StoriesGetStatsV5200ResponseDto {

    @pmi0("achievement")
    private final String achievement;

    @pmi0("achievement_subtitle")
    private final String achievementSubtitle;

    @pmi0(HintCategories.PARAM_NAME)
    private final List<StoriesStatCategoryDto> categories;

    @pmi0("need_privacy_block")
    private final Boolean needPrivacyBlock;

    @pmi0("preview")
    private final String preview;

    public StoriesGetStatsV5200ResponseDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesGetStatsV5200ResponseDto)) {
            return false;
        }
        StoriesGetStatsV5200ResponseDto storiesGetStatsV5200ResponseDto = (StoriesGetStatsV5200ResponseDto) obj;
        return epx.f(this.preview, storiesGetStatsV5200ResponseDto.preview) && epx.f(this.achievement, storiesGetStatsV5200ResponseDto.achievement) && epx.f(this.achievementSubtitle, storiesGetStatsV5200ResponseDto.achievementSubtitle) && epx.f(this.categories, storiesGetStatsV5200ResponseDto.categories) && epx.f(this.needPrivacyBlock, storiesGetStatsV5200ResponseDto.needPrivacyBlock);
    }

    public final int hashCode() {
        String str = this.preview;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.achievement;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.achievementSubtitle;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<StoriesStatCategoryDto> list = this.categories;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.needPrivacyBlock;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        String str = this.preview;
        String str2 = this.achievement;
        String str3 = this.achievementSubtitle;
        List<StoriesStatCategoryDto> list = this.categories;
        Boolean bool = this.needPrivacyBlock;
        StringBuilder a = xe9.a("StoriesGetStatsV5200ResponseDto(preview=", str, ", achievement=", str2, ", achievementSubtitle=");
        b.c(str3, ", categories=", ", needPrivacyBlock=", a, list);
        return xq.d(a, bool, ")");
    }

    public StoriesGetStatsV5200ResponseDto(String str, String str2, String str3, List<StoriesStatCategoryDto> list, Boolean bool) {
        this.preview = str;
        this.achievement = str2;
        this.achievementSubtitle = str3;
        this.categories = list;
        this.needPrivacyBlock = bool;
    }

    public /* synthetic */ StoriesGetStatsV5200ResponseDto(String str, String str2, String str3, List list, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : bool);
    }
}
