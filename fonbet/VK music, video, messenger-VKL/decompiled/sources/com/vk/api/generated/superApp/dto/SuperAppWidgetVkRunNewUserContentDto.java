package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: SuperAppWidgetVkRunNewUserContentDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetVkRunNewUserContentDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetVkRunNewUserContentDto> CREATOR = new a();

    @pmi0("icon")
    private final List<SuperAppUniversalWidgetImageItemDto> icon;

    @pmi0("icon_dark")
    private final List<SuperAppUniversalWidgetImageItemDto> iconDark;

    @pmi0("main_text")
    private final String mainText;

    @pmi0("secondary_text")
    private final String secondaryText;

    /* compiled from: SuperAppWidgetVkRunNewUserContentDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetVkRunNewUserContentDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkRunNewUserContentDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new SuperAppWidgetVkRunNewUserContentDto(readString, readString2, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetVkRunNewUserContentDto[] newArray(int i) {
            return new SuperAppWidgetVkRunNewUserContentDto[i];
        }
    }

    public SuperAppWidgetVkRunNewUserContentDto(String str, String str2, List<SuperAppUniversalWidgetImageItemDto> list, List<SuperAppUniversalWidgetImageItemDto> list2) {
        this.mainText = str;
        this.secondaryText = str2;
        this.icon = list;
        this.iconDark = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetVkRunNewUserContentDto)) {
            return false;
        }
        SuperAppWidgetVkRunNewUserContentDto superAppWidgetVkRunNewUserContentDto = (SuperAppWidgetVkRunNewUserContentDto) obj;
        return epx.f(this.mainText, superAppWidgetVkRunNewUserContentDto.mainText) && epx.f(this.secondaryText, superAppWidgetVkRunNewUserContentDto.secondaryText) && epx.f(this.icon, superAppWidgetVkRunNewUserContentDto.icon) && epx.f(this.iconDark, superAppWidgetVkRunNewUserContentDto.iconDark);
    }

    public final int hashCode() {
        int a2 = fw3.a(urd0.a(this.mainText.hashCode() * 31, 31, this.secondaryText), 31, this.icon);
        List<SuperAppUniversalWidgetImageItemDto> list = this.iconDark;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetVkRunNewUserContentDto(mainText=");
        sb.append(this.mainText);
        sb.append(", secondaryText=");
        sb.append(this.secondaryText);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", iconDark=");
        return ms9.a(')', sb, this.iconDark);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mainText);
        parcel.writeString(this.secondaryText);
        Iterator a2 = ao.a(parcel, this.icon);
        while (a2.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
        }
        List<SuperAppUniversalWidgetImageItemDto> list = this.iconDark;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ SuperAppWidgetVkRunNewUserContentDto(String str, String str2, List list, List list2, int i, zcl zclVar) {
        this(str, str2, list, (i & 8) != 0 ? null : list2);
    }
}
