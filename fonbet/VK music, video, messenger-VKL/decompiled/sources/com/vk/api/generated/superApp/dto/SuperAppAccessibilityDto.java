package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppAccessibilityDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppAccessibilityDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppAccessibilityDto> CREATOR = new a();

    @pmi0("actions")
    private final List<String> actions;

    @pmi0("labels")
    private final List<SuperAppAccessibilityLabelDto> labels;

    /* compiled from: SuperAppAccessibilityDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppAccessibilityDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppAccessibilityDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SuperAppAccessibilityLabelDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SuperAppAccessibilityDto(arrayList, parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppAccessibilityDto[] newArray(int i) {
            return new SuperAppAccessibilityDto[i];
        }
    }

    public SuperAppAccessibilityDto(List<SuperAppAccessibilityLabelDto> list, List<String> list2) {
        this.labels = list;
        this.actions = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppAccessibilityDto)) {
            return false;
        }
        SuperAppAccessibilityDto superAppAccessibilityDto = (SuperAppAccessibilityDto) obj;
        return epx.f(this.labels, superAppAccessibilityDto.labels) && epx.f(this.actions, superAppAccessibilityDto.actions);
    }

    public final int hashCode() {
        int hashCode = this.labels.hashCode() * 31;
        List<String> list = this.actions;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppAccessibilityDto(labels=");
        sb.append(this.labels);
        sb.append(", actions=");
        return ms9.a(')', sb, this.actions);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.labels);
        while (a2.hasNext()) {
            ((SuperAppAccessibilityLabelDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeStringList(this.actions);
    }

    public /* synthetic */ SuperAppAccessibilityDto(List list, List list2, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : list2);
    }
}
