package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class yno implements pno {
    public static hpo A = null;
    public static lso B = null;
    public static cso C = null;
    public static xfo D = null;
    public static gmo E = null;
    public static volatile zro w = null;
    public static final Object x = new Object();
    public static boolean y = false;
    public static long z;
    public MotionEvent a;
    public double j;
    public double k;
    public double l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final DisplayMetrics s;
    public final hro t;
    public final yih u;
    public kso v;
    public final LinkedList b = new LinkedList();
    public long c = 0;
    public long d = 0;
    public long e = 0;
    public long f = 0;
    public long g = 0;
    public long h = 0;
    public long i = 0;
    public boolean q = false;
    public boolean r = false;

    public yno(Context context, yih yihVar) {
        try {
            ogo.a();
            this.s = context.getResources().getDisplayMetrics();
            if (((Boolean) bwo.e.c.a(exo.q)).booleanValue()) {
                this.t = new hro();
            }
        } catch (Throwable unused) {
        }
        new HashMap();
        this.u = yihVar;
    }

    public static zro k(Context context, boolean z2) {
        if (w == null) {
            synchronized (x) {
                try {
                    if (w == null) {
                        zro a = zro.a(context, z2, E);
                        if (a.n) {
                            try {
                                if (((Boolean) bwo.e.c.a(exo.s)).booleanValue()) {
                                    a.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) bwo.e.c.a(exo.v)).booleanValue()) {
                                a.c("iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", new Class[0]);
                            }
                            a.c("00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", Context.class);
                            a.c("XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", Context.class);
                            a.c("m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", Context.class);
                            a.c("P28XMQKwxb7t4RJM54Abd563bFUm9uASQiuwtqttjr6XDpyPt/FmHs2sVrWjtmTo", "fagQaENWAKeTH7PQjt5vlJiCBcOZOOnM19vGSn9sDlA=", Context.class);
                            Class cls = Boolean.TYPE;
                            a.c("IIcYtgV+jKyhXEWTRGryYoN4Hb3AaxkKFvJa61B8IsfExxFOrLfbygLFTq7UIHav", "0Td4x6cMqS7UG7AA2zcqm+bK2AW+gIwIgEtwqP1CguA=", Context.class, cls);
                            a.c("GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", Context.class);
                            a.c("2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", Context.class);
                            a.c("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=", MotionEvent.class, DisplayMetrics.class);
                            a.c("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=", MotionEvent.class, DisplayMetrics.class);
                            a.c("y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", new Class[0]);
                            a.c("9v14GmYq1mityfaROUYQVHNDWlAgc2TzwyjcWsJSVQ5o6aEyLVnDo4vbeNXmh2ew", "zGbmNDn+uB00oiAu0ISzPA2QynMDAioh3MLj5VQvTcg=", new Class[0]);
                            a.c("XQdLYJkQLpAC0Ie4wfLqMhdIIwn1qr11ViPPFEC485DwlLnjXHhmJUbAoJDOqgC4", "EiIklDudUBV1tLFQO3J+6veHT/B2kTFeB6bPUIAs1V0=", new Class[0]);
                            a.c("c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", new Class[0]);
                            a.c("AeJvLHy+YL60Equ2/UpZQs9Ok34RPgGTn80fnG3Dx4JfdgAW65En0T0IJD/U8yYs", "sawjrbkZQHxExWkkVyDhv0h3fWiUMmvl7E2YVLpKa+A=", new Class[0]);
                            a.c("Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", new Class[0]);
                            a.c("Y4Si1UCd8xFA1yCw6ohazV+GUSwhVa9ffV9ZnN++nWMAkqLsgU7cmmd4wBpbGVgj", "1k+Az7ZOHMkdpE7lGA2cF/gUEsamDqjjLqQDV0dmR3A=", Context.class, cls, String.class);
                            a.c("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", StackTraceElement[].class);
                            a.c("K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", View.class, DisplayMetrics.class, cls, cls);
                            a.c("NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", Context.class, cls);
                            a.c("9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", View.class, Activity.class, cls);
                            Class cls2 = Long.TYPE;
                            a.c("CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", cls2);
                            a.c("PmZORt2h3FILlRchj3l8QFpH1b4WBi8LAKFq8qXvSXgGWHByOiAJxaqMK9WTkxzB", "Ox3joL3a7fFzYIlEQut3utwsOQDntBqHwHmTdzF1H8c=", new Class[0]);
                            a.c("sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", Context.class);
                            a.c("Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", Context.class);
                            a.c("0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", NetworkCapabilities.class, cls2, cls2);
                            a.c("/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", List.class);
                            a.c("4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", cls2, cls2, cls2, cls2);
                        }
                        w = a;
                    }
                } finally {
                }
            }
        }
        return w;
    }

    public static eso l(zro zroVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d = zroVar.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (d == null || motionEvent == null) {
            throw new fro();
        }
        try {
            return new eso((String) d.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new fro(e);
        }
    }

    public static final void n(List list) {
        ExecutorService executorService;
        if (w == null || (executorService = w.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) bwo.e.c.a(exo.k)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        }
    }

    @Override // defpackage.pno
    public final String a(Context context, View view, Activity activity) {
        return j(context, null, 2, view, activity);
    }

    @Override // defpackage.pno
    public final synchronized void b(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.q) {
                i();
                this.q = false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.j = 0.0d;
                this.k = motionEvent.getRawX();
                this.l = motionEvent.getRawY();
            } else if (action == 1 || action == 2) {
                double rawX = motionEvent.getRawX();
                double rawY = motionEvent.getRawY();
                double d = rawX - this.k;
                double d2 = rawY - this.l;
                this.j += Math.sqrt((d2 * d2) + (d * d));
                this.k = rawX;
                this.l = rawY;
            }
            int action2 = motionEvent.getAction();
            if (action2 != 0) {
                try {
                    if (action2 == 1) {
                        MotionEvent obtain = MotionEvent.obtain(motionEvent);
                        this.a = obtain;
                        LinkedList linkedList = this.b;
                        linkedList.add(obtain);
                        if (linkedList.size() > 6) {
                            ((MotionEvent) linkedList.remove()).recycle();
                        }
                        this.e++;
                        this.g = h(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.d += motionEvent.getHistorySize() + 1;
                        eso g = g(motionEvent);
                        Long l2 = g.d;
                        if (l2 != null && g.g != null) {
                            this.h = l2.longValue() + g.g.longValue() + this.h;
                        }
                        if (this.s != null && (l = g.e) != null && g.h != null) {
                            this.i = l.longValue() + g.h.longValue() + this.i;
                        }
                    } else if (action2 == 3) {
                        this.f++;
                    }
                } catch (fro unused) {
                }
            } else {
                this.m = motionEvent.getX();
                this.n = motionEvent.getY();
                this.o = motionEvent.getRawX();
                this.p = motionEvent.getRawY();
                this.c++;
            }
            this.r = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pno
    public final void c(View view) {
        if (((Boolean) bwo.e.c.a(exo.n)).booleanValue()) {
            kso ksoVar = this.v;
            if (ksoVar == null) {
                zro zroVar = w;
                kso ksoVar2 = new kso(zroVar.a, zroVar.o);
                this.v = ksoVar2;
                ksoVar = ksoVar2;
            }
            ksoVar.a(view);
        }
    }

    @Override // defpackage.pno
    public final String d(Context context, String str, View view, Activity activity) {
        return j(context, str, 3, view, activity);
    }

    @Override // defpackage.pno
    public final synchronized void e(int i, int i2, int i3) {
        try {
            if (this.a != null) {
                if (((Boolean) bwo.e.c.a(exo.h)).booleanValue()) {
                    i();
                } else {
                    this.a.recycle();
                }
            }
            DisplayMetrics displayMetrics = this.s;
            if (displayMetrics != null) {
                float f = displayMetrics.density;
                this.a = MotionEvent.obtain(0L, i3, 1, i * f, i2 * f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0);
            } else {
                this.a = null;
            }
            this.r = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final s9n f(Context context) {
        long j;
        lso lsoVar = B;
        if (lsoVar != null && lsoVar.d) {
            lsoVar.b = System.currentTimeMillis();
        }
        cso csoVar = C;
        csoVar.b = csoVar.a;
        csoVar.a = SystemClock.uptimeMillis();
        s9n m0 = cmn.m0();
        yih yihVar = this.u;
        String str = (String) yihVar.c;
        if (!TextUtils.isEmpty(str)) {
            m0.b();
            ((cmn) m0.b).p0(str);
        }
        zro k = k(context, yihVar.b);
        if (k.b != null) {
            int e = k.e();
            ArrayList arrayList = new ArrayList();
            if (k.n) {
                arrayList.add(new wso(k, m0, e, context, (i4n) yihVar.d, D));
                arrayList.add(new ato(k, m0, z, e));
                arrayList.add(new zso(k, m0, e, 3));
                arrayList.add(new mso(k, m0, e, context));
                arrayList.add(new zso(k, m0, e, 4));
                arrayList.add(new vso(k, m0, e, context));
                arrayList.add(new zso(k, m0, e, 7));
                arrayList.add(new zso(k, m0, e, 9));
                arrayList.add(new zso(k, m0, e, 10));
                arrayList.add(new zso(k, m0, e, 0));
                arrayList.add(new zso(k, m0, e, 2));
                arrayList.add(new zso(k, m0, e, 13));
                arrayList.add(new zso(k, m0, e, 6));
                arrayList.add(new zso(k, m0, e, 12));
                arrayList.add(new zto(k, m0, e));
                lso lsoVar2 = B;
                long j2 = -1;
                if (lsoVar2 != null) {
                    long j3 = lsoVar2.d ? lsoVar2.b - lsoVar2.a : -1L;
                    long j4 = lsoVar2.c;
                    lsoVar2.c = -1L;
                    j2 = j3;
                    j = j4;
                } else {
                    j = -1;
                }
                arrayList.add(new jto(k, m0, e, A, j2, j));
                arrayList.add(new zso(k, m0, e, 11));
                zso zsoVar = new zso(k, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", m0, e, 76, 8);
                m0 = m0;
                arrayList.add(zsoVar);
                arrayList.add(new zso(k, m0, e, 5));
                if (((Boolean) bwo.e.c.a(exo.v)).booleanValue()) {
                    zso zsoVar2 = new zso(k, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", m0, e, 82, 1);
                    m0 = m0;
                    arrayList.add(zsoVar2);
                }
            } else {
                m0.b();
                ((cmn) m0.b).z0(16384L);
            }
            n(arrayList);
        }
        return m0;
    }

    public final eso g(MotionEvent motionEvent) {
        Method d = w.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (d == null || motionEvent == null) {
            throw new fro();
        }
        try {
            return new eso((String) d.invoke(null, motionEvent, this.s));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new fro(e);
        }
    }

    public final long h(StackTraceElement[] stackTraceElementArr) {
        Method d = w.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (d == null || stackTraceElementArr == null) {
            throw new fro();
        }
        try {
            return new gro((String) d.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new fro(e);
        }
    }

    public final void i() {
        this.g = 0L;
        this.c = 0L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        this.h = 0L;
        this.i = 0L;
        LinkedList linkedList = this.b;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.a;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.a = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0117 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(Context context, String str, int i, View view, Activity activity) {
        ino inoVar;
        String str2;
        boolean z2;
        int i2;
        Exception exc;
        s9n s9nVar;
        int i3;
        int i4;
        int i5;
        byte[] b;
        int i6;
        int i7 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) bwo.e.c.a(exo.j)).booleanValue();
        if (booleanValue) {
            inoVar = w != null ? w.k : null;
            str2 = "be";
        } else {
            inoVar = null;
            str2 = null;
        }
        try {
            if (i7 == 3) {
                try {
                    lso lsoVar = B;
                    if (lsoVar != null && lsoVar.d) {
                        lsoVar.b = System.currentTimeMillis();
                    }
                    cso csoVar = C;
                    csoVar.h = csoVar.g;
                    csoVar.g = SystemClock.uptimeMillis();
                    s9nVar = cmn.m0();
                    yih yihVar = this.u;
                    String str3 = (String) yihVar.c;
                    if (!TextUtils.isEmpty(str3)) {
                        s9nVar.b();
                        ((cmn) s9nVar.b).p0(str3);
                    }
                    i3 = 3;
                    m(k(context, yihVar.b), s9nVar, view, activity, true, context);
                    try {
                        this.q = true;
                        i6 = 1002;
                    } catch (Exception e) {
                        exc = e;
                        z2 = true;
                        i2 = 2;
                        if (booleanValue && inoVar != null) {
                            if (i7 != i3) {
                                i5 = 1003;
                            } else if (i7 == i2) {
                                i5 = 1009;
                            } else {
                                i4 = 1001;
                                i7 = z2 ? 1 : 0;
                                inoVar.a(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                            }
                            i4 = i5;
                            inoVar.a(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        if (s9nVar != null) {
                        }
                        return Integer.toString(5);
                    }
                } catch (Exception e2) {
                    e = e2;
                    i3 = 3;
                    z2 = true;
                    i2 = 2;
                    exc = e;
                    s9nVar = null;
                    if (booleanValue) {
                        if (i7 != i3) {
                        }
                        i4 = i5;
                        inoVar.a(i4, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (s9nVar != null) {
                    }
                    return Integer.toString(5);
                }
            } else {
                i3 = 3;
                if (i7 == 2) {
                    lso lsoVar2 = B;
                    if (lsoVar2 != null && lsoVar2.d) {
                        lsoVar2.b = System.currentTimeMillis();
                    }
                    C.a(context, view);
                    s9nVar = cmn.m0();
                    yih yihVar2 = this.u;
                    String str4 = (String) yihVar2.c;
                    s9nVar.b();
                    ((cmn) s9nVar.b).p0(str4);
                    m(k(context, yihVar2.b), s9nVar, view, activity, false, context);
                    i6 = 1008;
                } else {
                    s9nVar = f(context);
                    i6 = 1000;
                }
            }
            if (!booleanValue || inoVar == null) {
                z2 = true;
                i2 = 2;
            } else {
                try {
                    i2 = 2;
                    z2 = true;
                } catch (Exception e3) {
                    e = e3;
                    z2 = true;
                    i2 = 2;
                }
                try {
                    inoVar.a(i6, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    if (booleanValue) {
                    }
                    long currentTimeMillis222 = System.currentTimeMillis();
                    if (s9nVar != null) {
                    }
                    return Integer.toString(5);
                }
            }
        } catch (Exception e5) {
            e = e5;
        }
        long currentTimeMillis2222 = System.currentTimeMillis();
        if (s9nVar != null) {
            try {
                if (((cmn) s9nVar.c()).e() != 0) {
                    cmn cmnVar = (cmn) s9nVar.c();
                    boolean z3 = ogo.a;
                    npn b2 = ogo.b(str, cmnVar.b());
                    if (b2 == null) {
                        s9n m0 = cmn.m0();
                        m0.b();
                        ((cmn) m0.b).z0(4096L);
                        b = ogo.d(str, ((cmn) m0.c()).b(), z2);
                    } else {
                        b = ((vpn) b2.c()).b();
                    }
                    String encodeToString = Base64.encodeToString(b, 11);
                    if (!booleanValue || inoVar == null) {
                        return encodeToString;
                    }
                    inoVar.a(i7 == i3 ? 1006 : i7 == i2 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, null);
                    return encodeToString;
                }
            } catch (Exception e6) {
                String num = Integer.toString(7);
                if (!booleanValue || inoVar == null) {
                    return num;
                }
                inoVar.a(i7 == i3 ? 1007 : i7 == i2 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis2222, str2, e6);
                return num;
            }
        }
        return Integer.toString(5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.util.List] */
    public final void m(zro zroVar, s9n s9nVar, View view, Activity activity, boolean z2, Context context) {
        bwo bwoVar;
        long j;
        long j2;
        long j3;
        MotionEvent motionEvent;
        ArrayList arrayList;
        int i = 19;
        if (zroVar.n) {
            synchronized (this) {
                try {
                    try {
                        eso l = l(zroVar, this.a, this.s);
                        Long l2 = l.a;
                        if (l2 != null) {
                            long longValue = l2.longValue();
                            s9nVar.b();
                            ((cmn) s9nVar.b).v0(longValue);
                        }
                        Long l3 = l.b;
                        if (l3 != null) {
                            long longValue2 = l3.longValue();
                            s9nVar.b();
                            ((cmn) s9nVar.b).w0(longValue2);
                        }
                        Long l4 = l.c;
                        if (l4 != null) {
                            long longValue3 = l4.longValue();
                            s9nVar.b();
                            ((cmn) s9nVar.b).x0(longValue3);
                        }
                        if (this.r) {
                            Long l5 = l.d;
                            if (l5 != null) {
                                long longValue4 = l5.longValue();
                                s9nVar.b();
                                ((cmn) s9nVar.b).w(longValue4);
                            }
                            Long l6 = l.e;
                            if (l6 != null) {
                                long longValue5 = l6.longValue();
                                s9nVar.b();
                                ((cmn) s9nVar.b).x(longValue5);
                            }
                        }
                    } catch (fro unused) {
                    }
                    qkn s = dln.s();
                    if (this.c > 0) {
                        DisplayMetrics displayMetrics = this.s;
                        if ((displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true) {
                            long i0 = m6k.i0(this.j, displayMetrics);
                            s.b();
                            ((dln) s.b).E(i0);
                            long i02 = m6k.i0(this.o - this.m, this.s);
                            s.b();
                            ((dln) s.b).F(i02);
                            long i03 = m6k.i0(this.p - this.n, this.s);
                            s.b();
                            ((dln) s.b).G(i03);
                            long i04 = m6k.i0(this.m, this.s);
                            s.b();
                            ((dln) s.b).J(i04);
                            long i05 = m6k.i0(this.n, this.s);
                            s.b();
                            ((dln) s.b).K(i05);
                            if (this.r && (motionEvent = this.a) != null) {
                                long i06 = m6k.i0(((this.m - this.o) + motionEvent.getRawX()) - this.a.getX(), this.s);
                                if (i06 != 0) {
                                    s.b();
                                    ((dln) s.b).H(i06);
                                }
                                long i07 = m6k.i0(((this.n - this.p) + this.a.getRawY()) - this.a.getY(), this.s);
                                if (i07 != 0) {
                                    s.b();
                                    ((dln) s.b).I(i07);
                                }
                            }
                        }
                    }
                    try {
                        eso g = g(this.a);
                        Long l7 = g.a;
                        if (l7 != null) {
                            long longValue6 = l7.longValue();
                            s.b();
                            ((dln) s.b).t(longValue6);
                        }
                        Long l8 = g.b;
                        if (l8 != null) {
                            long longValue7 = l8.longValue();
                            s.b();
                            ((dln) s.b).u(longValue7);
                        }
                        long longValue8 = g.c.longValue();
                        s.b();
                        ((dln) s.b).A(longValue8);
                        if (this.r) {
                            Long l9 = g.e;
                            if (l9 != null) {
                                long longValue9 = l9.longValue();
                                s.b();
                                ((dln) s.b).v(longValue9);
                            }
                            Long l10 = g.d;
                            if (l10 != null) {
                                long longValue10 = l10.longValue();
                                s.b();
                                ((dln) s.b).y(longValue10);
                            }
                            Long l11 = g.f;
                            if (l11 != null) {
                                int i2 = l11.longValue() != 0 ? 2 : 1;
                                s.b();
                                ((dln) s.b).L(i2);
                            }
                            long j4 = this.d;
                            if (j4 > 0) {
                                DisplayMetrics displayMetrics2 = this.s;
                                Long valueOf = displayMetrics2 != null && (displayMetrics2.density > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (displayMetrics2.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.i / j4)) : null;
                                if (valueOf != null) {
                                    long longValue11 = valueOf.longValue();
                                    s.b();
                                    ((dln) s.b).w(longValue11);
                                } else {
                                    s.b();
                                    ((dln) s.b).x();
                                }
                                long round = Math.round(this.h / this.d);
                                s.b();
                                ((dln) s.b).z(round);
                            }
                            Long l12 = g.i;
                            if (l12 != null) {
                                long longValue12 = l12.longValue();
                                s.b();
                                ((dln) s.b).C(longValue12);
                            }
                            Long l13 = g.j;
                            if (l13 != null) {
                                long longValue13 = l13.longValue();
                                s.b();
                                ((dln) s.b).B(longValue13);
                            }
                            Long l14 = g.k;
                            if (l14 != null) {
                                int i3 = l14.longValue() != 0 ? 2 : 1;
                                s.b();
                                ((dln) s.b).M(i3);
                            }
                        }
                    } catch (fro unused2) {
                    }
                    long j5 = this.g;
                    if (j5 > 0) {
                        s.b();
                        ((dln) s.b).D(j5);
                    }
                    dln dlnVar = (dln) s.c();
                    s9nVar.b();
                    ((cmn) s9nVar.b).J(dlnVar);
                    long j6 = this.c;
                    if (j6 > 0) {
                        s9nVar.b();
                        ((cmn) s9nVar.b).A(j6);
                    }
                    long j7 = this.d;
                    if (j7 > 0) {
                        s9nVar.b();
                        ((cmn) s9nVar.b).z(j7);
                    }
                    long j8 = this.e;
                    if (j8 > 0) {
                        s9nVar.b();
                        ((cmn) s9nVar.b).y(j8);
                    }
                    long j9 = this.f;
                    if (j9 > 0) {
                        s9nVar.b();
                        ((cmn) s9nVar.b).B(j9);
                    }
                    try {
                        LinkedList linkedList = this.b;
                        int size = linkedList.size() - 1;
                        if (size > 0) {
                            s9nVar.b();
                            ((cmn) s9nVar.b).L();
                            for (int i4 = 0; i4 < size; i4++) {
                                eso l15 = l(w, (MotionEvent) linkedList.get(i4), this.s);
                                qkn s2 = dln.s();
                                long longValue14 = l15.a.longValue();
                                s2.b();
                                ((dln) s2.b).t(longValue14);
                                long longValue15 = l15.b.longValue();
                                s2.b();
                                ((dln) s2.b).u(longValue15);
                                dln dlnVar2 = (dln) s2.c();
                                s9nVar.b();
                                ((cmn) s9nVar.b).K(dlnVar2);
                            }
                        }
                    } catch (fro unused3) {
                        s9nVar.b();
                        ((cmn) s9nVar.b).L();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList = arrayList2;
            if (zroVar.b != null) {
                int e = zroVar.e();
                kwo kwoVar = exo.p;
                bwo bwoVar2 = bwo.e;
                if (((Boolean) bwoVar2.c.a(kwoVar)).booleanValue()) {
                    arrayList2.add(new wso(zroVar, s9nVar, e, context, (i4n) this.u.d, D));
                    arrayList2.add(new vso(zroVar, s9nVar, e, context));
                    arrayList2.add(new mso(zroVar, s9nVar, e, context));
                    arrayList2.add(new zso(zroVar, s9nVar, e, 4));
                    lso lsoVar = B;
                    if (lsoVar != null) {
                        if (lsoVar.d) {
                            bwoVar = bwoVar2;
                            j3 = lsoVar.b - lsoVar.a;
                        } else {
                            bwoVar = bwoVar2;
                            j3 = -1;
                        }
                        long j10 = lsoVar.c;
                        lsoVar.c = -1L;
                        j2 = j3;
                        j = j10;
                    } else {
                        bwoVar = bwoVar2;
                        j = -1;
                        j2 = -1;
                    }
                    arrayList2.add(new jto(zroVar, s9nVar, e, A, j2, j));
                    arrayList2.add(new zso(zroVar, s9nVar, e, 11));
                } else {
                    bwoVar = bwoVar2;
                }
                arrayList2.add(new een(i, zroVar, s9nVar));
                arrayList2.add(new zso(zroVar, s9nVar, e, 3));
                arrayList2.add(new ato(zroVar, s9nVar, z, e));
                arrayList2.add(new zso(zroVar, s9nVar, e, 0));
                arrayList2.add(new zso(zroVar, s9nVar, e, 9));
                arrayList2.add(new zso(zroVar, s9nVar, e, 10));
                arrayList2.add(new zso(zroVar, s9nVar, e, 2));
                arrayList2.add(new zso(zroVar, s9nVar, e, 7));
                arrayList2.add(new zso(zroVar, s9nVar, e, 13));
                arrayList2.add(new zso(zroVar, s9nVar, e, 6));
                arrayList2.add(new zso(zroVar, s9nVar, e, 12));
                arrayList2.add(new fto(zroVar, s9nVar, e, new Throwable().getStackTrace()));
                arrayList2.add(new fto(zroVar, s9nVar, e, view));
                arrayList2.add(new zto(zroVar, s9nVar, e));
                bwo bwoVar3 = bwoVar;
                if (((Boolean) bwoVar3.c.a(exo.l)).booleanValue()) {
                    arrayList2.add(new mso(zroVar, s9nVar, e, view, activity));
                }
                arrayList2.add(new zso(zroVar, s9nVar, e, 5));
                if (z2) {
                    arrayList = arrayList2;
                    if (((Boolean) bwoVar3.c.a(exo.n)).booleanValue()) {
                        arrayList2.add(new huo(zroVar, s9nVar, e, this.v));
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList2.add(new fto(zroVar, s9nVar, e, C));
                    arrayList2.add(new fto(zroVar, s9nVar, e, this.t));
                    arrayList = arrayList2;
                }
            }
        } else {
            s9nVar.b();
            ((cmn) s9nVar.b).z0(16384L);
            arrayList = Arrays.asList(new een(i, zroVar, s9nVar));
        }
        n(arrayList);
    }

    @Override // defpackage.pno
    public final boolean zze() {
        return true;
    }

    @Override // defpackage.pno
    public final boolean zzf() {
        return true;
    }

    @Override // defpackage.pno
    public final String zzl(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return j(context, null, 1, null, null);
        }
        a70.r("The caller must not be called from the UI thread.");
        return null;
    }
}
