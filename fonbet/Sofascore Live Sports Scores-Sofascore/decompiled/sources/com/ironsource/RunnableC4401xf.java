package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.xf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
class RunnableC4401xf implements Runnable {
    private final Handler a;
    private final Z4 b;

    public RunnableC4401xf(Z4 z4, Handler handler) {
        this.b = z4;
        this.a = handler;
    }

    public W5 a(Z4 z4, String str, long j) {
        return new W5(z4, str, j);
    }

    @Override // java.lang.Runnable
    public void run() {
        C4376w8 c4376w8 = new C4376w8(this.b.b().getParent(), this.b.b().getName());
        Message a = a();
        a.obj = c4376w8;
        String a2 = a(c4376w8.getParent());
        if (a2 == null) {
            a.what = 1020;
            this.a.sendMessage(a);
        } else {
            C3954a5 call = a(new Z4(c4376w8, this.b.e(), this.b.a(), this.b.c(), this.b.f(), this.b.d()), a2, 3L).call();
            a.what = call.b() == 200 ? W3.l : call.b();
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
