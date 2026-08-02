package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetItemsFilterDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetItemsFilterDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetItemsFilterDto[] $VALUES;

    @pmi0("ad_tag")
    public static final MessagesGetItemsFilterDto AD_TAG;

    @pmi0("all")
    public static final MessagesGetItemsFilterDto ALL;

    @pmi0("archive")
    public static final MessagesGetItemsFilterDto ARCHIVE;

    @pmi0("business_notify")
    public static final MessagesGetItemsFilterDto BUSINESS_NOTIFY;
    public static final Parcelable.Creator<MessagesGetItemsFilterDto> CREATOR;

    @pmi0("important")
    public static final MessagesGetItemsFilterDto IMPORTANT;

    @pmi0("unanswered")
    public static final MessagesGetItemsFilterDto UNANSWERED;

    @pmi0("unread")
    public static final MessagesGetItemsFilterDto UNREAD;
    private final String value;

    /* compiled from: MessagesGetItemsFilterDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetItemsFilterDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetItemsFilterDto createFromParcel(Parcel parcel) {
            return MessagesGetItemsFilterDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetItemsFilterDto[] newArray(int i) {
            return new MessagesGetItemsFilterDto[i];
        }
    }

    static {
        MessagesGetItemsFilterDto messagesGetItemsFilterDto = new MessagesGetItemsFilterDto("ALL", 0, "all");
        ALL = messagesGetItemsFilterDto;
        MessagesGetItemsFilterDto messagesGetItemsFilterDto2 = new MessagesGetItemsFilterDto("UNREAD", 1, "unread");
        UNREAD = messagesGetItemsFilterDto2;
        MessagesGetItemsFilterDto messagesGetItemsFilterDto3 = new MessagesGetItemsFilterDto("ARCHIVE", 2, "archive");
        ARCHIVE = messagesGetItemsFilterDto3;
        MessagesGetItemsFilterDto messagesGetItemsFilterDto4 = new MessagesGetItemsFilterDto("BUSINESS_NOTIFY", 3, "business_notify");
        BUSINESS_NOTIFY = messagesGetItemsFilterDto4;
        MessagesGetItemsFilterDto messagesGetItemsFilterDto5 = new MessagesGetItemsFilterDto("IMPORTANT", 4, "important");
        IMPORTANT = messagesGetItemsFilterDto5;
        MessagesGetItemsFilterDto messagesGetItemsFilterDto6 = new MessagesGetItemsFilterDto("UNANSWERED", 5, "unanswered");
        UNANSWERED = messagesGetItemsFilterDto6;
        MessagesGetItemsFilterDto messagesGetItemsFilterDto7 = new MessagesGetItemsFilterDto("AD_TAG", 6, "ad_tag");
        AD_TAG = messagesGetItemsFilterDto7;
        MessagesGetItemsFilterDto[] messagesGetItemsFilterDtoArr = {messagesGetItemsFilterDto, messagesGetItemsFilterDto2, messagesGetItemsFilterDto3, messagesGetItemsFilterDto4, messagesGetItemsFilterDto5, messagesGetItemsFilterDto6, messagesGetItemsFilterDto7};
        $VALUES = messagesGetItemsFilterDtoArr;
        $ENTRIES = new asp(messagesGetItemsFilterDtoArr);
        CREATOR = new a();
    }

    private MessagesGetItemsFilterDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetItemsFilterDto valueOf(String str) {
        return (MessagesGetItemsFilterDto) Enum.valueOf(MessagesGetItemsFilterDto.class, str);
    }

    public static MessagesGetItemsFilterDto[] values() {
        return (MessagesGetItemsFilterDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
