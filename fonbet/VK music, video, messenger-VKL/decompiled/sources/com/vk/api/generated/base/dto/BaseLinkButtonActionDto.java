package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.api.generated.snippets.dto.SnippetsAmpDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import ru.ok.android.onelog.UploadService;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkButtonActionDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkButtonActionDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkButtonActionDto> CREATOR = new a();

    @pmi0("action_title")
    private final String actionTitle;

    @pmi0("amp")
    private final SnippetsAmpDto amp;

    @pmi0("away_params")
    private final Object awayParams;

    @pmi0(NotificationCompat.CATEGORY_CALL)
    private final BaseLinkButtonActionCallDto call;

    @pmi0("consume_reason")
    private final String consumeReason;

    @pmi0("group_id")
    private final UserId groupId;

    @pmi0("jwt")
    private final String jwt;

    @pmi0("market_edit_album_info")
    private final BaseLinkButtonActionMarketEditAlbumInfoDto marketEditAlbumInfo;

    @pmi0("market_write")
    private final BaseLinkButtonActionMarketWriteDto marketWrite;

    @pmi0("modal_page")
    private final BaseLinkButtonActionModalPageDto modalPage;

    @pmi0("peer_id")
    private final UserId peerId;

    @pmi0("perform_action_with_url")
    private final BaseLinkButtonActionPerformActionWithUrlDto performActionWithUrl;

    @pmi0("share_options")
    private final BaseLinkButtonActionShareOptionsDto shareOptions;

    @pmi0("show_snackbar")
    private final BaseSnackbarDto showSnackbar;

    @pmi0(TtmlNode.TAG_STYLE)
    private final BaseLinkButtonStyleDto style;

    @pmi0("target")
    private final BaseOwnerButtonActionTargetDto target;

    @pmi0(UploadService.EXTRA_TRIGGER)
    private final String trigger;

    @pmi0("type")
    private final BaseLinkButtonActionTypeDto type;

    @pmi0("url")
    private final String url;

    /* compiled from: BaseLinkButtonActionDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkButtonActionDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionDto createFromParcel(Parcel parcel) {
            BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto;
            SnippetsAmpDto createFromParcel;
            SnippetsAmpDto snippetsAmpDto;
            BaseLinkButtonActionMarketEditAlbumInfoDto createFromParcel2;
            BaseLinkButtonActionTypeDto createFromParcel3 = BaseLinkButtonActionTypeDto.CREATOR.createFromParcel(parcel);
            Object readValue = parcel.readValue(BaseLinkButtonActionDto.class.getClassLoader());
            UserId userId = (UserId) parcel.readParcelable(BaseLinkButtonActionDto.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(BaseLinkButtonActionDto.class.getClassLoader());
            BaseOwnerButtonActionTargetDto createFromParcel4 = parcel.readInt() == 0 ? null : BaseOwnerButtonActionTargetDto.CREATOR.createFromParcel(parcel);
            BaseSnackbarDto createFromParcel5 = parcel.readInt() == 0 ? null : BaseSnackbarDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonActionMarketWriteDto createFromParcel6 = parcel.readInt() == 0 ? null : BaseLinkButtonActionMarketWriteDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonActionCallDto createFromParcel7 = parcel.readInt() == 0 ? null : BaseLinkButtonActionCallDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonActionModalPageDto createFromParcel8 = parcel.readInt() == 0 ? null : BaseLinkButtonActionModalPageDto.CREATOR.createFromParcel(parcel);
            BaseLinkButtonActionPerformActionWithUrlDto createFromParcel9 = parcel.readInt() == 0 ? null : BaseLinkButtonActionPerformActionWithUrlDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            BaseLinkButtonActionShareOptionsDto baseLinkButtonActionShareOptionsDto = null;
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                baseLinkButtonActionShareOptionsDto = BaseLinkButtonActionShareOptionsDto.CREATOR.createFromParcel(parcel);
            }
            BaseLinkButtonActionShareOptionsDto baseLinkButtonActionShareOptionsDto2 = baseLinkButtonActionShareOptionsDto;
            if (parcel.readInt() == 0) {
                baseLinkButtonActionTypeDto = createFromParcel3;
                createFromParcel = null;
            } else {
                baseLinkButtonActionTypeDto = createFromParcel3;
                createFromParcel = SnippetsAmpDto.CREATOR.createFromParcel(parcel);
            }
            SnippetsAmpDto snippetsAmpDto2 = createFromParcel;
            if (parcel.readInt() == 0) {
                snippetsAmpDto = snippetsAmpDto2;
                createFromParcel2 = null;
            } else {
                snippetsAmpDto = snippetsAmpDto2;
                createFromParcel2 = BaseLinkButtonActionMarketEditAlbumInfoDto.CREATOR.createFromParcel(parcel);
            }
            return new BaseLinkButtonActionDto(baseLinkButtonActionTypeDto, readValue, userId, userId2, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, readString, readString2, readString3, baseLinkButtonActionShareOptionsDto2, snippetsAmpDto, createFromParcel2, parcel.readInt() == 0 ? null : BaseLinkButtonStyleDto.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkButtonActionDto[] newArray(int i) {
            return new BaseLinkButtonActionDto[i];
        }
    }

    public BaseLinkButtonActionDto(BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto, Object obj, UserId userId, UserId userId2, BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, BaseSnackbarDto baseSnackbarDto, BaseLinkButtonActionMarketWriteDto baseLinkButtonActionMarketWriteDto, BaseLinkButtonActionCallDto baseLinkButtonActionCallDto, BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto, BaseLinkButtonActionPerformActionWithUrlDto baseLinkButtonActionPerformActionWithUrlDto, String str, String str2, String str3, BaseLinkButtonActionShareOptionsDto baseLinkButtonActionShareOptionsDto, SnippetsAmpDto snippetsAmpDto, BaseLinkButtonActionMarketEditAlbumInfoDto baseLinkButtonActionMarketEditAlbumInfoDto, BaseLinkButtonStyleDto baseLinkButtonStyleDto, String str4, String str5) {
        this.type = baseLinkButtonActionTypeDto;
        this.awayParams = obj;
        this.groupId = userId;
        this.peerId = userId2;
        this.target = baseOwnerButtonActionTargetDto;
        this.showSnackbar = baseSnackbarDto;
        this.marketWrite = baseLinkButtonActionMarketWriteDto;
        this.call = baseLinkButtonActionCallDto;
        this.modalPage = baseLinkButtonActionModalPageDto;
        this.performActionWithUrl = baseLinkButtonActionPerformActionWithUrlDto;
        this.url = str;
        this.consumeReason = str2;
        this.jwt = str3;
        this.shareOptions = baseLinkButtonActionShareOptionsDto;
        this.amp = snippetsAmpDto;
        this.marketEditAlbumInfo = baseLinkButtonActionMarketEditAlbumInfoDto;
        this.style = baseLinkButtonStyleDto;
        this.actionTitle = str4;
        this.trigger = str5;
    }

    public final BaseOwnerButtonActionTargetDto B() {
        return this.target;
    }

    public final BaseLinkButtonActionTypeDto C() {
        return this.type;
    }

    public final String d() {
        return this.actionTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Object e() {
        return this.awayParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseLinkButtonActionDto)) {
            return false;
        }
        BaseLinkButtonActionDto baseLinkButtonActionDto = (BaseLinkButtonActionDto) obj;
        return this.type == baseLinkButtonActionDto.type && epx.f(this.awayParams, baseLinkButtonActionDto.awayParams) && epx.f(this.groupId, baseLinkButtonActionDto.groupId) && epx.f(this.peerId, baseLinkButtonActionDto.peerId) && this.target == baseLinkButtonActionDto.target && epx.f(this.showSnackbar, baseLinkButtonActionDto.showSnackbar) && epx.f(this.marketWrite, baseLinkButtonActionDto.marketWrite) && epx.f(this.call, baseLinkButtonActionDto.call) && epx.f(this.modalPage, baseLinkButtonActionDto.modalPage) && epx.f(this.performActionWithUrl, baseLinkButtonActionDto.performActionWithUrl) && epx.f(this.url, baseLinkButtonActionDto.url) && epx.f(this.consumeReason, baseLinkButtonActionDto.consumeReason) && epx.f(this.jwt, baseLinkButtonActionDto.jwt) && epx.f(this.shareOptions, baseLinkButtonActionDto.shareOptions) && epx.f(this.amp, baseLinkButtonActionDto.amp) && epx.f(this.marketEditAlbumInfo, baseLinkButtonActionDto.marketEditAlbumInfo) && this.style == baseLinkButtonActionDto.style && epx.f(this.actionTitle, baseLinkButtonActionDto.actionTitle) && epx.f(this.trigger, baseLinkButtonActionDto.trigger);
    }

    public final BaseLinkButtonActionCallDto f() {
        return this.call;
    }

    public final String g() {
        return this.consumeReason;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        Object obj = this.awayParams;
        int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        UserId userId = this.groupId;
        int hashCode3 = (hashCode2 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.peerId;
        int hashCode4 = (hashCode3 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = this.target;
        int hashCode5 = (hashCode4 + (baseOwnerButtonActionTargetDto == null ? 0 : baseOwnerButtonActionTargetDto.hashCode())) * 31;
        BaseSnackbarDto baseSnackbarDto = this.showSnackbar;
        int hashCode6 = (hashCode5 + (baseSnackbarDto == null ? 0 : baseSnackbarDto.hashCode())) * 31;
        BaseLinkButtonActionMarketWriteDto baseLinkButtonActionMarketWriteDto = this.marketWrite;
        int hashCode7 = (hashCode6 + (baseLinkButtonActionMarketWriteDto == null ? 0 : baseLinkButtonActionMarketWriteDto.hashCode())) * 31;
        BaseLinkButtonActionCallDto baseLinkButtonActionCallDto = this.call;
        int hashCode8 = (hashCode7 + (baseLinkButtonActionCallDto == null ? 0 : baseLinkButtonActionCallDto.hashCode())) * 31;
        BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = this.modalPage;
        int hashCode9 = (hashCode8 + (baseLinkButtonActionModalPageDto == null ? 0 : baseLinkButtonActionModalPageDto.hashCode())) * 31;
        BaseLinkButtonActionPerformActionWithUrlDto baseLinkButtonActionPerformActionWithUrlDto = this.performActionWithUrl;
        int hashCode10 = (hashCode9 + (baseLinkButtonActionPerformActionWithUrlDto == null ? 0 : baseLinkButtonActionPerformActionWithUrlDto.hashCode())) * 31;
        String str = this.url;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consumeReason;
        int hashCode12 = (hashCode11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.jwt;
        int hashCode13 = (hashCode12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BaseLinkButtonActionShareOptionsDto baseLinkButtonActionShareOptionsDto = this.shareOptions;
        int hashCode14 = (hashCode13 + (baseLinkButtonActionShareOptionsDto == null ? 0 : baseLinkButtonActionShareOptionsDto.hashCode())) * 31;
        SnippetsAmpDto snippetsAmpDto = this.amp;
        int hashCode15 = (hashCode14 + (snippetsAmpDto == null ? 0 : snippetsAmpDto.hashCode())) * 31;
        BaseLinkButtonActionMarketEditAlbumInfoDto baseLinkButtonActionMarketEditAlbumInfoDto = this.marketEditAlbumInfo;
        int hashCode16 = (hashCode15 + (baseLinkButtonActionMarketEditAlbumInfoDto == null ? 0 : baseLinkButtonActionMarketEditAlbumInfoDto.hashCode())) * 31;
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = this.style;
        int hashCode17 = (hashCode16 + (baseLinkButtonStyleDto == null ? 0 : baseLinkButtonStyleDto.hashCode())) * 31;
        String str4 = this.actionTitle;
        int hashCode18 = (hashCode17 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.trigger;
        return hashCode18 + (str5 != null ? str5.hashCode() : 0);
    }

    public final UserId i() {
        return this.groupId;
    }

    public final String j() {
        return this.jwt;
    }

    public final BaseLinkButtonActionMarketEditAlbumInfoDto k() {
        return this.marketEditAlbumInfo;
    }

    public final BaseLinkButtonActionMarketWriteDto l() {
        return this.marketWrite;
    }

    public final BaseLinkButtonActionModalPageDto n() {
        return this.modalPage;
    }

    public final BaseLinkButtonActionPerformActionWithUrlDto o() {
        return this.performActionWithUrl;
    }

    public final BaseLinkButtonActionShareOptionsDto p() {
        return this.shareOptions;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseLinkButtonActionDto(type=");
        sb.append(this.type);
        sb.append(", awayParams=");
        sb.append(this.awayParams);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", peerId=");
        sb.append(this.peerId);
        sb.append(", target=");
        sb.append(this.target);
        sb.append(", showSnackbar=");
        sb.append(this.showSnackbar);
        sb.append(", marketWrite=");
        sb.append(this.marketWrite);
        sb.append(", call=");
        sb.append(this.call);
        sb.append(", modalPage=");
        sb.append(this.modalPage);
        sb.append(", performActionWithUrl=");
        sb.append(this.performActionWithUrl);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", consumeReason=");
        sb.append(this.consumeReason);
        sb.append(", jwt=");
        sb.append(this.jwt);
        sb.append(", shareOptions=");
        sb.append(this.shareOptions);
        sb.append(", amp=");
        sb.append(this.amp);
        sb.append(", marketEditAlbumInfo=");
        sb.append(this.marketEditAlbumInfo);
        sb.append(", style=");
        sb.append(this.style);
        sb.append(", actionTitle=");
        sb.append(this.actionTitle);
        sb.append(", trigger=");
        return ho8.a(sb, this.trigger, ')');
    }

    public final BaseLinkButtonStyleDto u() {
        return this.style;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.type.writeToParcel(parcel, i);
        parcel.writeValue(this.awayParams);
        parcel.writeParcelable(this.groupId, i);
        parcel.writeParcelable(this.peerId, i);
        BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto = this.target;
        if (baseOwnerButtonActionTargetDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseOwnerButtonActionTargetDto.writeToParcel(parcel, i);
        }
        BaseSnackbarDto baseSnackbarDto = this.showSnackbar;
        if (baseSnackbarDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseSnackbarDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionMarketWriteDto baseLinkButtonActionMarketWriteDto = this.marketWrite;
        if (baseLinkButtonActionMarketWriteDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionMarketWriteDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionCallDto baseLinkButtonActionCallDto = this.call;
        if (baseLinkButtonActionCallDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionCallDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto = this.modalPage;
        if (baseLinkButtonActionModalPageDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionModalPageDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionPerformActionWithUrlDto baseLinkButtonActionPerformActionWithUrlDto = this.performActionWithUrl;
        if (baseLinkButtonActionPerformActionWithUrlDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionPerformActionWithUrlDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.url);
        parcel.writeString(this.consumeReason);
        parcel.writeString(this.jwt);
        BaseLinkButtonActionShareOptionsDto baseLinkButtonActionShareOptionsDto = this.shareOptions;
        if (baseLinkButtonActionShareOptionsDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionShareOptionsDto.writeToParcel(parcel, i);
        }
        SnippetsAmpDto snippetsAmpDto = this.amp;
        if (snippetsAmpDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            snippetsAmpDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonActionMarketEditAlbumInfoDto baseLinkButtonActionMarketEditAlbumInfoDto = this.marketEditAlbumInfo;
        if (baseLinkButtonActionMarketEditAlbumInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonActionMarketEditAlbumInfoDto.writeToParcel(parcel, i);
        }
        BaseLinkButtonStyleDto baseLinkButtonStyleDto = this.style;
        if (baseLinkButtonStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkButtonStyleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.actionTitle);
        parcel.writeString(this.trigger);
    }

    public /* synthetic */ BaseLinkButtonActionDto(BaseLinkButtonActionTypeDto baseLinkButtonActionTypeDto, Object obj, UserId userId, UserId userId2, BaseOwnerButtonActionTargetDto baseOwnerButtonActionTargetDto, BaseSnackbarDto baseSnackbarDto, BaseLinkButtonActionMarketWriteDto baseLinkButtonActionMarketWriteDto, BaseLinkButtonActionCallDto baseLinkButtonActionCallDto, BaseLinkButtonActionModalPageDto baseLinkButtonActionModalPageDto, BaseLinkButtonActionPerformActionWithUrlDto baseLinkButtonActionPerformActionWithUrlDto, String str, String str2, String str3, BaseLinkButtonActionShareOptionsDto baseLinkButtonActionShareOptionsDto, SnippetsAmpDto snippetsAmpDto, BaseLinkButtonActionMarketEditAlbumInfoDto baseLinkButtonActionMarketEditAlbumInfoDto, BaseLinkButtonStyleDto baseLinkButtonStyleDto, String str4, String str5, int i, zcl zclVar) {
        this(baseLinkButtonActionTypeDto, (i & 2) != 0 ? null : obj, (i & 4) != 0 ? null : userId, (i & 8) != 0 ? null : userId2, (i & 16) != 0 ? null : baseOwnerButtonActionTargetDto, (i & 32) != 0 ? null : baseSnackbarDto, (i & 64) != 0 ? null : baseLinkButtonActionMarketWriteDto, (i & 128) != 0 ? null : baseLinkButtonActionCallDto, (i & 256) != 0 ? null : baseLinkButtonActionModalPageDto, (i & 512) != 0 ? null : baseLinkButtonActionPerformActionWithUrlDto, (i & 1024) != 0 ? null : str, (i & 2048) != 0 ? null : str2, (i & 4096) != 0 ? null : str3, (i & 8192) != 0 ? null : baseLinkButtonActionShareOptionsDto, (i & 16384) != 0 ? null : snippetsAmpDto, (i & 32768) != 0 ? null : baseLinkButtonActionMarketEditAlbumInfoDto, (i & 65536) != 0 ? null : baseLinkButtonStyleDto, (i & 131072) != 0 ? null : str4, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : str5);
    }
}
