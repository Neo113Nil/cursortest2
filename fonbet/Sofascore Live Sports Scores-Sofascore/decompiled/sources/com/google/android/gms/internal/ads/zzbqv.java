package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.core.network.model.HttpRequest;
import defpackage.ddb;
import defpackage.fgd;
import defpackage.g7h;
import defpackage.hsn;
import defpackage.k4o;
import defpackage.njo;
import defpackage.u0a;
import defpackage.vlo;
import defpackage.x6k;
import defpackage.yhk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzbqv implements zzbqh {
    public final com.google.android.gms.ads.internal.zzb a;
    public final zzeaj b;
    public final zzbys d;
    public final zzele e;
    public final zzcub f;
    public final zzdcq g;
    public final zzdcg h;
    public zzu c = null;
    public com.google.android.gms.ads.internal.overlay.zzaa i = null;
    public final hsn j = zzcgj.h;

    public zzbqv(com.google.android.gms.ads.internal.zzb zzbVar, zzbys zzbysVar, zzele zzeleVar, zzeaj zzeajVar, zzcub zzcubVar, zzdcq zzdcqVar, zzdcg zzdcgVar) {
        this.a = zzbVar;
        this.d = zzbysVar;
        this.e = zzeleVar;
        this.b = zzeajVar;
        this.f = zzcubVar;
        this.g = zzdcqVar;
        this.h = zzdcgVar;
    }

    public static int b(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if (TtmlNode.TAG_P.equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return com.mbridge.msdk.foundation.controller.a.q.equalsIgnoreCase(str) ? 14 : -1;
    }

    public static Uri c(Context context, zzbbd zzbbdVar, Uri uri, View view, Activity activity, zzfma zzfmaVar) {
        if (zzbbdVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hd)).booleanValue() || zzfmaVar == null) {
                    if (zzbbdVar.c(uri)) {
                        return zzbbdVar.b(uri, context, view, activity);
                    }
                } else if (zzbbdVar.c(uri)) {
                    return zzfmaVar.a(uri, context, view, activity);
                }
            } catch (zzbbe unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzh().d("OpenGmsgHandler.maybeAddClickSignalsToUri", e);
            }
        }
        return uri;
    }

    public static Uri d(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            String valueOf = String.valueOf(uri.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzg("Error adding click uptime parameter to url: ".concat(valueOf), e);
            return uri;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbqh
    public final void a(Object obj, Map map) {
        zzcub zzcubVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map hashMap = new HashMap();
        zzclm zzclmVar = (zzclm) zzaVar;
        if (zzclmVar.e() != null) {
            hashMap = zzclmVar.e().w0;
        }
        String a = zzcet.a(str, zzclmVar.getContext(), true, hashMap);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.a;
        if (zzbVar != null && !zzbVar.zzb()) {
            zzbVar.zzc(a);
        } else {
            ddb a2 = (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Hb)).booleanValue() && (zzcubVar = this.f) != null && zzcub.b(a)) ? zzcubVar.a(a, com.google.android.gms.ads.internal.client.zzay.zzh()) : zzhcy.a(a);
            a2.addListener(new vlo(0, a2, new g7h(this, map, zzaVar, str2)), this.j);
        }
    }

    public final /* synthetic */ void e(String str, Bundle bundle, String str2) {
        zzeaj zzeajVar = this.b;
        if (zzeajVar == null) {
            return;
        }
        String encodeToString = bundle != null ? Base64.encodeToString(com.google.android.gms.ads.internal.client.zzay.zza().zzn(bundle, new JSONObject()).toString().getBytes(), 1) : null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.Ee)).booleanValue()) {
            zzeai a = zzeajVar.a();
            a.b("action", str);
            if (str2 != null) {
                a.b("gqi", str2);
            }
            if (encodeToString != null) {
                a.b("hsoe", encodeToString);
            }
            a.e();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.U9)).booleanValue() != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ee, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.P9)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.O9)).booleanValue()) != false) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(com.google.android.gms.ads.internal.client.zza zzaVar, Context context, String str, String str2) {
        Context context2;
        String str3;
        zzbzz zzbzzVar;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar;
        zzele zzeleVar = this.e;
        zzeaj zzeajVar = this.b;
        if (zzeajVar != null) {
            int i = zzelp.i;
            context2 = context;
            str3 = str2;
            zzelp.F4(context2, zzeajVar, zzeleVar, str3, "offline_open", new HashMap());
        } else {
            context2 = context;
            str3 = str2;
        }
        if (com.google.android.gms.ads.internal.zzt.zzh().i(context2)) {
            zzu zzuVar = this.c;
            if (zzuVar == null) {
                zzuVar = new zzu(context2.getApplicationContext(), null);
                this.c = zzuVar;
            }
            zzeleVar.getClass();
            zzeleVar.e(new x6k(zzeleVar, zzuVar, str3));
            return false;
        }
        zzclm zzclmVar = (zzclm) zzaVar;
        zzfld e = zzclmVar.e();
        boolean z = (e == null || (zzwVar = e.y0) == null || zzwVar.zzc()) ? false : true;
        boolean z2 = (e == null || (zzbzzVar = e.d0) == null || !zzbzzVar.a || zzbzzVar.b == null || !zzbzzVar.c) ? false : true;
        if (!z) {
            if (z2) {
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzbo zzC = com.google.android.gms.ads.internal.util.zzs.zzC(context2);
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean areNotificationsEnabled = new fgd(context2).b.areNotificationsEnabled();
            boolean zzf = com.google.android.gms.ads.internal.zzt.zzf().zzf(context2, "offline_notification_channel");
            boolean z3 = zzclmVar.zzN().b() && zzclmVar.zzj() == null;
            if (!areNotificationsEnabled) {
                com.google.android.gms.ads.internal.zzt.zzc();
                if (!new fgd(context2).b.areNotificationsEnabled()) {
                }
                g(context2, str3, "notifications_disabled");
                return false;
            }
            if (zzf) {
                g(context2, str3, "notification_channel_disabled");
                return false;
            }
            if (zzC == null) {
                g(context2, str3, "work_manager_unavailable");
                return false;
            }
            if (z3) {
                g(context2, str3, "ad_no_activity");
                return false;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.M9)).booleanValue()) {
                g(context2, str3, "notification_flow_disabled");
                return false;
            }
            if (zzclmVar.zzL() == null || zzclmVar.zzj() == null) {
                ((zzcnc) zzaVar).Z(str3, str);
            } else {
                k4o k4oVar = new k4o();
                Activity zzj = zzclmVar.zzj();
                if (zzj == null) {
                    yhk.s("Null activity");
                    return false;
                }
                k4oVar.a = zzj;
                k4oVar.b = null;
                k4oVar.c = str3;
                k4oVar.d = str;
                try {
                    zzclmVar.zzL().zzF(k4oVar.a());
                } catch (Exception e2) {
                    g(context2, str3, e2.getMessage());
                    return false;
                }
            }
            zzaVar.onAdClicked();
            return true;
        }
        if (zzeajVar != null) {
            int i2 = zzelp.i;
            zzelp.F4(context2, zzeajVar, zzeleVar, str3, "onfs", new HashMap());
        }
        return false;
    }

    public final void g(Context context, String str, String str2) {
        zzele zzeleVar = this.e;
        zzeleVar.f(str);
        zzeaj zzeajVar = this.b;
        if (zzeajVar != null) {
            u0a.Q("dialog_not_shown_reason", str2);
            zzelp.F4(context, zzeajVar, zzeleVar, str, "dialog_not_shown", njo.i(1, new Object[]{"dialog_not_shown_reason", str2}, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0112, code lost:
    
        if (com.google.android.gms.internal.ads.zzbqu.a(r13, new java.util.ArrayList(), r6) == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0155, code lost:
    
        r6 = r13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(com.google.android.gms.ads.internal.client.zza zzaVar, Map map, boolean z, String str, boolean z2, boolean z3) {
        Intent intent;
        Intent intent2;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        ResolveInfo a;
        boolean z4 = true;
        i(true);
        zzclm zzclmVar = (zzclm) zzaVar;
        Context context = zzclmVar.getContext();
        zzbbd p = zzclmVar.p();
        View zzE = zzclmVar.zzE();
        zzfma zzT = zzclmVar.zzT();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        String str2 = (String) map.get("u");
        if (TextUtils.isEmpty(str2)) {
            intent2 = null;
        } else {
            Uri d = d(c(context, p, Uri.parse(str2), zzE, null, zzT));
            boolean parseBoolean = Boolean.parseBoolean((String) map.get("use_first_package"));
            boolean parseBoolean2 = Boolean.parseBoolean((String) map.get("use_running_process"));
            if (!Boolean.parseBoolean((String) map.get("use_custom_tabs"))) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E5)).booleanValue()) {
                    z4 = false;
                }
            }
            Uri build = "http".equalsIgnoreCase(d.getScheme()) ? d.buildUpon().scheme(HttpRequest.DEFAULT_SCHEME).build() : HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(d.getScheme()) ? d.buildUpon().scheme("http").build() : null;
            ArrayList arrayList = new ArrayList();
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.addFlags(268435456);
            intent3.setData(d);
            intent3.setAction("android.intent.action.VIEW");
            if (build == null) {
                intent = null;
            } else {
                Intent intent4 = new Intent("android.intent.action.VIEW");
                intent4.addFlags(268435456);
                intent4.setData(build);
                intent4.setAction("android.intent.action.VIEW");
                intent = intent4;
            }
            if (z4) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intent3);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzq(context, intent);
            }
            ResolveInfo a2 = zzbqu.a(intent3, arrayList, context);
            if (a2 != null) {
                intent2 = zzbqu.b(intent3, a2);
            } else {
                if (intent != null && (a = zzbqu.a(intent, new ArrayList(), context)) != null) {
                    intent2 = zzbqu.b(intent3, a);
                }
                if (!arrayList.isEmpty()) {
                    if (parseBoolean2 && activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
                        int size = arrayList.size();
                        int i = 0;
                        loop0: while (i < size) {
                            ResolveInfo resolveInfo = (ResolveInfo) arrayList.get(i);
                            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                            do {
                                int i2 = i + 1;
                                if (it.hasNext()) {
                                }
                            } while (!it.next().processName.equals(resolveInfo.activityInfo.packageName));
                            intent2 = zzbqu.b(intent3, resolveInfo);
                            break loop0;
                        }
                    }
                    if (parseBoolean) {
                        intent2 = zzbqu.b(intent3, (ResolveInfo) arrayList.get(0));
                    }
                }
                intent2 = intent3;
            }
        }
        if (!z || this.e == null || intent2 == null || !f(zzaVar, zzclmVar.getContext(), intent2.getData().toString(), str)) {
            try {
                ((zzcnc) zzaVar).b0(new com.google.android.gms.ads.internal.overlay.zzc(intent2, this.i), z2, z3, str);
            } catch (ActivityNotFoundException e) {
                String message = e.getMessage();
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                zzo.zzi(message);
            }
        }
    }

    public final void i(boolean z) {
        zzbys zzbysVar = this.d;
        if (zzbysVar != null) {
            zzbysVar.f(z);
        }
    }

    public final void j(int i) {
        zzeaj zzeajVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.H5)).booleanValue() || (zzeajVar = this.b) == null) {
            return;
        }
        zzeai a = zzeajVar.a();
        a.b("action", "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        a.b("cct_open_status", str);
        a.c();
    }
}
