package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.dto.common.id.UserId;
import ru.ok.android.webrtc.stat.call.methods.call_stat.OutgoingAudioStatistics;
import xsna.epx;
import xsna.ho8;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkButtonDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonDto> CREATOR = new a();

    @pmi0("accessibility_title")
    private final String accessibilityTitle;

    @pmi0("action")
    private final BaseLinkButtonActionDto action;

    @pmi0("album_id")
    private final Integer albumId;

    @pmi0("artist_id")
    private final String artistId;

    @pmi0("audio_id")
    private final Integer audioId;

    @pmi0("block_id")
    private final String blockId;

    @pmi0("curator_id")
    private final Integer curatorId;

    @pmi0("hashtag")
    private final String hashtag;

    @pmi0("hint_id")
    private final String hintId;

    @pmi0("icon")
    private final String icon;

    @pmi0("id")
    private final String id;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("section_id")
    private final String sectionId;

    @pmi0(TtmlNode.TAG_STYLE)
    private final BaseLinkButtonStyleDto style;

    @pmi0("title")
    private final String title;

    /* compiled from: BaseLinkButtonDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonDto createFromParcel(Parcel parcel) {
            BaseLinkButtonActionDto createFromParcel = parcel.readInt() == 0 ? null : BaseLinkButtonActionDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            Integer num = null;
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UserId userId = (UserId) parcel.readParcelable(BaseLinkButtonDto.class.getClassLoader());
            Integer num2 = valueOf2;
            String readString6 = parcel.readString();
            BaseLinkButtonStyleDto createFromParcel2 = parcel.readInt() == 0 ? null : BaseLinkButtonStyleDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            return new BaseLinkButtonDto(createFromParcel, readString, readString2, readString3, readString4, readString5, valueOf, num2, userId, readString6, createFromParcel2, num, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonDto[] newArray(int i) {
            return new BaseLinkButtonDto[i];
        }
    }

    public BaseLinkButtonDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, OutgoingAudioStatistics.AUDIO_LEVEL_MULTIPLIER_FOR_BACKEND, null);
    }

    public final String d() {
        return this.accessibilityTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseLinkButtonActionDto e() {
        return this.action;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonDto)) {
            return false;
        }
        BaseLinkButtonDto baseLinkButtonDto = (BaseLinkButtonDto) obj;
        return epx.f(this.action, baseLinkButtonDto.action) && epx.f(this.hintId, baseLinkButtonDto.hintId) && epx.f(this.title, baseLinkButtonDto.title) && epx.f(this.blockId, baseLinkButtonDto.blockId) && epx.f(this.sectionId, baseLinkButtonDto.sectionId) && epx.f(this.artistId, baseLinkButtonDto.artistId) && epx.f(this.curatorId, baseLinkButtonDto.curatorId) && epx.f(this.albumId, baseLinkButtonDto.albumId) && epx.f(this.ownerId, baseLinkButtonDto.ownerId) && epx.f(this.icon, baseLinkButtonDto.icon) && this.style == baseLinkButtonDto.style && epx.f(this.audioId, baseLinkButtonDto.audioId) && epx.f(this.id, baseLinkButtonDto.id) && epx.f(this.hashtag, baseLinkButtonDto.hashtag) && epx.f(this.accessibilityTitle, baseLinkButtonDto.accessibilityTitle);
    }

    public final Integer f() {
        return this.albumId;
    }

    public final Integer g() {
        return this.audioId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        int hashCode = (baseLinkButtonActionDto == null ? 0 : baseLinkButtonActionDto.hashCode()) * 31;
        String str = this.hintId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.blockId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.sectionId;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.artistId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.curatorId;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.albumId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        UserId userId = this.ownerId;
        int hashCode9 = (hashCode8 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        String str6 = this.icon;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = this.style;
        int hashCode11 = (hashCode10 + (baseLinkButtonStyleDto == null ? 0 : baseLinkButtonStyleDto.hashCode())) * 31;
        Integer num3 = this.audioId;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.id;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.hashtag;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.accessibilityTitle;
        return hashCode14 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String i() {
        return this.blockId;
    }

    public final String j() {
        return this.hashtag;
    }

    public final String k() {
        return this.hintId;
    }

    public final String l() {
        return this.icon;
    }

    public final String n() {
        return this.sectionId;
    }

    public final BaseLinkButtonStyleDto o() {
        return this.style;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonDto(action=");
        sb.append(this.action);
        sb.append(", hintId=");
        sb.append(this.hintId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", blockId=");
        sb.append(this.blockId);
        sb.append(", sectionId=");
        sb.append(this.sectionId);
        sb.append(", artistId=");
        sb.append(this.artistId);
        sb.append(", curatorId=");
        sb.append(this.curatorId);
        sb.append(", albumId=");
        sb.append(this.albumId);
        sb.append(", ownerId=");
        sb.append(this.ownerId);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", audioId=");
        sb.append(this.audioId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", hashtag=");
        sb.append(this.hashtag);
        sb.append(", accessibilityTitle=");
        return ho8.a(sb, this.accessibilityTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        BaseLinkButtonActionDto baseLinkButtonActionDto = this.action;
        if (baseLinkButtonActionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.hintId);
        parcel.writeString(this.title);
        parcel.writeString(this.blockId);
        parcel.writeString(this.sectionId);
        parcel.writeString(this.artistId);
        Integer num = this.curatorId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.albumId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeString(this.icon);
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = this.style;
        if (baseLinkButtonStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonStyleDto.writeToParcel(parcel, i);
        }
        Integer num3 = this.audioId;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        parcel.writeString(this.id);
        parcel.writeString(this.hashtag);
        parcel.writeString(this.accessibilityTitle);
    }

    public BaseLinkButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, UserId userId, String str6, BaseLinkButtonStyleDto baseLinkButtonStyleDto, Integer num3, String str7, String str8, String str9) {
        this.action = baseLinkButtonActionDto;
        this.hintId = str;
        this.title = str2;
        this.blockId = str3;
        this.sectionId = str4;
        this.artistId = str5;
        this.curatorId = num;
        this.albumId = num2;
        this.ownerId = userId;
        this.icon = str6;
        this.style = baseLinkButtonStyleDto;
        this.audioId = num3;
        this.id = str7;
        this.hashtag = str8;
        this.accessibilityTitle = str9;
    }

    public /* synthetic */ BaseLinkButtonDto(BaseLinkButtonActionDto baseLinkButtonActionDto, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, UserId userId, String str6, BaseLinkButtonStyleDto baseLinkButtonStyleDto, Integer num3, String str7, String str8, String str9, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseLinkButtonActionDto, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : userId, (i & 512) != 0 ? null : str6, (i & 1024) != 0 ? null : baseLinkButtonStyleDto, (i & 2048) != 0 ? null : num3, (i & 4096) != 0 ? null : str7, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : str9);
    }
}
