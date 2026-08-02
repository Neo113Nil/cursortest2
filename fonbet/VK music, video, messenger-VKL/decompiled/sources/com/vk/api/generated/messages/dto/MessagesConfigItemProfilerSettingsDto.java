package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.pmi0;

/* compiled from: MessagesConfigItemProfilerSettingsDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConfigItemProfilerSettingsDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConfigItemProfilerSettingsDto> CREATOR = new a();

    @pmi0("api_requests")
    private final boolean apiRequests;

    @pmi0("download_patterns")
    private final List<MessagesConfigItemDownloadProfilerSettingsDto> downloadPatterns;

    /* compiled from: MessagesConfigItemProfilerSettingsDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConfigItemProfilerSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemProfilerSettingsDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesConfigItemDownloadProfilerSettingsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesConfigItemProfilerSettingsDto(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConfigItemProfilerSettingsDto[] newArray(int i) {
            return new MessagesConfigItemProfilerSettingsDto[i];
        }
    }

    public MessagesConfigItemProfilerSettingsDto(List<MessagesConfigItemDownloadProfilerSettingsDto> list, boolean z) {
        this.downloadPatterns = list;
        this.apiRequests = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConfigItemProfilerSettingsDto)) {
            return false;
        }
        MessagesConfigItemProfilerSettingsDto messagesConfigItemProfilerSettingsDto = (MessagesConfigItemProfilerSettingsDto) obj;
        return epx.f(this.downloadPatterns, messagesConfigItemProfilerSettingsDto.downloadPatterns) && this.apiRequests == messagesConfigItemProfilerSettingsDto.apiRequests;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.apiRequests) + (this.downloadPatterns.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConfigItemProfilerSettingsDto(downloadPatterns=");
        sb.append(this.downloadPatterns);
        sb.append(", apiRequests=");
        return q0.a(sb, this.apiRequests, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.downloadPatterns);
        while (a2.hasNext()) {
            ((MessagesConfigItemDownloadProfilerSettingsDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.apiRequests ? 1 : 0);
    }
}
