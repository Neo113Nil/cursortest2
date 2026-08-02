package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationAppearanceMetaDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationAppearanceMetaDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationAppearanceMetaDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("sort")
    private final int sort;

    @pmi0("update_time")
    private final int updateTime;

    /* compiled from: MessagesConversationAppearanceMetaDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationAppearanceMetaDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationAppearanceMetaDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationAppearanceMetaDto(readString, readInt, readInt2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationAppearanceMetaDto[] newArray(int i) {
            return new MessagesConversationAppearanceMetaDto[i];
        }
    }

    public MessagesConversationAppearanceMetaDto(String str, int i, int i2, Boolean bool) {
        this.id = str;
        this.updateTime = i;
        this.sort = i2;
        this.isHidden = bool;
    }

    public final int d() {
        return this.updateTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationAppearanceMetaDto)) {
            return false;
        }
        MessagesConversationAppearanceMetaDto messagesConversationAppearanceMetaDto = (MessagesConversationAppearanceMetaDto) obj;
        return epx.f(this.id, messagesConversationAppearanceMetaDto.id) && this.updateTime == messagesConversationAppearanceMetaDto.updateTime && this.sort == messagesConversationAppearanceMetaDto.sort && epx.f(this.isHidden, messagesConversationAppearanceMetaDto.isHidden);
    }

    public final String getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.sort, shy.a(this.updateTime, this.id.hashCode() * 31, 31), 31);
        Boolean bool = this.isHidden;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationAppearanceMetaDto(id=");
        sb.append(this.id);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", sort=");
        sb.append(this.sort);
        sb.append(", isHidden=");
        return tn.a(sb, this.isHidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.updateTime);
        parcel.writeInt(this.sort);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesConversationAppearanceMetaDto(String str, int i, int i2, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : bool);
    }
}
