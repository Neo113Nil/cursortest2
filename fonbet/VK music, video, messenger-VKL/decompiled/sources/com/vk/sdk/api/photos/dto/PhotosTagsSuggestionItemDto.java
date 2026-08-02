package com.vk.sdk.api.photos.dto;

import com.vk.movika.sdk.base.model.history.b;
import java.util.List;
import xsna.epx;
import xsna.h5s;
import xsna.pmi0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: PhotosTagsSuggestionItemDto.kt */
/* loaded from: classes5.dex */
public final class PhotosTagsSuggestionItemDto {

    @pmi0("buttons")
    private final List<PhotosTagsSuggestionItemButtonDto> buttons;

    @pmi0("caption")
    private final String caption;

    @pmi0("photo")
    private final PhotosPhotoDto photo;

    @pmi0("tags")
    private final List<PhotosPhotoTagDto> tags;

    @pmi0("title")
    private final String title;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("type")
    private final String type;

    @pmi0("web_view_token")
    private final String webViewToken;

    public PhotosTagsSuggestionItemDto() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotosTagsSuggestionItemDto)) {
            return false;
        }
        PhotosTagsSuggestionItemDto photosTagsSuggestionItemDto = (PhotosTagsSuggestionItemDto) obj;
        return epx.f(this.title, photosTagsSuggestionItemDto.title) && epx.f(this.caption, photosTagsSuggestionItemDto.caption) && epx.f(this.type, photosTagsSuggestionItemDto.type) && epx.f(this.buttons, photosTagsSuggestionItemDto.buttons) && epx.f(this.photo, photosTagsSuggestionItemDto.photo) && epx.f(this.tags, photosTagsSuggestionItemDto.tags) && epx.f(this.trackCode, photosTagsSuggestionItemDto.trackCode) && epx.f(this.webViewToken, photosTagsSuggestionItemDto.webViewToken);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.caption;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<PhotosTagsSuggestionItemButtonDto> list = this.buttons;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.photo;
        int hashCode5 = (hashCode4 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        List<PhotosPhotoTagDto> list2 = this.tags;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.webViewToken;
        return hashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.caption;
        String str3 = this.type;
        List<PhotosTagsSuggestionItemButtonDto> list = this.buttons;
        PhotosPhotoDto photosPhotoDto = this.photo;
        List<PhotosPhotoTagDto> list2 = this.tags;
        String str4 = this.trackCode;
        String str5 = this.webViewToken;
        StringBuilder a = xe9.a("PhotosTagsSuggestionItemDto(title=", str, ", caption=", str2, ", type=");
        b.c(str3, ", buttons=", ", photo=", a, list);
        a.append(photosPhotoDto);
        a.append(", tags=");
        a.append(list2);
        a.append(", trackCode=");
        return h5s.d(a, str4, ", webViewToken=", str5, ")");
    }

    public PhotosTagsSuggestionItemDto(String str, String str2, String str3, List<PhotosTagsSuggestionItemButtonDto> list, PhotosPhotoDto photosPhotoDto, List<PhotosPhotoTagDto> list2, String str4, String str5) {
        this.title = str;
        this.caption = str2;
        this.type = str3;
        this.buttons = list;
        this.photo = photosPhotoDto;
        this.tags = list2;
        this.trackCode = str4;
        this.webViewToken = str5;
    }

    public /* synthetic */ PhotosTagsSuggestionItemDto(String str, String str2, String str3, List list, PhotosPhotoDto photosPhotoDto, List list2, String str4, String str5, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : photosPhotoDto, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5);
    }
}
