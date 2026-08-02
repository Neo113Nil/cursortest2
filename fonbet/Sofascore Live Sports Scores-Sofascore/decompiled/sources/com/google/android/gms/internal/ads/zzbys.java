package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.ironsource.U3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import defpackage.gh0;
import defpackage.wh0;
import java.util.Collections;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbys extends zzbyy {
    public String c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Object k;
    public final zzclm l;
    public final Activity m;
    public zzcnw n;
    public ImageView o;
    public LinearLayout p;
    public final zzbyz q;
    public PopupWindow r;
    public RelativeLayout s;
    public ViewGroup t;

    static {
        String[] strArr = {U3.e.c, U3.e.b, "top-center", TtmlNode.CENTER, U3.e.e, U3.e.d, "bottom-center"};
        gh0 gh0Var = new gh0(7);
        Collections.addAll(gh0Var, strArr);
        Collections.unmodifiableSet(gh0Var);
    }

    public zzbys(zzclm zzclmVar, zzbyz zzbyzVar) {
        super(zzclmVar, "resize");
        this.c = U3.e.b;
        this.d = true;
        this.e = 0;
        this.f = 0;
        this.g = -1;
        this.h = 0;
        this.i = 0;
        this.j = -1;
        this.k = new Object();
        this.l = zzclmVar;
        this.m = zzclmVar.zzj();
        this.q = zzbyzVar;
    }

    public final void f(boolean z) {
        synchronized (this.k) {
            try {
                if (this.r != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.vc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        g(z);
                    } else {
                        zzcgj.f.submit(new wh0(this, z, 5));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(boolean z) {
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.wc)).booleanValue();
        zzclm zzclmVar = this.l;
        if (booleanValue) {
            this.s.removeView((View) zzclmVar);
            this.r.dismiss();
        } else {
            this.r.dismiss();
            this.s.removeView((View) zzclmVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.xc)).booleanValue()) {
            View view = (View) zzclmVar;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.t;
        if (viewGroup != null) {
            viewGroup.removeView(this.o);
            boolean booleanValue2 = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.yc)).booleanValue();
            ViewGroup viewGroup2 = this.t;
            if (booleanValue2) {
                try {
                    viewGroup2.addView((View) zzclmVar);
                    zzclmVar.J(this.n);
                } catch (IllegalStateException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    zzo.zzg("Unable to add webview back to view hierarchy.", e);
                    com.google.android.gms.ads.internal.zzt.zzh().d("MraidCallResizeHandler.collapseInternal", e);
                }
            } else {
                viewGroup2.addView((View) zzclmVar);
                zzclmVar.J(this.n);
            }
        }
        if (z) {
            d(BuildConfig.FLAVOR);
            zzbyz zzbyzVar = this.q;
            if (zzbyzVar != null) {
                zzbyzVar.zzb();
            }
        }
        this.r = null;
        this.s = null;
        this.t = null;
        this.p = null;
    }
}
