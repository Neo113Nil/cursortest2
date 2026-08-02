package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: NewsfeedCacheConfigDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedCacheConfigDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedCacheConfigDto> CREATOR = new a();

    @pmi0("item_ttl")
    private final Integer itemTtl;

    /* compiled from: NewsfeedCacheConfigDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedCacheConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedCacheConfigDto createFromParcel(Parcel parcel) {
            return new NewsfeedCacheConfigDto(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedCacheConfigDto[] newArray(int i) {
            return new NewsfeedCacheConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedCacheConfigDto() {
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
        return (obj instanceof NewsfeedCacheConfigDto) && epx.f(this.itemTtl, ((NewsfeedCacheConfigDto) obj).itemTtl);
    }

    public final int hashCode() {
        Integer num = this.itemTtl;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("NewsfeedCacheConfigDto(itemTtl="), this.itemTtl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.itemTtl;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public NewsfeedCacheConfigDto(Integer num) {
        this.itemTtl = num;
    }

    public /* synthetic */ NewsfeedCacheConfigDto(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
