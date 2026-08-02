package defpackage;

import com.google.android.gms.common.api.internal.zaar;
import java.io.IOException;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class sk0 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sk0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tk0 tk0Var = (tk0) obj;
                try {
                    if (tk0Var.h == null) {
                        throw new IOException("Unable to perform write due to unavailable sink.");
                    }
                    a();
                    return;
                } catch (Exception e) {
                    tk0Var.d.m(e);
                    return;
                }
            case 1:
                bq3 bq3Var = (bq3) obj;
                bq3 a = bq3Var.a();
                try {
                    b();
                    return;
                } finally {
                    bq3Var.c(a);
                }
            default:
                zaar zaarVar = (zaar) obj;
                Lock lock = zaarVar.b;
                lock.lock();
                try {
                    try {
                        if (!Thread.interrupted()) {
                            c();
                        }
                    } catch (RuntimeException e2) {
                        b2n b2nVar = zaarVar.a.e;
                        b2nVar.sendMessage(b2nVar.obtainMessage(2, e2));
                    }
                    return;
                } finally {
                    lock.unlock();
                }
        }
    }
}
