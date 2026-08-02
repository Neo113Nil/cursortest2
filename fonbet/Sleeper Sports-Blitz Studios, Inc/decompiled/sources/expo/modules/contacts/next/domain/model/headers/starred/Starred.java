package expo.modules.contacts.next.domain.model.headers.starred;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import expo.modules.contacts.next.domain.model.Extractable;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: StarredField.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, d2 = {"Lexpo/modules/contacts/next/domain/model/headers/starred/Starred;", "Lexpo/modules/contacts/next/domain/model/Extractable;", "value", "", "constructor-impl", "(I)I", "getValue", "()I", "equals", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(I)Ljava/lang/String;", "expo-contacts_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
/* loaded from: classes8.dex */
public final class Starred implements Extractable {
    private final int value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Starred m11703boximpl(int i) {
        return new Starred(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11704constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11705equalsimpl(int i, Object obj) {
        return (obj instanceof Starred) && i == ((Starred) obj).m11709unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11706equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11707hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11708toStringimpl(int i) {
        return "Starred(value=" + i + ")";
    }

    public boolean equals(Object obj) {
        return m11705equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m11707hashCodeimpl(this.value);
    }

    public String toString() {
        return m11708toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11709unboximpl() {
        return this.value;
    }

    private /* synthetic */ Starred(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
