package com.vk.push.common;

import android.util.Log;
import com.vk.push.common.Logger;
import xsna.zcl;

/* compiled from: DefaultLogger.kt */
/* loaded from: classes.dex */
public final class DefaultLogger implements Logger {
    public final String a;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.vk.push.common.Logger
    public Logger createLogger(Object obj) {
        return Logger.DefaultImpls.createLogger(this, obj);
    }

    @Override // com.vk.push.common.Logger
    public void error(String str, Throwable th) {
        Log.e(this.a, str, th);
    }

    public DefaultLogger(String str) {
        this.a = str;
    }

    @Override // com.vk.push.common.Logger
    public Logger createLogger(String str) {
        String str2 = this.a;
        if (str2 != null) {
            str = str2 + ':' + str;
        }
        return new DefaultLogger(str);
    }

    public /* synthetic */ DefaultLogger(String str, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : str);
    }

    @Override // com.vk.push.common.Logger
    public void debug(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public void info(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public void verbose(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public void warn(String str, Throwable th) {
    }
}
