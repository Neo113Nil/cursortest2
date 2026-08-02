package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.bh10;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StickersUgcStickerDto.kt */
/* loaded from: classes15.dex */
public final class StickersUgcStickerDto implements Parcelable {
    public static final Parcelable.Creator<StickersUgcStickerDto> CREATOR = new a();

    @pmi0("active_restriction")
    private final ActiveRestrictionDto activeRestriction;

    @pmi0("id")
    private final long id;

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("is_claimed")
    private final Boolean isClaimed;

    @pmi0("is_deleted")
    private final Boolean isDeleted;

    @pmi0("owner_id")
    private final UserId ownerId;

    @pmi0("pack_id")
    private final Long packId;

    @pmi0("restrictions")
    private final List<String> restrictions;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("status_description")
    private final String statusDescription;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersUgcStickerDto.kt */
    public static final class ActiveRestrictionDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ActiveRestrictionDto[] $VALUES;

        @pmi0("age_18")
        public static final ActiveRestrictionDto AGE_18;
        public static final Parcelable.Creator<ActiveRestrictionDto> CREATOR;
        private final String value;

        /* compiled from: StickersUgcStickerDto.kt */
        public static final class a implements Parcelable.Creator<ActiveRestrictionDto> {
            @Override // android.os.Parcelable.Creator
            public final ActiveRestrictionDto createFromParcel(Parcel parcel) {
                return ActiveRestrictionDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActiveRestrictionDto[] newArray(int i) {
                return new ActiveRestrictionDto[i];
            }
        }

        static {
            ActiveRestrictionDto activeRestrictionDto = new ActiveRestrictionDto("AGE_18", 0, "age_18");
            AGE_18 = activeRestrictionDto;
            ActiveRestrictionDto[] activeRestrictionDtoArr = {activeRestrictionDto};
            $VALUES = activeRestrictionDtoArr;
            $ENTRIES = new asp(activeRestrictionDtoArr);
            CREATOR = new a();
        }

        private ActiveRestrictionDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ActiveRestrictionDto valueOf(String str) {
            return (ActiveRestrictionDto) Enum.valueOf(ActiveRestrictionDto.class, str);
        }

        public static ActiveRestrictionDto[] values() {
            return (ActiveRestrictionDto[]) $VALUES.clone();
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
    /* compiled from: StickersUgcStickerDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("banned")
        public static final StatusDto BANNED;

        @pmi0("created")
        public static final StatusDto CREATED;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("in_review")
        public static final StatusDto IN_REVIEW;

        @pmi0("passed")
        public static final StatusDto PASSED;

        @pmi0("rejected")
        public static final StatusDto REJECTED;
        private final String value;

        /* compiled from: StickersUgcStickerDto.kt */
        public static final class a implements Parcelable.Creator<StatusDto> {
            @Override // android.os.Parcelable.Creator
            public final StatusDto createFromParcel(Parcel parcel) {
                return StatusDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusDto[] newArray(int i) {
                return new StatusDto[i];
            }
        }

        static {
            StatusDto statusDto = new StatusDto("CREATED", 0, "created");
            CREATED = statusDto;
            StatusDto statusDto2 = new StatusDto("PASSED", 1, "passed");
            PASSED = statusDto2;
            StatusDto statusDto3 = new StatusDto("IN_REVIEW", 2, "in_review");
            IN_REVIEW = statusDto3;
            StatusDto statusDto4 = new StatusDto("BANNED", 3, "banned");
            BANNED = statusDto4;
            StatusDto statusDto5 = new StatusDto("REJECTED", 4, "rejected");
            REJECTED = statusDto5;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3, statusDto4, statusDto5};
            $VALUES = statusDtoArr;
            $ENTRIES = new asp(statusDtoArr);
            CREATOR = new a();
        }

        private StatusDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static StatusDto valueOf(String str) {
            return (StatusDto) Enum.valueOf(StatusDto.class, str);
        }

        public static StatusDto[] values() {
            return (StatusDto[]) $VALUES.clone();
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

    /* compiled from: StickersUgcStickerDto.kt */
    public static final class a implements Parcelable.Creator<StickersUgcStickerDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersUgcStickerDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean valueOf;
            UserId userId = (UserId) parcel.readParcelable(StickersUgcStickerDto.class.getClassLoader());
            long readLong = parcel.readLong();
            Boolean bool = null;
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(StickersUgcStickerDto.class, parcel, arrayList, i, 1);
                }
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ActiveRestrictionDto createFromParcel = parcel.readInt() == 0 ? null : ActiveRestrictionDto.CREATOR.createFromParcel(parcel);
            StatusDto createFromParcel2 = parcel.readInt() == 0 ? null : StatusDto.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StickersUgcStickerDto(userId, readLong, valueOf2, arrayList, createStringArrayList, createFromParcel, createFromParcel2, readString, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersUgcStickerDto[] newArray(int i) {
            return new StickersUgcStickerDto[i];
        }
    }

    public StickersUgcStickerDto(UserId userId, long j, Long l, List<BaseImageDto> list, List<String> list2, ActiveRestrictionDto activeRestrictionDto, StatusDto statusDto, String str, Boolean bool, Boolean bool2) {
        this.ownerId = userId;
        this.id = j;
        this.packId = l;
        this.images = list;
        this.restrictions = list2;
        this.activeRestriction = activeRestrictionDto;
        this.status = statusDto;
        this.statusDescription = str;
        this.isDeleted = bool;
        this.isClaimed = bool2;
    }

    public final ActiveRestrictionDto d() {
        return this.activeRestriction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersUgcStickerDto)) {
            return false;
        }
        StickersUgcStickerDto stickersUgcStickerDto = (StickersUgcStickerDto) obj;
        return epx.f(this.ownerId, stickersUgcStickerDto.ownerId) && this.id == stickersUgcStickerDto.id && epx.f(this.packId, stickersUgcStickerDto.packId) && epx.f(this.images, stickersUgcStickerDto.images) && epx.f(this.restrictions, stickersUgcStickerDto.restrictions) && this.activeRestriction == stickersUgcStickerDto.activeRestriction && this.status == stickersUgcStickerDto.status && epx.f(this.statusDescription, stickersUgcStickerDto.statusDescription) && epx.f(this.isDeleted, stickersUgcStickerDto.isDeleted) && epx.f(this.isClaimed, stickersUgcStickerDto.isClaimed);
    }

    public final List<BaseImageDto> f() {
        return this.images;
    }

    public final Long g() {
        return this.packId;
    }

    public final int hashCode() {
        int a2 = bh10.a(Long.hashCode(this.ownerId.b) * 31, 31, this.id);
        Long l = this.packId;
        int hashCode = (a2 + (l == null ? 0 : l.hashCode())) * 31;
        List<BaseImageDto> list = this.images;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.restrictions;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        ActiveRestrictionDto activeRestrictionDto = this.activeRestriction;
        int hashCode4 = (hashCode3 + (activeRestrictionDto == null ? 0 : activeRestrictionDto.hashCode())) * 31;
        StatusDto statusDto = this.status;
        int hashCode5 = (hashCode4 + (statusDto == null ? 0 : statusDto.hashCode())) * 31;
        String str = this.statusDescription;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isClaimed;
        return hashCode7 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final StatusDto i() {
        return this.status;
    }

    public final Boolean j() {
        return this.isDeleted;
    }

    public final UserId q() {
        return this.ownerId;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersUgcStickerDto(ownerId=");
        sb.append(this.ownerId);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", packId=");
        sb.append(this.packId);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", restrictions=");
        sb.append(this.restrictions);
        sb.append(", activeRestriction=");
        sb.append(this.activeRestriction);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", statusDescription=");
        sb.append(this.statusDescription);
        sb.append(", isDeleted=");
        sb.append(this.isDeleted);
        sb.append(", isClaimed=");
        return tn.a(sb, this.isClaimed, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.ownerId, i);
        parcel.writeLong(this.id);
        Long l = this.packId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        List<BaseImageDto> list = this.images;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeStringList(this.restrictions);
        ActiveRestrictionDto activeRestrictionDto = this.activeRestriction;
        if (activeRestrictionDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            activeRestrictionDto.writeToParcel(parcel, i);
        }
        StatusDto statusDto = this.status;
        if (statusDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            statusDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.statusDescription);
        Boolean bool = this.isDeleted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Boolean bool2 = this.isClaimed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public /* synthetic */ StickersUgcStickerDto(UserId userId, long j, Long l, List list, List list2, ActiveRestrictionDto activeRestrictionDto, StatusDto statusDto, String str, Boolean bool, Boolean bool2, int i, zcl zclVar) {
        this(userId, j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : activeRestrictionDto, (i & 64) != 0 ? null : statusDto, (i & 128) != 0 ? null : str, (i & 256) != 0 ? null : bool, (i & 512) != 0 ? null : bool2);
    }
}
