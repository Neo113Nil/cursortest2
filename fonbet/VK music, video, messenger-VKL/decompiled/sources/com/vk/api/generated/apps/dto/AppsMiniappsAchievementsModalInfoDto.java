package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.base.dto.BaseImageDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsMiniappsAchievementsModalInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsMiniappsAchievementsModalInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsMiniappsAchievementsModalInfoDto> CREATOR = new a();

    @pmi0("button_label")
    private final String buttonLabel;

    @pmi0("image")
    private final List<BaseImageDto> image;

    @pmi0("rules_link")
    private final String rulesLink;

    @pmi0("rules_text")
    private final String rulesText;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsMiniappsAchievementsModalInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsMiniappsAchievementsModalInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsAchievementsModalInfoDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(AppsMiniappsAchievementsModalInfoDto.class, parcel, arrayList, i, 1);
            }
            return new AppsMiniappsAchievementsModalInfoDto(readString, readString2, readString3, arrayList, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsMiniappsAchievementsModalInfoDto[] newArray(int i) {
            return new AppsMiniappsAchievementsModalInfoDto[i];
        }
    }

    public AppsMiniappsAchievementsModalInfoDto(String str, String str2, String str3, List<BaseImageDto> list, String str4, String str5) {
        this.title = str;
        this.subtitle = str2;
        this.buttonLabel = str3;
        this.image = list;
        this.rulesText = str4;
        this.rulesLink = str5;
    }

    public final String d() {
        return this.buttonLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<BaseImageDto> e() {
        return this.image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsMiniappsAchievementsModalInfoDto)) {
            return false;
        }
        AppsMiniappsAchievementsModalInfoDto appsMiniappsAchievementsModalInfoDto = (AppsMiniappsAchievementsModalInfoDto) obj;
        return epx.f(this.title, appsMiniappsAchievementsModalInfoDto.title) && epx.f(this.subtitle, appsMiniappsAchievementsModalInfoDto.subtitle) && epx.f(this.buttonLabel, appsMiniappsAchievementsModalInfoDto.buttonLabel) && epx.f(this.image, appsMiniappsAchievementsModalInfoDto.image) && epx.f(this.rulesText, appsMiniappsAchievementsModalInfoDto.rulesText) && epx.f(this.rulesLink, appsMiniappsAchievementsModalInfoDto.rulesLink);
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
        int a2 = fw3.a(urd0.a(urd0.a(this.title.hashCode() * 31, 31, this.subtitle), 31, this.buttonLabel), 31, this.image);
        String str = this.rulesText;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.rulesLink;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.subtitle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsMiniappsAchievementsModalInfoDto(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", buttonLabel=");
        sb.append(this.buttonLabel);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", rulesText=");
        sb.append(this.rulesText);
        sb.append(", rulesLink=");
        return ho8.a(sb, this.rulesLink, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.buttonLabel);
        Iterator a2 = ao.a(parcel, this.image);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.rulesText);
        parcel.writeString(this.rulesLink);
    }

    public /* synthetic */ AppsMiniappsAchievementsModalInfoDto(String str, String str2, String str3, List list, String str4, String str5, int i, zcl zclVar) {
        this(str, str2, str3, list, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
