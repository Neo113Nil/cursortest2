package com.vk.sdk.api.friends.dto;

import com.ironsource.X3;
import com.vk.sdk.api.photos.dto.PhotosPhotoSizesDto;
import java.util.List;
import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.sq;
import xsna.urd0;
import xsna.vq;
import xsna.xe9;
import xsna.zcl;

/* compiled from: FriendsRecBlockInfoCardDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecBlockInfoCardDto {

    @pmi0("button_text")
    private final String buttonText;

    @pmi0("descriptions")
    private final List<String> descriptions;

    @pmi0("friends_count")
    private final Integer friendsCount;

    @pmi0("images")
    private final List<PhotosPhotoSizesDto> images;

    @pmi0(X3.i.L)
    private final Integer position;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("template")
    private final FriendsRecBlockInfoCardTemplateDto template;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    public FriendsRecBlockInfoCardDto(String str, String str2, FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto, String str3, List<String> list, List<PhotosPhotoSizesDto> list2, Integer num, Integer num2, String str4) {
        this.title = str;
        this.buttonText = str2;
        this.template = friendsRecBlockInfoCardTemplateDto;
        this.subtitle = str3;
        this.descriptions = list;
        this.images = list2;
        this.friendsCount = num;
        this.position = num2;
        this.trackCode = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecBlockInfoCardDto)) {
            return false;
        }
        FriendsRecBlockInfoCardDto friendsRecBlockInfoCardDto = (FriendsRecBlockInfoCardDto) obj;
        return epx.f(this.title, friendsRecBlockInfoCardDto.title) && epx.f(this.buttonText, friendsRecBlockInfoCardDto.buttonText) && this.template == friendsRecBlockInfoCardDto.template && epx.f(this.subtitle, friendsRecBlockInfoCardDto.subtitle) && epx.f(this.descriptions, friendsRecBlockInfoCardDto.descriptions) && epx.f(this.images, friendsRecBlockInfoCardDto.images) && epx.f(this.friendsCount, friendsRecBlockInfoCardDto.friendsCount) && epx.f(this.position, friendsRecBlockInfoCardDto.position) && epx.f(this.trackCode, friendsRecBlockInfoCardDto.trackCode);
    }

    public final int hashCode() {
        int a = urd0.a(this.title.hashCode() * 31, 31, this.buttonText);
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto = this.template;
        int hashCode = (a + (friendsRecBlockInfoCardTemplateDto == null ? 0 : friendsRecBlockInfoCardTemplateDto.hashCode())) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.descriptions;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<PhotosPhotoSizesDto> list2 = this.images;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.friendsCount;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.position;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.trackCode;
        return hashCode6 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.buttonText;
        FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto = this.template;
        String str3 = this.subtitle;
        List<String> list = this.descriptions;
        List<PhotosPhotoSizesDto> list2 = this.images;
        Integer num = this.friendsCount;
        Integer num2 = this.position;
        String str4 = this.trackCode;
        StringBuilder a = xe9.a("FriendsRecBlockInfoCardDto(title=", str, ", buttonText=", str2, ", template=");
        a.append(friendsRecBlockInfoCardTemplateDto);
        a.append(", subtitle=");
        a.append(str3);
        a.append(", descriptions=");
        vq.d(a, list, ", images=", list2, ", friendsCount=");
        sq.b(a, num, ", position=", num2, ", trackCode=");
        return i5s.a(a, str4, ")");
    }

    public /* synthetic */ FriendsRecBlockInfoCardDto(String str, String str2, FriendsRecBlockInfoCardTemplateDto friendsRecBlockInfoCardTemplateDto, String str3, List list, List list2, Integer num, Integer num2, String str4, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : friendsRecBlockInfoCardTemplateDto, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : str4);
    }
}
