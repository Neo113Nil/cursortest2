package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: AppsSeoDescriptionDto.kt */
/* loaded from: classes14.dex */
public final class AppsSeoDescriptionDto implements Parcelable {
    public static final Parcelable.Creator<AppsSeoDescriptionDto> CREATOR = new a();

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final String content;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsSeoDescriptionDto.kt */
    public static final class a implements Parcelable.Creator<AppsSeoDescriptionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsSeoDescriptionDto createFromParcel(Parcel parcel) {
            return new AppsSeoDescriptionDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsSeoDescriptionDto[] newArray(int i) {
            return new AppsSeoDescriptionDto[i];
        }
    }

    public AppsSeoDescriptionDto(String str, String str2) {
        this.title = str;
        this.content = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsSeoDescriptionDto)) {
            return false;
        }
        AppsSeoDescriptionDto appsSeoDescriptionDto = (AppsSeoDescriptionDto) obj;
        return epx.f(this.title, appsSeoDescriptionDto.title) && epx.f(this.content, appsSeoDescriptionDto.content);
    }

    public final int hashCode() {
        return this.content.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsSeoDescriptionDto(title=");
        sb.append(this.title);
        sb.append(", content=");
        return ho8.a(sb, this.content, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.content);
    }
}
