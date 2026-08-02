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
import xsna.pmi0;
import xsna.urd0;
import xsna.zcl;

/* compiled from: AppsGetAboutScreenResponseDto.kt */
/* loaded from: classes14.dex */
public final class AppsGetAboutScreenResponseDto implements Parcelable {
    public static final Parcelable.Creator<AppsGetAboutScreenResponseDto> CREATOR = new a();

    @pmi0("group")
    private final AppsGetAboutScreenGroupDto group;

    @pmi0("icon_278")
    private final String icon278;

    @pmi0("icon_576")
    private final String icon576;

    @pmi0("policies")
    private final AppsGetAboutScreenPoliciesDto policies;

    @pmi0("screenshots")
    private final List<AppsGetAboutScreenScreenshotDto> screenshots;

    @pmi0("short_description")
    private final String shortDescription;

    @pmi0("title")
    private final String title;

    /* compiled from: AppsGetAboutScreenResponseDto.kt */
    public static final class a implements Parcelable.Creator<AppsGetAboutScreenResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenResponseDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(AppsGetAboutScreenScreenshotDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new AppsGetAboutScreenResponseDto(readString, readString2, arrayList, (AppsGetAboutScreenPoliciesDto) parcel.readParcelable(AppsGetAboutScreenResponseDto.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AppsGetAboutScreenGroupDto.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGetAboutScreenResponseDto[] newArray(int i) {
            return new AppsGetAboutScreenResponseDto[i];
        }
    }

    public AppsGetAboutScreenResponseDto(String str, String str2, List<AppsGetAboutScreenScreenshotDto> list, AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto, String str3, String str4, AppsGetAboutScreenGroupDto appsGetAboutScreenGroupDto) {
        this.title = str;
        this.shortDescription = str2;
        this.screenshots = list;
        this.policies = appsGetAboutScreenPoliciesDto;
        this.icon278 = str3;
        this.icon576 = str4;
        this.group = appsGetAboutScreenGroupDto;
    }

    public final AppsGetAboutScreenGroupDto d() {
        return this.group;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.icon278;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGetAboutScreenResponseDto)) {
            return false;
        }
        AppsGetAboutScreenResponseDto appsGetAboutScreenResponseDto = (AppsGetAboutScreenResponseDto) obj;
        return epx.f(this.title, appsGetAboutScreenResponseDto.title) && epx.f(this.shortDescription, appsGetAboutScreenResponseDto.shortDescription) && epx.f(this.screenshots, appsGetAboutScreenResponseDto.screenshots) && epx.f(this.policies, appsGetAboutScreenResponseDto.policies) && epx.f(this.icon278, appsGetAboutScreenResponseDto.icon278) && epx.f(this.icon576, appsGetAboutScreenResponseDto.icon576) && epx.f(this.group, appsGetAboutScreenResponseDto.group);
    }

    public final String f() {
        return this.icon576;
    }

    public final AppsGetAboutScreenPoliciesDto g() {
        return this.policies;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        int hashCode = (this.policies.hashCode() + fw3.a(urd0.a(this.title.hashCode() * 31, 31, this.shortDescription), 31, this.screenshots)) * 31;
        String str = this.icon278;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon576;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AppsGetAboutScreenGroupDto appsGetAboutScreenGroupDto = this.group;
        return hashCode3 + (appsGetAboutScreenGroupDto != null ? appsGetAboutScreenGroupDto.hashCode() : 0);
    }

    public final List<AppsGetAboutScreenScreenshotDto> i() {
        return this.screenshots;
    }

    public final String j() {
        return this.shortDescription;
    }

    public final String toString() {
        return "AppsGetAboutScreenResponseDto(title=" + this.title + ", shortDescription=" + this.shortDescription + ", screenshots=" + this.screenshots + ", policies=" + this.policies + ", icon278=" + this.icon278 + ", icon576=" + this.icon576 + ", group=" + this.group + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.shortDescription);
        Iterator a2 = ao.a(parcel, this.screenshots);
        while (a2.hasNext()) {
            ((AppsGetAboutScreenScreenshotDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.policies, i);
        parcel.writeString(this.icon278);
        parcel.writeString(this.icon576);
        AppsGetAboutScreenGroupDto appsGetAboutScreenGroupDto = this.group;
        if (appsGetAboutScreenGroupDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            appsGetAboutScreenGroupDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ AppsGetAboutScreenResponseDto(String str, String str2, List list, AppsGetAboutScreenPoliciesDto appsGetAboutScreenPoliciesDto, String str3, String str4, AppsGetAboutScreenGroupDto appsGetAboutScreenGroupDto, int i, zcl zclVar) {
        this(str, str2, list, appsGetAboutScreenPoliciesDto, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : appsGetAboutScreenGroupDto);
    }
}
