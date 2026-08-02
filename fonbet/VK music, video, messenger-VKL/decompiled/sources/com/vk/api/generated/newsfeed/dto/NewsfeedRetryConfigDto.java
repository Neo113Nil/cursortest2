package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedRetryConfigDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedRetryConfigDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedRetryConfigDto> CREATOR = new a();

    @pmi0("timeout")
    private final String timeout;

    /* compiled from: NewsfeedRetryConfigDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedRetryConfigDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedRetryConfigDto createFromParcel(Parcel parcel) {
            return new NewsfeedRetryConfigDto(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedRetryConfigDto[] newArray(int i) {
            return new NewsfeedRetryConfigDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedRetryConfigDto() {
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
        return (obj instanceof NewsfeedRetryConfigDto) && epx.f(this.timeout, ((NewsfeedRetryConfigDto) obj).timeout);
    }

    public final int hashCode() {
        String str = this.timeout;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("NewsfeedRetryConfigDto(timeout="), this.timeout, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.timeout);
    }

    public NewsfeedRetryConfigDto(String str) {
        this.timeout = str;
    }

    public /* synthetic */ NewsfeedRetryConfigDto(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }
}
