package com.vk.sdk.api.newsfeed.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedDzenCompilationDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedDzenCompilationDto {

    @pmi0("description")
    private final String description;

    @pmi0("info")
    private final NewsfeedDzenCompilationInfoDto info;

    public NewsfeedDzenCompilationDto(String str, NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto) {
        this.description = str;
        this.info = newsfeedDzenCompilationInfoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenCompilationDto)) {
            return false;
        }
        NewsfeedDzenCompilationDto newsfeedDzenCompilationDto = (NewsfeedDzenCompilationDto) obj;
        return epx.f(this.description, newsfeedDzenCompilationDto.description) && epx.f(this.info, newsfeedDzenCompilationDto.info);
    }

    public final int hashCode() {
        int hashCode = this.description.hashCode() * 31;
        NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto = this.info;
        return hashCode + (newsfeedDzenCompilationInfoDto == null ? 0 : newsfeedDzenCompilationInfoDto.hashCode());
    }

    public final String toString() {
        return "NewsfeedDzenCompilationDto(description=" + this.description + ", info=" + this.info + ")";
    }

    public /* synthetic */ NewsfeedDzenCompilationDto(String str, NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedDzenCompilationInfoDto);
    }
}
