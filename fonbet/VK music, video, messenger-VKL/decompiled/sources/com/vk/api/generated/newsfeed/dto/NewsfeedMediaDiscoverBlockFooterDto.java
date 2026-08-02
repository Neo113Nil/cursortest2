package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedMediaDiscoverBlockFooterDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedMediaDiscoverBlockFooterDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedMediaDiscoverBlockFooterDto> CREATOR = new a();

    @pmi0("button_title")
    private final String buttonTitle;

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedMediaDiscoverBlockFooterDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverBlockFooterDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverBlockFooterDto createFromParcel(Parcel parcel) {
            return new NewsfeedMediaDiscoverBlockFooterDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverBlockFooterDto[] newArray(int i) {
            return new NewsfeedMediaDiscoverBlockFooterDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedMediaDiscoverBlockFooterDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.buttonTitle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedMediaDiscoverBlockFooterDto)) {
            return false;
        }
        NewsfeedMediaDiscoverBlockFooterDto newsfeedMediaDiscoverBlockFooterDto = (NewsfeedMediaDiscoverBlockFooterDto) obj;
        return epx.f(this.buttonTitle, newsfeedMediaDiscoverBlockFooterDto.buttonTitle) && epx.f(this.text, newsfeedMediaDiscoverBlockFooterDto.text);
    }

    public final int hashCode() {
        String str = this.buttonTitle;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedMediaDiscoverBlockFooterDto(buttonTitle=");
        sb.append(this.buttonTitle);
        sb.append(", text=");
        return ho8.a(sb, this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.buttonTitle);
        parcel.writeString(this.text);
    }

    public NewsfeedMediaDiscoverBlockFooterDto(String str, String str2) {
        this.buttonTitle = str;
        this.text = str2;
    }

    public /* synthetic */ NewsfeedMediaDiscoverBlockFooterDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
