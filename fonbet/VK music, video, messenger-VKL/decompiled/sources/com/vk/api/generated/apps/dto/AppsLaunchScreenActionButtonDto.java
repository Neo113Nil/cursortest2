package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsLaunchScreenActionButtonDto.kt */
/* loaded from: classes14.dex */
public final class AppsLaunchScreenActionButtonDto implements Parcelable {
    public static final Parcelable.Creator<AppsLaunchScreenActionButtonDto> CREATOR = new a();

    @pmi0("link")
    private final String link;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* compiled from: AppsLaunchScreenActionButtonDto.kt */
    public static final class a implements Parcelable.Creator<AppsLaunchScreenActionButtonDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenActionButtonDto createFromParcel(Parcel parcel) {
            return new AppsLaunchScreenActionButtonDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsLaunchScreenActionButtonDto[] newArray(int i) {
            return new AppsLaunchScreenActionButtonDto[i];
        }
    }

    public AppsLaunchScreenActionButtonDto() {
        this(null, null, null, 7, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsLaunchScreenActionButtonDto)) {
            return false;
        }
        AppsLaunchScreenActionButtonDto appsLaunchScreenActionButtonDto = (AppsLaunchScreenActionButtonDto) obj;
        return epx.f(this.type, appsLaunchScreenActionButtonDto.type) && epx.f(this.text, appsLaunchScreenActionButtonDto.text) && epx.f(this.link, appsLaunchScreenActionButtonDto.link);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.link;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsLaunchScreenActionButtonDto(type=");
        sb.append(this.type);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", link=");
        return ho8.a(sb, this.link, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.text);
        parcel.writeString(this.link);
    }

    public AppsLaunchScreenActionButtonDto(String str, String str2, String str3) {
        this.type = str;
        this.text = str2;
        this.link = str3;
    }

    public /* synthetic */ AppsLaunchScreenActionButtonDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
