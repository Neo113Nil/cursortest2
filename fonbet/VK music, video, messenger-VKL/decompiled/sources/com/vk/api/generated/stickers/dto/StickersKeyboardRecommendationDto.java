package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.asp;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: StickersKeyboardRecommendationDto.kt */
/* loaded from: classes15.dex */
public final class StickersKeyboardRecommendationDto implements Parcelable {
    public static final Parcelable.Creator<StickersKeyboardRecommendationDto> CREATOR = new a();

    @pmi0("hash")
    private final String hash;

    @pmi0("pack_ids")
    private final List<Integer> packIds;

    @pmi0("scroll_mode")
    private final ScrollModeDto scrollMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: StickersKeyboardRecommendationDto.kt */
    public static final class ScrollModeDto implements Parcelable {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ ScrollModeDto[] $VALUES;
        public static final Parcelable.Creator<ScrollModeDto> CREATOR;

        @pmi0("no_scroll")
        public static final ScrollModeDto NO_SCROLL;

        @pmi0("scroll_last_row")
        public static final ScrollModeDto SCROLL_LAST_ROW;

        @pmi0("scroll_recommendation")
        public static final ScrollModeDto SCROLL_RECOMMENDATION;
        private final String value;

        /* compiled from: StickersKeyboardRecommendationDto.kt */
        public static final class a implements Parcelable.Creator<ScrollModeDto> {
            @Override // android.os.Parcelable.Creator
            public final ScrollModeDto createFromParcel(Parcel parcel) {
                return ScrollModeDto.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ScrollModeDto[] newArray(int i) {
                return new ScrollModeDto[i];
            }
        }

        static {
            ScrollModeDto scrollModeDto = new ScrollModeDto("NO_SCROLL", 0, "no_scroll");
            NO_SCROLL = scrollModeDto;
            ScrollModeDto scrollModeDto2 = new ScrollModeDto("SCROLL_RECOMMENDATION", 1, "scroll_recommendation");
            SCROLL_RECOMMENDATION = scrollModeDto2;
            ScrollModeDto scrollModeDto3 = new ScrollModeDto("SCROLL_LAST_ROW", 2, "scroll_last_row");
            SCROLL_LAST_ROW = scrollModeDto3;
            ScrollModeDto[] scrollModeDtoArr = {scrollModeDto, scrollModeDto2, scrollModeDto3};
            $VALUES = scrollModeDtoArr;
            $ENTRIES = new asp(scrollModeDtoArr);
            CREATOR = new a();
        }

        private ScrollModeDto(String str, int i, String str2) {
            this.value = str2;
        }

        public static ScrollModeDto valueOf(String str) {
            return (ScrollModeDto) Enum.valueOf(ScrollModeDto.class, str);
        }

        public static ScrollModeDto[] values() {
            return (ScrollModeDto[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String i() {
            return this.value;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(name());
        }
    }

    /* compiled from: StickersKeyboardRecommendationDto.kt */
    public static final class a implements Parcelable.Creator<StickersKeyboardRecommendationDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersKeyboardRecommendationDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ScrollModeDto createFromParcel = ScrollModeDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = pm0.b(parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StickersKeyboardRecommendationDto(createFromParcel, arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StickersKeyboardRecommendationDto[] newArray(int i) {
            return new StickersKeyboardRecommendationDto[i];
        }
    }

    public StickersKeyboardRecommendationDto(ScrollModeDto scrollModeDto, List<Integer> list, String str) {
        this.scrollMode = scrollModeDto;
        this.packIds = list;
        this.hash = str;
    }

    public final String d() {
        return this.hash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Integer> e() {
        return this.packIds;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersKeyboardRecommendationDto)) {
            return false;
        }
        StickersKeyboardRecommendationDto stickersKeyboardRecommendationDto = (StickersKeyboardRecommendationDto) obj;
        return this.scrollMode == stickersKeyboardRecommendationDto.scrollMode && epx.f(this.packIds, stickersKeyboardRecommendationDto.packIds) && epx.f(this.hash, stickersKeyboardRecommendationDto.hash);
    }

    public final ScrollModeDto f() {
        return this.scrollMode;
    }

    public final int hashCode() {
        int hashCode = this.scrollMode.hashCode() * 31;
        List<Integer> list = this.packIds;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.hash;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersKeyboardRecommendationDto(scrollMode=");
        sb.append(this.scrollMode);
        sb.append(", packIds=");
        sb.append(this.packIds);
        sb.append(", hash=");
        return ho8.a(sb, this.hash, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.scrollMode.writeToParcel(parcel, i);
        List<Integer> list = this.packIds;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeString(this.hash);
    }

    public /* synthetic */ StickersKeyboardRecommendationDto(ScrollModeDto scrollModeDto, List list, String str, int i, zcl zclVar) {
        this(scrollModeDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : str);
    }
}
