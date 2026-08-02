package org.joda.time.tz;

import org.joda.time.DateTimeZone;

/* loaded from: classes10.dex */
public final class FixedDateTimeZone extends DateTimeZone {
    private static final long serialVersionUID = -3513011772763289092L;
    private final String iNameKey;
    private final int iStandardOffset;
    private final int iWallOffset;

    public FixedDateTimeZone(String str, String str2, int i11, int i12) {
        super(str);
        this.iNameKey = str2;
        this.iWallOffset = i11;
        this.iStandardOffset = i12;
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof FixedDateTimeZone) {
            FixedDateTimeZone fixedDateTimeZone = (FixedDateTimeZone) obj;
            if (h().equals(fixedDateTimeZone.h()) && this.iStandardOffset == fixedDateTimeZone.iStandardOffset && this.iWallOffset == fixedDateTimeZone.iWallOffset) {
                return true;
            }
        }
        return false;
    }

    @Override // org.joda.time.DateTimeZone
    public final int hashCode() {
        return (this.iWallOffset * 31) + (this.iStandardOffset * 37) + h().hashCode();
    }

    @Override // org.joda.time.DateTimeZone
    public final String l(long j11) {
        return this.iNameKey;
    }

    @Override // org.joda.time.DateTimeZone
    public final int n(long j11) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final int p(long j11) {
        return this.iWallOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final int v(long j11) {
        return this.iStandardOffset;
    }

    @Override // org.joda.time.DateTimeZone
    public final boolean y() {
        return true;
    }
}
