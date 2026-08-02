package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesSublistInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesSublistInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesSublistInfoDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("filter")
    private final MessagesSublistFilterDto filter;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final String type;

    /* compiled from: MessagesSublistInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesSublistInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesSublistInfoDto createFromParcel(Parcel parcel) {
            return new MessagesSublistInfoDto(parcel.readString(), MessagesSublistFilterDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesSublistInfoDto[] newArray(int i) {
            return new MessagesSublistInfoDto[i];
        }
    }

    public MessagesSublistInfoDto(String str, MessagesSublistFilterDto messagesSublistFilterDto, String str2, String str3) {
        this.type = str;
        this.filter = messagesSublistFilterDto;
        this.name = str2;
        this.description = str3;
    }

    public final MessagesSublistFilterDto d() {
        return this.filter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesSublistInfoDto)) {
            return false;
        }
        MessagesSublistInfoDto messagesSublistInfoDto = (MessagesSublistInfoDto) obj;
        return epx.f(this.type, messagesSublistInfoDto.type) && epx.f(this.filter, messagesSublistInfoDto.filter) && epx.f(this.name, messagesSublistInfoDto.name) && epx.f(this.description, messagesSublistInfoDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = urd0.a((this.filter.hashCode() + (this.type.hashCode() * 31)) * 31, 31, this.name);
        String str = this.description;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesSublistInfoDto(type=");
        sb.append(this.type);
        sb.append(", filter=");
        sb.append(this.filter);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        this.filter.writeToParcel(parcel, i);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
    }

    public /* synthetic */ MessagesSublistInfoDto(String str, MessagesSublistFilterDto messagesSublistFilterDto, String str2, String str3, int i, zcl zclVar) {
        this(str, messagesSublistFilterDto, str2, (i & 8) != 0 ? null : str3);
    }
}
