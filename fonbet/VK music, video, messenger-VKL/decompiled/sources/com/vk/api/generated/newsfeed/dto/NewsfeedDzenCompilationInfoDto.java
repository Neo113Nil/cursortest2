package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;

/* compiled from: NewsfeedDzenCompilationInfoDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenCompilationInfoDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenCompilationInfoDto> CREATOR = new a();

    @pmi0("popup")
    private final NewsfeedDzenCompilationInfoPopupDto popup;

    /* compiled from: NewsfeedDzenCompilationInfoDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenCompilationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenCompilationInfoDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenCompilationInfoDto(NewsfeedDzenCompilationInfoPopupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenCompilationInfoDto[] newArray(int i) {
            return new NewsfeedDzenCompilationInfoDto[i];
        }
    }

    public NewsfeedDzenCompilationInfoDto(NewsfeedDzenCompilationInfoPopupDto newsfeedDzenCompilationInfoPopupDto) {
        this.popup = newsfeedDzenCompilationInfoPopupDto;
    }

    public final NewsfeedDzenCompilationInfoPopupDto d() {
        return this.popup;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof NewsfeedDzenCompilationInfoDto) && epx.f(this.popup, ((NewsfeedDzenCompilationInfoDto) obj).popup);
    }

    public final int hashCode() {
        return this.popup.hashCode();
    }

    public final String toString() {
        return "NewsfeedDzenCompilationInfoDto(popup=" + this.popup + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.popup.writeToParcel(parcel, i);
    }
}
