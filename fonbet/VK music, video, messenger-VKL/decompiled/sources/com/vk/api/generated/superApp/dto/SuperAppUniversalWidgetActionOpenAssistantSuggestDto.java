package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: SuperAppUniversalWidgetActionOpenAssistantSuggestDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppUniversalWidgetActionOpenAssistantSuggestDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppUniversalWidgetActionOpenAssistantSuggestDto> CREATOR = new a();

    @pmi0("callback_data")
    private final String callbackData;

    @pmi0(NotificationCompat.CATEGORY_EVENT)
    private final String event;

    @pmi0("id")
    private final Integer id;

    @pmi0("is_promo")
    private final Boolean isPromo;

    @pmi0("payload")
    private final String payload;

    @pmi0("text")
    private final String text;

    @pmi0("type")
    private final String type;

    /* compiled from: SuperAppUniversalWidgetActionOpenAssistantSuggestDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppUniversalWidgetActionOpenAssistantSuggestDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionOpenAssistantSuggestDto createFromParcel(Parcel parcel) {
            Integer valueOf;
            Boolean bool;
            if (parcel.readInt() == 0) {
                valueOf = null;
                bool = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
                bool = null;
            }
            String readString = parcel.readString();
            Boolean bool2 = bool;
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            Boolean bool3 = bool2;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                bool3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SuperAppUniversalWidgetActionOpenAssistantSuggestDto(valueOf, readString, readString2, readString3, readString4, readString5, bool3);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppUniversalWidgetActionOpenAssistantSuggestDto[] newArray(int i) {
            return new SuperAppUniversalWidgetActionOpenAssistantSuggestDto[i];
        }
    }

    public SuperAppUniversalWidgetActionOpenAssistantSuggestDto() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppUniversalWidgetActionOpenAssistantSuggestDto)) {
            return false;
        }
        SuperAppUniversalWidgetActionOpenAssistantSuggestDto superAppUniversalWidgetActionOpenAssistantSuggestDto = (SuperAppUniversalWidgetActionOpenAssistantSuggestDto) obj;
        return epx.f(this.id, superAppUniversalWidgetActionOpenAssistantSuggestDto.id) && epx.f(this.text, superAppUniversalWidgetActionOpenAssistantSuggestDto.text) && epx.f(this.payload, superAppUniversalWidgetActionOpenAssistantSuggestDto.payload) && epx.f(this.callbackData, superAppUniversalWidgetActionOpenAssistantSuggestDto.callbackData) && epx.f(this.type, superAppUniversalWidgetActionOpenAssistantSuggestDto.type) && epx.f(this.event, superAppUniversalWidgetActionOpenAssistantSuggestDto.event) && epx.f(this.isPromo, superAppUniversalWidgetActionOpenAssistantSuggestDto.isPromo);
    }

    public final int hashCode() {
        Integer num = this.id;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.text;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.payload;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.callbackData;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.event;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isPromo;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppUniversalWidgetActionOpenAssistantSuggestDto(id=");
        sb.append(this.id);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", payload=");
        sb.append(this.payload);
        sb.append(", callbackData=");
        sb.append(this.callbackData);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", event=");
        sb.append(this.event);
        sb.append(", isPromo=");
        return tn.a(sb, this.isPromo, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.id;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeString(this.text);
        parcel.writeString(this.payload);
        parcel.writeString(this.callbackData);
        parcel.writeString(this.type);
        parcel.writeString(this.event);
        Boolean bool = this.isPromo;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
    }

    public SuperAppUniversalWidgetActionOpenAssistantSuggestDto(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool) {
        this.id = num;
        this.text = str;
        this.payload = str2;
        this.callbackData = str3;
        this.type = str4;
        this.event = str5;
        this.isPromo = bool;
    }

    public /* synthetic */ SuperAppUniversalWidgetActionOpenAssistantSuggestDto(Integer num, String str, String str2, String str3, String str4, String str5, Boolean bool, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : bool);
    }
}
