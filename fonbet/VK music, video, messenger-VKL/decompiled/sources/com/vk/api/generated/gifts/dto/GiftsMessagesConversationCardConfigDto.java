package com.vk.api.generated.gifts.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.dn;
import xsna.epx;
import xsna.fw3;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: GiftsMessagesConversationCardConfigDto.kt */
/* loaded from: classes14.dex */
public final class GiftsMessagesConversationCardConfigDto implements Parcelable {
    public static final Parcelable.Creator<GiftsMessagesConversationCardConfigDto> CREATOR = new a();

    @pmi0("images")
    private final List<BaseImageDto> images;

    @pmi0("placeholders")
    private final List<BaseImageDto> placeholders;

    @pmi0("type")
    private final String type;

    /* compiled from: GiftsMessagesConversationCardConfigDto.kt */
    public static final class a implements Parcelable.Creator<GiftsMessagesConversationCardConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final GiftsMessagesConversationCardConfigDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(GiftsMessagesConversationCardConfigDto.class, parcel, arrayList2, i2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt2);
                while (i != readInt2) {
                    i = bo.b(GiftsMessagesConversationCardConfigDto.class, parcel, arrayList3, i, 1);
                }
                arrayList = arrayList3;
            }
            return new GiftsMessagesConversationCardConfigDto(readString, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final GiftsMessagesConversationCardConfigDto[] newArray(int i) {
            return new GiftsMessagesConversationCardConfigDto[i];
        }
    }

    public GiftsMessagesConversationCardConfigDto(String str, List<BaseImageDto> list, List<BaseImageDto> list2) {
        this.type = str;
        this.images = list;
        this.placeholders = list2;
    }

    public final List<BaseImageDto> d() {
        return this.images;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.placeholders;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GiftsMessagesConversationCardConfigDto)) {
            return false;
        }
        GiftsMessagesConversationCardConfigDto giftsMessagesConversationCardConfigDto = (GiftsMessagesConversationCardConfigDto) obj;
        return epx.f(this.type, giftsMessagesConversationCardConfigDto.type) && epx.f(this.images, giftsMessagesConversationCardConfigDto.images) && epx.f(this.placeholders, giftsMessagesConversationCardConfigDto.placeholders);
    }

    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int a2 = fw3.a(this.type.hashCode() * 31, 31, this.images);
        List<BaseImageDto> list = this.placeholders;
        return a2 + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftsMessagesConversationCardConfigDto(type=");
        sb.append(this.type);
        sb.append(", images=");
        sb.append(this.images);
        sb.append(", placeholders=");
        return ms9.a(')', sb, this.placeholders);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        Iterator a2 = ao.a(parcel, this.images);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        List<BaseImageDto> list = this.placeholders;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeParcelable((Parcelable) f.next(), i);
        }
    }

    public /* synthetic */ GiftsMessagesConversationCardConfigDto(String str, List list, List list2, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : list2);
    }
}
