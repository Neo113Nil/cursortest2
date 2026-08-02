package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.chrono.JulianChronology;

/* loaded from: classes10.dex */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;

    /* renamed from: a, reason: collision with root package name */
    private transient int f79213a;
    private final org.joda.time.a iChronology;
    private final int iSkip;

    public SkipDateTimeField(JulianChronology julianChronology, org.joda.time.b bVar) {
        super(bVar, null, null);
        this.iChronology = julianChronology;
        int y11 = super.y();
        if (y11 < 0) {
            this.f79213a = y11 - 1;
        } else if (y11 == 0) {
            this.f79213a = 1;
        } else {
            this.f79213a = y11;
        }
        this.iSkip = 0;
    }

    private Object readResolve() {
        return C().O(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, this.f79213a, u());
        int i12 = this.iSkip;
        if (i11 <= i12) {
            if (i11 == i12) {
                throw new IllegalFieldValueException(DateTimeFieldType.e0(), Integer.valueOf(i11), (Integer) null, (Integer) null);
            }
            i11++;
        }
        return super.M(i11, j11);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.b
    public final int d(long j11) {
        int d11 = super.d(j11);
        return d11 <= this.iSkip ? d11 - 1 : d11;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.b
    public final int y() {
        return this.f79213a;
    }
}
