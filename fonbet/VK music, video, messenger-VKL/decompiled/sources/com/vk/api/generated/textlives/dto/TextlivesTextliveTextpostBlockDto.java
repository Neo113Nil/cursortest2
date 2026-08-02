package com.vk.api.generated.textlives.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.dto.common.id.UserId;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.asp;
import xsna.eok;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TextlivesTextliveTextpostBlockDto.kt */
/* loaded from: classes15.dex */
public final class TextlivesTextliveTextpostBlockDto implements Parcelable {
    public static final Parcelable.Creator<TextlivesTextliveTextpostBlockDto> CREATOR = new a();

    @pmi0("attach_url")
    private final String attachUrl;

    @pmi0("cover_photo")
    private final PhotosPhotoDto coverPhoto;

    @pmi0("date")
    private final Integer date;

    @pmi0("end_date")
    private final Integer endDate;

    @pmi0("is_live")
    private final IsLiveDto isLive;

    @pmi0(eok.ONLINE_EXTRAS_KEY)
    private final int online;

    @pmi0("text")
    private final String text;

    @pmi0("textlive_id")
    private final int textliveId;

    @pmi0("textlive_owner_id")
    private final UserId textliveOwnerId;

    @pmi0("textpost_attachment")
    private final TextlivesTextpostAttachmentDto textpostAttachment;

    @pmi0("textpost_author_id")
    private final UserId textpostAuthorId;

    @pmi0("textpost_date")
    private final Integer textpostDate;

    @pmi0("textpost_is_important")
    private final Boolean textpostIsImportant;

    @pmi0("textposts_count")
    private final Integer textpostsCount;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final TypeDto type;

    @pmi0("unread")
    private final Integer unread;

    @pmi0("url")
    private final String url;

    @pmi0("views_count")
    private final Integer viewsCount;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextlivesTextliveTextpostBlockDto.kt */
    public static final class IsLiveDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IsLiveDto[] $VALUES;
        public static final Parcelable.Creator<IsLiveDto> CREATOR;

        @pmi0("0")
        public static final IsLiveDto OFFLINE;

        @pmi0("1")
        public static final IsLiveDto ONGOING;
        private final int value;

        /* compiled from: TextlivesTextliveTextpostBlockDto.kt */
        public static final class a implements Parcelable.Creator<IsLiveDto> {
            @Override // android.os.Parcelable.Creator
            public final IsLiveDto createFromParcel(Parcel parcel) {
                return IsLiveDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IsLiveDto[] newArray(int i) {
                return new IsLiveDto[i];
            }
        }

        static {
            IsLiveDto isLiveDto = new IsLiveDto("OFFLINE", 0, 0);
            OFFLINE = isLiveDto;
            IsLiveDto isLiveDto2 = new IsLiveDto("ONGOING", 1, 1);
            ONGOING = isLiveDto2;
            IsLiveDto[] isLiveDtoArr = {isLiveDto, isLiveDto2};
            $VALUES = isLiveDtoArr;
            $ENTRIES = new asp(isLiveDtoArr);
            CREATOR = new a();
        }

        private IsLiveDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static IsLiveDto valueOf(String str) {
            return (IsLiveDto) Enum.valueOf(IsLiveDto.class, str);
        }

        public static IsLiveDto[] values() {
            return (IsLiveDto[]) $VALUES.clone();
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
    /* compiled from: TextlivesTextliveTextpostBlockDto.kt */
    public static final class TypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ TypeDto[] $VALUES;
        public static final Parcelable.Creator<TypeDto> CREATOR;

        @pmi0("textlive")
        public static final TypeDto TEXTLIVE;

        @pmi0("textlive_feed_block")
        public static final TypeDto TEXTLIVE_FEED_BLOCK;

        @pmi0("textpost")
        public static final TypeDto TEXTPOST;

        @pmi0("textpost_publish")
        public static final TypeDto TEXTPOST_PUBLISH;
        private final String value;

        /* compiled from: TextlivesTextliveTextpostBlockDto.kt */
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
            TypeDto typeDto = new TypeDto("TEXTLIVE", 0, "textlive");
            TEXTLIVE = typeDto;
            TypeDto typeDto2 = new TypeDto("TEXTPOST", 1, "textpost");
            TEXTPOST = typeDto2;
            TypeDto typeDto3 = new TypeDto("TEXTPOST_PUBLISH", 2, "textpost_publish");
            TEXTPOST_PUBLISH = typeDto3;
            TypeDto typeDto4 = new TypeDto("TEXTLIVE_FEED_BLOCK", 3, "textlive_feed_block");
            TEXTLIVE_FEED_BLOCK = typeDto4;
            TypeDto[] typeDtoArr = {typeDto, typeDto2, typeDto3, typeDto4};
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

    /* compiled from: TextlivesTextliveTextpostBlockDto.kt */
    public static final class a implements Parcelable.Creator<TextlivesTextliveTextpostBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final TextlivesTextliveTextpostBlockDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            Integer valueOf2;
            Integer num;
            Integer num2;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            IsLiveDto createFromParcel = IsLiveDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            TypeDto createFromParcel2 = parcel.readInt() == 0 ? null : TypeDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            PhotosPhotoDto photosPhotoDto = (PhotosPhotoDto) parcel.readParcelable(TextlivesTextliveTextpostBlockDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            UserId userId = (UserId) parcel.readParcelable(TextlivesTextliveTextpostBlockDto.class.getClassLoader());
            UserId userId2 = (UserId) parcel.readParcelable(TextlivesTextliveTextpostBlockDto.class.getClassLoader());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString3 = parcel.readString();
            TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto = (TextlivesTextpostAttachmentDto) parcel.readParcelable(TextlivesTextliveTextpostBlockDto.class.getClassLoader());
            Integer num3 = valueOf3;
            Boolean bool = valueOf;
            Integer num4 = valueOf4;
            String readString4 = parcel.readString();
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                num = valueOf6;
                num2 = valueOf7;
                valueOf2 = null;
            } else {
                Integer num5 = valueOf7;
                valueOf2 = Integer.valueOf(parcel.readInt());
                num = valueOf6;
                num2 = num5;
            }
            return new TextlivesTextliveTextpostBlockDto(readInt, readString, createFromParcel, readInt2, createFromParcel2, readString2, num3, photosPhotoDto, bool, userId, userId2, num4, readString3, textlivesTextpostAttachmentDto, readString4, valueOf5, num, num2, valueOf2);
        }

        @Override // android.os.Parcelable.Creator
        public final TextlivesTextliveTextpostBlockDto[] newArray(int i) {
            return new TextlivesTextliveTextpostBlockDto[i];
        }
    }

    public TextlivesTextliveTextpostBlockDto(int i, String str, IsLiveDto isLiveDto, int i2, TypeDto typeDto, String str2, Integer num, PhotosPhotoDto photosPhotoDto, Boolean bool, UserId userId, UserId userId2, Integer num2, String str3, TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto, String str4, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.online = i;
        this.url = str;
        this.isLive = isLiveDto;
        this.textliveId = i2;
        this.type = typeDto;
        this.title = str2;
        this.unread = num;
        this.coverPhoto = photosPhotoDto;
        this.textpostIsImportant = bool;
        this.textliveOwnerId = userId;
        this.textpostAuthorId = userId2;
        this.textpostDate = num2;
        this.text = str3;
        this.textpostAttachment = textlivesTextpostAttachmentDto;
        this.attachUrl = str4;
        this.endDate = num3;
        this.viewsCount = num4;
        this.textpostsCount = num5;
        this.date = num6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextlivesTextliveTextpostBlockDto)) {
            return false;
        }
        TextlivesTextliveTextpostBlockDto textlivesTextliveTextpostBlockDto = (TextlivesTextliveTextpostBlockDto) obj;
        return this.online == textlivesTextliveTextpostBlockDto.online && epx.f(this.url, textlivesTextliveTextpostBlockDto.url) && this.isLive == textlivesTextliveTextpostBlockDto.isLive && this.textliveId == textlivesTextliveTextpostBlockDto.textliveId && this.type == textlivesTextliveTextpostBlockDto.type && epx.f(this.title, textlivesTextliveTextpostBlockDto.title) && epx.f(this.unread, textlivesTextliveTextpostBlockDto.unread) && epx.f(this.coverPhoto, textlivesTextliveTextpostBlockDto.coverPhoto) && epx.f(this.textpostIsImportant, textlivesTextliveTextpostBlockDto.textpostIsImportant) && epx.f(this.textliveOwnerId, textlivesTextliveTextpostBlockDto.textliveOwnerId) && epx.f(this.textpostAuthorId, textlivesTextliveTextpostBlockDto.textpostAuthorId) && epx.f(this.textpostDate, textlivesTextliveTextpostBlockDto.textpostDate) && epx.f(this.text, textlivesTextliveTextpostBlockDto.text) && epx.f(this.textpostAttachment, textlivesTextliveTextpostBlockDto.textpostAttachment) && epx.f(this.attachUrl, textlivesTextliveTextpostBlockDto.attachUrl) && epx.f(this.endDate, textlivesTextliveTextpostBlockDto.endDate) && epx.f(this.viewsCount, textlivesTextliveTextpostBlockDto.viewsCount) && epx.f(this.textpostsCount, textlivesTextliveTextpostBlockDto.textpostsCount) && epx.f(this.date, textlivesTextliveTextpostBlockDto.date);
    }

    public final int hashCode() {
        int a2 = shy.a(this.textliveId, (this.isLive.hashCode() + urd0.a(Integer.hashCode(this.online) * 31, 31, this.url)) * 31, 31);
        TypeDto typeDto = this.type;
        int hashCode = (a2 + (typeDto == null ? 0 : typeDto.hashCode())) * 31;
        String str = this.title;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.unread;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        PhotosPhotoDto photosPhotoDto = this.coverPhoto;
        int hashCode4 = (hashCode3 + (photosPhotoDto == null ? 0 : photosPhotoDto.hashCode())) * 31;
        Boolean bool = this.textpostIsImportant;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        UserId userId = this.textliveOwnerId;
        int hashCode6 = (hashCode5 + (userId == null ? 0 : Long.hashCode(userId.b))) * 31;
        UserId userId2 = this.textpostAuthorId;
        int hashCode7 = (hashCode6 + (userId2 == null ? 0 : Long.hashCode(userId2.b))) * 31;
        Integer num2 = this.textpostDate;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.text;
        int hashCode9 = (hashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto = this.textpostAttachment;
        int hashCode10 = (hashCode9 + (textlivesTextpostAttachmentDto == null ? 0 : textlivesTextpostAttachmentDto.hashCode())) * 31;
        String str3 = this.attachUrl;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.endDate;
        int hashCode12 = (hashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.viewsCount;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.textpostsCount;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.date;
        return hashCode14 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextlivesTextliveTextpostBlockDto(online=");
        sb.append(this.online);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", isLive=");
        sb.append(this.isLive);
        sb.append(", textliveId=");
        sb.append(this.textliveId);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", unread=");
        sb.append(this.unread);
        sb.append(", coverPhoto=");
        sb.append(this.coverPhoto);
        sb.append(", textpostIsImportant=");
        sb.append(this.textpostIsImportant);
        sb.append(", textliveOwnerId=");
        sb.append(this.textliveOwnerId);
        sb.append(", textpostAuthorId=");
        sb.append(this.textpostAuthorId);
        sb.append(", textpostDate=");
        sb.append(this.textpostDate);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", textpostAttachment=");
        sb.append(this.textpostAttachment);
        sb.append(", attachUrl=");
        sb.append(this.attachUrl);
        sb.append(", endDate=");
        sb.append(this.endDate);
        sb.append(", viewsCount=");
        sb.append(this.viewsCount);
        sb.append(", textpostsCount=");
        sb.append(this.textpostsCount);
        sb.append(", date=");
        return uqi.b(sb, this.date, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.online);
        parcel.writeString(this.url);
        this.isLive.writeToParcel(parcel, i);
        parcel.writeInt(this.textliveId);
        TypeDto typeDto = this.type;
        if (typeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            typeDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        Integer num = this.unread;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeParcelable(this.coverPhoto, i);
        Boolean bool = this.textpostIsImportant;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        parcel.writeParcelable(this.textliveOwnerId, i);
        parcel.writeParcelable(this.textpostAuthorId, i);
        Integer num2 = this.textpostDate;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.text);
        parcel.writeParcelable(this.textpostAttachment, i);
        parcel.writeString(this.attachUrl);
        Integer num3 = this.endDate;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.viewsCount;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.textpostsCount;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.date;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
    }

    public /* synthetic */ TextlivesTextliveTextpostBlockDto(int i, String str, IsLiveDto isLiveDto, int i2, TypeDto typeDto, String str2, Integer num, PhotosPhotoDto photosPhotoDto, Boolean bool, UserId userId, UserId userId2, Integer num2, String str3, TextlivesTextpostAttachmentDto textlivesTextpostAttachmentDto, String str4, Integer num3, Integer num4, Integer num5, Integer num6, int i3, zcl zclVar) {
        this(i, str, isLiveDto, i2, (i3 & 16) != 0 ? null : typeDto, (i3 & 32) != 0 ? null : str2, (i3 & 64) != 0 ? null : num, (i3 & 128) != 0 ? null : photosPhotoDto, (i3 & 256) != 0 ? null : bool, (i3 & 512) != 0 ? null : userId, (i3 & 1024) != 0 ? null : userId2, (i3 & 2048) != 0 ? null : num2, (i3 & 4096) != 0 ? null : str3, (i3 & 8192) != 0 ? null : textlivesTextpostAttachmentDto, (i3 & 16384) != 0 ? null : str4, (32768 & i3) != 0 ? null : num3, (65536 & i3) != 0 ? null : num4, (131072 & i3) != 0 ? null : num5, (i3 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : num6);
    }
}
