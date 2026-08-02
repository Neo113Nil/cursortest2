package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* renamed from: com.ironsource.zf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
class RunnableC4678zf implements Runnable {
    private final Handler a;
    private final C4238b5 b;

    public RunnableC4678zf(C4238b5 c4238b5, Handler handler) {
        this.b = c4238b5;
        this.a = handler;
    }

    public Z5 a(C4238b5 c4238b5, String str, long j) {
        return new Z5(c4238b5, str, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C4671z8 c4671z8 = new C4671z8(this.b.b().getParent(), this.b.b().getName());
        Message a = a();
        a.obj = c4671z8;
        String a2 = a(c4671z8.getParent());
        if (a2 == null) {
            a.what = 1020;
            this.a.sendMessage(a);
        } else {
            C4256c5 call = a(new C4238b5(c4671z8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), a2, 3L).call();
            a.what = call.b() == 200 ? Z3.l : call.b();
            this.a.sendMessage(a);
        }
    }

    public Message a() {
        return new Message();
    }

    public String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
