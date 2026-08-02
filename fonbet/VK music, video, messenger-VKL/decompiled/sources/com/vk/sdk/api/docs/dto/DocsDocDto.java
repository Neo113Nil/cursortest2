package com.vk.sdk.api.docs.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import java.util.List;
import xsna.bh10;
import xsna.epx;
import xsna.jax0;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: DocsDocDto.kt */
/* loaded from: classes5.dex */
public final class DocsDocDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("date")
    private final int date;

    @pmi0("ext")
    private final String ext;

    @pmi0("id")
    private final int id;

    @pmi0("is_licensed")
    private final BaseBoolIntDto isLicensed;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("preview")
    private final DocsDocPreviewDto preview;

    @pmi0("size")
    private final int size;

    @pmi0("tags")
    private final List<String> tags;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final int type;

    @pmi0("url")
    private final String url;

    public DocsDocDto(int i, UserId userId, String str, int i2, String str2, int i3, int i4, String str3, DocsDocPreviewDto docsDocPreviewDto, BaseBoolIntDto baseBoolIntDto, String str4, List<String> list) {
        this.id = i;
        this.ownerId = userId;
        this.title = str;
        this.size = i2;
        this.ext = str2;
        this.date = i3;
        this.type = i4;
        this.url = str3;
        this.preview = docsDocPreviewDto;
        this.isLicensed = baseBoolIntDto;
        this.accessKey = str4;
        this.tags = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DocsDocDto)) {
            return false;
        }
        DocsDocDto docsDocDto = (DocsDocDto) obj;
        return this.id == docsDocDto.id && epx.f(this.ownerId, docsDocDto.ownerId) && epx.f(this.title, docsDocDto.title) && this.size == docsDocDto.size && epx.f(this.ext, docsDocDto.ext) && this.date == docsDocDto.date && this.type == docsDocDto.type && epx.f(this.url, docsDocDto.url) && epx.f(this.preview, docsDocDto.preview) && this.isLicensed == docsDocDto.isLicensed && epx.f(this.accessKey, docsDocDto.accessKey) && epx.f(this.tags, docsDocDto.tags);
    }

    public final int hashCode() {
        int a = shy.a(this.type, shy.a(this.date, urd0.a(shy.a(this.size, urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.title), 31), 31, this.ext), 31), 31);
        String str = this.url;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        DocsDocPreviewDto docsDocPreviewDto = this.preview;
        int hashCode2 = (hashCode + (docsDocPreviewDto == null ? 0 : docsDocPreviewDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.isLicensed;
        int hashCode3 = (hashCode2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        String str2 = this.accessKey;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.tags;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        String str = this.title;
        int i2 = this.size;
        String str2 = this.ext;
        int i3 = this.date;
        int i4 = this.type;
        String str3 = this.url;
        DocsDocPreviewDto docsDocPreviewDto = this.preview;
        BaseBoolIntDto baseBoolIntDto = this.isLicensed;
        String str4 = this.accessKey;
        List<String> list = this.tags;
        StringBuilder sb = new StringBuilder("DocsDocDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", title=");
        nyh0.a(i2, str, ", size=", ", ext=", sb);
        nyh0.a(i3, str2, ", date=", ", type=", sb);
        jax0.a(i4, ", url=", str3, ", preview=", sb);
        sb.append(docsDocPreviewDto);
        sb.append(", isLicensed=");
        sb.append(baseBoolIntDto);
        sb.append(", accessKey=");
        sb.append(str4);
        sb.append(", tags=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ DocsDocDto(int i, UserId userId, String str, int i2, String str2, int i3, int i4, String str3, DocsDocPreviewDto docsDocPreviewDto, BaseBoolIntDto baseBoolIntDto, String str4, List list, int i5, zcl zclVar) {
        this(i, userId, str, i2, str2, i3, i4, (i5 & 128) != 0 ? null : str3, (i5 & 256) != 0 ? null : docsDocPreviewDto, (i5 & 512) != 0 ? null : baseBoolIntDto, (i5 & 1024) != 0 ? null : str4, (i5 & 2048) != 0 ? null : list);
    }
}
