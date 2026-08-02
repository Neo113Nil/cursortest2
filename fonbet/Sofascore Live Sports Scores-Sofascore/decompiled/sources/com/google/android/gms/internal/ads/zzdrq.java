package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.util.client.zzo;
import defpackage.hsn;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdrq {
    public static final ImageView.ScaleType k = ImageView.ScaleType.CENTER_INSIDE;
    public final com.google.android.gms.ads.internal.util.zzg a;
    public final zzflw b;
    public final zzdqw c;
    public final zzdqr d;
    public final zzdse e;
    public final zzdsm f;
    public final Executor g;
    public final hsn h;
    public final zzbmk i;
    public final zzdqo j;

    public zzdrq(com.google.android.gms.ads.internal.util.zzj zzjVar, zzflw zzflwVar, zzdqw zzdqwVar, zzdqr zzdqrVar, zzdse zzdseVar, zzdsm zzdsmVar, Executor executor, hsn hsnVar, zzdqo zzdqoVar) {
        this.a = zzjVar;
        this.b = zzflwVar;
        this.i = zzflwVar.j;
        this.c = zzdqwVar;
        this.d = zzdqrVar;
        this.e = zzdseVar;
        this.f = zzdsmVar;
        this.g = executor;
        this.h = hsnVar;
        this.j = zzdqoVar;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(zzdso zzdsoVar) {
        if (zzdsoVar == null) {
            return;
        }
        Context context = zzdsoVar.l2().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.c.a)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdsm zzdsmVar = this.f;
            if (zzdsmVar == null || zzdsoVar.S1() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdsmVar.a(zzdsoVar.S1(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzcmb e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z) {
        View view;
        zzdqr zzdqrVar = this.d;
        if (z) {
            synchronized (zzdqrVar) {
                view = zzdqrVar.o;
            }
        } else {
            synchronized (zzdqrVar) {
                view = zzdqrVar.p;
            }
        }
        if (view == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        viewGroup.addView(view, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.S4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
