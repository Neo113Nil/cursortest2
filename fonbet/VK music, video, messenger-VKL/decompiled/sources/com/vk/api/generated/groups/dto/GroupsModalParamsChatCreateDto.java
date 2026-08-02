package com.vk.api.generated.groups.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: GroupsModalParamsChatCreateDto.kt */
/* loaded from: classes14.dex */
public final class GroupsModalParamsChatCreateDto implements Parcelable {
    public static final Parcelable.Creator<GroupsModalParamsChatCreateDto> CREATOR = new a();

    @pmi0("chat_creation_variant")
    private final String chatCreationVariant;

    @pmi0("is_donut_levels_enabled")
    private final boolean isDonutLevelsEnabled;

    @pmi0("new_chat_hash")
    private final String newChatHash;

    /* compiled from: GroupsModalParamsChatCreateDto.kt */
    public static final class a implements Parcelable.Creator<GroupsModalParamsChatCreateDto> {
        @Override // android.os.Parcelable.Creator
        public final GroupsModalParamsChatCreateDto createFromParcel(Parcel parcel) {
            return new GroupsModalParamsChatCreateDto(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final GroupsModalParamsChatCreateDto[] newArray(int i) {
            return new GroupsModalParamsChatCreateDto[i];
        }
    }

    public GroupsModalParamsChatCreateDto(String str, String str2, boolean z) {
        this.newChatHash = str;
        this.chatCreationVariant = str2;
        this.isDonutLevelsEnabled = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupsModalParamsChatCreateDto)) {
            return false;
        }
        GroupsModalParamsChatCreateDto groupsModalParamsChatCreateDto = (GroupsModalParamsChatCreateDto) obj;
        return epx.f(this.newChatHash, groupsModalParamsChatCreateDto.newChatHash) && epx.f(this.chatCreationVariant, groupsModalParamsChatCreateDto.chatCreationVariant) && this.isDonutLevelsEnabled == groupsModalParamsChatCreateDto.isDonutLevelsEnabled;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isDonutLevelsEnabled) + urd0.a(this.newChatHash.hashCode() * 31, 31, this.chatCreationVariant);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupsModalParamsChatCreateDto(newChatHash=");
        sb.append(this.newChatHash);
        sb.append(", chatCreationVariant=");
        sb.append(this.chatCreationVariant);
        sb.append(", isDonutLevelsEnabled=");
        return q0.a(sb, this.isDonutLevelsEnabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.newChatHash);
        parcel.writeString(this.chatCreationVariant);
        parcel.writeInt(this.isDonutLevelsEnabled ? 1 : 0);
    }
}
