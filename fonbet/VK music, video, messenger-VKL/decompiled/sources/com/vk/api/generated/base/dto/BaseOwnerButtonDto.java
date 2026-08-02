package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: BaseOwnerButtonDto.kt */
/* loaded from: classes14.dex */
public final class BaseOwnerButtonDto implements Parcelable {
    public static final Parcelable.Creator<BaseOwnerButtonDto> CREATOR = new a();

    @pmi0("action")
    private final BaseOwnerButtonActionDto action;

    @pmi0("icons")
    private final List<BaseImageDto> icons;

    @pmi0("text_color")
    private final String textColor;

    @pmi0("title")
    private final String title;

    /* compiled from: BaseOwnerButtonDto.kt */
    public static final class a implements Parcelable.Creator<BaseOwnerButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseOwnerButtonDto createFromParcel(Parcel parcel) {
            BaseOwnerButtonActionDto createFromParcel = BaseOwnerButtonActionDto.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(BaseImageDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new BaseOwnerButtonDto(createFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BaseOwnerButtonDto[] newArray(int i) {
            return new BaseOwnerButtonDto[i];
        }
    }

    public BaseOwnerButtonDto(BaseOwnerButtonActionDto baseOwnerButtonActionDto, List<BaseImageDto> list, String str, String str2) {
        this.action = baseOwnerButtonActionDto;
        this.icons = list;
        this.title = str;
        this.textColor = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseOwnerButtonDto)) {
            return false;
        }
        BaseOwnerButtonDto baseOwnerButtonDto = (BaseOwnerButtonDto) obj;
        return epx.f(this.action, baseOwnerButtonDto.action) && epx.f(this.icons, baseOwnerButtonDto.icons) && epx.f(this.title, baseOwnerButtonDto.title) && epx.f(this.textColor, baseOwnerButtonDto.textColor);
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(this.action.hashCode() * 31, 31, this.icons), 31, this.title);
        String str = this.textColor;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseOwnerButtonDto(action=");
        sb.append(this.action);
        sb.append(", icons=");
        sb.append(this.icons);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", textColor=");
        return ho8.a(sb, this.textColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.action.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.icons);
        while (a2.hasNext()) {
            ((BaseImageDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.textColor);
    }

    public /* synthetic */ BaseOwnerButtonDto(BaseOwnerButtonActionDto baseOwnerButtonActionDto, List list, String str, String str2, int i, zcl zclVar) {
        this(baseOwnerButtonActionDto, list, str, (i & 8) != 0 ? null : str2);
    }
}
