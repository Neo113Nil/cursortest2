package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.bh10;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AppsRequestFromItemDto.kt */
/* loaded from: classes14.dex */
public final class AppsRequestFromItemDto implements Parcelable {
    public static final Parcelable.Creator<AppsRequestFromItemDto> CREATOR = new a();

    @pmi0("date")
    private final int date;

    @pmi0("from_id")
    private final long fromId;

    @pmi0("id")
    private final int id;

    @pmi0("key")
    private final String key;

    /* compiled from: AppsRequestFromItemDto.kt */
    public static final class a implements Parcelable.Creator<AppsRequestFromItemDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsRequestFromItemDto createFromParcel(Parcel parcel) {
            return new AppsRequestFromItemDto(parcel.readInt(), parcel.readLong(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsRequestFromItemDto[] newArray(int i) {
            return new AppsRequestFromItemDto[i];
        }
    }

    public AppsRequestFromItemDto(int i, long j, int i2, String str) {
        this.id = i;
        this.fromId = j;
        this.date = i2;
        this.key = str;
    }

    public final int d() {
        return this.date;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long e() {
        return this.fromId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsRequestFromItemDto)) {
            return false;
        }
        AppsRequestFromItemDto appsRequestFromItemDto = (AppsRequestFromItemDto) obj;
        return this.id == appsRequestFromItemDto.id && this.fromId == appsRequestFromItemDto.fromId && this.date == appsRequestFromItemDto.date && epx.f(this.key, appsRequestFromItemDto.key);
    }

    public final String f() {
        return this.key;
    }

    public final int getId() {
        return this.id;
    }

    public final int hashCode() {
        int a2 = shy.a(this.date, bh10.a(Integer.hashCode(this.id) * 31, 31, this.fromId), 31);
        String str = this.key;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsRequestFromItemDto(id=");
        sb.append(this.id);
        sb.append(", fromId=");
        sb.append(this.fromId);
        sb.append(", date=");
        sb.append(this.date);
        sb.append(", key=");
        return ho8.a(sb, this.key, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.id);
        parcel.writeLong(this.fromId);
        parcel.writeInt(this.date);
        parcel.writeString(this.key);
    }

    public /* synthetic */ AppsRequestFromItemDto(int i, long j, int i2, String str, int i3, zcl zclVar) {
        this(i, j, i2, (i3 & 8) != 0 ? null : str);
    }
}
