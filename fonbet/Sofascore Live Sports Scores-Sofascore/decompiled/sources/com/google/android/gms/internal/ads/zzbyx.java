package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.client.zzo;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbyx extends zzbyy implements zzbqh {
    public final zzclm c;
    public final Context d;
    public final WindowManager e;
    public final zzbin f;
    public DisplayMetrics g;
    public float h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;

    public zzbyx(zzclm zzclmVar, Context context, zzbin zzbinVar) {
        super(zzclmVar, "");
        this.i = -1;
        this.j = -1;
        this.l = -1;
        this.m = -1;
        this.n = -1;
        this.o = -1;
        this.c = zzclmVar;
        this.d = context;
        this.f = zzbinVar;
        this.e = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        JSONObject jSONObject;
        this.g = new DisplayMetrics();
        Display defaultDisplay = this.e.getDefaultDisplay();
        defaultDisplay.getMetrics(this.g);
        this.h = this.g.density;
        this.k = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zza();
        DisplayMetrics displayMetrics = this.g;
        this.i = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zza();
        DisplayMetrics displayMetrics2 = this.g;
        this.j = com.google.android.gms.ads.internal.util.client.zzf.zzC(displayMetrics2, displayMetrics2.heightPixels);
        zzclm zzclmVar = this.c;
        Activity zzj = zzclmVar.zzj();
        if (zzj == null || zzj.getWindow() == null) {
            this.l = this.i;
            this.m = this.j;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] zzV = com.google.android.gms.ads.internal.util.zzs.zzV(zzj);
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.l = com.google.android.gms.ads.internal.util.client.zzf.zzC(this.g, zzV[0]);
            com.google.android.gms.ads.internal.client.zzay.zza();
            this.m = com.google.android.gms.ads.internal.util.client.zzf.zzC(this.g, zzV[1]);
        }
        if (zzclmVar.zzN().b()) {
            this.n = this.i;
            this.o = this.j;
        } else {
            zzclmVar.measure(0, 0);
        }
        e(this.i, this.j, this.l, this.m, this.k, this.h);
        zzbyw zzbywVar = new zzbyw();
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbin zzbinVar = this.f;
        zzbywVar.b = zzbinVar.b(intent);
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbywVar.a = zzbinVar.b(intent2);
        zzbywVar.c = zzbinVar.b(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
        boolean a = zzbinVar.a();
        boolean z = zzbywVar.a;
        boolean z2 = zzbywVar.b;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", zzbywVar.c).put("storePicture", a).put("inlineVideo", true);
        } catch (JSONException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzclmVar.t("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        zzclmVar.getLocationOnScreen(iArr);
        com.google.android.gms.ads.internal.util.client.zzf zza = com.google.android.gms.ads.internal.client.zzay.zza();
        int i2 = iArr[0];
        Context context = this.d;
        f(zza.zza(context, i2), com.google.android.gms.ads.internal.client.zzay.zza().zza(context, iArr[1]));
        if (zzo.zzm(2)) {
            zzo.zzh("Dispatching Ready Event.");
        }
        try {
            this.a.t("onReadyEventReceived", new JSONObject().put("js", zzclmVar.zzs().afmaVersion));
        } catch (JSONException e2) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching ready Event.", e2);
        }
    }

    public final void f(int i, int i2) {
        int i3;
        Context context = this.d;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzc();
            i3 = com.google.android.gms.ads.internal.util.zzs.zzW((Activity) context)[0];
        } else {
            i3 = 0;
        }
        zzclm zzclmVar = this.c;
        if (zzclmVar.zzN() == null || !zzclmVar.zzN().b()) {
            int width = zzclmVar.getWidth();
            int height = zzclmVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.J0)).booleanValue()) {
                if (width == 0) {
                    width = zzclmVar.zzN() != null ? zzclmVar.zzN().c : 0;
                }
                if (height == 0) {
                    if (zzclmVar.zzN() != null) {
                        i4 = zzclmVar.zzN().b;
                    }
                    this.n = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, width);
                    this.o = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, i4);
                }
            }
            i4 = height;
            this.n = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, width);
            this.o = com.google.android.gms.ads.internal.client.zzay.zza().zza(context, i4);
        }
        try {
            this.a.t("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2 - i3).put("width", this.n).put("height", this.o));
        } catch (JSONException e) {
            int i5 = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error occurred while dispatching default position.", e);
        }
        zzbys zzbysVar = zzclmVar.zzP().x;
        if (zzbysVar != null) {
            zzbysVar.e = i;
            zzbysVar.f = i2;
        }
    }
}
