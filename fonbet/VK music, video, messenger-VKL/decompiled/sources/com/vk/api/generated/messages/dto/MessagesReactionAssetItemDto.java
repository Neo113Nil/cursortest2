package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MessagesReactionAssetItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesReactionAssetItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesReactionAssetItemDto> CREATOR = new a();

    @pmi0("links")
    private final MessagesReactionAssetItemLinksDto links;

    @pmi0("reaction_id")
    private final int reactionId;

    /* compiled from: MessagesReactionAssetItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesReactionAssetItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesReactionAssetItemDto createFromParcel(Parcel parcel) {
            return new MessagesReactionAssetItemDto(parcel.readInt(), MessagesReactionAssetItemLinksDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesReactionAssetItemDto[] newArray(int i) {
            return new MessagesReactionAssetItemDto[i];
        }
    }

    public MessagesReactionAssetItemDto(int i, MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto) {
        this.reactionId = i;
        this.links = messagesReactionAssetItemLinksDto;
    }

    public final MessagesReactionAssetItemLinksDto d() {
        return this.links;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.reactionId;
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
        return "MessagesReactionAssetItemDto(reactionId=" + this.reactionId + ", links=" + this.links + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reactionId);
        this.links.writeToParcel(parcel, i);
    }
}
