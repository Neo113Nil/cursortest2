package com.facebook.login;

import android.content.ComponentName;
import defpackage.ba4;
import defpackage.fa4;
import defpackage.ga4;
import defpackage.ja4;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b extends ga4 {
    public static fa4 b;
    public static ja4 c;
    public static final ReentrantLock d = new ReentrantLock();

    @Override // defpackage.ga4
    public final void onCustomTabsServiceConnected(ComponentName componentName, ba4 ba4Var) {
        fa4 fa4Var;
        componentName.getClass();
        ba4Var.d();
        b = (fa4) ba4Var;
        ReentrantLock reentrantLock = d;
        reentrantLock.lock();
        if (c == null && (fa4Var = b) != null) {
            c = fa4Var.c(null);
        }
        reentrantLock.unlock();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        componentName.getClass();
    }
}
