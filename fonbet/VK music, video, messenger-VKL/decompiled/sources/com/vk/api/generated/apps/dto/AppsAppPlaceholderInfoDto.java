package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.shy;
import xsna.zcl;

/* compiled from: AppsAppPlaceholderInfoDto.kt */
/* loaded from: classes14.dex */
public final class AppsAppPlaceholderInfoDto implements Parcelable {
    public static final Parcelable.Creator<AppsAppPlaceholderInfoDto> CREATOR = new a();

    @pmi0("action_button")
    private final AppsAppPlaceholderInfoActionButtonDto actionButton;

    @pmi0("reason")
    private final int reason;

    @pmi0("subtitle")
    private final String subtitle;

    @pmi0("suggested_apps_ids")
    private final List<Integer> suggestedAppsIds;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsAppPlaceholderInfoDto.kt */
    public static final class a implements Parcelable.Creator<AppsAppPlaceholderInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsAppPlaceholderInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            String readString2 = parcel.readString();
            AppsAppPlaceholderInfoActionButtonDto createFromParcel = parcel.readInt() == 0 ? null : AppsAppPlaceholderInfoActionButtonDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i = 0;
                while (i != readInt2) {
                    i = pm0.b(parcel, arrayList, i, 1);
                }
            }
            return new AppsAppPlaceholderInfoDto(readString, readInt, readString2, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final AppsAppPlaceholderInfoDto[] newArray(int i) {
            return new AppsAppPlaceholderInfoDto[i];
        }
    }

    public AppsAppPlaceholderInfoDto(String str, int i, String str2, AppsAppPlaceholderInfoActionButtonDto appsAppPlaceholderInfoActionButtonDto, List<Integer> list) {
        this.subtitle = str;
        this.reason = i;
        this.title = str2;
        this.actionButton = appsAppPlaceholderInfoActionButtonDto;
        this.suggestedAppsIds = list;
    }

    public final int d() {
        return this.reason;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.subtitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsAppPlaceholderInfoDto)) {
            return false;
        }
        AppsAppPlaceholderInfoDto appsAppPlaceholderInfoDto = (AppsAppPlaceholderInfoDto) obj;
        return epx.f(this.subtitle, appsAppPlaceholderInfoDto.subtitle) && this.reason == appsAppPlaceholderInfoDto.reason && epx.f(this.title, appsAppPlaceholderInfoDto.title) && epx.f(this.actionButton, appsAppPlaceholderInfoDto.actionButton) && epx.f(this.suggestedAppsIds, appsAppPlaceholderInfoDto.suggestedAppsIds);
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int a2 = shy.a(this.reason, this.subtitle.hashCode() * 31, 31);
        String str = this.title;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        AppsAppPlaceholderInfoActionButtonDto appsAppPlaceholderInfoActionButtonDto = this.actionButton;
        int hashCode2 = (hashCode + (appsAppPlaceholderInfoActionButtonDto == null ? 0 : appsAppPlaceholderInfoActionButtonDto.hashCode())) * 31;
        List<Integer> list = this.suggestedAppsIds;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsAppPlaceholderInfoDto(subtitle=");
        sb.append(this.subtitle);
        sb.append(", reason=");
        sb.append(this.reason);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", actionButton=");
        sb.append(this.actionButton);
        sb.append(", suggestedAppsIds=");
        return ms9.a(')', sb, this.suggestedAppsIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.subtitle);
        parcel.writeInt(this.reason);
        parcel.writeString(this.title);
        AppsAppPlaceholderInfoActionButtonDto appsAppPlaceholderInfoActionButtonDto = this.actionButton;
        if (appsAppPlaceholderInfoActionButtonDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsAppPlaceholderInfoActionButtonDto.writeToParcel(parcel, i);
        }
        List<Integer> list = this.suggestedAppsIds;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            parcel.writeInt(((Number) f.next()).intValue());
        }
    }

    public /* synthetic */ AppsAppPlaceholderInfoDto(String str, int i, String str2, AppsAppPlaceholderInfoActionButtonDto appsAppPlaceholderInfoActionButtonDto, List list, int i2, zcl zclVar) {
        this(str, i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : appsAppPlaceholderInfoActionButtonDto, (i2 & 16) != 0 ? null : list);
    }
}
