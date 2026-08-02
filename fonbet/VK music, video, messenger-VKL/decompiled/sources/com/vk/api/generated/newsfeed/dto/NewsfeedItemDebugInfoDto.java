package com.vk.api.generated.newsfeed.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: NewsfeedItemDebugInfoDto.kt */
/* loaded from: classes15.dex */
public final class NewsfeedItemDebugInfoDto implements Parcelable {
    public static final Parcelable.Creator<NewsfeedItemDebugInfoDto> CREATOR = new a();

    @pmi0("description")
    private final String description;

    @pmi0("label")
    private final String label;

    /* compiled from: NewsfeedItemDebugInfoDto.kt */
    public static final class a implements Parcelable.Creator<NewsfeedItemDebugInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDebugInfoDto createFromParcel(Parcel parcel) {
            return new NewsfeedItemDebugInfoDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final NewsfeedItemDebugInfoDto[] newArray(int i) {
            return new NewsfeedItemDebugInfoDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NewsfeedItemDebugInfoDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final String d() {
        return this.label;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NewsfeedItemDebugInfoDto)) {
            return false;
        }
        NewsfeedItemDebugInfoDto newsfeedItemDebugInfoDto = (NewsfeedItemDebugInfoDto) obj;
        return epx.f(this.label, newsfeedItemDebugInfoDto.label) && epx.f(this.description, newsfeedItemDebugInfoDto.description);
    }

    public final String getDescription() {
        return this.description;
    }

    public final int hashCode() {
        String str = this.label;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.description;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedItemDebugInfoDto(label=");
        sb.append(this.label);
        sb.append(", description=");
        return ho8.a(sb, this.description, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.label);
        parcel.writeString(this.description);
    }

    public NewsfeedItemDebugInfoDto(String str, String str2) {
        this.label = str;
        this.description = str2;
    }

    public /* synthetic */ NewsfeedItemDebugInfoDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
