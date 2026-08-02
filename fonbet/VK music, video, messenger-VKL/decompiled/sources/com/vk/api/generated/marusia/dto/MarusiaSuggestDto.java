package com.vk.api.generated.marusia.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MarusiaSuggestDto.kt */
/* loaded from: classes15.dex */
public final class MarusiaSuggestDto implements Parcelable {
    public static final Parcelable.Creator<MarusiaSuggestDto> CREATOR = new a();

    @pmi0("callback_data")
    private final String callbackData;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("id")
    private final String id;

    @pmi0("payload")
    private final String payload;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* compiled from: MarusiaSuggestDto.kt */
    public static final class a implements Parcelable.Creator<MarusiaSuggestDto> {
        @Override // android.os.Parcelable.Creator
        public final MarusiaSuggestDto createFromParcel(Parcel parcel) {
            return new MarusiaSuggestDto(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MarusiaSuggestDto[] newArray(int i) {
            return new MarusiaSuggestDto[i];
        }
    }

    public MarusiaSuggestDto(String str, String str2, String str3, String str4, String str5, String str6) {
        this.text = str;
        this.payload = str2;
        this.id = str3;
        this.callbackData = str4;
        this.type = str5;
        this.event = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MarusiaSuggestDto)) {
            return false;
        }
        MarusiaSuggestDto marusiaSuggestDto = (MarusiaSuggestDto) obj;
        return epx.f(this.text, marusiaSuggestDto.text) && epx.f(this.payload, marusiaSuggestDto.payload) && epx.f(this.id, marusiaSuggestDto.id) && epx.f(this.callbackData, marusiaSuggestDto.callbackData) && epx.f(this.type, marusiaSuggestDto.type) && epx.f(this.event, marusiaSuggestDto.event);
    }

    public final int hashCode() {
        int a2 = urd0.a(this.text.hashCode() * 31, 31, this.payload);
        String str = this.id;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.callbackData;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.event;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarusiaSuggestDto(text=");
        sb.append(this.text);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", id=");
        sb.append(this.id);
        sb.append(", callbackData=");
        sb.append(this.callbackData);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", event=");
        return ho8.a(sb, this.event, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.payload);
        parcel.writeString(this.id);
        parcel.writeString(this.callbackData);
        parcel.writeString(this.type);
        parcel.writeString(this.event);
    }

    public /* synthetic */ MarusiaSuggestDto(String str, String str2, String str3, String str4, String str5, String str6, int i, zcl zclVar) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }
}
