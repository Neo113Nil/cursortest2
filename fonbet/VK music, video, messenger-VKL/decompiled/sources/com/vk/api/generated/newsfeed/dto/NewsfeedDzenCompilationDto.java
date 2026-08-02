package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedDzenCompilationDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedDzenCompilationDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedDzenCompilationDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("info")
    private final NewsfeedDzenCompilationInfoDto info;

    /* compiled from: NewsfeedDzenCompilationDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedDzenCompilationDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenCompilationDto createFromParcel(Parcel parcel) {
            return new NewsfeedDzenCompilationDto(parcel.readString(), parcel.readInt() == 0 ? null : NewsfeedDzenCompilationInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedDzenCompilationDto[] newArray(int i) {
            return new NewsfeedDzenCompilationDto[i];
        }
    }

    public NewsfeedDzenCompilationDto(String str, NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto) {
        this.description = str;
        this.info = newsfeedDzenCompilationInfoDto;
    }

    public final NewsfeedDzenCompilationInfoDto d() {
        return this.info;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedDzenCompilationDto)) {
            return false;
        }
        NewsfeedDzenCompilationDto newsfeedDzenCompilationDto = (NewsfeedDzenCompilationDto) obj;
        return epx.f(this.description, newsfeedDzenCompilationDto.description) && epx.f(this.info, newsfeedDzenCompilationDto.info);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        int hashCode = this.description.hashCode() * 31;
        NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto = this.info;
        return hashCode + (newsfeedDzenCompilationInfoDto == null ? 0 : newsfeedDzenCompilationInfoDto.hashCode());
    }

    public final String toString() {
        return "NewsfeedDzenCompilationDto(description=" + this.description + ", info=" + this.info + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.description);
        NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto = this.info;
        if (newsfeedDzenCompilationInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            newsfeedDzenCompilationInfoDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ NewsfeedDzenCompilationDto(String str, NewsfeedDzenCompilationInfoDto newsfeedDzenCompilationInfoDto, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : newsfeedDzenCompilationInfoDto);
    }
}
