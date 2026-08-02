package com.vk.sdk.api.newsfeed.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.epx;
import xsna.kh10;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: NewsfeedListFullDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedListFullDto {

    @pmi0("id")
    private final int id;

    @pmi0("no_reposts")
    private final BaseBoolIntDto noReposts;

    @pmi0("source_ids")
    private final List<UserId> sourceIds;

    @pmi0("title")
    private final String title;

    public NewsfeedListFullDto(int i, String str, BaseBoolIntDto baseBoolIntDto, List<UserId> list) {
        this.id = i;
        this.title = str;
        this.noReposts = baseBoolIntDto;
        this.sourceIds = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedListFullDto)) {
            return false;
        }
        NewsfeedListFullDto newsfeedListFullDto = (NewsfeedListFullDto) obj;
        return this.id == newsfeedListFullDto.id && epx.f(this.title, newsfeedListFullDto.title) && this.noReposts == newsfeedListFullDto.noReposts && epx.f(this.sourceIds, newsfeedListFullDto.sourceIds);
    }

    public final int hashCode() {
        int a = urd0.a(Integer.hashCode(this.id) * 31, 31, this.title);
        BaseBoolIntDto baseBoolIntDto = this.noReposts;
        int hashCode = (a + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        List<UserId> list = this.sourceIds;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        String str = this.title;
        BaseBoolIntDto baseBoolIntDto = this.noReposts;
        List<UserId> list = this.sourceIds;
        StringBuilder a = kh10.a(i, "NewsfeedListFullDto(id=", ", title=", str, ", noReposts=");
        a.append(baseBoolIntDto);
        a.append(", sourceIds=");
        a.append(list);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ NewsfeedListFullDto(int i, String str, BaseBoolIntDto baseBoolIntDto, List list, int i2, zcl zclVar) {
        this(i, str, (i2 & 4) != 0 ? null : baseBoolIntDto, (i2 & 8) != 0 ? null : list);
    }
}
