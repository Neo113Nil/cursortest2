package expo.modules.contacts.next.records.fields;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.firebase.messaging.Constants;
import expo.modules.contacts.next.records.ExistingRecord;
import expo.modules.contacts.next.records.NewRecord;
import expo.modules.contacts.next.records.PatchRecord;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.kotlin.records.Required;
import expo.modules.kotlin.types.ValueOrUndefined;
import io.sentry.metrics.MetricsUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DateRecord.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord;", "", "Existing", "New", "Patch", "ContactDateRecord", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface DateRecord {

    /* compiled from: DateRecord.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J+\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$Existing;", "Lexpo/modules/contacts/next/records/ExistingRecord;", "id", "", Constants.ScionAnalytics.PARAM_LABEL, "date", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getLabel$annotations", "getLabel", "getDate$annotations", "getDate", "()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Existing implements ExistingRecord {
        private final ContactDateRecord date;
        private final String id;
        private final String label;

        public static /* synthetic */ Existing copy$default(Existing existing, String str, String str2, ContactDateRecord contactDateRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                str = existing.id;
            }
            if ((i & 2) != 0) {
                str2 = existing.label;
            }
            if ((i & 4) != 0) {
                contactDateRecord = existing.date;
            }
            return existing.copy(str, str2, contactDateRecord);
        }

        @Field
        public static /* synthetic */ void getDate$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
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
        public final ContactDateRecord getDate() {
            return this.date;
        }

        public final Existing copy(String id, String label, ContactDateRecord date) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Existing(id, label, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Existing)) {
                return false;
            }
            Existing existing = (Existing) other;
            return Intrinsics.areEqual(this.id, existing.id) && Intrinsics.areEqual(this.label, existing.label) && Intrinsics.areEqual(this.date, existing.date);
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.label;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ContactDateRecord contactDateRecord = this.date;
            return hashCode2 + (contactDateRecord != null ? contactDateRecord.hashCode() : 0);
        }

        public String toString() {
            return "Existing(id=" + this.id + ", label=" + this.label + ", date=" + this.date + ")";
        }

        public Existing(String id, String str, ContactDateRecord contactDateRecord) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.label = str;
            this.date = contactDateRecord;
        }

        public /* synthetic */ Existing(String str, String str2, ContactDateRecord contactDateRecord, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : contactDateRecord);
        }

        @Override // expo.modules.contacts.next.records.RecordWithId
        public String getId() {
            return this.id;
        }

        public final String getLabel() {
            return this.label;
        }

        public final ContactDateRecord getDate() {
            return this.date;
        }
    }

    /* compiled from: DateRecord.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$New;", "Lexpo/modules/contacts/next/records/NewRecord;", Constants.ScionAnalytics.PARAM_LABEL, "", "date", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "<init>", "(Ljava/lang/String;Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;)V", "getLabel$annotations", "()V", "getLabel", "()Ljava/lang/String;", "getDate$annotations", "getDate", "()Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements NewRecord {
        private final ContactDateRecord date;
        private final String label;

        /* JADX WARN: Multi-variable type inference failed */
        public New() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ New copy$default(New r0, String str, ContactDateRecord contactDateRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.label;
            }
            if ((i & 2) != 0) {
                contactDateRecord = r0.date;
            }
            return r0.copy(str, contactDateRecord);
        }

        @Field
        public static /* synthetic */ void getDate$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final ContactDateRecord getDate() {
            return this.date;
        }

        public final New copy(String label, ContactDateRecord date) {
            return new New(label, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.areEqual(this.label, r5.label) && Intrinsics.areEqual(this.date, r5.date);
        }

        public int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            ContactDateRecord contactDateRecord = this.date;
            return hashCode + (contactDateRecord != null ? contactDateRecord.hashCode() : 0);
        }

        public String toString() {
            return "New(label=" + this.label + ", date=" + this.date + ")";
        }

        public New(String str, ContactDateRecord contactDateRecord) {
            this.label = str;
            this.date = contactDateRecord;
        }

        public /* synthetic */ New(String str, ContactDateRecord contactDateRecord, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : contactDateRecord);
        }

        public final String getLabel() {
            return this.label;
        }

        public final ContactDateRecord getDate() {
            return this.date;
        }
    }

    /* compiled from: DateRecord.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$Patch;", "Lexpo/modules/contacts/next/records/PatchRecord;", "<init>", "()V", "id", "", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/kotlin/types/ValueOrUndefined;", "getLabel$annotations", "getLabel", "()Lexpo/modules/kotlin/types/ValueOrUndefined;", "date", "Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "getDate$annotations", "getDate", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Patch implements PatchRecord {
        private final ValueOrUndefined<ContactDateRecord> date;
        public String id;
        private final ValueOrUndefined<String> label;

        @Field
        public static /* synthetic */ void getDate$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        public Patch() {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.label = undefined;
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.date = undefined2;
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

        public final ValueOrUndefined<ContactDateRecord> getDate() {
            return this.date;
        }
    }

    /* compiled from: DateRecord.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J.\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\f\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\t\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "Lexpo/modules/kotlin/records/Record;", "year", "", "month", MetricsUnit.Duration.DAY, "<init>", "(Ljava/lang/Integer;II)V", "getYear$annotations", "()V", "getYear", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMonth$annotations", "getMonth", "()I", "getDay$annotations", "getDay", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;II)Lexpo/modules/contacts/next/records/fields/DateRecord$ContactDateRecord;", "equals", "", "other", "", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContactDateRecord implements Record {
        private final int day;
        private final int month;
        private final Integer year;

        public static /* synthetic */ ContactDateRecord copy$default(ContactDateRecord contactDateRecord, Integer num, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                num = contactDateRecord.year;
            }
            if ((i3 & 2) != 0) {
                i = contactDateRecord.month;
            }
            if ((i3 & 4) != 0) {
                i2 = contactDateRecord.day;
            }
            return contactDateRecord.copy(num, i, i2);
        }

        @Field
        @Required
        public static /* synthetic */ void getDay$annotations() {
        }

        @Field
        @Required
        public static /* synthetic */ void getMonth$annotations() {
        }

        @Field
        public static /* synthetic */ void getYear$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final Integer getYear() {
            return this.year;
        }

        /* renamed from: component2, reason: from getter */
        public final int getMonth() {
            return this.month;
        }

        /* renamed from: component3, reason: from getter */
        public final int getDay() {
            return this.day;
        }

        public final ContactDateRecord copy(Integer year, int month, int day) {
            return new ContactDateRecord(year, month, day);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactDateRecord)) {
                return false;
            }
            ContactDateRecord contactDateRecord = (ContactDateRecord) other;
            return Intrinsics.areEqual(this.year, contactDateRecord.year) && this.month == contactDateRecord.month && this.day == contactDateRecord.day;
        }

        public int hashCode() {
            Integer num = this.year;
            return ((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.day);
        }

        public String toString() {
            return "ContactDateRecord(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ")";
        }

        public ContactDateRecord(Integer num, int i, int i2) {
            this.year = num;
            this.month = i;
            this.day = i2;
        }

        public /* synthetic */ ContactDateRecord(Integer num, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? null : num, i, i2);
        }

        public final Integer getYear() {
            return this.year;
        }

        public final int getMonth() {
            return this.month;
        }

        public final int getDay() {
            return this.day;
        }
    }
}
