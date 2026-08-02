package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzblf;
import com.google.android.gms.internal.ads.zzbvq;
import defpackage.a70;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzek {
    public final zzbvq a;
    public final zzq b;
    public final AtomicBoolean c;
    public final VideoController d;
    public final zzaz e;
    public zza f;
    public AdListener g;
    public AdSize[] h;
    public AppEventListener i;
    public zzbu j;
    public VideoOptions k;
    public String l;
    public final ViewGroup m;
    public final int n;
    public boolean o;
    public OnPaidEventListener p;
    public final AtomicLong q;

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, zzq zzqVar, int i) {
        zzr zzrVar;
        this.a = new zzbvq();
        this.d = new VideoController();
        this.e = new zzei(this);
        this.q = new AtomicLong();
        this.m = viewGroup;
        this.b = zzqVar;
        this.j = null;
        this.c = new AtomicBoolean(false);
        this.n = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzz zzzVar = new zzz(context, attributeSet);
                this.h = zzzVar.zza(z);
                this.l = zzzVar.zzb();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zza = zzay.zza();
                    AdSize adSize = this.h[0];
                    if (adSize.equals(AdSize.INVALID)) {
                        zzrVar = new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
                    } else {
                        zzrVar = new zzr(context, adSize);
                        zzrVar.zzj = i == 1;
                    }
                    zza.zzc(viewGroup, zzrVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzay.zza().zzb(viewGroup, new zzr(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }

    public static zzr a(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzr("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false, false);
            }
        }
        zzr zzrVar = new zzr(context, adSizeArr);
        zzrVar.zzj = i == 1;
        return zzrVar;
    }

    public final void zzA(VideoOptions videoOptions) {
        this.k = videoOptions;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzF(videoOptions == null ? null : new zzfw(videoOptions));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final VideoOptions zzB() {
        return this.k;
    }

    public final boolean zzC(zzbu zzbuVar) {
        try {
            IObjectWrapper zza = zzbuVar.zza();
            if (zza == null || ((View) ObjectWrapper.Z1(zza)).getParent() != null) {
                return false;
            }
            this.m.addView((View) ObjectWrapper.Z1(zza));
            this.j = zzbuVar;
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final void zza() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzb();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final AdListener zzb() {
        return this.g;
    }

    @Nullable
    public final AdSize zzc() {
        zzr zzm;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null && (zzm = zzbuVar.zzm()) != null) {
                return com.google.android.gms.ads.zzc.zza(zzm.zze, zzm.zzb, zzm.zza);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.h;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    public final AdSize[] zzd() {
        return this.h;
    }

    public final String zze() {
        zzbu zzbuVar;
        if (this.l == null && (zzbuVar = this.j) != null) {
            try {
                this.l = zzbuVar.zzt();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.l;
    }

    @Nullable
    public final AppEventListener zzf() {
        return this.i;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x004b, B:14:0x0055, B:16:0x0059, B:17:0x0063, B:19:0x0067, B:20:0x0073, B:35:0x00c8, B:37:0x00cc, B:38:0x00d3, B:40:0x00d4, B:43:0x00e3, B:44:0x00ea, B:46:0x00ee, B:48:0x00f6, B:49:0x00fd, B:52:0x010c, B:23:0x008b, B:25:0x0091, B:27:0x009f, B:29:0x00b1, B:30:0x00be), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x004b, B:14:0x0055, B:16:0x0059, B:17:0x0063, B:19:0x0067, B:20:0x0073, B:35:0x00c8, B:37:0x00cc, B:38:0x00d3, B:40:0x00d4, B:43:0x00e3, B:44:0x00ea, B:46:0x00ee, B:48:0x00f6, B:49:0x00fd, B:52:0x010c, B:23:0x008b, B:25:0x0091, B:27:0x009f, B:29:0x00b1, B:30:0x00be), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067 A[Catch: RemoteException -> 0x0015, TryCatch #1 {RemoteException -> 0x0015, blocks: (B:3:0x0002, B:6:0x000c, B:8:0x0010, B:11:0x001b, B:13:0x004b, B:14:0x0055, B:16:0x0059, B:17:0x0063, B:19:0x0067, B:20:0x0073, B:35:0x00c8, B:37:0x00cc, B:38:0x00d3, B:40:0x00d4, B:43:0x00e3, B:44:0x00ea, B:46:0x00ee, B:48:0x00f6, B:49:0x00fd, B:52:0x010c, B:23:0x008b, B:25:0x0091, B:27:0x009f, B:29:0x00b1, B:30:0x00be), top: B:2:0x0002, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(zzeh zzehVar) {
        zza zzaVar;
        AppEventListener appEventListener;
        zzbu zzbuVar;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            zzbu zzbuVar2 = this.j;
            ViewGroup viewGroup = this.m;
            if (zzbuVar2 == null) {
                if (this.h != null) {
                    if (this.l == null) {
                    }
                    Context context = viewGroup.getContext();
                    zzbu zzbuVar3 = (zzbu) new zzal(zzay.zzb(), context, a(context, this.h, this.n), this.l, this.a).zzd(context, false);
                    this.j = zzbuVar3;
                    zzbuVar3.zzg(new zzg(this.e));
                    zzaVar = this.f;
                    if (zzaVar != null) {
                        this.j.zzx(new zzb(zzaVar));
                    }
                    appEventListener = this.i;
                    if (appEventListener != null) {
                        this.j.zzdU(new zzbfv(appEventListener));
                    }
                    if (this.k != null) {
                        this.j.zzF(new zzfw(this.k));
                    }
                    this.j.zzO(new zzfo(this.p));
                    this.j.zzy(this.o);
                    zzbuVar = this.j;
                    if (zzbuVar != null) {
                        try {
                            final IObjectWrapper zza = zzbuVar.zza();
                            if (zza != null) {
                                if (((Boolean) zzblf.f.c()).booleanValue()) {
                                    if (((Boolean) zzba.zzc().a(zzbjg.Oc)).booleanValue()) {
                                        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                            @Override // java.lang.Runnable
                                            public final /* synthetic */ void run() {
                                                zzek.this.m.addView((View) ObjectWrapper.Z1(zza));
                                            }
                                        });
                                    }
                                }
                                viewGroup.addView((View) ObjectWrapper.Z1(zza));
                            }
                        } catch (RemoteException e) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                        }
                    }
                }
                if (zzbuVar2 == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context2 = viewGroup.getContext();
                zzbu zzbuVar32 = (zzbu) new zzal(zzay.zzb(), context2, a(context2, this.h, this.n), this.l, this.a).zzd(context2, false);
                this.j = zzbuVar32;
                zzbuVar32.zzg(new zzg(this.e));
                zzaVar = this.f;
                if (zzaVar != null) {
                }
                appEventListener = this.i;
                if (appEventListener != null) {
                }
                if (this.k != null) {
                }
                this.j.zzO(new zzfo(this.p));
                this.j.zzy(this.o);
                zzbuVar = this.j;
                if (zzbuVar != null) {
                }
            }
            zzehVar.zzp(currentTimeMillis);
            long zzr = zzehVar.zzr();
            AtomicLong atomicLong = this.q;
            if (zzr != 0) {
                atomicLong.set(zzehVar.zzr());
            }
            zzbu zzbuVar4 = this.j;
            if (zzbuVar4 == null) {
                throw null;
            }
            if (atomicLong.get() != 0) {
                zzbuVar4.zzS(atomicLong.get());
            }
            zzbuVar4.zzd(this.b.zza(viewGroup.getContext(), zzehVar));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzh() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzi() {
        if (this.c.getAndSet(true)) {
            return;
        }
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzl();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzj() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzf();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzk(AdListener adListener) {
        this.g = adListener;
        this.e.zza(adListener);
    }

    public final void zzl(@Nullable zza zzaVar) {
        try {
            this.f = zzaVar;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzx(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzm(AdSize... adSizeArr) {
        if (this.h == null) {
            zzn(adSizeArr);
        } else {
            a70.r("The ad size can only be set once on AdView.");
        }
    }

    public final void zzn(AdSize... adSizeArr) {
        ViewGroup viewGroup = this.m;
        this.h = adSizeArr;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzn(a(viewGroup.getContext(), this.h, this.n));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        viewGroup.requestLayout();
    }

    public final void zzo(String str) {
        if (this.l == null) {
            this.l = str;
        } else {
            a70.r("The ad unit ID can only be set once on AdView.");
        }
    }

    public final void zzp(@Nullable AppEventListener appEventListener) {
        try {
            this.i = appEventListener;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzdU(appEventListener != null ? new zzbfv(appEventListener) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(boolean z) {
        this.o = z;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzy(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzr() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                return zzbuVar.zzz();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzs() {
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                return zzbuVar.zzA();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    @Nullable
    public final ResponseInfo zzt() {
        zzdx zzdxVar = null;
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzdxVar = zzbuVar.zzs();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdxVar);
    }

    public final void zzu(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.p = onPaidEventListener;
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzO(new zzfo(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final long zzv() {
        AtomicLong atomicLong = this.q;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                atomicLong.set(zzbuVar.zzT());
                return atomicLong.get();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return 0L;
    }

    public final void zzw(long j) {
        this.q.set(j);
        try {
            zzbu zzbuVar = this.j;
            if (zzbuVar != null) {
                zzbuVar.zzS(j);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Nullable
    public final OnPaidEventListener zzx() {
        return this.p;
    }

    public final VideoController zzy() {
        return this.d;
    }

    @Nullable
    public final zzea zzz() {
        zzbu zzbuVar = this.j;
        if (zzbuVar != null) {
            try {
                return zzbuVar.zzE();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzq.zza, 0);
    }

    public zzek(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzq.zza, i);
    }

    public zzek(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzq.zza, i);
    }
}
