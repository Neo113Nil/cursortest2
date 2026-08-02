package com.vk.sdk.api.classifieds.dto;

import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.n6j;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemVkAuthorDto.kt */
/* loaded from: classes5.dex */
public final class ClassifiedsYoulaItemVkAuthorDto {

    @pmi0("active_items_count")
    private final Integer activeItemsCount;

    @pmi0("id")
    private final UserId id;

    @pmi0("name")
    private final String name;

    @pmi0("photo_url")
    private final String photoUrl;

    @pmi0("profile_link")
    private final String profileLink;

    @pmi0("seller_profile_url")
    private final String sellerProfileUrl;

    public ClassifiedsYoulaItemVkAuthorDto(UserId userId, String str, String str2, String str3, String str4, Integer num) {
        this.id = userId;
        this.name = str;
        this.profileLink = str2;
        this.sellerProfileUrl = str3;
        this.photoUrl = str4;
        this.activeItemsCount = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemVkAuthorDto)) {
            return false;
        }
        ClassifiedsYoulaItemVkAuthorDto classifiedsYoulaItemVkAuthorDto = (ClassifiedsYoulaItemVkAuthorDto) obj;
        return epx.f(this.id, classifiedsYoulaItemVkAuthorDto.id) && epx.f(this.name, classifiedsYoulaItemVkAuthorDto.name) && epx.f(this.profileLink, classifiedsYoulaItemVkAuthorDto.profileLink) && epx.f(this.sellerProfileUrl, classifiedsYoulaItemVkAuthorDto.sellerProfileUrl) && epx.f(this.photoUrl, classifiedsYoulaItemVkAuthorDto.photoUrl) && epx.f(this.activeItemsCount, classifiedsYoulaItemVkAuthorDto.activeItemsCount);
    }

    public final int hashCode() {
        int a = urd0.a(urd0.a(Long.hashCode(this.id.b) * 31, 31, this.name), 31, this.profileLink);
        String str = this.sellerProfileUrl;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photoUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.activeItemsCount;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        String str = this.name;
        String str2 = this.profileLink;
        String str3 = this.sellerProfileUrl;
        String str4 = this.photoUrl;
        Integer num = this.activeItemsCount;
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemVkAuthorDto(id=");
        sb.append(userId);
        sb.append(", name=");
        sb.append(str);
        sb.append(", profileLink=");
        n6j.b(sb, str2, ", sellerProfileUrl=", str3, ", photoUrl=");
        sb.append(str4);
        sb.append(", activeItemsCount=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ ClassifiedsYoulaItemVkAuthorDto(UserId userId, String str, String str2, String str3, String str4, Integer num, int i, zcl zclVar) {
        this(userId, str, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : num);
    }
}
