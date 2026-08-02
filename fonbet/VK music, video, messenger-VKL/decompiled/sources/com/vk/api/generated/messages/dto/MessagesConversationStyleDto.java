package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationStyleDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleDto> CREATOR = new a();

    @pmi0("appearance")
    private final MessagesConversationStyleAppearanceDto appearance;

    @pmi0("appearance_id")
    private final String appearanceId;

    @pmi0(L2.g)
    private final MessagesConversationStyleBackgroundDto background;

    @pmi0("background_id")
    private final String backgroundId;

    @pmi0("id")
    private final String id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("sort")
    private final int sort;

    @pmi0("update_time")
    private final int updateTime;

    /* compiled from: MessagesConversationStyleDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleDto createFromParcel(Parcel parcel) {
            MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto;
            Boolean valueOf;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString2 = parcel.readString();
            MessagesConversationStyleAppearanceDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConversationStyleAppearanceDto.CREATOR.createFromParcel(parcel);
            String readString3 = parcel.readString();
            MessagesConversationStyleBackgroundDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesConversationStyleBackgroundDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
                messagesConversationStyleBackgroundDto = createFromParcel2;
            } else {
                messagesConversationStyleBackgroundDto = createFromParcel2;
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationStyleDto(readString, readInt, readInt2, readString2, createFromParcel, readString3, messagesConversationStyleBackgroundDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleDto[] newArray(int i) {
            return new MessagesConversationStyleDto[i];
        }
    }

    public MessagesConversationStyleDto(String str, int i, int i2, String str2, MessagesConversationStyleAppearanceDto messagesConversationStyleAppearanceDto, String str3, MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto, Boolean bool) {
        this.id = str;
        this.updateTime = i;
        this.sort = i2;
        this.appearanceId = str2;
        this.appearance = messagesConversationStyleAppearanceDto;
        this.backgroundId = str3;
        this.background = messagesConversationStyleBackgroundDto;
        this.isHidden = bool;
    }

    public final String d() {
        return this.appearanceId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.backgroundId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleDto)) {
            return false;
        }
        MessagesConversationStyleDto messagesConversationStyleDto = (MessagesConversationStyleDto) obj;
        return epx.f(this.id, messagesConversationStyleDto.id) && this.updateTime == messagesConversationStyleDto.updateTime && this.sort == messagesConversationStyleDto.sort && epx.f(this.appearanceId, messagesConversationStyleDto.appearanceId) && epx.f(this.appearance, messagesConversationStyleDto.appearance) && epx.f(this.backgroundId, messagesConversationStyleDto.backgroundId) && epx.f(this.background, messagesConversationStyleDto.background) && epx.f(this.isHidden, messagesConversationStyleDto.isHidden);
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
        int a2 = shy.a(this.sort, shy.a(this.updateTime, this.id.hashCode() * 31, 31), 31);
        String str = this.appearanceId;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        MessagesConversationStyleAppearanceDto messagesConversationStyleAppearanceDto = this.appearance;
        int hashCode2 = (hashCode + (messagesConversationStyleAppearanceDto == null ? 0 : messagesConversationStyleAppearanceDto.hashCode())) * 31;
        String str2 = this.backgroundId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto = this.background;
        int hashCode4 = (hashCode3 + (messagesConversationStyleBackgroundDto == null ? 0 : messagesConversationStyleBackgroundDto.hashCode())) * 31;
        Boolean bool = this.isHidden;
        return hashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean i() {
        return this.isHidden;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationStyleDto(id=");
        sb.append(this.id);
        sb.append(", updateTime=");
        sb.append(this.updateTime);
        sb.append(", sort=");
        sb.append(this.sort);
        sb.append(", appearanceId=");
        sb.append(this.appearanceId);
        sb.append(", appearance=");
        sb.append(this.appearance);
        sb.append(", backgroundId=");
        sb.append(this.backgroundId);
        sb.append(", background=");
        sb.append(this.background);
        sb.append(", isHidden=");
        return tn.a(sb, this.isHidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeInt(this.updateTime);
        parcel.writeInt(this.sort);
        parcel.writeString(this.appearanceId);
        MessagesConversationStyleAppearanceDto messagesConversationStyleAppearanceDto = this.appearance;
        if (messagesConversationStyleAppearanceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationStyleAppearanceDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.backgroundId);
        MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto = this.background;
        if (messagesConversationStyleBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationStyleBackgroundDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesConversationStyleDto(String str, int i, int i2, String str2, MessagesConversationStyleAppearanceDto messagesConversationStyleAppearanceDto, String str3, MessagesConversationStyleBackgroundDto messagesConversationStyleBackgroundDto, Boolean bool, int i3, zcl zclVar) {
        this(str, i, i2, (i3 & 8) != 0 ? null : str2, (i3 & 16) != 0 ? null : messagesConversationStyleAppearanceDto, (i3 & 32) != 0 ? null : str3, (i3 & 64) != 0 ? null : messagesConversationStyleBackgroundDto, (i3 & 128) != 0 ? null : bool);
    }
}
