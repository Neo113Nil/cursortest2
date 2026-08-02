package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemColorDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemColorDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemColorDto> CREATOR = new a();

    @pmi0("dark")
    private final String dark;

    @pmi0("light")
    private final String light;

    /* compiled from: NewsfeedNewsfeedItemColorDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemColorDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemColorDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemColorDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemColorDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemColorDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemColorDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.light;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemColorDto)) {
            return false;
        }
        NewsfeedNewsfeedItemColorDto newsfeedNewsfeedItemColorDto = (NewsfeedNewsfeedItemColorDto) obj;
        return epx.f(this.light, newsfeedNewsfeedItemColorDto.light) && epx.f(this.dark, newsfeedNewsfeedItemColorDto.dark);
    }

    public final int hashCode() {
        String str = this.light;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dark;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedNewsfeedItemColorDto(light=");
        sb.append(this.light);
        sb.append(", dark=");
        return ho8.a(sb, this.dark, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.light);
        parcel.writeString(this.dark);
    }

    public NewsfeedNewsfeedItemColorDto(String str, String str2) {
        this.light = str;
        this.dark = str2;
    }

    public /* synthetic */ NewsfeedNewsfeedItemColorDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
