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

/* compiled from: RelationRecord.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lexpo/modules/contacts/next/records/fields/RelationRecord;", "", "Existing", "New", "Patch", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface RelationRecord {

    /* compiled from: RelationRecord.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, d2 = {"Lexpo/modules/contacts/next/records/fields/RelationRecord$Existing;", "Lexpo/modules/contacts/next/records/ExistingRecord;", "id", "", "name", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getName$annotations", "getName", "getLabel$annotations", "getLabel", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Existing implements ExistingRecord {
        private final String id;
        private final String label;
        private final String name;

        public static /* synthetic */ Existing copy$default(Existing existing, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = existing.id;
            }
            if ((i & 2) != 0) {
                str2 = existing.name;
            }
            if ((i & 4) != 0) {
                str3 = existing.label;
            }
            return existing.copy(str, str2, str3);
        }

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        @Field
        public static /* synthetic */ void getName$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Existing copy(String id, String name, String label) {
            Intrinsics.checkNotNullParameter(id, "id");
            return new Existing(id, name, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Existing)) {
                return false;
            }
            Existing existing = (Existing) other;
            return Intrinsics.areEqual(this.id, existing.id) && Intrinsics.areEqual(this.name, existing.name) && Intrinsics.areEqual(this.label, existing.label);
        }

        public int hashCode() {
            int hashCode = this.id.hashCode() * 31;
            String str = this.name;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.label;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Existing(id=" + this.id + ", name=" + this.name + ", label=" + this.label + ")";
        }

        public Existing(String id, String str, String str2) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.id = id;
            this.name = str;
            this.label = str2;
        }

        public /* synthetic */ Existing(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
        }

        @Override // expo.modules.contacts.next.records.RecordWithId
        public String getId() {
            return this.id;
        }

        public final String getName() {
            return this.name;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    /* compiled from: RelationRecord.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\u0017"}, d2 = {"Lexpo/modules/contacts/next/records/fields/RelationRecord$New;", "Lexpo/modules/contacts/next/records/NewRecord;", Constants.ScionAnalytics.PARAM_LABEL, "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLabel$annotations", "()V", "getLabel", "()Ljava/lang/String;", "getName$annotations", "getName", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class New implements NewRecord {
        private final String label;
        private final String name;

        /* JADX WARN: Multi-variable type inference failed */
        public New() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ New copy$default(New r0, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = r0.label;
            }
            if ((i & 2) != 0) {
                str2 = r0.name;
            }
            return r0.copy(str, str2);
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        @Field
        public static /* synthetic */ void getName$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final String getName() {
            return this.name;
        }

        public final New copy(String label, String name) {
            return new New(label, name);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof New)) {
                return false;
            }
            New r5 = (New) other;
            return Intrinsics.areEqual(this.label, r5.label) && Intrinsics.areEqual(this.name, r5.name);
        }

        public int hashCode() {
            String str = this.label;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.name;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "New(label=" + this.label + ", name=" + this.name + ")";
        }

        public New(String str, String str2) {
            this.label = str;
            this.name = str2;
        }

        public /* synthetic */ New(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getName() {
            return this.name;
        }
    }

    /* compiled from: RelationRecord.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0004\u001a\u00020\u00058\u0016@\u0016X\u0097.¢\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0013"}, d2 = {"Lexpo/modules/contacts/next/records/fields/RelationRecord$Patch;", "Lexpo/modules/contacts/next/records/PatchRecord;", "<init>", "()V", "id", "", "getId$annotations", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", Constants.ScionAnalytics.PARAM_LABEL, "Lexpo/modules/kotlin/types/ValueOrUndefined;", "getLabel$annotations", "getLabel", "()Lexpo/modules/kotlin/types/ValueOrUndefined;", "name", "getName$annotations", "getName", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Patch implements PatchRecord {
        public String id;
        private final ValueOrUndefined<String> label;
        private final ValueOrUndefined<String> name;

        @Field
        @Required
        public static /* synthetic */ void getId$annotations() {
        }

        @Field
        public static /* synthetic */ void getLabel$annotations() {
        }

        @Field
        public static /* synthetic */ void getName$annotations() {
        }

        public Patch() {
            ValueOrUndefined.Companion companion = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.label = undefined;
            ValueOrUndefined.Companion companion2 = ValueOrUndefined.INSTANCE;
            ValueOrUndefined.Undefined undefined2 = ValueOrUndefined.Undefined.INSTANCE;
            Intrinsics.checkNotNull(undefined2, "null cannot be cast to non-null type expo.modules.kotlin.types.ValueOrUndefined<T of expo.modules.kotlin.types.ValueOrUndefined.Companion.getUndefined>");
            this.name = undefined2;
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

        public final ValueOrUndefined<String> getName() {
            return this.name;
        }
    }
}
