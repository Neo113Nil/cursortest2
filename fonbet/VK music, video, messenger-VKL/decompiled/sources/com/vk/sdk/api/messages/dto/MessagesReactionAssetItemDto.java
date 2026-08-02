package com.vk.sdk.api.messages.dto;

import xsna.epx;
import xsna.pmi0;

/* compiled from: MessagesReactionAssetItemDto.kt */
/* loaded from: classes5.dex */
public final class MessagesReactionAssetItemDto {

    @pmi0("links")
    private final MessagesReactionAssetItemLinksDto links;

    @pmi0("reaction_id")
    private final int reactionId;

    public MessagesReactionAssetItemDto(int i, MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto) {
        this.reactionId = i;
        this.links = messagesReactionAssetItemLinksDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionAssetItemDto)) {
            return false;
        }
        MessagesReactionAssetItemDto messagesReactionAssetItemDto = (MessagesReactionAssetItemDto) obj;
        return this.reactionId == messagesReactionAssetItemDto.reactionId && epx.f(this.links, messagesReactionAssetItemDto.links);
    }

    public final int hashCode() {
        return this.links.hashCode() + (Integer.hashCode(this.reactionId) * 31);
    }

    public final String toString() {
        return "MessagesReactionAssetItemDto(reactionId=" + this.reactionId + ", links=" + this.links + ")";
    }
}
