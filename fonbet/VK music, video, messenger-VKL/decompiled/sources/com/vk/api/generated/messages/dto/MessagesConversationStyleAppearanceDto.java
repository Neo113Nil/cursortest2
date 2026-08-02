package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationStyleAppearanceDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleAppearanceDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleAppearanceDto> CREATOR = new a();

    @pmi0("dark")
    private final MessagesConversationStyleAppearanceShadeDto dark;

    @pmi0("id")
    private final String id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("light")
    private final MessagesConversationStyleAppearanceShadeDto light;

    @pmi0("sort")
    private final int sort;

    @pmi0("update_time")
    private final int updateTime;

    /* compiled from: MessagesConversationStyleAppearanceDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleAppearanceDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleAppearanceDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            Parcelable.Creator<MessagesConversationStyleAppearanceShadeDto> creator = MessagesConversationStyleAppearanceShadeDto.CREATOR;
            MessagesConversationStyleAppearanceShadeDto createFromParcel = creator.createFromParcel(parcel);
            MessagesConversationStyleAppearanceShadeDto createFromParcel2 = creator.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationStyleAppearanceDto(readString, readInt, readInt2, createFromParcel, createFromParcel2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleAppearanceDto[] newArray(int i) {
            return new MessagesConversationStyleAppearanceDto[i];
        }
    }

    public MessagesConversationStyleAppearanceDto(String str, int i, int i2, MessagesConversationStyleAppearanceShadeDto messagesConversationStyleAppearanceShadeDto, MessagesConversationStyleAppearanceShadeDto messagesConversationStyleAppearanceShadeDto2, Boolean bool) {
        this.id = str;
        this.updateTime = i;
        this.sort = i2;
        this.light = messagesConversationStyleAppearanceShadeDto;
        this.dark = messagesConversationStyleAppearanceShadeDto2;
        this.isHidden = bool;
    }

    public final MessagesConversationStyleAppearanceShadeDto d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesConversationStyleAppearanceShadeDto e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleAppearanceDto)) {
            return false;
        }
        MessagesConversationStyleAppearanceDto messagesConversationStyleAppearanceDto = (MessagesConversationStyleAppearanceDto) obj;
        return epx.f(this.id, messagesConversationStyleAppearanceDto.id) && this.updateTime == messagesConversationStyleAppearanceDto.updateTime && this.sort == messagesConversationStyleAppearanceDto.sort && epx.f(this.light, messagesConversationStyleAppearanceDto.light) && epx.f(this.dark, messagesConversationStyleAppearanceDto.dark) && epx.f(this.isHidden, messagesConversationStyleAppearanceDto.isHidden);
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
        StringBuilder sb = new StringBuilder("MessagesConversationStyleAppearanceDto(id=");
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
        this.light.writeToParcel(parcel, i);
        this.dark.writeToParcel(parcel, i);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesConversationStyleAppearanceDto(String str, int i, int i2, MessagesConversationStyleAppearanceShadeDto messagesConversationStyleAppearanceShadeDto, MessagesConversationStyleAppearanceShadeDto messagesConversationStyleAppearanceShadeDto2, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, messagesConversationStyleAppearanceShadeDto, messagesConversationStyleAppearanceShadeDto2, (i3 & 32) != 0 ? null : bool);
    }
}
