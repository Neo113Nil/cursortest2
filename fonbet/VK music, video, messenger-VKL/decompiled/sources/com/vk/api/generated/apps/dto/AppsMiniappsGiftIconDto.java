package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsMiniappsGiftIconDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsGiftIconDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsGiftIconDto> CREATOR = new a();

    @pmi0("action")
    private final AppsCatalogBaseActionDto action;

    @pmi0("red_dot")
    private final boolean redDot;

    @pmi0("tooltip")
    private final String tooltip;

    /* compiled from: AppsMiniappsGiftIconDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsGiftIconDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsGiftIconDto createFromParcel(Parcel parcel) {
            return new AppsMiniappsGiftIconDto(parcel.readInt() != 0, AppsCatalogBaseActionDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsGiftIconDto[] newArray(int i) {
            return new AppsMiniappsGiftIconDto[i];
        }
    }

    public AppsMiniappsGiftIconDto(boolean z, AppsCatalogBaseActionDto appsCatalogBaseActionDto, String str) {
        this.redDot = z;
        this.action = appsCatalogBaseActionDto;
        this.tooltip = str;
    }

    public final AppsCatalogBaseActionDto d() {
        return this.action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.redDot;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsGiftIconDto)) {
            return false;
        }
        AppsMiniappsGiftIconDto appsMiniappsGiftIconDto = (AppsMiniappsGiftIconDto) obj;
        return this.redDot == appsMiniappsGiftIconDto.redDot && epx.f(this.action, appsMiniappsGiftIconDto.action) && epx.f(this.tooltip, appsMiniappsGiftIconDto.tooltip);
    }

    public final String f() {
        return this.tooltip;
    }

    public final int hashCode() {
        int hashCode = (this.action.hashCode() + (Boolean.hashCode(this.redDot) * 31)) * 31;
        String str = this.tooltip;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsGiftIconDto(redDot=");
        sb.append(this.redDot);
        sb.append(", action=");
        sb.append(this.action);
        sb.append(", tooltip=");
        return ho8.a(sb, this.tooltip, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.redDot ? 1 : 0);
        this.action.writeToParcel(parcel, i);
        parcel.writeString(this.tooltip);
    }

    public /* synthetic */ AppsMiniappsGiftIconDto(boolean z, AppsCatalogBaseActionDto appsCatalogBaseActionDto, String str, int i, zcl zclVar) {
        this(z, appsCatalogBaseActionDto, (i & 4) != 0 ? null : str);
    }
}
