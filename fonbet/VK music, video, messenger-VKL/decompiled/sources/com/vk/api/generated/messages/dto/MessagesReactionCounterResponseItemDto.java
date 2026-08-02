package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: MessagesReactionCounterResponseItemDto.kt */
/* loaded from: classes15.dex */
public final class MessagesReactionCounterResponseItemDto implements Parcelable {
    public static final Parcelable.Creator<MessagesReactionCounterResponseItemDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("reaction_id")
    private final int reactionId;

    @pmi0("user_ids")
    private final List<UserId> userIds;

    /* compiled from: MessagesReactionCounterResponseItemDto.kt */
    public static final class a implements Parcelable.Creator<MessagesReactionCounterResponseItemDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesReactionCounterResponseItemDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            int i = 0;
            while (i != readInt3) {
                i = bo.b(MessagesReactionCounterResponseItemDto.class, parcel, arrayList, i, 1);
            }
            return new MessagesReactionCounterResponseItemDto(readInt, readInt2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesReactionCounterResponseItemDto[] newArray(int i) {
            return new MessagesReactionCounterResponseItemDto[i];
        }
    }

    public MessagesReactionCounterResponseItemDto(int i, int i2, List<UserId> list) {
        this.reactionId = i;
        this.count = i2;
        this.userIds = list;
    }

    public final int d() {
        return this.reactionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<UserId> e() {
        return this.userIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesReactionCounterResponseItemDto)) {
            return false;
        }
        MessagesReactionCounterResponseItemDto messagesReactionCounterResponseItemDto = (MessagesReactionCounterResponseItemDto) obj;
        return this.reactionId == messagesReactionCounterResponseItemDto.reactionId && this.count == messagesReactionCounterResponseItemDto.count && epx.f(this.userIds, messagesReactionCounterResponseItemDto.userIds);
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        return this.userIds.hashCode() + shy.a(this.count, Integer.hashCode(this.reactionId) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesReactionCounterResponseItemDto(reactionId=");
        sb.append(this.reactionId);
        sb.append(", count=");
        sb.append(this.count);
        sb.append(", userIds=");
        return ms9.a(')', sb, this.userIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.reactionId);
        parcel.writeInt(this.count);
        Iterator a2 = ao.a(parcel, this.userIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
