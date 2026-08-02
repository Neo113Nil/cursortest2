package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0087d extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f13548a = new AtomicBoolean(true);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0112e f13549b;

    public C0087d(C0112e c0112e) {
        this.f13549b = c0112e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f13548a.get()) {
            this.f13549b.f13630e.set(false);
            C0112e c0112e = this.f13549b;
            c0112e.f13628c.postAtFrontOfQueue(c0112e.f13631f);
            int i5 = this.f13549b.f13627b.get();
            while (i5 > 0) {
                try {
                    Thread.sleep(C0112e.f13624g);
                    if (this.f13549b.f13630e.get()) {
                        break;
                    } else {
                        i5--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i5 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f13549b.f13626a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0061c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f13549b.f13630e.get()) {
                Thread.sleep(C0112e.f13624g);
            }
        }
    }
}
