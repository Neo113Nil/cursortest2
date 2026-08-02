package com.vk.api.generated.appWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppWidgetsActionDto.kt */
/* loaded from: classes14.dex */
public final class AppWidgetsActionDto implements Parcelable {
    public static final Parcelable.Creator<AppWidgetsActionDto> CREATOR = new a();

    @pmi0("target")
    private final String target;

    @pmi0("type")
    private final String type;

    @pmi0("url")
    private final String url;

    /* compiled from: AppWidgetsActionDto.kt */
    public static final class a implements Parcelable.Creator<AppWidgetsActionDto> {
        @Override // android.os.Parcelable.Creator
        public final AppWidgetsActionDto createFromParcel(Parcel parcel) {
            return new AppWidgetsActionDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppWidgetsActionDto[] newArray(int i) {
            return new AppWidgetsActionDto[i];
        }
    }

    public AppWidgetsActionDto() {
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
        if (!(obj instanceof AppWidgetsActionDto)) {
            return false;
        }
        AppWidgetsActionDto appWidgetsActionDto = (AppWidgetsActionDto) obj;
        return epx.f(this.target, appWidgetsActionDto.target) && epx.f(this.type, appWidgetsActionDto.type) && epx.f(this.url, appWidgetsActionDto.url);
    }

    public final int hashCode() {
        String str = this.target;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppWidgetsActionDto(target=");
        sb.append(this.target);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", url=");
        return ho8.a(sb, this.url, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.target);
        parcel.writeString(this.type);
        parcel.writeString(this.url);
    }

    public AppWidgetsActionDto(String str, String str2, String str3) {
        this.target = str;
        this.type = str2;
        this.url = str3;
    }

    public /* synthetic */ AppWidgetsActionDto(String str, String str2, String str3, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
