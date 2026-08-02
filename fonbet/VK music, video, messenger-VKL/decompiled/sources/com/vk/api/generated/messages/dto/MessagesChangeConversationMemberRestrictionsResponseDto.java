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

/* compiled from: MessagesChangeConversationMemberRestrictionsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChangeConversationMemberRestrictionsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChangeConversationMemberRestrictionsResponseDto> CREATOR = new a();

    @pmi0("failed_member_ids")
    private final List<UserId> failedMemberIds;

    /* compiled from: MessagesChangeConversationMemberRestrictionsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChangeConversationMemberRestrictionsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChangeConversationMemberRestrictionsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MessagesChangeConversationMemberRestrictionsResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MessagesChangeConversationMemberRestrictionsResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChangeConversationMemberRestrictionsResponseDto[] newArray(int i) {
            return new MessagesChangeConversationMemberRestrictionsResponseDto[i];
        }
    }

    public MessagesChangeConversationMemberRestrictionsResponseDto(List<UserId> list) {
        this.failedMemberIds = list;
    }

    public final List<UserId> d() {
        return this.failedMemberIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesChangeConversationMemberRestrictionsResponseDto) && epx.f(this.failedMemberIds, ((MessagesChangeConversationMemberRestrictionsResponseDto) obj).failedMemberIds);
    }

    public final int hashCode() {
        return this.failedMemberIds.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesChangeConversationMemberRestrictionsResponseDto(failedMemberIds="), this.failedMemberIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.failedMemberIds);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
