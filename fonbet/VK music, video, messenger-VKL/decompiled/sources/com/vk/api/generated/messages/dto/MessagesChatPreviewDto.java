package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseLinkButtonDto;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesChatPreviewDto.kt */
/* loaded from: classes15.dex */
public final class MessagesChatPreviewDto implements Parcelable {
    public static final Parcelable.Creator<MessagesChatPreviewDto> CREATOR = new a();

    @pmi0("admin_id")
    private final UserId adminId;

    @pmi0("button")
    private final BaseLinkButtonDto button;

    @pmi0("chat_settings")
    private final MessagesChatSettingsDto chatSettings;

    @pmi0("is_don")
    private final Boolean isDon;

    @pmi0("is_group_channel")
    private final Boolean isGroupChannel;

    @pmi0("is_member")
    private final Boolean isMember;

    @pmi0("is_nft")
    private final Boolean isNft;

    @pmi0("joined")
    private final Boolean joined;

    @pmi0("local_id")
    private final Integer localId;

    @pmi0("members")
    private final List<UserId> members;

    @pmi0("members_count")
    private final Integer membersCount;

    @pmi0("photo")
    private final MessagesChatSettingsPhotoDto photo;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesChatPreviewDto.kt */
    public static final class a implements Parcelable.Creator<MessagesChatPreviewDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesChatPreviewDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Boolean valueOf2;
            Boolean valueOf3;
            Boolean valueOf4;
            UserId userId = (UserId) parcel.readParcelable(MessagesChatPreviewDto.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MessagesChatPreviewDto.class, parcel, arrayList, i, 1);
            }
            String readString = parcel.readString();
            MessagesChatSettingsDto createFromParcel = MessagesChatSettingsDto.CREATOR.createFromParcel(parcel);
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            MessagesChatSettingsPhotoDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesChatSettingsPhotoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesChatPreviewDto(userId, arrayList, readString, createFromParcel, valueOf, valueOf5, valueOf6, valueOf2, createFromParcel2, valueOf3, valueOf4, bool, (BaseLinkButtonDto) parcel.readParcelable(MessagesChatPreviewDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesChatPreviewDto[] newArray(int i) {
            return new MessagesChatPreviewDto[i];
        }
    }

    public MessagesChatPreviewDto(UserId userId, List<UserId> list, String str, MessagesChatSettingsDto messagesChatSettingsDto, Boolean bool, Integer num, Integer num2, Boolean bool2, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, Boolean bool3, Boolean bool4, Boolean bool5, BaseLinkButtonDto baseLinkButtonDto) {
        this.adminId = userId;
        this.members = list;
        this.title = str;
        this.chatSettings = messagesChatSettingsDto;
        this.joined = bool;
        this.localId = num;
        this.membersCount = num2;
        this.isMember = bool2;
        this.photo = messagesChatSettingsPhotoDto;
        this.isDon = bool3;
        this.isNft = bool4;
        this.isGroupChannel = bool5;
        this.button = baseLinkButtonDto;
    }

    public final Integer d() {
        return this.localId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesChatPreviewDto)) {
            return false;
        }
        MessagesChatPreviewDto messagesChatPreviewDto = (MessagesChatPreviewDto) obj;
        return epx.f(this.adminId, messagesChatPreviewDto.adminId) && epx.f(this.members, messagesChatPreviewDto.members) && epx.f(this.title, messagesChatPreviewDto.title) && epx.f(this.chatSettings, messagesChatPreviewDto.chatSettings) && epx.f(this.joined, messagesChatPreviewDto.joined) && epx.f(this.localId, messagesChatPreviewDto.localId) && epx.f(this.membersCount, messagesChatPreviewDto.membersCount) && epx.f(this.isMember, messagesChatPreviewDto.isMember) && epx.f(this.photo, messagesChatPreviewDto.photo) && epx.f(this.isDon, messagesChatPreviewDto.isDon) && epx.f(this.isNft, messagesChatPreviewDto.isNft) && epx.f(this.isGroupChannel, messagesChatPreviewDto.isGroupChannel) && epx.f(this.button, messagesChatPreviewDto.button);
    }

    public final int hashCode() {
        int hashCode = (this.chatSettings.hashCode() + urd0.a(fw3.a(Long.hashCode(this.adminId.b) * 31, 31, this.members), 31, this.title)) * 31;
        Boolean bool = this.joined;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.localId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.membersCount;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.isMember;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        int hashCode6 = (hashCode5 + (messagesChatSettingsPhotoDto == null ? 0 : messagesChatSettingsPhotoDto.hashCode())) * 31;
        Boolean bool3 = this.isDon;
        int hashCode7 = (hashCode6 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isNft;
        int hashCode8 = (hashCode7 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isGroupChannel;
        int hashCode9 = (hashCode8 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        BaseLinkButtonDto baseLinkButtonDto = this.button;
        return hashCode9 + (baseLinkButtonDto != null ? baseLinkButtonDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesChatPreviewDto(adminId=" + this.adminId + ", members=" + this.members + ", title=" + this.title + ", chatSettings=" + this.chatSettings + ", joined=" + this.joined + ", localId=" + this.localId + ", membersCount=" + this.membersCount + ", isMember=" + this.isMember + ", photo=" + this.photo + ", isDon=" + this.isDon + ", isNft=" + this.isNft + ", isGroupChannel=" + this.isGroupChannel + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.adminId, i);
        Iterator a2 = ao.a(parcel, this.members);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.title);
        this.chatSettings.writeToParcel(parcel, i);
        Boolean bool = this.joined;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.localId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.membersCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Boolean bool2 = this.isMember;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
        MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto = this.photo;
        if (messagesChatSettingsPhotoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChatSettingsPhotoDto.writeToParcel(parcel, i);
        }
        Boolean bool3 = this.isDon;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool3);
        }
        Boolean bool4 = this.isNft;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool4);
        }
        Boolean bool5 = this.isGroupChannel;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool5);
        }
        parcel.writeParcelable(this.button, i);
    }

    public /* synthetic */ MessagesChatPreviewDto(UserId userId, List list, String str, MessagesChatSettingsDto messagesChatSettingsDto, Boolean bool, Integer num, Integer num2, Boolean bool2, MessagesChatSettingsPhotoDto messagesChatSettingsPhotoDto, Boolean bool3, Boolean bool4, Boolean bool5, BaseLinkButtonDto baseLinkButtonDto, int i, zcl zclVar) {
        this(userId, list, str, messagesChatSettingsDto, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : bool2, (i & 256) != 0 ? null : messagesChatSettingsPhotoDto, (i & 512) != 0 ? null : bool3, (i & 1024) != 0 ? null : bool4, (i & 2048) != 0 ? null : bool5, (i & 4096) != 0 ? null : baseLinkButtonDto);
    }
}
