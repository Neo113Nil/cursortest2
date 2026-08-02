package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.c5, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4015c5 implements InterfaceC4357v7 {
    private static final int e = 5;
    private static C4015c5 f;
    private HandlerC3997b5 a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private C4015c5(String str, O7 o7, JSONObject jSONObject) {
        this.d = str;
        this.a = new HandlerC3997b5(o7.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    private Thread b(C4376w8 c4376w8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.b.optBoolean(W3.H, false);
        long j = i;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new Z4(c4376w8, str, (int) timeUnit.toMillis(j), (int) timeUnit.toMillis(i2), optBoolean, b()), handler);
    }

    @Override // com.ironsource.InterfaceC4357v7
    public void a(C4376w8 c4376w8, String str) {
        int optInt = this.b.optInt("connectionTimeout", 5);
        int optInt2 = this.b.optInt("readTimeout", 5);
        boolean optBoolean = this.b.optBoolean(W3.H, false);
        long j = optInt;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread a = a(new Z4(c4376w8, str, (int) timeUnit.toMillis(j), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.a);
        this.c = a;
        a.start();
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        HandlerC3997b5 handlerC3997b5 = this.a;
        if (handlerC3997b5 != null) {
            handlerC3997b5.a();
            this.a = null;
        }
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, W3.D);
    }

    @Override // com.ironsource.InterfaceC4357v7
    public void a(Nc nc) {
        this.a.a(nc);
    }

    private Thread a(Z4 z4, Handler handler) {
        return new Thread(new RunnableC4401xf(z4, handler));
    }

    @Override // com.ironsource.InterfaceC4357v7
    public void a(C4376w8 c4376w8, String str, int i, int i2, Handler handler) {
        b(c4376w8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.InterfaceC4357v7
    public void a(C4376w8 c4376w8, String str, int i, int i2) {
        b(c4376w8, str, i, i2, this.a).start();
    }

    public static synchronized C4015c5 a(String str, O7 o7, JSONObject jSONObject) {
        C4015c5 c4015c5;
        synchronized (C4015c5.class) {
            c4015c5 = f;
            if (c4015c5 == null) {
                c4015c5 = new C4015c5(str, o7, jSONObject);
                f = c4015c5;
            }
        }
        return c4015c5;
    }

    public String a() {
        return this.d;
    }
}
