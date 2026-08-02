package Nf;

import Gb.c;
import com.google.gson.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class b {

    @c("action_type")
    @Nullable
    private final String actionType;

    @c("brand_id")
    @Nullable
    private final String brandId;

    @c("current_page_title")
    @Nullable
    private final String currentPageTitle;

    @c("current_page_url")
    @Nullable
    private final String currentPageUrl;

    @c("custom_action_name")
    @Nullable
    private final String customActionName;

    @c("emailid")
    @Nullable
    private final String emailId;

    @c("encrypted_visitor_info")
    @Nullable
    private final String encryptedVisitorInfo;

    @c("language")
    @Nullable
    private final String language;

    @c("name")
    @Nullable
    private final String name;

    @c("phonenumber")
    @Nullable
    private final String phoneNumber;

    @c("referer")
    @Nullable
    private final String referer;

    @c("visitor_info")
    @Nullable
    private final h visitorInfo;

    public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, h hVar) {
        this.brandId = str;
        this.actionType = str2;
        this.encryptedVisitorInfo = str3;
        this.currentPageTitle = str4;
        this.currentPageUrl = str5;
        this.language = str6;
        this.name = str7;
        this.emailId = str8;
        this.phoneNumber = str9;
        this.referer = str10;
        this.customActionName = str11;
        this.visitorInfo = hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.areEqual(this.brandId, bVar.brandId) && Intrinsics.areEqual(this.actionType, bVar.actionType) && Intrinsics.areEqual(this.encryptedVisitorInfo, bVar.encryptedVisitorInfo) && Intrinsics.areEqual(this.currentPageTitle, bVar.currentPageTitle) && Intrinsics.areEqual(this.currentPageUrl, bVar.currentPageUrl) && Intrinsics.areEqual(this.language, bVar.language) && Intrinsics.areEqual(this.name, bVar.name) && Intrinsics.areEqual(this.emailId, bVar.emailId) && Intrinsics.areEqual(this.phoneNumber, bVar.phoneNumber) && Intrinsics.areEqual(this.referer, bVar.referer) && Intrinsics.areEqual(this.customActionName, bVar.customActionName) && Intrinsics.areEqual(this.visitorInfo, bVar.visitorInfo);
    }

    public int hashCode() {
        String str = this.brandId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.encryptedVisitorInfo;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.currentPageTitle;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currentPageUrl;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.language;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.name;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.emailId;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.phoneNumber;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.referer;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.customActionName;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        h hVar = this.visitorInfo;
        return hashCode11 + (hVar != null ? hVar.hashCode() : 0);
    }

    public String toString() {
        return "TriggerInitiationPayload(brandId=" + this.brandId + ", actionType=" + this.actionType + ", encryptedVisitorInfo=" + this.encryptedVisitorInfo + ", currentPageTitle=" + this.currentPageTitle + ", currentPageUrl=" + this.currentPageUrl + ", language=" + this.language + ", name=" + this.name + ", emailId=" + this.emailId + ", phoneNumber=" + this.phoneNumber + ", referer=" + this.referer + ", customActionName=" + this.customActionName + ", visitorInfo=" + this.visitorInfo + ')';
    }
}
