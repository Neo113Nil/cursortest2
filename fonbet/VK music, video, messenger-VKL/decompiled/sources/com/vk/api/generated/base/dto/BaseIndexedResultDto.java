package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.bh10;
import xsna.epx;
import xsna.pmi0;

/* compiled from: BaseIndexedResultDto.kt */
/* loaded from: classes14.dex */
public final class BaseIndexedResultDto implements Parcelable {
    public static final Parcelable.Creator<BaseIndexedResultDto> CREATOR = new a();

    @pmi0("index")
    private final int index;

    @pmi0("is_success")
    private final boolean isSuccess;

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: BaseIndexedResultDto.kt */
    public static final class a implements Parcelable.Creator<BaseIndexedResultDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseIndexedResultDto createFromParcel(Parcel parcel) {
            return new BaseIndexedResultDto(parcel.readInt(), (UserId) parcel.readParcelable(BaseIndexedResultDto.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseIndexedResultDto[] newArray(int i) {
            return new BaseIndexedResultDto[i];
        }
    }

    public BaseIndexedResultDto(int i, UserId userId, boolean z) {
        this.index = i;
        this.userId = userId;
        this.isSuccess = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseIndexedResultDto)) {
            return false;
        }
        BaseIndexedResultDto baseIndexedResultDto = (BaseIndexedResultDto) obj;
        return this.index == baseIndexedResultDto.index && epx.f(this.userId, baseIndexedResultDto.userId) && this.isSuccess == baseIndexedResultDto.isSuccess;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isSuccess) + bh10.a(Integer.hashCode(this.index) * 31, 31, this.userId.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseIndexedResultDto(index=");
        sb.append(this.index);
        sb.append(", userId=");
        sb.append(this.userId);
        sb.append(", isSuccess=");
        return q0.a(sb, this.isSuccess, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.index);
        parcel.writeParcelable(this.userId, i);
        parcel.writeInt(this.isSuccess ? 1 : 0);
    }
}
