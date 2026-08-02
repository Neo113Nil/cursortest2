package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: SuperAppGetAllWidgetSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetAllWidgetSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetAllWidgetSettingsResponseDto> CREATOR = new a();

    @pmi0("mini_widgets")
    private final SuperAppMiniWidgetSettingsDto miniWidgets;

    @pmi0("sections")
    private final List<SuperAppWidgetSettingsDto> sections;

    @pmi0("widgets")
    private final List<SuperAppWidgetSettingsDto> widgets;

    /* compiled from: SuperAppGetAllWidgetSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetAllWidgetSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetAllWidgetSettingsResponseDto createFromParcel(Parcel parcel) {
            SuperAppMiniWidgetSettingsDto createFromParcel = SuperAppMiniWidgetSettingsDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(SuperAppWidgetSettingsDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(SuperAppWidgetSettingsDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new SuperAppGetAllWidgetSettingsResponseDto(createFromParcel, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetAllWidgetSettingsResponseDto[] newArray(int i) {
            return new SuperAppGetAllWidgetSettingsResponseDto[i];
        }
    }

    public SuperAppGetAllWidgetSettingsResponseDto(SuperAppMiniWidgetSettingsDto superAppMiniWidgetSettingsDto, List<SuperAppWidgetSettingsDto> list, List<SuperAppWidgetSettingsDto> list2) {
        this.miniWidgets = superAppMiniWidgetSettingsDto;
        this.widgets = list;
        this.sections = list2;
    }

    public final SuperAppMiniWidgetSettingsDto d() {
        return this.miniWidgets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<SuperAppWidgetSettingsDto> e() {
        return this.widgets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppGetAllWidgetSettingsResponseDto)) {
            return false;
        }
        SuperAppGetAllWidgetSettingsResponseDto superAppGetAllWidgetSettingsResponseDto = (SuperAppGetAllWidgetSettingsResponseDto) obj;
        return epx.f(this.miniWidgets, superAppGetAllWidgetSettingsResponseDto.miniWidgets) && epx.f(this.widgets, superAppGetAllWidgetSettingsResponseDto.widgets) && epx.f(this.sections, superAppGetAllWidgetSettingsResponseDto.sections);
    }

    public final int hashCode() {
        return this.sections.hashCode() + fw3.a(this.miniWidgets.hashCode() * 31, 31, this.widgets);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppGetAllWidgetSettingsResponseDto(miniWidgets=");
        sb.append(this.miniWidgets);
        sb.append(", widgets=");
        sb.append(this.widgets);
        sb.append(", sections=");
        return ms9.a(')', sb, this.sections);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.miniWidgets.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.widgets);
        while (a2.hasNext()) {
            ((SuperAppWidgetSettingsDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.sections);
        while (a3.hasNext()) {
            ((SuperAppWidgetSettingsDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
