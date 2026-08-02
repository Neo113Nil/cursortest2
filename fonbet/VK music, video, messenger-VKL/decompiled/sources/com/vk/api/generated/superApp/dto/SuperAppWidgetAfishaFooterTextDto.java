package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: SuperAppWidgetAfishaFooterTextDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppWidgetAfishaFooterTextDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppWidgetAfishaFooterTextDto> CREATOR = new a();

    @pmi0("text")
    private final String text;

    @pmi0("webview_url")
    private final String webviewUrl;

    /* compiled from: SuperAppWidgetAfishaFooterTextDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppWidgetAfishaFooterTextDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetAfishaFooterTextDto createFromParcel(Parcel parcel) {
            return new SuperAppWidgetAfishaFooterTextDto(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppWidgetAfishaFooterTextDto[] newArray(int i) {
            return new SuperAppWidgetAfishaFooterTextDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SuperAppWidgetAfishaFooterTextDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppWidgetAfishaFooterTextDto)) {
            return false;
        }
        SuperAppWidgetAfishaFooterTextDto superAppWidgetAfishaFooterTextDto = (SuperAppWidgetAfishaFooterTextDto) obj;
        return epx.f(this.text, superAppWidgetAfishaFooterTextDto.text) && epx.f(this.webviewUrl, superAppWidgetAfishaFooterTextDto.webviewUrl);
    }

    public final int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.webviewUrl;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppWidgetAfishaFooterTextDto(text=");
        sb.append(this.text);
        sb.append(", webviewUrl=");
        return ho8.a(sb, this.webviewUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.webviewUrl);
    }

    public SuperAppWidgetAfishaFooterTextDto(String str, String str2) {
        this.text = str;
        this.webviewUrl = str2;
    }

    public /* synthetic */ SuperAppWidgetAfishaFooterTextDto(String str, String str2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
