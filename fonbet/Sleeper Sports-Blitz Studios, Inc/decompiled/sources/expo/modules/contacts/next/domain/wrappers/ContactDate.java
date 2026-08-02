package expo.modules.contacts.next.domain.wrappers;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.metrics.MetricsUnit;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: ContactDate.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0011\u0010\f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005\u0088\u0001\u0002¨\u0006\u0019"}, d2 = {"Lexpo/modules/contacts/next/domain/wrappers/ContactDate;", "", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "year", "getYear-impl", "month", "getMonth-impl", MetricsUnit.Duration.DAY, "getDay-impl", "equals", "", "other", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", InAppPurchaseConstants.METHOD_TO_STRING, "toString-impl", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class ContactDate {
    private final String value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContactDate m11721boximpl(String str) {
        return new ContactDate(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11723equalsimpl(String str, Object obj) {
        return (obj instanceof ContactDate) && Intrinsics.areEqual(str, ((ContactDate) obj).m11730unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11724equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11728hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11729toStringimpl(String str) {
        return "ContactDate(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m11723equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11728hashCodeimpl(this.value);
    }

    public String toString() {
        return m11729toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m11730unboximpl() {
        return this.value;
    }

    private /* synthetic */ ContactDate(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11722constructorimpl(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (new Regex("(--\\d{2}-\\d{2})|(\\d{4}-\\d{2}-\\d{2})").matches(value)) {
            return value;
        }
        throw new IllegalArgumentException(("Invalid date format. Expected '--MM-DD' or 'YYYY-MM-DD', but was '" + value + "'").toString());
    }

    /* renamed from: getYear-impl, reason: not valid java name */
    public static final String m11727getYearimpl(String str) {
        if (StringsKt.startsWith$default(str, "--", false, 2, (Object) null)) {
            return null;
        }
        String substring = str.substring(0, 4);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    /* renamed from: getMonth-impl, reason: not valid java name */
    public static final String m11726getMonthimpl(String str) {
        if (StringsKt.startsWith$default(str, "--", false, 2, (Object) null)) {
            String substring = str.substring(2, 4);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        String substring2 = str.substring(5, 7);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }

    /* renamed from: getDay-impl, reason: not valid java name */
    public static final String m11725getDayimpl(String str) {
        if (StringsKt.startsWith$default(str, "--", false, 2, (Object) null)) {
            String substring = str.substring(5, 7);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
        String substring2 = str.substring(8, 10);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }
}
