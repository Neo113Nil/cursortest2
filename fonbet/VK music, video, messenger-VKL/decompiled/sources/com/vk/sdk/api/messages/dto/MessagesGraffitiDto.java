package com.vk.sdk.api.messages.dto;

import com.vk.dto.common.id.UserId;
import xsna.bh10;
import xsna.epx;
import xsna.nyh0;
import xsna.pmi0;
import xsna.shy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesGraffitiDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGraffitiDto {

    @pmi0("access_key")
    private final String accessKey;

    @pmi0("height")
    private final int height;

    @pmi0("id")
    private final int id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    public MessagesGraffitiDto(int i, UserId userId, String str, int i2, int i3, String str2) {
        this.id = i;
        this.ownerId = userId;
        this.url = str;
        this.width = i2;
        this.height = i3;
        this.accessKey = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGraffitiDto)) {
            return false;
        }
        MessagesGraffitiDto messagesGraffitiDto = (MessagesGraffitiDto) obj;
        return this.id == messagesGraffitiDto.id && epx.f(this.ownerId, messagesGraffitiDto.ownerId) && epx.f(this.url, messagesGraffitiDto.url) && this.width == messagesGraffitiDto.width && this.height == messagesGraffitiDto.height && epx.f(this.accessKey, messagesGraffitiDto.accessKey);
    }

    public final int hashCode() {
        int a = shy.a(this.height, shy.a(this.width, urd0.a(bh10.a(Integer.hashCode(this.id) * 31, 31, this.ownerId.b), 31, this.url), 31), 31);
        String str = this.accessKey;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        int i = this.id;
        UserId userId = this.ownerId;
        String str = this.url;
        int i2 = this.width;
        int i3 = this.height;
        String str2 = this.accessKey;
        StringBuilder sb = new StringBuilder("MessagesGraffitiDto(id=");
        sb.append(i);
        sb.append(", ownerId=");
        sb.append(userId);
        sb.append(", url=");
        nyh0.a(i2, str, ", width=", ", height=", sb);
        sb.append(i3);
        sb.append(", accessKey=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ MessagesGraffitiDto(int i, UserId userId, String str, int i2, int i3, String str2, int i4, zcl zclVar) {
        this(i, userId, str, i2, i3, (i4 & 32) != 0 ? null : str2);
    }
}
