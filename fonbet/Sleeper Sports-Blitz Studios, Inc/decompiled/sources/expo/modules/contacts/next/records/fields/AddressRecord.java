package expo.modules.contacts.next.records.fields;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.PatchRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Required;
import expo.modules.kotlin.types.ValueOrUndefined;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddressRecord.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/contacts/next/records/fields/AddressRecord;", "", "Existing", "New", "Patch", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface AddressRecord {

    /* compiled from: AddressRecord.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u000fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\r\u001a\u0004\b\u001b\u0010\u000f¨\u0006+"}, d2 = {"Lexpo/modules/contacts/next/records/fields/AddressRecord$Existing;", "Lexpo/modules/contacts/next/records/ExistingRecord;", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "street", "city", "region", "postcode", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLabel$annotations", "getLabel", "getStreet$annotations", "getStreet", "getCity$annotations", "getCity", "getRegion$annotations", "getRegion", "getPostcode$annotations", "getPostcode", "getCountry$annotations", "getCountry", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Existing implements ExistingRecord {
        private final String city;
        private final String country;
        private final String id;
        private final String label;
        private final String postcode;
        private final String region;
        private final String street;

        public static /* synthetic */ Existing copy$default(Existing existing, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = existing.id;
            }
            if ((i & 2) != 0) {
                str2 = existing.label;
            }
            if ((i & 4) != 0) {
                str3 = existing.street;
            }
            if ((i & 8) != 0) {
                str4 = existing.city;
            }
            if ((i & 16) != 0) {
                str5 = existing.region;
            }
            if ((i & 32) != 0) {
                str6 = existing.postcode;
            }
            if ((i & 64) != 0) {
                str7 = existing.country;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return existing.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @Field
        public static /* synthetic */ void getCity$annotations() {
        }

        @Field
        public static /* synthetic */ void getCountry$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        @Field
        public static /* synthetic */ void getPostcode$annotations() {
        }

        @Field
        public static /* synthetic */ void getRegion$annotations() {
        }

        @Field
        public static /* synthetic */ void getStreet$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component3, reason: from getter */
        public final String getStreet() {
            return this.street;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* renamed from: component5, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* renamed from: component6, reason: from getter */
        public final String getPostcode() {
            return this.postcode;
        }

        /* renamed from: component7, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final Existing copy(String id, String label, String street, String city, String region, String postcode, String country) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Existing(id, label, street, city, region, postcode, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Existing)) {
                return false;
            }
            Existing existing = (Existing) other;
            return Intrinsics.areEqual(this.id, existing.id) && Intrinsics.areEqual(this.label, existing.label) && Intrinsics.areEqual(this.street, existing.street) && Intrinsics.areEqual(this.city, existing.city) && Intrinsics.areEqual(this.region, existing.region) && Intrinsics.areEqual(this.postcode, existing.postcode) && Intrinsics.areEqual(this.country, existing.country);
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.label;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.street;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.city;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.region;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postcode;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.country;
            return hashCode6 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "Existing(id=" + this.id + ", label=" + this.label + ", street=" + this.street + ", city=" + this.city + ", region=" + this.region + ", postcode=" + this.postcode + ", country=" + this.country + ")";
        }

        public Existing(String id, String str, String str2, String str3, String str4, String str5, String str6) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.label = str;
            this.street = str2;
            this.city = str3;
            this.region = str4;
            this.postcode = str5;
            this.country = str6;
        }

        public /* synthetic */ Existing(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }

        @Override // expo.modules.contacts.next.records.RecordWithId
        public String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getStreet() {
            return this.street;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getRegion() {
            return this.region;
        }

        public final String getPostcode() {
            return this.postcode;
        }

        public final String getCountry() {
            return this.country;
        }
    }

    /* compiled from: AddressRecord.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\f\u001a\u0004\b\u0018\u0010\u000e¨\u0006'"}, d2 = {"Lexpo/modules/contacts/next/records/fields/AddressRecord$New;", "Lexpo/modules/contacts/next/records/NewRecord;", Constants.ScionAnalytics.PARAM_LABEL, "", "street", "city", "region", "postcode", "country", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel$annotations", "()V", "getLabel", "()Ljava/lang/String;", "getStreet$annotations", "getStreet", "getCity$annotations", "getCity", "getRegion$annotations", "getRegion", "getPostcode$annotations", "getPostcode", "getCountry$annotations", "getCountry", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements NewRecord {
        private final String city;
        private final String country;
        private final String label;
        private final String postcode;
        private final String region;
        private final String street;

        public New() {
            this(null, null, null, null, null, null, 63, null);
        }

        public static /* synthetic */ New copy$default(New r0, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.label;
            }
            if ((i & 2) != 0) {
                str2 = r0.street;
            }
            if ((i & 4) != 0) {
                str3 = r0.city;
            }
            if ((i & 8) != 0) {
                str4 = r0.region;
            }
            if ((i & 16) != 0) {
                str5 = r0.postcode;
            }
            if ((i & 32) != 0) {
                str6 = r0.country;
            }
            String str7 = str5;
            String str8 = str6;
            return r0.copy(str, str2, str3, str4, str7, str8);
        }

        @Field
        public static /* synthetic */ void getCity$annotations() {
        }

        @Field
        public static /* synthetic */ void getCountry$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        @Field
        public static /* synthetic */ void getPostcode$annotations() {
        }

        @Field
        public static /* synthetic */ void getRegion$annotations() {
        }

        @Field
        public static /* synthetic */ void getStreet$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getStreet() {
            return this.street;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        /* renamed from: component5, reason: from getter */
        public final String getPostcode() {
            return this.postcode;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCountry() {
            return this.country;
        }

        public final New copy(String label, String street, String city, String region, String postcode, String country) {
            return new New(label, street, city, region, postcode, country);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.areEqual(this.label, r5.label) && Intrinsics.areEqual(this.street, r5.street) && Intrinsics.areEqual(this.city, r5.city) && Intrinsics.areEqual(this.region, r5.region) && Intrinsics.areEqual(this.postcode, r5.postcode) && Intrinsics.areEqual(this.country, r5.country);
        }

        public int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.street;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.city;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.region;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.postcode;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.country;
            return hashCode5 + (str6 != null ? str6.hashCode() : 0);
        }

        public String toString() {
            return "New(label=" + this.label + ", street=" + this.street + ", city=" + this.city + ", region=" + this.region + ", postcode=" + this.postcode + ", country=" + this.country + ")";
        }

        public New(String str, String str2, String str3, String str4, String str5, String str6) {
            this.label = str;
            this.street = str2;
            this.city = str3;
            this.region = str4;
            this.postcode = str5;
            this.country = str6;
        }

        public /* synthetic */ New(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getStreet() {
            return this.street;
        }

        public final String getCity() {
            return this.city;
        }

        public final String getRegion() {
            return this.region;
        }

        public final String getPostcode() {
            return this.postcode;
        }

        public final String getCountry() {
            return this.country;
        }
    }

    /* compiled from: AddressRecord.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lexpo/modules/contacts/next/records/fields/AddressRecord$Patch;", "Lexpo/modules/contacts/next/records/PatchRecord;", "<init>", "()V", "id", "", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/kotlin/types/ValueOrUndefined;", "getLabel$annotations", "getLabel", "()Lexpo/modules/kotlin/types/ValueOrUndefined;", "street", "getStreet$annotations", "getStreet", "city", "getCity$annotations", "getCity", "region", "getRegion$annotations", "getRegion", "postcode", "getPostcode$annotations", "getPostcode", "country", "getCountry$annotations", "getCountry", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Patch implements PatchRecord {
        private final ValueOrUndefined<String> city;
        private final ValueOrUndefined<String> country;
        public String id;
        private final ValueOrUndefined<String> label;
        private final ValueOrUndefined<String> postcode;
        private final ValueOrUndefined<String> region;
        private final ValueOrUndefined<String> street;

        @Field
        public static /* synthetic */ void getCity$annotations() {
        }

        @Field
        public static /* synthetic */ void getCountry$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        @Field
        public static /* synthetic */ void getPostcode$annotations() {
        }

        @Field
        public static /* synthetic */ void getRegion$annotations() {
        }

        @Field
        public static /* synthetic */ void getStreet$annotations() {
        }

        public Patch() {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.label = undefined;
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.street = undefined2;
            ValueOrUndefined.Companion companion3 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined3 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined3, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.city = undefined3;
            ValueOrUndefined.Companion companion4 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined4 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined4, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.region = undefined4;
            ValueOrUndefined.Companion companion5 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined5 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined5, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.postcode = undefined5;
            ValueOrUndefined.Companion companion6 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined6 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined6, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.country = undefined6;
        }

        @Override // expo.modules.contacts.next.records.RecordWithId
        public String getId() {
            String str = this.id;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("id");
            return null;
        }

        public void setId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.id = str;
        }

        public final ValueOrUndefined<String> getLabel() {
            return this.label;
        }

        public final ValueOrUndefined<String> getStreet() {
            return this.street;
        }

        public final ValueOrUndefined<String> getCity() {
            return this.city;
        }

        public final ValueOrUndefined<String> getRegion() {
            return this.region;
        }

        public final ValueOrUndefined<String> getPostcode() {
            return this.postcode;
        }

        public final ValueOrUndefined<String> getCountry() {
            return this.country;
        }
    }
}
