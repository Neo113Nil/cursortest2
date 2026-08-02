package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: NewsfeedExpertCardWidgetRatingDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedExpertCardWidgetRatingDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedExpertCardWidgetRatingDto> CREATOR = new a();

    @pmi0("highlighted")
    private final Boolean highlighted;

    @pmi0("value")
    private final Float value;

    /* compiled from: NewsfeedExpertCardWidgetRatingDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedExpertCardWidgetRatingDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedExpertCardWidgetRatingDto createFromParcel(Parcel parcel) {
            Boolean bool = null;
            Float valueOf = parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new NewsfeedExpertCardWidgetRatingDto(valueOf, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedExpertCardWidgetRatingDto[] newArray(int i) {
            return new NewsfeedExpertCardWidgetRatingDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedExpertCardWidgetRatingDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedExpertCardWidgetRatingDto)) {
            return false;
        }
        NewsfeedExpertCardWidgetRatingDto newsfeedExpertCardWidgetRatingDto = (NewsfeedExpertCardWidgetRatingDto) obj;
        return epx.f(this.value, newsfeedExpertCardWidgetRatingDto.value) && epx.f(this.highlighted, newsfeedExpertCardWidgetRatingDto.highlighted);
    }

    public final int hashCode() {
        Float f = this.value;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        Boolean bool = this.highlighted;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedExpertCardWidgetRatingDto(value=");
        sb.append(this.value);
        sb.append(", highlighted=");
        return tn.a(sb, this.highlighted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Float f = this.value;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            b.d(parcel, 1, f);
        }
        Boolean bool = this.highlighted;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public NewsfeedExpertCardWidgetRatingDto(Float f, Boolean bool) {
        this.value = f;
        this.highlighted = bool;
    }

    public /* synthetic */ NewsfeedExpertCardWidgetRatingDto(Float f, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : bool);
    }
}
