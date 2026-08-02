package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ShortVideoShortVideoActionButtonDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoShortVideoActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoShortVideoActionButtonDto> CREATOR = new a();

    @pmi0("moderation_status")
    private final ModerationStatusDto moderationStatus;

    @pmi0("object_id")
    private final String objectId;

    @pmi0("object_title")
    private final String objectTitle;

    @pmi0("styles")
    private final ShortVideoShortVideoActionButtonStylesDto styles;

    @pmi0("title")
    private final String title;

    @pmi0("type")
    private final String type;

    @pmi0("type_name")
    private final String typeName;

    @pmi0("url")
    private final String url;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShortVideoShortVideoActionButtonDto.kt */
    public static final class ModerationStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ModerationStatusDto[] $VALUES;

        @pmi0("approved")
        public static final ModerationStatusDto APPROVED;
        public static final Parcelable.Creator<ModerationStatusDto> CREATOR;

        @pmi0("pending")
        public static final ModerationStatusDto PENDING;

        @pmi0("rejected")
        public static final ModerationStatusDto REJECTED;
        private final String value;

        /* compiled from: ShortVideoShortVideoActionButtonDto.kt */
        public static final class a implements Parcelable.Creator<ModerationStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final ModerationStatusDto createFromParcel(Parcel parcel) {
                return ModerationStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ModerationStatusDto[] newArray(int i) {
                return new ModerationStatusDto[i];
            }
        }

        static {
            ModerationStatusDto moderationStatusDto = new ModerationStatusDto("PENDING", 0, "pending");
            PENDING = moderationStatusDto;
            ModerationStatusDto moderationStatusDto2 = new ModerationStatusDto("REJECTED", 1, "rejected");
            REJECTED = moderationStatusDto2;
            ModerationStatusDto moderationStatusDto3 = new ModerationStatusDto("APPROVED", 2, "approved");
            APPROVED = moderationStatusDto3;
            ModerationStatusDto[] moderationStatusDtoArr = {moderationStatusDto, moderationStatusDto2, moderationStatusDto3};
            $VALUES = moderationStatusDtoArr;
            $ENTRIES = new asp(moderationStatusDtoArr);
            CREATOR = new a();
        }

        private ModerationStatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ModerationStatusDto valueOf(String str) {
            return (ModerationStatusDto) Enum.valueOf(ModerationStatusDto.class, str);
        }

        public static ModerationStatusDto[] values() {
            return (ModerationStatusDto[]) $VALUES.clone();
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

    /* compiled from: ShortVideoShortVideoActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoShortVideoActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoActionButtonDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            ShortVideoShortVideoActionButtonStylesDto createFromParcel = parcel.readInt() == 0 ? null : ShortVideoShortVideoActionButtonStylesDto.CREATOR.createFromParcel(parcel);
            ModerationStatusDto moderationStatusDto = null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                moderationStatusDto = ModerationStatusDto.CREATOR.createFromParcel(parcel);
            }
            return new ShortVideoShortVideoActionButtonDto(readString, readString2, readString3, readString4, createFromParcel, readString5, moderationStatusDto, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoShortVideoActionButtonDto[] newArray(int i) {
            return new ShortVideoShortVideoActionButtonDto[i];
        }
    }

    public ShortVideoShortVideoActionButtonDto(String str, String str2, String str3, String str4, ShortVideoShortVideoActionButtonStylesDto shortVideoShortVideoActionButtonStylesDto, String str5, ModerationStatusDto moderationStatusDto, String str6) {
        this.title = str;
        this.type = str2;
        this.url = str3;
        this.typeName = str4;
        this.styles = shortVideoShortVideoActionButtonStylesDto;
        this.objectId = str5;
        this.moderationStatus = moderationStatusDto;
        this.objectTitle = str6;
    }

    public final ModerationStatusDto d() {
        return this.moderationStatus;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.objectId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoShortVideoActionButtonDto)) {
            return false;
        }
        ShortVideoShortVideoActionButtonDto shortVideoShortVideoActionButtonDto = (ShortVideoShortVideoActionButtonDto) obj;
        return epx.f(this.title, shortVideoShortVideoActionButtonDto.title) && epx.f(this.type, shortVideoShortVideoActionButtonDto.type) && epx.f(this.url, shortVideoShortVideoActionButtonDto.url) && epx.f(this.typeName, shortVideoShortVideoActionButtonDto.typeName) && epx.f(this.styles, shortVideoShortVideoActionButtonDto.styles) && epx.f(this.objectId, shortVideoShortVideoActionButtonDto.objectId) && this.moderationStatus == shortVideoShortVideoActionButtonDto.moderationStatus && epx.f(this.objectTitle, shortVideoShortVideoActionButtonDto.objectTitle);
    }

    public final String f() {
        return this.objectTitle;
    }

    public final ShortVideoShortVideoActionButtonStylesDto g() {
        return this.styles;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int a2 = urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.type), 31, this.url);
        String str = this.typeName;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        ShortVideoShortVideoActionButtonStylesDto shortVideoShortVideoActionButtonStylesDto = this.styles;
        int hashCode2 = (hashCode + (shortVideoShortVideoActionButtonStylesDto == null ? 0 : shortVideoShortVideoActionButtonStylesDto.hashCode())) * 31;
        String str2 = this.objectId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ModerationStatusDto moderationStatusDto = this.moderationStatus;
        int hashCode4 = (hashCode3 + (moderationStatusDto == null ? 0 : moderationStatusDto.hashCode())) * 31;
        String str3 = this.objectTitle;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.typeName;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoShortVideoActionButtonDto(title=");
        sb.append(this.title);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", typeName=");
        sb.append(this.typeName);
        sb.append(", styles=");
        sb.append(this.styles);
        sb.append(", objectId=");
        sb.append(this.objectId);
        sb.append(", moderationStatus=");
        sb.append(this.moderationStatus);
        sb.append(", objectTitle=");
        return ho8.a(sb, this.objectTitle, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
        parcel.writeString(this.typeName);
        ShortVideoShortVideoActionButtonStylesDto shortVideoShortVideoActionButtonStylesDto = this.styles;
        if (shortVideoShortVideoActionButtonStylesDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            shortVideoShortVideoActionButtonStylesDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.objectId);
        ModerationStatusDto moderationStatusDto = this.moderationStatus;
        if (moderationStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moderationStatusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.objectTitle);
    }

    public /* synthetic */ ShortVideoShortVideoActionButtonDto(String str, String str2, String str3, String str4, ShortVideoShortVideoActionButtonStylesDto shortVideoShortVideoActionButtonStylesDto, String str5, ModerationStatusDto moderationStatusDto, String str6, int i, zcl zclVar) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : shortVideoShortVideoActionButtonStylesDto, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : moderationStatusDto, (i & 128) != 0 ? null : str6);
    }
}
