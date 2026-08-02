package com.ironsource.mediationsdk.logger;

import com.ironsource.C4334gb;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.iq;

/* loaded from: classes13.dex */
public class IronSourceLoggerManager extends IronSourceLogger {
    private static volatile IronSourceLoggerManager d;
    private final List<IronSourceLogger> c;

    private IronSourceLoggerManager(String str) {
        super(str);
        this.c = new CopyOnWriteArrayList();
        c();
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

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4334gb c4334gb) {
        if (a(c4334gb.a())) {
            return;
        }
        a(ironSourceTag, c4334gb.c(), c4334gb.a());
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
        if (th == null) {
            Iterator<IronSourceLogger> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            Iterator<IronSourceLogger> it2 = this.c.iterator();
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
            log(IronSourceLogger.IronSourceTag.NATIVE, iq.a(i, "Failed to find logger:setLoggerDebugLevel(loggerName:", str, " ,debugLevel:", ")"), 0);
        } else if (i < 0 || i > 3) {
            this.c.remove(a);
        } else {
            log(IronSourceLogger.IronSourceTag.NATIVE, iq.a(i, "setLoggerDebugLevel(loggerName:", str, " ,debugLevel:", ")"), 0);
            a.setDebugLevel(i);
        }
    }

    public void a(IronSourceLogger.IronSourceTag ironSourceTag, C4334gb c4334gb, Throwable th) {
        if (a(c4334gb.a())) {
            return;
        }
        logException(ironSourceTag, c4334gb.c(), th);
    }

    private IronSourceLoggerManager(String str, int i) {
        super(str, i);
        this.c = new CopyOnWriteArrayList();
        c();
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

    public static IronSourceLoggerManager getLogger(int i) {
        IronSourceLoggerManager logger = getLogger();
        logger.a = i;
        return logger;
    }

    private IronSourceLogger a(String str) {
        for (IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
