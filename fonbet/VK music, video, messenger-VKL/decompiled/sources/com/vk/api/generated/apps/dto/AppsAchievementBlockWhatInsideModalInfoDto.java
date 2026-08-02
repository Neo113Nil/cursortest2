package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsAchievementBlockWhatInsideModalInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsAchievementBlockWhatInsideModalInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsAchievementBlockWhatInsideModalInfoDto> CREATOR = new a();

    @pmi0("close_button_label")
    private final String closeButtonLabel;

    @pmi0("gifts")
    private final List<AppsWhatInsideModalInfoGiftsDto> gifts;

    @pmi0("rules_link")
    private final String rulesLink;

    @pmi0("rules_text")
    private final String rulesText;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsAchievementBlockWhatInsideModalInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsAchievementBlockWhatInsideModalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAchievementBlockWhatInsideModalInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AppsWhatInsideModalInfoGiftsDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsAchievementBlockWhatInsideModalInfoDto(readString, arrayList, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAchievementBlockWhatInsideModalInfoDto[] newArray(int i) {
            return new AppsAchievementBlockWhatInsideModalInfoDto[i];
        }
    }

    public AppsAchievementBlockWhatInsideModalInfoDto(String str, List<AppsWhatInsideModalInfoGiftsDto> list, String str2, String str3, String str4, String str5) {
        this.title = str;
        this.gifts = list;
        this.closeButtonLabel = str2;
        this.subtitle = str3;
        this.rulesText = str4;
        this.rulesLink = str5;
    }

    public final String d() {
        return this.closeButtonLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<AppsWhatInsideModalInfoGiftsDto> e() {
        return this.gifts;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAchievementBlockWhatInsideModalInfoDto)) {
            return false;
        }
        AppsAchievementBlockWhatInsideModalInfoDto appsAchievementBlockWhatInsideModalInfoDto = (AppsAchievementBlockWhatInsideModalInfoDto) obj;
        return epx.f(this.title, appsAchievementBlockWhatInsideModalInfoDto.title) && epx.f(this.gifts, appsAchievementBlockWhatInsideModalInfoDto.gifts) && epx.f(this.closeButtonLabel, appsAchievementBlockWhatInsideModalInfoDto.closeButtonLabel) && epx.f(this.subtitle, appsAchievementBlockWhatInsideModalInfoDto.subtitle) && epx.f(this.rulesText, appsAchievementBlockWhatInsideModalInfoDto.rulesText) && epx.f(this.rulesLink, appsAchievementBlockWhatInsideModalInfoDto.rulesLink);
    }

    public final String f() {
        return this.rulesLink;
    }

    public final String g() {
        return this.rulesText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = urd0.a(fw3.a(this.title.hashCode() * 31, 31, this.gifts), 31, this.closeButtonLabel);
        String str = this.subtitle;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rulesText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rulesLink;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.subtitle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAchievementBlockWhatInsideModalInfoDto(title=");
        sb.append(this.title);
        sb.append(", gifts=");
        sb.append(this.gifts);
        sb.append(", closeButtonLabel=");
        sb.append(this.closeButtonLabel);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", rulesText=");
        sb.append(this.rulesText);
        sb.append(", rulesLink=");
        return ho8.a(sb, this.rulesLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        Iterator a2 = ao.a(parcel, this.gifts);
        while (a2.hasNext()) {
            ((AppsWhatInsideModalInfoGiftsDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.closeButtonLabel);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.rulesText);
        parcel.writeString(this.rulesLink);
    }

    public /* synthetic */ AppsAchievementBlockWhatInsideModalInfoDto(String str, List list, String str2, String str3, String str4, String str5, int i, zcl zclVar) {
        this(str, list, str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
