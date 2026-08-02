package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeInformerRowMiddleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRowMiddleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowMiddleDto> CREATOR = new a();

    @pmi0("avatars")
    private final List<SuperAppUniversalWidgetImageBlockDto> avatars;

    @pmi0("button")
    private final SuperAppUniversalWidgetButtonDto button;

    @pmi0("buttons")
    private final List<SuperAppUniversalWidgetButtonDto> buttons;

    @pmi0("second_subtitle")
    private final SuperAppUniversalWidgetTextBlockDto secondSubtitle;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextBlockDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextBlockDto title;

    /* compiled from: SuperAppUniversalWidgetTypeInformerRowMiddleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRowMiddleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRowMiddleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Parcelable.Creator<SuperAppUniversalWidgetTextBlockDto> creator = SuperAppUniversalWidgetTextBlockDto.CREATOR;
            SuperAppUniversalWidgetTextBlockDto createFromParcel = creator.createFromParcel(parcel);
            SuperAppUniversalWidgetTextBlockDto createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            SuperAppUniversalWidgetTextBlockDto createFromParcel3 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            int i = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (i2 != readInt) {
                    i2 = bo.b(SuperAppUniversalWidgetTypeInformerRowMiddleDto.class, parcel, arrayList, i2, 1);
                }
            }
            SuperAppUniversalWidgetButtonDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(SuperAppUniversalWidgetButtonDto.CREATOR, parcel, arrayList2, i, 1);
                }
            }
            return new SuperAppUniversalWidgetTypeInformerRowMiddleDto(createFromParcel, createFromParcel2, createFromParcel3, arrayList, createFromParcel4, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRowMiddleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRowMiddleDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppUniversalWidgetTypeInformerRowMiddleDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3, List<? extends SuperAppUniversalWidgetImageBlockDto> list, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, List<SuperAppUniversalWidgetButtonDto> list2) {
        this.title = superAppUniversalWidgetTextBlockDto;
        this.subtitle = superAppUniversalWidgetTextBlockDto2;
        this.secondSubtitle = superAppUniversalWidgetTextBlockDto3;
        this.avatars = list;
        this.button = superAppUniversalWidgetButtonDto;
        this.buttons = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRowMiddleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRowMiddleDto superAppUniversalWidgetTypeInformerRowMiddleDto = (SuperAppUniversalWidgetTypeInformerRowMiddleDto) obj;
        return epx.f(this.title, superAppUniversalWidgetTypeInformerRowMiddleDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeInformerRowMiddleDto.subtitle) && epx.f(this.secondSubtitle, superAppUniversalWidgetTypeInformerRowMiddleDto.secondSubtitle) && epx.f(this.avatars, superAppUniversalWidgetTypeInformerRowMiddleDto.avatars) && epx.f(this.button, superAppUniversalWidgetTypeInformerRowMiddleDto.button) && epx.f(this.buttons, superAppUniversalWidgetTypeInformerRowMiddleDto.buttons);
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.subtitle;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextBlockDto == null ? 0 : superAppUniversalWidgetTextBlockDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.secondSubtitle;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextBlockDto2 == null ? 0 : superAppUniversalWidgetTextBlockDto2.hashCode())) * 31;
        List<SuperAppUniversalWidgetImageBlockDto> list = this.avatars;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
        int hashCode5 = (hashCode4 + (superAppUniversalWidgetButtonDto == null ? 0 : superAppUniversalWidgetButtonDto.hashCode())) * 31;
        List<SuperAppUniversalWidgetButtonDto> list2 = this.buttons;
        return hashCode5 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetTypeInformerRowMiddleDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", secondSubtitle=");
        sb.append(this.secondSubtitle);
        sb.append(", avatars=");
        sb.append(this.avatars);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto = this.subtitle;
        if (superAppUniversalWidgetTextBlockDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2 = this.secondSubtitle;
        if (superAppUniversalWidgetTextBlockDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextBlockDto2.writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetImageBlockDto> list = this.avatars;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto = this.button;
        if (superAppUniversalWidgetButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonDto.writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetButtonDto> list2 = this.buttons;
        if (list2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f2 = dn.f(parcel, list2, 1);
        while (f2.hasNext()) {
            ((SuperAppUniversalWidgetButtonDto) f2.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRowMiddleDto(SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto2, SuperAppUniversalWidgetTextBlockDto superAppUniversalWidgetTextBlockDto3, List list, SuperAppUniversalWidgetButtonDto superAppUniversalWidgetButtonDto, List list2, int i, zcl zclVar) {
        this(superAppUniversalWidgetTextBlockDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextBlockDto2, (i & 4) != 0 ? null : superAppUniversalWidgetTextBlockDto3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : superAppUniversalWidgetButtonDto, (i & 32) != 0 ? null : list2);
    }
}
