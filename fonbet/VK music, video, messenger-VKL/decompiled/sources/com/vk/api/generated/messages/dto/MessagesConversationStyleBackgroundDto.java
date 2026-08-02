package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationStyleBackgroundDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleBackgroundDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleBackgroundDto> CREATOR = new a();

    @pmi0("dark")
    private final MessagesConversationStyleBackgroundShadeDto dark;

    @pmi0("id")
    private final String id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("light")
    private final MessagesConversationStyleBackgroundShadeDto light;

    @pmi0("sort")
    private final int sort;

    @pmi0("update_time")
    private final int updateTime;

    /* compiled from: MessagesConversationStyleBackgroundDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto = (MessagesConversationStyleBackgroundShadeDto) parcel.readParcelable(MessagesConversationStyleBackgroundDto.class.getClassLoader());
            MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto2 = (MessagesConversationStyleBackgroundShadeDto) parcel.readParcelable(MessagesConversationStyleBackgroundDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationStyleBackgroundDto(readString, readInt, readInt2, messagesConversationStyleBackgroundShadeDto, messagesConversationStyleBackgroundShadeDto2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundDto[] newArray(int i) {
            return new MessagesConversationStyleBackgroundDto[i];
        }
    }

    public MessagesConversationStyleBackgroundDto(String str, int i, int i2, MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto, MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto2, Boolean bool) {
        this.id = str;
        this.updateTime = i;
        this.sort = i2;
        this.light = messagesConversationStyleBackgroundShadeDto;
        this.dark = messagesConversationStyleBackgroundShadeDto2;
        this.isHidden = bool;
    }

    public final MessagesConversationStyleBackgroundShadeDto d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesConversationStyleBackgroundShadeDto e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleBackgroundDto)) {
            return false;
        }
        MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto = (MessagesConversationStyleBackgroundDto) obj;
        return epx.f(this.id, messagesConversationStyleBackgroundDto.id) && this.updateTime == messagesConversationStyleBackgroundDto.updateTime && this.sort == messagesConversationStyleBackgroundDto.sort && epx.f(this.light, messagesConversationStyleBackgroundDto.light) && epx.f(this.dark, messagesConversationStyleBackgroundDto.dark) && epx.f(this.isHidden, messagesConversationStyleBackgroundDto.isHidden);
    }

    public final int f() {
        return this.sort;
    }

    public final int g() {
        return this.updateTime;
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = (this.dark.hashCode() + ((this.light.hashCode() + shy.a(this.sort, shy.a(this.updateTime, this.id.hashCode() * 31, 31), 31)) * 31)) * 31;
        Boolean bool = this.isHidden;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final Boolean i() {
        return this.isHidden;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleBackgroundDto(id=");
        sb.append(this.id);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", sort=");
        sb.append(this.sort);
        sb.append(", light=");
        sb.append(this.light);
        sb.append(", dark=");
        sb.append(this.dark);
        sb.append(", isHidden=");
        return tn.a(sb, this.isHidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.updateTime);
        parcel.writeInt(this.sort);
        parcel.writeParcelable(this.light, i);
        parcel.writeParcelable(this.dark, i);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesConversationStyleBackgroundDto(String str, int i, int i2, MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto, MessagesConversationStyleBackgroundShadeDto messagesConversationStyleBackgroundShadeDto2, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, messagesConversationStyleBackgroundShadeDto, messagesConversationStyleBackgroundShadeDto2, (i3 & 32) != 0 ? null : bool);
    }
}
