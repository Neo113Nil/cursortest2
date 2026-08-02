package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;
import xsna.zcl;

/* compiled from: MessagesKeyboardButtonPropertyActionDto.kt */
/* loaded from: classes5.dex */
public final class MessagesKeyboardButtonPropertyActionDto {

    @pmi0("hash")
    private final String hash;

    @pmi0("payload")
    private final String payload;

    @pmi0("type")
    private final String type;

    public MessagesKeyboardButtonPropertyActionDto(String str, String str2, String str3) {
        this.hash = str;
        this.type = str2;
        this.payload = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesKeyboardButtonPropertyActionDto)) {
            return false;
        }
        MessagesKeyboardButtonPropertyActionDto messagesKeyboardButtonPropertyActionDto = (MessagesKeyboardButtonPropertyActionDto) obj;
        return epx.f(this.hash, messagesKeyboardButtonPropertyActionDto.hash) && epx.f(this.type, messagesKeyboardButtonPropertyActionDto.type) && epx.f(this.payload, messagesKeyboardButtonPropertyActionDto.payload);
    }

    public final int hashCode() {
        int a = urd0.a(this.hash.hashCode() * 31, 31, this.type);
        String str = this.payload;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.hash;
        String str2 = this.type;
        return i5s.a(xe9.a("MessagesKeyboardButtonPropertyActionDto(hash=", str, ", type=", str2, ", payload="), this.payload, ")");
    }

    public /* synthetic */ MessagesKeyboardButtonPropertyActionDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
