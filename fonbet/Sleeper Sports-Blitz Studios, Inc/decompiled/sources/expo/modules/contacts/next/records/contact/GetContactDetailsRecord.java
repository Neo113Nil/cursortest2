package expo.modules.contacts.next.records.contact;

import expo.modules.contacts.next.records.fields.AddressRecord;
import expo.modules.contacts.next.records.fields.DateRecord;
import expo.modules.contacts.next.records.fields.EmailRecord;
import expo.modules.contacts.next.records.fields.ExtraNameRecord;
import expo.modules.contacts.next.records.fields.PhoneRecord;
import expo.modules.contacts.next.records.fields.RelationRecord;
import expo.modules.contacts.next.records.fields.UrlAddressRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GetContactDetailsRecord.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\u0018\u00002\u00020\u0001BÙ\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0017\u0012\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u0017\u0012\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0017¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010(\u001a\u0004\b.\u0010*R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010(\u001a\u0004\b0\u0010*R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010(\u001a\u0004\b2\u0010*R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010(\u001a\u0004\b4\u0010*R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010(\u001a\u0004\b6\u0010*R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010(\u001a\u0004\b8\u0010*R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010(\u001a\u0004\b:\u0010*R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010(\u001a\u0004\b<\u0010*R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010(\u001a\u0004\b>\u0010*R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010(\u001a\u0004\b@\u0010*R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010(\u001a\u0004\bB\u0010*R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010(\u001a\u0004\bD\u0010*R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010(\u001a\u0004\bF\u0010*R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010(\u001a\u0004\bH\u0010*R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010(\u001a\u0004\bJ\u0010*R \u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010M\u0012\u0004\bK\u0010(\u001a\u0004\b\u0014\u0010LR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u0010(\u001a\u0004\bO\u0010PR$\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010(\u001a\u0004\bR\u0010PR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bS\u0010(\u001a\u0004\bT\u0010PR$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bU\u0010(\u001a\u0004\bV\u0010PR$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u0010(\u001a\u0004\bX\u0010PR$\u0010!\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bY\u0010(\u001a\u0004\bZ\u0010PR$\u0010#\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b[\u0010(\u001a\u0004\b\\\u0010P¨\u0006]"}, d2 = {"Lexpo/modules/contacts/next/records/contact/GetContactDetailsRecord;", "Lexpo/modules/kotlin/records/Record;", "id", "", "fullName", "givenName", "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "company", "department", "jobTitle", "phoneticCompanyName", "note", "image", "thumbnail", "isFavourite", "", "emails", "", "Lexpo/modules/contacts/next/records/fields/EmailRecord$Existing;", "dates", "Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "phones", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$Existing;", "addresses", "Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;", "relations", "Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;", "urlAddresses", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$Existing;", "extraNames", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$Existing;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getFullName$annotations", "getFullName", "getGivenName$annotations", "getGivenName", "getMiddleName$annotations", "getMiddleName", "getFamilyName$annotations", "getFamilyName", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "getPhoneticGivenName$annotations", "getPhoneticGivenName", "getPhoneticMiddleName$annotations", "getPhoneticMiddleName", "getPhoneticFamilyName$annotations", "getPhoneticFamilyName", "getCompany$annotations", "getCompany", "getDepartment$annotations", "getDepartment", "getJobTitle$annotations", "getJobTitle", "getPhoneticCompanyName$annotations", "getPhoneticCompanyName", "getNote$annotations", "getNote", "getImage$annotations", "getImage", "getThumbnail$annotations", "getThumbnail", "isFavourite$annotations", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEmails$annotations", "getEmails", "()Ljava/util/List;", "getDates$annotations", "getDates", "getPhones$annotations", "getPhones", "getAddresses$annotations", "getAddresses", "getRelations$annotations", "getRelations", "getUrlAddresses$annotations", "getUrlAddresses", "getExtraNames$annotations", "getExtraNames", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class GetContactDetailsRecord implements Record {
    private final List<AddressRecord.Existing> addresses;
    private final String company;
    private final List<DateRecord.Existing> dates;
    private final String department;
    private final List<EmailRecord.Existing> emails;
    private final List<ExtraNameRecord.Existing> extraNames;
    private final String familyName;
    private final String fullName;
    private final String givenName;
    private final String id;
    private final String image;
    private final Boolean isFavourite;
    private final String jobTitle;
    private final String middleName;
    private final String note;
    private final List<PhoneRecord.Existing> phones;
    private final String phoneticCompanyName;
    private final String phoneticFamilyName;
    private final String phoneticGivenName;
    private final String phoneticMiddleName;
    private final String prefix;
    private final List<RelationRecord.Existing> relations;
    private final String suffix;
    private final String thumbnail;
    private final List<UrlAddressRecord.Existing> urlAddresses;

    @Field
    public static /* synthetic */ void getAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void getCompany$annotations() {
    }

    @Field
    public static /* synthetic */ void getDates$annotations() {
    }

    @Field
    public static /* synthetic */ void getDepartment$annotations() {
    }

    @Field
    public static /* synthetic */ void getEmails$annotations() {
    }

    @Field
    public static /* synthetic */ void getExtraNames$annotations() {
    }

    @Field
    public static /* synthetic */ void getFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getFullName$annotations() {
    }

    @Field
    public static /* synthetic */ void getGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getId$annotations() {
    }

    @Field
    public static /* synthetic */ void getImage$annotations() {
    }

    @Field
    public static /* synthetic */ void getJobTitle$annotations() {
    }

    @Field
    public static /* synthetic */ void getMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getNote$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhones$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticCompanyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticFamilyName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticGivenName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPhoneticMiddleName$annotations() {
    }

    @Field
    public static /* synthetic */ void getPrefix$annotations() {
    }

    @Field
    public static /* synthetic */ void getRelations$annotations() {
    }

    @Field
    public static /* synthetic */ void getSuffix$annotations() {
    }

    @Field
    public static /* synthetic */ void getThumbnail$annotations() {
    }

    @Field
    public static /* synthetic */ void getUrlAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void isFavourite$annotations() {
    }

    public GetContactDetailsRecord(String id, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Boolean bool, List<EmailRecord.Existing> list, List<DateRecord.Existing> list2, List<PhoneRecord.Existing> list3, List<AddressRecord.Existing> list4, List<RelationRecord.Existing> list5, List<UrlAddressRecord.Existing> list6, List<ExtraNameRecord.Existing> list7) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.id = id;
        this.fullName = str;
        this.givenName = str2;
        this.middleName = str3;
        this.familyName = str4;
        this.prefix = str5;
        this.suffix = str6;
        this.phoneticGivenName = str7;
        this.phoneticMiddleName = str8;
        this.phoneticFamilyName = str9;
        this.company = str10;
        this.department = str11;
        this.jobTitle = str12;
        this.phoneticCompanyName = str13;
        this.note = str14;
        this.image = str15;
        this.thumbnail = str16;
        this.isFavourite = bool;
        this.emails = list;
        this.dates = list2;
        this.phones = list3;
        this.addresses = list4;
        this.relations = list5;
        this.urlAddresses = list6;
        this.extraNames = list7;
    }

    public final String getId() {
        return this.id;
    }

    public final String getFullName() {
        return this.fullName;
    }

    public final String getGivenName() {
        return this.givenName;
    }

    public final String getMiddleName() {
        return this.middleName;
    }

    public final String getFamilyName() {
        return this.familyName;
    }

    public final String getPrefix() {
        return this.prefix;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final String getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    public final String getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    public final String getCompany() {
        return this.company;
    }

    public final String getDepartment() {
        return this.department;
    }

    public final String getJobTitle() {
        return this.jobTitle;
    }

    public final String getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    public final String getNote() {
        return this.note;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    /* renamed from: isFavourite, reason: from getter */
    public final Boolean getIsFavourite() {
        return this.isFavourite;
    }

    public /* synthetic */ GetContactDetailsRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, Boolean bool, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, (i & 32768) != 0 ? null : str16, (i & 65536) != 0 ? null : str17, (i & 131072) == 0 ? bool : null, (i & 262144) != 0 ? CollectionsKt.emptyList() : list, (i & 524288) != 0 ? CollectionsKt.emptyList() : list2, (i & 1048576) != 0 ? CollectionsKt.emptyList() : list3, (i & 2097152) != 0 ? CollectionsKt.emptyList() : list4, (i & 4194304) != 0 ? CollectionsKt.emptyList() : list5, (i & 8388608) != 0 ? CollectionsKt.emptyList() : list6, (i & 16777216) != 0 ? CollectionsKt.emptyList() : list7);
    }

    public final List<EmailRecord.Existing> getEmails() {
        return this.emails;
    }

    public final List<DateRecord.Existing> getDates() {
        return this.dates;
    }

    public final List<PhoneRecord.Existing> getPhones() {
        return this.phones;
    }

    public final List<AddressRecord.Existing> getAddresses() {
        return this.addresses;
    }

    public final List<RelationRecord.Existing> getRelations() {
        return this.relations;
    }

    public final List<UrlAddressRecord.Existing> getUrlAddresses() {
        return this.urlAddresses;
    }

    public final List<ExtraNameRecord.Existing> getExtraNames() {
        return this.extraNames;
    }
}
