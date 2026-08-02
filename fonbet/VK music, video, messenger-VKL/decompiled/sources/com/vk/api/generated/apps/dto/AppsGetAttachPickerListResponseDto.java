package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;

/* compiled from: AppsGetAttachPickerListResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAttachPickerListResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAttachPickerListResponseDto> CREATOR = new a();

    @pmi0("open_app")
    private final List<AppsActionForMessengerDto> openApp;

    @pmi0("send_widget")
    private final List<AppsActionForMessengerDto> sendWidget;

    /* compiled from: AppsGetAttachPickerListResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAttachPickerListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAttachPickerListResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = en.a(AppsActionForMessengerDto.CREATOR, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(AppsActionForMessengerDto.CREATOR, parcel, arrayList2, i, 1);
            }
            return new AppsGetAttachPickerListResponseDto(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAttachPickerListResponseDto[] newArray(int i) {
            return new AppsGetAttachPickerListResponseDto[i];
        }
    }

    public AppsGetAttachPickerListResponseDto(List<AppsActionForMessengerDto> list, List<AppsActionForMessengerDto> list2) {
        this.sendWidget = list;
        this.openApp = list2;
    }

    public final List<AppsActionForMessengerDto> d() {
        return this.openApp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsActionForMessengerDto> e() {
        return this.sendWidget;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAttachPickerListResponseDto)) {
            return false;
        }
        AppsGetAttachPickerListResponseDto appsGetAttachPickerListResponseDto = (AppsGetAttachPickerListResponseDto) obj;
        return epx.f(this.sendWidget, appsGetAttachPickerListResponseDto.sendWidget) && epx.f(this.openApp, appsGetAttachPickerListResponseDto.openApp);
    }

    public final int hashCode() {
        return this.openApp.hashCode() + (this.sendWidget.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsGetAttachPickerListResponseDto(sendWidget=");
        sb.append(this.sendWidget);
        sb.append(", openApp=");
        return ms9.a(')', sb, this.openApp);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.sendWidget);
        while (a2.hasNext()) {
            ((AppsActionForMessengerDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.openApp);
        while (a3.hasNext()) {
            ((AppsActionForMessengerDto) a3.next()).writeToParcel(parcel, i);
        }
    }
}
