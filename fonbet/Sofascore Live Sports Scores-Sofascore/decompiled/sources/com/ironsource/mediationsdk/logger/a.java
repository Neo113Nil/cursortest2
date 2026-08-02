package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.U3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import defpackage.bf3;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a extends IronSourceLogger {
    public static final String c = "console";
    public static final String d = "LevelPlaySDK: ";

    private a() {
        super("console");
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void log(IronSourceLogger.IronSourceTag ironSourceTag, String str, int i) {
        StringBuilder sb = new StringBuilder("UIThread: ");
        sb.append(Looper.getMainLooper() == Looper.myLooper());
        sb.append(" ");
        StringBuilder sb2 = new StringBuilder("Activity: ");
        sb2.append(ContextProvider.getInstance().getCurrentActiveActivity() != null ? Integer.valueOf(ContextProvider.getInstance().getCurrentActiveActivity().hashCode()) : Boolean.FALSE);
        sb2.append(" ");
        if (i == 0) {
            Objects.toString(ironSourceTag);
            return;
        }
        if (i != 1) {
            if (i == 2) {
                Objects.toString(ironSourceTag);
                return;
            } else if (i == 3) {
                Objects.toString(ironSourceTag);
                return;
            } else if (i != 4) {
                return;
            }
        }
        Objects.toString(ironSourceTag);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder p = bf3.p(str, ":stacktrace[");
        p.append(Log.getStackTraceString(th));
        p.append(U3.j.e);
        log(ironSourceTag, p.toString(), 3);
    }

    public a(int i) {
        super("console", i);
    }
}
