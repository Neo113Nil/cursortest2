package com.google.android.gms.internal.cast;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import com.google.android.gms.cast.internal.Logger;
import defpackage.a70;
import defpackage.bnn;
import defpackage.ibc;
import defpackage.jbc;
import defpackage.lbc;
import defpackage.obc;
import defpackage.pbc;
import defpackage.pvd;
import defpackage.sbc;
import defpackage.tc0;
import defpackage.yz8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbd extends zzb implements zzbe {
    public zzbd() {
        super("com.google.android.gms.cast.framework.internal.IMediaRouter");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean J(int i, Parcel parcel, Parcel parcel2) {
        zzbg zzbgVar = null;
        Bundle bundle = null;
        int i2 = 0;
        switch (i) {
            case 1:
                Bundle bundle2 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                    zzbgVar = queryLocalInterface instanceof zzbg ? (zzbg) queryLocalInterface : new zzbf(readStrongBinder, "com.google.android.gms.cast.framework.internal.IMediaRouterCallback");
                }
                zzc.d(parcel);
                zzbx zzbxVar = (zzbx) this;
                ibc b = ibc.b(bundle2);
                if (b != null) {
                    HashMap hashMap = zzbxVar.c;
                    if (!hashMap.containsKey(b)) {
                        hashMap.put(b, new HashSet());
                    }
                    ((Set) hashMap.get(b)).add(new zzbl(zzbgVar, zzbxVar, zzbxVar.d));
                }
                parcel2.writeNoException();
                break;
            case 2:
                Bundle bundle3 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                int readInt = parcel.readInt();
                zzc.d(parcel);
                zzbx zzbxVar2 = (zzbx) this;
                ibc b2 = ibc.b(bundle3);
                if (b2 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        zzbxVar2.Z1(b2, readInt);
                    } else {
                        new zzfk(Looper.getMainLooper()).post(new tc0(zzbxVar2, b2, readInt, 6));
                    }
                }
                parcel2.writeNoException();
                break;
            case 3:
                Bundle bundle4 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                zzc.d(parcel);
                zzbx zzbxVar3 = (zzbx) this;
                ibc b3 = ibc.b(bundle4);
                if (b3 != null) {
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        zzbxVar3.l2(b3);
                    } else {
                        new zzfk(Looper.getMainLooper()).post(new bnn(3, zzbxVar3, b3));
                    }
                }
                parcel2.writeNoException();
                break;
            case 4:
                Bundle bundle5 = (Bundle) zzc.a(parcel, Bundle.CREATOR);
                int readInt2 = parcel.readInt();
                zzc.d(parcel);
                zzbx zzbxVar4 = (zzbx) this;
                ibc b4 = ibc.b(bundle5);
                if (b4 != null) {
                    zzbxVar4.a.getClass();
                    pbc.b();
                    yz8 c = pbc.c();
                    ArrayList arrayList = c.i;
                    if (!b4.d()) {
                        if ((readInt2 & 2) != 0 || !c.p) {
                            sbc sbcVar = c.u;
                            Object[] objArr = sbcVar != null && sbcVar.b && c.i();
                            int size = arrayList.size();
                            for (int i3 = 0; i3 < size; i3++) {
                                obc obcVar = (obc) arrayList.get(i3);
                                if (((readInt2 & 1) != 0 && obcVar.d()) || ((objArr != false && !obcVar.d() && obcVar.c() != c.r) || !obcVar.h(b4))) {
                                }
                            }
                        }
                        i2 = 1;
                    }
                }
                parcel2.writeNoException();
                parcel2.writeInt(i2);
                break;
            case 5:
                String readString = parcel.readString();
                zzc.d(parcel);
                Logger logger = zzbx.h;
                logger.a("select route with routeId = %s", readString);
                ((zzbx) this).a.getClass();
                pbc.b();
                Iterator it = pbc.c().i.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obc obcVar2 = (obc) it.next();
                        if (obcVar2.c.equals(readString)) {
                            logger.a("media route is found and selected", new Object[0]);
                            obcVar2.l(true);
                        }
                    }
                }
                parcel2.writeNoException();
                break;
            case 6:
                ((zzbx) this).a.getClass();
                pbc.b();
                obc obcVar3 = pbc.c().v;
                if (obcVar3 != null) {
                    obcVar3.l(true);
                    parcel2.writeNoException();
                    break;
                } else {
                    a70.r("There is no default route.  The media router has not yet been fully initialized.");
                    break;
                }
            case 7:
                ((zzbx) this).a.getClass();
                pbc.b();
                obc obcVar4 = pbc.c().v;
                if (obcVar4 != null) {
                    boolean equals = pbc.f().c.equals(obcVar4.c);
                    parcel2.writeNoException();
                    int i4 = zzc.a;
                    parcel2.writeInt(equals ? 1 : 0);
                    break;
                } else {
                    a70.r("There is no default route.  The media router has not yet been fully initialized.");
                    break;
                }
            case 8:
                String readString2 = parcel.readString();
                zzc.d(parcel);
                ((zzbx) this).a.getClass();
                pbc.b();
                Iterator it2 = pbc.c().i.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obc obcVar5 = (obc) it2.next();
                        if (obcVar5.c.equals(readString2)) {
                            bundle = obcVar5.s;
                        }
                    }
                }
                parcel2.writeNoException();
                if (bundle == null) {
                    parcel2.writeInt(0);
                    break;
                } else {
                    parcel2.writeInt(1);
                    bundle.writeToParcel(parcel2, 1);
                    break;
                }
            case 9:
                ((zzbx) this).a.getClass();
                String str = pbc.f().c;
                parcel2.writeNoException();
                parcel2.writeString(str);
                break;
            case 10:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                break;
            case 11:
                zzbx zzbxVar5 = (zzbx) this;
                HashMap hashMap2 = zzbxVar5.c;
                Iterator it3 = hashMap2.values().iterator();
                while (it3.hasNext()) {
                    Iterator it4 = ((Set) it3.next()).iterator();
                    while (it4.hasNext()) {
                        zzbxVar5.a.h((jbc) it4.next());
                    }
                }
                hashMap2.clear();
                parcel2.writeNoException();
                break;
            case 12:
                ((zzbx) this).a.getClass();
                pbc.b();
                obc obcVar6 = pbc.c().w;
                if (obcVar6 != null && pbc.f().c.equals(obcVar6.c)) {
                    i2 = 1;
                }
                parcel2.writeNoException();
                int i5 = zzc.a;
                parcel2.writeInt(i2);
                break;
            case 13:
                int readInt3 = parcel.readInt();
                zzc.d(parcel);
                ((zzbx) this).a.getClass();
                pbc.j(readInt3);
                parcel2.writeNoException();
                break;
            case 14:
                String readString3 = parcel.readString();
                zzc.d(parcel);
                Logger logger2 = zzbx.h;
                ((zzbx) this).a.getClass();
                pbc.b();
                Iterator it5 = pbc.c().e().iterator();
                while (it5.hasNext()) {
                    lbc lbcVar = (lbc) it5.next();
                    if (lbcVar.c.equals(readString3)) {
                        logger2.a("clean up the connectedGroupRoute = %s", lbcVar);
                        pbc.b();
                        if (pbc.c().j.get(lbcVar.c) != null) {
                            pvd.j();
                            break;
                        }
                    }
                }
                obc f = pbc.f();
                if (f != null && !f.h && f.c.equals(readString3)) {
                    logger2.a("clean up the selected route = %s", f);
                    pbc.j(0);
                }
                parcel2.writeNoException();
                break;
        }
        return false;
    }
}
