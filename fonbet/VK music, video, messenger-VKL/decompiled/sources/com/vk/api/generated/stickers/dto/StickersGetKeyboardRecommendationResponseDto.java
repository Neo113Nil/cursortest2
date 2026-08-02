package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: StickersGetKeyboardRecommendationResponseDto.kt */
/* loaded from: classes15.dex */
public final class StickersGetKeyboardRecommendationResponseDto implements Parcelable {
    public static final Parcelable.Creator<StickersGetKeyboardRecommendationResponseDto> CREATOR = new a();

    @pmi0("keyboard_recommendation")
    private final StickersKeyboardRecommendationDto keyboardRecommendation;

    @pmi0("packs")
    private final List<StickersPackPreviewDto> packs;

    /* compiled from: StickersGetKeyboardRecommendationResponseDto.kt */
    public static final class a implements Parcelable.Creator<StickersGetKeyboardRecommendationResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersGetKeyboardRecommendationResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            StickersKeyboardRecommendationDto createFromParcel = parcel.readInt() == 0 ? null : StickersKeyboardRecommendationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(StickersPackPreviewDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new StickersGetKeyboardRecommendationResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersGetKeyboardRecommendationResponseDto[] newArray(int i) {
            return new StickersGetKeyboardRecommendationResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StickersGetKeyboardRecommendationResponseDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final StickersKeyboardRecommendationDto d() {
        return this.keyboardRecommendation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<StickersPackPreviewDto> e() {
        return this.packs;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersGetKeyboardRecommendationResponseDto)) {
            return false;
        }
        StickersGetKeyboardRecommendationResponseDto stickersGetKeyboardRecommendationResponseDto = (StickersGetKeyboardRecommendationResponseDto) obj;
        return epx.f(this.keyboardRecommendation, stickersGetKeyboardRecommendationResponseDto.keyboardRecommendation) && epx.f(this.packs, stickersGetKeyboardRecommendationResponseDto.packs);
    }

    public final int hashCode() {
        StickersKeyboardRecommendationDto stickersKeyboardRecommendationDto = this.keyboardRecommendation;
        int hashCode = (stickersKeyboardRecommendationDto == null ? 0 : stickersKeyboardRecommendationDto.hashCode()) * 31;
        List<StickersPackPreviewDto> list = this.packs;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersGetKeyboardRecommendationResponseDto(keyboardRecommendation=");
        sb.append(this.keyboardRecommendation);
        sb.append(", packs=");
        return ms9.a(')', sb, this.packs);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        StickersKeyboardRecommendationDto stickersKeyboardRecommendationDto = this.keyboardRecommendation;
        if (stickersKeyboardRecommendationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stickersKeyboardRecommendationDto.writeToParcel(parcel, i);
        }
        List<StickersPackPreviewDto> list = this.packs;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((StickersPackPreviewDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public StickersGetKeyboardRecommendationResponseDto(StickersKeyboardRecommendationDto stickersKeyboardRecommendationDto, List<StickersPackPreviewDto> list) {
        this.keyboardRecommendation = stickersKeyboardRecommendationDto;
        this.packs = list;
    }

    public /* synthetic */ StickersGetKeyboardRecommendationResponseDto(StickersKeyboardRecommendationDto stickersKeyboardRecommendationDto, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : stickersKeyboardRecommendationDto, (i & 2) != 0 ? null : list);
    }
}
