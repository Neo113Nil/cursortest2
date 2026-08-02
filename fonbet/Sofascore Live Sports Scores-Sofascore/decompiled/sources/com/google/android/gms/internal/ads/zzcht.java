package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.U3;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.fsn;
import defpackage.inn;
import defpackage.me4;
import defpackage.rsn;
import defpackage.ssn;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcht extends FrameLayout implements zzchk {
    public final zzcmi a;
    public final FrameLayout b;
    public final View c;
    public final zzbjv d;
    public final ssn e;
    public final long f;
    public final zzchl g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public String n;
    public String[] o;
    public Bitmap p;
    public final ImageView q;
    public boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcht(Context context, zzcmi zzcmiVar, int i, boolean z, zzbjv zzbjvVar, zzcie zzcieVar, zzeaj zzeajVar) {
        super(context);
        zzbjv zzbjvVar2;
        zzchl zzchjVar;
        zzchl zzchlVar;
        n nVar = zzcmiVar.a;
        this.a = zzcmiVar;
        this.d = zzbjvVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.t)).booleanValue()) {
            frameLayout.setBackgroundColor(-16777216);
        }
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.i(nVar.g);
        zzchm zzchmVar = nVar.g.zza;
        zzcig zzcigVar = new zzcig(context, nVar.e, nVar.B0(), zzbjvVar, nVar.J);
        if (i == 3) {
            zzchlVar = new zzclb(context, zzcigVar);
            zzbjvVar2 = zzbjvVar;
        } else {
            if (i == 2) {
                nVar.zzN().getClass();
                zzchjVar = new zzcix(context, zzcigVar, zzcmiVar, z, zzcieVar, zzeajVar);
                zzbjvVar2 = zzbjvVar;
            } else {
                zzbjvVar2 = zzbjvVar;
                zzchjVar = new zzchj(context, zzcmiVar, z, nVar.zzN().b(), new zzcig(context, nVar.e, nVar.B0(), zzbjvVar, nVar.J), zzeajVar);
            }
            zzchlVar = zzchjVar;
        }
        this.g = zzchlVar;
        View view = new View(context);
        this.c = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzchlVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y0)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v0)).booleanValue()) {
            a();
        }
        this.q = new ImageView(context);
        this.f = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A0)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.x0)).booleanValue();
        this.k = booleanValue;
        zzbjvVar2.c("spinner_used", true != booleanValue ? "0" : "1");
        this.e = new ssn(this);
        zzchlVar.i(this);
    }

    public final void a() {
        zzchl zzchlVar = this.g;
        if (zzchlVar == null) {
            return;
        }
        TextView textView = new TextView(zzchlVar.getContext());
        Resources c = com.google.android.gms.ads.internal.zzt.zzh().c();
        textView.setText(String.valueOf(c == null ? "AdMob - " : c.getString(R.string.watermark_label_prefix)).concat(zzchlVar.h()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        FrameLayout frameLayout = this.b;
        frameLayout.addView(textView, layoutParams);
        frameLayout.bringChildToFront(textView);
    }

    public final void b() {
        zzchl zzchlVar = this.g;
        if (zzchlVar == null) {
            return;
        }
        long o = zzchlVar.o();
        if (this.l == o || o <= 0) {
            return;
        }
        float f = o / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.G2)).booleanValue()) {
            c("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(zzchlVar.v()), "qoeCachedBytes", String.valueOf(zzchlVar.u()), "qoeLoadedBytes", String.valueOf(zzchlVar.t()), "droppedFrames", String.valueOf(zzchlVar.w()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().a()));
        } else {
            c("timeupdate", "time", String.valueOf(f));
        }
        this.l = o;
    }

    public final void c(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        zzchl zzchlVar = this.g;
        Integer y = zzchlVar != null ? zzchlVar.y() : null;
        if (y != null) {
            hashMap.put("playerId", y.toString());
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
        this.a.n("onVideoEvent", hashMap);
    }

    public final void d() {
        zzcmi zzcmiVar = this.a;
        if (zzcmiVar.zzj() == null || !this.i || this.j) {
            return;
        }
        zzcmiVar.zzj().getWindow().clearFlags(128);
        this.i = false;
    }

    public final void e() {
        ssn ssnVar = this.e;
        ssnVar.c = false;
        zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzgbpVar.removeCallbacks(ssnVar);
        zzgbpVar.postDelayed(ssnVar, 250L);
        zzgbpVar.post(new rsn(this, 0));
    }

    public final void f() {
        zzchl zzchlVar = this.g;
        if (zzchlVar != null && this.m == 0) {
            c("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(zzchlVar.n() / 1000.0f), "videoWidth", String.valueOf(zzchlVar.r()), "videoHeight", String.valueOf(zzchlVar.s()));
        }
    }

    public final void finalize() {
        try {
            this.e.a();
            zzchl zzchlVar = this.g;
            if (zzchlVar != null) {
                zzcgj.f.execute(new fsn(zzchlVar, 1));
            }
        } finally {
            super.finalize();
        }
    }

    public final void g() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I2)).booleanValue()) {
            ssn ssnVar = this.e;
            ssnVar.c = false;
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgbpVar.removeCallbacks(ssnVar);
            zzgbpVar.postDelayed(ssnVar, 250L);
        }
        zzcmi zzcmiVar = this.a;
        if (zzcmiVar.zzj() != null && !this.i) {
            boolean z = (zzcmiVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.j = z;
            if (!z) {
                zzcmiVar.zzj().getWindow().addFlags(128);
                this.i = true;
            }
        }
        this.h = true;
    }

    public final void h() {
        c(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        d();
        this.h = false;
    }

    public final void i() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.I2)).booleanValue()) {
            this.e.a();
        }
        c(U3.i.g0, new String[0]);
        d();
    }

    public final void j(String str, String str2) {
        c("error", "what", str, "extra", str2);
    }

    public final void k() {
        if (this.r && this.p != null) {
            ImageView imageView = this.q;
            if (imageView.getParent() == null) {
                imageView.setImageBitmap(this.p);
                imageView.invalidate();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                FrameLayout frameLayout = this.b;
                frameLayout.addView(imageView, layoutParams);
                frameLayout.bringChildToFront(imageView);
            }
        }
        this.e.a();
        this.m = this.l;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new rsn(this, 1));
    }

    public final void l(int i, int i2) {
        if (this.k) {
            inn innVar = zzbjg.z0;
            int max = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).intValue(), 1);
            int max2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(innVar)).intValue(), 1);
            Bitmap bitmap = this.p;
            if (bitmap != null && bitmap.getWidth() == max && this.p.getHeight() == max2) {
                return;
            }
            this.p = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.r = false;
        }
    }

    public final void m() {
        this.c.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new rsn(this, 2));
    }

    public final void n(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i).length();
            StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(i2).length() + 3 + String.valueOf(i3).length() + 3 + String.valueOf(i4).length());
            me4.r(sb, "Set video bounds to x:", i, ";y:", i2);
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
        this.b.setLayoutParams(layoutParams);
        requestLayout();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        ssn ssnVar = this.e;
        if (z) {
            ssnVar.c = false;
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgbpVar.removeCallbacks(ssnVar);
            zzgbpVar.postDelayed(ssnVar, 250L);
        } else {
            ssnVar.a();
            this.m = this.l;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ssn(this, z, 1));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        int i2 = 0;
        ssn ssnVar = this.e;
        if (i == 0) {
            ssnVar.c = false;
            zzgbp zzgbpVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzgbpVar.removeCallbacks(ssnVar);
            zzgbpVar.postDelayed(ssnVar, 250L);
            z = true;
        } else {
            ssnVar.a();
            this.m = this.l;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new ssn(this, z, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzchk
    public final void zzi() {
        if (this.h) {
            ImageView imageView = this.q;
            if (imageView.getParent() != null) {
                this.b.removeView(imageView);
            }
        }
        zzchl zzchlVar = this.g;
        if (zzchlVar == null || this.p == null) {
            return;
        }
        long elapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzchlVar.getBitmap(this.p) != null) {
            this.r = true;
        }
        long elapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - elapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime2).length() + 26);
            sb.append("Spinner frame grab took ");
            sb.append(elapsedRealtime2);
            sb.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        if (elapsedRealtime2 > this.f) {
            zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.k = false;
            this.p = null;
            zzbjv zzbjvVar = this.d;
            if (zzbjvVar != null) {
                zzbjvVar.c("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }
}
