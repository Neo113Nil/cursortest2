package com.vk.api.generated.serviceBooking.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
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

/* compiled from: ServiceBookingGetSettingsResponseDto.kt */
/* loaded from: classes15.dex */
public final class ServiceBookingGetSettingsResponseDto implements Parcelable {
    public static final Parcelable.Creator<ServiceBookingGetSettingsResponseDto> CREATOR = new a();

    @pmi0(InAppPurchaseMetaData.KEY_CURRENCY)
    private final String currency;

    @pmi0("group")
    private final ServiceBookingGetSettingsGroupDto group;

    @pmi0("max_service_count")
    private final int maxServiceCount;

    @pmi0("menu_items")
    private final List<ServiceBookingGetSettingsMenuItemDto> menuItems;

    @pmi0("newsletter_consent_url")
    private final String newsletterConsentUrl;

    @pmi0("privacy_policy_markdown")
    private final String privacyPolicyMarkdown;

    @pmi0("privacy_policy_url")
    private final String privacyPolicyUrl;

    @pmi0("terms_of_service_url")
    private final String termsOfServiceUrl;

    /* compiled from: ServiceBookingGetSettingsResponseDto.kt */
    public static final class a implements Parcelable.Creator<ServiceBookingGetSettingsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetSettingsResponseDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ServiceBookingGetSettingsGroupDto createFromParcel = ServiceBookingGetSettingsGroupDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(ServiceBookingGetSettingsMenuItemDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new ServiceBookingGetSettingsResponseDto(readInt, readString, readString2, createFromParcel, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceBookingGetSettingsResponseDto[] newArray(int i) {
            return new ServiceBookingGetSettingsResponseDto[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceBookingGetSettingsResponseDto(int i, String str, String str2, ServiceBookingGetSettingsGroupDto serviceBookingGetSettingsGroupDto, List<? extends ServiceBookingGetSettingsMenuItemDto> list, String str3, String str4, String str5) {
        this.maxServiceCount = i;
        this.currency = str;
        this.privacyPolicyMarkdown = str2;
        this.group = serviceBookingGetSettingsGroupDto;
        this.menuItems = list;
        this.privacyPolicyUrl = str3;
        this.termsOfServiceUrl = str4;
        this.newsletterConsentUrl = str5;
    }

    public final String d() {
        return this.currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final ServiceBookingGetSettingsGroupDto e() {
        return this.group;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceBookingGetSettingsResponseDto)) {
            return false;
        }
        ServiceBookingGetSettingsResponseDto serviceBookingGetSettingsResponseDto = (ServiceBookingGetSettingsResponseDto) obj;
        return this.maxServiceCount == serviceBookingGetSettingsResponseDto.maxServiceCount && epx.f(this.currency, serviceBookingGetSettingsResponseDto.currency) && epx.f(this.privacyPolicyMarkdown, serviceBookingGetSettingsResponseDto.privacyPolicyMarkdown) && epx.f(this.group, serviceBookingGetSettingsResponseDto.group) && epx.f(this.menuItems, serviceBookingGetSettingsResponseDto.menuItems) && epx.f(this.privacyPolicyUrl, serviceBookingGetSettingsResponseDto.privacyPolicyUrl) && epx.f(this.termsOfServiceUrl, serviceBookingGetSettingsResponseDto.termsOfServiceUrl) && epx.f(this.newsletterConsentUrl, serviceBookingGetSettingsResponseDto.newsletterConsentUrl);
    }

    public final int f() {
        return this.maxServiceCount;
    }

    public final List<ServiceBookingGetSettingsMenuItemDto> g() {
        return this.menuItems;
    }

    public final int hashCode() {
        int a2 = fw3.a((this.group.hashCode() + urd0.a(urd0.a(Integer.hashCode(this.maxServiceCount) * 31, 31, this.currency), 31, this.privacyPolicyMarkdown)) * 31, 31, this.menuItems);
        String str = this.privacyPolicyUrl;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.termsOfServiceUrl;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.newsletterConsentUrl;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.newsletterConsentUrl;
    }

    public final String j() {
        return this.privacyPolicyMarkdown;
    }

    public final String k() {
        return this.privacyPolicyUrl;
    }

    public final String l() {
        return this.termsOfServiceUrl;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServiceBookingGetSettingsResponseDto(maxServiceCount=");
        sb.append(this.maxServiceCount);
        sb.append(", currency=");
        sb.append(this.currency);
        sb.append(", privacyPolicyMarkdown=");
        sb.append(this.privacyPolicyMarkdown);
        sb.append(", group=");
        sb.append(this.group);
        sb.append(", menuItems=");
        sb.append(this.menuItems);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.privacyPolicyUrl);
        sb.append(", termsOfServiceUrl=");
        sb.append(this.termsOfServiceUrl);
        sb.append(", newsletterConsentUrl=");
        return ho8.a(sb, this.newsletterConsentUrl, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.maxServiceCount);
        parcel.writeString(this.currency);
        parcel.writeString(this.privacyPolicyMarkdown);
        this.group.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.menuItems);
        while (a2.hasNext()) {
            ((ServiceBookingGetSettingsMenuItemDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeString(this.privacyPolicyUrl);
        parcel.writeString(this.termsOfServiceUrl);
        parcel.writeString(this.newsletterConsentUrl);
    }

    public /* synthetic */ ServiceBookingGetSettingsResponseDto(int i, String str, String str2, ServiceBookingGetSettingsGroupDto serviceBookingGetSettingsGroupDto, List list, String str3, String str4, String str5, int i2, zcl zclVar) {
        this(i, str, str2, serviceBookingGetSettingsGroupDto, list, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : str5);
    }
}
