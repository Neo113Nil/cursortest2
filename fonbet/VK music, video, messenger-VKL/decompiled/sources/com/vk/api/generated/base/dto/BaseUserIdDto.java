package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import xsna.epx;
import xsna.gp;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseUserIdDto.kt */
/* loaded from: classes14.dex */
public final class BaseUserIdDto implements Parcelable {
    public static final Parcelable.Creator<BaseUserIdDto> CREATOR = new a();

    @pmi0("user_id")
    private final UserId userId;

    /* compiled from: BaseUserIdDto.kt */
    public static final class a implements Parcelable.Creator<BaseUserIdDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseUserIdDto createFromParcel(Parcel parcel) {
            return new BaseUserIdDto((UserId) parcel.readParcelable(BaseUserIdDto.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final BaseUserIdDto[] newArray(int i) {
            return new BaseUserIdDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BaseUserIdDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BaseUserIdDto) && epx.f(this.userId, ((BaseUserIdDto) obj).userId);
    }

    public final int hashCode() {
        UserId userId = this.userId;
        if (userId == null) {
            return 0;
        }
        return Long.hashCode(userId.b);
    }

    public final String toString() {
        return gp.b(new StringBuilder("BaseUserIdDto(userId="), this.userId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.userId, i);
    }

    public BaseUserIdDto(UserId userId) {
        this.userId = userId;
    }

    public /* synthetic */ BaseUserIdDto(UserId userId, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : userId);
    }
}
