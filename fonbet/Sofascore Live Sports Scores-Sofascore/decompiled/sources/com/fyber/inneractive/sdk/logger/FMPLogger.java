package com.fyber.inneractive.sdk.logger;

import android.content.Context;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class FMPLogger {
    public abstract void debug(String str, Object... objArr);

    public abstract void error(String str, Throwable th, Object... objArr);

    public abstract void info(String str, Object... objArr);

    public abstract void initialize(Context context);

    public abstract void log(int i, Exception exc, String str, Object... objArr);

    public abstract void verbose(String str, Throwable th, Object... objArr);

    public abstract void verbose(String str, Object... objArr);

    public abstract void warning(String str, Object... objArr);
}
