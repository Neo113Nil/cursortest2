package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.shy;

/* compiled from: SuperAppUniversalWidgetImageItemDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetImageItemDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetImageItemDto> CREATOR = new a();

    @pmi0("height")
    private final int height;

    @pmi0("url")
    private final String url;

    @pmi0("width")
    private final int width;

    /* compiled from: SuperAppUniversalWidgetImageItemDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetImageItemDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageItemDto createFromParcel(Parcel parcel) {
            return new SuperAppUniversalWidgetImageItemDto(parcel.readInt(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetImageItemDto[] newArray(int i) {
            return new SuperAppUniversalWidgetImageItemDto[i];
        }
    }

    public SuperAppUniversalWidgetImageItemDto(int i, int i2, String str) {
        this.height = i;
        this.width = i2;
        this.url = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetImageItemDto)) {
            return false;
        }
        SuperAppUniversalWidgetImageItemDto superAppUniversalWidgetImageItemDto = (SuperAppUniversalWidgetImageItemDto) obj;
        return this.height == superAppUniversalWidgetImageItemDto.height && this.width == superAppUniversalWidgetImageItemDto.width && epx.f(this.url, superAppUniversalWidgetImageItemDto.url);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int hashCode() {
        return this.url.hashCode() + shy.a(this.width, Integer.hashCode(this.height) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetImageItemDto(height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.height);
        parcel.writeInt(this.width);
        parcel.writeString(this.url);
    }
}
