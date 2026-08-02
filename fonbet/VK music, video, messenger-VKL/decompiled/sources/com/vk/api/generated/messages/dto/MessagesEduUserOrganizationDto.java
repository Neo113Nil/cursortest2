package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesEduUserOrganizationDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduUserOrganizationDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduUserOrganizationDto> CREATOR = new a();

    @pmi0("organization_name")
    private final String organizationName;

    @pmi0("role")
    private final MessagesEduUserOrganizationRoleDto role;

    /* compiled from: MessagesEduUserOrganizationDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduUserOrganizationDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserOrganizationDto createFromParcel(Parcel parcel) {
            return new MessagesEduUserOrganizationDto(MessagesEduUserOrganizationRoleDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserOrganizationDto[] newArray(int i) {
            return new MessagesEduUserOrganizationDto[i];
        }
    }

    public MessagesEduUserOrganizationDto(MessagesEduUserOrganizationRoleDto messagesEduUserOrganizationRoleDto, String str) {
        this.role = messagesEduUserOrganizationRoleDto;
        this.organizationName = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduUserOrganizationDto)) {
            return false;
        }
        MessagesEduUserOrganizationDto messagesEduUserOrganizationDto = (MessagesEduUserOrganizationDto) obj;
        return epx.f(this.role, messagesEduUserOrganizationDto.role) && epx.f(this.organizationName, messagesEduUserOrganizationDto.organizationName);
    }

    public final int hashCode() {
        return this.organizationName.hashCode() + (this.role.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduUserOrganizationDto(role=");
        sb.append(this.role);
        sb.append(", organizationName=");
        return ho8.a(sb, this.organizationName, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.role.writeToParcel(parcel, i);
        parcel.writeString(this.organizationName);
    }
}
