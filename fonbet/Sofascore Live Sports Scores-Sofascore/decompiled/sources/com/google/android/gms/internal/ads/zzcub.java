package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import defpackage.ddb;
import defpackage.ewn;
import defpackage.r1c;
import defpackage.ron;
import defpackage.spn;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzcub {
    public final Context a;
    public final com.google.android.gms.ads.internal.util.zzg b;
    public final zzemm c;
    public final zzdxl d;
    public final zzhdi e;
    public final zzhdi f;
    public final ScheduledExecutorService g;
    public zzcas h;
    public zzcas i;

    public zzcub(Context context, com.google.android.gms.ads.internal.util.zzj zzjVar, zzemm zzemmVar, zzdxl zzdxlVar, zzhdi zzhdiVar, zzhdi zzhdiVar2, ScheduledExecutorService scheduledExecutorService) {
        this.a = context;
        this.b = zzjVar;
        this.c = zzemmVar;
        this.d = zzdxlVar;
        this.e = zzhdiVar;
        this.f = zzhdiVar2;
        this.g = scheduledExecutorService;
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ob));
    }

    public final ddb a(String str, Random random) {
        return TextUtils.isEmpty(str) ? zzhcy.a(str) : zzhcy.f(c(str, this.d.a, random), Throwable.class, new ron(this, str, 1), this.e);
    }

    public final ddb c(String str, MotionEvent motionEvent, Random random) {
        ddb b;
        try {
            if (!str.contains((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ob)) || this.b.zzx()) {
                return zzhcy.a(str);
            }
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Pb), String.valueOf(random.nextInt(Integer.MAX_VALUE)));
            if (motionEvent == null) {
                buildUpon.appendQueryParameter((String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Qb), "11");
                return zzhcy.a(buildUpon.toString());
            }
            zzemm zzemmVar = this.c;
            zzemmVar.getClass();
            try {
                r1c b2 = r1c.b(zzemmVar.b);
                zzemmVar.a = b2;
                b = b2 == null ? zzhcy.b(new IllegalStateException("MeasurementManagerFutures is null")) : b2.c();
            } catch (Exception e) {
                b = zzhcy.b(e);
            }
            return zzhcy.f(zzhcy.h(zzhcq.r(b), new ewn(this, buildUpon, str, motionEvent, 0), this.f), Throwable.class, new spn(2, this, buildUpon), this.e);
        } catch (Exception e2) {
            return zzhcy.b(e2);
        }
    }
}
