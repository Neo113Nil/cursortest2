package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzcwd;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzcyk;
import com.google.android.gms.internal.ads.zzdly;
import com.google.android.gms.internal.ads.zzdrb;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzfle;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzinq;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bxn extends zzcwd {
    public final Context l;
    public final View m;
    public final zzclm n;
    public final zzfle o;
    public final zzcyj p;
    public final zzdrb q;
    public final zzdly r;
    public final zzinq s;
    public final Executor t;
    public zzr u;

    public bxn(zzcyk zzcykVar, Context context, zzfle zzfleVar, View view, zzclm zzclmVar, zzcyj zzcyjVar, zzdrb zzdrbVar, zzdly zzdlyVar, zzinq zzinqVar, Executor executor) {
        super(zzcykVar);
        this.l = context;
        this.m = view;
        this.n = zzclmVar;
        this.o = zzfleVar;
        this.p = zzcyjVar;
        this.q = zzdrbVar;
        this.r = zzdlyVar;
        this.s = zzinqVar;
        this.t = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzcyl
    public final void a() {
        this.t.execute(new fsn(this, 13));
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final View c() {
        return this.m;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void d(FrameLayout frameLayout, zzr zzrVar) {
        zzclm zzclmVar;
        if (frameLayout == null || (zzclmVar = this.n) == null) {
            return;
        }
        zzclmVar.J(zzcnw.a(zzrVar));
        frameLayout.setMinimumHeight(zzrVar.zzc);
        frameLayout.setMinimumWidth(zzrVar.zzf);
        this.u = zzrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final zzea e() {
        try {
            return this.p.zza();
        } catch (zzfmd unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final zzfle f() {
        zzr zzrVar = this.u;
        if (zzrVar != null) {
            return zzrVar.zzi ? new zzfle(-3, 0, true) : new zzfle(zzrVar.zze, zzrVar.zzb, false);
        }
        zzfld zzfldVar = this.b;
        if (zzfldVar.c0) {
            for (String str : zzfldVar.a) {
                if (str == null || !str.contains("FirstParty")) {
                }
            }
            View view = this.m;
            return new zzfle(view.getWidth(), view.getHeight(), false);
        }
        return (zzfle) zzfldVar.r.get(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final zzfle g() {
        return this.o;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final int h() {
        if (((Boolean) zzba.zzc().a(zzbjg.f9)).booleanValue() && this.b.g0) {
            if (!((Boolean) zzba.zzc().a(zzbjg.g9)).booleanValue()) {
                return 0;
            }
        }
        return this.a.b.b.c;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final int i() {
        return this.a.b.b.d;
    }

    @Override // com.google.android.gms.internal.ads.zzcwd
    public final void j() {
        zzdly zzdlyVar = this.r;
        synchronized (zzdlyVar) {
            zzdlyVar.p0(pff.g);
        }
    }
}
