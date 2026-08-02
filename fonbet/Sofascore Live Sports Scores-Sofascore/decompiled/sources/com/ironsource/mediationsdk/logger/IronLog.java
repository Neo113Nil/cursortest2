package com.ironsource.mediationsdk.logger;

import com.ironsource.C4039db;
import com.ironsource.mediationsdk.logger.IronSourceLogger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);

    IronSourceLogger.IronSourceTag a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.a = ironSourceTag;
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db("", 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db("", 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db(str, 3));
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db(str, 2));
    }

    public void error(String str, Throwable th) {
        IronSourceLoggerManager.getLogger().a(this.a, new C4039db(str, 3), th);
    }
}
