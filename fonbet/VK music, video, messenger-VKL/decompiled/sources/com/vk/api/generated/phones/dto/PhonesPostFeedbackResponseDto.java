package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: PhonesPostFeedbackResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhonesPostFeedbackResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhonesPostFeedbackResponseDto> CREATOR = new a();

    @pmi0("is_posted")
    private final boolean isPosted;

    /* compiled from: PhonesPostFeedbackResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhonesPostFeedbackResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesPostFeedbackResponseDto createFromParcel(Parcel parcel) {
            return new PhonesPostFeedbackResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesPostFeedbackResponseDto[] newArray(int i) {
            return new PhonesPostFeedbackResponseDto[i];
        }
    }

    public PhonesPostFeedbackResponseDto(boolean z) {
        this.isPosted = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhonesPostFeedbackResponseDto) && this.isPosted == ((PhonesPostFeedbackResponseDto) obj).isPosted;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isPosted);
    }

    public final String toString() {
        return q0.a(new StringBuilder("PhonesPostFeedbackResponseDto(isPosted="), this.isPosted, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isPosted ? 1 : 0);
    }
}
