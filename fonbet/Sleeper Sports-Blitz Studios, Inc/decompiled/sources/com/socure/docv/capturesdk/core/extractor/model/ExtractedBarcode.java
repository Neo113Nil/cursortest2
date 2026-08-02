package com.socure.docv.capturesdk.core.extractor.model;

import androidx.autofill.HintConstants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: ExtractedBarcode.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b9\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010<\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001c\u0010!\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001c\u0010$\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001c\u0010*\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001c\u0010-\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001c\u00100\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001c\u00103\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001c\u00106\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001c\u00109\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0006\"\u0004\b;\u0010\b¨\u0006="}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedBarcode;", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "()V", "address", "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "address2", "getAddress2$capturesdk_productionRelease", "setAddress2$capturesdk_productionRelease", "city", "getCity", "setCity", "country", "getCountry", "setCountry", "dob", "getDob", "setDob", "documentNumber", "getDocumentNumber", "setDocumentNumber", "expirationDate", "getExpirationDate", "setExpirationDate", "eyeColor", "getEyeColor$capturesdk_productionRelease", "setEyeColor$capturesdk_productionRelease", "firstName", "getFirstName", "setFirstName", "formattedDob", "getFormattedDob", "setFormattedDob", "fullName", "getFullName", "setFullName", "heightCm", "getHeightCm$capturesdk_productionRelease", "setHeightCm$capturesdk_productionRelease", "heightIn", "getHeightIn$capturesdk_productionRelease", "setHeightIn$capturesdk_productionRelease", "issueDate", "getIssueDate", "setIssueDate", "lastName", "getLastName", "setLastName", HintConstants.AUTOFILL_HINT_POSTAL_CODE, "getPostalCode", "setPostalCode", "sex", "getSex$capturesdk_productionRelease", "setSex$capturesdk_productionRelease", "state", "getState", "setState", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtractedBarcode extends BaseExtractedData {
    public static final int $stable = 8;
    private String address;
    private String address2;
    private String city;
    private String country;
    private String dob;
    private String documentNumber;
    private String expirationDate;
    private String eyeColor;
    private String firstName;
    private String formattedDob;
    private String fullName;
    private String heightCm;
    private String heightIn;
    private String issueDate;
    private String lastName;
    private String postalCode;
    private String sex;
    private String state;

    /* renamed from: getEyeColor$capturesdk_productionRelease, reason: from getter */
    public final String getEyeColor() {
        return this.eyeColor;
    }

    public final void setEyeColor$capturesdk_productionRelease(String str) {
        this.eyeColor = str;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    /* renamed from: getSex$capturesdk_productionRelease, reason: from getter */
    public final String getSex() {
        return this.sex;
    }

    public final void setSex$capturesdk_productionRelease(String str) {
        this.sex = str;
    }

    public final String getState() {
        return this.state;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    /* renamed from: getAddress2$capturesdk_productionRelease, reason: from getter */
    public final String getAddress2() {
        return this.address2;
    }

    public final void setAddress2$capturesdk_productionRelease(String str) {
        this.address2 = str;
    }

    public final String getPostalCode() {
        return this.postalCode;
    }

    public final void setPostalCode(String str) {
        this.postalCode = str;
    }

    public final String getCity() {
        return this.city;
    }

    public final void setCity(String str) {
        this.city = str;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final void setIssueDate(String str) {
        this.issueDate = str;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final void setExpirationDate(String str) {
        this.expirationDate = str;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    /* renamed from: getHeightIn$capturesdk_productionRelease, reason: from getter */
    public final String getHeightIn() {
        return this.heightIn;
    }

    public final void setHeightIn$capturesdk_productionRelease(String str) {
        this.heightIn = str;
    }

    /* renamed from: getHeightCm$capturesdk_productionRelease, reason: from getter */
    public final String getHeightCm() {
        return this.heightCm;
    }

    public final void setHeightCm$capturesdk_productionRelease(String str) {
        this.heightCm = str;
    }

    public final String getDob() {
        return this.dob;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final String getFormattedDob() {
        return this.formattedDob;
    }

    public final void setFormattedDob(String str) {
        this.formattedDob = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public String toString() {
        return "ExtractedBarcode(eyeColor=" + this.eyeColor + ", firstName=" + this.firstName + ", sex=" + this.sex + ", state=" + this.state + ", address=" + this.address + ", address2=" + this.address2 + ", postalCode=" + this.postalCode + ", city=" + this.city + ", lastName=" + this.lastName + ", documentNumber=" + this.documentNumber + ", issueDate=" + this.issueDate + ", expirationDate=" + this.expirationDate + ", fullName=" + this.fullName + ", heightIn=" + this.heightIn + ", heightCm=" + this.heightCm + ", dob=" + this.dob + ", formattedDob=" + this.formattedDob + ", country=" + this.country + ")";
    }
}
