package com.vk.api.generated.stories.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.urd0;
import xsna.zcl;

/* compiled from: StoriesStatLineDto.kt */
/* loaded from: classes15.dex */
public final class StoriesStatLineDto implements Parcelable {
    public static final Parcelable.Creator<StoriesStatLineDto> CREATOR = new a();

    @pmi0("counter")
    private final Integer counter;

    @pmi0("is_unavailable")
    private final Boolean isUnavailable;

    @pmi0("name")
    private final String name;

    @pmi0("type")
    private final String type;

    /* compiled from: StoriesStatLineDto.kt */
    public static final class a implements Parcelable.Creator<StoriesStatLineDto> {
        @Override // android.os.Parcelable.Creator
        public final StoriesStatLineDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Boolean bool = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new StoriesStatLineDto(readString, readString2, valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final StoriesStatLineDto[] newArray(int i) {
            return new StoriesStatLineDto[i];
        }
    }

    public StoriesStatLineDto(String str, String str2, Integer num, Boolean bool) {
        this.name = str;
        this.type = str2;
        this.counter = num;
        this.isUnavailable = bool;
    }

    public final Integer d() {
        return this.counter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoriesStatLineDto)) {
            return false;
        }
        StoriesStatLineDto storiesStatLineDto = (StoriesStatLineDto) obj;
        return epx.f(this.name, storiesStatLineDto.name) && epx.f(this.type, storiesStatLineDto.type) && epx.f(this.counter, storiesStatLineDto.counter) && epx.f(this.isUnavailable, storiesStatLineDto.isUnavailable);
    }

    public final Boolean f() {
        return this.isUnavailable;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.name.hashCode() * 31, 31, this.type);
        Integer num = this.counter;
        int hashCode = (a2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.isUnavailable;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesStatLineDto(name=");
        sb.append(this.name);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", counter=");
        sb.append(this.counter);
        sb.append(", isUnavailable=");
        return tn.a(sb, this.isUnavailable, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeString(this.type);
        Integer num = this.counter;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Boolean bool = this.isUnavailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ StoriesStatLineDto(String str, String str2, Integer num, Boolean bool, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : bool);
    }
}
