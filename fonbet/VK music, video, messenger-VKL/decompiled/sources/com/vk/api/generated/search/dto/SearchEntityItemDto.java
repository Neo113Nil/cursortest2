package com.vk.api.generated.search.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.vk.dto.common.id.UserId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: SearchEntityItemDto.kt */
/* loaded from: classes15.dex */
public abstract class SearchEntityItemDto implements Parcelable {

    /* compiled from: SearchEntityItemDto.kt */
    public static final class Deserializer implements a9y<SearchEntityItemDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, "vk_person")) {
                return (SearchEntityItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SearchEntityItemVkPersonDto.class);
            }
            if (epx.f(f, "video_playlist")) {
                return (SearchEntityItemDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, SearchEntityItemVideoPlaylistDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: SearchEntityItemDto.kt */
    public static final class SearchEntityItemVideoPlaylistDto extends SearchEntityItemDto implements Parcelable {
        public static final Parcelable.Creator<SearchEntityItemVideoPlaylistDto> CREATOR = new a();

        @pmi0("followers_total_count")
        private final int followersTotalCount;

        @pmi0("followers_total_count_text")
        private final String followersTotalCountText;

        @pmi0("id")
        private final int id;

        @pmi0("is_subscribed")
        private final IsSubscribedDto isSubscribed;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("photo_100")
        private final String photo100;

        @pmi0("photo_200")
        private final String photo200;

        @pmi0("photo_50")
        private final String photo50;

        @pmi0("playlist_id")
        private final int playlistId;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("videos_total_count")
        private final int videosTotalCount;

        @pmi0("videos_total_count_text")
        private final String videosTotalCountText;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SearchEntityItemDto.kt */
        public static final class IsSubscribedDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ IsSubscribedDto[] $VALUES;
            public static final Parcelable.Creator<IsSubscribedDto> CREATOR;

            @pmi0("0")
            public static final IsSubscribedDto NO;

            @pmi0("1")
            public static final IsSubscribedDto YES;
            private final int value;

            /* compiled from: SearchEntityItemDto.kt */
            public static final class a implements Parcelable.Creator<IsSubscribedDto> {
                @Override // android.os.Parcelable.Creator
                public final IsSubscribedDto createFromParcel(Parcel parcel) {
                    return IsSubscribedDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final IsSubscribedDto[] newArray(int i) {
                    return new IsSubscribedDto[i];
                }
            }

            static {
                IsSubscribedDto isSubscribedDto = new IsSubscribedDto("NO", 0, 0);
                NO = isSubscribedDto;
                IsSubscribedDto isSubscribedDto2 = new IsSubscribedDto("YES", 1, 1);
                YES = isSubscribedDto2;
                IsSubscribedDto[] isSubscribedDtoArr = {isSubscribedDto, isSubscribedDto2};
                $VALUES = isSubscribedDtoArr;
                $ENTRIES = new asp(isSubscribedDtoArr);
                CREATOR = new a();
            }

            private IsSubscribedDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static IsSubscribedDto valueOf(String str) {
                return (IsSubscribedDto) Enum.valueOf(IsSubscribedDto.class, str);
            }

            public static IsSubscribedDto[] values() {
                return (IsSubscribedDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SearchEntityItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("video_playlist")
            public static final TypeDto VIDEO_PLAYLIST;
            private final String value;

            /* compiled from: SearchEntityItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("VIDEO_PLAYLIST", 0, "video_playlist");
                VIDEO_PLAYLIST = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* compiled from: SearchEntityItemDto.kt */
        public static final class a implements Parcelable.Creator<SearchEntityItemVideoPlaylistDto> {
            @Override // android.os.Parcelable.Creator
            public final SearchEntityItemVideoPlaylistDto createFromParcel(Parcel parcel) {
                return new SearchEntityItemVideoPlaylistDto(TypeDto.CREATOR.createFromParcel(parcel), (UserId) parcel.readParcelable(SearchEntityItemVideoPlaylistDto.class.getClassLoader()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), IsSubscribedDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SearchEntityItemVideoPlaylistDto[] newArray(int i) {
                return new SearchEntityItemVideoPlaylistDto[i];
            }
        }

        public /* synthetic */ SearchEntityItemVideoPlaylistDto(TypeDto typeDto, UserId userId, int i, int i2, String str, int i3, String str2, IsSubscribedDto isSubscribedDto, int i4, String str3, String str4, String str5, String str6, String str7, String str8, int i5, zcl zclVar) {
            this(typeDto, userId, i, i2, str, i3, str2, isSubscribedDto, i4, str3, (i5 & 1024) != 0 ? null : str4, (i5 & 2048) != 0 ? null : str5, (i5 & 4096) != 0 ? null : str6, (i5 & 8192) != 0 ? null : str7, (i5 & 16384) != 0 ? null : str8);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchEntityItemVideoPlaylistDto)) {
                return false;
            }
            SearchEntityItemVideoPlaylistDto searchEntityItemVideoPlaylistDto = (SearchEntityItemVideoPlaylistDto) obj;
            return this.type == searchEntityItemVideoPlaylistDto.type && epx.f(this.ownerId, searchEntityItemVideoPlaylistDto.ownerId) && this.playlistId == searchEntityItemVideoPlaylistDto.playlistId && this.followersTotalCount == searchEntityItemVideoPlaylistDto.followersTotalCount && epx.f(this.followersTotalCountText, searchEntityItemVideoPlaylistDto.followersTotalCountText) && this.videosTotalCount == searchEntityItemVideoPlaylistDto.videosTotalCount && epx.f(this.videosTotalCountText, searchEntityItemVideoPlaylistDto.videosTotalCountText) && this.isSubscribed == searchEntityItemVideoPlaylistDto.isSubscribed && this.id == searchEntityItemVideoPlaylistDto.id && epx.f(this.title, searchEntityItemVideoPlaylistDto.title) && epx.f(this.subtitle, searchEntityItemVideoPlaylistDto.subtitle) && epx.f(this.photo50, searchEntityItemVideoPlaylistDto.photo50) && epx.f(this.photo100, searchEntityItemVideoPlaylistDto.photo100) && epx.f(this.photo200, searchEntityItemVideoPlaylistDto.photo200) && epx.f(this.trackCode, searchEntityItemVideoPlaylistDto.trackCode);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.id, (this.isSubscribed.hashCode() + urd0.a(shy.a(this.videosTotalCount, urd0.a(shy.a(this.followersTotalCount, shy.a(this.playlistId, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31), 31, this.followersTotalCountText), 31), 31, this.videosTotalCountText)) * 31, 31), 31, this.title);
            String str = this.subtitle;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.photo50;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.photo100;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.photo200;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.trackCode;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchEntityItemVideoPlaylistDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", playlistId=");
            sb.append(this.playlistId);
            sb.append(", followersTotalCount=");
            sb.append(this.followersTotalCount);
            sb.append(", followersTotalCountText=");
            sb.append(this.followersTotalCountText);
            sb.append(", videosTotalCount=");
            sb.append(this.videosTotalCount);
            sb.append(", videosTotalCountText=");
            sb.append(this.videosTotalCountText);
            sb.append(", isSubscribed=");
            sb.append(this.isSubscribed);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", photo50=");
            sb.append(this.photo50);
            sb.append(", photo100=");
            sb.append(this.photo100);
            sb.append(", photo200=");
            sb.append(this.photo200);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.playlistId);
            parcel.writeInt(this.followersTotalCount);
            parcel.writeString(this.followersTotalCountText);
            parcel.writeInt(this.videosTotalCount);
            parcel.writeString(this.videosTotalCountText);
            this.isSubscribed.writeToParcel(parcel, i);
            parcel.writeInt(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.photo50);
            parcel.writeString(this.photo100);
            parcel.writeString(this.photo200);
            parcel.writeString(this.trackCode);
        }

        public SearchEntityItemVideoPlaylistDto(TypeDto typeDto, UserId userId, int i, int i2, String str, int i3, String str2, IsSubscribedDto isSubscribedDto, int i4, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.playlistId = i;
            this.followersTotalCount = i2;
            this.followersTotalCountText = str;
            this.videosTotalCount = i3;
            this.videosTotalCountText = str2;
            this.isSubscribed = isSubscribedDto;
            this.id = i4;
            this.title = str3;
            this.subtitle = str4;
            this.photo50 = str5;
            this.photo100 = str6;
            this.photo200 = str7;
            this.trackCode = str8;
        }
    }

    /* compiled from: SearchEntityItemDto.kt */
    public static final class SearchEntityItemVkPersonDto extends SearchEntityItemDto implements Parcelable {
        public static final Parcelable.Creator<SearchEntityItemVkPersonDto> CREATOR = new a();

        @pmi0("follower_status")
        private final int followerStatus;

        @pmi0("followers_friends_count")
        private final int followersFriendsCount;

        @pmi0("followers_friends_count_text")
        private final String followersFriendsCountText;

        @pmi0("followers_friends_ids")
        private final List<UserId> followersFriendsIds;

        @pmi0("followers_total_count")
        private final int followersTotalCount;

        @pmi0("followers_total_count_text")
        private final String followersTotalCountText;

        @pmi0("id")
        private final int id;

        @pmi0("owner_id")
        private final UserId ownerId;

        @pmi0("photo_100")
        private final String photo100;

        @pmi0("photo_200")
        private final String photo200;

        @pmi0("photo_50")
        private final String photo50;

        @pmi0("subtitle")
        private final String subtitle;

        @pmi0("title")
        private final String title;

        @pmi0("track_code")
        private final String trackCode;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("verified")
        private final VerifiedDto verified;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SearchEntityItemDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("vk_person")
            public static final TypeDto VK_PERSON;
            private final String value;

            /* compiled from: SearchEntityItemDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("VK_PERSON", 0, "vk_person");
                VK_PERSON = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
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

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: SearchEntityItemDto.kt */
        public static final class VerifiedDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ VerifiedDto[] $VALUES;
            public static final Parcelable.Creator<VerifiedDto> CREATOR;

            @pmi0("0")
            public static final VerifiedDto NO;

            @pmi0("1")
            public static final VerifiedDto YES;
            private final int value;

            /* compiled from: SearchEntityItemDto.kt */
            public static final class a implements Parcelable.Creator<VerifiedDto> {
                @Override // android.os.Parcelable.Creator
                public final VerifiedDto createFromParcel(Parcel parcel) {
                    return VerifiedDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final VerifiedDto[] newArray(int i) {
                    return new VerifiedDto[i];
                }
            }

            static {
                VerifiedDto verifiedDto = new VerifiedDto("NO", 0, 0);
                NO = verifiedDto;
                VerifiedDto verifiedDto2 = new VerifiedDto("YES", 1, 1);
                YES = verifiedDto2;
                VerifiedDto[] verifiedDtoArr = {verifiedDto, verifiedDto2};
                $VALUES = verifiedDtoArr;
                $ENTRIES = new asp(verifiedDtoArr);
                CREATOR = new a();
            }

            private VerifiedDto(String str, int i, int i2) {
                this.value = i2;
            }

            public static VerifiedDto valueOf(String str) {
                return (VerifiedDto) Enum.valueOf(VerifiedDto.class, str);
            }

            public static VerifiedDto[] values() {
                return (VerifiedDto[]) $VALUES.clone();
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

        /* compiled from: SearchEntityItemDto.kt */
        public static final class a implements Parcelable.Creator<SearchEntityItemVkPersonDto> {
            @Override // android.os.Parcelable.Creator
            public final SearchEntityItemVkPersonDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                UserId userId = (UserId) parcel.readParcelable(SearchEntityItemVkPersonDto.class.getClassLoader());
                int readInt = parcel.readInt();
                String readString = parcel.readString();
                int readInt2 = parcel.readInt();
                String readString2 = parcel.readString();
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = bo.b(SearchEntityItemVkPersonDto.class, parcel, arrayList, i, 1);
                }
                return new SearchEntityItemVkPersonDto(createFromParcel, userId, readInt, readString, readInt2, readString2, arrayList, parcel.readInt(), VerifiedDto.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SearchEntityItemVkPersonDto[] newArray(int i) {
                return new SearchEntityItemVkPersonDto[i];
            }
        }

        public /* synthetic */ SearchEntityItemVkPersonDto(TypeDto typeDto, UserId userId, int i, String str, int i2, String str2, List list, int i3, VerifiedDto verifiedDto, int i4, String str3, String str4, String str5, String str6, String str7, String str8, int i5, zcl zclVar) {
            this(typeDto, userId, i, str, i2, str2, list, i3, verifiedDto, i4, str3, (i5 & 2048) != 0 ? null : str4, (i5 & 4096) != 0 ? null : str5, (i5 & 8192) != 0 ? null : str6, (i5 & 16384) != 0 ? null : str7, (i5 & 32768) != 0 ? null : str8);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchEntityItemVkPersonDto)) {
                return false;
            }
            SearchEntityItemVkPersonDto searchEntityItemVkPersonDto = (SearchEntityItemVkPersonDto) obj;
            return this.type == searchEntityItemVkPersonDto.type && epx.f(this.ownerId, searchEntityItemVkPersonDto.ownerId) && this.followersTotalCount == searchEntityItemVkPersonDto.followersTotalCount && epx.f(this.followersTotalCountText, searchEntityItemVkPersonDto.followersTotalCountText) && this.followersFriendsCount == searchEntityItemVkPersonDto.followersFriendsCount && epx.f(this.followersFriendsCountText, searchEntityItemVkPersonDto.followersFriendsCountText) && epx.f(this.followersFriendsIds, searchEntityItemVkPersonDto.followersFriendsIds) && this.followerStatus == searchEntityItemVkPersonDto.followerStatus && this.verified == searchEntityItemVkPersonDto.verified && this.id == searchEntityItemVkPersonDto.id && epx.f(this.title, searchEntityItemVkPersonDto.title) && epx.f(this.subtitle, searchEntityItemVkPersonDto.subtitle) && epx.f(this.photo50, searchEntityItemVkPersonDto.photo50) && epx.f(this.photo100, searchEntityItemVkPersonDto.photo100) && epx.f(this.photo200, searchEntityItemVkPersonDto.photo200) && epx.f(this.trackCode, searchEntityItemVkPersonDto.trackCode);
        }

        public final int hashCode() {
            int a2 = urd0.a(shy.a(this.id, (this.verified.hashCode() + shy.a(this.followerStatus, fw3.a(urd0.a(shy.a(this.followersFriendsCount, urd0.a(shy.a(this.followersTotalCount, bh10.a(this.type.hashCode() * 31, 31, this.ownerId.b), 31), 31, this.followersTotalCountText), 31), 31, this.followersFriendsCountText), 31, this.followersFriendsIds), 31)) * 31, 31), 31, this.title);
            String str = this.subtitle;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.photo50;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.photo100;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.photo200;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.trackCode;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchEntityItemVkPersonDto(type=");
            sb.append(this.type);
            sb.append(", ownerId=");
            sb.append(this.ownerId);
            sb.append(", followersTotalCount=");
            sb.append(this.followersTotalCount);
            sb.append(", followersTotalCountText=");
            sb.append(this.followersTotalCountText);
            sb.append(", followersFriendsCount=");
            sb.append(this.followersFriendsCount);
            sb.append(", followersFriendsCountText=");
            sb.append(this.followersFriendsCountText);
            sb.append(", followersFriendsIds=");
            sb.append(this.followersFriendsIds);
            sb.append(", followerStatus=");
            sb.append(this.followerStatus);
            sb.append(", verified=");
            sb.append(this.verified);
            sb.append(", id=");
            sb.append(this.id);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", subtitle=");
            sb.append(this.subtitle);
            sb.append(", photo50=");
            sb.append(this.photo50);
            sb.append(", photo100=");
            sb.append(this.photo100);
            sb.append(", photo200=");
            sb.append(this.photo200);
            sb.append(", trackCode=");
            return ho8.a(sb, this.trackCode, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            parcel.writeParcelable(this.ownerId, i);
            parcel.writeInt(this.followersTotalCount);
            parcel.writeString(this.followersTotalCountText);
            parcel.writeInt(this.followersFriendsCount);
            parcel.writeString(this.followersFriendsCountText);
            Iterator a2 = ao.a(parcel, this.followersFriendsIds);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeInt(this.followerStatus);
            this.verified.writeToParcel(parcel, i);
            parcel.writeInt(this.id);
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
            parcel.writeString(this.photo50);
            parcel.writeString(this.photo100);
            parcel.writeString(this.photo200);
            parcel.writeString(this.trackCode);
        }

        public SearchEntityItemVkPersonDto(TypeDto typeDto, UserId userId, int i, String str, int i2, String str2, List<UserId> list, int i3, VerifiedDto verifiedDto, int i4, String str3, String str4, String str5, String str6, String str7, String str8) {
            super(null);
            this.type = typeDto;
            this.ownerId = userId;
            this.followersTotalCount = i;
            this.followersTotalCountText = str;
            this.followersFriendsCount = i2;
            this.followersFriendsCountText = str2;
            this.followersFriendsIds = list;
            this.followerStatus = i3;
            this.verified = verifiedDto;
            this.id = i4;
            this.title = str3;
            this.subtitle = str4;
            this.photo50 = str5;
            this.photo100 = str6;
            this.photo200 = str7;
            this.trackCode = str8;
        }
    }

    public /* synthetic */ SearchEntityItemDto(zcl zclVar) {
        this();
    }

    private SearchEntityItemDto() {
    }
}
