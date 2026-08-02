package androidx.compose.ui.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.sentry.SentryEnvelopeItemHeader;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: TextRange.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u0000 '2\u00020\u0001:\u0001'B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u001d\u0010\u001bJ\u0018\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006("}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "packedValue", "", "constructor-impl", "(J)J", "start", "", "getStart-impl", "(J)I", "end", "getEnd-impl", "min", "getMin-impl", "max", "getMax-impl", "collapsed", "", "getCollapsed-impl", "(J)Z", "reversed", "getReversed-impl", SentryEnvelopeItemHeader.JsonKeys.LENGTH, "getLength-impl", "intersects", "other", "intersects-5zc-tL8", "(JJ)Z", "contains", "contains-5zc-tL8", TypedValues.CycleType.S_WAVE_OFFSET, "contains-impl", "(JI)Z", InAppPurchaseConstants.METHOD_TO_STRING, "", "toString-impl", "(J)Ljava/lang/String;", "equals", "hashCode", "Companion", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
@JvmInline
/* loaded from: classes4.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long Zero = TextRangeKt.TextRange(0);
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextRange m8220boximpl(long j) {
        return new TextRange(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8221constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8224equalsimpl(long j, Object obj) {
        return (obj instanceof TextRange) && j == ((TextRange) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8225equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m8227getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m8232getStartimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8233hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object other) {
        return m8224equalsimpl(this.packedValue, other);
    }

    public int hashCode() {
        return m8233hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ TextRange(long j) {
        this.packedValue = j;
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m8230getMinimpl(long j) {
        return Math.min(m8232getStartimpl(j), m8227getEndimpl(j));
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m8229getMaximpl(long j) {
        return Math.max(m8232getStartimpl(j), m8227getEndimpl(j));
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m8226getCollapsedimpl(long j) {
        return m8232getStartimpl(j) == m8227getEndimpl(j);
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m8231getReversedimpl(long j) {
        return m8232getStartimpl(j) > m8227getEndimpl(j);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m8228getLengthimpl(long j) {
        return m8229getMaximpl(j) - m8230getMinimpl(j);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m8234intersects5zctL8(long j, long j2) {
        return (m8230getMinimpl(j) < m8229getMaximpl(j2)) & (m8230getMinimpl(j2) < m8229getMaximpl(j));
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m8222contains5zctL8(long j, long j2) {
        return (m8230getMinimpl(j) <= m8230getMinimpl(j2)) & (m8229getMaximpl(j2) <= m8229getMaximpl(j));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m8223containsimpl(long j, int i) {
        return i < m8229getMaximpl(j) && m8230getMinimpl(j) <= i;
    }

    public String toString() {
        return m8235toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8235toStringimpl(long j) {
        return "TextRange(" + m8232getStartimpl(j) + ", " + m8227getEndimpl(j) + ')';
    }

    /* compiled from: TextRange.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0013\u0010\u0004\u001a\u00020\u0005¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "<init>", "()V", "Zero", "Landroidx/compose/ui/text/TextRange;", "getZero-d9O1mEE", "()J", "J", "ui-text"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m8237getZerod9O1mEE() {
            return TextRange.Zero;
        }
    }
}
