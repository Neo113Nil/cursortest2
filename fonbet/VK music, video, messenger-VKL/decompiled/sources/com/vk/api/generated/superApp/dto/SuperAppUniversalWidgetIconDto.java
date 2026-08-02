package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetIconDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetIconDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetIconDto> CREATOR = new a();

    @pmi0("action")
    private final SuperAppUniversalWidgetActionDto action;

    @pmi0("items")
    private final List<SuperAppUniversalWidgetImageItemDto> items;

    @pmi0(TtmlNode.TAG_STYLE)
    private final SuperAppUniversalWidgetIconStyleDto style;

    /* compiled from: SuperAppUniversalWidgetIconDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetIconDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetIconDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(SuperAppUniversalWidgetImageItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SuperAppUniversalWidgetIconDto(arrayList, parcel.readInt() == 0 ? null : SuperAppUniversalWidgetIconStyleDto.CREATOR.createFromParcel(parcel), (SuperAppUniversalWidgetActionDto) parcel.readParcelable(SuperAppUniversalWidgetIconDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetIconDto[] newArray(int i) {
            return new SuperAppUniversalWidgetIconDto[i];
        }
    }

    public SuperAppUniversalWidgetIconDto(List<SuperAppUniversalWidgetImageItemDto> list, SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto) {
        this.items = list;
        this.style = superAppUniversalWidgetIconStyleDto;
        this.action = superAppUniversalWidgetActionDto;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetIconDto)) {
            return false;
        }
        SuperAppUniversalWidgetIconDto superAppUniversalWidgetIconDto = (SuperAppUniversalWidgetIconDto) obj;
        return epx.f(this.items, superAppUniversalWidgetIconDto.items) && epx.f(this.style, superAppUniversalWidgetIconDto.style) && epx.f(this.action, superAppUniversalWidgetIconDto.action);
    }

    public final int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = this.style;
        int hashCode2 = (hashCode + (superAppUniversalWidgetIconStyleDto == null ? 0 : superAppUniversalWidgetIconStyleDto.hashCode())) * 31;
        SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto = this.action;
        return hashCode2 + (superAppUniversalWidgetActionDto != null ? superAppUniversalWidgetActionDto.hashCode() : 0);
    }

    public final String toString() {
        return "SuperAppUniversalWidgetIconDto(items=" + this.items + ", style=" + this.style + ", action=" + this.action + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SuperAppUniversalWidgetImageItemDto) a2.next()).writeToParcel(parcel, i);
        }
        SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto = this.style;
        if (superAppUniversalWidgetIconStyleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppUniversalWidgetIconStyleDto.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.action, i);
    }

    public /* synthetic */ SuperAppUniversalWidgetIconDto(List list, SuperAppUniversalWidgetIconStyleDto superAppUniversalWidgetIconStyleDto, SuperAppUniversalWidgetActionDto superAppUniversalWidgetActionDto, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? null : superAppUniversalWidgetIconStyleDto, (i & 4) != 0 ? null : superAppUniversalWidgetActionDto);
    }
}
