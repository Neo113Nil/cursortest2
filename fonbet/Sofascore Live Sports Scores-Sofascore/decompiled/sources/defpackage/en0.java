package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzaaq;
import com.google.android.gms.internal.ads.zzaat;
import com.google.android.gms.internal.ads.zzabc;
import com.google.android.gms.internal.ads.zzbg;
import com.google.android.gms.internal.ads.zzgxj;
import com.google.android.gms.internal.ads.zzgxm;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.ironsource.C4427z5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class en0 implements rkd, pl6, zzaat {
    public static volatile int f = 1;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object d;
    public Object e;

    public en0(int i) {
        this.a = i;
        switch (i) {
            case 7:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new eij(1);
                break;
            case 8:
            default:
                this.c = new float[16];
                this.d = new float[16];
                this.e = new eij(0);
                break;
            case 9:
                this.c = new Object();
                this.d = new ArrayList();
                this.e = new ArrayList();
                this.b = true;
                break;
        }
    }

    public static void k(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / sqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / sqrt;
        fArr[8] = (-f5) / sqrt;
        fArr[10] = f4;
    }

    public static void l(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f2 = fArr2[10];
        float f3 = fArr2[8];
        float sqrt = (float) Math.sqrt((f3 * f3) + (f2 * f2));
        float f4 = fArr2[10] / sqrt;
        fArr[0] = f4;
        float f5 = fArr2[8];
        fArr[2] = f5 / sqrt;
        fArr[8] = (-f5) / sqrt;
        fArr[10] = f4;
    }

    public static en0 x(Context context, Executor executor, boolean z) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        if (z) {
            executor.execute(new yuo(5, context, taskCompletionSource));
        } else {
            executor.execute(new j4n(3, taskCompletionSource));
        }
        return new en0(context, executor, taskCompletionSource.getTask(), z);
    }

    public Task A(int i, long j, Exception exc, String str, String str2) {
        if (!this.b) {
            return ((Task) this.e).continueWith((Executor) this.d, new Continuation() { // from class: yyo
                @Override // com.google.android.gms.tasks.Continuation
                public final /* synthetic */ Object then(Task task) {
                    return new Boolean(task.isSuccessful());
                }
            });
        }
        Context context = (Context) this.c;
        lyo s = w3p.s();
        String packageName = context.getPackageName();
        s.b();
        ((w3p) s.b).t(packageName);
        s.b();
        ((w3p) s.b).u(j);
        int i2 = f;
        s.b();
        ((w3p) s.b).z(i2);
        if (exc != null) {
            Object obj = j2p.a;
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            String stringWriter2 = stringWriter.toString();
            s.b();
            ((w3p) s.b).v(stringWriter2);
            String name = exc.getClass().getName();
            s.b();
            ((w3p) s.b).w(name);
        }
        if (str2 != null) {
            s.b();
            ((w3p) s.b).x(str2);
        }
        if (str != null) {
            s.b();
            ((w3p) s.b).y(str);
        }
        return ((Task) this.e).continueWith((Executor) this.d, new yz1(s, i, 22));
    }

    @Override // defpackage.rkd
    public void a(k55 k55Var) {
        cm5 cm5Var = (cm5) this.e;
        while (true) {
            k55 k55Var2 = (k55) cm5Var.get();
            if (k55Var2 == r55.a) {
                k55Var.d();
                return;
            }
            while (!cm5Var.compareAndSet(k55Var2, k55Var)) {
                if (cm5Var.get() != k55Var2) {
                    break;
                }
            }
            if (k55Var2 != null) {
                k55Var2.d();
                return;
            }
            return;
        }
    }

    public void b() {
        switch (this.a) {
            case 2:
                ((k45) this.e).f(this, false);
                return;
            default:
                l45 l45Var = (l45) this.e;
                synchronized (l45Var) {
                    try {
                        if (this.b) {
                            throw new IllegalStateException("Check failed.");
                        }
                        if (Intrinsics.c(((a45) this.c).g, this)) {
                            l45Var.i(this, false);
                        }
                        this.b = true;
                        Unit unit = Unit.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    public void c(long j, String str) {
        f(str, String.valueOf(j));
    }

    public void d(String str, boolean z) {
        f(str, String.valueOf(z));
    }

    public void e(Object obj, String str) {
        sx2 sx2Var = new sx2();
        ((sx2) this.e).c = sx2Var;
        this.e = sx2Var;
        sx2Var.b = obj;
        sx2Var.a = str;
    }

    @Override // defpackage.pl6
    public void endTracks() {
        SparseArray sparseArray = (SparseArray) this.e;
        ((pl6) this.c).endTracks();
        if (this.b) {
            for (int i = 0; i < sparseArray.size(); i++) {
                ((ami) sparseArray.valueAt(i)).i = true;
            }
        }
    }

    public void f(String str, String str2) {
        ovc ovcVar = new ovc();
        ((sx2) this.e).c = ovcVar;
        this.e = ovcVar;
        ovcVar.b = str2;
        ovcVar.a = str;
    }

    public boolean g(Context context) {
        boolean z;
        boolean z2;
        int i;
        context.getClass();
        String str = (String) this.d;
        List T = aik.T(str);
        if (T == null) {
            T = km5.a;
        }
        if (!this.b || T.isEmpty()) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("The current GPP String is invalid."));
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(a5f.e(context), 0);
        if (T.contains(2)) {
            String string = sharedPreferences.getString("IABGPP_2_String", null);
            if (string == null) {
                throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("gppSid '" + str + "' contains '2' (TCFEU2) but the key IABGPP_2_String is either missing from SharedPreferences or invalid"));
            }
            ekg ekgVar = new ekg(string, true);
            if (!ekgVar.a) {
                throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat(bf3.k("gppSid '", str, "' contains '2' (TCFEU2) but the related TCF string is invalid: '", string, "'")));
            }
            z = ekgVar.a(context);
        } else {
            z = true;
        }
        if (T.contains(6)) {
            String string2 = sharedPreferences.getString("IABGPP_6_String", null);
            if (string2 == null) {
                throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("gppSid '" + str + "' contains '6' (USP1) but the key IABGPP_6_String is either missing from SharedPreferences or invalid"));
            }
            boolean matches = string2.matches("\\d[YN-]{3}");
            if (matches) {
                try {
                    i = Integer.parseInt("" + string2.toCharArray()[0]);
                } catch (NumberFormatException unused) {
                    i = -1;
                }
                if (i != 1) {
                    matches = false;
                }
            }
            if (!matches) {
                throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat(bf3.k("gppSid '", str, "' contains '6' (USP1) but the related CCPA string is invalid: '", string2, "'")));
            }
            if (!matches || string2.charAt(2) == 'Y') {
                z2 = false;
                return !z && z2;
            }
        }
        z2 = true;
        if (z) {
        }
    }

    public boolean h(Context context) {
        boolean z;
        String str;
        int i;
        context.getClass();
        String str2 = (String) this.d;
        List T = aik.T(str2);
        if (T == null) {
            T = km5.a;
        }
        if (!this.b || T.isEmpty()) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("The current GPP String is invalid."));
        }
        boolean z2 = true;
        if (!T.contains(2)) {
            return true;
        }
        String str3 = null;
        String string = context.getSharedPreferences(a5f.e(context), 0).getString("IABGPP_2_String", null);
        if (string == null) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("gppSid '" + str2 + "' contains '2' (TCFEU2) but the key IABGPP_2_String is either missing from SharedPreferences or invalid"));
        }
        char[] charArray = string.toLowerCase().toCharArray();
        int length = charArray.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = true;
                break;
            }
            if (!"abcdefghijklmnopqrstuvwxyz0123456789-_.".contains("" + charArray[i2])) {
                fjg.c().f(3);
                z = false;
                break;
            }
            i2++;
        }
        if (string.length() == 0) {
            z = false;
        }
        if (z && string.toCharArray()[0] - 'A' != 1 && i != 2) {
            z = false;
        }
        if (!z) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat(bf3.k("gppSid '", str2, "' contains '2' (TCFEU2) but the related TCF string is invalid: '", string, "'")));
        }
        if (!z) {
            return false;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(a5f.e(context), 0);
        try {
            str = sharedPreferences.getString("IABGPP_TCFEU2_VendorConsent", null);
        } catch (Exception unused) {
            str = null;
        }
        if (str == null) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("This TCFEU2 String is coming from a GPP String, but the key IABGPP_TCFEU2_VendorConsent is either missing from SharedPreferences or invalid"));
        }
        try {
            str3 = sharedPreferences.getString("IABGPP_TCFEU2_SpecialFeatureOptIns", null);
        } catch (Exception unused2) {
        }
        if (str3 == null) {
            throw new cjg("The GPP String have been badly implemented by the CMP. Reason: ".concat("This TCFEU2 String is coming from a GPP String, but the key IABGPP_TCFEU2_SpecialFeatureOptIns is either missing from SharedPreferences or invalid"));
        }
        try {
            if (str3.length() > 0) {
                boolean z3 = str3.charAt(0) == '1';
                if (str.charAt(44) != '1' || !z3) {
                    z2 = false;
                }
            }
            return z2;
        } catch (Exception unused3) {
            return false;
        }
    }

    public void i() {
        l45 l45Var = (l45) this.e;
        synchronized (l45Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (Intrinsics.c(((a45) this.c).g, this)) {
                    l45Var.i(this, true);
                }
                this.b = true;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(boolean z) {
        switch (this.a) {
            case 1:
                j45 j45Var = (j45) this.e;
                synchronized (j45Var.h) {
                    try {
                        if (this.b) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (Intrinsics.c(((y35) this.c).g, this)) {
                            j45Var.e(this, z);
                        }
                        this.b = true;
                        Unit unit = Unit.a;
                    } finally {
                    }
                }
                return;
            default:
                m45 m45Var = (m45) this.e;
                synchronized (m45Var) {
                    try {
                        if (this.b) {
                            throw new IllegalStateException("editor is closed");
                        }
                        if (Intrinsics.c(((b45) this.c).g, this)) {
                            m45Var.e(this, z);
                        }
                        this.b = true;
                        Unit unit2 = Unit.a;
                    } finally {
                    }
                }
                return;
        }
    }

    @Override // defpackage.pl6
    public void m(b0h b0hVar) {
        ((pl6) this.c).m(b0hVar);
    }

    public void n() {
        a45 a45Var = (a45) this.c;
        if (Intrinsics.c(a45Var.g, this)) {
            l45 l45Var = (l45) this.e;
            if (l45Var.l) {
                l45Var.i(this, false);
            } else {
                a45Var.f = true;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaat
    public s o(int i, zzbg zzbgVar, int[] iArr) {
        zzabc zzabcVar = (zzabc) this.c;
        zzaaq zzaaqVar = (zzaaq) this.d;
        e5n e5nVar = new e5n(zzabcVar, zzaaqVar);
        int i2 = ((int[]) this.e)[i];
        mio mioVar = zzgxm.b;
        zzgxj zzgxjVar = new zzgxj();
        for (int i3 = 0; i3 < zzbgVar.a; i3++) {
            zzgxjVar.c(new r4n(i, zzbgVar, i3, zzaaqVar, iArr[i3], this.b, e5nVar));
        }
        return zzgxjVar.f();
    }

    @Override // defpackage.rkd
    public void onComplete() {
        if (!this.b) {
            ((rkd) this.c).onComplete();
        } else {
            this.b = false;
            ((kkd) this.d).N(this);
        }
    }

    @Override // defpackage.rkd
    public void onError(Throwable th) {
        ((rkd) this.c).onError(th);
    }

    @Override // defpackage.rkd
    public void onNext(Object obj) {
        if (this.b) {
            this.b = false;
        }
        ((rkd) this.c).onNext(obj);
    }

    public uae p(int i) {
        uae uaeVar;
        uae uaeVar2;
        switch (this.a) {
            case 1:
                j45 j45Var = (j45) this.e;
                synchronized (j45Var.h) {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.d)[i] = true;
                    Object obj = ((y35) this.c).d.get(i);
                    v9g.A(j45Var.q, (uae) obj);
                    uaeVar = (uae) obj;
                }
                return uaeVar;
            default:
                m45 m45Var = (m45) this.e;
                synchronized (m45Var) {
                    if (this.b) {
                        throw new IllegalStateException("editor is closed");
                    }
                    ((boolean[]) this.d)[i] = true;
                    Object obj2 = ((b45) this.c).d.get(i);
                    i45 i45Var = m45Var.p;
                    uae uaeVar3 = (uae) obj2;
                    if (!i45Var.k(uaeVar3)) {
                        l.a(i45Var.H(uaeVar3, false));
                    }
                    uaeVar2 = (uae) obj2;
                }
                return uaeVar2;
        }
    }

    public File q() {
        File file;
        synchronized (((k45) this.e)) {
            try {
                z35 z35Var = (z35) this.c;
                if (z35Var.f != this) {
                    throw new IllegalStateException();
                }
                if (!z35Var.e) {
                    ((boolean[]) this.d)[0] = true;
                }
                file = z35Var.d[0];
                ((k45) this.e).a.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public synchronized void r() {
        try {
            if (this.b) {
                return;
            }
            Boolean u = u();
            this.d = u;
            if (u == null) {
                vp2 vp2Var = new vp2(29);
                rv5 rv5Var = (rv5) ((hki) this.c);
                rv5Var.getClass();
                rv5Var.a(f9k.a, vp2Var);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean s() {
        Boolean bool;
        try {
            r();
            bool = (Boolean) this.d;
        } catch (Throwable th) {
            throw th;
        }
        return bool != null ? bool.booleanValue() : ((FirebaseMessaging) this.e).a.g();
    }

    public ejh t(int i) {
        l45 l45Var = (l45) this.e;
        synchronized (l45Var) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!Intrinsics.c(((a45) this.c).g, this)) {
                    return new fx1();
                }
                if (!((a45) this.c).e) {
                    boolean[] zArr = (boolean[]) this.d;
                    zArr.getClass();
                    zArr[i] = true;
                }
                uae uaeVar = (uae) ((a45) this.c).d.get(i);
                try {
                    h45 h45Var = l45Var.b;
                    h45Var.getClass();
                    uaeVar.getClass();
                    return new sq7(h45Var.H(uaeVar, false), new r82(18, l45Var, this));
                } catch (FileNotFoundException unused) {
                    return new fx1();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.a) {
            case 10:
                boolean z = this.b;
                StringBuilder sb = new StringBuilder(32);
                sb.append((String) this.c);
                sb.append('{');
                String str = "";
                for (sx2 sx2Var = (sx2) ((sx2) this.d).c; sx2Var != null; sx2Var = (sx2) sx2Var.c) {
                    Object obj = sx2Var.b;
                    if ((sx2Var instanceof ovc) || obj != null || !z) {
                        sb.append(str);
                        String str2 = (String) sx2Var.a;
                        if (str2 != null) {
                            sb.append(str2);
                            sb.append(C4427z5.U);
                        }
                        if (obj == null || !obj.getClass().isArray()) {
                            sb.append(obj);
                        } else {
                            String deepToString = Arrays.deepToString(new Object[]{obj});
                            sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                        }
                        str = ", ";
                    }
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // defpackage.pl6
    /* renamed from: track */
    public vsj mo2track(int i, int i2) {
        SparseArray sparseArray = (SparseArray) this.e;
        pl6 pl6Var = (pl6) this.c;
        if (i2 != 3 && i2 != 5) {
            this.b = true;
        }
        if (i2 != 3) {
            return pl6Var.mo2track(i, i2);
        }
        ami amiVar = (ami) sparseArray.get(i);
        if (amiVar != null) {
            return amiVar;
        }
        ami amiVar2 = new ami(pl6Var.mo2track(i, i2), (xli) this.d);
        sparseArray.put(i, amiVar2);
        return amiVar2;
    }

    public Boolean u() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        r38 r38Var = ((FirebaseMessaging) this.e).a;
        r38Var.a();
        Context context = r38Var.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void v(boolean z) {
        if (z == this.b) {
            return;
        }
        zqi zqiVar = (zqi) this.e;
        if (z) {
            final int i = 0;
            zqiVar.e(new Runnable(this) { // from class: bn0
                public final /* synthetic */ en0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = i;
                    en0 en0Var = this.b;
                    switch (i2) {
                        case 0:
                            ((Context) en0Var.c).registerReceiver((dn0) en0Var.d, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) en0Var.c).unregisterReceiver((dn0) en0Var.d);
                            break;
                    }
                }
            });
            this.b = true;
        } else {
            final int i2 = 1;
            zqiVar.e(new Runnable(this) { // from class: bn0
                public final /* synthetic */ en0 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i22 = i2;
                    en0 en0Var = this.b;
                    switch (i22) {
                        case 0:
                            ((Context) en0Var.c).registerReceiver((dn0) en0Var.d, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            ((Context) en0Var.c).unregisterReceiver((dn0) en0Var.d);
                            break;
                    }
                }
            });
            this.b = false;
        }
    }

    public boolean w(String str, String str2) {
        synchronized (this) {
            try {
                if (!((wja) ((AtomicMarkableReference) this.c).getReference()).b(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.c;
                atomicMarkableReference.set((wja) atomicMarkableReference.getReference(), true);
                t4f t4fVar = new t4f(this, 20);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, t4fVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((xx3) ((hcc) ((r18) this.e).c).c).g(t4fVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void y(int i, long j) {
        A(i, j, null, null, null);
    }

    public void z(int i, long j, Exception exc) {
        A(i, j, exc, null, null);
    }

    public /* synthetic */ en0(zzabc zzabcVar, zzaaq zzaaqVar, boolean z, int[] iArr) {
        this.a = 17;
        this.c = zzabcVar;
        this.d = zzaaqVar;
        this.b = z;
        this.e = iArr;
    }

    public en0(String str, String str2, int i) {
        bjg bjgVar;
        this.a = 13;
        this.c = str;
        this.d = str2;
        bjg.b.getClass();
        if (i == 1) {
            bjgVar = bjg.GPP_V1;
        } else {
            bjgVar = bjg.GPP_V_UNKNOWN;
        }
        this.e = bjgVar;
        this.b = bjgVar != bjg.GPP_V_UNKNOWN && new Regex("([A-Z]|[a-z]|\\d|\\.|~|_|-)+").f(str) && new Regex("((-1|\\d+)_)*(\\d+|-1)").f(str2);
    }

    public en0(etd etdVar) {
        this.a = 8;
        this.c = etdVar;
        this.d = new v9f(3);
        this.e = new ArrayList();
    }

    public en0(Context context, Executor executor, Task task, boolean z) {
        this.a = 18;
        this.c = context;
        this.d = executor;
        this.e = task;
        this.b = z;
    }

    public en0(rkd rkdVar, kkd kkdVar) {
        this.a = 11;
        this.c = rkdVar;
        this.d = kkdVar;
        this.b = true;
        this.e = new cm5(3);
    }

    public en0(pl6 pl6Var, xli xliVar) {
        this.a = 15;
        this.c = pl6Var;
        this.d = xliVar;
        this.e = new SparseArray();
    }

    public en0(Context context, Looper looper, Looper looper2, mg6 mg6Var) {
        this.a = 0;
        this.c = context.getApplicationContext();
        this.e = new zqi(new Handler(looper, null));
        this.d = new dn0(this, new zqi(new Handler(looper2, null)), mg6Var);
    }

    public en0(String str) {
        this.a = 10;
        sx2 sx2Var = new sx2();
        this.d = sx2Var;
        this.e = sx2Var;
        this.b = false;
        this.c = str;
    }

    public en0(ggf ggfVar, xih xihVar) {
        this.a = 14;
        this.e = new c2a(this, 4);
        this.d = ggfVar;
        this.c = xihVar;
    }

    public en0(r18 r18Var, boolean z) {
        this.a = 16;
        this.e = r18Var;
        this.d = new AtomicReference(null);
        this.b = z;
        this.c = new AtomicMarkableReference(new wja(z ? 8192 : 1024), false);
    }

    public en0(tqa tqaVar, xji xjiVar, r5f r5fVar) {
        this.a = 12;
        this.c = tqaVar;
        this.d = xjiVar;
        this.e = r5fVar;
        this.b = true;
    }

    public en0(j45 j45Var, y35 y35Var) {
        this.a = 1;
        this.e = j45Var;
        this.c = y35Var;
        this.d = new boolean[2];
    }

    public en0(m45 m45Var, b45 b45Var) {
        this.a = 4;
        this.e = m45Var;
        this.c = b45Var;
        this.d = new boolean[2];
    }

    public en0(k45 k45Var, z35 z35Var) {
        this.a = 2;
        this.e = k45Var;
        this.c = z35Var;
        this.d = z35Var.e ? null : new boolean[k45Var.g];
    }

    public en0(l45 l45Var, a45 a45Var) {
        boolean[] zArr;
        this.a = 3;
        this.e = l45Var;
        this.c = a45Var;
        if (a45Var.e) {
            zArr = null;
        } else {
            l45Var.getClass();
            zArr = new boolean[2];
        }
        this.d = zArr;
    }

    public en0(FirebaseMessaging firebaseMessaging, hki hkiVar) {
        this.a = 5;
        this.e = firebaseMessaging;
        this.c = hkiVar;
    }
}
