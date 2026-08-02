package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzab;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.internal.zzad;
import com.google.android.gms.common.zzt;
import com.google.android.gms.common.zzy;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class rzo {
    public static volatile zzad g;
    public static Context i;
    public static final ayn a = new ayn(vro.Z1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
    public static final ayn b = new ayn(vro.Z1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
    public static final ayn c = new ayn(vro.Z1("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
    public static final ayn d = new ayn(vro.Z1("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
    public static final ayn e = new ayn(vro.Z1("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
    public static final ayn f = new ayn(vro.Z1("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
    public static final Object h = new Object();

    public static void a() {
        zzad zzabVar;
        if (g != null) {
            return;
        }
        Preconditions.i(i);
        synchronized (h) {
            try {
                if (g == null) {
                    IBinder b2 = DynamiteModule.c(i, DynamiteModule.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i2 = zzac.a;
                    if (b2 == null) {
                        zzabVar = null;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        zzabVar = queryLocalInterface instanceof zzad ? (zzad) queryLocalInterface : new zzab(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
                    }
                    g = zzabVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static zzy b(String str, pto ptoVar, boolean z, boolean z2) {
        try {
            a();
            Preconditions.i(i);
            try {
                return g.Y(new zzt(str, ptoVar, z, z2), new ObjectWrapper(i.getPackageManager())) ? zzy.c : new rbp(new ivo(z, str, ptoVar));
            } catch (RemoteException e2) {
                return zzy.c("module call", e2);
            }
        } catch (DynamiteModule.LoadingException e3) {
            return zzy.c("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
