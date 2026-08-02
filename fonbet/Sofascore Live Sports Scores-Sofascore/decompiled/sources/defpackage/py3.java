package defpackage;

import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.WindowManager;
import androidx.media3.common.b;
import com.facebook.internal.d;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzaby;
import com.google.android.gms.internal.ads.zzdp;
import com.google.android.gms.internal.ads.zzff;
import com.google.android.gms.internal.ads.zzfvk;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzfwc;
import com.google.android.gms.internal.ads.zzfwg;
import com.google.android.gms.internal.ads.zzfwi;
import com.google.android.gms.internal.ads.zzfwj;
import com.google.android.gms.internal.ads.zzfwm;
import com.google.android.gms.internal.ads.zzfwp;
import com.google.android.gms.internal.ads.zzfws;
import com.google.android.gms.internal.ads.zzfwu;
import com.google.android.gms.internal.ads.zzfxf;
import com.google.android.gms.internal.ads.zzfxg;
import com.google.android.gms.internal.ads.zzgvc;
import com.google.android.gms.internal.ads.zzjw;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class py3 implements p2c, v4o, zzgvc {
    public final /* synthetic */ int a;
    public final Context b;

    public py3(Context context) {
        this.a = 0;
        context.getClass();
        this.b = context;
    }

    public static Object a(py3 py3Var, gw2 gw2Var, k19 k19Var) {
        lj2 lj2Var = new lj2(1, z9a.b(k19Var));
        lj2Var.t();
        CancellationSignal cancellationSignal = new CancellationSignal();
        lj2Var.v(new my3(cancellationSignal, 0));
        ny3 ny3Var = new ny3(lj2Var);
        hg0 hg0Var = new hg0(1);
        qy3 a = si0.a(new si0(py3Var.b), gw2Var.a);
        if (a == null) {
            ny3Var.c(new fw2());
        } else {
            a.onClearCredential(gw2Var, cancellationSignal, hg0Var, ny3Var);
        }
        Object q = lj2Var.q();
        return q == lu3.a ? q : Unit.a;
    }

    @Override // defpackage.p2c
    public r2c d(vng vngVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        int i2 = 3;
        if (i < 31 && ((context = this.b) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new pff((byte) 0, i2).d(vngVar);
        }
        int i3 = sjc.i(((b) vngVar.c).o);
        tgj.O("Creating an asynchronous MediaCodec adapter for track type ".concat(nik.J(i3)));
        yih yihVar = new yih(new el0(i3, 1), new el0(i3, 3));
        yihVar.b = true;
        return yihVar.d(vngVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0162, code lost:
    
        if (new org.json.JSONObject(r5.getString("app_settings_json", "{}")).optBoolean("local_flags_enabled") != false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011e A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d3 A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104 A[Catch: all -> 0x0062, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016e A[Catch: all -> 0x0020, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x0019, B:10:0x001d, B:12:0x0023, B:14:0x0027, B:15:0x0029, B:17:0x003b, B:18:0x003f, B:20:0x0041, B:42:0x00c5, B:43:0x00c9, B:44:0x00cc, B:60:0x0108, B:70:0x016e, B:87:0x01e6, B:88:0x01ed, B:132:0x01ef, B:133:0x01f6, B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068), top: B:7:0x0019, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174 A[Catch: all -> 0x0062, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0062, blocks: (B:22:0x0055, B:26:0x0072, B:28:0x0076, B:30:0x0080, B:31:0x008a, B:33:0x0090, B:35:0x00a0, B:39:0x00b3, B:41:0x00c1, B:46:0x00ae, B:49:0x00cf, B:51:0x00d3, B:53:0x00e3, B:57:0x00f6, B:59:0x0104, B:62:0x00f1, B:65:0x010d, B:68:0x0164, B:71:0x0174, B:73:0x0178, B:74:0x0180, B:76:0x0186, B:78:0x0194, B:79:0x019b, B:81:0x01a9, B:83:0x01ad, B:84:0x01b0, B:90:0x01b4, B:93:0x01d4, B:96:0x01e0, B:97:0x01e3, B:86:0x01e4, B:102:0x011e, B:104:0x012c, B:106:0x0134, B:109:0x0154, B:111:0x0157, B:117:0x0168, B:118:0x016b, B:123:0x005b, B:125:0x0068, B:108:0x0138), top: B:21:0x0055, outer: #0, inners: #4 }] */
    @Override // defpackage.v4o
    /* renamed from: zza */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object zzh() {
        zzaby zzabyVar;
        Context context;
        SharedPreferences sharedPreferences;
        SharedPreferences sharedPreferences2;
        SharedPreferences sharedPreferences3;
        ConditionVariable conditionVariable;
        int i;
        int i2;
        Context context2 = null;
        switch (this.a) {
            case 2:
                zzfvl zzfvlVar = zzfvk.a;
                if (zzfvlVar.a) {
                    return Boolean.TRUE;
                }
                Context applicationContext = this.b.getApplicationContext();
                if (applicationContext == null) {
                    a70.p("Application Context cannot be null");
                    return null;
                }
                if (!zzfvlVar.a) {
                    zzfvlVar.a = true;
                    zzfws a = zzfws.a();
                    a.getClass();
                    new zzfwc();
                    a.b = new zzfwg(new Handler(), applicationContext, a);
                    zzfwj zzfwjVar = zzfwj.d;
                    zzfwjVar.getClass();
                    boolean z = applicationContext instanceof Application;
                    if (z) {
                        ((Application) applicationContext).registerActivityLifecycleCallbacks(zzfwjVar);
                    }
                    zzfxf.a = (UiModeManager) applicationContext.getSystemService("uimode");
                    WindowManager windowManager = zzfxg.a;
                    zzfxg.c = applicationContext.getResources().getDisplayMetrics().density;
                    zzfxg.a = (WindowManager) applicationContext.getSystemService("window");
                    applicationContext.registerReceiver(new qao(), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
                    zzfwp zzfwpVar = zzfwp.b;
                    zzfwpVar.getClass();
                    zzfwpVar.a = applicationContext.getApplicationContext();
                    zzfwi zzfwiVar = zzfwi.e;
                    if (!zzfwiVar.b) {
                        zzfwm zzfwmVar = zzfwiVar.c;
                        if (z) {
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(zzfwmVar);
                        }
                        zzfwmVar.c = zzfwiVar;
                        zzfwmVar.a = true;
                        zzfwmVar.b = x5n.g().importance == 100;
                        zzfwiVar.d = zzfwmVar.b;
                        zzfwiVar.b = true;
                    }
                    zzfwu zzfwuVar = zzfwu.d;
                    zzfwuVar.getClass();
                    zzfwuVar.a = new WeakReference(applicationContext);
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    applicationContext.registerReceiver(new d(zzfwuVar, 19), intentFilter);
                }
                return Boolean.valueOf(zzfvlVar.a);
            case 3:
                int i3 = zzjw.l;
                Context context3 = this.b;
                s sVar = zzaby.n;
                synchronized (zzaby.class) {
                    zzabyVar = zzaby.t;
                    if (zzabyVar == null) {
                        if (context3 != null) {
                            context2 = context3.getApplicationContext();
                        }
                        zzff zzffVar = zzdp.a;
                        HashMap hashMap = new HashMap(8);
                        hashMap.put(0, 1000000L);
                        Long valueOf = Long.valueOf(C.TIME_UNSET);
                        hashMap.put(2, valueOf);
                        hashMap.put(3, valueOf);
                        hashMap.put(4, valueOf);
                        hashMap.put(5, valueOf);
                        hashMap.put(10, valueOf);
                        hashMap.put(9, valueOf);
                        hashMap.put(7, valueOf);
                        zzabyVar = new zzaby(context2, hashMap);
                        zzaby.t = zzabyVar;
                    }
                }
                return zzabyVar;
            default:
                kwo kwoVar = exo.a;
                ywo ywoVar = bwo.e.c;
                Context context4 = this.b;
                if (!ywoVar.c) {
                    synchronized (ywoVar.a) {
                        try {
                            if (!ywoVar.c) {
                                if (!ywoVar.d) {
                                    ywoVar.d = true;
                                }
                                ywoVar.i = TextUtils.equals(context4.getPackageName(), "com.google.android.gms");
                                if (context4.getApplicationContext() != null) {
                                    context4 = context4.getApplicationContext();
                                }
                                ywoVar.g = context4;
                                try {
                                    ywoVar.f = Wrappers.a(context4).a(128, ywoVar.g.getPackageName()).metaData;
                                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                                }
                                try {
                                    Context context5 = ywoVar.g;
                                    if (context5 == null) {
                                        context5 = null;
                                    } else {
                                        try {
                                            context = context5.createPackageContext("com.google.android.gms", 0);
                                        } catch (PackageManager.NameNotFoundException unused2) {
                                            context = null;
                                        }
                                        if (context != null || (context = context5.getApplicationContext()) != null) {
                                            context5 = context;
                                        }
                                    }
                                    if (context5 != null) {
                                        rwo rwoVar = bwo.e.b;
                                        try {
                                            sharedPreferences = context5.getSharedPreferences("google_ads_flags", 0);
                                        } catch (IllegalStateException unused3) {
                                        }
                                        if (sharedPreferences != null) {
                                            lxo.a.set(new swo(ywoVar, sharedPreferences));
                                        }
                                        if (!ywoVar.i) {
                                            b10 b10Var = tol.m;
                                            if (((Long) b10Var.J()).longValue() > 0) {
                                                SharedPreferences sharedPreferences4 = ywoVar.g.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0);
                                                if (sharedPreferences4 != null) {
                                                    try {
                                                        i2 = sharedPreferences4.getInt("crash_without_write", 0);
                                                    } catch (ClassCastException unused4) {
                                                    }
                                                    if (i2 >= ((Long) b10Var.J()).longValue()) {
                                                        ywoVar.j = true;
                                                        ywoVar.c = true;
                                                        ywoVar.d = false;
                                                        conditionVariable = ywoVar.b;
                                                        conditionVariable.open();
                                                    }
                                                }
                                                i2 = 0;
                                                if (i2 >= ((Long) b10Var.J()).longValue()) {
                                                }
                                            }
                                        }
                                        if (!ywoVar.i) {
                                            b10 b10Var2 = tol.n;
                                            if (((Long) b10Var2.J()).longValue() > 0) {
                                                SharedPreferences sharedPreferences5 = ywoVar.g.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0);
                                                if (sharedPreferences5 != null) {
                                                    try {
                                                        i = sharedPreferences5.getInt("init_without_write", 0);
                                                    } catch (ClassCastException unused5) {
                                                    }
                                                    if (i >= ((Long) b10Var2.J()).longValue()) {
                                                        ywoVar.j = true;
                                                        ywoVar.c = true;
                                                        ywoVar.d = false;
                                                        conditionVariable = ywoVar.b;
                                                        conditionVariable.open();
                                                    }
                                                }
                                                i = 0;
                                                if (i >= ((Long) b10Var2.J()).longValue()) {
                                                }
                                            }
                                        }
                                        Context context6 = ywoVar.g;
                                        if (!((Boolean) gxo.d.J()).booleanValue()) {
                                            if (((Boolean) gxo.e.J()).booleanValue() && (r5 = context6.getSharedPreferences(InneractiveMediationNameConsts.ADMOB, 0)) != null) {
                                                try {
                                                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(StrictMode.getThreadPolicy()).permitDiskReads().permitDiskWrites().build());
                                                    try {
                                                        break;
                                                    } catch (JSONException unused6) {
                                                    }
                                                } finally {
                                                }
                                            }
                                            if (context5 == null) {
                                                ywoVar.d = false;
                                                conditionVariable = ywoVar.b;
                                                conditionVariable.open();
                                            } else {
                                                bwo bwoVar = bwo.e;
                                                rwo rwoVar2 = bwoVar.b;
                                                try {
                                                    sharedPreferences2 = context5.getSharedPreferences("google_ads_flags", 0);
                                                } catch (IllegalStateException unused7) {
                                                    sharedPreferences2 = null;
                                                }
                                                ywoVar.e = sharedPreferences2;
                                                if (!ywoVar.i && ((Boolean) gxo.c.J()).booleanValue()) {
                                                    bwoVar.d.a(ywoVar.g);
                                                }
                                                if (!((Boolean) gxo.b.J()).booleanValue() && (sharedPreferences3 = ywoVar.e) != null) {
                                                    sharedPreferences3.registerOnSharedPreferenceChangeListener(ywoVar);
                                                }
                                                SharedPreferences sharedPreferences6 = ywoVar.e;
                                                if (sharedPreferences6 != null) {
                                                    try {
                                                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                                                        try {
                                                            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
                                                            String string = sharedPreferences6.getString("flag_configuration", "{}");
                                                            StrictMode.setThreadPolicy(threadPolicy);
                                                            ywoVar.h = new JSONObject(string);
                                                        } finally {
                                                        }
                                                    } catch (JSONException unused8) {
                                                    }
                                                }
                                                ywoVar.c = true;
                                            }
                                        }
                                        context5 = ywoVar.g;
                                        if (context5 == null) {
                                        }
                                    }
                                    sharedPreferences = null;
                                    if (sharedPreferences != null) {
                                    }
                                    if (!ywoVar.i) {
                                    }
                                    if (!ywoVar.i) {
                                    }
                                    Context context62 = ywoVar.g;
                                    if (!((Boolean) gxo.d.J()).booleanValue()) {
                                    }
                                    context5 = ywoVar.g;
                                    if (context5 == null) {
                                    }
                                } finally {
                                    ywoVar.d = false;
                                    ywoVar.b.open();
                                }
                            }
                        } finally {
                        }
                    }
                }
                return null;
        }
    }

    public /* synthetic */ py3(Context context, int i) {
        this.a = i;
        this.b = context;
    }
}
