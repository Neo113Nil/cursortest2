package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.calls.dto.CallsCustomNameForCallDto;
import com.vk.api.generated.users.dto.UsersCanNotCallReasonDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.qoy;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesContactDto.kt */
/* loaded from: classes15.dex */
public final class MessagesContactDto implements Parcelable {
    public static final Parcelable.Creator<MessagesContactDto> CREATOR = new a();

    @pmi0("animated_avatar")
    private final BaseImageDto animatedAvatar;

    @pmi0("calls_id")
    private final String callsId;

    @pmi0("can_call")
    private final Boolean canCall;

    @pmi0("can_not_call_reason")
    private final UsersCanNotCallReasonDto canNotCallReason;

    @pmi0("can_write")
    private final boolean canWrite;

    @pmi0("custom_names_for_calls")
    private final List<CallsCustomNameForCallDto> customNamesForCalls;

    @pmi0("device_local_id")
    private final String deviceLocalId;

    @pmi0("id")
    private final int id;

    @pmi0("last_seen_status")
    private final String lastSeenStatus;

    @pmi0("local_name")
    private final String localName;

    @pmi0("local_phone")
    private final String localPhone;

    @pmi0("name")
    private final String name;

    @pmi0("phone")
    private final String phone;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: MessagesContactDto.kt */
    public static final class a implements Parcelable.Creator<MessagesContactDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesContactDto createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            ArrayList arrayList;
            int i;
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            UserId userId = (UserId) parcel.readParcelable(MessagesContactDto.class.getClassLoader());
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (true) {
                    i = readInt;
                    if (i2 == readInt2) {
                        break;
                    }
                    i2 = en.a(CallsCustomNameForCallDto.CREATOR, parcel, arrayList, i2, 1);
                    readInt = i;
                    readString = readString;
                }
            } else {
                arrayList = null;
                i = readInt;
            }
            String str = readString;
            BaseImageDto createFromParcel = parcel.readInt() == 0 ? null : BaseImageDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesContactDto(i, str, readString2, z, readString3, readString4, readString5, userId, readString6, readString7, readString8, readString9, arrayList, createFromParcel, valueOf, parcel.readInt() != 0 ? UsersCanNotCallReasonDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesContactDto[] newArray(int i) {
            return new MessagesContactDto[i];
        }
    }

    public MessagesContactDto(int i, String str, String str2, boolean z, String str3, String str4, String str5, UserId userId, String str6, String str7, String str8, String str9, List<CallsCustomNameForCallDto> list, BaseImageDto baseImageDto, Boolean bool, UsersCanNotCallReasonDto usersCanNotCallReasonDto) {
        this.id = i;
        this.name = str;
        this.phone = str2;
        this.canWrite = z;
        this.deviceLocalId = str3;
        this.localName = str4;
        this.localPhone = str5;
        this.userId = userId;
        this.lastSeenStatus = str6;
        this.photo50 = str7;
        this.photoBase = str8;
        this.callsId = str9;
        this.customNamesForCalls = list;
        this.animatedAvatar = baseImageDto;
        this.canCall = bool;
        this.canNotCallReason = usersCanNotCallReasonDto;
    }

    public final String d() {
        return this.callsId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.canCall;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesContactDto)) {
            return false;
        }
        MessagesContactDto messagesContactDto = (MessagesContactDto) obj;
        return this.id == messagesContactDto.id && epx.f(this.name, messagesContactDto.name) && epx.f(this.phone, messagesContactDto.phone) && this.canWrite == messagesContactDto.canWrite && epx.f(this.deviceLocalId, messagesContactDto.deviceLocalId) && epx.f(this.localName, messagesContactDto.localName) && epx.f(this.localPhone, messagesContactDto.localPhone) && epx.f(this.userId, messagesContactDto.userId) && epx.f(this.lastSeenStatus, messagesContactDto.lastSeenStatus) && epx.f(this.photo50, messagesContactDto.photo50) && epx.f(this.photoBase, messagesContactDto.photoBase) && epx.f(this.callsId, messagesContactDto.callsId) && epx.f(this.customNamesForCalls, messagesContactDto.customNamesForCalls) && epx.f(this.animatedAvatar, messagesContactDto.animatedAvatar) && epx.f(this.canCall, messagesContactDto.canCall) && this.canNotCallReason == messagesContactDto.canNotCallReason;
    }

    public final String f() {
        return this.lastSeenStatus;
    }

    public final String g() {
        return this.name;
    }

    public final int getId() {
        return this.id;
    }

    public final UserId getUserId() {
        return this.userId;
    }

    public final int hashCode() {
        int b = qoy.b(urd0.a(urd0.a(Integer.hashCode(this.id) * 31, 31, this.name), 31, this.phone), 31, this.canWrite);
        String str = this.deviceLocalId;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.localName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.localPhone;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        UserId userId = this.userId;
        int hashCode4 = (hashCode3 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str4 = this.lastSeenStatus;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo50;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photoBase;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.callsId;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List<CallsCustomNameForCallDto> list = this.customNamesForCalls;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        BaseImageDto baseImageDto = this.animatedAvatar;
        int hashCode10 = (hashCode9 + (baseImageDto == null ? 0 : baseImageDto.hashCode())) * 31;
        Boolean bool = this.canCall;
        int hashCode11 = (hashCode10 + (bool == null ? 0 : bool.hashCode())) * 31;
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        return hashCode11 + (usersCanNotCallReasonDto != null ? usersCanNotCallReasonDto.hashCode() : 0);
    }

    public final String i() {
        return this.photoBase;
    }

    public final String toString() {
        return "MessagesContactDto(id=" + this.id + ", name=" + this.name + ", phone=" + this.phone + ", canWrite=" + this.canWrite + ", deviceLocalId=" + this.deviceLocalId + ", localName=" + this.localName + ", localPhone=" + this.localPhone + ", userId=" + this.userId + ", lastSeenStatus=" + this.lastSeenStatus + ", photo50=" + this.photo50 + ", photoBase=" + this.photoBase + ", callsId=" + this.callsId + ", customNamesForCalls=" + this.customNamesForCalls + ", animatedAvatar=" + this.animatedAvatar + ", canCall=" + this.canCall + ", canNotCallReason=" + this.canNotCallReason + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.phone);
        parcel.writeInt(this.canWrite ? 1 : 0);
        parcel.writeString(this.deviceLocalId);
        parcel.writeString(this.localName);
        parcel.writeString(this.localPhone);
        parcel.writeParcelable(this.userId, i);
        parcel.writeString(this.lastSeenStatus);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photoBase);
        parcel.writeString(this.callsId);
        List<CallsCustomNameForCallDto> list = this.customNamesForCalls;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((CallsCustomNameForCallDto) f.next()).writeToParcel(parcel, i);
            }
        }
        BaseImageDto baseImageDto = this.animatedAvatar;
        if (baseImageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseImageDto.writeToParcel(parcel, i);
        }
        Boolean bool = this.canCall;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        UsersCanNotCallReasonDto usersCanNotCallReasonDto = this.canNotCallReason;
        if (usersCanNotCallReasonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            usersCanNotCallReasonDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesContactDto(int i, String str, String str2, boolean z, String str3, String str4, String str5, UserId userId, String str6, String str7, String str8, String str9, List list, BaseImageDto baseImageDto, Boolean bool, UsersCanNotCallReasonDto usersCanNotCallReasonDto, int i2, zcl zclVar) {
        this(i, str, str2, z, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : str5, (i2 & 128) != 0 ? null : userId, (i2 & 256) != 0 ? null : str6, (i2 & 512) != 0 ? null : str7, (i2 & 1024) != 0 ? null : str8, (i2 & 2048) != 0 ? null : str9, (i2 & 4096) != 0 ? null : list, (i2 & 8192) != 0 ? null : baseImageDto, (i2 & 16384) != 0 ? null : bool, (i2 & 32768) != 0 ? null : usersCanNotCallReasonDto);
    }
}
