package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes8.dex */
public final class zzdqg {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfkm zzc;
    private final zzdpm zzd;
    private final zzdph zze;
    private final zzdqu zzf;
    private final zzdrc zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzblh zzj;
    private final zzdpe zzk;

    public zzdqg(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfkm zzfkmVar, zzdpm zzdpmVar, zzdph zzdphVar, zzdqu zzdquVar, zzdrc zzdrcVar, Executor executor, Executor executor2, zzdpe zzdpeVar) {
        this.zzb = zzgVar;
        this.zzc = zzfkmVar;
        this.zzj = zzfkmVar.zzj;
        this.zzd = zzdpmVar;
        this.zze = zzdphVar;
        this.zzf = zzdquVar;
        this.zzg = zzdrcVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdpeVar;
    }

    private final boolean zzi(ViewGroup viewGroup, boolean z) {
        View zzJ = z ? this.zze.zzJ() : this.zze.zzK();
        if (zzJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzJ.getParent()).removeView(zzJ);
        }
        viewGroup.addView(zzJ, ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeK)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final void zza(final zzdre zzdreVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqf
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdqg.this.zzf(zzdreVar);
            }
        });
    }

    public final void zzb(zzdre zzdreVar) {
        zzdqu zzdquVar;
        if (zzdreVar == null || (zzdquVar = this.zzf) == null || zzdreVar.zzdA() == null || !this.zzd.zzb()) {
            return;
        }
        try {
            zzdreVar.zzdA().addView(zzdquVar.zza());
        } catch (zzckx e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzc(zzdre zzdreVar) {
        if (zzdreVar == null) {
            return;
        }
        Context context = zzdreVar.zzdF().getContext();
        if (com.google.android.gms.ads.internal.util.zzbs.zzi(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Activity context is needed for policy validator.");
                return;
            }
            zzdrc zzdrcVar = this.zzg;
            if (zzdrcVar == null || zzdreVar.zzdA() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(zzdrcVar.zza(zzdreVar.zzdA(), windowManager), com.google.android.gms.ads.internal.util.zzbs.zzk());
            } catch (zzckx e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final boolean zzd(ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }

    public final boolean zze(ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    final /* synthetic */ void zzf(zzdre zzdreVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzblp zza2;
        Drawable drawable;
        zzdpm zzdpmVar = this.zzd;
        if (zzdpmVar.zze() || zzdpmVar.zzc()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i = 0; i < 2; i++) {
                View zzl = zzdreVar.zzl(strArr[i]);
                if (zzl instanceof ViewGroup) {
                    viewGroup = (ViewGroup) zzl;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdreVar.zzdF().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdph zzdphVar = this.zze;
        if (zzdphVar.zzA() != null) {
            view = zzdphVar.zzA();
            zzblh zzblhVar = this.zzj;
            if (zzblhVar != null && viewGroup == null) {
                zzh(layoutParams, zzblhVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdphVar.zzz() instanceof zzbla) {
            zzbla zzblaVar = (zzbla) zzdphVar.zzz();
            if (viewGroup == null) {
                zzh(layoutParams, zzblaVar.zzi());
                viewGroup = null;
            }
            View zzblbVar = new zzblb(context, zzblaVar, layoutParams);
            zzblbVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzeI));
            view = zzblbVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdreVar.zzdF().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzdA = zzdreVar.zzdA();
                if (zzdA != null) {
                    zzdA.addView(zzaVar);
                }
            }
            zzdreVar.zzh(zzdreVar.zzm(), view, true);
        }
        zzgvz zzgvzVar = zzdqc.zza;
        int size = zzgvzVar.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzl2 = zzdreVar.zzl((String) zzgvzVar.get(i2));
            i2++;
            if (zzl2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzl2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdqe
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdqg.this.zzg(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            if (zzdphVar.zzT() != null) {
                zzdphVar.zzT().zzaq(new zzdqd(zzdreVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzlt)).booleanValue() && zzi(viewGroup2, false)) {
            if (zzdphVar.zzU() != null) {
                zzdphVar.zzU().zzaq(new zzdqd(zzdreVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzdF = zzdreVar.zzdF();
        Context context2 = zzdF != null ? zzdF.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzg = zza2.zzg();
            if (zzg == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzg)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzn = zzdreVar.zzn();
            if (zzn == null || !((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzhg)).booleanValue()) {
                imageView.setScaleType(zza);
            } else {
                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzn));
            }
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not get main image drawable");
        }
    }

    final /* synthetic */ void zzg(ViewGroup viewGroup) {
        zzdph zzdphVar = this.zze;
        if (zzdphVar.zzJ() != null) {
            boolean z = viewGroup != null;
            if (zzdphVar.zzx() == 2 || zzdphVar.zzx() == 1) {
                this.zzb.zzr(this.zzc.zzg, String.valueOf(zzdphVar.zzx()), z);
            } else if (zzdphVar.zzx() == 6) {
                com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
                String str = this.zzc.zzg;
                zzgVar.zzr(str, "2", z);
                zzgVar.zzr(str, "1", z);
            }
        }
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i) {
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
}
