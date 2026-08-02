package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.cast.framework.media.internal.zza;
import com.google.android.gms.cast.framework.media.internal.zzs;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbug;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.ads.zzcgo;
import com.google.android.gms.internal.ads.zzcgq;
import com.google.android.gms.internal.ads.zzcke;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcnj;
import com.google.android.gms.internal.ads.zzcun;
import com.google.android.gms.internal.ads.zzcyj;
import com.google.android.gms.internal.ads.zzcyl;
import com.google.android.gms.internal.ads.zzddt;
import com.google.android.gms.internal.ads.zzdgg;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdmx;
import com.google.android.gms.internal.ads.zzdqm;
import com.google.android.gms.internal.ads.zzdqr;
import com.google.android.gms.internal.ads.zzdvv;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzedd;
import com.google.android.gms.internal.ads.zzeem;
import com.google.android.gms.internal.ads.zzehm;
import com.google.android.gms.internal.ads.zzeml;
import com.google.android.gms.internal.ads.zzeui;
import com.google.android.gms.internal.ads.zzeup;
import com.google.android.gms.internal.ads.zzfld;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzfmd;
import com.google.android.gms.internal.ads.zzfmu;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfpi;
import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqc;
import com.google.android.gms.internal.ads.zzfqj;
import com.google.android.gms.internal.ads.zzfta;
import com.google.android.gms.internal.ads.zzfvx;
import com.google.android.gms.internal.ads.zzfyd;
import com.google.android.gms.internal.ads.zzfyy;
import com.google.android.gms.internal.ads.zzfzy;
import com.google.android.gms.internal.ads.zzggu;
import com.google.android.gms.internal.ads.zzghf;
import com.google.android.gms.internal.ads.zzgkq;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzhcv;
import com.google.android.gms.internal.ads.zzibh;
import com.google.android.gms.internal.ads.zzibp;
import com.google.android.gms.internal.ads.zzje;
import com.google.android.gms.internal.ads.zzjw;
import com.google.android.gms.internal.ads.zznt;
import com.google.android.gms.internal.pal.zzkb;
import com.google.android.gms.internal.pal.zzpa;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ohn implements zzfzy, zzcnj, zzcgq, u0l, zzfvx, zzhcv, wcn, zzdjm, zzcyj, zzeup, zzfoe, Continuation, OnFailureListener, zzgkq, vzo, roo, zzgvc, zzkb, zza, zzeb {
    public final /* synthetic */ int a;
    public final Object b;

    public ohn(zzpa zzpaVar, Class cls) {
        this.a = 27;
        if (zzpaVar.a.keySet().contains(cls) || Void.class.equals(cls)) {
            this.b = zzpaVar;
        } else {
            a70.p(fc6.n("Given internalKeyMananger ", zzpaVar.toString(), " does not support primitive class ", cls.getName()));
            throw null;
        }
    }

    public boolean a(File file) {
        try {
            return ((zzfyd) this.b).a(file);
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.cast.framework.media.internal.zza
    public void b(Bitmap bitmap) {
        Logger logger = zzs.v;
        Bitmap bitmap2 = null;
        if (bitmap != null) {
            int width = bitmap.getWidth();
            float f = width;
            int i = (int) (((9.0f * f) / 16.0f) + 0.5f);
            float f2 = (i - r3) / 2.0f;
            RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f, bitmap.getHeight() + f2);
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, i, config);
            new Canvas(createBitmap).drawBitmap(bitmap, (Rect) null, rectF, (Paint) null);
            bitmap2 = createBitmap;
        }
        ((zzs) this.b).c(bitmap2, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public /* synthetic */ void c(zzcyl zzcylVar) {
        zzeui zzeuiVar = (zzeui) this.b;
        zzdmx zzdmxVar = (zzdmx) zzcylVar;
        synchronized (zzeuiVar) {
            zzeuiVar.j = zzdmxVar;
            zzdmxVar.a();
        }
    }

    public void i(zzjk zzjkVar, int i) {
        dhn dhnVar;
        if (i != -30) {
            if (i != -20) {
                if (i == -10) {
                    dhnVar = dhn.MANIFEST;
                } else if (i != 0) {
                    dhnVar = i != 30 ? dhn.UNSET : dhn.INITIALIZATION;
                }
            }
            dhnVar = dhn.API;
        } else {
            dhnVar = dhn.TCF;
        }
        ((EnumMap) this.b).put((EnumMap) zzjkVar, (zzjk) dhnVar);
    }

    public void j(zzjk zzjkVar, dhn dhnVar) {
        ((EnumMap) this.b).put((EnumMap) zzjkVar, (zzjk) dhnVar);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public /* synthetic */ void onFailure(Exception exc) {
        zzfyy zzfyyVar = (zzfyy) this.b;
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        zzfyyVar.c.c(2025, -1L, exc);
    }

    @Override // defpackage.u0l
    public void onPostMessage(WebView webView, i0l i0lVar, Uri uri, boolean z, mda mdaVar) {
        ((vdb) this.b).h(i0lVar.a(), "4");
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        rbo rboVar = (rbo) this.b;
        rboVar.c.trySetResult(rboVar.a);
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder("1");
                for (zzjk zzjkVar : zzjk.values()) {
                    dhn dhnVar = (dhn) ((EnumMap) this.b).get(zzjkVar);
                    if (dhnVar == null) {
                        dhnVar = dhn.UNSET;
                    }
                    sb.append(dhnVar.a);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcnj, com.google.android.gms.internal.ads.zzeup
    /* renamed from: zza */
    public void mo12zza() {
        switch (this.a) {
            case 2:
                pq7 pq7Var = (pq7) this.b;
                long a = zzt.zzk().a();
                long j = pq7Var.a;
                ArrayList arrayList = (ArrayList) pq7Var.c;
                arrayList.add(Long.valueOf(a - j));
                String valueOf = String.valueOf(arrayList.get(0));
                StringBuilder sb = new StringBuilder(valueOf.length() + 52);
                sb.append("LoadNewJavascriptEngine(onEngLoaded) latency is ");
                sb.append(valueOf);
                sb.append(" ms.");
                zze.zza(sb.toString());
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new kpn((zzbum) pq7Var.b, (zzbul) pq7Var.d, (zzbtp) pq7Var.e, arrayList, j, 1), ((Integer) zzba.zzc().a(zzbjg.d)).intValue());
                return;
            case 3:
                zze.zza("Rejecting reference for JS Engine.");
                boolean booleanValue = ((Boolean) zzba.zzc().a(zzbjg.L8)).booleanValue();
                zzbug zzbugVar = (zzbug) this.b;
                if (booleanValue) {
                    zzbugVar.c("SdkJavascriptFactory.createNewReference.FailureCallback", new IllegalStateException("Unable to create JS engine reference."));
                    return;
                } else {
                    zzbugVar.b();
                    return;
                }
            default:
                zzeui zzeuiVar = (zzeui) this.b;
                synchronized (zzeuiVar) {
                    zzeuiVar.j = null;
                }
                return;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zzb(Object obj) {
        zzcgo zzcgoVar;
        switch (this.a) {
            case 6:
                zzcun zzcunVar = (zzcun) this.b;
                zzfta zzftaVar = zzcunVar.g;
                zzflo zzfloVar = zzcunVar.e;
                zzfld zzfldVar = zzcunVar.f;
                zzcunVar.h.b(zzftaVar.b(zzfloVar, zzfldVar, false, "", (String) obj, zzfldVar.c, null, null), true == zzt.zzh().i(zzcunVar.a) ? 2 : 1);
                return;
            case 7:
            case 8:
            case 9:
            default:
                ((zzghf) this.b).c.a((zzggu) obj);
                return;
            case 10:
                zzdqm zzdqmVar = (zzdqm) this.b;
                zzdqr zzdqrVar = zzdqmVar.m;
                zzclm zzclmVar = (zzclm) obj;
                synchronized (zzdqrVar) {
                    zzdqrVar.k = zzclmVar;
                }
                zzdqr zzdqrVar2 = zzdqmVar.m;
                synchronized (zzdqrVar2) {
                    zzcgoVar = zzdqrVar2.n;
                }
                zzeml e = zzdqmVar.e("Google", true);
                if (e != null && zzcgoVar != null) {
                    zzcgoVar.zzc(e);
                    return;
                } else {
                    if (zzcgoVar != null) {
                        zzcgoVar.cancel(false);
                        return;
                    }
                    return;
                }
            case 11:
                ((zzclm) obj).n("sendMessageToNativeJs", (Map) this.b);
                return;
            case 12:
                ((zzedd) obj).m = true;
                ((zzeem) this.b).d.b();
                return;
            case 13:
                ((zzehm) this.b).c.N((zzflo) obj);
                return;
            case 14:
                try {
                    ((zzfpi) this.b).zza((SQLiteDatabase) obj);
                    return;
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    int i = zze.zza;
                    zzo.zzf("Error executing function on offline signal database: ".concat(valueOf));
                    return;
                }
        }
    }

    private final void d(Throwable th) {
    }

    private final void e(Throwable th) {
    }

    private final void f(Throwable th) {
    }

    private final void g(Throwable th) {
    }

    private final void h(Throwable th) {
    }

    public /* synthetic */ ohn(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public ohn() {
        this.a = 0;
        this.b = new EnumMap(zzjk.class);
    }

    public ohn(zzbul zzbulVar, zzbug zzbugVar) {
        this.a = 3;
        this.b = zzbugVar;
        Objects.requireNonNull(zzbulVar);
    }

    public ohn(zzdvv zzdvvVar, Map map) {
        this.a = 11;
        this.b = map;
        Objects.requireNonNull(zzdvvVar);
    }

    public /* synthetic */ ohn(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }

    public ohn(EnumMap enumMap) {
        this.a = 0;
        EnumMap enumMap2 = new EnumMap(zzjk.class);
        this.b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    @Override // defpackage.wcn
    public fjn zza() {
        return new fjn((vdf) this.b);
    }

    @Override // defpackage.wcn
    public zzea zza() {
        try {
            return ((zzfmu) this.b).a.zzB();
        } catch (Throwable th) {
            throw new zzfmd(th);
        }
    }

    @Override // defpackage.roo
    public Object zza(String str) {
        zzibp zzibpVar = (zzibp) this.b;
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        zzibh zzibhVar = zzibh.b;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                return zzibpVar.a(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return zzibpVar.a(str, null);
    }

    @Override // defpackage.vzo
    public void zzb(int i, long j, String str) {
        ((uno) this.b).c.A(i, System.currentTimeMillis() - j, null, null, str);
    }

    @Override // defpackage.wcn
    public Object zza() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 7:
                return new rqn(((qc4) ((mxn) obj).b).b);
            case 25:
                zao zaoVar = (zao) ((wcn) obj).zza();
                if (zaoVar != null) {
                    return zaoVar;
                }
                yhk.s("Cannot return null from a non-@Nullable @Provides method");
                return null;
            default:
                int i2 = zzjw.l;
                return (zzcke) obj;
        }
    }

    @Override // defpackage.vzo
    public void zza(int i, long j) {
        ((uno) this.b).c.y(i, System.currentTimeMillis() - j);
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public void mo13zza(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 8:
                ((zzddt) obj).zzc((com.google.android.gms.ads.internal.client.zze) obj2);
                break;
            case 9:
                ((zzdgg) obj).h((com.google.android.gms.ads.internal.client.zzt) obj2);
                break;
            case 18:
                zzfpp zzfppVar = (zzfpp) obj2;
                ((zzfqj) obj).t((zzfqc) zzfppVar.a, zzfppVar.b);
                break;
            default:
                ((zznt) obj).h((zzje) obj2);
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhcv
    public void zza(Throwable th) {
        switch (this.a) {
            case 10:
                if (((Boolean) zzba.zzc().a(zzbjg.y6)).booleanValue()) {
                    zzt.zzh().e("omid native display exp", th);
                    break;
                }
                break;
            case 14:
                String valueOf = String.valueOf(th.getMessage());
                int i = zze.zza;
                zzo.zzf("Failed to get offline signal database: ".concat(valueOf));
                break;
        }
    }
}
