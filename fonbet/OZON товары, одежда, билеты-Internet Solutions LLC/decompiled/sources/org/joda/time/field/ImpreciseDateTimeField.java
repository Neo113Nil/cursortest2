package org.joda.time.field;

import Bl0.k0;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;

/* loaded from: classes6.dex */
public abstract class ImpreciseDateTimeField extends a {

    /* renamed from: b, reason: collision with root package name */
    final long f79210b;

    /* renamed from: c, reason: collision with root package name */
    private final org.joda.time.d f79211c;

    private final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        @Override // org.joda.time.d
        public final long a(int i11, long j11) {
            return ImpreciseDateTimeField.this.a(i11, j11);
        }

        @Override // org.joda.time.d
        public final long b(long j11, long j12) {
            return ImpreciseDateTimeField.this.b(j11, j12);
        }

        @Override // org.joda.time.field.BaseDurationField, org.joda.time.d
        public final int d(long j11, long j12) {
            return ImpreciseDateTimeField.this.l(j11, j12);
        }

        @Override // org.joda.time.d
        public final long e(long j11, long j12) {
            return ImpreciseDateTimeField.this.m(j11, j12);
        }

        @Override // org.joda.time.d
        public final long g() {
            return ImpreciseDateTimeField.this.f79210b;
        }

        @Override // org.joda.time.d
        public final boolean h() {
            return false;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j11) {
        super(dateTimeFieldType);
        this.f79210b = j11;
        this.f79211c = new LinkedDurationField(dateTimeFieldType.N());
    }

    @Override // org.joda.time.field.a, org.joda.time.b
    public final int l(long j11, long j12) {
        return k0.v(m(j11, j12));
    }

    @Override // org.joda.time.b
    public final org.joda.time.d n() {
        return this.f79211c;
    }
}
