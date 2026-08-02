package com.vk.api.generated.phones.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.pmi0;

/* compiled from: PhonesIsNeedFeedBackResponseDto.kt */
/* loaded from: classes15.dex */
public final class PhonesIsNeedFeedBackResponseDto implements Parcelable {
    public static final Parcelable.Creator<PhonesIsNeedFeedBackResponseDto> CREATOR = new a();

    @pmi0("need_feedback")
    private final boolean needFeedback;

    /* compiled from: PhonesIsNeedFeedBackResponseDto.kt */
    public static final class a implements Parcelable.Creator<PhonesIsNeedFeedBackResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final PhonesIsNeedFeedBackResponseDto createFromParcel(Parcel parcel) {
            return new PhonesIsNeedFeedBackResponseDto(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PhonesIsNeedFeedBackResponseDto[] newArray(int i) {
            return new PhonesIsNeedFeedBackResponseDto[i];
        }
    }

    public PhonesIsNeedFeedBackResponseDto(boolean z) {
        this.needFeedback = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PhonesIsNeedFeedBackResponseDto) && this.needFeedback == ((PhonesIsNeedFeedBackResponseDto) obj).needFeedback;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.needFeedback);
    }

    public final String toString() {
        return q0.a(new StringBuilder("PhonesIsNeedFeedBackResponseDto(needFeedback="), this.needFeedback, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.needFeedback ? 1 : 0);
    }
}
