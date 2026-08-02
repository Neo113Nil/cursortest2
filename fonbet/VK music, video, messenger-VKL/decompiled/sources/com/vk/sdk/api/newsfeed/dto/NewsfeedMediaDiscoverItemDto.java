package com.vk.sdk.api.newsfeed.dto;

import java.util.List;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;
import xsna.epx;
import xsna.fw3;
import xsna.i5s;
import xsna.odj;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: NewsfeedMediaDiscoverItemDto.kt */
/* loaded from: classes5.dex */
public final class NewsfeedMediaDiscoverItemDto {

    @pmi0("action")
    private final NewsfeedMediaDiscoverActionDto action;

    @pmi0("height")
    private final int height;

    @pmi0(DatabaseHelper.ITEM_COLUMN_NAME)
    private final NewsfeedNewsfeedItemDto item;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("tags")
    private final List<String> tags;

    @pmi0("title")
    private final String title;

    @pmi0("width")
    private final int width;

    public NewsfeedMediaDiscoverItemDto(int i, int i2, NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, List<String> list, NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto, String str, String str2) {
        this.width = i;
        this.height = i2;
        this.item = newsfeedNewsfeedItemDto;
        this.tags = list;
        this.action = newsfeedMediaDiscoverActionDto;
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedMediaDiscoverItemDto)) {
            return false;
        }
        NewsfeedMediaDiscoverItemDto newsfeedMediaDiscoverItemDto = (NewsfeedMediaDiscoverItemDto) obj;
        return this.width == newsfeedMediaDiscoverItemDto.width && this.height == newsfeedMediaDiscoverItemDto.height && epx.f(this.item, newsfeedMediaDiscoverItemDto.item) && epx.f(this.tags, newsfeedMediaDiscoverItemDto.tags) && epx.f(this.action, newsfeedMediaDiscoverItemDto.action) && epx.f(this.title, newsfeedMediaDiscoverItemDto.title) && epx.f(this.subtitle, newsfeedMediaDiscoverItemDto.subtitle);
    }

    public final int hashCode() {
        int a = fw3.a((this.item.hashCode() + shy.a(this.height, Integer.hashCode(this.width) * 31, 31)) * 31, 31, this.tags);
        NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto = this.action;
        int hashCode = (a + (newsfeedMediaDiscoverActionDto == null ? 0 : newsfeedMediaDiscoverActionDto.hashCode())) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitle;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        int i = this.width;
        int i2 = this.height;
        NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto = this.item;
        List<String> list = this.tags;
        NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto = this.action;
        String str = this.title;
        String str2 = this.subtitle;
        StringBuilder a = odj.a(i, i2, "NewsfeedMediaDiscoverItemDto(width=", ", height=", ", item=");
        a.append(newsfeedNewsfeedItemDto);
        a.append(", tags=");
        a.append(list);
        a.append(", action=");
        a.append(newsfeedMediaDiscoverActionDto);
        a.append(", title=");
        a.append(str);
        a.append(", subtitle=");
        return i5s.a(a, str2, ")");
    }

    public /* synthetic */ NewsfeedMediaDiscoverItemDto(int i, int i2, NewsfeedNewsfeedItemDto newsfeedNewsfeedItemDto, List list, NewsfeedMediaDiscoverActionDto newsfeedMediaDiscoverActionDto, String str, String str2, int i3, zcl zclVar) {
        this(i, i2, newsfeedNewsfeedItemDto, list, (i3 & 16) != 0 ? null : newsfeedMediaDiscoverActionDto, (i3 & 32) != 0 ? null : str, (i3 & 64) != 0 ? null : str2);
    }
}
