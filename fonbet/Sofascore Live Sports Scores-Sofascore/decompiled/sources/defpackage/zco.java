package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzaxe;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzaxw;
import com.google.android.gms.internal.ads.zzggp;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.internal.ads.zzifg;
import com.google.android.gms.internal.ads.zzifl;
import com.google.android.gms.internal.ads.zzifm;
import com.google.android.gms.internal.ads.zzifz;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zco implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zzggp b;

    public /* synthetic */ zco(zzggp zzggpVar, int i) {
        this.a = i;
        this.b = zzggpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        zzaxd zzaxdVar;
        zzgxm x;
        int i2;
        String str;
        StringWriter stringWriter;
        PrintWriter printWriter;
        switch (this.a) {
            case 0:
                zzggp zzggpVar = this.b;
                if (!zzggpVar.e || zzggpVar.l.getAndSet(true)) {
                    return;
                }
                Context context = zzggpVar.a;
                String str2 = zzggpVar.j;
                int i3 = zzggpVar.t;
                double d = zzggpVar.i;
                long j = zzggpVar.k;
                Locale locale = Locale.getDefault();
                if (i3 == 1) {
                    zzifz.a();
                    throw null;
                }
                int i4 = i3 - 2;
                int i5 = i4 != 0 ? i4 != 1 ? i4 != 2 ? 5 : 4 : 3 : 2;
                zzaxd D = zzaxe.D();
                long j2 = Build.VERSION.SDK_INT;
                D.n();
                ((zzaxe) D.b).G(j2);
                String str3 = Build.MODEL;
                D.n();
                ((zzaxe) D.b).H(str3);
                String language = locale.getLanguage();
                D.n();
                ((zzaxe) D.b).I(language);
                String country = locale.getCountry();
                D.n();
                ((zzaxe) D.b).J(country);
                D.n();
                ((zzaxe) D.b).M(str2);
                D.n();
                ((zzaxe) D.b).S(i5);
                D.n();
                ((zzaxe) D.b).U(3);
                String packageName = context.getPackageName();
                D.n();
                ((zzaxe) D.b).K(packageName);
                D.n();
                ((zzaxe) D.b).P(j);
                if (d > 0.0d) {
                    D.n();
                    ((zzaxe) D.b).O((int) (1.0d / d));
                }
                PackageManager packageManager = context.getPackageManager();
                try {
                    long j3 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
                    D.n();
                    ((zzaxe) D.b).L(j3);
                } catch (Exception unused) {
                }
                try {
                    if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                        i = 5;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        i = 4;
                    } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                        i = 7;
                    } else {
                        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                        i = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? 2 : 6;
                    }
                    D.n();
                    ((zzaxe) D.b).R(i);
                } catch (RuntimeException unused2) {
                }
                zzaxe zzaxeVar = (zzaxe) D.o();
                synchronized (zzggpVar.m) {
                    zzggpVar.p.p(zzaxeVar);
                }
                return;
            default:
                zzggp zzggpVar2 = this.b;
                synchronized (zzggpVar2.m) {
                    zzaxd zzaxdVar2 = zzggpVar2.p;
                    zzifg zzifgVar = (zzifg) zzaxdVar2.a.z(zzifl.e, null);
                    boolean n = zzaxdVar2.b.n();
                    zzifm zzifmVar = zzaxdVar2.b;
                    if (n) {
                        zzifmVar.u();
                        zzifmVar = zzaxdVar2.b;
                    }
                    zzifgVar.b = zzifmVar;
                    zzaxdVar = (zzaxd) zzifgVar;
                }
                synchronized (zzggpVar2.n) {
                    ArrayList arrayList = zzggpVar2.q;
                    x = zzgxm.x(arrayList);
                    arrayList.clear();
                    zzggpVar2.r = false;
                }
                int size = x.size();
                int i6 = 0;
                int i7 = 0;
                while (i7 < size) {
                    yco ycoVar = (yco) x.get(i7);
                    if (i6 >= zzggpVar2.g) {
                        zzggpVar2.d((zzaxe) zzaxdVar.o());
                        zzaxdVar.n();
                        ((zzaxe) zzaxdVar.b).F();
                        i2 = 0;
                    } else {
                        i2 = i6;
                    }
                    zzaxv D2 = zzaxw.D();
                    long j4 = ycoVar.a;
                    D2.n();
                    ((zzaxw) D2.b).E(j4);
                    long j5 = ycoVar.b;
                    D2.n();
                    ((zzaxw) D2.b).F(j5);
                    long j6 = ycoVar.e;
                    D2.n();
                    ((zzaxw) D2.b).I(j6);
                    String str4 = ycoVar.d;
                    if (str4 != null) {
                        D2.n();
                        ((zzaxw) D2.b).J(str4);
                    }
                    Throwable th = ycoVar.c;
                    int i8 = th == null ? 2 : 3;
                    D2.n();
                    ((zzaxw) D2.b).K(i8);
                    if (th != null) {
                        String name = th.getClass().getName();
                        D2.n();
                        ((zzaxw) D2.b).G(name);
                        try {
                            stringWriter = new StringWriter();
                            try {
                                printWriter = new PrintWriter(stringWriter);
                            } finally {
                                break;
                            }
                        } catch (IOException unused3) {
                            str = "";
                        }
                        try {
                            th.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                            D2.n();
                            ((zzaxw) D2.b).H(str);
                        } finally {
                            break;
                        }
                    }
                    zzaxw zzaxwVar = (zzaxw) D2.o();
                    zzaxdVar.n();
                    ((zzaxe) zzaxdVar.b).E(zzaxwVar);
                    i7++;
                    i6 = i2 + 1;
                }
                if (i6 > 0) {
                    zzggpVar2.d((zzaxe) zzaxdVar.o());
                    zzaxdVar.n();
                    ((zzaxe) zzaxdVar.b).F();
                    return;
                }
                return;
        }
    }
}
