package org.joda.time;

/* loaded from: classes6.dex */
final class UTCDateTimeZone extends DateTimeZone {

    /* renamed from: e, reason: collision with root package name */
    static final DateTimeZone f79049e = new UTCDateTimeZone();
    private static final long serialVersionUID = -3513011772763289092L;

    public UTCDateTimeZone() {
        super("UTC");
    }

    @Override // org.joda.time.DateTimeZone
    public final long A(long j11) {
        return j11;
    }

    @Override // org.joda.time.DateTimeZone
    public final long B(long j11) {
        return j11;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean equals(Object obj) {
        return obj instanceof UTCDateTimeZone;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return h().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public final String l(long j11) {
        return "UTC";
    }

    @Override // org.joda.time.DateTimeZone
    public final int n(long j11) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public final int p(long j11) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public final int v(long j11) {
        return 0;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean y() {
        return true;
    }
}
