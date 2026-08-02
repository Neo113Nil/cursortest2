package com.vk.api.generated.base.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: BaseRepostsInfoDto.kt */
/* loaded from: classes14.dex */
public final class BaseRepostsInfoDto implements Parcelable {
    public static final Parcelable.Creator<BaseRepostsInfoDto> CREATOR = new a();

    @pmi0("count")
    private final int count;

    @pmi0("mail_count")
    private final Integer mailCount;

    @pmi0("user_reposted")
    private final BaseBoolIntDto userReposted;

    @pmi0("wall_count")
    private final Integer wallCount;

    /* compiled from: BaseRepostsInfoDto.kt */
    public static final class a implements Parcelable.Creator<BaseRepostsInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final BaseRepostsInfoDto createFromParcel(Parcel parcel) {
            return new BaseRepostsInfoDto(parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? BaseBoolIntDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final BaseRepostsInfoDto[] newArray(int i) {
            return new BaseRepostsInfoDto[i];
        }
    }

    public BaseRepostsInfoDto(int i, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto) {
        this.count = i;
        this.wallCount = num;
        this.mailCount = num2;
        this.userReposted = baseBoolIntDto;
    }

    public final Integer d() {
        return this.mailCount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final BaseBoolIntDto e() {
        return this.userReposted;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BaseRepostsInfoDto)) {
            return false;
        }
        BaseRepostsInfoDto baseRepostsInfoDto = (BaseRepostsInfoDto) obj;
        return this.count == baseRepostsInfoDto.count && epx.f(this.wallCount, baseRepostsInfoDto.wallCount) && epx.f(this.mailCount, baseRepostsInfoDto.mailCount) && this.userReposted == baseRepostsInfoDto.userReposted;
    }

    public final Integer f() {
        return this.wallCount;
    }

    public final int getCount() {
        return this.count;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.count) * 31;
        Integer num = this.wallCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.mailCount;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        BaseBoolIntDto baseBoolIntDto = this.userReposted;
        return hashCode3 + (baseBoolIntDto != null ? baseBoolIntDto.hashCode() : 0);
    }

    public final String toString() {
        return "BaseRepostsInfoDto(count=" + this.count + ", wallCount=" + this.wallCount + ", mailCount=" + this.mailCount + ", userReposted=" + this.userReposted + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.count);
        Integer num = this.wallCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.mailCount;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        BaseBoolIntDto baseBoolIntDto = this.userReposted;
        if (baseBoolIntDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseBoolIntDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ BaseRepostsInfoDto(int i, Integer num, Integer num2, BaseBoolIntDto baseBoolIntDto, int i2, zcl zclVar) {
        this(i, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : baseBoolIntDto);
    }
}
