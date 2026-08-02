package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.urd0;

/* compiled from: NewsfeedDzenCompilationInfoPopupDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenCompilationInfoPopupDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenCompilationInfoPopupDto> CREATOR = new a();

    @pmi0("button")
    private final NewsfeedDzenTextDto button;

    @pmi0("image")
    private final NewsfeedNewsfeedItemHeaderImageDto image;

    @pmi0("text")
    private final String text;

    /* compiled from: NewsfeedDzenCompilationInfoPopupDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenCompilationInfoPopupDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenCompilationInfoPopupDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenCompilationInfoPopupDto((NewsfeedNewsfeedItemHeaderImageDto) parcel.readParcelable(NewsfeedDzenCompilationInfoPopupDto.class.getClassLoader()), parcel.readString(), NewsfeedDzenTextDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenCompilationInfoPopupDto[] newArray(int i) {
            return new NewsfeedDzenCompilationInfoPopupDto[i];
        }
    }

    public NewsfeedDzenCompilationInfoPopupDto(NewsfeedNewsfeedItemHeaderImageDto newsfeedNewsfeedItemHeaderImageDto, String str, NewsfeedDzenTextDto newsfeedDzenTextDto) {
        this.image = newsfeedNewsfeedItemHeaderImageDto;
        this.text = str;
        this.button = newsfeedDzenTextDto;
    }

    public final NewsfeedDzenTextDto d() {
        return this.button;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final NewsfeedNewsfeedItemHeaderImageDto e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenCompilationInfoPopupDto)) {
            return false;
        }
        NewsfeedDzenCompilationInfoPopupDto newsfeedDzenCompilationInfoPopupDto = (NewsfeedDzenCompilationInfoPopupDto) obj;
        return epx.f(this.image, newsfeedDzenCompilationInfoPopupDto.image) && epx.f(this.text, newsfeedDzenCompilationInfoPopupDto.text) && epx.f(this.button, newsfeedDzenCompilationInfoPopupDto.button);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        return this.button.hashCode() + urd0.a(this.image.hashCode() * 31, 31, this.text);
    }

    public final String toString() {
        return "NewsfeedDzenCompilationInfoPopupDto(image=" + this.image + ", text=" + this.text + ", button=" + this.button + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.image, i);
        parcel.writeString(this.text);
        this.button.writeToParcel(parcel, i);
    }
}
