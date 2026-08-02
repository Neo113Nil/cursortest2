package com.applovin.impl.sdk;

import android.os.Process;
import android.text.TextUtils;
import com.applovin.impl.f2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.z4;
import java.lang.Thread;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {
    private static final AppLovinExceptionHandler e = new AppLovinExceptionHandler();
    private final Set a = new HashSet(2);
    private final AtomicBoolean b = new AtomicBoolean();
    private final AtomicBoolean c = new AtomicBoolean();
    private Thread.UncaughtExceptionHandler d;

    private String a(Throwable th, int i) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        return TextUtils.join("\n", (StackTraceElement[]) Arrays.copyOf(stackTrace, Math.min(i, stackTrace.length)));
    }

    public static AppLovinExceptionHandler shared() {
        return e;
    }

    public void addSdk(l lVar) {
        if (this.a.contains(lVar)) {
            return;
        }
        this.a.add(lVar);
    }

    public void enable() {
        if (this.b.compareAndSet(false, true)) {
            this.d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (this.c.getAndSet(true)) {
            Process.killProcess(Process.myPid());
            System.exit(1);
            return;
        }
        long j = 500;
        for (l lVar : this.a) {
            lVar.Q();
            if (p.a()) {
                lVar.Q().a("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", th.toString());
            Integer num = (Integer) lVar.a(z4.M6);
            if (num.intValue() > 0) {
                hashMap.put("details", a(th, num.intValue()));
            }
            lVar.E().d(f2.Y0, hashMap);
            lVar.G().trackEventSynchronously("paused");
            j = ((Long) lVar.a(z4.s3)).longValue();
        }
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            Process.killProcess(Process.myPid());
            System.exit(1);
        }
    }
}
