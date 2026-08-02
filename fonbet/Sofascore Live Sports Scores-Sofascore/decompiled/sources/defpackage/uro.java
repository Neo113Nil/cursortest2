package defpackage;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.cloudmessaging.zzv;
import java.util.ArrayDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class uro implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1p b;

    public /* synthetic */ uro(b1p b1pVar, int i) {
        this.a = i;
        this.b = b1pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b1p b1pVar = this.b;
                synchronized (b1pVar) {
                    if (b1pVar.a == 1) {
                        b1pVar.d("Timed out while binding");
                    }
                }
                return;
            case 1:
                break;
            default:
                this.b.d("Service disconnected");
                return;
        }
        while (true) {
            b1p b1pVar2 = this.b;
            synchronized (b1pVar2) {
                try {
                    if (b1pVar2.a != 2) {
                        return;
                    }
                    ArrayDeque arrayDeque = b1pVar2.d;
                    if (arrayDeque.isEmpty()) {
                        b1pVar2.l();
                        return;
                    }
                    s3p s3pVar = (s3p) arrayDeque.poll();
                    SparseArray sparseArray = b1pVar2.e;
                    int i = s3pVar.a;
                    sparseArray.put(i, s3pVar);
                    b1pVar2.f.b.schedule(new yuo(4, b1pVar2, s3pVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        "Sending ".concat(String.valueOf(s3pVar));
                    }
                    zzv zzvVar = b1pVar2.f;
                    Messenger messenger = b1pVar2.b;
                    int i2 = s3pVar.c;
                    Message obtain = Message.obtain();
                    obtain.what = i2;
                    obtain.arg1 = i;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", s3pVar.a());
                    bundle.putString("pkg", zzvVar.a.getPackageName());
                    bundle.putBundle("data", s3pVar.d);
                    obtain.setData(bundle);
                    try {
                        gvo gvoVar = b1pVar2.c;
                        Messenger messenger2 = (Messenger) gvoVar.b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            zzd zzdVar = (zzd) gvoVar.c;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            zzdVar.a.send(obtain);
                        }
                    } catch (RemoteException e) {
                        b1pVar2.d(e.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
