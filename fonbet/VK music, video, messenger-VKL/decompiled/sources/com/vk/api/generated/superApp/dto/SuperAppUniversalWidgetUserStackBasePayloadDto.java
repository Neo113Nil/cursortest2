package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetUserStackBasePayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetUserStackBasePayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetUserStackBasePayloadDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("count")
    private final Integer count;

    @pmi0("items")
    private final List<SuperAppUniversalWidgetImageBlockDto> items;

    /* compiled from: SuperAppUniversalWidgetUserStackBasePayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetUserStackBasePayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetUserStackBasePayloadDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SuperAppUniversalWidgetUserStackBasePayloadDto.class, parcel, arrayList, i, 1);
            }
            return new SuperAppUniversalWidgetUserStackBasePayloadDto(arrayList, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetUserStackBasePayloadDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetUserStackBasePayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetUserStackBasePayloadDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetUserStackBasePayloadDto(List<? extends SuperAppUniversalWidgetImageBlockDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Integer num) {
        this.items = list;
        this.action = superAppUniversalWidgetActionDto;
        this.count = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetUserStackBasePayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetUserStackBasePayloadDto superAppUniversalWidgetUserStackBasePayloadDto = (SuperAppUniversalWidgetUserStackBasePayloadDto) obj;
        return epx.f(this.items, superAppUniversalWidgetUserStackBasePayloadDto.items) && epx.f(this.action, superAppUniversalWidgetUserStackBasePayloadDto.action) && epx.f(this.count, superAppUniversalWidgetUserStackBasePayloadDto.count);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        int hashCode2 = (hashCode + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
        Integer num = this.count;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetUserStackBasePayloadDto(items=");
        sb.append(this.items);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.action, i);
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetUserStackBasePayloadDto(List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Integer num, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : superAppUniversalWidgetActionDto, (i & 4) != 0 ? null : num);
    }
}
