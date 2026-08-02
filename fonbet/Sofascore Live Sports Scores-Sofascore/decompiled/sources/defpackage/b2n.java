package defpackage;

import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.internal.zaaz;
import com.google.android.gms.common.api.internal.zabd;
import com.google.android.gms.internal.base.zao;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class b2n extends zao {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b2n(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                zaaz zaazVar = (zaaz) this.b;
                int i = message.what;
                if (i != 1) {
                    if (i != 2) {
                        new StringBuilder(String.valueOf(i).length() + 20);
                        return;
                    } else {
                        zaazVar.l();
                        return;
                    }
                }
                ReentrantLock reentrantLock = zaazVar.b;
                reentrantLock.lock();
                try {
                    if (zaazVar.h()) {
                        zaazVar.n();
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                int i2 = message.what;
                if (i2 != 1) {
                    if (i2 == 2) {
                        throw ((RuntimeException) message.obj);
                    }
                    new StringBuilder(String.valueOf(i2).length() + 20);
                    return;
                }
                e2n e2nVar = (e2n) message.obj;
                zabd zabdVar = (zabd) this.b;
                e2nVar.getClass();
                zabdVar.a.lock();
                try {
                    if (zabdVar.k == e2nVar.a) {
                        e2nVar.a();
                    }
                    return;
                } finally {
                    zabdVar.a.unlock();
                }
        }
    }
}
