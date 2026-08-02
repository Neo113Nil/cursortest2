package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetAnimationBlockDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetAnimationBlockDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetAnimationBlockDto> CREATOR = new a();

    @pmi0("repeat_count")
    private final Integer repeatCount;

    @pmi0("url")
    private final String url;

    /* compiled from: SuperAppUniversalWidgetAnimationBlockDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetAnimationBlockDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetAnimationBlockDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetAnimationBlockDto(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetAnimationBlockDto[] newArray(int i) {
            return new SuperAppUniversalWidgetAnimationBlockDto[i];
        }
    }

    public SuperAppUniversalWidgetAnimationBlockDto(String str, Integer num) {
        this.url = str;
        this.repeatCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetAnimationBlockDto)) {
            return false;
        }
        SuperAppUniversalWidgetAnimationBlockDto superAppUniversalWidgetAnimationBlockDto = (SuperAppUniversalWidgetAnimationBlockDto) obj;
        return epx.f(this.url, superAppUniversalWidgetAnimationBlockDto.url) && epx.f(this.repeatCount, superAppUniversalWidgetAnimationBlockDto.repeatCount);
    }

    public final int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Integer num = this.repeatCount;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetAnimationBlockDto(url=");
        sb.append(this.url);
        sb.append(", repeatCount=");
        return uqi.b(sb, this.repeatCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.url);
        Integer num = this.repeatCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetAnimationBlockDto(String str, Integer num, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : num);
    }
}
