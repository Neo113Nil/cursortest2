package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.dh0;
import defpackage.ewm;
import defpackage.fhh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdve extends zzbnl {
    public final Context a;
    public final zzdqr b;
    public zzdrq c;
    public zzdqm d;

    public zzdve(Context context, zzdqr zzdqrVar, zzdrq zzdrqVar, zzdqm zzdqmVar) {
        this.a = context;
        this.b = zzdqrVar;
        this.c = zzdrqVar;
        this.d = zzdqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void I0(IObjectWrapper iObjectWrapper) {
        zzdqm zzdqmVar;
        Object Z1 = ObjectWrapper.Z1(iObjectWrapper);
        if (!(Z1 instanceof View) || this.b.k() == null || (zzdqmVar = this.d) == null) {
            return;
        }
        zzdqmVar.f((View) Z1);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean r(IObjectWrapper iObjectWrapper) {
        zzdrq zzdrqVar;
        Object Z1 = ObjectWrapper.Z1(iObjectWrapper);
        if (!(Z1 instanceof ViewGroup) || (zzdrqVar = this.c) == null || !zzdrqVar.c((ViewGroup) Z1, false)) {
            return false;
        }
        this.b.i().k0(new ewm(this, 17));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean w0(IObjectWrapper iObjectWrapper) {
        zzdrq zzdrqVar;
        Object Z1 = ObjectWrapper.Z1(iObjectWrapper);
        if (!(Z1 instanceof ViewGroup) || (zzdrqVar = this.c) == null || !zzdrqVar.c((ViewGroup) Z1, true)) {
            return false;
        }
        this.b.h().k0(new ewm(this, 17));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zze(String str) {
        fhh fhhVar;
        zzdqr zzdqrVar = this.b;
        synchronized (zzdqrVar) {
            fhhVar = zzdqrVar.w;
        }
        return (String) fhhVar.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbmv zzf(String str) {
        fhh fhhVar;
        zzdqr zzdqrVar = this.b;
        synchronized (zzdqrVar) {
            fhhVar = zzdqrVar.v;
        }
        return (zzbmv) fhhVar.get(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final List zzg() {
        fhh fhhVar;
        fhh fhhVar2;
        try {
            zzdqr zzdqrVar = this.b;
            synchronized (zzdqrVar) {
                fhhVar = zzdqrVar.v;
            }
            synchronized (zzdqrVar) {
                fhhVar2 = zzdqrVar.w;
            }
            String[] strArr = new String[fhhVar.c + fhhVar2.c];
            int i = 0;
            for (int i2 = 0; i2 < fhhVar.c; i2++) {
                strArr[i] = (String) fhhVar.g(i2);
                i++;
            }
            for (int i3 = 0; i3 < fhhVar2.c; i3++) {
                strArr[i] = (String) fhhVar2.g(i3);
                i++;
            }
            return Arrays.asList(strArr);
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InternalNativeCustomTemplateAdShim.getAvailableAssetNames", e);
            return new ArrayList();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final String zzh() {
        return this.b.g();
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzi(String str) {
        zzdqm zzdqmVar = this.d;
        if (zzdqmVar != null) {
            synchronized (zzdqmVar) {
                zzdqmVar.n.n(str);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzj() {
        zzdqm zzdqmVar = this.d;
        if (zzdqmVar != null) {
            synchronized (zzdqmVar) {
                if (zzdqmVar.y) {
                    return;
                }
                zzdqmVar.n.zzn();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzl() {
        zzdqm zzdqmVar = this.d;
        if (zzdqmVar != null) {
            zzdqmVar.m();
        }
        this.d = null;
        this.c = null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final IObjectWrapper zzm() {
        return new ObjectWrapper(this.a);
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzo() {
        zzdqm zzdqmVar = this.d;
        if (zzdqmVar != null && !zzdqmVar.p.c()) {
            return false;
        }
        zzdqr zzdqrVar = this.b;
        return zzdqrVar.j() != null && zzdqrVar.h() == null;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final boolean zzp() {
        zzdqr zzdqrVar = this.b;
        zzeml k = zzdqrVar.k();
        if (k == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Trying to start OMID session before creation.");
            return false;
        }
        com.google.android.gms.ads.internal.zzt.zzu().e(k.a);
        if (zzdqrVar.j() == null) {
            return true;
        }
        zzdqrVar.j().n("onSdkLoaded", new dh0(0));
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final void zzr() {
        String str;
        try {
            zzdqr zzdqrVar = this.b;
            synchronized (zzdqrVar) {
                str = zzdqrVar.y;
            }
            if (Objects.equals(str, "Google")) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Illegal argument specified for omid partner name.");
            } else if (TextUtils.isEmpty(str)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi("Not starting OMID session. OM partner name has not been configured.");
            } else {
                zzdqm zzdqmVar = this.d;
                if (zzdqmVar != null) {
                    zzdqmVar.e(str, false);
                }
            }
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InternalNativeCustomTemplateAdShim.initializeDisplayOpenMeasurement", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbnm
    public final zzbms zzs() {
        zzbms zzbmsVar;
        try {
            zzdqo zzdqoVar = this.d.F;
            synchronized (zzdqoVar) {
                zzbmsVar = zzdqoVar.a;
            }
            return zzbmsVar;
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzt.zzh().d("InternalNativeCustomTemplateAdShim.getMediaContent", e);
            return null;
        }
    }
}
