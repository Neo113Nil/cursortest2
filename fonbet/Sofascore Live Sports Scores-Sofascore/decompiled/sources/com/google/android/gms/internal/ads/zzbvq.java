package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import defpackage.hbo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbvq extends zzbvt {
    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean A(String str) {
        try {
            return Adapter.class.isAssignableFrom(Class.forName(str, false, zzbvq.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbxt n(String str) {
        try {
            return new zzbyg((RtbAdapter) Class.forName(str, false, zzbxx.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (Throwable unused) {
            hbo.n();
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final zzbvx zza(String str) {
        try {
            try {
                Class<?> cls = Class.forName(str, false, zzbvq.class.getClassLoader());
                if (MediationAdapter.class.isAssignableFrom(cls)) {
                    return new zzbwv((MediationAdapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                if (Adapter.class.isAssignableFrom(cls)) {
                    return new zzbwv((Adapter) cls.getDeclaredConstructor(null).newInstance(null));
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                zzo.zzi(sb.toString());
                throw new RemoteException();
            } catch (Throwable unused) {
                zzo.zzd("Reflection failed, retrying using direct instantiation");
                if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                    return new zzbwv(new AdMobAdapter());
                }
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    return new zzbwv(new CustomEventAdapter());
                }
                hbo.n();
                return null;
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 43);
            sb2.append("Could not instantiate mediation adapter: ");
            sb2.append(str);
            sb2.append(". ");
            zzo.zzj(sb2.toString(), th);
            hbo.n();
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvu
    public final boolean zzb(String str) {
        try {
            return CustomEvent.class.isAssignableFrom(Class.forName(str, false, zzbvq.class.getClassLoader()));
        } catch (Throwable unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            zzo.zzi(sb.toString());
            return false;
        }
    }
}
