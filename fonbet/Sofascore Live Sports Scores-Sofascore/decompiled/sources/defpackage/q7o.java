package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.zzac;
import com.google.android.gms.ads.internal.util.zzq;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcer;
import com.google.android.gms.internal.ads.zzeez;
import com.google.android.gms.internal.ads.zzfcc;
import com.google.android.gms.internal.ads.zzfcd;
import com.google.android.gms.internal.ads.zzfcs;
import com.google.android.gms.internal.ads.zzfct;
import com.google.android.gms.internal.ads.zzfcw;
import com.google.android.gms.internal.ads.zzfcx;
import com.google.android.gms.internal.ads.zzfde;
import com.google.android.gms.internal.ads.zzfdo;
import com.google.android.gms.internal.ads.zzfdp;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzfdx;
import com.google.android.gms.internal.ads.zzffe;
import com.google.android.gms.internal.ads.zzffh;
import com.google.android.gms.internal.ads.zzffi;
import com.google.android.gms.internal.ads.zzfpo;
import com.google.android.gms.internal.ads.zzfyp;
import com.google.android.gms.internal.ads.zzfyy;
import com.google.android.gms.internal.ads.zzfzt;
import com.google.android.gms.internal.ads.zzgdj;
import com.google.android.gms.internal.ads.zzgdo;
import com.google.android.gms.internal.ads.zzgei;
import com.google.android.gms.internal.ads.zzgfw;
import com.google.android.gms.internal.ads.zzgge;
import com.google.android.gms.internal.ads.zzgid;
import com.google.android.gms.internal.ads.zzgiw;
import com.google.android.gms.internal.ads.zzgqn;
import com.google.android.gms.internal.ads.zzgqz;
import com.google.android.gms.internal.ads.zzgrh;
import com.google.android.gms.internal.ads.zzhat;
import com.google.android.gms.internal.ads.zzhcy;
import com.google.android.gms.internal.ads.zzinq;
import com.google.android.gms.internal.ads.zziom;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzht;
import com.google.android.gms.measurement.internal.zzjd;
import com.google.android.gms.measurement.internal.zzpg;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class q7o implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q7o(xlo xloVar) {
        this.a = 7;
        xlo xloVar2 = xlo.b;
        this.b = xloVar;
    }

    private final Object a() {
        sfo sfoVar = (sfo) this.b;
        lrn lrnVar = new lrn(sfoVar, 13);
        synchronized (sfoVar) {
            zzgrh zzgrhVar = sfoVar.b;
            Context context = sfoVar.a;
            zzgei zzgeiVar = sfoVar.c;
            uh2 uh2Var = new uh2();
            uh2Var.c = new b1g();
            xh2 xh2Var = new xh2(uh2Var);
            uh2Var.b = xh2Var;
            uh2Var.a = rfo.class;
            try {
                sfo.e(context, zzgeiVar, uh2Var);
                uh2Var.a = "";
            } catch (Exception e) {
                xh2Var.b(e);
            }
            ilo i = zzhcy.i(xh2Var, lrnVar, sfoVar.d);
            zzgrhVar.e(52, i);
            sfoVar.f = i;
        }
        return "";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(25:124|(2:127|125)|128|129|(23:184|185|(1:187)|189|132|133|(17:135|136|137|(1:139)(3:175|(1:177)|178)|140|(3:143|(3:146|(12:149|150|151|(2:153|(8:155|156|(2:158|(1:160)(1:170))(1:171)|161|(1:163)(1:169)|(1:165)(1:168)|166|167))|172|156|(0)(0)|161|(0)(0)|(0)(0)|166|167)(1:148)|144)|173)|174|151|(0)|172|156|(0)(0)|161|(0)(0)|(0)(0)|166|167)|180|137|(0)(0)|140|(3:143|(1:144)|173)|174|151|(0)|172|156|(0)(0)|161|(0)(0)|(0)(0)|166|167)|131|132|133|(0)|180|137|(0)(0)|140|(0)|174|151|(0)|172|156|(0)(0)|161|(0)(0)|(0)(0)|166|167) */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x05ac, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.d4)).booleanValue() == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x05c2, code lost:
    
        r11 = com.google.android.gms.internal.ads.zzgdn.f(r0);
        r14 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.o4)).longValue();
        r16 = com.google.android.gms.ads.internal.zzt.zzh().g().zzx();
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x05e7, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.zzgdn.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x05ea, code lost:
    
        r5 = r11.a(null, null, r14, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x05ee, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.zzgdn.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x05ef, code lost:
    
        r6 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0636, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.e4)).booleanValue() == false) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x064c, code lost:
    
        r11 = com.google.android.gms.internal.ads.zzgdo.f(r0);
        r0 = com.google.android.gms.internal.ads.zzgdk.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0668, code lost:
    
        if (r1.d.clientJarVersion < ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.k4)).intValue()) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x066a, code lost:
    
        r14 = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.p4)).longValue();
        r16 = com.google.android.gms.ads.internal.zzt.zzh().g().zzx();
        r11.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x068b, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.zzgdo.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x068c, code lost:
    
        r4 = r11.g;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0693, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.zzgdk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0694, code lost:
    
        r4 = ((android.content.SharedPreferences) r4.a.c).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x06a0, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.zzgdk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x06a1, code lost:
    
        if (r4 != false) goto L268;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x06a3, code lost:
    
        r4 = new com.google.android.gms.internal.ads.zzgdj();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x06a8, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.zzgdo.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x06b3, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.zzgdk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x06b4, code lost:
    
        r3 = ((android.content.SharedPreferences) r0.a.c).getBoolean("paidv2_publisher_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x06c0, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.zzgdk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x06cd, code lost:
    
        monitor-enter(com.google.android.gms.internal.ads.zzgdk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x06ce, code lost:
    
        r2 = ((android.content.SharedPreferences) r0.a.c).getBoolean("paidv2_user_option", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x06da, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.zzgdk.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x06db, code lost:
    
        r9 = r2;
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x06ac, code lost:
    
        r4 = r11.a(null, null, r14, r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x06b2, code lost:
    
        monitor-exit(com.google.android.gms.internal.ads.zzgdo.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x06aa, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x06c9, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x06ca, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x064a, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.g4)).booleanValue() != false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05c0, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(com.google.android.gms.internal.ads.zzbjg.f4)).booleanValue() != false) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x033c A[Catch: Exception -> 0x0367, TRY_LEAVE, TryCatch #15 {Exception -> 0x0367, blocks: (B:133:0x032e, B:135:0x033c), top: B:132:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0396  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object call() {
        ActivityInfo activityInfo;
        String str;
        String str2;
        String str3;
        String str4;
        List<ResolveInfo> queryIntentActivities;
        boolean z;
        boolean z2;
        int i;
        PackageInfo b;
        int i2;
        Object apply;
        boolean z3 = true;
        String str5 = null;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                zzfcc zzfccVar = (zzfcc) this.b;
                try {
                    Context context = zzfccVar.a;
                    boolean matches = zzfccVar.c.g.matches((String) zzba.zzc().a(zzbjg.m4));
                    zzgdj zzgdjVar = new zzgdj();
                    zzgdj zzgdjVar2 = new zzgdj();
                    if (matches) {
                        if (!((Boolean) zzba.zzc().a(zzbjg.h4)).booleanValue()) {
                            return new zzfcd(true);
                        }
                    }
                    if (!matches) {
                        break;
                    }
                    if (matches) {
                        break;
                    }
                    zzgdj zzgdjVar3 = zzgdjVar;
                    if (((Boolean) zzba.zzc().a(zzbjg.l4)).booleanValue()) {
                        if (zzfccVar.d.clientJarVersion < ((Integer) zzba.zzc().a(zzbjg.k4)).intValue()) {
                            zzgdo.f(context).g();
                        }
                    }
                    if (!matches) {
                        break;
                    }
                    if (matches) {
                        break;
                    }
                    boolean z5 = true;
                    boolean z6 = true;
                    return new zzfcd(zzgdjVar3, zzgdjVar2, z5, z6, matches);
                } catch (IOException e) {
                    zzt.zzh().d("PerAppIdSignal", e);
                    return new zzfcd(zzfccVar.c.g.matches((String) zzba.zzc().a(zzbjg.m4)));
                }
            case 1:
                zzfcs zzfcsVar = (zzfcs) this.b;
                zzcer zzcerVar = zzfcsVar.a;
                Context context2 = zzfcsVar.c;
                if (!zzcerVar.a(context2)) {
                    return new zzfct(null, null, null, null, null);
                }
                String b2 = zzcerVar.b(context2);
                String str6 = b2 == null ? "" : b2;
                String c = zzcerVar.c(context2);
                String str7 = c == null ? "" : c;
                String d = zzcerVar.d(context2);
                String str8 = d == null ? "" : d;
                String str9 = true != zzcerVar.a(context2) ? null : "fa";
                return new zzfct(str6, str7, str8, str9 == null ? "" : str9, "TIME_OUT".equals(str7) ? (Long) zzba.zzc().a(zzbjg.a1) : null);
            case 2:
                zzfcw zzfcwVar = (zzfcw) this.b;
                Context context3 = zzfcwVar.b;
                boolean c2 = Wrappers.a(context3).c();
                zzt.zzc();
                boolean zzH = zzs.zzH(context3);
                String str10 = zzfcwVar.c.afmaVersion;
                zzt.zzc();
                boolean zzI = zzs.zzI();
                zzt.zzc();
                ApplicationInfo applicationInfo = context3.getApplicationInfo();
                return new zzfcx(c2, zzH, str10, zzI, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.d(context3, ModuleDescriptor.MODULE_ID, false), DynamiteModule.a(context3, ModuleDescriptor.MODULE_ID), zzfcwVar.d);
            case 3:
                return new k6o(zzac.zzb(((zzfde) this.b).b, (String) zzba.zzc().a(zzbjg.i7)), 2);
            case 4:
                Context context4 = ((zzfdo) this.b).a;
                return new zzfdp(zzbir.b(context4, "init_without_write"), zzbir.b(context4, "crash_without_write"));
            case 5:
                t7o t7oVar = (t7o) this.b;
                Context context5 = t7oVar.b;
                PackageManager packageManager = context5.getPackageManager();
                Locale locale = Locale.getDefault();
                ResolveInfo resolveActivity = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
                ResolveInfo resolveActivity2 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
                String country = locale.getCountry();
                zzt.zzc();
                zzay.zza();
                boolean zzy = zzf.zzy();
                boolean a = DeviceProperties.a(context5);
                boolean d2 = DeviceProperties.d(context5);
                String language = locale.getLanguage();
                ArrayList arrayList = new ArrayList();
                LocaleList localeList = LocaleList.getDefault();
                for (int i3 = 0; i3 < localeList.size(); i3++) {
                    arrayList.add(localeList.get(i3).getLanguage());
                }
                ResolveInfo resolveActivity3 = packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gms.ads")), C.DEFAULT_BUFFER_SEGMENT_SIZE);
                if (resolveActivity3 != null && (activityInfo = resolveActivity3.activityInfo) != null) {
                    try {
                        PackageInfo b3 = Wrappers.a(context5).b(0, activityInfo.packageName);
                        if (b3 != null) {
                            int i4 = b3.versionCode;
                            String str11 = activityInfo.packageName;
                            StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(str11).length());
                            sb.append(i4);
                            sb.append(".");
                            sb.append(str11);
                            str5 = sb.toString();
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    str = null;
                    b = Wrappers.a(context5).b(128, "com.android.vending");
                    if (b != null) {
                        int i5 = b.versionCode;
                        String str12 = b.packageName;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i5).length() + 1 + String.valueOf(str12).length());
                        sb2.append(i5);
                        sb2.append(".");
                        sb2.append(str12);
                        str2 = sb2.toString();
                        String str13 = Build.FINGERPRINT;
                        String language2 = Locale.getDefault().getLanguage();
                        if (((Boolean) zzba.zzc().a(zzbjg.nf)).booleanValue()) {
                            zzq zzk = zzs.zzk(context5);
                            String zzb = zzk.zzb();
                            str4 = zzk.zza();
                            str3 = zzb;
                        } else {
                            if (((Boolean) zzba.zzc().a(zzbjg.mf)).booleanValue()) {
                                language2 = zzs.zzk(context5).zzb();
                            }
                            str3 = language2;
                            str4 = null;
                        }
                        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                        ResolveInfo resolveActivity4 = packageManager.resolveActivity(intent, 0);
                        queryIntentActivities = packageManager.queryIntentActivities(intent, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                        if (queryIntentActivities != null && resolveActivity4 != null) {
                            for (i = 0; i < queryIntentActivities.size(); i++) {
                                if (resolveActivity4.activityInfo.name.equals(queryIntentActivities.get(i).activityInfo.name)) {
                                    z = resolveActivity4.activityInfo.packageName.equals(zziom.a(context5));
                                    zzt.zzc();
                                    long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                                    if (((Boolean) zzba.zzc().a(zzbjg.Xc)).booleanValue()) {
                                        zzt.zzc();
                                        if (zzs.zzE(context5)) {
                                            z2 = true;
                                            String zzf = ((Boolean) zzba.zzc().a(zzbjg.bd)).booleanValue() ? ((Boolean) zzba.zzc().a(zzbjg.dd)).booleanValue() ? t7oVar.d : zzf.zzf(context5) : "";
                                            boolean z7 = resolveActivity2 != null;
                                            boolean z8 = resolveActivity != null;
                                            zzeez zzeezVar = t7oVar.c;
                                            String str14 = Build.MODEL;
                                            return new zzfdr(z8, z7, country, zzy, a, d2, language, arrayList, str, str2, z, availableBytes, z2, zzf, Build.VERSION.SDK_INT, str3, str4, zzeezVar.a());
                                        }
                                    }
                                    z2 = false;
                                    String zzf2 = ((Boolean) zzba.zzc().a(zzbjg.bd)).booleanValue() ? ((Boolean) zzba.zzc().a(zzbjg.dd)).booleanValue() ? t7oVar.d : zzf.zzf(context5) : "";
                                    if (resolveActivity2 != null) {
                                    }
                                    if (resolveActivity != null) {
                                    }
                                    zzeez zzeezVar2 = t7oVar.c;
                                    String str142 = Build.MODEL;
                                    return new zzfdr(z8, z7, country, zzy, a, d2, language, arrayList, str, str2, z, availableBytes, z2, zzf2, Build.VERSION.SDK_INT, str3, str4, zzeezVar2.a());
                                }
                            }
                        }
                        z = false;
                        zzt.zzc();
                        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                        if (((Boolean) zzba.zzc().a(zzbjg.Xc)).booleanValue()) {
                        }
                        z2 = false;
                        String zzf22 = ((Boolean) zzba.zzc().a(zzbjg.bd)).booleanValue() ? ((Boolean) zzba.zzc().a(zzbjg.dd)).booleanValue() ? t7oVar.d : zzf.zzf(context5) : "";
                        if (resolveActivity2 != null) {
                        }
                        if (resolveActivity != null) {
                        }
                        zzeez zzeezVar22 = t7oVar.c;
                        String str1422 = Build.MODEL;
                        return new zzfdr(z8, z7, country, zzy, a, d2, language, arrayList, str, str2, z, availableBytes2, z2, zzf22, Build.VERSION.SDK_INT, str3, str4, zzeezVar22.a());
                    }
                    str2 = null;
                    String str132 = Build.FINGERPRINT;
                    String language22 = Locale.getDefault().getLanguage();
                    if (((Boolean) zzba.zzc().a(zzbjg.nf)).booleanValue()) {
                    }
                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                    ResolveInfo resolveActivity42 = packageManager.resolveActivity(intent2, 0);
                    queryIntentActivities = packageManager.queryIntentActivities(intent2, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                    if (queryIntentActivities != null) {
                        while (i < queryIntentActivities.size()) {
                        }
                    }
                    z = false;
                    zzt.zzc();
                    long availableBytes22 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                    if (((Boolean) zzba.zzc().a(zzbjg.Xc)).booleanValue()) {
                    }
                    z2 = false;
                    String zzf222 = ((Boolean) zzba.zzc().a(zzbjg.bd)).booleanValue() ? ((Boolean) zzba.zzc().a(zzbjg.dd)).booleanValue() ? t7oVar.d : zzf.zzf(context5) : "";
                    if (resolveActivity2 != null) {
                    }
                    if (resolveActivity != null) {
                    }
                    zzeez zzeezVar222 = t7oVar.c;
                    String str14222 = Build.MODEL;
                    return new zzfdr(z8, z7, country, zzy, a, d2, language, arrayList, str, str2, z, availableBytes22, z2, zzf222, Build.VERSION.SDK_INT, str3, str4, zzeezVar222.a());
                }
                str = str5;
                b = Wrappers.a(context5).b(128, "com.android.vending");
                if (b != null) {
                }
                str2 = null;
                String str1322 = Build.FINGERPRINT;
                String language222 = Locale.getDefault().getLanguage();
                if (((Boolean) zzba.zzc().a(zzbjg.nf)).booleanValue()) {
                }
                Intent intent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                ResolveInfo resolveActivity422 = packageManager.resolveActivity(intent22, 0);
                queryIntentActivities = packageManager.queryIntentActivities(intent22, C.DEFAULT_BUFFER_SEGMENT_SIZE);
                if (queryIntentActivities != null) {
                }
                z = false;
                zzt.zzc();
                long availableBytes222 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) zzba.zzc().a(zzbjg.Xc)).booleanValue()) {
                }
                z2 = false;
                String zzf2222 = ((Boolean) zzba.zzc().a(zzbjg.bd)).booleanValue() ? ((Boolean) zzba.zzc().a(zzbjg.dd)).booleanValue() ? t7oVar.d : zzf.zzf(context5) : "";
                if (resolveActivity2 != null) {
                }
                if (resolveActivity != null) {
                }
                zzeez zzeezVar2222 = t7oVar.c;
                String str142222 = Build.MODEL;
                return new zzfdr(z8, z7, country, zzy, a, d2, language, arrayList, str, str2, z, availableBytes222, z2, zzf2222, Build.VERSION.SDK_INT, str3, str4, zzeezVar2222.a());
            case 6:
                Context context6 = ((zzfdx) this.b).b;
                TelephonyManager telephonyManager = (TelephonyManager) context6.getSystemService("phone");
                String networkOperator = telephonyManager.getNetworkOperator();
                int phoneType = telephonyManager.getPhoneType();
                zzt.zzc();
                int i6 = -1;
                if (zzs.zzD(context6, "android.permission.ACCESS_NETWORK_STATE")) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) context6.getSystemService("connectivity");
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null) {
                        int type = activeNetworkInfo.getType();
                        int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                        i2 = type;
                        i6 = ordinal;
                    } else {
                        i2 = -1;
                    }
                    z4 = connectivityManager.isActiveNetworkMetered();
                } else {
                    i2 = -2;
                }
                return new zzfdv(i2, zzt.zzf().zzk(context6), phoneType, i6, networkOperator, z4);
            case 7:
                String str15 = (String) ((xlo) this.b).a;
                xlo xloVar = xlo.b;
                return new zzffe(str15, null);
            case 8:
                return new zzffi(((zzffh) this.b).b);
            case 9:
                ((zzfpo) this.b).zza();
                return null;
            case 10:
                Context context7 = ((zzfyy) this.b).a;
                return zzfyp.a(context7, context7.getPackageName(), Integer.toString(context7.getPackageManager().getPackageInfo(context7.getPackageName(), 0).versionCode));
            case 11:
                return ((wco) this.b).a();
            case 12:
                zzgge zzggeVar = (zzgge) this.b;
                synchronized (zzggeVar) {
                    try {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(zzggeVar.a);
                            try {
                                apply = zzggeVar.c.a(fileInputStream);
                                fileInputStream.close();
                            } finally {
                            }
                        } catch (IOException e2) {
                            apply = zzggeVar.d.apply(new tco(e2));
                        }
                    } catch (FileNotFoundException unused2) {
                        apply = zzggeVar.c.zzc();
                    } catch (tco e3) {
                        apply = zzggeVar.d.apply(e3);
                    }
                }
                return apply;
            case 13:
                edo edoVar = (edo) this.b;
                ((zzgid) edoVar.c.zzb()).a();
                ((zzgiw) edoVar.b.zzb()).zza();
                return null;
            case 14:
                return ((zzinq) this.b).zzb();
            case 15:
                gfo gfoVar = (gfo) this.b;
                zzgrh zzgrhVar = gfoVar.i;
                zzgfw zzgfwVar = gfoVar.b;
                zzgfw zzgfwVar2 = gfoVar.d;
                zzinq zzinqVar = gfoVar.f;
                try {
                    File file = zzgfwVar.a;
                    if (file.exists()) {
                        File file2 = ((zzgfw) zzinqVar.zzb()).a;
                        File file3 = ((zzgfw) gfoVar.e.zzb()).a;
                        try {
                            if (file2.exists()) {
                                File parentFile = file3.getParentFile();
                                if (parentFile != null) {
                                    zzfzt.e(parentFile);
                                }
                                zzhat.b(file3);
                                zzhat.c(file2, file3);
                            }
                            File file4 = zzgfwVar2.a;
                            File file5 = gfoVar.c.a;
                            try {
                                if (file4.exists()) {
                                    zzhat.b(file5);
                                    zzhat.c(file4, file5);
                                }
                                File file6 = gfoVar.a.a;
                                try {
                                    if (file.exists()) {
                                        zzhat.b(file6);
                                        zzhat.c(file, file6);
                                    }
                                    file.delete();
                                    ((zzgfw) zzinqVar.zzb()).a.delete();
                                    zzgfwVar2.a.delete();
                                } catch (IOException | SecurityException e4) {
                                    zzgrhVar.d(15313, e4);
                                    zzgfwVar.a.delete();
                                    ((zzgfw) zzinqVar.zzb()).a.delete();
                                    zzgfwVar2.a.delete();
                                    z3 = false;
                                    return new Boolean(z3);
                                }
                            } catch (IOException | SecurityException e5) {
                                zzgrhVar.d(15312, e5);
                            }
                        } catch (IOException e6) {
                            e = e6;
                            zzgrhVar.d(15311, e);
                            zzgfwVar.a.delete();
                            ((zzgfw) zzinqVar.zzb()).a.delete();
                            zzgfwVar2.a.delete();
                            z3 = false;
                            return new Boolean(z3);
                        } catch (SecurityException e7) {
                            e = e7;
                            zzgrhVar.d(15311, e);
                            zzgfwVar.a.delete();
                            ((zzgfw) zzinqVar.zzb()).a.delete();
                            zzgfwVar2.a.delete();
                            z3 = false;
                            return new Boolean(z3);
                        }
                        return new Boolean(z3);
                    }
                    file.delete();
                    ((zzgfw) zzinqVar.zzb()).a.delete();
                    zzgfwVar2.a.delete();
                    z3 = false;
                    return new Boolean(z3);
                } catch (Throwable th) {
                    zzgfwVar.a.delete();
                    ((zzgfw) zzinqVar.zzb()).a.delete();
                    zzgfwVar2.a.delete();
                    throw th;
                }
            case 16:
                return a();
            case 17:
                Context context8 = ((zzgqn) this.b).a;
                try {
                    return zzfyp.a(context8, context8.getPackageName(), Integer.toString(context8.getPackageManager().getPackageInfo(context8.getPackageName(), 0).versionCode));
                } catch (Throwable unused3) {
                    return null;
                }
            case 18:
                zzgqz zzgqzVar = (zzgqz) this.b;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.USER_PRESENT");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
                zzgqzVar.a.registerReceiver(zzgqzVar, intentFilter);
                return null;
            case 19:
                return new com.google.android.gms.internal.measurement.zzt(((zzht) this.b).m);
            case 20:
                zzpg zzpgVar = ((zzjd) this.b).a;
                zzpgVar.W();
                nwo nwoVar = zzpgVar.h;
                zzpg.U(nwoVar);
                nwoVar.Q();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                Context context9 = (Context) ((qpn) this.b).b;
                return yaa.S(context9, context9.getPackageName(), Integer.toString(context9.getPackageManager().getPackageInfo(context9.getPackageName(), 0).versionCode));
        }
    }

    public /* synthetic */ q7o(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public q7o(zzjd zzjdVar, zzbh zzbhVar, String str) {
        this.a = 20;
        this.b = zzjdVar;
    }
}
