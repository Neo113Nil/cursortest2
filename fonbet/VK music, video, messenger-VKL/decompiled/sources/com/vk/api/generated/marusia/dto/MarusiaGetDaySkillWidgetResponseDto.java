package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: MarusiaGetDaySkillWidgetResponseDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaGetDaySkillWidgetResponseDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaGetDaySkillWidgetResponseDto> CREATOR = new a();

    @pmi0("header")
    private final MarusiaWidgetHeaderDto header;

    @pmi0("widgets")
    private final List<MarusiaWidgetOneOfItemDto> widgets;

    /* compiled from: MarusiaGetDaySkillWidgetResponseDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaGetDaySkillWidgetResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaGetDaySkillWidgetResponseDto createFromParcel(Parcel parcel) {
            MarusiaWidgetHeaderDto createFromParcel = MarusiaWidgetHeaderDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(MarusiaGetDaySkillWidgetResponseDto.class, parcel, arrayList, i, 1);
            }
            return new MarusiaGetDaySkillWidgetResponseDto(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaGetDaySkillWidgetResponseDto[] newArray(int i) {
            return new MarusiaGetDaySkillWidgetResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MarusiaGetDaySkillWidgetResponseDto(MarusiaWidgetHeaderDto marusiaWidgetHeaderDto, List<? extends MarusiaWidgetOneOfItemDto> list) {
        this.header = marusiaWidgetHeaderDto;
        this.widgets = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaGetDaySkillWidgetResponseDto)) {
            return false;
        }
        MarusiaGetDaySkillWidgetResponseDto marusiaGetDaySkillWidgetResponseDto = (MarusiaGetDaySkillWidgetResponseDto) obj;
        return epx.f(this.header, marusiaGetDaySkillWidgetResponseDto.header) && epx.f(this.widgets, marusiaGetDaySkillWidgetResponseDto.widgets);
    }

    public final int hashCode() {
        return this.widgets.hashCode() + (this.header.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaGetDaySkillWidgetResponseDto(header=");
        sb.append(this.header);
        sb.append(", widgets=");
        return ms9.a(')', sb, this.widgets);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.header.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.widgets);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
