package expo.modules.contacts.next.domain.wrappers;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContactId.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/wrappers/ContactId;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", InAppPurchaseConstants.METHOD_TO_STRING, "toString-impl", "Companion", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class ContactId {
    public static final String COLUMN_IN_CONTACTS_TABLE = "_id";
    public static final String COLUMN_IN_DATA_TABLE = "contact_id";
    public static final String COLUMN_IN_RAW_CONTACTS_TABLE = "contact_id";
    private final String value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContactId m11731boximpl(String str) {
        return new ContactId(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11732constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11733equalsimpl(String str, Object obj) {
        return (obj instanceof ContactId) && Intrinsics.areEqual(str, ((ContactId) obj).m11737unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11734equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11735hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11736toStringimpl(String str) {
        return "ContactId(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m11733equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11735hashCodeimpl(this.value);
    }

    public String toString() {
        return m11736toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m11737unboximpl() {
        return this.value;
    }

    private /* synthetic */ ContactId(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
