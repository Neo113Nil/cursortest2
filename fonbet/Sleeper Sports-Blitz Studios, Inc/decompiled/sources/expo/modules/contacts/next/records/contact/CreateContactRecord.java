package expo.modules.contacts.next.records.contact;

import com.facebook.appevents.iap.InAppPurchaseConstants;
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

/* compiled from: CreateContactRecord.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bJ\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B·\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014¢\u0006\u0004\b\"\u0010#J\u000b\u0010S\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010]\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010`\u001a\u00020\u0011HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014HÆ\u0003J\u0011\u0010c\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0014HÆ\u0003J\u0011\u0010d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0014HÆ\u0003J\u0011\u0010e\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u0014HÆ\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u0014HÆ\u0003J\u0011\u0010g\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0014HÆ\u0003J\u0011\u0010h\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014HÆ\u0003J¹\u0002\u0010i\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00142\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00142\u0010\b\u0002\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00142\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00142\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0014HÆ\u0001J\u0013\u0010j\u001a\u00020\u00112\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\t\u0010m\u001a\u00020nHÖ\u0001J\t\u0010o\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010%\u001a\u0004\b/\u0010'R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010%\u001a\u0004\b1\u0010'R\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010%\u001a\u0004\b3\u0010'R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010%\u001a\u0004\b5\u0010'R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b6\u0010%\u001a\u0004\b7\u0010'R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u001e\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b:\u0010%\u001a\u0004\b;\u0010'R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u0010%\u001a\u0004\b=\u0010'R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b>\u0010%\u001a\u0004\b?\u0010'R\u001c\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b@\u0010%\u001a\u0004\b\u0010\u0010AR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u0010%\u001a\u0004\bC\u0010'R$\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bD\u0010%\u001a\u0004\bE\u0010FR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bG\u0010%\u001a\u0004\bH\u0010FR$\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bI\u0010%\u001a\u0004\bJ\u0010FR$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u0010%\u001a\u0004\bL\u0010FR$\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bM\u0010%\u001a\u0004\bN\u0010FR$\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bO\u0010%\u001a\u0004\bP\u0010FR$\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u0010%\u001a\u0004\bR\u0010F¨\u0006p"}, d2 = {"Lexpo/modules/contacts/next/records/contact/CreateContactRecord;", "Lexpo/modules/kotlin/records/Record;", "givenName", "", "middleName", "familyName", "prefix", "suffix", "phoneticGivenName", "phoneticMiddleName", "phoneticFamilyName", "company", "department", "jobTitle", "phoneticCompanyName", "note", "isFavourite", "", "image", "emails", "", "Lexpo/modules/contacts/next/records/fields/EmailRecord$New;", "dates", "Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "phones", "Lexpo/modules/contacts/next/records/fields/PhoneRecord$New;", "addresses", "Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "relations", "Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "urlAddresses", "Lexpo/modules/contacts/next/records/fields/UrlAddressRecord$New;", "extraNames", "Lexpo/modules/contacts/next/records/fields/ExtraNameRecord$New;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGivenName$annotations", "()V", "getGivenName", "()Ljava/lang/String;", "getMiddleName$annotations", "getMiddleName", "getFamilyName$annotations", "getFamilyName", "getPrefix$annotations", "getPrefix", "getSuffix$annotations", "getSuffix", "getPhoneticGivenName$annotations", "getPhoneticGivenName", "getPhoneticMiddleName$annotations", "getPhoneticMiddleName", "getPhoneticFamilyName$annotations", "getPhoneticFamilyName", "getCompany$annotations", "getCompany", "getDepartment$annotations", "getDepartment", "getJobTitle$annotations", "getJobTitle", "getPhoneticCompanyName$annotations", "getPhoneticCompanyName", "getNote$annotations", "getNote", "isFavourite$annotations", "()Z", "getImage$annotations", "getImage", "getEmails$annotations", "getEmails", "()Ljava/util/List;", "getDates$annotations", "getDates", "getPhones$annotations", "getPhones", "getAddresses$annotations", "getAddresses", "getRelations$annotations", "getRelations", "getUrlAddresses$annotations", "getUrlAddresses", "getExtraNames$annotations", "getExtraNames", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class CreateContactRecord implements Record {
    private final List<AddressRecord.New> addresses;
    private final String company;
    private final List<DateRecord.New> dates;
    private final String department;
    private final List<EmailRecord.New> emails;
    private final List<ExtraNameRecord.New> extraNames;
    private final String familyName;
    private final String givenName;
    private final String image;
    private final boolean isFavourite;
    private final String jobTitle;
    private final String middleName;
    private final String note;
    private final List<PhoneRecord.New> phones;
    private final String phoneticCompanyName;
    private final String phoneticFamilyName;
    private final String phoneticGivenName;
    private final String phoneticMiddleName;
    private final String prefix;
    private final List<RelationRecord.New> relations;
    private final String suffix;
    private final List<UrlAddressRecord.New> urlAddresses;

    public CreateContactRecord() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public static /* synthetic */ CreateContactRecord copy$default(CreateContactRecord createContactRecord, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, Object obj) {
        List list8;
        List list9;
        String str15 = (i & 1) != 0 ? createContactRecord.givenName : str;
        String str16 = (i & 2) != 0 ? createContactRecord.middleName : str2;
        String str17 = (i & 4) != 0 ? createContactRecord.familyName : str3;
        String str18 = (i & 8) != 0 ? createContactRecord.prefix : str4;
        String str19 = (i & 16) != 0 ? createContactRecord.suffix : str5;
        String str20 = (i & 32) != 0 ? createContactRecord.phoneticGivenName : str6;
        String str21 = (i & 64) != 0 ? createContactRecord.phoneticMiddleName : str7;
        String str22 = (i & 128) != 0 ? createContactRecord.phoneticFamilyName : str8;
        String str23 = (i & 256) != 0 ? createContactRecord.company : str9;
        String str24 = (i & 512) != 0 ? createContactRecord.department : str10;
        String str25 = (i & 1024) != 0 ? createContactRecord.jobTitle : str11;
        String str26 = (i & 2048) != 0 ? createContactRecord.phoneticCompanyName : str12;
        String str27 = (i & 4096) != 0 ? createContactRecord.note : str13;
        boolean z2 = (i & 8192) != 0 ? createContactRecord.isFavourite : z;
        String str28 = str15;
        String str29 = (i & 16384) != 0 ? createContactRecord.image : str14;
        List list10 = (i & 32768) != 0 ? createContactRecord.emails : list;
        List list11 = (i & 65536) != 0 ? createContactRecord.dates : list2;
        List list12 = (i & 131072) != 0 ? createContactRecord.phones : list3;
        List list13 = (i & 262144) != 0 ? createContactRecord.addresses : list4;
        List list14 = (i & 524288) != 0 ? createContactRecord.relations : list5;
        List list15 = (i & 1048576) != 0 ? createContactRecord.urlAddresses : list6;
        if ((i & 2097152) != 0) {
            list9 = list15;
            list8 = createContactRecord.extraNames;
        } else {
            list8 = list7;
            list9 = list15;
        }
        return createContactRecord.copy(str28, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, z2, str29, list10, list11, list12, list13, list14, list9, list8);
    }

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
    public static /* synthetic */ void getGivenName$annotations() {
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
    public static /* synthetic */ void getUrlAddresses$annotations() {
    }

    @Field
    public static /* synthetic */ void isFavourite$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getGivenName() {
        return this.givenName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    /* renamed from: component11, reason: from getter */
    public final String getJobTitle() {
        return this.jobTitle;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPhoneticCompanyName() {
        return this.phoneticCompanyName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsFavourite() {
        return this.isFavourite;
    }

    /* renamed from: component15, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<EmailRecord.New> component16() {
        return this.emails;
    }

    public final List<DateRecord.New> component17() {
        return this.dates;
    }

    public final List<PhoneRecord.New> component18() {
        return this.phones;
    }

    public final List<AddressRecord.New> component19() {
        return this.addresses;
    }

    /* renamed from: component2, reason: from getter */
    public final String getMiddleName() {
        return this.middleName;
    }

    public final List<RelationRecord.New> component20() {
        return this.relations;
    }

    public final List<UrlAddressRecord.New> component21() {
        return this.urlAddresses;
    }

    public final List<ExtraNameRecord.New> component22() {
        return this.extraNames;
    }

    /* renamed from: component3, reason: from getter */
    public final String getFamilyName() {
        return this.familyName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    /* renamed from: component6, reason: from getter */
    public final String getPhoneticGivenName() {
        return this.phoneticGivenName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getPhoneticMiddleName() {
        return this.phoneticMiddleName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getPhoneticFamilyName() {
        return this.phoneticFamilyName;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCompany() {
        return this.company;
    }

    public final CreateContactRecord copy(String givenName, String middleName, String familyName, String prefix, String suffix, String phoneticGivenName, String phoneticMiddleName, String phoneticFamilyName, String company, String department, String jobTitle, String phoneticCompanyName, String note, boolean isFavourite, String image, List<EmailRecord.New> emails, List<DateRecord.New> dates, List<PhoneRecord.New> phones, List<AddressRecord.New> addresses, List<RelationRecord.New> relations, List<UrlAddressRecord.New> urlAddresses, List<ExtraNameRecord.New> extraNames) {
        return new CreateContactRecord(givenName, middleName, familyName, prefix, suffix, phoneticGivenName, phoneticMiddleName, phoneticFamilyName, company, department, jobTitle, phoneticCompanyName, note, isFavourite, image, emails, dates, phones, addresses, relations, urlAddresses, extraNames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateContactRecord)) {
            return false;
        }
        CreateContactRecord createContactRecord = (CreateContactRecord) other;
        return Intrinsics.areEqual(this.givenName, createContactRecord.givenName) && Intrinsics.areEqual(this.middleName, createContactRecord.middleName) && Intrinsics.areEqual(this.familyName, createContactRecord.familyName) && Intrinsics.areEqual(this.prefix, createContactRecord.prefix) && Intrinsics.areEqual(this.suffix, createContactRecord.suffix) && Intrinsics.areEqual(this.phoneticGivenName, createContactRecord.phoneticGivenName) && Intrinsics.areEqual(this.phoneticMiddleName, createContactRecord.phoneticMiddleName) && Intrinsics.areEqual(this.phoneticFamilyName, createContactRecord.phoneticFamilyName) && Intrinsics.areEqual(this.company, createContactRecord.company) && Intrinsics.areEqual(this.department, createContactRecord.department) && Intrinsics.areEqual(this.jobTitle, createContactRecord.jobTitle) && Intrinsics.areEqual(this.phoneticCompanyName, createContactRecord.phoneticCompanyName) && Intrinsics.areEqual(this.note, createContactRecord.note) && this.isFavourite == createContactRecord.isFavourite && Intrinsics.areEqual(this.image, createContactRecord.image) && Intrinsics.areEqual(this.emails, createContactRecord.emails) && Intrinsics.areEqual(this.dates, createContactRecord.dates) && Intrinsics.areEqual(this.phones, createContactRecord.phones) && Intrinsics.areEqual(this.addresses, createContactRecord.addresses) && Intrinsics.areEqual(this.relations, createContactRecord.relations) && Intrinsics.areEqual(this.urlAddresses, createContactRecord.urlAddresses) && Intrinsics.areEqual(this.extraNames, createContactRecord.extraNames);
    }

    public int hashCode() {
        String str = this.givenName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.middleName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.familyName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.prefix;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.suffix;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.phoneticGivenName;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.phoneticMiddleName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.phoneticFamilyName;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.company;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.department;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.jobTitle;
        int hashCode11 = (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.phoneticCompanyName;
        int hashCode12 = (hashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.note;
        int hashCode13 = (((hashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31) + Boolean.hashCode(this.isFavourite)) * 31;
        String str14 = this.image;
        int hashCode14 = (hashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        List<EmailRecord.New> list = this.emails;
        int hashCode15 = (hashCode14 + (list == null ? 0 : list.hashCode())) * 31;
        List<DateRecord.New> list2 = this.dates;
        int hashCode16 = (hashCode15 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<PhoneRecord.New> list3 = this.phones;
        int hashCode17 = (hashCode16 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<AddressRecord.New> list4 = this.addresses;
        int hashCode18 = (hashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<RelationRecord.New> list5 = this.relations;
        int hashCode19 = (hashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List<UrlAddressRecord.New> list6 = this.urlAddresses;
        int hashCode20 = (hashCode19 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List<ExtraNameRecord.New> list7 = this.extraNames;
        return hashCode20 + (list7 != null ? list7.hashCode() : 0);
    }

    public String toString() {
        return "CreateContactRecord(givenName=" + this.givenName + ", middleName=" + this.middleName + ", familyName=" + this.familyName + ", prefix=" + this.prefix + ", suffix=" + this.suffix + ", phoneticGivenName=" + this.phoneticGivenName + ", phoneticMiddleName=" + this.phoneticMiddleName + ", phoneticFamilyName=" + this.phoneticFamilyName + ", company=" + this.company + ", department=" + this.department + ", jobTitle=" + this.jobTitle + ", phoneticCompanyName=" + this.phoneticCompanyName + ", note=" + this.note + ", isFavourite=" + this.isFavourite + ", image=" + this.image + ", emails=" + this.emails + ", dates=" + this.dates + ", phones=" + this.phones + ", addresses=" + this.addresses + ", relations=" + this.relations + ", urlAddresses=" + this.urlAddresses + ", extraNames=" + this.extraNames + ")";
    }

    public CreateContactRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, List<EmailRecord.New> list, List<DateRecord.New> list2, List<PhoneRecord.New> list3, List<AddressRecord.New> list4, List<RelationRecord.New> list5, List<UrlAddressRecord.New> list6, List<ExtraNameRecord.New> list7) {
        this.givenName = str;
        this.middleName = str2;
        this.familyName = str3;
        this.prefix = str4;
        this.suffix = str5;
        this.phoneticGivenName = str6;
        this.phoneticMiddleName = str7;
        this.phoneticFamilyName = str8;
        this.company = str9;
        this.department = str10;
        this.jobTitle = str11;
        this.phoneticCompanyName = str12;
        this.note = str13;
        this.isFavourite = z;
        this.image = str14;
        this.emails = list;
        this.dates = list2;
        this.phones = list3;
        this.addresses = list4;
        this.relations = list5;
        this.urlAddresses = list6;
        this.extraNames = list7;
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

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final String getImage() {
        return this.image;
    }

    public /* synthetic */ CreateContactRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, boolean z, String str14, List list, List list2, List list3, List list4, List list5, List list6, List list7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, (i & 2048) != 0 ? null : str12, (i & 4096) != 0 ? null : str13, (i & 8192) != 0 ? false : z, (i & 16384) != 0 ? null : str14, (i & 32768) != 0 ? CollectionsKt.emptyList() : list, (i & 65536) != 0 ? CollectionsKt.emptyList() : list2, (i & 131072) != 0 ? CollectionsKt.emptyList() : list3, (i & 262144) != 0 ? CollectionsKt.emptyList() : list4, (i & 524288) != 0 ? CollectionsKt.emptyList() : list5, (i & 1048576) != 0 ? CollectionsKt.emptyList() : list6, (i & 2097152) != 0 ? CollectionsKt.emptyList() : list7);
    }

    public final List<EmailRecord.New> getEmails() {
        return this.emails;
    }

    public final List<DateRecord.New> getDates() {
        return this.dates;
    }

    public final List<PhoneRecord.New> getPhones() {
        return this.phones;
    }

    public final List<AddressRecord.New> getAddresses() {
        return this.addresses;
    }

    public final List<RelationRecord.New> getRelations() {
        return this.relations;
    }

    public final List<UrlAddressRecord.New> getUrlAddresses() {
        return this.urlAddresses;
    }

    public final List<ExtraNameRecord.New> getExtraNames() {
        return this.extraNames;
    }
}
