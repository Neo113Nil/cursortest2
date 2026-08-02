package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.i5s;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: ClassifiedsYoulaCarouselBlockGroupDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaCarouselBlockGroupDto {

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("url")
    private final String url;

    public ClassifiedsYoulaCarouselBlockGroupDto(UserId userId, String str, String str2, String str3, String str4, String str5, String str6) {
        this.id = userId;
        this.name = str;
        this.photo50 = str2;
        this.photo100 = str3;
        this.photo200 = str4;
        this.photoBase = str5;
        this.url = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaCarouselBlockGroupDto)) {
            return false;
        }
        ClassifiedsYoulaCarouselBlockGroupDto classifiedsYoulaCarouselBlockGroupDto = (ClassifiedsYoulaCarouselBlockGroupDto) obj;
        return epx.f(this.id, classifiedsYoulaCarouselBlockGroupDto.id) && epx.f(this.name, classifiedsYoulaCarouselBlockGroupDto.name) && epx.f(this.photo50, classifiedsYoulaCarouselBlockGroupDto.photo50) && epx.f(this.photo100, classifiedsYoulaCarouselBlockGroupDto.photo100) && epx.f(this.photo200, classifiedsYoulaCarouselBlockGroupDto.photo200) && epx.f(this.photoBase, classifiedsYoulaCarouselBlockGroupDto.photoBase) && epx.f(this.url, classifiedsYoulaCarouselBlockGroupDto.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + urd0.a(urd0.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.photo50), 31, this.photo100), 31, this.photo200), 31, this.photoBase);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.name;
        String str2 = this.photo50;
        String str3 = this.photo100;
        String str4 = this.photo200;
        String str5 = this.photoBase;
        String str6 = this.url;
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaCarouselBlockGroupDto(id=");
        sb.append(userId);
        sb.append(", name=");
        sb.append(str);
        sb.append(", photo50=");
        n6j.b(sb, str2, ", photo100=", str3, ", photo200=");
        n6j.b(sb, str4, ", photoBase=", str5, ", url=");
        return i5s.a(sb, str6, ")");
    }
}
