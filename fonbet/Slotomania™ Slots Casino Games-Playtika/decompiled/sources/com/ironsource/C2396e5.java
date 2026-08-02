package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2396e5 implements InterfaceC2756y7 {
    private static final int e = 5;
    private static C2396e5 f;
    private HandlerC2378d5 a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private C2396e5(String str, Q7 q7, JSONObject jSONObject) {
        this.d = str;
        this.a = new HandlerC2378d5(q7.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C2396e5 a(String str, Q7 q7, JSONObject jSONObject) {
        C2396e5 c2396e5;
        synchronized (C2396e5.class) {
            if (f == null) {
                f = new C2396e5(str, q7, jSONObject);
            }
            c2396e5 = f;
        }
        return c2396e5;
    }

    private Thread b(C2757y8 c2757y8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C2342b5(c2757y8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), optBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        HandlerC2378d5 handlerC2378d5 = this.a;
        if (handlerC2378d5 != null) {
            handlerC2378d5.a();
            this.a = null;
        }
    }

    @Override // com.ironsource.InterfaceC2756y7
    public void a(Nc nc) {
        this.a.a(nc);
    }

    private Thread a(C2342b5 c2342b5, Handler handler) {
        return new Thread(new RunnableC2782zf(c2342b5, handler));
    }

    @Override // com.ironsource.InterfaceC2756y7
    public void a(C2757y8 c2757y8, String str, int i, int i2, Handler handler) {
        b(c2757y8, str, i, i2, handler).start();
    }

    @Override // com.ironsource.InterfaceC2756y7
    public void a(C2757y8 c2757y8, String str, int i, int i2) {
        b(c2757y8, str, i, i2, this.a).start();
    }

    @Override // com.ironsource.InterfaceC2756y7
    public void a(C2757y8 c2757y8, String str) {
        int optInt = this.b.optInt("connectionTimeout", 5);
        int optInt2 = this.b.optInt("readTimeout", 5);
        boolean optBoolean = this.b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread a = a(new C2342b5(c2757y8, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.a);
        this.c = a;
        a.start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, Z3.D);
    }

    public String a() {
        return this.d;
    }
}
