package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.api.generated.exploreWidgets.dto.ExploreWidgetsBaseActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppWidgetGreetingSubtitleItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetGreetingSubtitleItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetGreetingSubtitleItemDto> CREATOR = new a();

    @pmi0("action")
    private final ExploreWidgetsBaseActionDto action;

    @pmi0("additional_text")
    private final String additionalText;

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("text")
    private final String text;

    /* compiled from: SuperAppWidgetGreetingSubtitleItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetGreetingSubtitleItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetGreetingSubtitleItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(SuperAppWidgetGreetingSubtitleItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new SuperAppWidgetGreetingSubtitleItemDto(readString, readString2, arrayList, (ExploreWidgetsBaseActionDto) parcel.readParcelable(SuperAppWidgetGreetingSubtitleItemDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetGreetingSubtitleItemDto[] newArray(int i) {
            return new SuperAppWidgetGreetingSubtitleItemDto[i];
        }
    }

    public SuperAppWidgetGreetingSubtitleItemDto(String str, String str2, List<BaseImageDto> list, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto) {
        this.text = str;
        this.additionalText = str2;
        this.icon = list;
        this.action = exploreWidgetsBaseActionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetGreetingSubtitleItemDto)) {
            return false;
        }
        SuperAppWidgetGreetingSubtitleItemDto superAppWidgetGreetingSubtitleItemDto = (SuperAppWidgetGreetingSubtitleItemDto) obj;
        return epx.f(this.text, superAppWidgetGreetingSubtitleItemDto.text) && epx.f(this.additionalText, superAppWidgetGreetingSubtitleItemDto.additionalText) && epx.f(this.icon, superAppWidgetGreetingSubtitleItemDto.icon) && epx.f(this.action, superAppWidgetGreetingSubtitleItemDto.action);
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.additionalText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<BaseImageDto> list = this.icon;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto = this.action;
        return hashCode3 + (exploreWidgetsBaseActionDto != null ? exploreWidgetsBaseActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppWidgetGreetingSubtitleItemDto(text=" + this.text + ", additionalText=" + this.additionalText + ", icon=" + this.icon + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.additionalText);
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ SuperAppWidgetGreetingSubtitleItemDto(String str, String str2, List list, ExploreWidgetsBaseActionDto exploreWidgetsBaseActionDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : exploreWidgetsBaseActionDto);
    }
}
