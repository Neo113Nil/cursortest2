package com.google.ads.interactivemedia.v3.impl.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.j2p;
import defpackage.q1p;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@q1p(zza = AutoValue_LoggableException.class)
/* loaded from: classes2.dex */
public abstract class LoggableException {
    @NonNull
    public static LoggableException create(@NonNull Throwable th) {
        String name = th.getClass().getName();
        String message = th.getMessage();
        Object obj = j2p.a;
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return new AutoValue_LoggableException(name, message, stringWriter.toString());
    }

    @Nullable
    public abstract String message();

    @Nullable
    public abstract String name();

    @Nullable
    public abstract String stackTrace();

    public static LoggableException create(String str, String str2, String str3) {
        return new AutoValue_LoggableException(str, str2, str3);
    }
}
