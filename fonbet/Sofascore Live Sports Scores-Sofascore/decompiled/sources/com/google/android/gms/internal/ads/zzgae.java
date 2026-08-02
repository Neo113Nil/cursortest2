package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import defpackage.jbo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzgae {
    public final zzgah a;
    public final boolean b = true;

    public zzgae(zzgah zzgahVar) {
        this.a = zzgahVar;
    }

    public static zzgae a(Context context, String str) {
        zzgah zzgafVar;
        try {
            try {
                try {
                    IBinder b = DynamiteModule.c(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (b == null) {
                        zzgafVar = null;
                    } else {
                        IInterface queryLocalInterface = b.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzgafVar = queryLocalInterface instanceof zzgah ? (zzgah) queryLocalInterface : new zzgaf(b, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                    }
                    zzgafVar.x(new ObjectWrapper(context), str);
                    return new zzgae(zzgafVar);
                } catch (Exception e) {
                    throw new zzfzh(e);
                }
            } catch (RemoteException | zzfzh | NullPointerException | SecurityException unused) {
                return new zzgae(new jbo());
            }
        } catch (Exception e2) {
            throw new zzfzh(e2);
        }
    }
}
