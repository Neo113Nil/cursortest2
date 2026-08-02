package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: VkRunSeasonMilestoneArticleDto.kt */
/* loaded from: classes15.dex */
public final class VkRunSeasonMilestoneArticleDto implements Parcelable {
    public static final Parcelable.Creator<VkRunSeasonMilestoneArticleDto> CREATOR = new a();

    @pmi0("id")
    private final String id;

    @pmi0("status")
    private final StatusDto status;

    @pmi0("text")
    private final String text;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkRunSeasonMilestoneArticleDto.kt */
    public static final class StatusDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ StatusDto[] $VALUES;

        @pmi0("available")
        public static final StatusDto AVAILABLE;
        public static final Parcelable.Creator<StatusDto> CREATOR;

        @pmi0("locked")
        public static final StatusDto LOCKED;

        @pmi0("viewed")
        public static final StatusDto VIEWED;
        private final String value;

        /* compiled from: VkRunSeasonMilestoneArticleDto.kt */
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
            StatusDto statusDto = new StatusDto("VIEWED", 0, "viewed");
            VIEWED = statusDto;
            StatusDto statusDto2 = new StatusDto("AVAILABLE", 1, "available");
            AVAILABLE = statusDto2;
            StatusDto statusDto3 = new StatusDto("LOCKED", 2, "locked");
            LOCKED = statusDto3;
            StatusDto[] statusDtoArr = {statusDto, statusDto2, statusDto3};
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

    /* compiled from: VkRunSeasonMilestoneArticleDto.kt */
    public static final class a implements Parcelable.Creator<VkRunSeasonMilestoneArticleDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneArticleDto createFromParcel(Parcel parcel) {
            return new VkRunSeasonMilestoneArticleDto(parcel.readString(), StatusDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunSeasonMilestoneArticleDto[] newArray(int i) {
            return new VkRunSeasonMilestoneArticleDto[i];
        }
    }

    public VkRunSeasonMilestoneArticleDto(String str, StatusDto statusDto, String str2) {
        this.id = str;
        this.status = statusDto;
        this.text = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunSeasonMilestoneArticleDto)) {
            return false;
        }
        VkRunSeasonMilestoneArticleDto vkRunSeasonMilestoneArticleDto = (VkRunSeasonMilestoneArticleDto) obj;
        return epx.f(this.id, vkRunSeasonMilestoneArticleDto.id) && this.status == vkRunSeasonMilestoneArticleDto.status && epx.f(this.text, vkRunSeasonMilestoneArticleDto.text);
    }

    public final int hashCode() {
        int hashCode = (this.status.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.text;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunSeasonMilestoneArticleDto(id=");
        sb.append(this.id);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        this.status.writeToParcel(parcel, i);
        parcel.writeString(this.text);
    }

    public /* synthetic */ VkRunSeasonMilestoneArticleDto(String str, StatusDto statusDto, String str2, int i, zcl zclVar) {
        this(str, statusDto, (i & 4) != 0 ? null : str2);
    }
}
