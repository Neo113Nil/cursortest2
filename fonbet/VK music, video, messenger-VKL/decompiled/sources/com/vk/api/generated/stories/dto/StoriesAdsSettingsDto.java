package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StoriesAdsSettingsDto.kt */
/* loaded from: classes15.dex */
public final class StoriesAdsSettingsDto implements Parcelable {
    public static final Parcelable.Creator<StoriesAdsSettingsDto> CREATOR = new a();

    @pmi0("authors_init")
    private final Integer authorsInit;

    @pmi0("authors_interval")
    private final Integer authorsInterval;

    @pmi0("interval_type")
    private final IntervalTypeDto intervalType;

    @pmi0("stories_init")
    private final Integer storiesInit;

    @pmi0("stories_interval")
    private final Integer storiesInterval;

    @pmi0("time_init")
    private final Integer timeInit;

    @pmi0("time_interval")
    private final Integer timeInterval;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StoriesAdsSettingsDto.kt */
    public static final class IntervalTypeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ IntervalTypeDto[] $VALUES;
        public static final Parcelable.Creator<IntervalTypeDto> CREATOR;

        @pmi0("stories_and_authors")
        public static final IntervalTypeDto STORIES_AND_AUTHORS;

        @pmi0("stories_and_authors_and_time")
        public static final IntervalTypeDto STORIES_AND_AUTHORS_AND_TIME;

        @pmi0("time")
        public static final IntervalTypeDto TIME;
        private final String value;

        /* compiled from: StoriesAdsSettingsDto.kt */
        public static final class a implements Parcelable.Creator<IntervalTypeDto> {
            @Override // android.os.Parcelable.Creator
            public final IntervalTypeDto createFromParcel(Parcel parcel) {
                return IntervalTypeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final IntervalTypeDto[] newArray(int i) {
                return new IntervalTypeDto[i];
            }
        }

        static {
            IntervalTypeDto intervalTypeDto = new IntervalTypeDto("STORIES_AND_AUTHORS", 0, "stories_and_authors");
            STORIES_AND_AUTHORS = intervalTypeDto;
            IntervalTypeDto intervalTypeDto2 = new IntervalTypeDto("TIME", 1, "time");
            TIME = intervalTypeDto2;
            IntervalTypeDto intervalTypeDto3 = new IntervalTypeDto("STORIES_AND_AUTHORS_AND_TIME", 2, "stories_and_authors_and_time");
            STORIES_AND_AUTHORS_AND_TIME = intervalTypeDto3;
            IntervalTypeDto[] intervalTypeDtoArr = {intervalTypeDto, intervalTypeDto2, intervalTypeDto3};
            $VALUES = intervalTypeDtoArr;
            $ENTRIES = new asp(intervalTypeDtoArr);
            CREATOR = new a();
        }

        private IntervalTypeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static IntervalTypeDto valueOf(String str) {
            return (IntervalTypeDto) Enum.valueOf(IntervalTypeDto.class, str);
        }

        public static IntervalTypeDto[] values() {
            return (IntervalTypeDto[]) $VALUES.clone();
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

    /* compiled from: StoriesAdsSettingsDto.kt */
    public static final class a implements Parcelable.Creator<StoriesAdsSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesAdsSettingsDto createFromParcel(Parcel parcel) {
            return new StoriesAdsSettingsDto(parcel.readInt() == 0 ? null : IntervalTypeDto.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesAdsSettingsDto[] newArray(int i) {
            return new StoriesAdsSettingsDto[i];
        }
    }

    public StoriesAdsSettingsDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public final Integer d() {
        return this.authorsInit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.authorsInterval;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesAdsSettingsDto)) {
            return false;
        }
        StoriesAdsSettingsDto storiesAdsSettingsDto = (StoriesAdsSettingsDto) obj;
        return this.intervalType == storiesAdsSettingsDto.intervalType && epx.f(this.storiesInterval, storiesAdsSettingsDto.storiesInterval) && epx.f(this.authorsInterval, storiesAdsSettingsDto.authorsInterval) && epx.f(this.timeInterval, storiesAdsSettingsDto.timeInterval) && epx.f(this.storiesInit, storiesAdsSettingsDto.storiesInit) && epx.f(this.authorsInit, storiesAdsSettingsDto.authorsInit) && epx.f(this.timeInit, storiesAdsSettingsDto.timeInit);
    }

    public final IntervalTypeDto f() {
        return this.intervalType;
    }

    public final Integer g() {
        return this.storiesInit;
    }

    public final int hashCode() {
        IntervalTypeDto intervalTypeDto = this.intervalType;
        int hashCode = (intervalTypeDto == null ? 0 : intervalTypeDto.hashCode()) * 31;
        Integer num = this.storiesInterval;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.authorsInterval;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.timeInterval;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.storiesInit;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.authorsInit;
        int hashCode6 = (hashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.timeInit;
        return hashCode6 + (num6 != null ? num6.hashCode() : 0);
    }

    public final Integer i() {
        return this.storiesInterval;
    }

    public final Integer j() {
        return this.timeInit;
    }

    public final Integer k() {
        return this.timeInterval;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesAdsSettingsDto(intervalType=");
        sb.append(this.intervalType);
        sb.append(", storiesInterval=");
        sb.append(this.storiesInterval);
        sb.append(", authorsInterval=");
        sb.append(this.authorsInterval);
        sb.append(", timeInterval=");
        sb.append(this.timeInterval);
        sb.append(", storiesInit=");
        sb.append(this.storiesInit);
        sb.append(", authorsInit=");
        sb.append(this.authorsInit);
        sb.append(", timeInit=");
        return uqi.b(sb, this.timeInit, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        IntervalTypeDto intervalTypeDto = this.intervalType;
        if (intervalTypeDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            intervalTypeDto.writeToParcel(parcel, i);
        }
        Integer num = this.storiesInterval;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.authorsInterval;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.timeInterval;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.storiesInit;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.authorsInit;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.timeInit;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
    }

    public StoriesAdsSettingsDto(IntervalTypeDto intervalTypeDto, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.intervalType = intervalTypeDto;
        this.storiesInterval = num;
        this.authorsInterval = num2;
        this.timeInterval = num3;
        this.storiesInit = num4;
        this.authorsInit = num5;
        this.timeInit = num6;
    }

    public /* synthetic */ StoriesAdsSettingsDto(IntervalTypeDto intervalTypeDto, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : intervalTypeDto, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : num3, (i & 16) != 0 ? null : num4, (i & 32) != 0 ? null : num5, (i & 64) != 0 ? null : num6);
    }
}
