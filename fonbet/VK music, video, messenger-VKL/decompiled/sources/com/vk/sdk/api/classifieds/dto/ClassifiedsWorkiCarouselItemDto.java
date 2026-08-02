package com.vk.sdk.api.classifieds.dto;

import com.vk.sdk.api.base.dto.BaseLinkButtonDto;
import xsna.epx;
import xsna.kr;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: ClassifiedsWorkiCarouselItemDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsWorkiCarouselItemDto {

    @pmi0("action_button")
    private final BaseLinkButtonDto actionButton;

    @pmi0("category_id")
    private final Integer categoryId;

    @pmi0("company")
    private final String company;

    @pmi0("distance")
    private final String distance;

    @pmi0("id")
    private final String id;

    @pmi0("profession")
    private final String profession;

    @pmi0("salary")
    private final String salary;

    public ClassifiedsWorkiCarouselItemDto(String str, String str2, String str3, String str4, String str5, Integer num, BaseLinkButtonDto baseLinkButtonDto) {
        this.id = str;
        this.company = str2;
        this.profession = str3;
        this.salary = str4;
        this.distance = str5;
        this.categoryId = num;
        this.actionButton = baseLinkButtonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsWorkiCarouselItemDto)) {
            return false;
        }
        ClassifiedsWorkiCarouselItemDto classifiedsWorkiCarouselItemDto = (ClassifiedsWorkiCarouselItemDto) obj;
        return epx.f(this.id, classifiedsWorkiCarouselItemDto.id) && epx.f(this.company, classifiedsWorkiCarouselItemDto.company) && epx.f(this.profession, classifiedsWorkiCarouselItemDto.profession) && epx.f(this.salary, classifiedsWorkiCarouselItemDto.salary) && epx.f(this.distance, classifiedsWorkiCarouselItemDto.distance) && epx.f(this.categoryId, classifiedsWorkiCarouselItemDto.categoryId) && epx.f(this.actionButton, classifiedsWorkiCarouselItemDto.actionButton);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(urd0.a(this.id.hashCode() * 31, 31, this.company), 31, this.profession), 31, this.salary);
        String str = this.distance;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.categoryId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        return hashCode2 + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.company;
        String str3 = this.profession;
        String str4 = this.salary;
        String str5 = this.distance;
        Integer num = this.categoryId;
        BaseLinkButtonDto baseLinkButtonDto = this.actionButton;
        StringBuilder a = xe9.a("ClassifiedsWorkiCarouselItemDto(id=", str, ", company=", str2, ", profession=");
        n6j.b(a, str3, ", salary=", str4, ", distance=");
        kr.b(num, str5, ", categoryId=", ", actionButton=", a);
        a.append(baseLinkButtonDto);
        a.append(")");
        return a.toString();
    }

    public /* synthetic */ ClassifiedsWorkiCarouselItemDto(String str, String str2, String str3, String str4, String str5, Integer num, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : baseLinkButtonDto);
    }
}
