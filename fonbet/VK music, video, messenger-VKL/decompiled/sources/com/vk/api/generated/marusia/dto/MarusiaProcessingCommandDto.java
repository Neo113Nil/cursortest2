package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MarusiaProcessingCommandDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaProcessingCommandDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaProcessingCommandDto> CREATOR = new a();

    @pmi0("callback_data")
    private final String callbackData;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("type")
    private final String type;

    /* compiled from: MarusiaProcessingCommandDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaProcessingCommandDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaProcessingCommandDto createFromParcel(Parcel parcel) {
            return new MarusiaProcessingCommandDto(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaProcessingCommandDto[] newArray(int i) {
            return new MarusiaProcessingCommandDto[i];
        }
    }

    public MarusiaProcessingCommandDto(String str, String str2, String str3) {
        this.type = str;
        this.event = str2;
        this.callbackData = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaProcessingCommandDto)) {
            return false;
        }
        MarusiaProcessingCommandDto marusiaProcessingCommandDto = (MarusiaProcessingCommandDto) obj;
        return epx.f(this.type, marusiaProcessingCommandDto.type) && epx.f(this.event, marusiaProcessingCommandDto.event) && epx.f(this.callbackData, marusiaProcessingCommandDto.callbackData);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.event;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.callbackData;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaProcessingCommandDto(type=");
        sb.append(this.type);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", callbackData=");
        return ho8.a(sb, this.callbackData, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type);
        parcel.writeString(this.event);
        parcel.writeString(this.callbackData);
    }

    public /* synthetic */ MarusiaProcessingCommandDto(String str, String str2, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
