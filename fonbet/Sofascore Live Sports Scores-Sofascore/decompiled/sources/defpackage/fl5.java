package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.ConditionVariable;
import android.os.StrictMode;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbiz;
import com.google.android.gms.internal.ads.zzbje;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkz;
import com.google.android.gms.internal.ads.zzblh;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzdek;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzgvc;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class fl5 implements bl5, zzgvc, zzdjm {
    public final Context a;

    public fl5(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.bl5
    public void a(dy0 dy0Var) {
        rh3 rh3Var = new rh3("EmojiCompatInitializer", 0);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), rh3Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new p3(19, this, dy0Var, threadPoolExecutor));
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0145, code lost:
    
        if (new org.json.JSONObject(r5.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled") != false) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151 A[Catch: all -> 0x0018, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0018, blocks: (B:6:0x0012, B:8:0x0016, B:11:0x001b, B:13:0x0020, B:14:0x0022, B:16:0x0034, B:17:0x0038, B:19:0x003a, B:36:0x00b2, B:37:0x00b6, B:38:0x00b9, B:46:0x00eb, B:52:0x0151, B:64:0x0197, B:65:0x019e, B:94:0x01a0, B:95:0x01a7, B:22:0x004f, B:26:0x006c, B:28:0x0077, B:29:0x0081, B:31:0x0087, B:33:0x0097, B:35:0x00ae, B:39:0x00bc, B:41:0x00c0, B:43:0x00d0, B:45:0x00e7, B:47:0x00f0, B:50:0x0147, B:53:0x0157, B:55:0x0164, B:57:0x0172, B:58:0x017b, B:60:0x0189, B:62:0x018d, B:63:0x0190, B:66:0x0101, B:68:0x010f, B:70:0x0117, B:73:0x0137, B:75:0x013a, B:81:0x014b, B:82:0x014e, B:85:0x0055, B:87:0x0062), top: B:5:0x0012, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0157 A[Catch: all -> 0x005c, TRY_ENTER, TryCatch #4 {all -> 0x005c, blocks: (B:22:0x004f, B:26:0x006c, B:28:0x0077, B:29:0x0081, B:31:0x0087, B:33:0x0097, B:35:0x00ae, B:39:0x00bc, B:41:0x00c0, B:43:0x00d0, B:45:0x00e7, B:47:0x00f0, B:50:0x0147, B:53:0x0157, B:55:0x0164, B:57:0x0172, B:58:0x017b, B:60:0x0189, B:62:0x018d, B:63:0x0190, B:66:0x0101, B:68:0x010f, B:70:0x0117, B:73:0x0137, B:75:0x013a, B:81:0x014b, B:82:0x014e, B:85:0x0055, B:87:0x0062, B:72:0x011b), top: B:21:0x004f, outer: #1, inners: #2 }] */
    @Override // com.google.android.gms.internal.ads.zzgvc, defpackage.fon
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo792zza() {
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        ConditionVariable conditionVariable;
        inn innVar = zzbjg.a;
        zzbje zzc = zzba.zzc();
        Context context2 = this.a;
        if (!zzc.c) {
            synchronized (zzc.a) {
                try {
                    if (zzc.c) {
                        return null;
                    }
                    if (!zzc.d) {
                        zzc.d = true;
                    }
                    zzc.i = TextUtils.equals(context2.getPackageName(), "com.google.android.gms");
                    if (context2.getApplicationContext() != null) {
                        context2 = context2.getApplicationContext();
                    }
                    zzc.g = context2;
                    try {
                        zzc.f = Wrappers.a(context2).a(128, zzc.g.getPackageName()).metaData;
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    }
                    try {
                        Context context3 = zzc.g;
                        if (context3 == null) {
                            context3 = null;
                        } else {
                            try {
                                context = context3.createPackageContext("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException unused2) {
                                context = null;
                            }
                            if (context != null || (context = context3.getApplicationContext()) != null) {
                                context3 = context;
                            }
                        }
                        if (context3 != null) {
                            zzba.zza();
                            sharedPreferences = zzbiz.a(context3);
                        } else {
                            sharedPreferences = null;
                        }
                        if (sharedPreferences != null) {
                            zzblz.a.set(new mnn(zzc, sharedPreferences));
                        }
                        if (!zzc.i) {
                            zzbkq zzbkqVar = zzbkz.d;
                            if (((Long) zzbkqVar.c()).longValue() > 0 && zzbir.b(zzc.g, "crash_without_write") >= ((Long) zzbkqVar.c()).longValue()) {
                                zzc.j = true;
                                zzc.c = true;
                                zzc.d = false;
                                conditionVariable = zzc.b;
                                conditionVariable.open();
                            }
                        }
                        if (!zzc.i) {
                            zzbkq zzbkqVar2 = zzbkz.f;
                            if (((Long) zzbkqVar2.c()).longValue() > 0 && zzbir.b(zzc.g, "init_without_write") >= ((Long) zzbkqVar2.c()).longValue()) {
                                zzc.j = true;
                                zzc.c = true;
                                zzc.d = false;
                                conditionVariable = zzc.b;
                                conditionVariable.open();
                            }
                        }
                        Context context4 = zzc.g;
                        if (!((Boolean) zzblh.k.c()).booleanValue()) {
                            if (((Boolean) zzblh.l.c()).booleanValue() && (r5 = context4.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0)) != null) {
                                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                try {
                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                } finally {
                                    StrictMode.setThreadPolicy(threadPolicy);
                                }
                            }
                            if (context3 != null) {
                                zzc.d = false;
                                conditionVariable = zzc.b;
                                conditionVariable.open();
                            } else {
                                zzba.zza();
                                zzc.e = zzbiz.a(context3);
                                if (!zzc.i && ((Boolean) zzblh.e.c()).booleanValue()) {
                                    zzba.zzd().a(zzc.g);
                                }
                                if (!((Boolean) zzblh.c.c()).booleanValue() && (sharedPreferences2 = zzc.e) != null) {
                                    sharedPreferences2.registerOnSharedPreferenceChangeListener(zzc);
                                }
                                zzc.c(zzc.e);
                                zzc.c = true;
                            }
                        }
                        context3 = zzc.g;
                        if (context3 != null) {
                        }
                    } finally {
                        zzc.d = false;
                        zzc.b.open();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return null;
    }

    public /* synthetic */ fl5(Context context, boolean z) {
        this.a = context;
    }

    @Override // com.google.android.gms.internal.ads.zzdjm, com.google.android.gms.internal.ads.zzeb
    /* renamed from: zza */
    public /* synthetic */ void mo13zza(Object obj) {
        ((zzdek) obj).zza(this.a);
    }
}
