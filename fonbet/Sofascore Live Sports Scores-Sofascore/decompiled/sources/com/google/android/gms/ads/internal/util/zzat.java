package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzedl;
import com.google.android.gms.internal.ads.zzedp;
import defpackage.hsn;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzat {
    public final Context a;
    public final zzedp b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public final int h;
    public PointF i;
    public PointF j;
    public final Handler k;
    public final Runnable l;

    public zzat(Context context) {
        this.g = 0;
        this.l = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzat zzatVar = zzat.this;
                zzatVar.g = 4;
                zzatVar.zzb();
            }
        };
        this.a = context;
        this.h = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzt.zzs().zza();
        this.k = com.google.android.gms.ads.internal.zzt.zzs().zzb();
        this.b = com.google.android.gms.ads.internal.zzt.zzo().zzb();
    }

    public static final int c(String str, ArrayList arrayList, boolean z) {
        if (!z) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final boolean a(float f, float f2, float f3, float f4) {
        float abs = Math.abs(this.i.x - f);
        int i = this.h;
        return abs < ((float) i) && Math.abs(this.i.y - f2) < ((float) i) && Math.abs(this.j.x - f3) < ((float) i) && Math.abs(this.j.y - f4) < ((float) i);
    }

    public final void b(Context context) {
        ArrayList arrayList = new ArrayList();
        int c = c("None", arrayList, true);
        final int c2 = c("Shake", arrayList, true);
        final int c3 = c("Flick", arrayList, true);
        int ordinal = this.b.r.ordinal();
        final int i = ordinal != 1 ? ordinal != 2 ? c : c3 : c2;
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder zzN = zzs.zzN(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i);
        zzN.setTitle("Setup gesture");
        zzN.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                atomicInteger.set(i2);
            }
        });
        zzN.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                zzat.this.zzb();
            }
        });
        zzN.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzal
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                zzat zzatVar = zzat.this;
                zzedp zzedpVar = zzatVar.b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i) {
                    if (atomicInteger2.get() == c2) {
                        zzedpVar.h(zzedl.b, true);
                    } else if (atomicInteger2.get() == c3) {
                        zzedpVar.h(zzedl.c, true);
                    } else {
                        zzedpVar.h(zzedl.a, true);
                    }
                }
                zzatVar.zzb();
            }
        });
        zzN.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzam
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                zzat.this.zzb();
            }
        });
        zzN.create().show();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f);
        sb.append(",AFMA Version: ");
        sb.append(this.e);
        sb.append(",Ad Unit ID: ");
        return mz1.o(sb, this.d, "}");
    }

    public final void zza(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.g = 0;
            this.i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i = this.g;
        if (i == -1) {
            return;
        }
        Runnable runnable = this.l;
        Handler handler = this.k;
        if (i == 0) {
            if (actionMasked == 5) {
                this.g = 5;
                this.j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                handler.postDelayed(runnable, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.a6)).longValue());
                return;
            }
            return;
        }
        if (i == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z = false;
                for (int i2 = 0; i2 < historySize; i2++) {
                    z |= !a(motionEvent.getHistoricalX(0, i2), motionEvent.getHistoricalY(0, i2), motionEvent.getHistoricalX(1, i2), motionEvent.getHistoricalY(1, i2));
                }
                if (a(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z) {
                    return;
                }
            }
            this.g = -1;
            handler.removeCallbacks(runnable);
        }
    }

    public final void zzb() {
        try {
            Context context = this.a;
            if (!(context instanceof Activity)) {
                int i = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzt.zzo().zzi())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzt.zzo().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int c = c("Ad information", arrayList, true);
            final int c2 = c(str, arrayList, true);
            final int c3 = c(str2, arrayList, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue();
            final int c4 = c("Open ad inspector", arrayList, booleanValue);
            final int c5 = c("Ad inspector settings", arrayList, booleanValue);
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder zzN = zzs.zzN(context);
            zzN.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzad
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i2) {
                    final zzat zzatVar = zzat.this;
                    zzedp zzedpVar = zzatVar.b;
                    if (i2 != c) {
                        if (i2 == c2) {
                            int i3 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Creative Preview] selected.");
                            zzcgj.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzat zzatVar2 = zzat.this;
                                    zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
                                    Context context2 = zzatVar2.a;
                                    String str3 = zzatVar2.d;
                                    String str4 = zzatVar2.e;
                                    zzo.getClass();
                                    String b = zzax.b(context2, zzo.c(context2, (String) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.c6), str3, str4).toString(), str4);
                                    if (TextUtils.isEmpty(b)) {
                                        int i4 = zze.zza;
                                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
                                    } else {
                                        try {
                                            JSONObject jSONObject = new JSONObject(b.trim());
                                            String optString = jSONObject.optString("gct");
                                            zzo.f = jSONObject.optString("status");
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ka)).booleanValue()) {
                                                String str5 = zzo.f;
                                                boolean z = "0".equals(str5) || "2".equals(str5);
                                                zzo.zzj(z);
                                                com.google.android.gms.ads.internal.zzt.zzh().g().zzM(!z ? "" : str3);
                                            }
                                            synchronized (zzo.a) {
                                                zzo.c = optString;
                                            }
                                            String str6 = zzo.f;
                                            if ("2".equals(str6)) {
                                                int i5 = zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzd("Creative is not pushed for this device.");
                                                zzo.a(context2, "There was no creative pushed from DFP to the device.", false, false);
                                                return;
                                            } else if ("1".equals(str6)) {
                                                int i6 = zze.zza;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzd("The app is not linked for creative preview.");
                                                zzo.zzf(context2, str3, str4);
                                                return;
                                            } else {
                                                if ("0".equals(str6)) {
                                                    int i7 = zze.zza;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for in app preview.");
                                                    zzo.a(context2, "The device is successfully linked for creative preview.", false, true);
                                                    return;
                                                }
                                                return;
                                            }
                                        } catch (JSONException e) {
                                            int i8 = zze.zza;
                                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e);
                                        }
                                    }
                                    zzo.a(context2, "In-app preview failed to load because of a system error. Please try again later.", true, true);
                                }
                            });
                            return;
                        }
                        if (i2 == c3) {
                            int i4 = zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Debug mode [Troubleshooting] selected.");
                            zzcgj.a.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
                                    zzat zzatVar2 = zzat.this;
                                    String str3 = zzatVar2.d;
                                    String str4 = zzatVar2.e;
                                    String str5 = zzatVar2.f;
                                    boolean zzm = zzo.zzm();
                                    Context context2 = zzatVar2.a;
                                    zzo.zzl(zzo.zze(context2, str3, str4));
                                    if (!zzo.zzm()) {
                                        zzo.zzf(context2, str3, str4);
                                        return;
                                    }
                                    if (!zzm && !TextUtils.isEmpty(str5)) {
                                        zzo.zzh(context2, str4, str5, str3);
                                    }
                                    int i5 = zze.zza;
                                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Device is linked for debug signals.");
                                    zzo.a(context2, "The device is successfully linked for troubleshooting.", false, true);
                                }
                            });
                            return;
                        }
                        if (i2 == c4) {
                            final hsn hsnVar = zzcgj.f;
                            hsn hsnVar2 = zzcgj.a;
                            if (zzedpVar.f()) {
                                hsnVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaq
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        com.google.android.gms.ads.internal.zzt.zzo().zzc(zzat.this.a);
                                    }
                                });
                                return;
                            } else {
                                hsnVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzap
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
                                        final zzat zzatVar2 = zzat.this;
                                        Context context2 = zzatVar2.a;
                                        if (!zzo.zze(context2, zzatVar2.d, zzatVar2.e)) {
                                            com.google.android.gms.ads.internal.zzt.zzo().zzf(context2, zzatVar2.d, zzatVar2.e);
                                        } else {
                                            hsnVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    com.google.android.gms.ads.internal.zzt.zzo().zzc(zzat.this.a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i2 == c5) {
                            final hsn hsnVar3 = zzcgj.f;
                            hsn hsnVar4 = zzcgj.a;
                            if (zzedpVar.f()) {
                                hsnVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzat zzatVar2 = zzat.this;
                                        zzatVar2.b(zzatVar2.a);
                                    }
                                });
                                return;
                            } else {
                                hsnVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzar
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        zzax zzo = com.google.android.gms.ads.internal.zzt.zzo();
                                        final zzat zzatVar2 = zzat.this;
                                        Context context2 = zzatVar2.a;
                                        if (!zzo.zze(context2, zzatVar2.d, zzatVar2.e)) {
                                            com.google.android.gms.ads.internal.zzt.zzo().zzf(context2, zzatVar2.d, zzatVar2.e);
                                        } else {
                                            hsnVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    zzat zzatVar3 = zzat.this;
                                                    zzatVar3.b(zzatVar3.a);
                                                }
                                            });
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    Context context2 = zzatVar.a;
                    if (!(context2 instanceof Activity)) {
                        int i5 = zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
                        return;
                    }
                    String str3 = zzatVar.c;
                    final String str4 = "No debug information";
                    if (!TextUtils.isEmpty(str3)) {
                        Uri build = new Uri.Builder().encodedQuery(str3.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        Map zzT = zzs.zzT(build);
                        for (String str5 : zzT.keySet()) {
                            sb.append(str5);
                            sb.append(" = ");
                            sb.append((String) zzT.get(str5));
                            sb.append("\n\n");
                        }
                        String trim = sb.toString().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            str4 = trim;
                        }
                    }
                    com.google.android.gms.ads.internal.zzt.zzc();
                    AlertDialog.Builder zzN2 = zzs.zzN(context2);
                    zzN2.setMessage(str4);
                    zzN2.setTitle("Ad Information");
                    zzN2.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
                        @Override // android.content.DialogInterface.OnClickListener
                        public final /* synthetic */ void onClick(DialogInterface dialogInterface2, int i6) {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            zzs.zzY(zzat.this.a, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str4), "Share via"));
                        }
                    });
                    zzN2.setNegativeButton("Close", zzao.a);
                    zzN2.create().show();
                }
            });
            zzN.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public final void zzc(String str) {
        this.d = str;
    }

    public final void zzd(String str) {
        this.e = str;
    }

    public final void zze(String str) {
        this.c = str;
    }

    public final void zzf(String str) {
        this.f = str;
    }

    public zzat(Context context, String str) {
        this(context);
        this.c = str;
    }
}
