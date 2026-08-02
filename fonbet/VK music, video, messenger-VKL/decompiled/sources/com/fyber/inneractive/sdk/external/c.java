package com.fyber.inneractive.sdk.external;

import android.content.SharedPreferences;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import xsna.d4k;
import xsna.y370;

/* loaded from: classes12.dex */
public final class c implements Thread.UncaughtExceptionHandler {
    public SharedPreferences a;
    public final Thread.UncaughtExceptionHandler b;

    public c() {
        AtomicBoolean atomicBoolean = d4k.a;
        this.b = y370.a;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        SharedPreferences sharedPreferences = this.a;
        if (sharedPreferences != null) {
            StringWriter stringWriter = new StringWriter();
            th.printStackTrace(new PrintWriter(stringWriter));
            String stringBuffer = stringWriter.getBuffer().toString();
            if (stringBuffer.contains("com.fyber.inneractive")) {
                sharedPreferences.edit().putString("FyberExceptionKey", stringBuffer).putString("FyberVersionKey", InneractiveAdManager.getVersion()).putString("FyberNameKey", th.getClass().getName()).putString("FyberDescriptionKey", th.getLocalizedMessage()).commit();
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            try {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            } catch (Throwable unused) {
            }
        }
    }
}
