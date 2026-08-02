package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.x5n;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbnl extends zzbev implements zzbnm {
    public zzbnl() {
        super("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbev
    public final boolean D4(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                String readString = parcel.readString();
                zzbew.f(parcel);
                String zze = ((zzdve) this).zze(readString);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 2:
                String readString2 = parcel.readString();
                zzbew.f(parcel);
                zzbmv zzf = ((zzdve) this).zzf(readString2);
                parcel2.writeNoException();
                zzbew.e(parcel2, zzf);
                return true;
            case 3:
                List zzg = ((zzdve) this).zzg();
                parcel2.writeNoException();
                parcel2.writeStringList(zzg);
                return true;
            case 4:
                String g = ((zzdve) this).b.g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzbew.f(parcel);
                ((zzdve) this).zzi(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                ((zzdve) this).zzj();
                parcel2.writeNoException();
                return true;
            case 7:
                com.google.android.gms.ads.internal.client.zzea r = ((zzdve) this).b.r();
                parcel2.writeNoException();
                zzbew.e(parcel2, r);
                return true;
            case 8:
                ((zzdve) this).zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                IObjectWrapper zzm = ((zzdve) this).zzm();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzm);
                return true;
            case 10:
                boolean w0 = ((zzdve) this).w0(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(w0 ? 1 : 0);
                return true;
            case 11:
                parcel2.writeNoException();
                ClassLoader classLoader = zzbew.a;
                parcel2.writeStrongBinder(null);
                return true;
            case 12:
                boolean zzo = ((zzdve) this).zzo();
                parcel2.writeNoException();
                ClassLoader classLoader2 = zzbew.a;
                parcel2.writeInt(zzo ? 1 : 0);
                return true;
            case 13:
                boolean zzp = ((zzdve) this).zzp();
                parcel2.writeNoException();
                ClassLoader classLoader3 = zzbew.a;
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 14:
                ((zzdve) this).I0(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                return true;
            case 15:
                ((zzdve) this).zzr();
                parcel2.writeNoException();
                return true;
            case 16:
                zzbms zzs = ((zzdve) this).zzs();
                parcel2.writeNoException();
                zzbew.e(parcel2, zzs);
                return true;
            case 17:
                boolean r2 = ((zzdve) this).r(x5n.j(parcel, parcel));
                parcel2.writeNoException();
                parcel2.writeInt(r2 ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
