package com.vk.api.generated.market.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.photos.dto.PhotosPhotoSizesDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;

/* compiled from: MarketItemVideoDto.kt */
/* loaded from: classes15.dex */
public final class MarketItemVideoDto implements Parcelable {
    public static final Parcelable.Creator<MarketItemVideoDto> CREATOR = new a();

    @pmi0("duration")
    private final int duration;

    @pmi0("id")
    private final int id;

    @pmi0("is_moderation_ok")
    private final boolean isModerationOk;

    @pmi0("preview")
    private final List<PhotosPhotoSizesDto> preview;

    @pmi0("title")
    private final String title;

    /* compiled from: MarketItemVideoDto.kt */
    public static final class a implements Parcelable.Creator<MarketItemVideoDto> {
        @Override // android.os.Parcelable.Creator
        public final MarketItemVideoDto createFromParcel(Parcel parcel) {
            int i;
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            int readInt2 = parcel.readInt();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (i != readInt3) {
                i = bo.b(MarketItemVideoDto.class, parcel, arrayList, i, 1);
            }
            return new MarketItemVideoDto(readInt, readString, readInt2, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MarketItemVideoDto[] newArray(int i) {
            return new MarketItemVideoDto[i];
        }
    }

    public MarketItemVideoDto(int i, String str, int i2, boolean z, List<PhotosPhotoSizesDto> list) {
        this.id = i;
        this.title = str;
        this.duration = i2;
        this.isModerationOk = z;
        this.preview = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarketItemVideoDto)) {
            return false;
        }
        MarketItemVideoDto marketItemVideoDto = (MarketItemVideoDto) obj;
        return this.id == marketItemVideoDto.id && epx.f(this.title, marketItemVideoDto.title) && this.duration == marketItemVideoDto.duration && this.isModerationOk == marketItemVideoDto.isModerationOk && epx.f(this.preview, marketItemVideoDto.preview);
    }

    public final int hashCode() {
        return this.preview.hashCode() + qoy.b(shy.a(this.duration, urd0.a(Integer.hashCode(this.id) * 31, 31, this.title), 31), 31, this.isModerationOk);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketItemVideoDto(id=");
        sb.append(this.id);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", duration=");
        sb.append(this.duration);
        sb.append(", isModerationOk=");
        sb.append(this.isModerationOk);
        sb.append(", preview=");
        return ms9.a(')', sb, this.preview);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeString(this.title);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.isModerationOk ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.preview);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
    }
}
