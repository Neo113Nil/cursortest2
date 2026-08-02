package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetUserStackFooterPayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetUserStackFooterPayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetUserStackFooterPayloadDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("count")
    private final Integer count;

    @pmi0("description")
    private final String description;

    @pmi0("items")
    private final List<SuperAppUniversalWidgetImageBlockDto> items;

    /* compiled from: SuperAppUniversalWidgetUserStackFooterPayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetUserStackFooterPayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetUserStackFooterPayloadDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SuperAppUniversalWidgetUserStackFooterPayloadDto.class, parcel, arrayList, i, 1);
            }
            return new SuperAppUniversalWidgetUserStackFooterPayloadDto(readString, arrayList, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetUserStackFooterPayloadDto.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetUserStackFooterPayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetUserStackFooterPayloadDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetUserStackFooterPayloadDto(String str, List<? extends SuperAppUniversalWidgetImageBlockDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Integer num) {
        this.description = str;
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
        if (!(obj instanceof SuperAppUniversalWidgetUserStackFooterPayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetUserStackFooterPayloadDto superAppUniversalWidgetUserStackFooterPayloadDto = (SuperAppUniversalWidgetUserStackFooterPayloadDto) obj;
        return epx.f(this.description, superAppUniversalWidgetUserStackFooterPayloadDto.description) && epx.f(this.items, superAppUniversalWidgetUserStackFooterPayloadDto.items) && epx.f(this.action, superAppUniversalWidgetUserStackFooterPayloadDto.action) && epx.f(this.count, superAppUniversalWidgetUserStackFooterPayloadDto.count);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.description.hashCode() * 31, 31, this.items);
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        int hashCode = (a2 + (superAppUniversalWidgetActionDto == null ? 0 : superAppUniversalWidgetActionDto.hashCode())) * 31;
        Integer num = this.count;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetUserStackFooterPayloadDto(description=");
        sb.append(this.description);
        sb.append(", items=");
        sb.append(this.items);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", count=");
        return uqi.b(sb, this.count, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
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

    public /* synthetic */ SuperAppUniversalWidgetUserStackFooterPayloadDto(String str, List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, Integer num, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto, (i & 8) != 0 ? null : num);
    }
}
