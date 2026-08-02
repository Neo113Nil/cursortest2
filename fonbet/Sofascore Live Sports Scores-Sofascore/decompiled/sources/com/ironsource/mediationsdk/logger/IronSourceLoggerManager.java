package com.ironsource.mediationsdk.logger;

import com.ironsource.C4039db;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import defpackage.vxd;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class IronSourceLoggerManager extends IronSourceLogger {
    private static volatile IronSourceLoggerManager d;
    private final List<IronSourceLogger> c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.c = new CopyOnWriteArrayList();
        c();
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }

    private void c() {
        this.c.add(new a(0));
    }

    public static IronSourceLoggerManager getLogger() {
        if (d == null) {
            synchronized (IronSourceLoggerManager.class) {
                try {
                    if (d == null) {
                        d = new IronSourceLoggerManager("IronSourceLoggerManager");
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public void addLogger(IronSourceLogger ironSourceLogger) {
        this.c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @Deprecated(forRemoval = true, since = "8.3.0")
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        if (a(i)) {
            return;
        }
        a(ironSourceTag, str, i);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        List<IronSourceLogger> list = this.c;
        if (th == null) {
            Iterator<IronSourceLogger> it = list.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    public void onLog(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(String str, int i) {
        if (str == null) {
            return;
        }
        IronSourceLogger a = a(str);
        if (a == null) {
            log(IronSourceLogger.IronSourceTag.NATIVE, vxd.k(i, "Failed to find logger:setLoggerDebugLevel(loggerName:", str, " ,debugLevel:", ")"), 0);
        } else if (i < 0 || i > 3) {
            this.c.remove(a);
        } else {
            log(IronSourceLogger.IronSourceTag.NATIVE, vxd.k(i, "setLoggerDebugLevel(loggerName:", str, " ,debugLevel:", ")"), 0);
            a.setDebugLevel(i);
        }
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.c = new CopyOnWriteArrayList();
        c();
    }

    public static IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager logger = getLogger();
        logger.a = i;
        return logger;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4039db c4039db, Throwable th) {
        if (a(c4039db.a())) {
            return;
        }
        logException(ironSourceTag, c4039db.c(), th);
    }

    private boolean a(int i) {
        return i < this.a;
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        for (IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.a() <= i) {
                ironSourceLogger.log(ironSourceTag, str, i);
            }
        }
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4039db c4039db) {
        if (a(c4039db.a())) {
            return;
        }
        a(ironSourceTag, c4039db.c(), c4039db.a());
    }
}
