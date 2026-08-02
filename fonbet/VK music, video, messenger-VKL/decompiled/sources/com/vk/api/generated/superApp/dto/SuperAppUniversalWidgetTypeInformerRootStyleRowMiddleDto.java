package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto> CREATOR = new a();

    @pmi0("button")
    private final SuperAppUniversalWidgetButtonStyleDto button;

    @pmi0("buttons")
    private final List<SuperAppUniversalWidgetButtonStyleDto> buttons;

    @pmi0("second_subtitle")
    private final SuperAppUniversalWidgetTextStyleDto secondSubtitle;

    @pmi0("subtitle")
    private final SuperAppUniversalWidgetTextStyleDto subtitle;

    @pmi0("title")
    private final SuperAppUniversalWidgetTextStyleDto title;

    @pmi0("vertical_align")
    private final SuperAppUniversalWidgetVerticalAlignDto verticalAlign;

    /* compiled from: SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Parcelable.Creator<SuperAppUniversalWidgetTextStyleDto> creator = SuperAppUniversalWidgetTextStyleDto.CREATOR;
            SuperAppUniversalWidgetTextStyleDto createFromParcel = creator.createFromParcel(parcel);
            SuperAppUniversalWidgetTextStyleDto createFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            SuperAppUniversalWidgetTextStyleDto createFromParcel3 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            SuperAppUniversalWidgetButtonStyleDto createFromParcel4 = parcel.readInt() == 0 ? null : SuperAppUniversalWidgetButtonStyleDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(SuperAppUniversalWidgetButtonStyleDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto(createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, arrayList, parcel.readInt() != 0 ? SuperAppUniversalWidgetVerticalAlignDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto[] newArray(int i) {
            return new SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto[i];
        }
    }

    public SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto(SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3, SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto, List<SuperAppUniversalWidgetButtonStyleDto> list, SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto) {
        this.title = superAppUniversalWidgetTextStyleDto;
        this.subtitle = superAppUniversalWidgetTextStyleDto2;
        this.secondSubtitle = superAppUniversalWidgetTextStyleDto3;
        this.button = superAppUniversalWidgetButtonStyleDto;
        this.buttons = list;
        this.verticalAlign = superAppUniversalWidgetVerticalAlignDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto)) {
            return false;
        }
        SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto = (SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto) obj;
        return epx.f(this.title, superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.title) && epx.f(this.subtitle, superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.subtitle) && epx.f(this.secondSubtitle, superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.secondSubtitle) && epx.f(this.button, superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.button) && epx.f(this.buttons, superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.buttons) && this.verticalAlign == superAppUniversalWidgetTypeInformerRootStyleRowMiddleDto.verticalAlign;
    }

    public final int hashCode() {
        int hashCode = this.title.hashCode() * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.subtitle;
        int hashCode2 = (hashCode + (superAppUniversalWidgetTextStyleDto == null ? 0 : superAppUniversalWidgetTextStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.secondSubtitle;
        int hashCode3 = (hashCode2 + (superAppUniversalWidgetTextStyleDto2 == null ? 0 : superAppUniversalWidgetTextStyleDto2.hashCode())) * 31;
        SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto = this.button;
        int hashCode4 = (hashCode3 + (superAppUniversalWidgetButtonStyleDto == null ? 0 : superAppUniversalWidgetButtonStyleDto.hashCode())) * 31;
        List<SuperAppUniversalWidgetButtonStyleDto> list = this.buttons;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = this.verticalAlign;
        return hashCode5 + (superAppUniversalWidgetVerticalAlignDto != null ? superAppUniversalWidgetVerticalAlignDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto(title=" + this.title + ", subtitle=" + this.subtitle + ", secondSubtitle=" + this.secondSubtitle + ", button=" + this.button + ", buttons=" + this.buttons + ", verticalAlign=" + this.verticalAlign + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.title.writeToParcel(parcel, i);
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto = this.subtitle;
        if (superAppUniversalWidgetTextStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2 = this.secondSubtitle;
        if (superAppUniversalWidgetTextStyleDto2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetTextStyleDto2.writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto = this.button;
        if (superAppUniversalWidgetButtonStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetButtonStyleDto.writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetButtonStyleDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((SuperAppUniversalWidgetButtonStyleDto) f.next()).writeToParcel(parcel, i);
            }
        }
        SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto = this.verticalAlign;
        if (superAppUniversalWidgetVerticalAlignDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetVerticalAlignDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetTypeInformerRootStyleRowMiddleDto(SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto2, SuperAppUniversalWidgetTextStyleDto superAppUniversalWidgetTextStyleDto3, SuperAppUniversalWidgetButtonStyleDto superAppUniversalWidgetButtonStyleDto, List list, SuperAppUniversalWidgetVerticalAlignDto superAppUniversalWidgetVerticalAlignDto, int i, zcl zclVar) {
        this(superAppUniversalWidgetTextStyleDto, (i & 2) != 0 ? null : superAppUniversalWidgetTextStyleDto2, (i & 4) != 0 ? null : superAppUniversalWidgetTextStyleDto3, (i & 8) != 0 ? null : superAppUniversalWidgetButtonStyleDto, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : superAppUniversalWidgetVerticalAlignDto);
    }
}
