package com.fyber.inneractive.sdk.logger;

import android.content.Context;
import android.util.Log;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes12.dex */
public final class a extends FMPLogger {
    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void debug(String str, Object... objArr) {
        if (IAlog.a <= 3) {
            String.format(str, objArr);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void error(String str, Throwable th, Object... objArr) {
        if (IAlog.a <= 6) {
            if (th == null) {
                Log.e("Inneractive_error", String.format(str, objArr));
            } else {
                Log.e("Inneractive_error", String.format(str, objArr), th);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void info(String str, Object... objArr) {
        if (IAlog.a <= 4) {
            String.format(str, objArr);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void log(int i, Exception exc, String str, Object... objArr) {
        if (IAlog.a <= i) {
            if (exc == null) {
                String.format(str, objArr);
            } else {
                String.format(str, objArr);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(String str, Object... objArr) {
        if (IAlog.a <= 2) {
            String.format(str, objArr);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void warning(String str, Object... objArr) {
        if (IAlog.a <= 4) {
            String.format(str, objArr);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void verbose(String str, Throwable th, Object... objArr) {
        if (IAlog.a <= 2) {
            String.format(str, objArr);
        }
    }

    @Override // com.fyber.inneractive.sdk.logger.FMPLogger
    public final void initialize(Context context) {
    }
}
