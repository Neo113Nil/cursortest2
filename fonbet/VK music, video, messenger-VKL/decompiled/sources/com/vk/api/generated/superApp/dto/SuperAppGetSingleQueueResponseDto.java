package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppGetSingleQueueResponseDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppGetSingleQueueResponseDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppGetSingleQueueResponseDto> CREATOR = new a();

    @pmi0("queue")
    private final SuperAppQueueSubscriptionInfoDto queue;

    /* compiled from: SuperAppGetSingleQueueResponseDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppGetSingleQueueResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppGetSingleQueueResponseDto createFromParcel(Parcel parcel) {
            return new SuperAppGetSingleQueueResponseDto(parcel.readInt() == 0 ? null : SuperAppQueueSubscriptionInfoDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppGetSingleQueueResponseDto[] newArray(int i) {
            return new SuperAppGetSingleQueueResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppGetSingleQueueResponseDto() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final SuperAppQueueSubscriptionInfoDto d() {
        return this.queue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SuperAppGetSingleQueueResponseDto) && epx.f(this.queue, ((SuperAppGetSingleQueueResponseDto) obj).queue);
    }

    public final int hashCode() {
        SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto = this.queue;
        if (superAppQueueSubscriptionInfoDto == null) {
            return 0;
        }
        return superAppQueueSubscriptionInfoDto.hashCode();
    }

    public final String toString() {
        return "SuperAppGetSingleQueueResponseDto(queue=" + this.queue + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto = this.queue;
        if (superAppQueueSubscriptionInfoDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            superAppQueueSubscriptionInfoDto.writeToParcel(parcel, i);
        }
    }

    public SuperAppGetSingleQueueResponseDto(SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto) {
        this.queue = superAppQueueSubscriptionInfoDto;
    }

    public /* synthetic */ SuperAppGetSingleQueueResponseDto(SuperAppQueueSubscriptionInfoDto superAppQueueSubscriptionInfoDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : superAppQueueSubscriptionInfoDto);
    }
}
