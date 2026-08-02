package com.vk.api.generated.badges.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: BadgesBadgeDto.kt */
/* loaded from: classes14.dex */
public final class BadgesBadgeDto implements Parcelable {
    public static final Parcelable.Creator<BadgesBadgeDto> CREATOR = new a();

    @pmi0("alt_text")
    private final String altText;

    @pmi0("description")
    private final String description;

    @pmi0("id")
    private final int id;

    @pmi0("image")
    private final BadgesBadgeImageDto image;

    @pmi0("is_disabled")
    private final Boolean isDisabled;

    @pmi0("label")
    private final BadgesBadgeLabelDto label;

    @pmi0(SignalingProtocol.KEY_LIMIT)
    private final Integer limit;

    @pmi0("lock_status")
    private final LockStatusDto lockStatus;

    @pmi0("price")
    private final BadgesBadgePriceDto price;

    @pmi0("styles")
    private final List<BadgesBadgeStyleDto> styles;

    @pmi0("title")
    private final String title;

    @pmi0("unlock_info")
    private final BadgesBadgeUnlockInfoDto unlockInfo;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BadgesBadgeDto.kt */
    public static final class LockStatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LockStatusDto[] $VALUES;
        public static final Parcelable.Creator<LockStatusDto> CREATOR;

        @pmi0("1")
        public static final LockStatusDto LOCKED;

        @pmi0("0")
        public static final LockStatusDto NONE;

        @pmi0("2")
        public static final LockStatusDto UNLOCKED;
        private final int value;

        /* compiled from: BadgesBadgeDto.kt */
        public static final class a implements Parcelable.Creator<LockStatusDto> {
            @Override // android.os.Parcelable.Creator
            public final LockStatusDto createFromParcel(Parcel parcel) {
                return LockStatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final LockStatusDto[] newArray(int i) {
                return new LockStatusDto[i];
            }
        }

        static {
            LockStatusDto lockStatusDto = new LockStatusDto("NONE", 0, 0);
            NONE = lockStatusDto;
            LockStatusDto lockStatusDto2 = new LockStatusDto("LOCKED", 1, 1);
            LOCKED = lockStatusDto2;
            LockStatusDto lockStatusDto3 = new LockStatusDto("UNLOCKED", 2, 2);
            UNLOCKED = lockStatusDto3;
            LockStatusDto[] lockStatusDtoArr = {lockStatusDto, lockStatusDto2, lockStatusDto3};
            $VALUES = lockStatusDtoArr;
            $ENTRIES = new asp(lockStatusDtoArr);
            CREATOR = new a();
        }

        private LockStatusDto(String str, int i, int i2) {
            this.value = i2;
        }

        public static LockStatusDto valueOf(String str) {
            return (LockStatusDto) Enum.valueOf(LockStatusDto.class, str);
        }

        public static LockStatusDto[] values() {
            return (LockStatusDto[]) $VALUES.clone();
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

    /* compiled from: BadgesBadgeDto.kt */
    public static final class a implements Parcelable.Creator<BadgesBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            BadgesBadgeImageDto createFromParcel = BadgesBadgeImageDto.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            BadgesBadgePriceDto createFromParcel2 = parcel.readInt() == 0 ? null : BadgesBadgePriceDto.CREATOR.createFromParcel(parcel);
            BadgesBadgeLabelDto createFromParcel3 = parcel.readInt() == 0 ? null : BadgesBadgeLabelDto.CREATOR.createFromParcel(parcel);
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            LockStatusDto createFromParcel4 = parcel.readInt() == 0 ? null : LockStatusDto.CREATOR.createFromParcel(parcel);
            BadgesBadgeUnlockInfoDto createFromParcel5 = parcel.readInt() == 0 ? null : BadgesBadgeUnlockInfoDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = en.a(BadgesBadgeStyleDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new BadgesBadgeDto(readInt, readString, createFromParcel, readString2, readString3, createFromParcel2, createFromParcel3, valueOf2, createFromParcel4, createFromParcel5, arrayList, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final BadgesBadgeDto[] newArray(int i) {
            return new BadgesBadgeDto[i];
        }
    }

    public BadgesBadgeDto(int i, String str, BadgesBadgeImageDto badgesBadgeImageDto, String str2, String str3, BadgesBadgePriceDto badgesBadgePriceDto, BadgesBadgeLabelDto badgesBadgeLabelDto, Integer num, LockStatusDto lockStatusDto, BadgesBadgeUnlockInfoDto badgesBadgeUnlockInfoDto, List<BadgesBadgeStyleDto> list, Boolean bool) {
        this.id = i;
        this.title = str;
        this.image = badgesBadgeImageDto;
        this.description = str2;
        this.altText = str3;
        this.price = badgesBadgePriceDto;
        this.label = badgesBadgeLabelDto;
        this.limit = num;
        this.lockStatus = lockStatusDto;
        this.unlockInfo = badgesBadgeUnlockInfoDto;
        this.styles = list;
        this.isDisabled = bool;
    }

    public final String d() {
        return this.altText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BadgesBadgeImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgesBadgeDto)) {
            return false;
        }
        BadgesBadgeDto badgesBadgeDto = (BadgesBadgeDto) obj;
        return this.id == badgesBadgeDto.id && epx.f(this.title, badgesBadgeDto.title) && epx.f(this.image, badgesBadgeDto.image) && epx.f(this.description, badgesBadgeDto.description) && epx.f(this.altText, badgesBadgeDto.altText) && epx.f(this.price, badgesBadgeDto.price) && epx.f(this.label, badgesBadgeDto.label) && epx.f(this.limit, badgesBadgeDto.limit) && this.lockStatus == badgesBadgeDto.lockStatus && epx.f(this.unlockInfo, badgesBadgeDto.unlockInfo) && epx.f(this.styles, badgesBadgeDto.styles) && epx.f(this.isDisabled, badgesBadgeDto.isDisabled);
    }

    public final BadgesBadgeLabelDto f() {
        return this.label;
    }

    public final Integer g() {
        return this.limit;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.image.hashCode() + urd0.a(Integer.hashCode(this.id) * 31, 31, this.title)) * 31;
        String str = this.description;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.altText;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        BadgesBadgePriceDto badgesBadgePriceDto = this.price;
        int hashCode4 = (hashCode3 + (badgesBadgePriceDto == null ? 0 : badgesBadgePriceDto.hashCode())) * 31;
        BadgesBadgeLabelDto badgesBadgeLabelDto = this.label;
        int hashCode5 = (hashCode4 + (badgesBadgeLabelDto == null ? 0 : badgesBadgeLabelDto.hashCode())) * 31;
        Integer num = this.limit;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        LockStatusDto lockStatusDto = this.lockStatus;
        int hashCode7 = (hashCode6 + (lockStatusDto == null ? 0 : lockStatusDto.hashCode())) * 31;
        BadgesBadgeUnlockInfoDto badgesBadgeUnlockInfoDto = this.unlockInfo;
        int hashCode8 = (hashCode7 + (badgesBadgeUnlockInfoDto == null ? 0 : badgesBadgeUnlockInfoDto.hashCode())) * 31;
        List<BadgesBadgeStyleDto> list = this.styles;
        int hashCode9 = (hashCode8 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isDisabled;
        return hashCode9 + (bool != null ? bool.hashCode() : 0);
    }

    public final LockStatusDto i() {
        return this.lockStatus;
    }

    public final BadgesBadgePriceDto j() {
        return this.price;
    }

    public final List<BadgesBadgeStyleDto> k() {
        return this.styles;
    }

    public final BadgesBadgeUnlockInfoDto l() {
        return this.unlockInfo;
    }

    public final Boolean n() {
        return this.isDisabled;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BadgesBadgeDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", altText=");
        sb.append(this.altText);
        sb.append(", price=");
        sb.append(this.price);
        sb.append(", label=");
        sb.append(this.label);
        sb.append(", limit=");
        sb.append(this.limit);
        sb.append(", lockStatus=");
        sb.append(this.lockStatus);
        sb.append(", unlockInfo=");
        sb.append(this.unlockInfo);
        sb.append(", styles=");
        sb.append(this.styles);
        sb.append(", isDisabled=");
        return tn.a(sb, this.isDisabled, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        this.image.writeToParcel(parcel, i);
        parcel.writeString(this.description);
        parcel.writeString(this.altText);
        BadgesBadgePriceDto badgesBadgePriceDto = this.price;
        if (badgesBadgePriceDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesBadgePriceDto.writeToParcel(parcel, i);
        }
        BadgesBadgeLabelDto badgesBadgeLabelDto = this.label;
        if (badgesBadgeLabelDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesBadgeLabelDto.writeToParcel(parcel, i);
        }
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        LockStatusDto lockStatusDto = this.lockStatus;
        if (lockStatusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            lockStatusDto.writeToParcel(parcel, i);
        }
        BadgesBadgeUnlockInfoDto badgesBadgeUnlockInfoDto = this.unlockInfo;
        if (badgesBadgeUnlockInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgesBadgeUnlockInfoDto.writeToParcel(parcel, i);
        }
        List<BadgesBadgeStyleDto> list = this.styles;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((BadgesBadgeStyleDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.isDisabled;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ BadgesBadgeDto(int i, String str, BadgesBadgeImageDto badgesBadgeImageDto, String str2, String str3, BadgesBadgePriceDto badgesBadgePriceDto, BadgesBadgeLabelDto badgesBadgeLabelDto, Integer num, LockStatusDto lockStatusDto, BadgesBadgeUnlockInfoDto badgesBadgeUnlockInfoDto, List list, Boolean bool, int i2, zcl zclVar) {
        this(i, str, badgesBadgeImageDto, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : badgesBadgePriceDto, (i2 & 64) != 0 ? null : badgesBadgeLabelDto, (i2 & 128) != 0 ? null : num, (i2 & 256) != 0 ? null : lockStatusDto, (i2 & 512) != 0 ? null : badgesBadgeUnlockInfoDto, (i2 & 1024) != 0 ? null : list, (i2 & 2048) != 0 ? null : bool);
    }
}
