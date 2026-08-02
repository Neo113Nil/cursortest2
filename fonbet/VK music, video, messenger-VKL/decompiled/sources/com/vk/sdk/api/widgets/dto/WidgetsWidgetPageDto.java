package com.vk.sdk.api.widgets.dto;

import com.vk.sdk.api.base.dto.BaseObjectCountDto;
import ru.ok.android.api.core.ApiInvocationException;
import xsna.epx;
import xsna.i5s;
import xsna.kr;
import xsna.n6j;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WidgetsWidgetPageDto.kt */
/* loaded from: classes5.dex */
public final class WidgetsWidgetPageDto {

    @pmi0("comments")
    private final BaseObjectCountDto comments;

    @pmi0("date")
    private final Integer date;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final Integer id;

    @pmi0("likes")
    private final BaseObjectCountDto likes;

    @pmi0("page_id")
    private final String pageId;

    @pmi0("photo")
    private final String photo;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    public WidgetsWidgetPageDto() {
        this(null, null, null, null, null, null, null, null, null, ApiInvocationException.ErrorCodes.IDS_BLOCKED, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WidgetsWidgetPageDto)) {
            return false;
        }
        WidgetsWidgetPageDto widgetsWidgetPageDto = (WidgetsWidgetPageDto) obj;
        return epx.f(this.comments, widgetsWidgetPageDto.comments) && epx.f(this.date, widgetsWidgetPageDto.date) && epx.f(this.description, widgetsWidgetPageDto.description) && epx.f(this.id, widgetsWidgetPageDto.id) && epx.f(this.likes, widgetsWidgetPageDto.likes) && epx.f(this.pageId, widgetsWidgetPageDto.pageId) && epx.f(this.photo, widgetsWidgetPageDto.photo) && epx.f(this.title, widgetsWidgetPageDto.title) && epx.f(this.url, widgetsWidgetPageDto.url);
    }

    public final int hashCode() {
        BaseObjectCountDto baseObjectCountDto = this.comments;
        int hashCode = (baseObjectCountDto == null ? 0 : baseObjectCountDto.hashCode()) * 31;
        Integer num = this.date;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.description;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseObjectCountDto baseObjectCountDto2 = this.likes;
        int hashCode5 = (hashCode4 + (baseObjectCountDto2 == null ? 0 : baseObjectCountDto2.hashCode())) * 31;
        String str2 = this.pageId;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.title;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.url;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        BaseObjectCountDto baseObjectCountDto = this.comments;
        Integer num = this.date;
        String str = this.description;
        Integer num2 = this.id;
        BaseObjectCountDto baseObjectCountDto2 = this.likes;
        String str2 = this.pageId;
        String str3 = this.photo;
        String str4 = this.title;
        String str5 = this.url;
        StringBuilder sb = new StringBuilder("WidgetsWidgetPageDto(comments=");
        sb.append(baseObjectCountDto);
        sb.append(", date=");
        sb.append(num);
        sb.append(", description=");
        kr.b(num2, str, ", id=", ", likes=", sb);
        sb.append(baseObjectCountDto2);
        sb.append(", pageId=");
        sb.append(str2);
        sb.append(", photo=");
        n6j.b(sb, str3, ", title=", str4, ", url=");
        return i5s.a(sb, str5, ")");
    }

    public WidgetsWidgetPageDto(BaseObjectCountDto baseObjectCountDto, Integer num, String str, Integer num2, BaseObjectCountDto baseObjectCountDto2, String str2, String str3, String str4, String str5) {
        this.comments = baseObjectCountDto;
        this.date = num;
        this.description = str;
        this.id = num2;
        this.likes = baseObjectCountDto2;
        this.pageId = str2;
        this.photo = str3;
        this.title = str4;
        this.url = str5;
    }

    public /* synthetic */ WidgetsWidgetPageDto(BaseObjectCountDto baseObjectCountDto, Integer num, String str, Integer num2, BaseObjectCountDto baseObjectCountDto2, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseObjectCountDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num2, (i & 16) != 0 ? null : baseObjectCountDto2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? null : str5);
    }
}
