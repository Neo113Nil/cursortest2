package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class f extends com.google.android.gms.internal.common.zzg {
    public final /* synthetic */ BaseGmsClient a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.a = baseGmsClient;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        zzc zzcVar;
        BaseGmsClient baseGmsClient = this.a;
        int i = baseGmsClient.D.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (zzcVar = (zzc) message.obj) != null) {
                synchronized (zzcVar) {
                    zzcVar.a = null;
                }
                BaseGmsClient baseGmsClient2 = zzcVar.c;
                synchronized (baseGmsClient2.r) {
                    baseGmsClient2.r.remove(zzcVar);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !baseGmsClient.isConnecting()) {
            zzc zzcVar2 = (zzc) message.obj;
            if (zzcVar2 != null) {
                synchronized (zzcVar2) {
                    zzcVar2.a = null;
                }
                BaseGmsClient baseGmsClient3 = zzcVar2.c;
                synchronized (baseGmsClient3.r) {
                    baseGmsClient3.r.remove(zzcVar2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            baseGmsClient.A = new ConnectionResult(message.arg2, null, null);
            if (!baseGmsClient.B && !TextUtils.isEmpty(baseGmsClient.g()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(baseGmsClient.g());
                    if (!baseGmsClient.B) {
                        baseGmsClient.s(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = baseGmsClient.A;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            baseGmsClient.p.a(connectionResult);
            baseGmsClient.k(connectionResult);
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = baseGmsClient.A;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            baseGmsClient.p.a(connectionResult2);
            baseGmsClient.k(connectionResult2);
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null);
            baseGmsClient.p.a(connectionResult3);
            baseGmsClient.k(connectionResult3);
            return;
        }
        if (i4 == 6) {
            baseGmsClient.s(5, null);
            BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks = baseGmsClient.u;
            if (baseConnectionCallbacks != null) {
                baseConnectionCallbacks.onConnectionSuspended(message.arg2);
            }
            baseGmsClient.o(message.arg2);
            baseGmsClient.r(5, 1, null);
            return;
        }
        if (i4 == 2 && !baseGmsClient.isConnected()) {
            zzc zzcVar3 = (zzc) message.obj;
            if (zzcVar3 != null) {
                synchronized (zzcVar3) {
                    zzcVar3.a = null;
                }
                BaseGmsClient baseGmsClient4 = zzcVar3.c;
                synchronized (baseGmsClient4.r) {
                    baseGmsClient4.r.remove(zzcVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            new StringBuilder(String.valueOf(i5).length() + 34);
            new Exception();
            return;
        }
        zzc zzcVar4 = (zzc) message.obj;
        synchronized (zzcVar4) {
            try {
                bool = zzcVar4.a;
                if (zzcVar4.b) {
                    new StringBuilder(zzcVar4.toString().length() + 47);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            zzcVar4.a(bool);
        }
        synchronized (zzcVar4) {
            zzcVar4.b = true;
        }
        synchronized (zzcVar4) {
            zzcVar4.a = null;
        }
        BaseGmsClient baseGmsClient5 = zzcVar4.c;
        synchronized (baseGmsClient5.r) {
            baseGmsClient5.r.remove(zzcVar4);
        }
    }
}
