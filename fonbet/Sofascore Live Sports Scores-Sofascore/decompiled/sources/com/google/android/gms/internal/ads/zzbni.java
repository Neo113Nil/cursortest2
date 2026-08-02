package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbni extends zzbev implements zzbnj {
    public zzbni() {
        super("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        List list;
        zzbmv zzbmvVar;
        IObjectWrapper iObjectWrapper;
        switch (i) {
            case 2:
                ObjectWrapper objectWrapper = new ObjectWrapper(((zzdvb) this).b);
                parcel2.writeNoException();
                zzbew.e(parcel2, objectWrapper);
                return true;
            case 3:
                String a = ((zzdvb) this).c.a();
                parcel2.writeNoException();
                parcel2.writeString(a);
                return true;
            case 4:
                zzdqr zzdqrVar = ((zzdvb) this).c;
                synchronized (zzdqrVar) {
                    list = zzdqrVar.e;
                }
                parcel2.writeNoException();
                parcel2.writeList(list);
                return true;
            case 5:
                String c = ((zzdvb) this).c.c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 6:
                zzdqr zzdqrVar2 = ((zzdvb) this).c;
                synchronized (zzdqrVar2) {
                    zzbmvVar = zzdqrVar2.t;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, zzbmvVar);
                return true;
            case 7:
                String e = ((zzdvb) this).c.e();
                parcel2.writeNoException();
                parcel2.writeString(e);
                return true;
            case 8:
                String f = ((zzdvb) this).c.f();
                parcel2.writeNoException();
                parcel2.writeString(f);
                return true;
            case 9:
                Bundle d = ((zzdvb) this).c.d();
                parcel2.writeNoException();
                zzbew.d(parcel2, d);
                return true;
            case 10:
                ((zzdvb) this).b.m();
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzea r = ((zzdvb) this).c.r();
                parcel2.writeNoException();
                zzbew.e(parcel2, r);
                return true;
            case 12:
                Bundle bundle = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                zzdqm zzdqmVar = ((zzdvb) this).b;
                synchronized (zzdqmVar) {
                    zzdqmVar.n.u(bundle);
                }
                parcel2.writeNoException();
                return true;
            case 13:
                Bundle bundle2 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                boolean n = ((zzdvb) this).b.n(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(n ? 1 : 0);
                return true;
            case 14:
                Bundle bundle3 = (Bundle) zzbew.b(parcel, Bundle.CREATOR);
                zzbew.f(parcel);
                zzdqm zzdqmVar2 = ((zzdvb) this).b;
                synchronized (zzdqmVar2) {
                    zzdqmVar2.n.f(bundle3);
                }
                parcel2.writeNoException();
                return true;
            case 15:
                zzbmo s = ((zzdvb) this).c.s();
                parcel2.writeNoException();
                zzbew.e(parcel2, s);
                return true;
            case 16:
                zzdqr zzdqrVar3 = ((zzdvb) this).c;
                synchronized (zzdqrVar3) {
                    iObjectWrapper = zzdqrVar3.q;
                }
                parcel2.writeNoException();
                zzbew.e(parcel2, iObjectWrapper);
                return true;
            case 17:
                String str = ((zzdvb) this).a;
                parcel2.writeNoException();
                parcel2.writeString(str);
                return true;
            default:
                return false;
        }
    }
}
