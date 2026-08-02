package com.vk.push.common;

import com.vk.push.common.Logger;

/* compiled from: EmptyLogger.kt */
/* loaded from: classes.dex */
public final class EmptyLogger implements Logger {
    @Override // com.vk.push.common.Logger
    public Logger createLogger(String str) {
        return this;
    }

    @Override // com.vk.push.common.Logger
    public Logger createLogger(Object obj) {
        return Logger.DefaultImpls.createLogger(this, obj);
    }

    @Override // com.vk.push.common.Logger
    public void debug(String str, Throwable th) {
    }

    @Override // com.vk.push.common.Logger
    public void error(String str, Throwable th) {
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
