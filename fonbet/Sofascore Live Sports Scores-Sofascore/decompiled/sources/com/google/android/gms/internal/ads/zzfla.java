package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.b1l;
import defpackage.fl5;
import defpackage.qc4;
import defpackage.w00;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfla extends zzccj {
    public final zzfkq a;
    public final zzfkh b;
    public final zzflp c;
    public zzdwk d;
    public boolean e = false;

    public zzfla(zzfkq zzfkqVar, zzfkh zzfkhVar, zzflp zzflpVar) {
        this.a = zzfkqVar;
        this.b = zzfkhVar;
        this.c = zzflpVar;
    }

    public final synchronized void C3(IObjectWrapper iObjectWrapper) {
        Preconditions.e("resume must be called on the main UI thread.");
        if (this.d != null) {
            Context context = iObjectWrapper == null ? null : (Context) ObjectWrapper.Z1(iObjectWrapper);
            zzdeo zzdeoVar = this.d.c;
            zzdeoVar.getClass();
            zzdeoVar.p0(new w00(context, 3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.E6)).booleanValue() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (java.util.regex.Pattern.matches(r1, r0) != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void E4(zzcco zzccoVar) {
        Preconditions.e("loadAd must be called on the main UI thread.");
        String str = zzccoVar.b;
        String str2 = (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C6);
        if (str2 != null && str != null) {
            try {
            } catch (RuntimeException e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("NonagonUtil.isPatternMatched", e);
            }
        }
        if (G4()) {
        }
        zzfkj zzfkjVar = new zzfkj();
        this.d = null;
        zzfkq zzfkqVar = this.a;
        zzfkqVar.h.o.a = 1;
        zzfkqVar.a(zzccoVar.a, zzccoVar.b, zzfkjVar, new b1l(this, 21));
    }

    public final synchronized String F4() {
        zzdwk zzdwkVar = this.d;
        if (zzdwkVar == null) {
            return null;
        }
        return zzdwkVar.f.a;
    }

    public final synchronized boolean G4() {
        zzdwk zzdwkVar = this.d;
        if (zzdwkVar != null) {
            if (!zzdwkVar.r.b.get()) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void a0(IObjectWrapper iObjectWrapper) {
        try {
            Preconditions.e("showAd must be called on the main UI thread.");
            if (this.d != null) {
                Activity activity = null;
                if (iObjectWrapper != null) {
                    Object Z1 = ObjectWrapper.Z1(iObjectWrapper);
                    if (Z1 instanceof Activity) {
                        activity = (Activity) Z1;
                    }
                }
                this.d.c(activity, this.e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void t(IObjectWrapper iObjectWrapper) {
        Preconditions.e("pause must be called on the main UI thread.");
        if (this.d != null) {
            Context context = iObjectWrapper == null ? null : (Context) ObjectWrapper.Z1(iObjectWrapper);
            zzdeo zzdeoVar = this.d.c;
            zzdeoVar.getClass();
            zzdeoVar.p0(new fl5(context, false));
        }
    }

    public final synchronized void zzb() {
        a0(null);
    }

    public final synchronized void zzj(IObjectWrapper iObjectWrapper) {
        Preconditions.e("destroy must be called on the main UI thread.");
        Context context = null;
        this.b.b.set(null);
        if (this.d != null) {
            if (iObjectWrapper != null) {
                context = (Context) ObjectWrapper.Z1(iObjectWrapper);
            }
            zzdeo zzdeoVar = this.d.c;
            zzdeoVar.getClass();
            zzdeoVar.p0(new qc4(context, 4));
        }
    }
}
