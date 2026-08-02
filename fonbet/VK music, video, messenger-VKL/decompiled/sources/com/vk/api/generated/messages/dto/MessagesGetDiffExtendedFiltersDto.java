package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesGetDiffExtendedFiltersDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetDiffExtendedFiltersDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesGetDiffExtendedFiltersDto[] $VALUES;

    @pmi0("changed_objects")
    public static final MessagesGetDiffExtendedFiltersDto CHANGED_OBJECTS;

    @pmi0("contacts")
    public static final MessagesGetDiffExtendedFiltersDto CONTACTS;

    @pmi0("conversations_banner")
    public static final MessagesGetDiffExtendedFiltersDto CONVERSATIONS_BANNER;

    @pmi0("counters")
    public static final MessagesGetDiffExtendedFiltersDto COUNTERS;
    public static final Parcelable.Creator<MessagesGetDiffExtendedFiltersDto> CREATOR;

    @pmi0("credentials")
    public static final MessagesGetDiffExtendedFiltersDto CREDENTIALS;

    @pmi0("folders")
    public static final MessagesGetDiffExtendedFiltersDto FOLDERS;

    @pmi0("folders_with_peers")
    public static final MessagesGetDiffExtendedFiltersDto FOLDERS_WITH_PEERS;

    @pmi0("groups")
    public static final MessagesGetDiffExtendedFiltersDto GROUPS;

    @pmi0("messages")
    public static final MessagesGetDiffExtendedFiltersDto MESSAGES;

    @pmi0("profiles")
    public static final MessagesGetDiffExtendedFiltersDto PROFILES;

    @pmi0("server_time")
    public static final MessagesGetDiffExtendedFiltersDto SERVER_TIME;

    @pmi0("server_version")
    public static final MessagesGetDiffExtendedFiltersDto SERVER_VERSION;
    private final String value;

    /* compiled from: MessagesGetDiffExtendedFiltersDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetDiffExtendedFiltersDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffExtendedFiltersDto createFromParcel(Parcel parcel) {
            return MessagesGetDiffExtendedFiltersDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetDiffExtendedFiltersDto[] newArray(int i) {
            return new MessagesGetDiffExtendedFiltersDto[i];
        }
    }

    static {
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto = new MessagesGetDiffExtendedFiltersDto("CHANGED_OBJECTS", 0, "changed_objects");
        CHANGED_OBJECTS = messagesGetDiffExtendedFiltersDto;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto2 = new MessagesGetDiffExtendedFiltersDto("CONTACTS", 1, "contacts");
        CONTACTS = messagesGetDiffExtendedFiltersDto2;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto3 = new MessagesGetDiffExtendedFiltersDto("CONVERSATIONS_BANNER", 2, "conversations_banner");
        CONVERSATIONS_BANNER = messagesGetDiffExtendedFiltersDto3;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto4 = new MessagesGetDiffExtendedFiltersDto("COUNTERS", 3, "counters");
        COUNTERS = messagesGetDiffExtendedFiltersDto4;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto5 = new MessagesGetDiffExtendedFiltersDto("CREDENTIALS", 4, "credentials");
        CREDENTIALS = messagesGetDiffExtendedFiltersDto5;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto6 = new MessagesGetDiffExtendedFiltersDto("FOLDERS", 5, "folders");
        FOLDERS = messagesGetDiffExtendedFiltersDto6;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto7 = new MessagesGetDiffExtendedFiltersDto("FOLDERS_WITH_PEERS", 6, "folders_with_peers");
        FOLDERS_WITH_PEERS = messagesGetDiffExtendedFiltersDto7;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto8 = new MessagesGetDiffExtendedFiltersDto("GROUPS", 7, "groups");
        GROUPS = messagesGetDiffExtendedFiltersDto8;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto9 = new MessagesGetDiffExtendedFiltersDto("MESSAGES", 8, "messages");
        MESSAGES = messagesGetDiffExtendedFiltersDto9;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto10 = new MessagesGetDiffExtendedFiltersDto("PROFILES", 9, "profiles");
        PROFILES = messagesGetDiffExtendedFiltersDto10;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto11 = new MessagesGetDiffExtendedFiltersDto("SERVER_TIME", 10, "server_time");
        SERVER_TIME = messagesGetDiffExtendedFiltersDto11;
        MessagesGetDiffExtendedFiltersDto messagesGetDiffExtendedFiltersDto12 = new MessagesGetDiffExtendedFiltersDto("SERVER_VERSION", 11, "server_version");
        SERVER_VERSION = messagesGetDiffExtendedFiltersDto12;
        MessagesGetDiffExtendedFiltersDto[] messagesGetDiffExtendedFiltersDtoArr = {messagesGetDiffExtendedFiltersDto, messagesGetDiffExtendedFiltersDto2, messagesGetDiffExtendedFiltersDto3, messagesGetDiffExtendedFiltersDto4, messagesGetDiffExtendedFiltersDto5, messagesGetDiffExtendedFiltersDto6, messagesGetDiffExtendedFiltersDto7, messagesGetDiffExtendedFiltersDto8, messagesGetDiffExtendedFiltersDto9, messagesGetDiffExtendedFiltersDto10, messagesGetDiffExtendedFiltersDto11, messagesGetDiffExtendedFiltersDto12};
        $VALUES = messagesGetDiffExtendedFiltersDtoArr;
        $ENTRIES = new asp(messagesGetDiffExtendedFiltersDtoArr);
        CREATOR = new a();
    }

    private MessagesGetDiffExtendedFiltersDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesGetDiffExtendedFiltersDto valueOf(String str) {
        return (MessagesGetDiffExtendedFiltersDto) Enum.valueOf(MessagesGetDiffExtendedFiltersDto.class, str);
    }

    public static MessagesGetDiffExtendedFiltersDto[] values() {
        return (MessagesGetDiffExtendedFiltersDto[]) $VALUES.clone();
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
