package com.ironsource;

import android.os.Handler;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4292e5 implements InterfaceC4670z7 {
    private static final int e = 5;
    private static C4292e5 f;
    private HandlerC4274d5 a;
    private final JSONObject b;
    private Thread c;
    private final String d;

    private C4292e5(String str, R7 r7, JSONObject jSONObject) {
        this.d = str;
        this.a = new HandlerC4274d5(r7.a());
        this.b = jSONObject;
        IronSourceStorageUtils.deleteFolder(b());
        IronSourceStorageUtils.makeDir(b());
    }

    public static synchronized C4292e5 a(String str, R7 r7, JSONObject jSONObject) {
        C4292e5 c4292e5;
        synchronized (C4292e5.class) {
            try {
                if (f == null) {
                    f = new C4292e5(str, r7, jSONObject);
                }
                c4292e5 = f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4292e5;
    }

    private Thread b(C4671z8 c4671z8, String str, int i, int i2, Handler handler) {
        if (i <= 0) {
            i = this.b.optInt("connectionTimeout", 5);
        }
        if (i2 <= 0) {
            i2 = this.b.optInt("readTimeout", 5);
        }
        boolean optBoolean = this.b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return a(new C4238b5(c4671z8, str, (int) timeUnit.toMillis(i), (int) timeUnit.toMillis(i2), optBoolean, b()), handler);
    }

    public boolean c() {
        Thread thread = this.c;
        return thread != null && thread.isAlive();
    }

    public synchronized void d() {
        f = null;
        HandlerC4274d5 handlerC4274d5 = this.a;
        if (handlerC4274d5 != null) {
            handlerC4274d5.a();
            this.a = null;
        }
    }

    @Override // com.ironsource.InterfaceC4670z7
    public void a(Oc oc) {
        this.a.a(oc);
    }

    private Thread a(C4238b5 c4238b5, Handler handler) {
        return new Thread(new RunnableC4678zf(c4238b5, handler));
    }

    @Override // com.ironsource.InterfaceC4670z7
    public void a(C4671z8 c4671z8, String str, int i, int i2, Handler handler) {
        b(c4671z8, str, i, i2, handler).start();
    }

    private String b() {
        return IronSourceStorageUtils.buildAbsolutePathToDirInCache(this.d, Z3.D);
    }

    @Override // com.ironsource.InterfaceC4670z7
    public void a(C4671z8 c4671z8, String str, int i, int i2) {
        b(c4671z8, str, i, i2, this.a).start();
    }

    @Override // com.ironsource.InterfaceC4670z7
    public void a(C4671z8 c4671z8, String str) {
        int optInt = this.b.optInt("connectionTimeout", 5);
        int optInt2 = this.b.optInt("readTimeout", 5);
        boolean optBoolean = this.b.optBoolean(Z3.H, false);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Thread a = a(new C4238b5(c4671z8, str, (int) timeUnit.toMillis(optInt), (int) timeUnit.toMillis(optInt2), optBoolean, b()), this.a);
        this.c = a;
        a.start();
    }

    public String a() {
        return this.d;
    }
}
