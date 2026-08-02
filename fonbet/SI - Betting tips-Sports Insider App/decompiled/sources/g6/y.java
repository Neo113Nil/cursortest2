package g6;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class y extends com.google.android.gms.internal.measurement.h0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f9877a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(e eVar, Looper looper) {
        super(looper, 3);
        this.f9877a = eVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        q qVar;
        e eVar = this.f9877a;
        if (eVar.f9825x.get() != message.arg1) {
            int i5 = message.what;
            if ((i5 == 2 || i5 == 1 || i5 == 7) && (qVar = (q) message.obj) != null) {
                qVar.c();
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || i10 == 4 || i10 == 5) && !eVar.r()) {
            q qVar2 = (q) message.obj;
            if (qVar2 != null) {
                qVar2.c();
                return;
            }
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            eVar.f9822u = new ConnectionResult(message.arg2, null, null);
            if (!eVar.f9823v && !TextUtils.isEmpty(eVar.n()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(eVar.n());
                    if (!eVar.f9823v) {
                        eVar.x(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = eVar.f9822u;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            eVar.j.g(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 5) {
            ConnectionResult connectionResult2 = eVar.f9822u;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            eVar.j.g(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            eVar.j.g(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i11 == 6) {
            eVar.x(5, null);
            b bVar = eVar.f9817o;
            if (bVar != null) {
                bVar.a(message.arg2);
            }
            eVar.s();
            eVar.v(5, 1, null);
            return;
        }
        if (i11 == 2 && !eVar.q()) {
            q qVar3 = (q) message.obj;
            if (qVar3 != null) {
                qVar3.c();
                return;
            }
            return;
        }
        int i12 = message.what;
        if (i12 != 2 && i12 != 1 && i12 != 7) {
            w0.o("GmsClient", r4.k.o(new StringBuilder(String.valueOf(i12).length() + 34), "Don't know how to handle message: ", i12), new Exception());
            return;
        }
        q qVar4 = (q) message.obj;
        synchronized (qVar4) {
            try {
                bool = qVar4.f9864a;
                if (qVar4.f9865b) {
                    String obj2 = qVar4.toString();
                    StringBuilder sb2 = new StringBuilder(obj2.length() + 47);
                    sb2.append("Callback proxy ");
                    sb2.append(obj2);
                    sb2.append(" being reused. This is not safe.");
                    w0.m("GmsClient", sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bool != null) {
            e eVar2 = qVar4.f9869f;
            int i13 = qVar4.f9867d;
            if (i13 != 0) {
                eVar2.x(1, null);
                Bundle bundle = qVar4.f9868e;
                qVar4.b(new ConnectionResult(i13, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!qVar4.a()) {
                eVar2.x(1, null);
                qVar4.b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (qVar4) {
            qVar4.f9865b = true;
        }
        qVar4.c();
    }
}
