package org.joda.time;

import B0.A0;

/* loaded from: classes6.dex */
public class IllegalInstantException extends IllegalArgumentException {
    private static final long serialVersionUID = 2858712538216L;

    public IllegalInstantException(long j11, String str) {
        super(A0.b("Illegal instant due to time zone offset transition (daylight savings time 'gap'): ", org.joda.time.format.a.b("yyyy-MM-dd'T'HH:mm:ss.SSS").g(new Instant(j11)), str != null ? A0.b(" (", str, ")") : ""));
    }
}
