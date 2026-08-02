package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzdb;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbol extends zzbev implements zzbom {
    public zzbol() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zzbmv zzbmvVar;
        double d;
        String p;
        String p2;
        IObjectWrapper iObjectWrapper;
        zzboj zzbohVar;
        switch (i) {
            case 2:
                String a = ((zzdvg) this).c.a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 3:
                zzdqr zzdqrVar = ((zzdvg) this).c;
                synchronized (zzdqrVar) {
                    list = zzdqrVar.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 4:
                String c = ((zzdvg) this).c.c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 5:
                zzdqr zzdqrVar2 = ((zzdvg) this).c;
                synchronized (zzdqrVar2) {
                    zzbmvVar = zzdqrVar2.s;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, zzbmvVar);
                return true;
            case 6:
                String e = ((zzdvg) this).c.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 7:
                String f = ((zzdvg) this).c.f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 8:
                zzdqr zzdqrVar3 = ((zzdvg) this).c;
                synchronized (zzdqrVar3) {
                    d = zzdqrVar3.r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                zzdqr zzdqrVar4 = ((zzdvg) this).c;
                synchronized (zzdqrVar4) {
                    p = zzdqrVar4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p);
                return true;
            case 10:
                zzdqr zzdqrVar5 = ((zzdvg) this).c;
                synchronized (zzdqrVar5) {
                    p2 = zzdqrVar5.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(p2);
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea r = ((zzdvg) this).c.r();
                parcel2.writeNoException();
                zzbew.e(parcel2, r);
                return true;
            case 12:
                String str = ((zzdvg) this).a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            case 13:
                ((zzdvg) this).zzp();
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmo s = ((zzdvg) this).c.s();
                parcel2.writeNoException();
                zzbew.e(parcel2, s);
                return true;
            case 15:
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                ((zzdvg) this).V3(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                boolean n = ((zzdvg) this).b.n(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(n ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                ((zzdvg) this).h3(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                IObjectWrapper zzu = ((zzdvg) this).zzu();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzu);
                return true;
            case 19:
                zzdqr zzdqrVar6 = ((zzdvg) this).c;
                synchronized (zzdqrVar6) {
                    iObjectWrapper = zzdqrVar6.q;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, iObjectWrapper);
                return true;
            case 20:
                Bundle d2 = ((zzdvg) this).c.d();
                parcel2.writeNoException();
                zzbew.d(parcel2, d2);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    zzbohVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    zzbohVar = queryLocalInterface instanceof zzboj ? (zzboj) queryLocalInterface : new zzboh(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                }
                zzbew.f(parcel);
                ((zzdvg) this).Q(zzbohVar);
                parcel2.writeNoException();
                return true;
            case 22:
                ((zzdvg) this).j();
                parcel2.writeNoException();
                return true;
            case 23:
                List zzz = ((zzdvg) this).zzz();
                parcel2.writeNoException();
                parcel2.writeList(zzz);
                return true;
            case 24:
                boolean zzA = ((zzdvg) this).zzA();
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeInt(zzA ? 1 : 0);
                return true;
            case 25:
                com.google.android.gms.ads.internal.client.zzdg zza = com.google.android.gms.ads.internal.client.zzdf.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzdvg) this).m1(zza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzdc zza2 = zzdb.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzdvg) this).C2(zza2);
                parcel2.writeNoException();
                return true;
            case 27:
                ((zzdvg) this).zzD();
                parcel2.writeNoException();
                return true;
            case 28:
                ((zzdvg) this).zzE();
                parcel2.writeNoException();
                return true;
            case 29:
                zzbms zzF = ((zzdvg) this).zzF();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzF);
                return true;
            case 30:
                boolean o = ((zzdvg) this).o();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeInt(o ? 1 : 0);
                return true;
            case 31:
                com.google.android.gms.ads.internal.client.zzdx zzH = ((zzdvg) this).zzH();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzH);
                return true;
            case 32:
                com.google.android.gms.ads.internal.client.zzdq zza3 = com.google.android.gms.ads.internal.client.zzdp.zza(parcel.readStrongBinder());
                zzbew.f(parcel);
                ((zzdvg) this).l1(zza3);
                parcel2.writeNoException();
                return true;
            case 33:
                Bundle bundle4 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                ((zzdvg) this).g1(bundle4);
                parcel2.writeNoException();
                return true;
            case 34:
                long b = ((zzdvg) this).b();
                parcel2.writeNoException();
                parcel2.writeLong(b);
                return true;
            case 35:
                long readLong = parcel.readLong();
                zzbew.f(parcel);
                ((zzdvg) this).E2(readLong);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
