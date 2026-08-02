package com.vk.api.generated.topshelf.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: TopshelfTopshelfLiveItemDto.kt */
/* loaded from: classes15.dex */
public final class TopshelfTopshelfLiveItemDto implements Parcelable {
    public static final Parcelable.Creator<TopshelfTopshelfLiveItemDto> CREATOR = new a();

    @pmi0("icon")
    private final List<BaseImageDto> icon;

    @pmi0("text")
    private final String text;

    /* compiled from: TopshelfTopshelfLiveItemDto.kt */
    public static final class a implements Parcelable.Creator<TopshelfTopshelfLiveItemDto> {
        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfLiveItemDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(TopshelfTopshelfLiveItemDto.class, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new TopshelfTopshelfLiveItemDto(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TopshelfTopshelfLiveItemDto[] newArray(int i) {
            return new TopshelfTopshelfLiveItemDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TopshelfTopshelfLiveItemDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TopshelfTopshelfLiveItemDto)) {
            return false;
        }
        TopshelfTopshelfLiveItemDto topshelfTopshelfLiveItemDto = (TopshelfTopshelfLiveItemDto) obj;
        return epx.f(this.icon, topshelfTopshelfLiveItemDto.icon) && epx.f(this.text, topshelfTopshelfLiveItemDto.text);
    }

    public final int hashCode() {
        List<BaseImageDto> list = this.icon;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.text;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopshelfTopshelfLiveItemDto(icon=");
        sb.append(this.icon);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<BaseImageDto> list = this.icon;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        parcel.writeString(this.text);
    }

    public TopshelfTopshelfLiveItemDto(List<BaseImageDto> list, String str) {
        this.icon = list;
        this.text = str;
    }

    public /* synthetic */ TopshelfTopshelfLiveItemDto(List list, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : str);
    }
}
