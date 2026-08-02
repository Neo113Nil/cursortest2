package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesInputContactDto.kt */
/* loaded from: classes15.dex */
public final class MessagesInputContactDto implements Parcelable {
    public static final Parcelable.Creator<MessagesInputContactDto> CREATOR = new a();

    @pmi0("deleted")
    private final Boolean deleted;

    @pmi0("device_local_id")
    private final String deviceLocalId;

    @pmi0("emails")
    private final List<String> emails;

    @pmi0("is_favorite")
    private final Boolean isFavorite;

    @pmi0("name")
    private final String name;

    @pmi0("phones")
    private final List<String> phones;

    /* compiled from: MessagesInputContactDto.kt */
    public static final class a implements Parcelable.Creator<MessagesInputContactDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesInputContactDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesInputContactDto(readString, readString2, valueOf, bool, parcel.createStringArrayList(), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesInputContactDto[] newArray(int i) {
            return new MessagesInputContactDto[i];
        }
    }

    public MessagesInputContactDto(String str, String str2, Boolean bool, Boolean bool2, List<String> list, List<String> list2) {
        this.name = str;
        this.deviceLocalId = str2;
        this.deleted = bool;
        this.isFavorite = bool2;
        this.phones = list;
        this.emails = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesInputContactDto)) {
            return false;
        }
        MessagesInputContactDto messagesInputContactDto = (MessagesInputContactDto) obj;
        return epx.f(this.name, messagesInputContactDto.name) && epx.f(this.deviceLocalId, messagesInputContactDto.deviceLocalId) && epx.f(this.deleted, messagesInputContactDto.deleted) && epx.f(this.isFavorite, messagesInputContactDto.isFavorite) && epx.f(this.phones, messagesInputContactDto.phones) && epx.f(this.emails, messagesInputContactDto.emails);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.name.hashCode() * 31, 31, this.deviceLocalId);
        Boolean bool = this.deleted;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFavorite;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        List<String> list = this.phones;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.emails;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesInputContactDto(name=");
        sb.append(this.name);
        sb.append(", deviceLocalId=");
        sb.append(this.deviceLocalId);
        sb.append(", deleted=");
        sb.append(this.deleted);
        sb.append(", isFavorite=");
        sb.append(this.isFavorite);
        sb.append(", phones=");
        sb.append(this.phones);
        sb.append(", emails=");
        return ms9.a(')', sb, this.emails);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.deviceLocalId);
        Boolean bool = this.deleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isFavorite;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        parcel.writeStringList(this.phones);
        parcel.writeStringList(this.emails);
    }

    public /* synthetic */ MessagesInputContactDto(String str, String str2, Boolean bool, Boolean bool2, List list, List list2, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2);
    }
}
