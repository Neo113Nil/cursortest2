package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.appmetrica.analytics.impl.L2;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedNewsfeedItemHeaderBadgeDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedNewsfeedItemHeaderBadgeDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedNewsfeedItemHeaderBadgeDto> CREATOR = new a();

    @pmi0(L2.g)
    private final NewsfeedNewsfeedItemHeaderBackgroundDto background;

    @pmi0("text")
    private final NewsfeedNewsfeedItemHeaderTextDto text;

    /* compiled from: NewsfeedNewsfeedItemHeaderBadgeDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedNewsfeedItemHeaderBadgeDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderBadgeDto createFromParcel(Parcel parcel) {
            return new NewsfeedNewsfeedItemHeaderBadgeDto((NewsfeedNewsfeedItemHeaderTextDto) parcel.readParcelable(NewsfeedNewsfeedItemHeaderBadgeDto.class.getClassLoader()), parcel.readInt() == 0 ? null : NewsfeedNewsfeedItemHeaderBackgroundDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedNewsfeedItemHeaderBadgeDto[] newArray(int i) {
            return new NewsfeedNewsfeedItemHeaderBadgeDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedNewsfeedItemHeaderBadgeDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final NewsfeedNewsfeedItemHeaderBackgroundDto d() {
        return this.background;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderTextDto e() {
        return this.text;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedNewsfeedItemHeaderBadgeDto)) {
            return false;
        }
        NewsfeedNewsfeedItemHeaderBadgeDto newsfeedNewsfeedItemHeaderBadgeDto = (NewsfeedNewsfeedItemHeaderBadgeDto) obj;
        return epx.f(this.text, newsfeedNewsfeedItemHeaderBadgeDto.text) && epx.f(this.background, newsfeedNewsfeedItemHeaderBadgeDto.background);
    }

    public final int hashCode() {
        NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto = this.text;
        int hashCode = (newsfeedNewsfeedItemHeaderTextDto == null ? 0 : newsfeedNewsfeedItemHeaderTextDto.hashCode()) * 31;
        NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto = this.background;
        return hashCode + (newsfeedNewsfeedItemHeaderBackgroundDto != null ? newsfeedNewsfeedItemHeaderBackgroundDto.hashCode() : 0);
    }

    public final String toString() {
        return "NewsfeedNewsfeedItemHeaderBadgeDto(text=" + this.text + ", background=" + this.background + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.text, i);
        NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto = this.background;
        if (newsfeedNewsfeedItemHeaderBackgroundDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedNewsfeedItemHeaderBackgroundDto.writeToParcel(parcel, i);
        }
    }

    public NewsfeedNewsfeedItemHeaderBadgeDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto) {
        this.text = newsfeedNewsfeedItemHeaderTextDto;
        this.background = newsfeedNewsfeedItemHeaderBackgroundDto;
    }

    public /* synthetic */ NewsfeedNewsfeedItemHeaderBadgeDto(NewsfeedNewsfeedItemHeaderTextDto newsfeedNewsfeedItemHeaderTextDto, NewsfeedNewsfeedItemHeaderBackgroundDto newsfeedNewsfeedItemHeaderBackgroundDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : newsfeedNewsfeedItemHeaderTextDto, (i & 2) != 0 ? null : newsfeedNewsfeedItemHeaderBackgroundDto);
    }
}
