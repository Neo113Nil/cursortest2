package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.i5s;
import xsna.pmi0;
import xsna.urd0;
import xsna.xe9;

/* compiled from: MessagesReactionAssetItemLinksDto.kt */
/* loaded from: classes5.dex */
public final class MessagesReactionAssetItemLinksDto {

    @pmi0("big_animation")
    private final String bigAnimation;

    @pmi0("small_animation")
    private final String smallAnimation;

    /* renamed from: static, reason: not valid java name */
    @pmi0("static")
    private final String f34static;

    public MessagesReactionAssetItemLinksDto(String str, String str2, String str3) {
        this.bigAnimation = str;
        this.smallAnimation = str2;
        this.f34static = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionAssetItemLinksDto)) {
            return false;
        }
        MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto = (MessagesReactionAssetItemLinksDto) obj;
        return epx.f(this.bigAnimation, messagesReactionAssetItemLinksDto.bigAnimation) && epx.f(this.smallAnimation, messagesReactionAssetItemLinksDto.smallAnimation) && epx.f(this.f34static, messagesReactionAssetItemLinksDto.f34static);
    }

    public final int hashCode() {
        return this.f34static.hashCode() + urd0.a(this.bigAnimation.hashCode() * 31, 31, this.smallAnimation);
    }

    public final String toString() {
        String str = this.bigAnimation;
        String str2 = this.smallAnimation;
        return i5s.a(xe9.a("MessagesReactionAssetItemLinksDto(bigAnimation=", str, ", smallAnimation=", str2, ", static="), this.f34static, ")");
    }
}
