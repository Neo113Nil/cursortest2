package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbng extends zzbev implements zzbnh {
    public zzbng() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zzbmv zzbmvVar;
        double d;
        String p;
        String p2;
        IObjectWrapper iObjectWrapper;
        switch (i) {
            case 2:
                ObjectWrapper objectWrapper = new ObjectWrapper(((zzduz) this).b);
                parcel2.writeNoException();
                zzbew.e(parcel2, objectWrapper);
                return true;
            case 3:
                String a = ((zzduz) this).c.a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 4:
                zzdqr zzdqrVar = ((zzduz) this).c;
                synchronized (zzdqrVar) {
                    list = zzdqrVar.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c = ((zzduz) this).c.c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 6:
                zzdqr zzdqrVar2 = ((zzduz) this).c;
                synchronized (zzdqrVar2) {
                    zzbmvVar = zzdqrVar2.s;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, zzbmvVar);
                return true;
            case 7:
                String e = ((zzduz) this).c.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 8:
                zzdqr zzdqrVar3 = ((zzduz) this).c;
                synchronized (zzdqrVar3) {
                    d = zzdqrVar3.r;
                }
                parcel2.writeNoException();
                parcel2.writeDouble(d);
                return true;
            case 9:
                zzdqr zzdqrVar4 = ((zzduz) this).c;
                synchronized (zzdqrVar4) {
                    p = zzdqrVar4.p("store");
                }
                parcel2.writeNoException();
                parcel2.writeString(p);
                return true;
            case 10:
                zzdqr zzdqrVar5 = ((zzduz) this).c;
                synchronized (zzdqrVar5) {
                    p2 = zzdqrVar5.p("price");
                }
                parcel2.writeNoException();
                parcel2.writeString(p2);
                return true;
            case 11:
                Bundle d2 = ((zzduz) this).c.d();
                parcel2.writeNoException();
                zzbew.d(parcel2, d2);
                return true;
            case 12:
                ((zzduz) this).b.m();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzea r = ((zzduz) this).c.r();
                parcel2.writeNoException();
                zzbew.e(parcel2, r);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                zzdqm zzdqmVar = ((zzduz) this).b;
                synchronized (zzdqmVar) {
                    zzdqmVar.n.u(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                boolean n = ((zzduz) this).b.n(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(n ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                zzdqm zzdqmVar2 = ((zzduz) this).b;
                synchronized (zzdqmVar2) {
                    zzdqmVar2.n.f(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 17:
                zzbmo s = ((zzduz) this).c.s();
                parcel2.writeNoException();
                zzbew.e(parcel2, s);
                return true;
            case 18:
                zzdqr zzdqrVar6 = ((zzduz) this).c;
                synchronized (zzdqrVar6) {
                    iObjectWrapper = zzdqrVar6.q;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, iObjectWrapper);
                return true;
            case 19:
                String str = ((zzduz) this).a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
