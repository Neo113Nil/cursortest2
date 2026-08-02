package com.ironsource.mediationsdk.logger;

import android.os.Looper;
import android.util.Log;
import com.ironsource.X3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import java.util.Objects;
import xsna.ho8;

/* loaded from: classes13.dex */
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
                Log.e(d + ironSourceTag, str);
                return;
            } else if (i != 4) {
                return;
            }
        }
        Objects.toString(ironSourceTag);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(IronSourceLogger.IronSourceTag ironSourceTag, String str, Throwable th) {
        StringBuilder b = ho8.b(str, ":stacktrace[");
        b.append(Log.getStackTraceString(th));
        b.append(X3.j.e);
        log(ironSourceTag, b.toString(), 3);
    }

    public a(int i) {
        super("console", i);
    }
}
