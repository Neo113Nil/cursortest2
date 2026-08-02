package org.joda.time.field;

import Bl0.k0;
import org.joda.time.chrono.BuddhistChronology;

/* loaded from: classes10.dex */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;

    /* renamed from: a, reason: collision with root package name */
    private transient int f79214a;
    private final org.joda.time.a iChronology;
    private final int iSkip;

    public SkipUndoDateTimeField(BuddhistChronology buddhistChronology, org.joda.time.b bVar) {
        super(bVar, null, null);
        this.iChronology = buddhistChronology;
        int y11 = super.y();
        if (y11 < 0) {
            this.f79214a = y11 + 1;
        } else if (y11 == 1) {
            this.f79214a = 0;
        } else {
            this.f79214a = y11;
        }
        this.iSkip = 0;
    }

    private Object readResolve() {
        return C().O(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.b
    public final long M(int i11, long j11) {
        k0.w(this, i11, this.f79214a, u());
        if (i11 <= this.iSkip) {
            i11--;
        }
        return super.M(i11, j11);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.b
    public final int d(long j11) {
        int d11 = super.d(j11);
        return d11 < this.iSkip ? d11 + 1 : d11;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.b
    public final int y() {
        return this.f79214a;
    }
}
