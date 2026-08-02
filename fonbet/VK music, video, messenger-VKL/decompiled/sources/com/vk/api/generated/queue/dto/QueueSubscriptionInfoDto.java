package com.vk.api.generated.queue.dto;

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

/* compiled from: QueueSubscriptionInfoDto.kt */
/* loaded from: classes15.dex */
public final class QueueSubscriptionInfoDto implements Parcelable {
    public static final Parcelable.Creator<QueueSubscriptionInfoDto> CREATOR = new a();

    @pmi0("base_url")
    private final String baseUrl;

    @pmi0("queues")
    private final List<QueueAccessInfoDto> queues;

    /* compiled from: QueueSubscriptionInfoDto.kt */
    public static final class a implements Parcelable.Creator<QueueSubscriptionInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final QueueSubscriptionInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(QueueAccessInfoDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new QueueSubscriptionInfoDto(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final QueueSubscriptionInfoDto[] newArray(int i) {
            return new QueueSubscriptionInfoDto[i];
        }
    }

    public QueueSubscriptionInfoDto(String str, List<QueueAccessInfoDto> list) {
        this.baseUrl = str;
        this.queues = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueueSubscriptionInfoDto)) {
            return false;
        }
        QueueSubscriptionInfoDto queueSubscriptionInfoDto = (QueueSubscriptionInfoDto) obj;
        return epx.f(this.baseUrl, queueSubscriptionInfoDto.baseUrl) && epx.f(this.queues, queueSubscriptionInfoDto.queues);
    }

    public final int hashCode() {
        return this.queues.hashCode() + (this.baseUrl.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QueueSubscriptionInfoDto(baseUrl=");
        sb.append(this.baseUrl);
        sb.append(", queues=");
        return ms9.a(')', sb, this.queues);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.baseUrl);
        Iterator a2 = ao.a(parcel, this.queues);
        while (a2.hasNext()) {
            ((QueueAccessInfoDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
