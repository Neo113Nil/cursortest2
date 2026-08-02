package com.vk.api.generated.exploreWidgets.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: ExploreWidgetsBaseSendMessageDto.kt */
/* loaded from: classes14.dex */
public final class ExploreWidgetsBaseSendMessageDto implements Parcelable {
    public static final Parcelable.Creator<ExploreWidgetsBaseSendMessageDto> CREATOR = new a();

    @pmi0("payload")
    private final String payload;

    @pmi0("show_confirmation")
    private final Boolean showConfirmation;

    @pmi0("text")
    private final String text;

    /* compiled from: ExploreWidgetsBaseSendMessageDto.kt */
    public static final class a implements Parcelable.Creator<ExploreWidgetsBaseSendMessageDto> {
        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseSendMessageDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ExploreWidgetsBaseSendMessageDto(readString, readString2, valueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final ExploreWidgetsBaseSendMessageDto[] newArray(int i) {
            return new ExploreWidgetsBaseSendMessageDto[i];
        }
    }

    public ExploreWidgetsBaseSendMessageDto(String str, String str2, Boolean bool) {
        this.text = str;
        this.payload = str2;
        this.showConfirmation = bool;
    }

    public final String d() {
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
        if (!(obj instanceof ExploreWidgetsBaseSendMessageDto)) {
            return false;
        }
        ExploreWidgetsBaseSendMessageDto exploreWidgetsBaseSendMessageDto = (ExploreWidgetsBaseSendMessageDto) obj;
        return epx.f(this.text, exploreWidgetsBaseSendMessageDto.text) && epx.f(this.payload, exploreWidgetsBaseSendMessageDto.payload) && epx.f(this.showConfirmation, exploreWidgetsBaseSendMessageDto.showConfirmation);
    }

    public final String f() {
        return this.text;
    }

    public final int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        String str = this.payload;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.showConfirmation;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExploreWidgetsBaseSendMessageDto(text=");
        sb.append(this.text);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", showConfirmation=");
        return tn.a(sb, this.showConfirmation, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.text);
        parcel.writeString(this.payload);
        Boolean bool = this.showConfirmation;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public /* synthetic */ ExploreWidgetsBaseSendMessageDto(String str, String str2, Boolean bool, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }
}
