package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;
import xsna.zyk0;

/* compiled from: SuperAppUniversalWidgetImageStackBasePayloadDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetImageStackBasePayloadDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetImageStackBasePayloadDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("items")
    private final List<PhotosPhotoDto> items;

    @pmi0("last_image_text")
    private final String lastImageText;

    /* compiled from: SuperAppUniversalWidgetImageStackBasePayloadDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageStackBasePayloadDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackBasePayloadDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(SuperAppUniversalWidgetImageStackBasePayloadDto.class, parcel, arrayList, i, 1);
            }
            return new SuperAppUniversalWidgetImageStackBasePayloadDto(arrayList, (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetImageStackBasePayloadDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageStackBasePayloadDto[] newArray(int i) {
            return new SuperAppUniversalWidgetImageStackBasePayloadDto[i];
        }
    }

    public SuperAppUniversalWidgetImageStackBasePayloadDto(List<PhotosPhotoDto> list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str) {
        this.items = list;
        this.action = superAppUniversalWidgetActionDto;
        this.lastImageText = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetImageStackBasePayloadDto)) {
            return false;
        }
        SuperAppUniversalWidgetImageStackBasePayloadDto superAppUniversalWidgetImageStackBasePayloadDto = (SuperAppUniversalWidgetImageStackBasePayloadDto) obj;
        return epx.f(this.items, superAppUniversalWidgetImageStackBasePayloadDto.items) && epx.f(this.action, superAppUniversalWidgetImageStackBasePayloadDto.action) && epx.f(this.lastImageText, superAppUniversalWidgetImageStackBasePayloadDto.lastImageText);
    }

    public final int hashCode() {
        int a2 = zyk0.a(this.action, this.items.hashCode() * 31, 31);
        String str = this.lastImageText;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetImageStackBasePayloadDto(items=");
        sb.append(this.items);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", lastImageText=");
        return ho8.a(sb, this.lastImageText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.lastImageText);
    }

    public /* synthetic */ SuperAppUniversalWidgetImageStackBasePayloadDto(List list, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, String str, int i, zcl zclVar) {
        this(list, superAppUniversalWidgetActionDto, (i & 4) != 0 ? null : str);
    }
}
