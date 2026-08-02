package com.ironsource;

import com.ironsource.B;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class gh implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ B c;

    public /* synthetic */ gh(Throwable th, B b, int i) {
        this.a = i;
        this.b = th;
        this.c = b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        B b = this.c;
        Throwable th = this.b;
        switch (i) {
            case 0:
                B.b.a(th, b);
                break;
            default:
                B.c.a(th, b);
                break;
        }
    }
}
