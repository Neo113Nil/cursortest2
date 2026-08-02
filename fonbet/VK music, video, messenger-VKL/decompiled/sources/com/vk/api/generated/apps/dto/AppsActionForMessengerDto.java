package com.vk.api.generated.apps.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import xsna.epx;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: AppsActionForMessengerDto.kt */
/* loaded from: classes14.dex */
public final class AppsActionForMessengerDto implements Parcelable {
    public static final Parcelable.Creator<AppsActionForMessengerDto> CREATOR = new a();

    @pmi0("action_hash")
    private final String actionHash;

    @pmi0("action_title")
    private final String actionTitle;

    /* renamed from: app, reason: collision with root package name */
    @pmi0(MBridgeConstans.DYNAMIC_VIEW_WX_APP)
    private final AppsAppDto f60app;

    @pmi0("launch_url")
    private final String launchUrl;

    /* compiled from: AppsActionForMessengerDto.kt */
    public static final class a implements Parcelable.Creator<AppsActionForMessengerDto> {
        @Override // android.os.Parcelable.Creator
        public final AppsActionForMessengerDto createFromParcel(Parcel parcel) {
            return new AppsActionForMessengerDto(parcel.readString(), parcel.readString(), (AppsAppDto) parcel.readParcelable(AppsActionForMessengerDto.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppsActionForMessengerDto[] newArray(int i) {
            return new AppsActionForMessengerDto[i];
        }
    }

    public AppsActionForMessengerDto(String str, String str2, AppsAppDto appsAppDto, String str3) {
        this.actionTitle = str;
        this.actionHash = str2;
        this.f60app = appsAppDto;
        this.launchUrl = str3;
    }

    public final String d() {
        return this.actionHash;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.actionTitle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsActionForMessengerDto)) {
            return false;
        }
        AppsActionForMessengerDto appsActionForMessengerDto = (AppsActionForMessengerDto) obj;
        return epx.f(this.actionTitle, appsActionForMessengerDto.actionTitle) && epx.f(this.actionHash, appsActionForMessengerDto.actionHash) && epx.f(this.f60app, appsActionForMessengerDto.f60app) && epx.f(this.launchUrl, appsActionForMessengerDto.launchUrl);
    }

    public final AppsAppDto f() {
        return this.f60app;
    }

    public final int hashCode() {
        int hashCode = this.actionTitle.hashCode() * 31;
        String str = this.actionHash;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        AppsAppDto appsAppDto = this.f60app;
        int hashCode3 = (hashCode2 + (appsAppDto == null ? 0 : appsAppDto.hashCode())) * 31;
        String str2 = this.launchUrl;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppsActionForMessengerDto(actionTitle=");
        sb.append(this.actionTitle);
        sb.append(", actionHash=");
        sb.append(this.actionHash);
        sb.append(", app=");
        sb.append(this.f60app);
        sb.append(", launchUrl=");
        return ho8.a(sb, this.launchUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.actionTitle);
        parcel.writeString(this.actionHash);
        parcel.writeParcelable(this.f60app, i);
        parcel.writeString(this.launchUrl);
    }

    public /* synthetic */ AppsActionForMessengerDto(String str, String str2, AppsAppDto appsAppDto, String str3, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : appsAppDto, (i & 8) != 0 ? null : str3);
    }
}
