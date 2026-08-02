package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzn;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzec;
import com.google.android.gms.internal.ads.zzeg;
import com.google.android.gms.internal.ads.zzfd;
import com.google.android.gms.internal.ads.zzr;
import com.google.android.gms.internal.ads.zzs;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cy8 implements Handler.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        ComponentName componentName = null;
        switch (this.a) {
            case 0:
                dy8 dy8Var = (dy8) this.b;
                int i = message.what;
                if (i == 1) {
                    dy8Var.b((by8) message.obj);
                    return true;
                }
                if (i == 2) {
                    dy8Var.d.a((by8) message.obj);
                }
                return false;
            case 1:
                if (message.what != 0) {
                    return false;
                }
                ujg ujgVar = (ujg) this.b;
                jmh jmhVar = (jmh) message.obj;
                synchronized (ujgVar.b) {
                    if (((jmh) ujgVar.d) == jmhVar || ((jmh) ujgVar.e) == jmhVar) {
                        ujgVar.K(jmhVar, 2);
                    }
                }
                return true;
            case 2:
                zzeg zzegVar = (zzeg) this.b;
                zzec zzecVar = zzegVar.c;
                zzecVar.getClass();
                Iterator it = zzegVar.d.iterator();
                while (it.hasNext()) {
                    e3o e3oVar = (e3o) it.next();
                    if (!e3oVar.d && e3oVar.c) {
                        zzs b = e3oVar.b.b();
                        e3oVar.b = new zzr();
                        e3oVar.c = false;
                        zzecVar.b(e3oVar.a, b);
                    }
                    zzea zzeaVar = zzegVar.b;
                    zzeaVar.getClass();
                    if (zzeaVar.zzb(1)) {
                        return true;
                    }
                }
                return true;
            case 3:
                zzfd zzfdVar = (zzfd) this.b;
                int i2 = message.what;
                if (i2 == 1) {
                    zzfdVar.f.b();
                    return true;
                }
                if (i2 == 2) {
                    zzfdVar.g.a();
                    return true;
                }
                if (i2 == 3) {
                    zzfdVar.h.a();
                    return true;
                }
                if (i2 != 4) {
                    return false;
                }
                zzfdVar.i.b();
                return true;
            case 4:
                int i3 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    new StringBuilder(String.valueOf(i3).length() + 30);
                }
                b1p b1pVar = (b1p) this.b;
                synchronized (b1pVar) {
                    try {
                        SparseArray sparseArray = b1pVar.e;
                        s3p s3pVar = (s3p) sparseArray.get(i3);
                        if (s3pVar != null) {
                            sparseArray.remove(i3);
                            b1pVar.l();
                            Bundle data = message.getData();
                            if (!data.getBoolean("unsupported", false)) {
                                switch (s3pVar.e) {
                                    case 0:
                                        if (!data.getBoolean("ack", false)) {
                                            s3pVar.c(new zzt("Invalid response to one way request", null));
                                            break;
                                        } else {
                                            s3pVar.b(null);
                                            break;
                                        }
                                    default:
                                        Bundle bundle = data.getBundle("data");
                                        if (bundle == null) {
                                            bundle = Bundle.EMPTY;
                                        }
                                        s3pVar.b(bundle);
                                        break;
                                }
                            } else {
                                s3pVar.c(new zzt("Not supported by GmsCore", null));
                            }
                        } else {
                            new StringBuilder(String.valueOf(i3).length() + 39);
                        }
                    } finally {
                    }
                }
                return true;
            default:
                int i4 = message.what;
                if (i4 == 0) {
                    n2p n2pVar = (n2p) this.b;
                    synchronized (n2pVar.d) {
                        try {
                            zzn zznVar = (zzn) message.obj;
                            szo szoVar = (szo) n2pVar.d.get(zznVar);
                            if (szoVar != null && szoVar.a.isEmpty()) {
                                if (szoVar.c) {
                                    zzn zznVar2 = szoVar.e;
                                    n2p n2pVar2 = szoVar.g;
                                    n2pVar2.f.removeMessages(1, zznVar2);
                                    n2pVar2.g.c(n2pVar2.e, szoVar);
                                    szoVar.c = false;
                                    szoVar.b = 2;
                                }
                                n2pVar.d.remove(zznVar);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i4 != 1) {
                    return false;
                }
                n2p n2pVar3 = (n2p) this.b;
                synchronized (n2pVar3.d) {
                    try {
                        zzn zznVar3 = (zzn) message.obj;
                        szo szoVar2 = (szo) n2pVar3.d.get(zznVar3);
                        if (szoVar2 != null && szoVar2.b == 3) {
                            new StringBuilder(String.valueOf(zznVar3).length() + 47);
                            new Exception();
                            ComponentName componentName2 = szoVar2.f;
                            if (componentName2 == null) {
                                zznVar3.getClass();
                            } else {
                                componentName = componentName2;
                            }
                            if (componentName == null) {
                                String str = zznVar3.b;
                                Preconditions.i(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            szoVar2.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
