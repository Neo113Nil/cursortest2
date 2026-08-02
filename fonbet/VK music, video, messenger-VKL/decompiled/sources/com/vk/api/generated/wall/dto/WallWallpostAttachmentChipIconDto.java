package com.vk.api.generated.wall.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: WallWallpostAttachmentChipIconDto.kt */
/* loaded from: classes15.dex */
public final class WallWallpostAttachmentChipIconDto implements Parcelable {
    public static final Parcelable.Creator<WallWallpostAttachmentChipIconDto> CREATOR = new a();

    @pmi0("name")
    private final String name;

    /* compiled from: WallWallpostAttachmentChipIconDto.kt */
    public static final class a implements Parcelable.Creator<WallWallpostAttachmentChipIconDto> {
        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentChipIconDto createFromParcel(Parcel parcel) {
            return new WallWallpostAttachmentChipIconDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final WallWallpostAttachmentChipIconDto[] newArray(int i) {
            return new WallWallpostAttachmentChipIconDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WallWallpostAttachmentChipIconDto() {
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
        return (obj instanceof WallWallpostAttachmentChipIconDto) && epx.f(this.name, ((WallWallpostAttachmentChipIconDto) obj).name);
    }

    public final int hashCode() {
        String str = this.name;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("WallWallpostAttachmentChipIconDto(name="), this.name, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
    }

    public WallWallpostAttachmentChipIconDto(String str) {
        this.name = str;
    }

    public /* synthetic */ WallWallpostAttachmentChipIconDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
