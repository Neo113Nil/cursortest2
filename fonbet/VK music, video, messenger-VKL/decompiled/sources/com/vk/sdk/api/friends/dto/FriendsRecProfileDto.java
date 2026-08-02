package com.vk.sdk.api.friends.dto;

import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.common.id.UserId;
import com.vk.sdk.api.base.dto.BaseBoolIntDto;
import com.vk.sdk.api.base.dto.BaseCropPhotoDto;
import com.vk.sdk.api.base.dto.BaseSexDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.List;
import xsna.epx;
import xsna.mq;
import xsna.n6j;
import xsna.pmi0;
import xsna.to;
import xsna.zcl;

/* compiled from: FriendsRecProfileDto.kt */
/* loaded from: classes5.dex */
public final class FriendsRecProfileDto {

    @pmi0("button")
    private final FriendsRecBlockButtonDto button;

    @pmi0("can_write_private_message")
    private final BaseBoolIntDto canWritePrivateMessage;

    @pmi0("common_count")
    private final Integer commonCount;

    @pmi0("crop_photo")
    private final BaseCropPhotoDto cropPhoto;

    @pmi0("description")
    private final String description;

    @pmi0("descriptions")
    private final List<FriendsRecDescriptionGenericDto> descriptions;

    @pmi0("first_name")
    private final String firstName;

    @pmi0("friend_status")
    private final FriendsFriendStatusStatusDto friendStatus;

    @pmi0("friends_generation_id")
    private final Long friendsGenerationId;

    @pmi0("friends_recommendation_source")
    private final Integer friendsRecommendationSource;

    @pmi0("id")
    private final UserId id;

    @pmi0("last_name")
    private final String lastName;

    @pmi0("mutual")
    private final FriendsRequestsMutualDto mutual;

    @pmi0("photo_100")
    private final String photo100;

    @pmi0("photo_200")
    private final String photo200;

    @pmi0("photo_400")
    private final String photo400;

    @pmi0("photo_400_orig")
    private final String photo400Orig;

    @pmi0("photo_base")
    private final String photoBase;

    @pmi0("sex")
    private final BaseSexDto sex;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsRecProfileDto(UserId userId, Long l, Integer num, String str, String str2, FriendsRequestsMutualDto friendsRequestsMutualDto, BaseSexDto baseSexDto, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, List<? extends FriendsRecDescriptionGenericDto> list, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str9, BaseCropPhotoDto baseCropPhotoDto, FriendsRecBlockButtonDto friendsRecBlockButtonDto) {
        this.id = userId;
        this.friendsGenerationId = l;
        this.friendsRecommendationSource = num;
        this.firstName = str;
        this.lastName = str2;
        this.mutual = friendsRequestsMutualDto;
        this.sex = baseSexDto;
        this.photo100 = str3;
        this.photo200 = str4;
        this.photo400Orig = str5;
        this.photo400 = str6;
        this.photoBase = str7;
        this.commonCount = num2;
        this.description = str8;
        this.descriptions = list;
        this.friendStatus = friendsFriendStatusStatusDto;
        this.verified = baseBoolIntDto;
        this.trending = baseBoolIntDto2;
        this.canWritePrivateMessage = baseBoolIntDto3;
        this.trackCode = str9;
        this.cropPhoto = baseCropPhotoDto;
        this.button = friendsRecBlockButtonDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecProfileDto)) {
            return false;
        }
        FriendsRecProfileDto friendsRecProfileDto = (FriendsRecProfileDto) obj;
        return epx.f(this.id, friendsRecProfileDto.id) && epx.f(this.friendsGenerationId, friendsRecProfileDto.friendsGenerationId) && epx.f(this.friendsRecommendationSource, friendsRecProfileDto.friendsRecommendationSource) && epx.f(this.firstName, friendsRecProfileDto.firstName) && epx.f(this.lastName, friendsRecProfileDto.lastName) && epx.f(this.mutual, friendsRecProfileDto.mutual) && this.sex == friendsRecProfileDto.sex && epx.f(this.photo100, friendsRecProfileDto.photo100) && epx.f(this.photo200, friendsRecProfileDto.photo200) && epx.f(this.photo400Orig, friendsRecProfileDto.photo400Orig) && epx.f(this.photo400, friendsRecProfileDto.photo400) && epx.f(this.photoBase, friendsRecProfileDto.photoBase) && epx.f(this.commonCount, friendsRecProfileDto.commonCount) && epx.f(this.description, friendsRecProfileDto.description) && epx.f(this.descriptions, friendsRecProfileDto.descriptions) && this.friendStatus == friendsRecProfileDto.friendStatus && this.verified == friendsRecProfileDto.verified && this.trending == friendsRecProfileDto.trending && this.canWritePrivateMessage == friendsRecProfileDto.canWritePrivateMessage && epx.f(this.trackCode, friendsRecProfileDto.trackCode) && epx.f(this.cropPhoto, friendsRecProfileDto.cropPhoto) && epx.f(this.button, friendsRecProfileDto.button);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id.b) * 31;
        Long l = this.friendsGenerationId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.friendsRecommendationSource;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.firstName;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        int hashCode6 = (hashCode5 + (friendsRequestsMutualDto == null ? 0 : friendsRequestsMutualDto.hashCode())) * 31;
        BaseSexDto baseSexDto = this.sex;
        int hashCode7 = (hashCode6 + (baseSexDto == null ? 0 : baseSexDto.hashCode())) * 31;
        String str3 = this.photo100;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.photo200;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.photo400Orig;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.photo400;
        int hashCode11 = (hashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.photoBase;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.commonCount;
        int hashCode13 = (hashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.description;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<FriendsRecDescriptionGenericDto> list = this.descriptions;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        int hashCode16 = (hashCode15 + (friendsFriendStatusStatusDto == null ? 0 : friendsFriendStatusStatusDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.verified;
        int hashCode17 = (hashCode16 + (baseBoolIntDto == null ? 0 : baseBoolIntDto.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto2 = this.trending;
        int hashCode18 = (hashCode17 + (baseBoolIntDto2 == null ? 0 : baseBoolIntDto2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto3 = this.canWritePrivateMessage;
        int hashCode19 = (hashCode18 + (baseBoolIntDto3 == null ? 0 : baseBoolIntDto3.hashCode())) * 31;
        String str9 = this.trackCode;
        int hashCode20 = (hashCode19 + (str9 == null ? 0 : str9.hashCode())) * 31;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        int hashCode21 = (hashCode20 + (baseCropPhotoDto == null ? 0 : baseCropPhotoDto.hashCode())) * 31;
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = this.button;
        return hashCode21 + (friendsRecBlockButtonDto != null ? friendsRecBlockButtonDto.hashCode() : 0);
    }

    public final String toString() {
        UserId userId = this.id;
        Long l = this.friendsGenerationId;
        Integer num = this.friendsRecommendationSource;
        String str = this.firstName;
        String str2 = this.lastName;
        FriendsRequestsMutualDto friendsRequestsMutualDto = this.mutual;
        BaseSexDto baseSexDto = this.sex;
        String str3 = this.photo100;
        String str4 = this.photo200;
        String str5 = this.photo400Orig;
        String str6 = this.photo400;
        String str7 = this.photoBase;
        Integer num2 = this.commonCount;
        String str8 = this.description;
        List<FriendsRecDescriptionGenericDto> list = this.descriptions;
        FriendsFriendStatusStatusDto friendsFriendStatusStatusDto = this.friendStatus;
        BaseBoolIntDto baseBoolIntDto = this.verified;
        BaseBoolIntDto baseBoolIntDto2 = this.trending;
        BaseBoolIntDto baseBoolIntDto3 = this.canWritePrivateMessage;
        String str9 = this.trackCode;
        BaseCropPhotoDto baseCropPhotoDto = this.cropPhoto;
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = this.button;
        StringBuilder sb = new StringBuilder("FriendsRecProfileDto(id=");
        sb.append(userId);
        sb.append(", friendsGenerationId=");
        sb.append(l);
        sb.append(", friendsRecommendationSource=");
        mq.b(num, ", firstName=", str, ", lastName=", sb);
        sb.append(str2);
        sb.append(", mutual=");
        sb.append(friendsRequestsMutualDto);
        sb.append(", sex=");
        sb.append(baseSexDto);
        sb.append(", photo100=");
        sb.append(str3);
        sb.append(", photo200=");
        n6j.b(sb, str4, ", photo400Orig=", str5, ", photo400=");
        n6j.b(sb, str6, ", photoBase=", str7, ", commonCount=");
        mq.b(num2, ", description=", str8, ", descriptions=", sb);
        sb.append(list);
        sb.append(", friendStatus=");
        sb.append(friendsFriendStatusStatusDto);
        sb.append(", verified=");
        to.b(sb, baseBoolIntDto, ", trending=", baseBoolIntDto2, ", canWritePrivateMessage=");
        sb.append(baseBoolIntDto3);
        sb.append(", trackCode=");
        sb.append(str9);
        sb.append(", cropPhoto=");
        sb.append(baseCropPhotoDto);
        sb.append(", button=");
        sb.append(friendsRecBlockButtonDto);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ FriendsRecProfileDto(UserId userId, Long l, Integer num, String str, String str2, FriendsRequestsMutualDto friendsRequestsMutualDto, BaseSexDto baseSexDto, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, List list, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str9, BaseCropPhotoDto baseCropPhotoDto, FriendsRecBlockButtonDto friendsRecBlockButtonDto, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : friendsRequestsMutualDto, (i & 64) != 0 ? null : baseSexDto, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : list, (i & 32768) != 0 ? null : friendsFriendStatusStatusDto, (i & 65536) != 0 ? null : baseBoolIntDto, (i & 131072) != 0 ? null : baseBoolIntDto2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto3, (i & 524288) != 0 ? null : str9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseCropPhotoDto, (i & 2097152) != 0 ? null : friendsRecBlockButtonDto);
    }
}
