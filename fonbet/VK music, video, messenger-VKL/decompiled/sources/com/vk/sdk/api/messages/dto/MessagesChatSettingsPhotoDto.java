package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.uq;
import xsna.xe9;
import xsna.xq;
import xsna.zcl;

/* compiled from: MessagesChatSettingsPhotoDto.kt */
/* loaded from: classes5.dex */
public final class MessagesChatSettingsPhotoDto {

    @pmi0("is_default_call_photo")
    private final Boolean isDefaultCallPhoto;

    @pmi0("is_default_photo")
    private final Boolean isDefaultPhoto;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    public MessagesChatSettingsPhotoDto() {
        this(null, null, null, null, null, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatSettingsPhotoDto)) {
            return false;
        }
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = (MessagesChatSettingsPhotoDto) obj;
        return epx.f(this.photo50, messagesChatSettingsPhotoDto.photo50) && epx.f(this.photo100, messagesChatSettingsPhotoDto.photo100) && epx.f(this.photo200, messagesChatSettingsPhotoDto.photo200) && epx.f(this.isDefaultPhoto, messagesChatSettingsPhotoDto.isDefaultPhoto) && epx.f(this.isDefaultCallPhoto, messagesChatSettingsPhotoDto.isDefaultCallPhoto);
    }

    public final int hashCode() {
        String str = this.photo50;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.photo100;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo200;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.isDefaultPhoto;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isDefaultCallPhoto;
        return hashCode4 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.photo50;
        String str2 = this.photo100;
        String str3 = this.photo200;
        Boolean bool = this.isDefaultPhoto;
        Boolean bool2 = this.isDefaultCallPhoto;
        StringBuilder a = xe9.a("MessagesChatSettingsPhotoDto(photo50=", str, ", photo100=", str2, ", photo200=");
        uq.c(bool, str3, ", isDefaultPhoto=", ", isDefaultCallPhoto=", a);
        return xq.d(a, bool2, ")");
    }

    public MessagesChatSettingsPhotoDto(String str, String str2, String str3, Boolean bool, Boolean bool2) {
        this.photo50 = str;
        this.photo100 = str2;
        this.photo200 = str3;
        this.isDefaultPhoto = bool;
        this.isDefaultCallPhoto = bool2;
    }

    public /* synthetic */ MessagesChatSettingsPhotoDto(String str, String str2, String str3, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2);
    }
}
