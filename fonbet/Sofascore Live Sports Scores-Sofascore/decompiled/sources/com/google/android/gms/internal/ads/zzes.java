package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import defpackage.c5o;
import defpackage.kbd;
import defpackage.wjn;
import defpackage.x3o;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class zzes {
    public static zzes f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public zzes(Context context) {
        Executor a = zzdi.a();
        this.a = a;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        a.execute(new wjn(17, this, context));
    }

    public static synchronized zzes a(Context context) {
        zzes zzesVar;
        synchronized (zzes.class) {
            zzesVar = f;
            if (zzesVar == null) {
                zzesVar = new zzes(context);
                f = zzesVar;
            }
        }
        return zzesVar;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final /* synthetic */ void c(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 2;
        int i2 = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type != 1) {
                            if (type != 4 && type != 5) {
                                if (type != 6) {
                                    i2 = type != 9 ? 8 : 7;
                                }
                                i2 = 5;
                            }
                        }
                        i2 = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i2 = 4;
                            break;
                        case 13:
                            i2 = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i2 = 6;
                            break;
                        case 18:
                            i2 = 2;
                            break;
                        case 20:
                            if (Build.VERSION.SDK_INT >= 29) {
                                i2 = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i2 = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i2 != 5) {
            d(i2);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            kbd kbdVar = new kbd(this, i);
            telephonyManager.registerTelephonyCallback(this.a, kbdVar);
            telephonyManager.unregisterTelephonyCallback(kbdVar);
        } catch (RuntimeException unused2) {
            d(5);
        }
    }

    public final void d(int i) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            c5o c5oVar = (c5o) it.next();
            if (c5oVar.a.get() == null) {
                copyOnWriteArrayList.remove(c5oVar);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                Iterator it2 = this.b.iterator();
                while (it2.hasNext()) {
                    c5o c5oVar2 = (c5o) it2.next();
                    c5oVar2.getClass();
                    c5oVar2.b.execute(new x3o(c5oVar2, 4));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
