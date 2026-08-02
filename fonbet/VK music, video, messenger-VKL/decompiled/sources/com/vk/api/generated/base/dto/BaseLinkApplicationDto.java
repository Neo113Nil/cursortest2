package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.X3;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseLinkApplicationDto.kt */
/* loaded from: classes14.dex */
public final class BaseLinkApplicationDto implements Parcelable {
    public static final Parcelable.Creator<BaseLinkApplicationDto> CREATOR = new a();

    @pmi0("app_id")
    private final Float appId;

    @pmi0(X3.i.U)
    private final BaseLinkApplicationStoreDto store;

    /* compiled from: BaseLinkApplicationDto.kt */
    public static final class a implements Parcelable.Creator<BaseLinkApplicationDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseLinkApplicationDto createFromParcel(Parcel parcel) {
            return new BaseLinkApplicationDto(parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() != 0 ? BaseLinkApplicationStoreDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseLinkApplicationDto[] newArray(int i) {
            return new BaseLinkApplicationDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseLinkApplicationDto() {
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
        if (!(obj instanceof BaseLinkApplicationDto)) {
            return false;
        }
        BaseLinkApplicationDto baseLinkApplicationDto = (BaseLinkApplicationDto) obj;
        return epx.f(this.appId, baseLinkApplicationDto.appId) && epx.f(this.store, baseLinkApplicationDto.store);
    }

    public final int hashCode() {
        Float f = this.appId;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        BaseLinkApplicationStoreDto baseLinkApplicationStoreDto = this.store;
        return hashCode + (baseLinkApplicationStoreDto != null ? baseLinkApplicationStoreDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseLinkApplicationDto(appId=" + this.appId + ", store=" + this.store + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.appId;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        BaseLinkApplicationStoreDto baseLinkApplicationStoreDto = this.store;
        if (baseLinkApplicationStoreDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseLinkApplicationStoreDto.writeToParcel(parcel, i);
        }
    }

    public BaseLinkApplicationDto(Float f, BaseLinkApplicationStoreDto baseLinkApplicationStoreDto) {
        this.appId = f;
        this.store = baseLinkApplicationStoreDto;
    }

    public /* synthetic */ BaseLinkApplicationDto(Float f, BaseLinkApplicationStoreDto baseLinkApplicationStoreDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : baseLinkApplicationStoreDto);
    }
}
