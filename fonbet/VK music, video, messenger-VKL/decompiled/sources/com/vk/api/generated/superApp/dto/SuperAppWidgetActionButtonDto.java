package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;

/* compiled from: SuperAppWidgetActionButtonDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetActionButtonDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppWidgetActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetActionButtonDto createFromParcel(Parcel parcel) {
            return new SuperAppWidgetActionButtonDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetActionButtonDto[] newArray(int i) {
            return new SuperAppWidgetActionButtonDto[i];
        }
    }

    public SuperAppWidgetActionButtonDto(String str, String str2) {
        this.text = str;
        this.webviewUrl = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetActionButtonDto)) {
            return false;
        }
        SuperAppWidgetActionButtonDto superAppWidgetActionButtonDto = (SuperAppWidgetActionButtonDto) obj;
        return epx.f(this.text, superAppWidgetActionButtonDto.text) && epx.f(this.webviewUrl, superAppWidgetActionButtonDto.webviewUrl);
    }

    public final int hashCode() {
        return this.webviewUrl.hashCode() + (this.text.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetActionButtonDto(text=");
        sb.append(this.text);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.webviewUrl);
    }
}
