package com.socure.docv.capturesdk.core.extractor.model;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;

/* compiled from: ExtractedMrz.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\"\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010G\u001a\u00020\u0004H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\nX\u0080\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0004\b\u0015\u0010\bR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\bR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\bR\u001e\u0010%\u001a\u0004\u0018\u00010&X\u0080\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR\u001c\u0010/\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001c\u00102\u001a\u0004\u0018\u00010\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\bR\u001c\u00105\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\bR\u001c\u00108\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0006\"\u0004\b:\u0010\bR\u001e\u0010;\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b<\u0010(\"\u0004\b=\u0010*R\u001e\u0010>\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u001e\u0010A\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\bB\u0010(\"\u0004\bC\u0010*R\u001e\u0010D\u001a\u0004\u0018\u00010&X\u0086\u000e¢\u0006\u0010\n\u0002\u0010+\u001a\u0004\bE\u0010(\"\u0004\bF\u0010*¨\u0006H"}, d2 = {"Lcom/socure/docv/capturesdk/core/extractor/model/ExtractedMrz;", "Lcom/socure/docv/capturesdk/core/extractor/model/BaseExtractedData;", "()V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "code1", "", "getCode1$capturesdk_productionRelease", "()Ljava/lang/Character;", "setCode1$capturesdk_productionRelease", "(Ljava/lang/Character;)V", "Ljava/lang/Character;", "code2", "getCode2$capturesdk_productionRelease", "setCode2$capturesdk_productionRelease", "dob", "getDob", "setDob", "documentNumber", "getDocumentNumber", "setDocumentNumber", "expirationDate", "getExpirationDate", "setExpirationDate", "firstName", "getFirstName", "setFirstName", "format", "getFormat", "setFormat", "fullName", "getFullName", "setFullName", "isPersonalNumberValid", "", "isPersonalNumberValid$capturesdk_productionRelease", "()Ljava/lang/Boolean;", "setPersonalNumberValid$capturesdk_productionRelease", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "issuingCountry", "getIssuingCountry", "setIssuingCountry", "nationality", "getNationality", "setNationality", "personalNumber", "getPersonalNumber$capturesdk_productionRelease", "setPersonalNumber$capturesdk_productionRelease", "sex", "getSex", "setSex", "surname", "getSurname", "setSurname", "validComposite", "getValidComposite", "setValidComposite", "validDateOfBirth", "getValidDateOfBirth", "setValidDateOfBirth", "validDocumentNumber", "getValidDocumentNumber", "setValidDocumentNumber", "validExpirationDate", "getValidExpirationDate", "setValidExpirationDate", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ExtractedMrz extends BaseExtractedData {
    public static final int $stable = 8;
    private String code;
    private Character code1;
    private Character code2;
    private String dob;
    private String documentNumber;
    private String expirationDate;
    private String firstName;
    private String format;
    private String fullName;
    private Boolean isPersonalNumberValid;
    private String issuingCountry;
    private String nationality;
    private String personalNumber;
    private String sex;
    private String surname;
    private Boolean validComposite;
    private Boolean validDateOfBirth;
    private Boolean validDocumentNumber;
    private Boolean validExpirationDate;

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        this.code = str;
    }

    /* renamed from: getCode1$capturesdk_productionRelease, reason: from getter */
    public final Character getCode1() {
        return this.code1;
    }

    public final void setCode1$capturesdk_productionRelease(Character ch) {
        this.code1 = ch;
    }

    /* renamed from: getCode2$capturesdk_productionRelease, reason: from getter */
    public final Character getCode2() {
        return this.code2;
    }

    public final void setCode2$capturesdk_productionRelease(Character ch) {
        this.code2 = ch;
    }

    public final String getFormat() {
        return this.format;
    }

    public final void setFormat(String str) {
        this.format = str;
    }

    public final String getIssuingCountry() {
        return this.issuingCountry;
    }

    public final void setIssuingCountry(String str) {
        this.issuingCountry = str;
    }

    public final String getSurname() {
        return this.surname;
    }

    public final void setSurname(String str) {
        this.surname = str;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final void setFullName(String str) {
        this.fullName = str;
    }

    public final String getDocumentNumber() {
        return this.documentNumber;
    }

    public final void setDocumentNumber(String str) {
        this.documentNumber = str;
    }

    public final String getNationality() {
        return this.nationality;
    }

    public final void setNationality(String str) {
        this.nationality = str;
    }

    public final String getDob() {
        return this.dob;
    }

    public final void setDob(String str) {
        this.dob = str;
    }

    public final String getSex() {
        return this.sex;
    }

    public final void setSex(String str) {
        this.sex = str;
    }

    public final String getExpirationDate() {
        return this.expirationDate;
    }

    public final void setExpirationDate(String str) {
        this.expirationDate = str;
    }

    /* renamed from: getPersonalNumber$capturesdk_productionRelease, reason: from getter */
    public final String getPersonalNumber() {
        return this.personalNumber;
    }

    public final void setPersonalNumber$capturesdk_productionRelease(String str) {
        this.personalNumber = str;
    }

    public final Boolean getValidDocumentNumber() {
        return this.validDocumentNumber;
    }

    public final void setValidDocumentNumber(Boolean bool) {
        this.validDocumentNumber = bool;
    }

    public final Boolean getValidDateOfBirth() {
        return this.validDateOfBirth;
    }

    public final void setValidDateOfBirth(Boolean bool) {
        this.validDateOfBirth = bool;
    }

    public final Boolean getValidExpirationDate() {
        return this.validExpirationDate;
    }

    public final void setValidExpirationDate(Boolean bool) {
        this.validExpirationDate = bool;
    }

    /* renamed from: isPersonalNumberValid$capturesdk_productionRelease, reason: from getter */
    public final Boolean getIsPersonalNumberValid() {
        return this.isPersonalNumberValid;
    }

    public final void setPersonalNumberValid$capturesdk_productionRelease(Boolean bool) {
        this.isPersonalNumberValid = bool;
    }

    public final Boolean getValidComposite() {
        return this.validComposite;
    }

    public final void setValidComposite(Boolean bool) {
        this.validComposite = bool;
    }

    public String toString() {
        return "ExtractedMrz(code=" + this.code + ", code1=" + this.code1 + ", code2=" + this.code2 + ", format=" + this.format + ", issuingCountry=" + this.issuingCountry + ", surName=" + this.surname + ", firstName=" + this.firstName + ", fullName=" + this.fullName + ", documentNumber=" + this.documentNumber + ", nationality=" + this.nationality + ", dob=" + this.dob + ", sex=" + this.sex + ", expirationDate=" + this.expirationDate + ", personalNumber=" + this.personalNumber + ", validDocumentNumber=" + this.validDocumentNumber + ", validDateOfBirth=" + this.validDateOfBirth + ", validExpirationDate=" + this.validExpirationDate + ", isPersonalNumberValid=" + this.isPersonalNumberValid + ", validComposite=" + this.validComposite + ")";
    }
}
