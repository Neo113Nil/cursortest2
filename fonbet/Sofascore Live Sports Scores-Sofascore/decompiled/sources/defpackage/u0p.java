package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class u0p {
    public final x0p a;
    public final boolean b = true;

    public u0p(x0p x0pVar) {
        this.a = x0pVar;
    }

    public static u0p a(Context context, String str) {
        x0p v0pVar;
        try {
            try {
                try {
                    IBinder b = DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b == null) {
                        v0pVar = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        v0pVar = queryLocalInterface instanceof x0p ? (x0p) queryLocalInterface : new v0p(b, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    v0pVar.x(new ObjectWrapper(context), str);
                    return new u0p(v0pVar);
                } catch (RemoteException | NullPointerException | SecurityException | xzo unused) {
                    return new u0p(new g1p());
                }
            } catch (Exception e) {
                throw new xzo(e);
            }
        } catch (Exception e2) {
            throw new xzo(e2);
        }
    }
}
