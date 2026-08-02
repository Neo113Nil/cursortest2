package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto> CREATOR = new a();

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    @pmi0("users_blocks")
    private final List<MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto> usersBlocks;

    /* compiled from: MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto[] newArray(int i) {
            return new MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto[i];
        }
    }

    public MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto(String str, String str2, List<MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto> list) {
        this.title = str;
        this.subtitle = str2;
        this.usersBlocks = list;
    }

    public final String d() {
        return this.subtitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto> e() {
        return this.usersBlocks;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto)) {
            return false;
        }
        MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto messagesConversationBarPayloadGiftsBirthdaysModalInfoDto = (MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto) obj;
        return epx.f(this.title, messagesConversationBarPayloadGiftsBirthdaysModalInfoDto.title) && epx.f(this.subtitle, messagesConversationBarPayloadGiftsBirthdaysModalInfoDto.subtitle) && epx.f(this.usersBlocks, messagesConversationBarPayloadGiftsBirthdaysModalInfoDto.usersBlocks);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        return this.usersBlocks.hashCode() + urd0.a(this.title.hashCode() * 31, 31, this.subtitle);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationBarPayloadGiftsBirthdaysModalInfoDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", usersBlocks=");
        return ms9.a(')', sb, this.usersBlocks);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        Iterator a2 = ao.a(parcel, this.usersBlocks);
        while (a2.hasNext()) {
            ((MessagesConversationBarPayloadGiftsBirthdaysUsersBlockDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
