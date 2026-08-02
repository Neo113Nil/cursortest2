package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.pmi0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MessagesSetMemberRoleRoleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSetMemberRoleRoleDto implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ MessagesSetMemberRoleRoleDto[] $VALUES;

    @pmi0("admin")
    public static final MessagesSetMemberRoleRoleDto ADMIN;
    public static final Parcelable.Creator<MessagesSetMemberRoleRoleDto> CREATOR;

    @pmi0("member")
    public static final MessagesSetMemberRoleRoleDto MEMBER;

    @pmi0("owner")
    public static final MessagesSetMemberRoleRoleDto OWNER;
    private final String value;

    /* compiled from: MessagesSetMemberRoleRoleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSetMemberRoleRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSetMemberRoleRoleDto createFromParcel(Parcel parcel) {
            return MessagesSetMemberRoleRoleDto.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSetMemberRoleRoleDto[] newArray(int i) {
            return new MessagesSetMemberRoleRoleDto[i];
        }
    }

    static {
        MessagesSetMemberRoleRoleDto messagesSetMemberRoleRoleDto = new MessagesSetMemberRoleRoleDto("ADMIN", 0, "admin");
        ADMIN = messagesSetMemberRoleRoleDto;
        MessagesSetMemberRoleRoleDto messagesSetMemberRoleRoleDto2 = new MessagesSetMemberRoleRoleDto("MEMBER", 1, "member");
        MEMBER = messagesSetMemberRoleRoleDto2;
        MessagesSetMemberRoleRoleDto messagesSetMemberRoleRoleDto3 = new MessagesSetMemberRoleRoleDto("OWNER", 2, "owner");
        OWNER = messagesSetMemberRoleRoleDto3;
        MessagesSetMemberRoleRoleDto[] messagesSetMemberRoleRoleDtoArr = {messagesSetMemberRoleRoleDto, messagesSetMemberRoleRoleDto2, messagesSetMemberRoleRoleDto3};
        $VALUES = messagesSetMemberRoleRoleDtoArr;
        $ENTRIES = new asp(messagesSetMemberRoleRoleDtoArr);
        CREATOR = new a();
    }

    private MessagesSetMemberRoleRoleDto(String str, int i, String str2) {
        this.value = str2;
    }

    public static MessagesSetMemberRoleRoleDto valueOf(String str) {
        return (MessagesSetMemberRoleRoleDto) Enum.valueOf(MessagesSetMemberRoleRoleDto.class, str);
    }

    public static MessagesSetMemberRoleRoleDto[] values() {
        return (MessagesSetMemberRoleRoleDto[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
