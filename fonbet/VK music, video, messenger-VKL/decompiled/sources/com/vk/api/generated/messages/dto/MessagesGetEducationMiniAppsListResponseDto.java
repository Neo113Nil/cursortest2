package com.vk.api.generated.messages.dto;

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

/* compiled from: MessagesGetEducationMiniAppsListResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetEducationMiniAppsListResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetEducationMiniAppsListResponseDto> CREATOR = new a();

    @pmi0("apps")
    private final List<MessagesEducationMiniAppViewDto> apps;

    /* compiled from: MessagesGetEducationMiniAppsListResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetEducationMiniAppsListResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetEducationMiniAppsListResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesEducationMiniAppViewDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesGetEducationMiniAppsListResponseDto(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetEducationMiniAppsListResponseDto[] newArray(int i) {
            return new MessagesGetEducationMiniAppsListResponseDto[i];
        }
    }

    public MessagesGetEducationMiniAppsListResponseDto(List<MessagesEducationMiniAppViewDto> list) {
        this.apps = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MessagesGetEducationMiniAppsListResponseDto) && epx.f(this.apps, ((MessagesGetEducationMiniAppsListResponseDto) obj).apps);
    }

    public final int hashCode() {
        return this.apps.hashCode();
    }

    public final String toString() {
        return ms9.a(')', new StringBuilder("MessagesGetEducationMiniAppsListResponseDto(apps="), this.apps);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.apps);
        while (a2.hasNext()) {
            ((MessagesEducationMiniAppViewDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
