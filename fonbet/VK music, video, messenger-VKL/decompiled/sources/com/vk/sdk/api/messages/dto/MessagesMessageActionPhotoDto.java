package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;

/* compiled from: MessagesMessageActionPhotoDto.kt */
/* loaded from: classes5.dex */
public final class MessagesMessageActionPhotoDto {

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    public MessagesMessageActionPhotoDto(String str, String str2, String str3) {
        this.photo50 = str;
        this.photo100 = str2;
        this.photo200 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesMessageActionPhotoDto)) {
            return false;
        }
        MessagesMessageActionPhotoDto messagesMessageActionPhotoDto = (MessagesMessageActionPhotoDto) obj;
        return epx.f(this.photo50, messagesMessageActionPhotoDto.photo50) && epx.f(this.photo100, messagesMessageActionPhotoDto.photo100) && epx.f(this.photo200, messagesMessageActionPhotoDto.photo200);
    }

    public final int hashCode() {
        return this.photo200.hashCode() + urd0.a(this.photo50.hashCode() * 31, 31, this.photo100);
    }

    public final String toString() {
        String str = this.photo50;
        String str2 = this.photo100;
        return i5s.a(xe9.a("MessagesMessageActionPhotoDto(photo50=", str, ", photo100=", str2, ", photo200="), this.photo200, ")");
    }
}
