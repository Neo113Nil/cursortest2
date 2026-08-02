package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.X3;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.h;
import io.sentry.SentryEvent;
import java.util.HashMap;
import java.util.Objects;
import javax.annotation.ParametersAreNonnullByDefault;
import org.apache.cordova.globalization.Globalization;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes8.dex */
public final class zzcgp extends FrameLayout implements zzcgg {
    final zzchd zza;
    private final zzchb zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbit zze;
    private final long zzf;
    private final zzcgh zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcgp(Context context, zzchb zzchbVar, int i, boolean z, zzbit zzbitVar, zzcha zzchaVar, zzdyz zzdyzVar) {
        super(context);
        zzcgh zzcgfVar;
        zzbit zzbitVar2;
        zzcgh zzcghVar;
        this.zzb = zzchbVar;
        this.zze = zzbitVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzchbVar.zzk());
        zzcgi zzcgiVar = zzchbVar.zzk().zza;
        zzchc zzchcVar = new zzchc(context, zzchbVar.zzs(), zzchbVar.zzm(), zzbitVar, zzchbVar.zzi());
        if (i == 3) {
            zzcghVar = new zzcjx(context, zzchcVar);
            zzbitVar2 = zzbitVar;
        } else {
            if (i == 2) {
                zzcgfVar = new zzcht(context, zzchcVar, zzchbVar, z, zzcgt.zza(zzchbVar), zzchaVar, zzdyzVar);
                zzbitVar2 = zzbitVar;
            } else {
                zzbitVar2 = zzbitVar;
                zzcgfVar = new zzcgf(context, zzchbVar, z, zzcgt.zza(zzchbVar), zzchaVar, new zzchc(context, zzchbVar.zzs(), zzchbVar.zzm(), zzbitVar, zzchbVar.zzi()), zzdyzVar);
            }
            zzcghVar = zzcgfVar;
        }
        this.zzg = zzcghVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcghVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzau)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzar)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzaw)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzat)).booleanValue();
        this.zzk = booleanValue;
        if (zzbitVar2 != null) {
            zzbitVar2.zzd("spinner_used", true != booleanValue ? "0" : "1");
        }
        this.zza = new zzchd(this);
        zzcghVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put("event", str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", hashMap);
    }

    private final void zzL() {
        zzchb zzchbVar = this.zzb;
        if (zzchbVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzchbVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(h.h, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcgh zzcghVar = this.zzg;
            if (zzcghVar != null) {
                zzhbs zzhbsVar = zzcff.zzf;
                Objects.requireNonNull(zzcghVar);
                zzhbsVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzcgh.this.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgp.this.zzG(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgg
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgl(this, z));
    }

    public final void zzA(int i) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzB(i);
    }

    public final void zzB(int i) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzC(i);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        TextView textView = new TextView(zzcghVar.getContext());
        Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        String string = zzf == null ? "AdMob - " : zzf.getString(R.string.watermark_label_prefix);
        String zza = zzcghVar.zza();
        String.valueOf(string);
        textView.setText(String.valueOf(string).concat(zza));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar != null) {
            zzcghVar.zzd();
        }
        zzL();
    }

    final void zzF() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        long zzh = zzcghVar.zzh();
        if (this.zzl == zzh || zzh <= 0) {
            return;
        }
        float f = zzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcB)).booleanValue()) {
            zzI("timeupdate", Globalization.TIME, String.valueOf(f), "totalBytes", String.valueOf(zzcghVar.zzo()), "qoeCachedBytes", String.valueOf(zzcghVar.zzn()), "qoeLoadedBytes", String.valueOf(zzcghVar.zzm()), "droppedFrames", String.valueOf(zzcghVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", Globalization.TIME, String.valueOf(f));
        }
        this.zzl = zzh;
    }

    final /* synthetic */ void zzG(boolean z) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgj(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzb() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar != null && this.zzm == 0) {
            zzI("canplaythrough", "duration", String.valueOf(zzcghVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzcghVar.zzk()), "videoHeight", String.valueOf(zzcghVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcD)).booleanValue()) {
            this.zza.zzb();
        }
        zzchb zzchbVar = this.zzb;
        if (zzchbVar.zzj() != null && !this.zzi) {
            boolean z = (zzchbVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                zzchbVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzd() {
        zzI("pause", new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzcD)).booleanValue()) {
            this.zza.zza();
        }
        zzI(X3.i.g0, new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzg(String str, String str2) {
        zzI(SentryEvent.JsonKeys.EXCEPTION, "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcgk(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null || this.zzp == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzcghVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbit zzbitVar = this.zze;
            if (zzbitVar != null) {
                zzbitVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbhv zzbhvVar = zzbie.zzav;
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbhvVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgg
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgp.this.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar != null) {
            return zzcghVar.zzw();
        }
        return null;
    }

    public final void zzm(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbie.zzau)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzn(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            sb.append("Set video bounds to x:");
            sb.append(i);
            sb.append(";y:");
            sb.append(i2);
            sb.append(";w:");
            sb.append(i3);
            sb.append(";h:");
            sb.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f, float f2) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar != null) {
            zzcghVar.zzj(f, f2);
        }
    }

    public final void zzq(Integer num) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzcghVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzf();
    }

    public final void zzs() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zze();
    }

    public final void zzt(int i) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzi(i);
    }

    public final void zzu() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzb.zza(true);
        zzcghVar.zzq();
    }

    public final void zzv() {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzb.zza(false);
        zzcghVar.zzq();
    }

    public final void zzw(float f) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzb.zzb(f);
        zzcghVar.zzq();
    }

    public final void zzx(int i) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzy(i);
    }

    public final void zzy(int i) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzz(i);
    }

    public final void zzz(int i) {
        zzcgh zzcghVar = this.zzg;
        if (zzcghVar == null) {
            return;
        }
        zzcghVar.zzA(i);
    }
}
