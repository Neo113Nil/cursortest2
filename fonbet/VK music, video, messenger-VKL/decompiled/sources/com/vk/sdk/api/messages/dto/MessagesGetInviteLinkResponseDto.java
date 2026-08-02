package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;
import xsna.zcl;
import xsna.zr;

/* compiled from: MessagesGetInviteLinkResponseDto.kt */
/* loaded from: classes5.dex */
public final class MessagesGetInviteLinkResponseDto {

    @pmi0("link")
    private final String link;

    /* JADX WARN: Multi-variable type inference failed */
    public MessagesGetInviteLinkResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetInviteLinkResponseDto) && epx.f(this.link, ((MessagesGetInviteLinkResponseDto) obj).link);
    }

    public final int hashCode() {
        String str = this.link;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr.a("MessagesGetInviteLinkResponseDto(link=", this.link, ")");
    }

    public MessagesGetInviteLinkResponseDto(String str) {
        this.link = str;
    }

    public /* synthetic */ MessagesGetInviteLinkResponseDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
