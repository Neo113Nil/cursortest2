package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* loaded from: classes6.dex */
public interface f {
    int estimatePrintedLength();

    void printTo(Writer writer, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale) throws IOException;

    void printTo(Writer writer, org.joda.time.j jVar, Locale locale) throws IOException;

    void printTo(StringBuffer stringBuffer, long j11, org.joda.time.a aVar, int i11, DateTimeZone dateTimeZone, Locale locale);

    void printTo(StringBuffer stringBuffer, org.joda.time.j jVar, Locale locale);
}
