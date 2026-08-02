package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsGiftDto.kt */
/* loaded from: classes14.dex */
public final class GiftsGiftDto implements Parcelable {
    public static final Parcelable.Creator<GiftsGiftDto> CREATOR = new a();

    @pmi0("app_order")
    private final GiftsAppOrderDto appOrder;

    @pmi0("date")
    private final Integer date;

    @pmi0("entry_id")
    private final String entryId;

    @pmi0("from_id")
    private final UserId fromId;

    @pmi0("gift")
    private final GiftsLayoutDto gift;

    @pmi0("gift_hash")
    private final String giftHash;

    @pmi0("id")
    private final Integer id;

    @pmi0("message")
    private final String message;

    @pmi0("privacy")
    private final GiftsGiftPrivacyDto privacy;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("votes_attachment")
    private final GiftsGiftVotesAttachmentDto votesAttachment;

    /* compiled from: GiftsGiftDto.kt */
    public static final class a implements Parcelable.Creator<GiftsGiftDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsGiftDto createFromParcel(Parcel parcel) {
            return new GiftsGiftDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (UserId) parcel.readParcelable(GiftsGiftDto.class.getClassLoader()), parcel.readInt() == 0 ? null : GiftsAppOrderDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : GiftsLayoutDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : GiftsGiftPrivacyDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : GiftsGiftVotesAttachmentDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsGiftDto[] newArray(int i) {
            return new GiftsGiftDto[i];
        }
    }

    public GiftsGiftDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public final Integer d() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.entryId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsGiftDto)) {
            return false;
        }
        GiftsGiftDto giftsGiftDto = (GiftsGiftDto) obj;
        return epx.f(this.date, giftsGiftDto.date) && epx.f(this.fromId, giftsGiftDto.fromId) && epx.f(this.appOrder, giftsGiftDto.appOrder) && epx.f(this.gift, giftsGiftDto.gift) && epx.f(this.giftHash, giftsGiftDto.giftHash) && epx.f(this.id, giftsGiftDto.id) && epx.f(this.message, giftsGiftDto.message) && this.privacy == giftsGiftDto.privacy && epx.f(this.entryId, giftsGiftDto.entryId) && epx.f(this.trackCode, giftsGiftDto.trackCode) && epx.f(this.votesAttachment, giftsGiftDto.votesAttachment);
    }

    public final UserId f() {
        return this.fromId;
    }

    public final GiftsLayoutDto g() {
        return this.gift;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int hashCode() {
        Integer num = this.date;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        UserId userId = this.fromId;
        int hashCode2 = (hashCode + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        GiftsAppOrderDto giftsAppOrderDto = this.appOrder;
        int hashCode3 = (hashCode2 + (giftsAppOrderDto == null ? 0 : giftsAppOrderDto.hashCode())) * 31;
        GiftsLayoutDto giftsLayoutDto = this.gift;
        int hashCode4 = (hashCode3 + (giftsLayoutDto == null ? 0 : giftsLayoutDto.hashCode())) * 31;
        String str = this.giftHash;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.id;
        int hashCode6 = (hashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.message;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GiftsGiftPrivacyDto giftsGiftPrivacyDto = this.privacy;
        int hashCode8 = (hashCode7 + (giftsGiftPrivacyDto == null ? 0 : giftsGiftPrivacyDto.hashCode())) * 31;
        String str3 = this.entryId;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.trackCode;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = this.votesAttachment;
        return hashCode10 + (giftsGiftVotesAttachmentDto != null ? giftsGiftVotesAttachmentDto.hashCode() : 0);
    }

    public final String i() {
        return this.giftHash;
    }

    public final Integer j() {
        return this.id;
    }

    public final GiftsGiftPrivacyDto k() {
        return this.privacy;
    }

    public final GiftsGiftVotesAttachmentDto l() {
        return this.votesAttachment;
    }

    public final String toString() {
        return "GiftsGiftDto(date=" + this.date + ", fromId=" + this.fromId + ", appOrder=" + this.appOrder + ", gift=" + this.gift + ", giftHash=" + this.giftHash + ", id=" + this.id + ", message=" + this.message + ", privacy=" + this.privacy + ", entryId=" + this.entryId + ", trackCode=" + this.trackCode + ", votesAttachment=" + this.votesAttachment + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.date;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.fromId, i);
        GiftsAppOrderDto giftsAppOrderDto = this.appOrder;
        if (giftsAppOrderDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsAppOrderDto.writeToParcel(parcel, i);
        }
        GiftsLayoutDto giftsLayoutDto = this.gift;
        if (giftsLayoutDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsLayoutDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.giftHash);
        Integer num2 = this.id;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.message);
        GiftsGiftPrivacyDto giftsGiftPrivacyDto = this.privacy;
        if (giftsGiftPrivacyDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftPrivacyDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.entryId);
        parcel.writeString(this.trackCode);
        GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto = this.votesAttachment;
        if (giftsGiftVotesAttachmentDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            giftsGiftVotesAttachmentDto.writeToParcel(parcel, i);
        }
    }

    public GiftsGiftDto(Integer num, UserId userId, GiftsAppOrderDto giftsAppOrderDto, GiftsLayoutDto giftsLayoutDto, String str, Integer num2, String str2, GiftsGiftPrivacyDto giftsGiftPrivacyDto, String str3, String str4, GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto) {
        this.date = num;
        this.fromId = userId;
        this.appOrder = giftsAppOrderDto;
        this.gift = giftsLayoutDto;
        this.giftHash = str;
        this.id = num2;
        this.message = str2;
        this.privacy = giftsGiftPrivacyDto;
        this.entryId = str3;
        this.trackCode = str4;
        this.votesAttachment = giftsGiftVotesAttachmentDto;
    }

    public /* synthetic */ GiftsGiftDto(Integer num, UserId userId, GiftsAppOrderDto giftsAppOrderDto, GiftsLayoutDto giftsLayoutDto, String str, Integer num2, String str2, GiftsGiftPrivacyDto giftsGiftPrivacyDto, String str3, String str4, GiftsGiftVotesAttachmentDto giftsGiftVotesAttachmentDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : userId, (i & 4) != 0 ? null : giftsAppOrderDto, (i & 8) != 0 ? null : giftsLayoutDto, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : giftsGiftPrivacyDto, (i & 256) != 0 ? null : str3, (i & 512) != 0 ? null : str4, (i & 1024) != 0 ? null : giftsGiftVotesAttachmentDto);
    }
}
