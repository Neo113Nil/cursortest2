package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import defpackage.g3g;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzcjs implements Releasable {
    public final Context a;
    public final String b;
    public final WeakReference c;

    public zzcjs(zzcif zzcifVar) {
        Context context = zzcifVar.getContext();
        this.a = context;
        this.b = com.google.android.gms.ads.internal.zzt.zzc().zze(context, zzcifVar.zzs().afmaVersion);
        this.c = new WeakReference(zzcifVar);
    }

    public abstract boolean g(String str);

    public boolean h(String str, String[] strArr) {
        return g(str);
    }

    public boolean i(String str, String[] strArr, zzcjk zzcjkVar) {
        return g(str);
    }

    public abstract void o();

    public final void p(String str, String str2, String str3, String str4) {
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new g3g(this, str, str2, str3, str4, 2));
    }

    public final /* synthetic */ void q(HashMap hashMap) {
        zzcif zzcifVar = (zzcif) this.c.get();
        if (zzcifVar != null) {
            zzcifVar.n("onPrecacheEvent", hashMap);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public void j(int i) {
    }

    public void k(int i) {
    }

    public void l(int i) {
    }

    public void n(int i) {
    }
}
