package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.core.JsonStringDto;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetActionSendMessageMessageDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetActionSendMessageMessageDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetActionSendMessageMessageDto> CREATOR = new a();

    @pmi0("payload")
    private final JsonStringDto payload;

    @pmi0("show_confirmation")
    private final Boolean showConfirmation;

    @pmi0("text")
    private final String text;

    /* compiled from: SuperAppUniversalWidgetActionSendMessageMessageDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionSendMessageMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionSendMessageMessageDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            JsonStringDto jsonStringDto = (JsonStringDto) parcel.readValue(SuperAppUniversalWidgetActionSendMessageMessageDto.class.getClassLoader());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppUniversalWidgetActionSendMessageMessageDto(readString, jsonStringDto, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionSendMessageMessageDto[] newArray(int i) {
            return new SuperAppUniversalWidgetActionSendMessageMessageDto[i];
        }
    }

    public SuperAppUniversalWidgetActionSendMessageMessageDto(String str, JsonStringDto jsonStringDto, Boolean bool) {
        this.text = str;
        this.payload = jsonStringDto;
        this.showConfirmation = bool;
    }

    public final JsonStringDto d() {
        return this.payload;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Boolean e() {
        return this.showConfirmation;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetActionSendMessageMessageDto)) {
            return false;
        }
        SuperAppUniversalWidgetActionSendMessageMessageDto superAppUniversalWidgetActionSendMessageMessageDto = (SuperAppUniversalWidgetActionSendMessageMessageDto) obj;
        return epx.f(this.text, superAppUniversalWidgetActionSendMessageMessageDto.text) && epx.f(this.payload, superAppUniversalWidgetActionSendMessageMessageDto.payload) && epx.f(this.showConfirmation, superAppUniversalWidgetActionSendMessageMessageDto.showConfirmation);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        JsonStringDto jsonStringDto = this.payload;
        int hashCode2 = (hashCode + (jsonStringDto == null ? 0 : jsonStringDto.a.hashCode())) * 31;
        Boolean bool = this.showConfirmation;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionSendMessageMessageDto(text=");
        sb.append(this.text);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", showConfirmation=");
        return tn.a(sb, this.showConfirmation, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeValue(this.payload);
        Boolean bool = this.showConfirmation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ SuperAppUniversalWidgetActionSendMessageMessageDto(String str, JsonStringDto jsonStringDto, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : jsonStringDto, (i & 4) != 0 ? null : bool);
    }
}
