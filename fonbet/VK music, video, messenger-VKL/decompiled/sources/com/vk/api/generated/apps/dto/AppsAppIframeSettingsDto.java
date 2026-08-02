package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: AppsAppIframeSettingsDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppIframeSettingsDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppIframeSettingsDto> CREATOR = new a();

    @pmi0("background_color")
    private final String backgroundColor;

    @pmi0("height")
    private final int height;

    @pmi0("width")
    private final int width;

    /* compiled from: AppsAppIframeSettingsDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppIframeSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppIframeSettingsDto createFromParcel(Parcel parcel) {
            return new AppsAppIframeSettingsDto(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppIframeSettingsDto[] newArray(int i) {
            return new AppsAppIframeSettingsDto[i];
        }
    }

    public AppsAppIframeSettingsDto(int i, int i2, String str) {
        this.height = i;
        this.width = i2;
        this.backgroundColor = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppIframeSettingsDto)) {
            return false;
        }
        AppsAppIframeSettingsDto appsAppIframeSettingsDto = (AppsAppIframeSettingsDto) obj;
        return this.height == appsAppIframeSettingsDto.height && this.width == appsAppIframeSettingsDto.width && epx.f(this.backgroundColor, appsAppIframeSettingsDto.backgroundColor);
    }

    public final int hashCode() {
        return this.backgroundColor.hashCode() + shy.a(this.width, Integer.hashCode(this.height) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppIframeSettingsDto(height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", backgroundColor=");
        return ho8.a(sb, this.backgroundColor, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeString(this.backgroundColor);
    }
}
