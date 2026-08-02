package com.vk.api.generated.classifieds.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClassifiedsYoulaItemActionPropertiesDto.kt */
/* loaded from: classes14.dex */
public final class ClassifiedsYoulaItemActionPropertiesDto implements Parcelable {
    public static final Parcelable.Creator<ClassifiedsYoulaItemActionPropertiesDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("is_incomplete")
    private final Boolean isIncomplete;

    @pmi0("message_chat_id")
    private final Integer messageChatId;

    @pmi0("message_enabled")
    private final boolean messageEnabled;

    @pmi0("message_wallitem_id")
    private final String messageWallitemId;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("phone_enabled")
    private final boolean phoneEnabled;

    /* compiled from: ClassifiedsYoulaItemActionPropertiesDto.kt */
    public static final class a implements Parcelable.Creator<ClassifiedsYoulaItemActionPropertiesDto> {
        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemActionPropertiesDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            UserId userId = (UserId) parcel.readParcelable(ClassifiedsYoulaItemActionPropertiesDto.class.getClassLoader());
            String readString = parcel.readString();
            boolean z3 = false;
            boolean z4 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
                z2 = true;
            } else {
                z = false;
                z2 = true;
            }
            String readString2 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = z2;
                }
                bool = Boolean.valueOf(z);
            }
            return new ClassifiedsYoulaItemActionPropertiesDto(userId, readString, z4, z3, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ClassifiedsYoulaItemActionPropertiesDto[] newArray(int i) {
            return new ClassifiedsYoulaItemActionPropertiesDto[i];
        }
    }

    public ClassifiedsYoulaItemActionPropertiesDto(UserId userId, String str, boolean z, boolean z2, String str2, Integer num, Boolean bool) {
        this.ownerId = userId;
        this.hash = str;
        this.phoneEnabled = z;
        this.messageEnabled = z2;
        this.messageWallitemId = str2;
        this.messageChatId = num;
        this.isIncomplete = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClassifiedsYoulaItemActionPropertiesDto)) {
            return false;
        }
        ClassifiedsYoulaItemActionPropertiesDto classifiedsYoulaItemActionPropertiesDto = (ClassifiedsYoulaItemActionPropertiesDto) obj;
        return epx.f(this.ownerId, classifiedsYoulaItemActionPropertiesDto.ownerId) && epx.f(this.hash, classifiedsYoulaItemActionPropertiesDto.hash) && this.phoneEnabled == classifiedsYoulaItemActionPropertiesDto.phoneEnabled && this.messageEnabled == classifiedsYoulaItemActionPropertiesDto.messageEnabled && epx.f(this.messageWallitemId, classifiedsYoulaItemActionPropertiesDto.messageWallitemId) && epx.f(this.messageChatId, classifiedsYoulaItemActionPropertiesDto.messageChatId) && epx.f(this.isIncomplete, classifiedsYoulaItemActionPropertiesDto.isIncomplete);
    }

    public final int hashCode() {
        int b = qoy.b(qoy.b(urd0.a(Long.hashCode(this.ownerId.b) * 31, 31, this.hash), 31, this.phoneEnabled), 31, this.messageEnabled);
        String str = this.messageWallitemId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.messageChatId;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isIncomplete;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassifiedsYoulaItemActionPropertiesDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", hash=");
        sb.append(this.hash);
        sb.append(", phoneEnabled=");
        sb.append(this.phoneEnabled);
        sb.append(", messageEnabled=");
        sb.append(this.messageEnabled);
        sb.append(", messageWallitemId=");
        sb.append(this.messageWallitemId);
        sb.append(", messageChatId=");
        sb.append(this.messageChatId);
        sb.append(", isIncomplete=");
        return tn.a(sb, this.isIncomplete, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.hash);
        parcel.writeInt(this.phoneEnabled ? 1 : 0);
        parcel.writeInt(this.messageEnabled ? 1 : 0);
        parcel.writeString(this.messageWallitemId);
        Integer num = this.messageChatId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isIncomplete;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ClassifiedsYoulaItemActionPropertiesDto(UserId userId, String str, boolean z, boolean z2, String str2, Integer num, Boolean bool, int i, zcl zclVar) {
        this(userId, str, z, z2, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : bool);
    }
}
