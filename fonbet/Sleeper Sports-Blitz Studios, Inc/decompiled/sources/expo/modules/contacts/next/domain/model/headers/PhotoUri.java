package expo.modules.contacts.next.domain.model.headers;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.contacts.next.domain.model.Extractable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PhotoUriField.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0005R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/PhotoUri;", "Lexpo/modules/contacts/next/domain/model/Extractable;", "value", "", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "equals", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Ljava/lang/String;)I", InAppPurchaseConstants.METHOD_TO_STRING, "toString-impl", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class PhotoUri implements Extractable {
    private final String value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PhotoUri m11695boximpl(String str) {
        return new PhotoUri(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static String m11696constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11697equalsimpl(String str, Object obj) {
        return (obj instanceof PhotoUri) && Intrinsics.areEqual(str, ((PhotoUri) obj).m11701unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11698equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11699hashCodeimpl(String str) {
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11700toStringimpl(String str) {
        return "PhotoUri(value=" + str + ")";
    }

    public boolean equals(Object obj) {
        return m11697equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11699hashCodeimpl(this.value);
    }

    public String toString() {
        return m11700toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m11701unboximpl() {
        return this.value;
    }

    private /* synthetic */ PhotoUri(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
