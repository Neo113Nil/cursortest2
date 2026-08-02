package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: MessagesEduUserOrganizationRoleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduUserOrganizationRoleDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduUserOrganizationRoleDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesEduUserOrganizationRoleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduUserOrganizationRoleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserOrganizationRoleDto createFromParcel(Parcel parcel) {
            return new MessagesEduUserOrganizationRoleDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduUserOrganizationRoleDto[] newArray(int i) {
            return new MessagesEduUserOrganizationRoleDto[i];
        }
    }

    public MessagesEduUserOrganizationRoleDto(String str, String str2) {
        this.name = str;
        this.title = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduUserOrganizationRoleDto)) {
            return false;
        }
        MessagesEduUserOrganizationRoleDto messagesEduUserOrganizationRoleDto = (MessagesEduUserOrganizationRoleDto) obj;
        return epx.f(this.name, messagesEduUserOrganizationRoleDto.name) && epx.f(this.title, messagesEduUserOrganizationRoleDto.title);
    }

    public final int hashCode() {
        return this.title.hashCode() + (this.name.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduUserOrganizationRoleDto(name=");
        sb.append(this.name);
        sb.append(", title=");
        return ho8.a(sb, this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.title);
    }
}
