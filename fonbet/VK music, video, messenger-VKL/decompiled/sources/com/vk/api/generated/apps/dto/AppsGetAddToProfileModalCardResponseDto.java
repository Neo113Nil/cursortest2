package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsGetAddToProfileModalCardResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAddToProfileModalCardResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAddToProfileModalCardResponseDto> CREATOR = new a();

    @pmi0("button")
    private final AppsGetAddToProfileModalCardButtonDto button;

    @pmi0("current_buttons")
    private final List<AppsGetAddToProfileModalCardButtonDto> currentButtons;

    @pmi0("myself_dark")
    private final String myselfDark;

    @pmi0("myself_light")
    private final String myselfLight;

    @pmi0("their_dark")
    private final String theirDark;

    @pmi0("their_light")
    private final String theirLight;

    /* compiled from: AppsGetAddToProfileModalCardResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAddToProfileModalCardResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAddToProfileModalCardResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            AppsGetAddToProfileModalCardButtonDto createFromParcel = AppsGetAddToProfileModalCardButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(AppsGetAddToProfileModalCardButtonDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new AppsGetAddToProfileModalCardResponseDto(readString, readString2, readString3, readString4, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAddToProfileModalCardResponseDto[] newArray(int i) {
            return new AppsGetAddToProfileModalCardResponseDto[i];
        }
    }

    public AppsGetAddToProfileModalCardResponseDto(String str, String str2, String str3, String str4, AppsGetAddToProfileModalCardButtonDto appsGetAddToProfileModalCardButtonDto, List<AppsGetAddToProfileModalCardButtonDto> list) {
        this.myselfLight = str;
        this.myselfDark = str2;
        this.theirLight = str3;
        this.theirDark = str4;
        this.button = appsGetAddToProfileModalCardButtonDto;
        this.currentButtons = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAddToProfileModalCardResponseDto)) {
            return false;
        }
        AppsGetAddToProfileModalCardResponseDto appsGetAddToProfileModalCardResponseDto = (AppsGetAddToProfileModalCardResponseDto) obj;
        return epx.f(this.myselfLight, appsGetAddToProfileModalCardResponseDto.myselfLight) && epx.f(this.myselfDark, appsGetAddToProfileModalCardResponseDto.myselfDark) && epx.f(this.theirLight, appsGetAddToProfileModalCardResponseDto.theirLight) && epx.f(this.theirDark, appsGetAddToProfileModalCardResponseDto.theirDark) && epx.f(this.button, appsGetAddToProfileModalCardResponseDto.button) && epx.f(this.currentButtons, appsGetAddToProfileModalCardResponseDto.currentButtons);
    }

    public final int hashCode() {
        int hashCode = (this.button.hashCode() + urd0.a(urd0.a(urd0.a(this.myselfLight.hashCode() * 31, 31, this.myselfDark), 31, this.theirLight), 31, this.theirDark)) * 31;
        List<AppsGetAddToProfileModalCardButtonDto> list = this.currentButtons;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAddToProfileModalCardResponseDto(myselfLight=");
        sb.append(this.myselfLight);
        sb.append(", myselfDark=");
        sb.append(this.myselfDark);
        sb.append(", theirLight=");
        sb.append(this.theirLight);
        sb.append(", theirDark=");
        sb.append(this.theirDark);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", currentButtons=");
        return ms9.a(')', sb, this.currentButtons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.myselfLight);
        parcel.writeString(this.myselfDark);
        parcel.writeString(this.theirLight);
        parcel.writeString(this.theirDark);
        this.button.writeToParcel(parcel, i);
        List<AppsGetAddToProfileModalCardButtonDto> list = this.currentButtons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((AppsGetAddToProfileModalCardButtonDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsGetAddToProfileModalCardResponseDto(String str, String str2, String str3, String str4, AppsGetAddToProfileModalCardButtonDto appsGetAddToProfileModalCardButtonDto, List list, int i, zcl zclVar) {
        this(str, str2, str3, str4, appsGetAddToProfileModalCardButtonDto, (i & 32) != 0 ? null : list);
    }
}
