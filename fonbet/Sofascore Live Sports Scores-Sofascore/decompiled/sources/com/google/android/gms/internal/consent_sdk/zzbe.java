package com.google.android.gms.internal.consent_sdk;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Window;
import com.ironsource.Ua;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.bea;
import defpackage.nfk;
import defpackage.ng2;
import defpackage.ofk;
import defpackage.oln;
import defpackage.p7f;
import defpackage.vln;
import defpackage.zhg;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbe {
    public final Application a;
    public final zzbz b;
    public final zzaq c;
    public final zzbs d;
    public final zzby e;
    public final zzcr f;
    public Dialog g;
    public zzbx h;
    public final AtomicBoolean i = new AtomicBoolean();
    public final AtomicReference j = new AtomicReference();
    public final AtomicReference k = new AtomicReference();
    public final AtomicReference l = new AtomicReference();
    public boolean m = false;
    public boolean n = false;

    public zzbe(Application application, zzbz zzbzVar, zzaq zzaqVar, zzbs zzbsVar, zzby zzbyVar, zzcr zzcrVar) {
        this.a = application;
        this.b = zzbzVar;
        this.c = zzaqVar;
        this.d = zzbsVar;
        this.e = zzbyVar;
        this.f = zzcrVar;
    }

    public final void a(Activity activity, p7f p7fVar) {
        zzcz.a();
        ((Queue) this.f.h.get()).add(Long.valueOf(System.currentTimeMillis()));
        if (!this.i.compareAndSet(false, true)) {
            zzg zzgVar = new zzg(3, true != this.m ? "ConsentForm#show can only be invoked once." : "Privacy options form is being loading. Please try again later.");
            d(zzgVar);
            zzgVar.d();
            p7fVar.a();
            return;
        }
        zzbx zzbxVar = this.h;
        final ng2 ng2Var = zzbxVar.b;
        zzbxVar.a.post(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzbu
            @Override // java.lang.Runnable
            public final void run() {
                ng2 ng2Var2 = ng2.this;
                ((Executor) ng2Var2.d).execute(new zzcc(ng2Var2));
            }
        });
        oln olnVar = new oln(this, activity);
        this.a.registerActivityLifecycleCallbacks(olnVar);
        this.l.set(olnVar);
        this.b.a = activity;
        Dialog dialog = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
        dialog.setContentView(this.h);
        dialog.setCancelable(false);
        Window window = dialog.getWindow();
        if (window == null) {
            zzg zzgVar2 = new zzg(3, "Activity with null windows is passed in.");
            d(zzgVar2);
            zzgVar2.d();
            p7fVar.a();
            return;
        }
        window.setLayout(-1, -1);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setFlags(C.DEFAULT_MUXED_BUFFER_SIZE, C.DEFAULT_MUXED_BUFFER_SIZE);
        bea.L(window, false);
        this.k.set(p7fVar);
        dialog.show();
        this.g = dialog;
        this.h.a("UMP_messagePresented", "");
        d(null);
    }

    public final void b(ofk ofkVar, nfk nfkVar) {
        zzby zzbyVar = this.e;
        zzbz zzbzVar = (zzbz) zzbyVar.a.zzb();
        Handler handler = zzcz.a;
        zztj.a(handler);
        this.h = new zzbx(zzbzVar, handler, zzbyVar.b.zzb());
        boolean z = this.m;
        zzcr zzcrVar = this.f;
        if (!z) {
            ((Queue) zzcrVar.j.get()).add(Long.valueOf(System.currentTimeMillis()));
        }
        zzbx zzbxVar = this.h;
        zzbxVar.setBackgroundColor(0);
        zzbxVar.getSettings().setJavaScriptEnabled(true);
        zzbxVar.getSettings().setAllowFileAccess(false);
        zzbxVar.getSettings().setAllowContentAccess(false);
        zzbxVar.setWebViewClient(new zhg(zzbxVar));
        if (!this.m) {
            zzcrVar.a((Queue) zzcrVar.j.get(), 3, 2, null);
        }
        this.j.set(new vln(ofkVar, nfkVar));
        zzbx zzbxVar2 = this.h;
        zzbs zzbsVar = this.d;
        zzbxVar2.loadDataWithBaseURL(zzbsVar.a, zzbsVar.b, "text/html", C.UTF8_NAME, null);
        handler.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zzba
            @Override // java.lang.Runnable
            public final void run() {
                zzbe.this.c(new zzg(4, "Web view timed out."));
            }
        }, Ua.s);
    }

    public final void c(zzg zzgVar) {
        vln vlnVar = (vln) this.j.getAndSet(null);
        if (vlnVar == null) {
            return;
        }
        if (!this.m) {
            String message = zzgVar.getMessage();
            boolean z = this.n;
            zzcr zzcrVar = this.f;
            if (z) {
                zzcrVar.a((Queue) zzcrVar.i.get(), 10, 11, message);
            } else {
                zzcrVar.a((Queue) zzcrVar.g.get(), 4, 5, message);
            }
        }
        vlnVar.f(zzgVar.d());
    }

    public final void d(zzg zzgVar) {
        if (this.m) {
            return;
        }
        String message = zzgVar == null ? null : zzgVar.getMessage();
        boolean z = this.n;
        zzcr zzcrVar = this.f;
        if (z) {
            zzcrVar.a((Queue) zzcrVar.i.get(), 10, 11, message);
        } else {
            zzcrVar.a((Queue) zzcrVar.h.get(), 6, 7, message);
        }
    }
}
