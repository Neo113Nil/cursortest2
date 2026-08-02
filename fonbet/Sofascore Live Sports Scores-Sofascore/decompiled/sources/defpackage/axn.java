package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.android.billingclient.api.l;
import com.android.billingclient.api.m;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.internal.play_billing.zzc;
import com.google.android.gms.internal.play_billing.zzdd;
import com.google.android.gms.internal.play_billing.zzjs;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class axn implements zzdd {
    public static HandlerThread e;
    public static Handler f;
    public int a;
    public Object b;
    public final Object c;
    public final Object d;

    public axn(Context context, int i) {
        this.d = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        tba.U(dir, false);
        this.b = dir;
        File dir2 = context.getDir("tmppccache", 0);
        tba.U(dir2, true);
        this.c = dir2;
        this.a = i;
    }

    public void a(boolean z, qwd qwdVar, x52 x52Var, boolean z2) {
        z1a.y(x52Var, "source");
        int min = Math.min(qwdVar.c, ((qwd) qwdVar.g.d).c);
        x52 x52Var2 = qwdVar.a;
        boolean z3 = x52Var2.b > 0;
        int i = (int) x52Var.b;
        if (z3 || min < i) {
            if (!z3 && min > 0) {
                qwdVar.b(min, x52Var, false);
            }
            x52Var2.W(x52Var, (int) x52Var.b);
            qwdVar.f = z | qwdVar.f;
        } else {
            qwdVar.b(i, x52Var, z);
        }
        if (z2) {
            try {
                ((zd6) this.c).flush();
            } catch (IOException e2) {
                is8.h(e2);
            }
        }
    }

    public void b(qwd qwdVar, int i) {
        if (qwdVar == null) {
            ((qwd) this.d).a(i);
            c();
            return;
        }
        qwdVar.a(i);
        zid zidVar = new zid(10);
        qwdVar.c(Math.min(qwdVar.c, ((qwd) qwdVar.g.d).c), zidVar);
        if (zidVar.b > 0) {
            try {
                ((zd6) this.c).flush();
            } catch (IOException e2) {
                is8.h(e2);
            }
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: LoopRegionVisitor
        jadx.core.utils.exceptions.JadxOverflowException: LoopRegionVisitor.assignOnlyInLoop endless recursion
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public void c() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            ood r0 = (defpackage.ood) r0
            qwd[] r1 = r0.h()
            java.util.List r2 = java.util.Arrays.asList(r1)
            java.util.Collections.shuffle(r2)
            java.lang.Object r2 = r13.d
            qwd r2 = (defpackage.qwd) r2
            int r2 = r2.c
            int r3 = r1.length
        L16:
            r4 = 0
            if (r3 <= 0) goto L6a
            if (r2 <= 0) goto L6a
            float r5 = (float) r2
            float r6 = (float) r3
            float r5 = r5 / r6
            double r5 = (double) r5
            double r5 = java.lang.Math.ceil(r5)
            int r5 = (int) r5
            r6 = r4
            r7 = r6
        L26:
            if (r7 >= r3) goto L68
            if (r2 <= 0) goto L68
            r8 = r1[r7]
            int r9 = r8.c
            x52 r10 = r8.a
            long r11 = r10.b
            int r11 = (int) r11
            int r9 = java.lang.Math.min(r9, r11)
            int r9 = java.lang.Math.max(r4, r9)
            int r11 = r8.d
            int r9 = r9 - r11
            int r9 = java.lang.Math.min(r9, r5)
            int r9 = java.lang.Math.min(r2, r9)
            if (r9 <= 0) goto L4e
            int r11 = r8.d
            int r11 = r11 + r9
            r8.d = r11
            int r2 = r2 - r9
        L4e:
            int r9 = r8.c
            long r10 = r10.b
            int r10 = (int) r10
            int r9 = java.lang.Math.min(r9, r10)
            int r9 = java.lang.Math.max(r4, r9)
            int r10 = r8.d
            int r9 = r9 - r10
            if (r9 <= 0) goto L65
            int r9 = r6 + 1
            r1[r6] = r8
            r6 = r9
        L65:
            int r7 = r7 + 1
            goto L26
        L68:
            r3 = r6
            goto L16
        L6a:
            zid r1 = new zid
            r2 = 10
            r1.<init>(r2)
            qwd[] r0 = r0.h()
            int r2 = r0.length
            r3 = r4
        L77:
            if (r3 >= r2) goto L85
            r5 = r0[r3]
            int r6 = r5.d
            r5.c(r6, r1)
            r5.d = r4
            int r3 = r3 + 1
            goto L77
        L85:
            int r0 = r1.b
            if (r0 <= 0) goto L95
            java.lang.Object r13 = r13.c     // Catch: java.io.IOException -> L91
            zd6 r13 = (defpackage.zd6) r13     // Catch: java.io.IOException -> L91
            r13.flush()     // Catch: java.io.IOException -> L91
            return
        L91:
            r13 = move-exception
            defpackage.is8.h(r13)
        L95:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axn.c():void");
    }

    public void d(Throwable th) {
        boolean z = th instanceof TimeoutException;
        l lVar = (l) this.d;
        if (z) {
            lVar.X(28, m.F, zzjs.BILLING_OVERRIDE_SERVICE_CALL_TIMEOUT);
            int i = zzc.a;
        } else {
            lVar.X(28, m.F, zzjs.BILLING_OVERRIDE_SERVICE_CALL_EXCEPTION);
            int i2 = zzc.a;
        }
        ((Runnable) this.c).run();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        if (r10 != false) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(tuo tuoVar, mxn mxnVar) {
        boolean z;
        xuo f2;
        xuo f3;
        boolean z2;
        String s = tuoVar.s().s();
        byte[] x = tuoVar.t().x();
        byte[] x2 = tuoVar.u().x();
        if (!TextUtils.isEmpty(s) && x2 != null && x2.length != 0) {
            File file = (File) this.c;
            tba.V(file);
            file.mkdirs();
            tba.T(file, s).mkdirs();
            File R = tba.R(file, s, "pcam.jar");
            if ((x == null || x.length <= 0 || tba.S(R, x)) && tba.S(tba.R(file, s, "pcbc"), x2)) {
                File R2 = tba.R(file, tuoVar.s().s(), "pcam.jar");
                if (R2.exists() && mxnVar != null) {
                    try {
                        z2 = ((xyo) mxnVar.b).a(R2);
                    } catch (GeneralSecurityException unused) {
                        z2 = false;
                    }
                }
                String s2 = tuoVar.s().s();
                if (!TextUtils.isEmpty(s2)) {
                    File R3 = tba.R(file, s2, "pcam.jar");
                    File R4 = tba.R(file, s2, "pcbc");
                    File R5 = tba.R(g(), s2, "pcam.jar");
                    File R6 = tba.R(g(), s2, "pcbc");
                    if ((!R3.exists() || R3.renameTo(R5)) && R4.exists() && R4.renameTo(R6)) {
                        vuo z3 = xuo.z();
                        String s3 = tuoVar.s().s();
                        z3.b();
                        ((xuo) z3.b).B(s3);
                        String t = tuoVar.s().t();
                        z3.b();
                        ((xuo) z3.b).C(t);
                        long v = tuoVar.s().v();
                        z3.b();
                        ((xuo) z3.b).E(v);
                        long w = tuoVar.s().w();
                        z3.b();
                        ((xuo) z3.b).F(w);
                        long u = tuoVar.s().u();
                        z3.b();
                        ((xuo) z3.b).D(u);
                        xuo xuoVar = (xuo) z3.c();
                        xuo f4 = f(1);
                        SharedPreferences.Editor edit = ((SharedPreferences) this.d).edit();
                        if (f4 != null && !xuoVar.s().equals(f4.s())) {
                            edit.putString(h(), Hex.a(f4.b()));
                        }
                        edit.putString(i(), Hex.a(xuoVar.b()));
                        if (edit.commit()) {
                            z = true;
                            HashSet hashSet = new HashSet();
                            f2 = f(1);
                            if (f2 != null) {
                                hashSet.add(f2.s());
                            }
                            f3 = f(2);
                            if (f3 != null) {
                                hashSet.add(f3.s());
                            }
                            for (File file2 : g().listFiles()) {
                                String name = file2.getName();
                                if (!hashSet.contains(name)) {
                                    tba.V(tba.T(g(), name));
                                }
                            }
                            return z;
                        }
                    }
                }
                z = false;
                HashSet hashSet2 = new HashSet();
                f2 = f(1);
                if (f2 != null) {
                }
                f3 = f(2);
                if (f3 != null) {
                }
                while (r4 < r1) {
                }
                return z;
            }
        }
        return false;
    }

    public xuo f(int i) {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        String string = i == 1 ? sharedPreferences.getString(i(), null) : sharedPreferences.getString(h(), null);
        if (!TextUtils.isEmpty(string)) {
            try {
                byte[] c = Hex.c(string);
                xuo x = xuo.x(g8n.v(0, c.length, c));
                String s = x.s();
                File R = tba.R(g(), s, "pcam.jar");
                if (!R.exists()) {
                    R = tba.R(g(), s, "pcam");
                }
                File R2 = tba.R(g(), s, "pcbc");
                if (R.exists()) {
                    if (R2.exists()) {
                        return x;
                    }
                }
            } catch (lan unused) {
            }
        }
        return null;
    }

    public File g() {
        File file = new File((File) this.b, Integer.toString(this.a - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    public String h() {
        int i = this.a - 1;
        return me4.g(i, "FBAMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public String i() {
        int i = this.a - 1;
        return me4.g(i, "LATMTD", new StringBuilder(String.valueOf(i).length() + 6));
    }

    public axn(int i, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.a = i;
        this.d = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public axn(l lVar, int i, yn3 yn3Var, Runnable runnable) {
        this.a = i;
        this.b = yn3Var;
        this.c = runnable;
        this.d = lVar;
    }

    public axn(ood oodVar, zd6 zd6Var) {
        this.b = oodVar;
        this.c = zd6Var;
        this.a = 65535;
        this.d = new qwd(this, 0, 65535, null);
    }

    public axn(UUID uuid, int i, byte[] bArr, UUID[] uuidArr) {
        this.b = uuid;
        this.a = i;
        this.c = bArr;
        this.d = uuidArr;
    }

    public axn() {
        this.b = new SparseIntArray[9];
        this.c = new ArrayList();
        this.d = new gr8(this);
        this.a = 1;
    }
}
