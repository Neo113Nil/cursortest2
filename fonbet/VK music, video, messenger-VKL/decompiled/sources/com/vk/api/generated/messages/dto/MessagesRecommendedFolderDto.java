package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesRecommendedFolderDto.kt */
/* loaded from: classes15.dex */
public final class MessagesRecommendedFolderDto implements Parcelable {
    public static final Parcelable.Creator<MessagesRecommendedFolderDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("is_hidden")
    private final Boolean isHidden;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final MessagesRecommendedFolderTypeDto type;

    /* compiled from: MessagesRecommendedFolderDto.kt */
    public static final class a implements Parcelable.Creator<MessagesRecommendedFolderDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesRecommendedFolderDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            MessagesRecommendedFolderTypeDto createFromParcel = MessagesRecommendedFolderTypeDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesRecommendedFolderDto(createFromParcel, readInt, readString, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesRecommendedFolderDto[] newArray(int i) {
            return new MessagesRecommendedFolderDto[i];
        }
    }

    public MessagesRecommendedFolderDto(MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto, int i, String str, String str2, Boolean bool) {
        this.type = messagesRecommendedFolderTypeDto;
        this.id = i;
        this.name = str;
        this.description = str2;
        this.isHidden = bool;
    }

    public final String d() {
        return this.name;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesRecommendedFolderTypeDto e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesRecommendedFolderDto)) {
            return false;
        }
        MessagesRecommendedFolderDto messagesRecommendedFolderDto = (MessagesRecommendedFolderDto) obj;
        return this.type == messagesRecommendedFolderDto.type && this.id == messagesRecommendedFolderDto.id && epx.f(this.name, messagesRecommendedFolderDto.name) && epx.f(this.description, messagesRecommendedFolderDto.description) && epx.f(this.isHidden, messagesRecommendedFolderDto.isHidden);
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(shy.a(this.id, this.type.hashCode() * 31, 31), 31, this.name), 31, this.description);
        Boolean bool = this.isHidden;
        return a2 + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesRecommendedFolderDto(type=");
        sb.append(this.type);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", isHidden=");
        return tn.a(sb, this.isHidden, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        Boolean bool = this.isHidden;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ MessagesRecommendedFolderDto(MessagesRecommendedFolderTypeDto messagesRecommendedFolderTypeDto, int i, String str, String str2, Boolean bool, int i2, zcl zclVar) {
        this(messagesRecommendedFolderTypeDto, i, str, str2, (i2 & 16) != 0 ? null : bool);
    }
}
