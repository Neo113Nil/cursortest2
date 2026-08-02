package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.shy;
import xsna.sn;
import xsna.uqi;
import xsna.urd0;
import xsna.zcl;

/* compiled from: MessagesFeatureOnboardingDto.kt */
/* loaded from: classes15.dex */
public final class MessagesFeatureOnboardingDto implements Parcelable {
    public static final Parcelable.Creator<MessagesFeatureOnboardingDto> CREATOR = new a();

    @pmi0("date_end")
    private final int dateEnd;

    @pmi0("date_start")
    private final Integer dateStart;

    @pmi0("deeplink")
    private final String deeplink;

    @pmi0("feature_onboarding_id")
    private final String featureOnboardingId;

    @pmi0("icon")
    private final String icon;

    @pmi0("is_new")
    private final Boolean isNew;

    @pmi0("text")
    private final String text;

    @pmi0("title")
    private final String title;

    /* compiled from: MessagesFeatureOnboardingDto.kt */
    public static final class a implements Parcelable.Creator<MessagesFeatureOnboardingDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesFeatureOnboardingDto createFromParcel(Parcel parcel) {
            Boolean valueOf;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesFeatureOnboardingDto(readString, readString2, readString3, readString4, readString5, readInt, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesFeatureOnboardingDto[] newArray(int i) {
            return new MessagesFeatureOnboardingDto[i];
        }
    }

    public MessagesFeatureOnboardingDto(String str, String str2, String str3, String str4, String str5, int i, Boolean bool, Integer num) {
        this.featureOnboardingId = str;
        this.title = str2;
        this.text = str3;
        this.icon = str4;
        this.deeplink = str5;
        this.dateEnd = i;
        this.isNew = bool;
        this.dateStart = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesFeatureOnboardingDto)) {
            return false;
        }
        MessagesFeatureOnboardingDto messagesFeatureOnboardingDto = (MessagesFeatureOnboardingDto) obj;
        return epx.f(this.featureOnboardingId, messagesFeatureOnboardingDto.featureOnboardingId) && epx.f(this.title, messagesFeatureOnboardingDto.title) && epx.f(this.text, messagesFeatureOnboardingDto.text) && epx.f(this.icon, messagesFeatureOnboardingDto.icon) && epx.f(this.deeplink, messagesFeatureOnboardingDto.deeplink) && this.dateEnd == messagesFeatureOnboardingDto.dateEnd && epx.f(this.isNew, messagesFeatureOnboardingDto.isNew) && epx.f(this.dateStart, messagesFeatureOnboardingDto.dateStart);
    }

    public final int hashCode() {
        int a2 = shy.a(this.dateEnd, urd0.a(urd0.a(urd0.a(urd0.a(this.featureOnboardingId.hashCode() * 31, 31, this.title), 31, this.text), 31, this.icon), 31, this.deeplink), 31);
        Boolean bool = this.isNew;
        int hashCode = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.dateStart;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesFeatureOnboardingDto(featureOnboardingId=");
        sb.append(this.featureOnboardingId);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", deeplink=");
        sb.append(this.deeplink);
        sb.append(", dateEnd=");
        sb.append(this.dateEnd);
        sb.append(", isNew=");
        sb.append(this.isNew);
        sb.append(", dateStart=");
        return uqi.b(sb, this.dateStart, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.featureOnboardingId);
        parcel.writeString(this.title);
        parcel.writeString(this.text);
        parcel.writeString(this.icon);
        parcel.writeString(this.deeplink);
        parcel.writeInt(this.dateEnd);
        Boolean bool = this.isNew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        Integer num = this.dateStart;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
    }

    public /* synthetic */ MessagesFeatureOnboardingDto(String str, String str2, String str3, String str4, String str5, int i, Boolean bool, Integer num, int i2, zcl zclVar) {
        this(str, str2, str3, str4, str5, i, (i2 & 64) != 0 ? null : bool, (i2 & 128) != 0 ? null : num);
    }
}
