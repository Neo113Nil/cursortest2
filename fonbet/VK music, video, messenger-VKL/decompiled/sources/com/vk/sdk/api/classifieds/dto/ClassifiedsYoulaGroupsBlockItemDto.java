package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseImageDto;
import java.util.List;
import xsna.epx;
import xsna.fw3;
import xsna.jax0;
import xsna.n6j;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaGroupsBlockItemDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaGroupsBlockItemDto {

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("has_new")
    private final boolean hasNew;

    @pmi0("is_subscribed")
    private final boolean isSubscribed;

    @pmi0("last_photo_text")
    private final String lastPhotoText;

    @pmi0("new_count")
    private final int newCount;

    @pmi0("photo")
    private final List<BaseImageDto> photo;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("products")
    private final List<ClassifiedsYoulaGroupsBlockProductDto> products;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("url")
    private final String url;

    public ClassifiedsYoulaGroupsBlockItemDto(UserId userId, String str, String str2, String str3, List<ClassifiedsYoulaGroupsBlockProductDto> list, boolean z, int i, String str4, String str5, String str6, String str7, boolean z2, String str8, List<BaseImageDto> list2) {
        this.groupId = userId;
        this.title = str;
        this.subtitle = str2;
        this.url = str3;
        this.products = list;
        this.hasNew = z;
        this.newCount = i;
        this.photo50 = str4;
        this.photo100 = str5;
        this.photo200 = str6;
        this.photoBase = str7;
        this.isSubscribed = z2;
        this.lastPhotoText = str8;
        this.photo = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaGroupsBlockItemDto)) {
            return false;
        }
        ClassifiedsYoulaGroupsBlockItemDto classifiedsYoulaGroupsBlockItemDto = (ClassifiedsYoulaGroupsBlockItemDto) obj;
        return epx.f(this.groupId, classifiedsYoulaGroupsBlockItemDto.groupId) && epx.f(this.title, classifiedsYoulaGroupsBlockItemDto.title) && epx.f(this.subtitle, classifiedsYoulaGroupsBlockItemDto.subtitle) && epx.f(this.url, classifiedsYoulaGroupsBlockItemDto.url) && epx.f(this.products, classifiedsYoulaGroupsBlockItemDto.products) && this.hasNew == classifiedsYoulaGroupsBlockItemDto.hasNew && this.newCount == classifiedsYoulaGroupsBlockItemDto.newCount && epx.f(this.photo50, classifiedsYoulaGroupsBlockItemDto.photo50) && epx.f(this.photo100, classifiedsYoulaGroupsBlockItemDto.photo100) && epx.f(this.photo200, classifiedsYoulaGroupsBlockItemDto.photo200) && epx.f(this.photoBase, classifiedsYoulaGroupsBlockItemDto.photoBase) && this.isSubscribed == classifiedsYoulaGroupsBlockItemDto.isSubscribed && epx.f(this.lastPhotoText, classifiedsYoulaGroupsBlockItemDto.lastPhotoText) && epx.f(this.photo, classifiedsYoulaGroupsBlockItemDto.photo);
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(urd0.a(urd0.a(shy.a(this.newCount, qoy.b(fw3.a(urd0.a(urd0.a(urd0.a(Long.hashCode(this.groupId.b) * 31, 31, this.title), 31, this.subtitle), 31, this.url), 31, this.products), 31, this.hasNew), 31), 31, this.photo50), 31, this.photo100), 31, this.photo200), 31, this.photoBase), 31, this.isSubscribed);
        String str = this.lastPhotoText;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.photo;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.groupId;
        String str = this.title;
        String str2 = this.subtitle;
        String str3 = this.url;
        List<ClassifiedsYoulaGroupsBlockProductDto> list = this.products;
        boolean z = this.hasNew;
        int i = this.newCount;
        String str4 = this.photo50;
        String str5 = this.photo100;
        String str6 = this.photo200;
        String str7 = this.photoBase;
        boolean z2 = this.isSubscribed;
        String str8 = this.lastPhotoText;
        List<BaseImageDto> list2 = this.photo;
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaGroupsBlockItemDto(groupId=");
        sb.append(userId);
        sb.append(", title=");
        sb.append(str);
        sb.append(", subtitle=");
        n6j.b(sb, str2, ", url=", str3, ", products=");
        sb.append(list);
        sb.append(", hasNew=");
        sb.append(z);
        sb.append(", newCount=");
        jax0.a(i, ", photo50=", str4, ", photo100=", sb);
        n6j.b(sb, str5, ", photo200=", str6, ", photoBase=");
        sb.append(str7);
        sb.append(", isSubscribed=");
        sb.append(z2);
        sb.append(", lastPhotoText=");
        sb.append(str8);
        sb.append(", photo=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ClassifiedsYoulaGroupsBlockItemDto(UserId userId, String str, String str2, String str3, List list, boolean z, int i, String str4, String str5, String str6, String str7, boolean z2, String str8, List list2, int i2, zcl zclVar) {
        this(userId, str, str2, str3, list, z, i, str4, str5, str6, str7, z2, (i2 & 4096) != 0 ? null : str8, (i2 & 8192) != 0 ? null : list2);
    }
}
