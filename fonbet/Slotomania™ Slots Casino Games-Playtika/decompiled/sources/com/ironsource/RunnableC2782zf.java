package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class RunnableC2782zf implements Runnable {
    private final Handler a;
    private final C2342b5 b;

    RunnableC2782zf(C2342b5 c2342b5, Handler handler) {
        this.b = c2342b5;
        this.a = handler;
    }

    X5 a(C2342b5 c2342b5, String str, long j) {
        return new X5(c2342b5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C2757y8 c2757y8 = new C2757y8(this.b.b().getParent(), this.b.b().getName());
        Message a = a();
        a.obj = c2757y8;
        String a2 = a(c2757y8.getParent());
        if (a2 == null) {
            a.what = 1020;
            this.a.sendMessage(a);
        } else {
            C2360c5 call = a(new C2342b5(c2757y8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), a2, 3L).call();
            a.what = call.b() == 200 ? 1016 : call.b();
            this.a.sendMessage(a);
        }
    }

    Message a() {
        return new Message();
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
