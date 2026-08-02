package b6;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzd;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3062a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f3063b;

    public /* synthetic */ k(m mVar, int i5) {
        this.f3062a = i5;
        this.f3063b = mVar;
    }

    private final void a() {
        m mVar = this.f3063b;
        synchronized (mVar) {
            if (mVar.f3065a == 1) {
                mVar.a("Timed out while binding");
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3062a) {
            case 0:
                break;
            case 1:
                a();
                return;
            default:
                this.f3063b.a("Service disconnected");
                return;
        }
        while (true) {
            m mVar = this.f3063b;
            synchronized (mVar) {
                try {
                    if (mVar.f3065a != 2) {
                        return;
                    }
                    if (mVar.f3068d.isEmpty()) {
                        mVar.c();
                        return;
                    }
                    n nVar = (n) mVar.f3068d.poll();
                    mVar.f3069e.put(nVar.f3071a, nVar);
                    ((ScheduledExecutorService) mVar.f3070f.f3080c).schedule(new g8.a(2, mVar, nVar), 30L, TimeUnit.SECONDS);
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        Log.d("MessengerIpcClient", "Sending ".concat(String.valueOf(nVar)));
                    }
                    p pVar = mVar.f3070f;
                    Messenger messenger = mVar.f3066b;
                    int i5 = nVar.f3073c;
                    Context context = (Context) pVar.f3079b;
                    Message obtain = Message.obtain();
                    obtain.what = i5;
                    obtain.arg1 = nVar.f3071a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", nVar.a());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", nVar.f3074d);
                    obtain.setData(bundle);
                    try {
                        l1.a aVar = mVar.f3067c;
                        Messenger messenger2 = (Messenger) aVar.f19314b;
                        if (messenger2 != null) {
                            messenger2.send(obtain);
                        } else {
                            zzd zzdVar = (zzd) aVar.f19315c;
                            if (zzdVar == null) {
                                throw new IllegalStateException("Both messengers are null");
                            }
                            Messenger messenger3 = zzdVar.f4438a;
                            messenger3.getClass();
                            messenger3.send(obtain);
                        }
                    } catch (RemoteException e7) {
                        mVar.a(e7.getMessage());
                    }
                } finally {
                }
            }
        }
    }
}
