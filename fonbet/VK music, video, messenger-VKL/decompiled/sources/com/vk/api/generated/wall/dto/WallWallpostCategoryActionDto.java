package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseOwnerButtonActionDto;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostCategoryActionDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostCategoryActionDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostCategoryActionDto> CREATOR = new a();

    @pmi0("action")
    private final BaseOwnerButtonActionDto action;

    @pmi0("name")
    private final String name;

    /* compiled from: WallWallpostCategoryActionDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostCategoryActionDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostCategoryActionDto createFromParcel(Parcel parcel) {
            return new WallWallpostCategoryActionDto((BaseOwnerButtonActionDto) parcel.readParcelable(WallWallpostCategoryActionDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostCategoryActionDto[] newArray(int i) {
            return new WallWallpostCategoryActionDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallpostCategoryActionDto() {
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
        if (!(obj instanceof WallWallpostCategoryActionDto)) {
            return false;
        }
        WallWallpostCategoryActionDto wallWallpostCategoryActionDto = (WallWallpostCategoryActionDto) obj;
        return epx.f(this.action, wallWallpostCategoryActionDto.action) && epx.f(this.name, wallWallpostCategoryActionDto.name);
    }

    public final int hashCode() {
        BaseOwnerButtonActionDto baseOwnerButtonActionDto = this.action;
        int hashCode = (baseOwnerButtonActionDto == null ? 0 : baseOwnerButtonActionDto.hashCode()) * 31;
        String str = this.name;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WallWallpostCategoryActionDto(action=");
        sb.append(this.action);
        sb.append(", name=");
        return ho8.a(sb, this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.action, i);
        parcel.writeString(this.name);
    }

    public WallWallpostCategoryActionDto(BaseOwnerButtonActionDto baseOwnerButtonActionDto, String str) {
        this.action = baseOwnerButtonActionDto;
        this.name = str;
    }

    public /* synthetic */ WallWallpostCategoryActionDto(BaseOwnerButtonActionDto baseOwnerButtonActionDto, String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : baseOwnerButtonActionDto, (i & 2) != 0 ? null : str);
    }
}
