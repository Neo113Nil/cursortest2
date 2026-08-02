package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedMediaDiscoverBlockHeaderDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedMediaDiscoverBlockHeaderDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedMediaDiscoverBlockHeaderDto> CREATOR = new a();

    @pmi0("title")
    private final String title;

    /* compiled from: NewsfeedMediaDiscoverBlockHeaderDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedMediaDiscoverBlockHeaderDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverBlockHeaderDto createFromParcel(Parcel parcel) {
            return new NewsfeedMediaDiscoverBlockHeaderDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedMediaDiscoverBlockHeaderDto[] newArray(int i) {
            return new NewsfeedMediaDiscoverBlockHeaderDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedMediaDiscoverBlockHeaderDto() {
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
        return (obj instanceof NewsfeedMediaDiscoverBlockHeaderDto) && epx.f(this.title, ((NewsfeedMediaDiscoverBlockHeaderDto) obj).title);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NewsfeedMediaDiscoverBlockHeaderDto(title="), this.title, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
    }

    public NewsfeedMediaDiscoverBlockHeaderDto(String str) {
        this.title = str;
    }

    public /* synthetic */ NewsfeedMediaDiscoverBlockHeaderDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
