package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import com.ironsource.U3;
import defpackage.a70;
import defpackage.dh0;
import defpackage.kvd;
import defpackage.kzo;
import defpackage.n72;
import defpackage.tmi;
import defpackage.uif;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import java.util.logging.Level;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzqt {
    public static Boolean d;
    public final zzlk a;
    public final Uri b;
    public final String c;

    public zzqt(zzlk zzlkVar, String str) {
        this.a = zzlkVar;
        this.c = str;
        Context context = zzlkVar.b;
        Pattern pattern = zzsa.a;
        zzrz zzrzVar = new zzrz(context);
        zzrzVar.a("phenotype");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 4);
        sb.append("/");
        sb.append(str);
        sb.append(".pb");
        zzrzVar.b(sb.toString());
        this.b = zzrzVar.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n72 a() {
        String substring;
        int i;
        kzo kzoVar;
        kzo kzoVar2;
        String str;
        zznd zzndVar;
        zzlk zzlkVar = this.a;
        tmi tmiVar = zzlkVar.f;
        if (!zzky.b(zzlkVar.b)) {
            return new n72(zzqv.F(), new uif(3, 17, 17));
        }
        Boolean bool = d;
        if (bool == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                bool = Boolean.valueOf(Process.isIsolated());
                d = bool;
            } else {
                try {
                    Object invoke = Process.class.getMethod("isIsolated", null).invoke(Process.class, null);
                    invoke.getClass();
                    bool = (Boolean) invoke;
                    d = bool;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                    d = bool;
                }
            }
        }
        if (bool.booleanValue()) {
            return new n72(zzqv.F(), new uif(3, 18, 17));
        }
        zzqn b = zzlkVar.g.b();
        zzacr zzacrVar = b.c;
        dh0 dh0Var = zzlg.a;
        String str2 = this.c;
        int indexOf = str2.indexOf("#");
        if (indexOf >= 0) {
            substring = str2.substring(0, indexOf);
        } else {
            if (str2.contains("@")) {
                a70.p("Invalid package name: ".concat(str2));
                return null;
            }
            substring = str2;
        }
        if (!b.h) {
            i = 14;
        } else if (!b.a || !b.b.contains(zzabz.FILE)) {
            i = 3;
        } else if (zzacrVar.d() != 0) {
            List list = b.f;
            i = (list.isEmpty() || list.contains(substring)) ? b.g.contains(substring) ? 6 : 0 : 5;
        } else {
            i = 4;
        }
        if (i != 0) {
            kzoVar2 = new kzo(null, new uif(i, 17));
        } else {
            try {
                str = b.e;
            } catch (Exception e) {
                zzlz.a(Level.WARNING, zzlkVar.a(), e, "Failed to read shared file for %s", str2);
                kzoVar = new kzo(zznd.c, new uif(3, 10, 17));
            }
            if (str.isEmpty()) {
                kvd kvdVar = (kvd) zzlkVar.h.get();
                if (kvdVar.g()) {
                    str = ((ApplicationInfo) kvdVar.d()).dataDir;
                } else {
                    zzlz.a(Level.WARNING, zzlkVar.a(), null, "Unable to get GMS application info, using defaults.", new Object[0]);
                    kzoVar = new kzo(zznd.c, new uif(3, 7, 17));
                    kzoVar2 = kzoVar;
                }
            }
            String str3 = File.separator;
            String str4 = b.d;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
            sb.append(str);
            sb.append(str3);
            sb.append(str4);
            String sb2 = sb.toString();
            zzmz zzmzVar = new zzmz(zzacrVar, str2);
            Uri.Builder scheme = new Uri.Builder().scheme(U3.i.b);
            String obj = zzmzVar.a().toString();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + sb2.length() + String.valueOf(str3).length() + obj.length());
            sb3.append(str3);
            sb3.append(sb2);
            sb3.append(str3);
            sb3.append(obj);
            Uri build = scheme.appendEncodedPath(sb3.toString()).build();
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().build());
            try {
                try {
                    try {
                        kzoVar2 = new kzo((zznd) ((zzru) tmiVar.get()).a(build, new zzna(b.k.y())), new uif(5, 2, 17));
                    } catch (FileNotFoundException unused2) {
                        zzlz.a(Level.INFO, zzlkVar.a(), null, "Shared storage file not found for %s", str2);
                        kzoVar2 = new kzo(null, new uif(8, 17));
                        uif uifVar = kzoVar2.b;
                        zzndVar = kzoVar2.a;
                        if (zzndVar != null) {
                        }
                    }
                } catch (zzaeh e2) {
                    zzlz.a(Level.SEVERE, zzlkVar.a(), e2, "Failed to parse snapshot from shared storage for %s", str2);
                    kzoVar2 = new kzo(null, new uif(9, 17));
                    uif uifVar2 = kzoVar2.b;
                    zzndVar = kzoVar2.a;
                    if (zzndVar != null) {
                    }
                }
            } finally {
                StrictMode.setThreadPolicy(threadPolicy);
            }
        }
        uif uifVar22 = kzoVar2.b;
        zzndVar = kzoVar2.a;
        if (zzndVar != null) {
            return new n72(zzndVar, uifVar22);
        }
        try {
            return new n72((zzqv) ((zzru) tmiVar.get()).a(this.b, new zzss(zzqv.F().m())), new uif(4, uifVar22.c, 17));
        } catch (IOException | RuntimeException unused3) {
            zzlz.a(Level.INFO, zzlkVar.a(), null, "Unable to retrieve flag snapshot for %s, using defaults.", str2);
            return b() ? new n72(zznd.c, new uif(3, 16, 17)) : new n72(zzqv.F(), new uif(3, 11, 17));
        }
    }

    public final boolean b() {
        zzni c = this.a.g.c();
        return c.A() && ((AbstractCollection) c.F()).contains(zzabz.FILE);
    }
}
