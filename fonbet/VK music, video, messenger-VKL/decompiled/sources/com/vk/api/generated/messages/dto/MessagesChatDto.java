package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesChatDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatDto> CREATOR = new a();

    @pmi0("admin_id")
    private final UserId adminId;

    @pmi0("id")
    private final int id;

    @pmi0("is_default_photo")
    private final Boolean isDefaultPhoto;

    @pmi0("is_group_channel")
    private final Boolean isGroupChannel;

    @pmi0("kicked")
    private final BaseBoolIntDto kicked;

    @pmi0(TtmlNode.LEFT)
    private final BaseBoolIntDto left;

    @pmi0("members_count")
    private final int membersCount;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_50")
    private final String photo50;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("push_settings")
    private final MessagesChatPushSettingsDto pushSettings;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("users")
    private final List<UserId> users;

    /* compiled from: MessagesChatDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(MessagesChatDto.class.getClassLoader());
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = bo.b(MessagesChatDto.class, parcel, arrayList, i, 1);
            }
            int readInt3 = parcel.readInt();
            BaseBoolIntDto baseBoolIntDto = (BaseBoolIntDto) parcel.readParcelable(MessagesChatDto.class.getClassLoader());
            BaseBoolIntDto baseBoolIntDto2 = (BaseBoolIntDto) parcel.readParcelable(MessagesChatDto.class.getClassLoader());
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Boolean bool = null;
            MessagesChatPushSettingsDto createFromParcel = parcel.readInt() == 0 ? null : MessagesChatPushSettingsDto.CREATOR.createFromParcel(parcel);
            String readString6 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesChatDto(userId, readInt, readString, arrayList, readInt3, baseBoolIntDto, baseBoolIntDto2, readString2, readString3, readString4, readString5, createFromParcel, readString6, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatDto[] newArray(int i) {
            return new MessagesChatDto[i];
        }
    }

    public MessagesChatDto(UserId userId, int i, String str, List<UserId> list, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str2, String str3, String str4, String str5, MessagesChatPushSettingsDto messagesChatPushSettingsDto, String str6, Boolean bool, Boolean bool2) {
        this.adminId = userId;
        this.id = i;
        this.type = str;
        this.users = list;
        this.membersCount = i2;
        this.kicked = baseBoolIntDto;
        this.left = baseBoolIntDto2;
        this.photo100 = str2;
        this.photo200 = str3;
        this.photo50 = str4;
        this.photoBase = str5;
        this.pushSettings = messagesChatPushSettingsDto;
        this.title = str6;
        this.isDefaultPhoto = bool;
        this.isGroupChannel = bool2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatDto)) {
            return false;
        }
        MessagesChatDto messagesChatDto = (MessagesChatDto) obj;
        return epx.f(this.adminId, messagesChatDto.adminId) && this.id == messagesChatDto.id && epx.f(this.type, messagesChatDto.type) && epx.f(this.users, messagesChatDto.users) && this.membersCount == messagesChatDto.membersCount && this.kicked == messagesChatDto.kicked && this.left == messagesChatDto.left && epx.f(this.photo100, messagesChatDto.photo100) && epx.f(this.photo200, messagesChatDto.photo200) && epx.f(this.photo50, messagesChatDto.photo50) && epx.f(this.photoBase, messagesChatDto.photoBase) && epx.f(this.pushSettings, messagesChatDto.pushSettings) && epx.f(this.title, messagesChatDto.title) && epx.f(this.isDefaultPhoto, messagesChatDto.isDefaultPhoto) && epx.f(this.isGroupChannel, messagesChatDto.isGroupChannel);
    }

    public final int hashCode() {
        int a2 = shy.a(this.membersCount, fw3.a(urd0.a(shy.a(this.id, Long.hashCode(this.adminId.b) * 31, 31), 31, this.type), 31, this.users), 31);
        BaseBoolIntDto baseBoolIntDto = this.kicked;
        int hashCode = (a2 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.left;
        int hashCode2 = (hashCode + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        String str = this.photo100;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.photo200;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.photo50;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photoBase;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        MessagesChatPushSettingsDto messagesChatPushSettingsDto = this.pushSettings;
        int hashCode7 = (hashCode6 + (messagesChatPushSettingsDto == null ? 0 : messagesChatPushSettingsDto.hashCode())) * 31;
        String str5 = this.title;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isDefaultPhoto;
        int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isGroupChannel;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesChatDto(adminId=");
        sb.append(this.adminId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", membersCount=");
        sb.append(this.membersCount);
        sb.append(", kicked=");
        sb.append(this.kicked);
        sb.append(", left=");
        sb.append(this.left);
        sb.append(", photo100=");
        sb.append(this.photo100);
        sb.append(", photo200=");
        sb.append(this.photo200);
        sb.append(", photo50=");
        sb.append(this.photo50);
        sb.append(", photoBase=");
        sb.append(this.photoBase);
        sb.append(", pushSettings=");
        sb.append(this.pushSettings);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", isDefaultPhoto=");
        sb.append(this.isDefaultPhoto);
        sb.append(", isGroupChannel=");
        return tn.a(sb, this.isGroupChannel, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.adminId, i);
        parcel.writeInt(this.id);
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.users);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeInt(this.membersCount);
        parcel.writeParcelable(this.kicked, i);
        parcel.writeParcelable(this.left, i);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo50);
        parcel.writeString(this.photoBase);
        MessagesChatPushSettingsDto messagesChatPushSettingsDto = this.pushSettings;
        if (messagesChatPushSettingsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatPushSettingsDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        Boolean bool = this.isDefaultPhoto;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isGroupChannel;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ MessagesChatDto(UserId userId, int i, String str, List list, int i2, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, String str2, String str3, String str4, String str5, MessagesChatPushSettingsDto messagesChatPushSettingsDto, String str6, Boolean bool, Boolean bool2, int i3, zcl zclVar) {
        this(userId, i, str, list, i2, (i3 & 32) != 0 ? null : baseBoolIntDto, (i3 & 64) != 0 ? null : baseBoolIntDto2, (i3 & 128) != 0 ? null : str2, (i3 & 256) != 0 ? null : str3, (i3 & 512) != 0 ? null : str4, (i3 & 1024) != 0 ? null : str5, (i3 & 2048) != 0 ? null : messagesChatPushSettingsDto, (i3 & 4096) != 0 ? null : str6, (i3 & 8192) != 0 ? null : bool, (i3 & 16384) != 0 ? null : bool2);
    }
}
