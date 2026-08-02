package ru.ozon.app.android.pikazon.placeholdertracker;

import Sh.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import ed.InterfaceC6346b;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pikazon/placeholdertracker/PlaceholderTime;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getValue", "()J", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlaceholderTime {
    private final long value;

    private /* synthetic */ PlaceholderTime(long j11) {
        this.value = j11;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderTime m901boximpl(long j11) {
        return new PlaceholderTime(j11);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m902constructorimpl(long j11) {
        return j11;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m903equalsimpl(long j11, Object obj) {
        return (obj instanceof PlaceholderTime) && j11 == ((PlaceholderTime) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m904equalsimpl0(long j11, long j12) {
        return j11 == j12;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m905hashCodeimpl(long j11) {
        return Long.hashCode(j11);
    }

    @NotNull
    /* renamed from: toString-impl, reason: not valid java name */
    public static String m906toStringimpl(long j11) {
        return b.b(j11, "PlaceholderTime(value=", ")");
    }

    public boolean equals(Object obj) {
        return m903equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m905hashCodeimpl(this.value);
    }

    @NotNull
    public String toString() {
        return m906toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }
}
