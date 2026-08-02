package defpackage;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import androidx.work.impl.WorkDatabase;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbbd;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzclm;
import com.google.android.gms.internal.ads.zzcmc;
import com.google.android.gms.internal.ads.zzcnw;
import com.google.android.gms.internal.ads.zzeaj;
import com.google.android.gms.internal.ads.zzelp;
import com.google.android.gms.internal.ads.zzfma;
import com.google.android.gms.internal.ads.zzhcf;
import com.google.android.gms.internal.consent_sdk.zzao;
import com.google.android.gms.internal.consent_sdk.zzbe;
import com.google.android.gms.internal.consent_sdk.zzbz;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzcc;
import com.google.android.gms.internal.consent_sdk.zzcr;
import com.google.android.gms.internal.consent_sdk.zzd;
import com.google.android.gms.internal.consent_sdk.zze;
import com.google.android.gms.internal.consent_sdk.zzg;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.protobuf.ByteString;
import com.moloco.sdk.acm.d;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.b;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.a;
import com.moloco.sdk.internal.ilrd.n;
import com.moloco.sdk.internal.services.bidtoken.f;
import com.moloco.sdk.internal.services.bidtoken.g;
import com.moloco.sdk.internal.services.bidtoken.providers.k;
import com.moloco.sdk.internal.services.bidtoken.providers.l;
import com.moloco.sdk.internal.services.bidtoken.r;
import com.moloco.sdk.internal.services.bidtoken.s;
import com.moloco.sdk.internal.services.i;
import com.moloco.sdk.q0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class ng2 implements o, zzd, zzhcf {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ng2(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(x2a.P(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, pjf.y);
        this.a = jy0.c(obtainStyledAttributes.getResourceId(4, 0), context);
        this.g = jy0.c(obtainStyledAttributes.getResourceId(2, 0), context);
        this.b = jy0.c(obtainStyledAttributes.getResourceId(3, 0), context);
        this.c = jy0.c(obtainStyledAttributes.getResourceId(5, 0), context);
        ColorStateList x = w3a.x(context, obtainStyledAttributes, 7);
        this.d = jy0.c(obtainStyledAttributes.getResourceId(9, 0), context);
        this.e = jy0.c(obtainStyledAttributes.getResourceId(8, 0), context);
        this.f = jy0.c(obtainStyledAttributes.getResourceId(10, 0), context);
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(x.getDefaultColor());
        obtainStyledAttributes.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005e A[Catch: all -> 0x0088, TRY_ENTER, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0054, B:14:0x005e, B:15:0x009e, B:17:0x00a8, B:21:0x00ba, B:24:0x008b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a8 A[Catch: all -> 0x0088, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0054, B:14:0x005e, B:15:0x009e, B:17:0x00a8, B:21:0x00ba, B:24:0x008b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba A[Catch: all -> 0x0088, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0054, B:14:0x005e, B:15:0x009e, B:17:0x00a8, B:21:0x00ba, B:24:0x008b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:11:0x0054, B:14:0x005e, B:15:0x009e, B:17:0x00a8, B:21:0x00ba, B:24:0x008b), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Serializable a(b bVar, String str, g gVar, sq3 sq3Var) {
        s sVar;
        int i;
        j2d j2dVar;
        try {
            if (sq3Var instanceof s) {
                sVar = (s) sq3Var;
                int i2 = sVar.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    sVar.y = i2 - Integer.MIN_VALUE;
                    Object obj = sVar.w;
                    lu3 lu3Var = lu3.a;
                    i = sVar.y;
                    if (i != 0) {
                        y6a.M(obj);
                        j2dVar = (j2d) this.h;
                        sVar.r = this;
                        sVar.s = bVar;
                        sVar.t = str;
                        sVar.u = gVar;
                        sVar.v = j2dVar;
                        sVar.y = 1;
                        if (j2dVar.e(sVar) == lu3Var) {
                            return lu3Var;
                        }
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2d j2dVar2 = sVar.v;
                        gVar = sVar.u;
                        str = sVar.t;
                        bVar = sVar.s;
                        ng2 ng2Var = sVar.r;
                        y6a.M(obj);
                        j2dVar = j2dVar2;
                        this = ng2Var;
                    }
                    if (this.d(str, gVar)) {
                        a[] aVarArr = a.b;
                        d dVar = new d("cbt_cached");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar.a("result", "true");
                        ((c) bVar).a(dVar);
                    } else {
                        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "Bid token needs refresh, fetching new bid token", false, 4, null);
                        this.e = str;
                        this.g = gVar;
                        a[] aVarArr2 = a.b;
                        d dVar2 = new d("cbt_cached");
                        com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                        dVar2.a("result", "false");
                        c cVar = (c) bVar;
                        cVar.a(dVar2);
                        this.f = this.b(str, cVar);
                    }
                    if (((String) this.f).length() != 0) {
                        p2g p2gVar = w2g.b;
                        u2g u2gVar = new u2g(new Exception("Client bid token is empty"));
                        j2dVar.f(null);
                        return u2gVar;
                    }
                    p2g p2gVar2 = w2g.b;
                    String str2 = (String) this.f;
                    j2dVar.f(null);
                    return str2;
                }
            }
            if (this.d(str, gVar)) {
            }
            if (((String) this.f).length() != 0) {
            }
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        sVar = new s(this, sq3Var);
        Object obj2 = sVar.w;
        lu3 lu3Var2 = lu3.a;
        i = sVar.y;
        if (i != 0) {
        }
    }

    public String b(String str, c cVar) {
        Exception exc;
        String str2;
        r rVar = (r) this.b;
        l lVar = (l) this.d;
        n nVar = (n) this.c;
        i iVar = (i) this.a;
        if (str.length() == 0) {
            a[] aVarArr = a.b;
            d dVar = new d("bid_token_build");
            com.moloco.sdk.internal.client_metrics_data.b[] bVarArr = com.moloco.sdk.internal.client_metrics_data.b.a;
            dVar.a("result", "failure");
            dVar.a("reason", "empty_public_key");
            cVar.a(dVar);
            return "";
        }
        com.moloco.sdk.internal.client_metrics_data.c[] cVarArr = com.moloco.sdk.internal.client_metrics_data.c.b;
        h c = cVar.c("bid_token_build_time_ms");
        try {
            iVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            String str3 = "rsa";
            try {
                byte[] c2 = nVar.c(str);
                lVar.a();
                q0 a = rVar.a((k) lVar.d(), (g) this.g);
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "BidToken Component: " + a, false, 4, null);
                byte[] encode = Base64.encode(a.toByteArray(), 0);
                str3 = "aes";
                encode.getClass();
                Cipher cipher = Cipher.getInstance((String) ((mqi) nVar.d).getValue());
                cipher.init(1, (SecretKeySpec) nVar.b, (IvParameterSpec) ((mqi) nVar.e).getValue());
                byte[] doFinal = cipher.doFinal(encode);
                doFinal.getClass();
                byte[] encode2 = Base64.encode(doFinal, 0);
                encode2.getClass();
                com.moloco.sdk.h h = com.moloco.sdk.i.h();
                h.d(ByteString.copyFrom(c2));
                h.h(ByteString.copyFrom(encode2));
                byte[] byteArray = ((com.moloco.sdk.i) h.build()).toByteArray();
                byteArray.getClass();
                String encodeToString = Base64.encodeToString(byteArray, 0);
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr2 = com.moloco.sdk.internal.client_metrics_data.b.a;
                c.a("result", "success");
                cVar.b(c);
                a[] aVarArr2 = a.b;
                d dVar2 = new d("bid_token_build");
                dVar2.a("result", "success");
                cVar.a(dVar2);
                MolocoLogger.info$default(molocoLogger, "ClientBidTokenServiceImpl", "Client bid token build time: " + (System.currentTimeMillis() - currentTimeMillis) + " ms", null, false, 12, null);
                return "v2:" + encodeToString;
            } catch (Exception e) {
                exc = e;
                str2 = str3;
                String simpleName = exc.getClass().getSimpleName();
                MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
                MolocoLogger.warn$default(molocoLogger2, "ClientBidTokenServiceImpl", "Client bid token build failed: ".concat(simpleName), exc, false, 8, null);
                a[] aVarArr3 = a.b;
                d dVar3 = new d("bid_token_build");
                com.moloco.sdk.internal.client_metrics_data.b[] bVarArr3 = com.moloco.sdk.internal.client_metrics_data.b.a;
                dVar3.a("result", "failure");
                dVar3.a("reason", simpleName);
                if (str2.length() > 0) {
                    dVar3.a("step", str2);
                }
                MolocoLogger.debugBuildLog$default(molocoLogger2, "ClientBidTokenServiceImpl", "Recording metric failure: " + dVar3.b + ", tags: " + CollectionsKt.f0(dVar3.a, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62), false, 4, null);
                cVar.a(dVar3);
                c.a("result", "failure");
                c.a("reason", simpleName);
                cVar.b(c);
                return "";
            }
        } catch (Exception e2) {
            exc = e2;
            str2 = "";
        }
    }

    public boolean d(String str, g gVar) {
        if (!Intrinsics.c((String) this.e, str)) {
            MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, "ClientBidTokenServiceImpl", "rp changed, needs refresh", false, 4, null);
            return true;
        }
        g gVar2 = (g) this.g;
        this.g = gVar;
        boolean c = Intrinsics.c(gVar2, gVar);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", !c ? "config updated" : "config didn't change", false, 4, null);
        if (!c) {
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "config changed, needs refresh", false, 4, null);
            return true;
        }
        if (((String) this.f).length() == 0) {
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "cached bidToken is empty, needs refresh", false, 4, null);
            return true;
        }
        if (((l) this.d).b()) {
            MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "signal provider updated, needs refresh", false, 4, null);
            return true;
        }
        MolocoLogger.debugBuildLog$default(molocoLogger, "ClientBidTokenServiceImpl", "Bid token doesn't need refresh", false, 4, null);
        return false;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o
    public void destroy() {
        fdi fdiVar = (fdi) this.g;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s sVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.s) fdiVar.getValue();
        if (sVar != null) {
            sVar.destroy();
        }
        fdiVar.l(null);
    }

    public void e(boolean z) {
        View view = (View) this.c;
        ((px0) this.g).f(true);
        ((ViewPager2) this.d).setUserInputEnabled(false);
        o02 n = ((AbstractActivity) this.a).n();
        if (n != null) {
            n.r0((Drawable) ((joa) this.h).getValue());
            n.p0(R.string.close);
        }
        if (z) {
            hz8.B(view, 200L);
            tgj.G(view, 200L, 2);
        } else {
            view.setVisibility(8);
            view.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
        ((Function1) this.f).invoke(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a A[Catch: Exception -> 0x0072, TryCatch #4 {Exception -> 0x0072, blocks: (B:3:0x0002, B:5:0x0008, B:12:0x002c, B:14:0x003a, B:16:0x0047, B:17:0x0055, B:19:0x006a, B:26:0x004f, B:32:0x0030, B:33:0x0033, B:30:0x0034), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bah f(int i) {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        int i2 = 2;
        try {
            if (wt3.b(2, i)) {
                return null;
            }
            try {
                File file = ((yf2) this.d).a;
                if (file.exists()) {
                    fileInputStream = new FileInputStream(file);
                    try {
                        jSONObject = new JSONObject(k53.z0(fileInputStream));
                    } catch (Exception unused) {
                        k53.a0(fileInputStream);
                        jSONObject = null;
                        if (jSONObject != null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        k53.a0(fileInputStream);
                        throw th;
                    }
                } else {
                    fileInputStream = null;
                    jSONObject = null;
                }
                k53.a0(fileInputStream);
            } catch (Exception unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = null;
            }
            if (jSONObject != null) {
                return null;
            }
            bah b = (jSONObject.getInt("settings_version") != 3 ? new uic(21) : new n2f(i2)).b((omf) ((bka) this.c).b, jSONObject);
            jSONObject.toString();
            long currentTimeMillis = System.currentTimeMillis();
            if (wt3.b(3, i) || b.c >= currentTimeMillis) {
                return b;
            }
            return null;
        } catch (Exception unused3) {
            return null;
        }
    }

    public bah g() {
        return (bah) ((AtomicReference) this.g).get();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r5.equals("non_personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        r5 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0051, code lost:
    
        if (r5.equals("personalized") != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cc  */
    @Override // com.google.android.gms.internal.consent_sdk.zzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean h(String str, JSONObject jSONObject) {
        Dialog dialog;
        oln olnVar;
        p7f p7fVar;
        zzbe zzbeVar = (zzbe) this.g;
        switch (str.hashCode()) {
            case -1370505102:
                if (!str.equals("load_complete")) {
                    return false;
                }
                vln vlnVar = (vln) zzbeVar.j.getAndSet(null);
                if (vlnVar != null) {
                    if (!zzbeVar.m && !zzbeVar.n) {
                        zzcr zzcrVar = zzbeVar.f;
                        zzcrVar.a((Queue) zzcrVar.g.get(), 4, 5, null);
                    }
                    vlnVar.h(zzbeVar);
                    return true;
                }
                return true;
            case -278739366:
                if (!str.equals("configure_app_assets")) {
                    return false;
                }
                ((Executor) this.d).execute(new zzcc(this));
                return true;
            case 150940456:
                if (!str.equals("browser")) {
                    return false;
                }
                String optString = jSONObject.optString("url");
                TextUtils.isEmpty(optString);
                Uri parse = Uri.parse(optString);
                if (parse.getScheme() == null) {
                    "Action[browser]: empty scheme: ".concat(String.valueOf(optString));
                }
                try {
                    ((zzbz) this.b).startActivity(new Intent("android.intent.action.VIEW", parse));
                    return true;
                } catch (ActivityNotFoundException unused) {
                    "Action[browser]: can not open url: ".concat(String.valueOf(optString));
                    return true;
                }
            case 1671672458:
                if (!str.equals("dismiss")) {
                    return false;
                }
                String optString2 = jSONObject.optString("status");
                switch (optString2.hashCode()) {
                    case -954325659:
                        break;
                    case -258041904:
                        break;
                    case 429411856:
                        break;
                    case 467888915:
                        break;
                    case 1666911234:
                        break;
                    case 1725474845:
                        if (optString2.equals("CONSENT_SIGNAL_NOT_REQUIRED")) {
                            int i = 1;
                            Dialog dialog2 = zzbeVar.g;
                            if (dialog2 != null) {
                                dialog2.dismiss();
                                zzbeVar.g = null;
                            }
                            zzbeVar.b.a = null;
                            oln olnVar2 = (oln) zzbeVar.l.getAndSet(null);
                            if (olnVar2 != null) {
                                olnVar2.b.a.unregisterActivityLifecycleCallbacks(olnVar2);
                            }
                            p7f p7fVar2 = (p7f) zzbeVar.k.getAndSet(null);
                            if (p7fVar2 != null) {
                                zzbeVar.c.b.edit().putInt("consent_status", i).commit();
                                p7fVar2.a();
                                break;
                            }
                        }
                        zzg zzgVar = new zzg(1, "We are getting something wrong with the webview.");
                        dialog = zzbeVar.g;
                        if (dialog != null) {
                            dialog.dismiss();
                            zzbeVar.g = null;
                        }
                        zzbeVar.b.a = null;
                        olnVar = (oln) zzbeVar.l.getAndSet(null);
                        if (olnVar != null) {
                            olnVar.b.a.unregisterActivityLifecycleCallbacks(olnVar);
                        }
                        p7fVar = (p7f) zzbeVar.k.getAndSet(null);
                        if (p7fVar != null) {
                            zzbeVar.d(zzgVar);
                            zzgVar.d();
                            p7fVar.a();
                            break;
                        }
                        break;
                    default:
                        zzg zzgVar2 = new zzg(1, "We are getting something wrong with the webview.");
                        dialog = zzbeVar.g;
                        if (dialog != null) {
                        }
                        zzbeVar.b.a = null;
                        olnVar = (oln) zzbeVar.l.getAndSet(null);
                        if (olnVar != null) {
                        }
                        p7fVar = (p7f) zzbeVar.k.getAndSet(null);
                        if (p7fVar != null) {
                        }
                        break;
                }
                return true;
            default:
                return false;
        }
    }

    public HashMap i() {
        long j;
        HashMap hashMap = new HashMap();
        czo czoVar = (czo) this.a;
        Task task = (Task) ((qpn) this.b).e;
        cmn cmnVar = jzo.a;
        if (task.isSuccessful()) {
            cmnVar = (cmn) task.getResult();
        }
        hashMap.put("v", czoVar.a());
        hashMap.put("gms", Boolean.valueOf(czoVar.c()));
        hashMap.put("gv", Long.valueOf(cmnVar.i0()));
        hashMap.put("int", cmnVar.h0());
        hashMap.put("attts", Long.valueOf(cmnVar.k0().t()));
        hashMap.put("att", cmnVar.k0().v());
        hashMap.put("attkid", cmnVar.k0().u());
        hashMap.put("up", Boolean.valueOf(((jro) this.d).a));
        hashMap.put("t", new Throwable());
        cso csoVar = (cso) this.g;
        hashMap.put("tcq", Long.valueOf(csoVar.a));
        hashMap.put("tpq", Long.valueOf(csoVar.b));
        hashMap.put("tcv", Long.valueOf(csoVar.c));
        hashMap.put("tpv", Long.valueOf(csoVar.d));
        hashMap.put("tchv", Long.valueOf(csoVar.e));
        hashMap.put("tphv", Long.valueOf(csoVar.f));
        hashMap.put("tcc", Long.valueOf(csoVar.g));
        hashMap.put("tpc", Long.valueOf(csoVar.h));
        hpo hpoVar = (hpo) this.e;
        if (hpoVar != null) {
            synchronized (hpo.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) hpoVar.a;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j = 2;
                        } else if (((NetworkCapabilities) hpoVar.a).hasTransport(1)) {
                            j = 1;
                        } else if (((NetworkCapabilities) hpoVar.a).hasTransport(0)) {
                            j = 0;
                        }
                    }
                    j = -1;
                } finally {
                }
            }
            hashMap.put("nt", Long.valueOf(j));
        }
        lso lsoVar = (lso) this.f;
        hashMap.put("vs", Long.valueOf(lsoVar.d ? lsoVar.b - lsoVar.a : -1L));
        long j2 = lsoVar.c;
        lsoVar.c = -1L;
        hashMap.put("vf", Long.valueOf(j2));
        return hashMap;
    }

    public void j(String str) {
        "Receive consent action: ".concat(String.valueOf(str));
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("action");
        String queryParameter2 = parse.getQueryParameter("args");
        zzd[] zzdVarArr = {this, (zzao) this.f};
        zze zzeVar = (zze) this.e;
        zzeVar.getClass();
        zzeVar.a.execute(new zzc(queryParameter, queryParameter2, zzdVarArr));
    }

    @Override // com.google.android.gms.internal.ads.zzhcf
    /* renamed from: zza */
    public ddb mo10zza() {
        zzt.zzd();
        Context context = (Context) this.a;
        zzcnw zzcnwVar = new zzcnw(0, 0, 0);
        zza zzaVar = (zza) this.d;
        zzbif a = zzbif.a();
        zzelp zzelpVar = (zzelp) this.e;
        zzfma zzfmaVar = (zzfma) this.f;
        zzeaj zzeajVar = (zzeaj) this.g;
        zzclm a2 = zzcmc.a(context, zzcnwVar, "", false, false, (zzbbd) this.b, null, (VersionInfoParcel) this.c, null, zzaVar, a, null, null, zzelpVar, zzfmaVar, zzeajVar);
        zzcgn zzcgnVar = new zzcgn(a2);
        a2.zzP().g = new xtn(zzcgnVar, 0);
        a2.loadUrl((String) this.h);
        return zzcgnVar;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzd
    public Executor zza() {
        final Handler handler = (Handler) this.c;
        return new Executor() { // from class: com.google.android.gms.internal.consent_sdk.zzcb
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        };
    }

    public ng2(i iVar, r rVar, n nVar, l lVar) {
        iVar.getClass();
        this.a = iVar;
        this.b = rVar;
        this.c = nVar;
        this.d = lVar;
        this.e = "";
        this.f = "";
        this.g = f.a;
        this.h = new j2d();
    }

    public ng2(i0 i0Var, Integer num, Integer num2, String str, ad2 ad2Var, Context context, com.moloco.sdk.internal.services.events.c cVar, t0 t0Var, Function0 function0, Function0 function02) {
        context.getClass();
        cVar.getClass();
        t0Var.getClass();
        this.a = i0Var;
        this.b = str;
        this.c = cVar;
        this.d = t0Var;
        this.e = function0;
        this.f = function02;
        fdi a = gdi.a(null);
        this.g = a;
        xw3.L(ad2Var, null, null, new kuj(this, context, num, num2, (rq3) null, 25), 3);
        this.h = un0.K(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l(a, 1), ad2Var, new uci(0L, Long.MAX_VALUE), null);
    }

    public ng2(AbstractActivity abstractActivity, dsi dsiVar, View view, ViewPager2 viewPager2, k1e k1eVar, Function1 function1) {
        view.getClass();
        viewPager2.getClass();
        this.a = abstractActivity;
        this.b = dsiVar;
        this.c = view;
        this.d = viewPager2;
        this.e = k1eVar;
        this.f = function1;
        px0 px0Var = new px0(this, 13);
        this.g = px0Var;
        this.h = ypa.a(ysa.c, new w1i(this, 7));
        abstractActivity.getOnBackPressedDispatcher().a(abstractActivity, px0Var);
        if (dsiVar.d) {
            e(false);
        }
        z8e.x(abstractActivity, dsiVar.c, new m1f(this, null, 25));
    }

    public ng2(Context context, nah nahVar, omf omfVar, bka bkaVar, yf2 yf2Var, ih2 ih2Var, rd4 rd4Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.g = atomicReference;
        this.h = new AtomicReference(new TaskCompletionSource());
        this.a = context;
        this.b = nahVar;
        this.c = bkaVar;
        this.d = yf2Var;
        this.e = ih2Var;
        this.f = rd4Var;
        atomicReference.set(uic.k(omfVar));
    }

    public /* synthetic */ ng2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
        this.e = obj5;
        this.f = obj6;
        this.g = obj7;
        this.h = obj8;
    }

    public ng2(Context context, ti3 ti3Var, zbl zblVar, g8f g8fVar, WorkDatabase workDatabase, lcl lclVar, ArrayList arrayList) {
        context.getClass();
        g8fVar.getClass();
        this.a = ti3Var;
        this.b = zblVar;
        this.c = g8fVar;
        this.d = workDatabase;
        this.e = lclVar;
        this.f = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.g = applicationContext;
        this.h = new l2a(23);
    }
}
