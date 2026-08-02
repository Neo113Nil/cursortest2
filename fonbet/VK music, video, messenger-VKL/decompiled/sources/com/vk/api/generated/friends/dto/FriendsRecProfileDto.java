package com.vk.api.generated.friends.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseCropPhotoDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: FriendsRecProfileDto.kt */
/* loaded from: classes14.dex */
public final class FriendsRecProfileDto implements Parcelable {
    public static final Parcelable.Creator<FriendsRecProfileDto> CREATOR = new a();

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

    @pmi0("social_button_type")
    private final SocialButtonTypeDto socialButtonType;

    @pmi0("track_code")
    private final String trackCode;

    @pmi0("trending")
    private final BaseBoolIntDto trending;

    @pmi0("verified")
    private final BaseBoolIntDto verified;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FriendsRecProfileDto.kt */
    public static final class SocialButtonTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SocialButtonTypeDto[] $VALUES;

        @pmi0("add")
        public static final SocialButtonTypeDto ADD;
        public static final Parcelable.Creator<SocialButtonTypeDto> CREATOR;

        @pmi0("follow")
        public static final SocialButtonTypeDto FOLLOW;
        private final String value;

        /* compiled from: FriendsRecProfileDto.kt */
        public static final class a implements Parcelable.Creator<SocialButtonTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final SocialButtonTypeDto createFromParcel(Parcel parcel) {
                return SocialButtonTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SocialButtonTypeDto[] newArray(int i) {
                return new SocialButtonTypeDto[i];
            }
        }

        static {
            SocialButtonTypeDto socialButtonTypeDto = new SocialButtonTypeDto("FOLLOW", 0, "follow");
            FOLLOW = socialButtonTypeDto;
            SocialButtonTypeDto socialButtonTypeDto2 = new SocialButtonTypeDto("ADD", 1, "add");
            ADD = socialButtonTypeDto2;
            SocialButtonTypeDto[] socialButtonTypeDtoArr = {socialButtonTypeDto, socialButtonTypeDto2};
            $VALUES = socialButtonTypeDtoArr;
            $ENTRIES = new asp(socialButtonTypeDtoArr);
            CREATOR = new a();
        }

        private SocialButtonTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static SocialButtonTypeDto valueOf(String str) {
            return (SocialButtonTypeDto) Enum.valueOf(SocialButtonTypeDto.class, str);
        }

        public static SocialButtonTypeDto[] values() {
            return (SocialButtonTypeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: FriendsRecProfileDto.kt */
    public static final class a implements Parcelable.Creator<FriendsRecProfileDto> {
        @Override // android.os.Parcelable.Creator
        public final FriendsRecProfileDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            UserId userId;
            UserId userId2 = (UserId) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader());
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            FriendsRequestsMutualDto friendsRequestsMutualDto = (FriendsRequestsMutualDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader());
            BaseSexDto baseSexDto = (BaseSexDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader());
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString8 = parcel.readString();
            if (parcel.readInt() == 0) {
                userId = userId2;
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                userId = userId2;
                int i = 0;
                while (i != readInt) {
                    i = bo.b(FriendsRecProfileDto.class, parcel, arrayList, i, 1);
                    readInt = readInt;
                }
            }
            return new FriendsRecProfileDto(userId, valueOf, valueOf2, readString, readString2, friendsRequestsMutualDto, baseSexDto, readString3, readString4, readString5, readString6, readString7, valueOf3, readString8, arrayList, (FriendsFriendStatusStatusDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader()), (BaseBoolIntDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader()), parcel.readString(), (BaseCropPhotoDto) parcel.readParcelable(FriendsRecProfileDto.class.getClassLoader()), parcel.readInt() == 0 ? null : FriendsRecBlockButtonDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SocialButtonTypeDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final FriendsRecProfileDto[] newArray(int i) {
            return new FriendsRecProfileDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsRecProfileDto(UserId userId, Long l, Integer num, String str, String str2, FriendsRequestsMutualDto friendsRequestsMutualDto, BaseSexDto baseSexDto, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, List<? extends FriendsRecDescriptionGenericDto> list, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str9, BaseCropPhotoDto baseCropPhotoDto, FriendsRecBlockButtonDto friendsRecBlockButtonDto, SocialButtonTypeDto socialButtonTypeDto) {
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
        this.socialButtonType = socialButtonTypeDto;
    }

    public final String B() {
        return this.photo400Orig;
    }

    public final String C() {
        return this.photoBase;
    }

    public final BaseSexDto D() {
        return this.sex;
    }

    public final SocialButtonTypeDto F() {
        return this.socialButtonType;
    }

    public final BaseBoolIntDto G() {
        return this.trending;
    }

    public final BaseBoolIntDto K() {
        return this.verified;
    }

    public final FriendsRecBlockButtonDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.canWritePrivateMessage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FriendsRecProfileDto)) {
            return false;
        }
        FriendsRecProfileDto friendsRecProfileDto = (FriendsRecProfileDto) obj;
        return epx.f(this.id, friendsRecProfileDto.id) && epx.f(this.friendsGenerationId, friendsRecProfileDto.friendsGenerationId) && epx.f(this.friendsRecommendationSource, friendsRecProfileDto.friendsRecommendationSource) && epx.f(this.firstName, friendsRecProfileDto.firstName) && epx.f(this.lastName, friendsRecProfileDto.lastName) && epx.f(this.mutual, friendsRecProfileDto.mutual) && this.sex == friendsRecProfileDto.sex && epx.f(this.photo100, friendsRecProfileDto.photo100) && epx.f(this.photo200, friendsRecProfileDto.photo200) && epx.f(this.photo400Orig, friendsRecProfileDto.photo400Orig) && epx.f(this.photo400, friendsRecProfileDto.photo400) && epx.f(this.photoBase, friendsRecProfileDto.photoBase) && epx.f(this.commonCount, friendsRecProfileDto.commonCount) && epx.f(this.description, friendsRecProfileDto.description) && epx.f(this.descriptions, friendsRecProfileDto.descriptions) && this.friendStatus == friendsRecProfileDto.friendStatus && this.verified == friendsRecProfileDto.verified && this.trending == friendsRecProfileDto.trending && this.canWritePrivateMessage == friendsRecProfileDto.canWritePrivateMessage && epx.f(this.trackCode, friendsRecProfileDto.trackCode) && epx.f(this.cropPhoto, friendsRecProfileDto.cropPhoto) && epx.f(this.button, friendsRecProfileDto.button) && this.socialButtonType == friendsRecProfileDto.socialButtonType;
    }

    public final BaseCropPhotoDto f() {
        return this.cropPhoto;
    }

    public final List<FriendsRecDescriptionGenericDto> g() {
        return this.descriptions;
    }

    public final String getDescription() {
        return this.description;
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
        int hashCode22 = (hashCode21 + (friendsRecBlockButtonDto == null ? 0 : friendsRecBlockButtonDto.hashCode())) * 31;
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        return hashCode22 + (socialButtonTypeDto != null ? socialButtonTypeDto.hashCode() : 0);
    }

    public final String i() {
        return this.firstName;
    }

    public final FriendsFriendStatusStatusDto j() {
        return this.friendStatus;
    }

    public final UserId k() {
        return this.id;
    }

    public final String l() {
        return this.lastName;
    }

    public final FriendsRequestsMutualDto n() {
        return this.mutual;
    }

    public final String o() {
        return this.photo100;
    }

    public final String p() {
        return this.photo200;
    }

    public final String r() {
        return this.trackCode;
    }

    public final String toString() {
        return "FriendsRecProfileDto(id=" + this.id + ", friendsGenerationId=" + this.friendsGenerationId + ", friendsRecommendationSource=" + this.friendsRecommendationSource + ", firstName=" + this.firstName + ", lastName=" + this.lastName + ", mutual=" + this.mutual + ", sex=" + this.sex + ", photo100=" + this.photo100 + ", photo200=" + this.photo200 + ", photo400Orig=" + this.photo400Orig + ", photo400=" + this.photo400 + ", photoBase=" + this.photoBase + ", commonCount=" + this.commonCount + ", description=" + this.description + ", descriptions=" + this.descriptions + ", friendStatus=" + this.friendStatus + ", verified=" + this.verified + ", trending=" + this.trending + ", canWritePrivateMessage=" + this.canWritePrivateMessage + ", trackCode=" + this.trackCode + ", cropPhoto=" + this.cropPhoto + ", button=" + this.button + ", socialButtonType=" + this.socialButtonType + ')';
    }

    public final String u() {
        return this.photo400;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.id, i);
        Long l = this.friendsGenerationId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Integer num = this.friendsRecommendationSource;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeParcelable(this.mutual, i);
        parcel.writeParcelable(this.sex, i);
        parcel.writeString(this.photo100);
        parcel.writeString(this.photo200);
        parcel.writeString(this.photo400Orig);
        parcel.writeString(this.photo400);
        parcel.writeString(this.photoBase);
        Integer num2 = this.commonCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.description);
        List<FriendsRecDescriptionGenericDto> list = this.descriptions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.friendStatus, i);
        parcel.writeParcelable(this.verified, i);
        parcel.writeParcelable(this.trending, i);
        parcel.writeParcelable(this.canWritePrivateMessage, i);
        parcel.writeString(this.trackCode);
        parcel.writeParcelable(this.cropPhoto, i);
        FriendsRecBlockButtonDto friendsRecBlockButtonDto = this.button;
        if (friendsRecBlockButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            friendsRecBlockButtonDto.writeToParcel(parcel, i);
        }
        SocialButtonTypeDto socialButtonTypeDto = this.socialButtonType;
        if (socialButtonTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            socialButtonTypeDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ FriendsRecProfileDto(UserId userId, Long l, Integer num, String str, String str2, FriendsRequestsMutualDto friendsRequestsMutualDto, BaseSexDto baseSexDto, String str3, String str4, String str5, String str6, String str7, Integer num2, String str8, List list, FriendsFriendStatusStatusDto friendsFriendStatusStatusDto, BaseBoolIntDto baseBoolIntDto, BaseBoolIntDto baseBoolIntDto2, BaseBoolIntDto baseBoolIntDto3, String str9, BaseCropPhotoDto baseCropPhotoDto, FriendsRecBlockButtonDto friendsRecBlockButtonDto, SocialButtonTypeDto socialButtonTypeDto, int i, zcl zclVar) {
        this(userId, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : friendsRequestsMutualDto, (i & 64) != 0 ? null : baseSexDto, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? null : str6, (i & 2048) != 0 ? null : str7, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : str8, (i & 16384) != 0 ? null : list, (i & 32768) != 0 ? null : friendsFriendStatusStatusDto, (i & 65536) != 0 ? null : baseBoolIntDto, (i & 131072) != 0 ? null : baseBoolIntDto2, (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : baseBoolIntDto3, (i & 524288) != 0 ? null : str9, (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : baseCropPhotoDto, (i & 2097152) != 0 ? null : friendsRecBlockButtonDto, (i & 4194304) != 0 ? null : socialButtonTypeDto);
    }
}
