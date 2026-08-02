package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsGameTagDto.kt */
/* loaded from: classes14.dex */
public final class AppsGameTagDto implements Parcelable {
    public static final Parcelable.Creator<AppsGameTagDto> CREATOR = new a();

    @pmi0("apps_count")
    private final Integer appsCount;

    @pmi0("id")
    private final int id;

    @pmi0("name")
    private final String name;

    @pmi0("url")
    private final String url;

    /* compiled from: AppsGameTagDto.kt */
    public static final class a implements Parcelable.Creator<AppsGameTagDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGameTagDto createFromParcel(Parcel parcel) {
            return new AppsGameTagDto(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGameTagDto[] newArray(int i) {
            return new AppsGameTagDto[i];
        }
    }

    public AppsGameTagDto(String str, String str2, int i, Integer num) {
        this.name = str;
        this.url = str2;
        this.id = i;
        this.appsCount = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGameTagDto)) {
            return false;
        }
        AppsGameTagDto appsGameTagDto = (AppsGameTagDto) obj;
        return epx.f(this.name, appsGameTagDto.name) && epx.f(this.url, appsGameTagDto.url) && this.id == appsGameTagDto.id && epx.f(this.appsCount, appsGameTagDto.appsCount);
    }

    public final int hashCode() {
        int a2 = shy.a(this.id, urd0.a(this.name.hashCode() * 31, 31, this.url), 31);
        Integer num = this.appsCount;
        return a2 + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGameTagDto(name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", appsCount=");
        return uqi.b(sb, this.appsCount, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.url);
        parcel.writeInt(this.id);
        Integer num = this.appsCount;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ AppsGameTagDto(String str, String str2, int i, Integer num, int i2, zcl zclVar) {
        this(str, str2, i, (i2 & 8) != 0 ? null : num);
    }
}
