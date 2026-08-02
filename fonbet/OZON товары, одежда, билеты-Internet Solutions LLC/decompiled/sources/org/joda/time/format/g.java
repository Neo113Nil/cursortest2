package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes6.dex */
final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final f f79288a;

    private g(f fVar) {
        this.f79288a = fVar;
    }

    static g a(f fVar) {
        if (fVar == null) {
            return null;
        }
        return new g(fVar);
    }

    @Override // org.joda.time.format.l
    public final void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException {
        f fVar = this.f79288a;
        StringBuffer stringBuffer = new StringBuffer(fVar.estimatePrintedLength());
        fVar.printTo(stringBuffer, eVar, locale);
        sb2.append((CharSequence) stringBuffer);
    }

    @Override // org.joda.time.format.l
    public final void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException {
        if (appendable instanceof StringBuffer) {
            this.f79288a.printTo((StringBuffer) appendable, j11, aVar, i11, dateTimeZone, locale);
        } else if (appendable instanceof Writer) {
            this.f79288a.printTo((Writer) appendable, j11, aVar, i11, dateTimeZone, locale);
        } else {
            StringBuffer stringBuffer = new StringBuffer(this.f79288a.estimatePrintedLength());
            this.f79288a.printTo(stringBuffer, j11, aVar, i11, dateTimeZone, locale);
            appendable.append(stringBuffer);
        }
    }

    @Override // org.joda.time.format.l
    public final int estimatePrintedLength() {
        return this.f79288a.estimatePrintedLength();
    }
}
