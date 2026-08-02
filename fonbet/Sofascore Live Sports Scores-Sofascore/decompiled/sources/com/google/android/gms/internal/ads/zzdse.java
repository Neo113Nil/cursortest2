package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzdse;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.zzn;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzdse {
    public final zzdxg a;
    public final zzdvv b;
    public final zzcvi c;
    public final zzdpl d;

    public zzdse(zzdxg zzdxgVar, zzdvv zzdvvVar, zzcvi zzcviVar, zzdpl zzdplVar) {
        this.a = zzdxgVar;
        this.b = zzdvvVar;
        this.c = zzcviVar;
        this.d = zzdplVar;
    }

    public final View a() {
        zzclm a = this.a.a(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        a.zzE().setVisibility(8);
        final int i = 4;
        a.T("/sendMessageToSdk", new zzbqh(this) { // from class: g0o
            public final /* synthetic */ zzdse b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbqh
            public final void a(Object obj, Map map) {
                int i2 = i;
                zzdse zzdseVar = this.b;
                switch (i2) {
                    case 0:
                        zzdseVar.d.y();
                        break;
                    case 1:
                        zzclm zzclmVar = (zzclm) obj;
                        zzclmVar.zzP().g = new f0o(1, zzdseVar, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            zzclmVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                            break;
                        } else {
                            zzclmVar.loadData(str, "text/html", C.UTF8_NAME);
                            break;
                        }
                    case 2:
                        int i3 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(0);
                        zzdseVar.c.f = true;
                        break;
                    case 3:
                        int i4 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(8);
                        zzdseVar.c.f = false;
                        break;
                    default:
                        zzdseVar.b.d(map);
                        break;
                }
            }
        });
        final int i2 = 0;
        a.T("/adMuted", new zzbqh(this) { // from class: g0o
            public final /* synthetic */ zzdse b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbqh
            public final void a(Object obj, Map map) {
                int i22 = i2;
                zzdse zzdseVar = this.b;
                switch (i22) {
                    case 0:
                        zzdseVar.d.y();
                        break;
                    case 1:
                        zzclm zzclmVar = (zzclm) obj;
                        zzclmVar.zzP().g = new f0o(1, zzdseVar, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            zzclmVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                            break;
                        } else {
                            zzclmVar.loadData(str, "text/html", C.UTF8_NAME);
                            break;
                        }
                    case 2:
                        int i3 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(0);
                        zzdseVar.c.f = true;
                        break;
                    case 3:
                        int i4 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(8);
                        zzdseVar.c.f = false;
                        break;
                    default:
                        zzdseVar.b.d(map);
                        break;
                }
            }
        });
        WeakReference weakReference = new WeakReference(a);
        final int i3 = 1;
        zzbqh zzbqhVar = new zzbqh(this) { // from class: g0o
            public final /* synthetic */ zzdse b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbqh
            public final void a(Object obj, Map map) {
                int i22 = i3;
                zzdse zzdseVar = this.b;
                switch (i22) {
                    case 0:
                        zzdseVar.d.y();
                        break;
                    case 1:
                        zzclm zzclmVar = (zzclm) obj;
                        zzclmVar.zzP().g = new f0o(1, zzdseVar, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            zzclmVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                            break;
                        } else {
                            zzclmVar.loadData(str, "text/html", C.UTF8_NAME);
                            break;
                        }
                    case 2:
                        int i32 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(0);
                        zzdseVar.c.f = true;
                        break;
                    case 3:
                        int i4 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(8);
                        zzdseVar.c.f = false;
                        break;
                    default:
                        zzdseVar.b.d(map);
                        break;
                }
            }
        };
        zzdvv zzdvvVar = this.b;
        zzdvvVar.b("/loadHtml", new zzn(zzdvvVar, weakReference, "/loadHtml", zzbqhVar));
        final int i4 = 2;
        zzdvvVar.b("/showOverlay", new zzn(zzdvvVar, new WeakReference(a), "/showOverlay", new zzbqh(this) { // from class: g0o
            public final /* synthetic */ zzdse b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbqh
            public final void a(Object obj, Map map) {
                int i22 = i4;
                zzdse zzdseVar = this.b;
                switch (i22) {
                    case 0:
                        zzdseVar.d.y();
                        break;
                    case 1:
                        zzclm zzclmVar = (zzclm) obj;
                        zzclmVar.zzP().g = new f0o(1, zzdseVar, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            zzclmVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                            break;
                        } else {
                            zzclmVar.loadData(str, "text/html", C.UTF8_NAME);
                            break;
                        }
                    case 2:
                        int i32 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(0);
                        zzdseVar.c.f = true;
                        break;
                    case 3:
                        int i42 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(8);
                        zzdseVar.c.f = false;
                        break;
                    default:
                        zzdseVar.b.d(map);
                        break;
                }
            }
        }));
        final int i5 = 3;
        zzdvvVar.b("/hideOverlay", new zzn(zzdvvVar, new WeakReference(a), "/hideOverlay", new zzbqh(this) { // from class: g0o
            public final /* synthetic */ zzdse b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.internal.ads.zzbqh
            public final void a(Object obj, Map map) {
                int i22 = i5;
                zzdse zzdseVar = this.b;
                switch (i22) {
                    case 0:
                        zzdseVar.d.y();
                        break;
                    case 1:
                        zzclm zzclmVar = (zzclm) obj;
                        zzclmVar.zzP().g = new f0o(1, zzdseVar, map);
                        String str = (String) map.get("overlayHtml");
                        String str2 = (String) map.get("baseUrl");
                        if (!TextUtils.isEmpty(str2)) {
                            zzclmVar.loadDataWithBaseURL(str2, str, "text/html", C.UTF8_NAME, null);
                            break;
                        } else {
                            zzclmVar.loadData(str, "text/html", C.UTF8_NAME);
                            break;
                        }
                    case 2:
                        int i32 = zze.zza;
                        zzo.zzh("Showing native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(0);
                        zzdseVar.c.f = true;
                        break;
                    case 3:
                        int i42 = zze.zza;
                        zzo.zzh("Hiding native ads overlay.");
                        ((zzclm) obj).zzE().setVisibility(8);
                        zzdseVar.c.f = false;
                        break;
                    default:
                        zzdseVar.b.d(map);
                        break;
                }
            }
        }));
        return a.zzE();
    }
}
