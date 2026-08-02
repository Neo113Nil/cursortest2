package io.sentry;

import java.io.File;

/* loaded from: classes.dex */
public final /* synthetic */ class D1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ILogger f66599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f66600b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC7203t f66601c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f66602d;

    public /* synthetic */ D1(ILogger iLogger, String str, AbstractC7203t abstractC7203t, File file) {
        this.f66599a = iLogger;
        this.f66600b = str;
        this.f66601c = abstractC7203t;
        this.f66602d = file;
    }

    public final void a() {
        I2 i22 = I2.DEBUG;
        String str = this.f66600b;
        ILogger iLogger = this.f66599a;
        iLogger.c(i22, "Started processing cached files from %s", str);
        this.f66601c.b(this.f66602d);
        iLogger.c(i22, "Finished processing cached files from %s", str);
    }
}
