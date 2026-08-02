package org.joda.time.format;

import java.io.IOException;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes6.dex */
interface l {
    void d(StringBuilder sb2, org.joda.time.base.e eVar, Locale locale) throws IOException;

    void e(Appendable appendable, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException;

    int estimatePrintedLength();
}
