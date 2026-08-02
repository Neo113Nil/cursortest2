package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderTooltipDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderTooltipDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderTooltipDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedNewsfeedItemHeaderTooltipDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderTooltipDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderTooltipDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderTooltipDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderTooltipDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderTooltipDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderTooltipDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.text;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedNewsfeedItemHeaderTooltipDto) && epx.f(this.text, ((NewsfeedNewsfeedItemHeaderTooltipDto) obj).text);
    }

    public final int hashCode() {
        String str = this.text;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NewsfeedNewsfeedItemHeaderTooltipDto(text="), this.text, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
    }

    public NewsfeedNewsfeedItemHeaderTooltipDto(String str) {
        this.text = str;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderTooltipDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
