package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import android.text.TextUtils;
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
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class zzbbb extends zzbaz {
    public static zzbbj A = null;
    public static zzbcp B = null;
    public static zzbch C = null;
    public static zzbaa D = null;
    public static zzbbg E = null;
    public static final Object x = new Object();
    public static boolean y = false;
    public static long z;
    public final zzbba v;
    public zzbcn w;

    public zzbbb(Context context, zzbba zzbbaVar) {
        super(context);
        new HashMap();
        this.v = zzbbaVar;
    }

    public static zzbcg h(Context context, boolean z2) {
        if (zzbaz.u == null) {
            synchronized (x) {
                try {
                    if (zzbaz.u == null) {
                        zzbcg a = zzbcg.a(context, z2, E);
                        if (a.n) {
                            try {
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.r4)).booleanValue()) {
                                    a.c("dDkHRfh96kWRNKlCuQv4bcbQkP8hTl8+IryaCt9cMd/svBIVo0Uo/vCqMYwPlijS", "lGOVu04SK1qS7YTVL1GWrSv+Cf1XKJpvbu7KHhGh7cY=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            a.c("8cGCIT8G/u06HQUQMiN2ifk8cEgbx/Wk97figDVCx+GQZgadMjHBVKMl6PUoXm9E", "8+d2WBKGjAoApH75NCR/Aqn77d5NBFIHb0YR3dAdyeE=", Context.class);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v4)).booleanValue()) {
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
                        zzbaz.u = a;
                    }
                } finally {
                }
            }
        }
        return zzbaz.u;
    }

    public static zzbci i(zzbcg zzbcgVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method d = zzbcgVar.d("6fpJXJ/0mHk1BKHieJD271QStaRup/Ve1zgTWQI+7BRFgC5McwJ3e2UlmdWs2x64", "/HyusJxcst6GC6sxvcSXH3tMw8sGRae2S909c2O+Y30=");
        if (d == null || motionEvent == null) {
            throw new zzbbw();
        }
        try {
            return new zzbci((String) d.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbbw(e);
        }
    }

    public static final void k(List list) {
        ExecutorService executorService;
        if (zzbaz.u == null || (executorService = zzbaz.u.b) == null || list.isEmpty()) {
            return;
        }
        try {
            executorService.invokeAll(list, ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.B3)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            stringWriter.toString();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final zzaya a(Context context) {
        long j;
        zzbcp zzbcpVar = B;
        if (zzbcpVar != null && zzbcpVar.d) {
            zzbcpVar.b = System.currentTimeMillis();
        }
        zzbch zzbchVar = C;
        zzbchVar.b = zzbchVar.a;
        zzbchVar.a = SystemClock.uptimeMillis();
        zzaya G0 = zzaza.G0();
        zzbba zzbbaVar = this.v;
        String str = zzbbaVar.b;
        if (!TextUtils.isEmpty(str)) {
            G0.n();
            ((zzaza) G0.b).J0(str);
        }
        zzbcg h = h(context, zzbbaVar.a);
        if (h.b != null) {
            int e = h.e();
            ArrayList arrayList = new ArrayList();
            if (h.n) {
                arrayList.add(new zzbcu(h, G0, e, context, zzbbaVar.c, D));
                arrayList.add(new zzbcx(h, G0, z, e));
                arrayList.add(new zzbdg(h, G0, e));
                arrayList.add(new zzbdj(h, G0, e, context));
                arrayList.add(new zzbdo(h, G0, e));
                arrayList.add(new zzbct(h, G0, e, context));
                arrayList.add(new zzbcv(h, G0, e));
                arrayList.add(new zzbdf(h, G0, e));
                arrayList.add(new zzbdh(h, G0, e));
                arrayList.add(new zzbcw(h, G0, e));
                arrayList.add(new zzbdb(h, G0, e));
                arrayList.add(new zzbdp(h, G0, e));
                arrayList.add(new zzbcs(h, G0, e));
                arrayList.add(new zzbdm(h, G0, e));
                arrayList.add(new zzbdk(h, G0, e));
                zzbcp zzbcpVar2 = B;
                long j2 = -1;
                if (zzbcpVar2 != null) {
                    long j3 = zzbcpVar2.d ? zzbcpVar2.b - zzbcpVar2.a : -1L;
                    long j4 = zzbcpVar2.c;
                    zzbcpVar2.c = -1L;
                    j2 = j3;
                    j = j4;
                } else {
                    j = -1;
                }
                arrayList.add(new zzbde(h, G0, e, A, j2, j));
                arrayList.add(new zzbdi(h, G0, e));
                zzbdc zzbdcVar = new zzbdc(h, "Di5PWAjPtHVrwnaWVY5fRaO+JCXGdUjCOQOYEnFfzjx5tiFy99P00V458wl3+tMS", "24rToqMdm9KIBSWWVKIVzZ6Fu9mGVX1qRD30P4LVPjg=", G0, e, 76);
                G0 = G0;
                arrayList.add(zzbdcVar);
                arrayList.add(new zzbcr(h, G0, e));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.v4)).booleanValue()) {
                    zzbcy zzbcyVar = new zzbcy(h, "iCmAdyXMN2wNdoDGZPKplFblNf0e3f9Gr4uP4gCRDt/ctzDAq8UfSYwC5u9g4DzW", "9N+K+19jT0YQFPQktH9XDgnqiWtwN+75+qmtGpYeo7Q=", G0, e, 82);
                    G0 = G0;
                    arrayList.add(zzbcyVar);
                }
            } else {
                G0.r(16384L);
            }
            k(arrayList);
        }
        return G0;
    }

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final zzaya b(Context context, View view, Activity activity) {
        zzbcp zzbcpVar = B;
        if (zzbcpVar != null && zzbcpVar.d) {
            zzbcpVar.b = System.currentTimeMillis();
        }
        zzbch zzbchVar = C;
        zzbchVar.h = zzbchVar.g;
        zzbchVar.g = SystemClock.uptimeMillis();
        zzaya G0 = zzaza.G0();
        zzbba zzbbaVar = this.v;
        String str = zzbbaVar.b;
        if (!TextUtils.isEmpty(str)) {
            G0.n();
            ((zzaza) G0.b).J0(str);
        }
        j(h(context, zzbbaVar.a), G0, view, activity, true, context);
        return G0;
    }

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final zzaya c(Context context, View view, Activity activity) {
        zzbcp zzbcpVar = B;
        if (zzbcpVar != null && zzbcpVar.d) {
            zzbcpVar.b = System.currentTimeMillis();
        }
        C.a(context, view);
        zzaya G0 = zzaza.G0();
        zzbba zzbbaVar = this.v;
        String str = zzbbaVar.b;
        G0.n();
        ((zzaza) G0.b).J0(str);
        j(h(context, zzbbaVar.a), G0, view, activity, false, context);
        return G0;
    }

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final zzbci d(MotionEvent motionEvent) {
        Method d = zzbaz.u.d("t5yhqOem6jC98WR50f+SLS3Uk3sKCmIuutsKOnbEcikRe3zXPIZnZid7K20GrtZF", "M9gaAFNEKOV8YNe1CyHBBl548FwxQflqXjyA5kKaJak=");
        if (d == null || motionEvent == null) {
            throw new zzbbw();
        }
        try {
            return new zzbci((String) d.invoke(null, motionEvent, this.s));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbbw(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbaz
    public final long e(StackTraceElement[] stackTraceElementArr) {
        Method d = zzbaz.u.d("X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=");
        if (d == null || stackTraceElementArr == null) {
            throw new zzbbw();
        }
        try {
            return new zzbbx((String) d.invoke(null, stackTraceElementArr)).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzbbw(e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v29, types: [java.util.List] */
    public final void j(zzbcg zzbcgVar, zzaya zzayaVar, View view, Activity activity, boolean z2, Context context) {
        long j;
        long j2;
        MotionEvent motionEvent;
        ArrayList arrayList;
        if (zzbcgVar.n) {
            synchronized (this) {
                try {
                    try {
                        zzbci i = i(zzbcgVar, this.a, this.s);
                        Long l = i.a;
                        if (l != null) {
                            long longValue = l.longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).P0(longValue);
                        }
                        Long l2 = i.b;
                        if (l2 != null) {
                            long longValue2 = l2.longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).Q0(longValue2);
                        }
                        Long l3 = i.c;
                        if (l3 != null) {
                            long longValue3 = l3.longValue();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).R0(longValue3);
                        }
                        if (this.r) {
                            Long l4 = i.d;
                            if (l4 != null) {
                                long longValue4 = l4.longValue();
                                zzayaVar.n();
                                ((zzaza) zzayaVar.b).J(longValue4);
                            }
                            Long l5 = i.e;
                            if (l5 != null) {
                                long longValue5 = l5.longValue();
                                zzayaVar.n();
                                ((zzaza) zzayaVar.b).K(longValue5);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (zzbbw unused) {
                }
                zzayw D2 = zzayx.D();
                if (this.c > 0) {
                    DisplayMetrics displayMetrics = this.s;
                    if ((displayMetrics == null || displayMetrics.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? false : true) {
                        long b = zzbcj.b(this.j, displayMetrics);
                        D2.n();
                        ((zzayx) D2.b).P(b);
                        long b2 = zzbcj.b(this.o - this.m, this.s);
                        D2.n();
                        ((zzayx) D2.b).Q(b2);
                        long b3 = zzbcj.b(this.p - this.n, this.s);
                        D2.n();
                        ((zzayx) D2.b).R(b3);
                        long b4 = zzbcj.b(this.m, this.s);
                        D2.n();
                        ((zzayx) D2.b).V(b4);
                        long b5 = zzbcj.b(this.n, this.s);
                        D2.n();
                        ((zzayx) D2.b).W(b5);
                        if (this.r && (motionEvent = this.a) != null) {
                            long b6 = zzbcj.b(((this.m - this.o) + motionEvent.getRawX()) - this.a.getX(), this.s);
                            if (b6 != 0) {
                                D2.n();
                                ((zzayx) D2.b).S(b6);
                            }
                            long b7 = zzbcj.b(((this.n - this.p) + this.a.getRawY()) - this.a.getY(), this.s);
                            if (b7 != 0) {
                                D2.n();
                                ((zzayx) D2.b).U(b7);
                            }
                        }
                    }
                }
                try {
                    zzbci d = d(this.a);
                    Long l6 = d.a;
                    if (l6 != null) {
                        long longValue6 = l6.longValue();
                        D2.n();
                        ((zzayx) D2.b).E(longValue6);
                    }
                    Long l7 = d.b;
                    if (l7 != null) {
                        long longValue7 = l7.longValue();
                        D2.n();
                        ((zzayx) D2.b).F(longValue7);
                    }
                    long longValue8 = d.c.longValue();
                    D2.n();
                    ((zzayx) D2.b).L(longValue8);
                    if (this.r) {
                        Long l8 = d.e;
                        if (l8 != null) {
                            long longValue9 = l8.longValue();
                            D2.n();
                            ((zzayx) D2.b).G(longValue9);
                        }
                        Long l9 = d.d;
                        if (l9 != null) {
                            long longValue10 = l9.longValue();
                            D2.n();
                            ((zzayx) D2.b).J(longValue10);
                        }
                        Long l10 = d.f;
                        if (l10 != null) {
                            int i2 = l10.longValue() != 0 ? 2 : 1;
                            D2.n();
                            ((zzayx) D2.b).X(i2);
                        }
                        long j3 = this.d;
                        if (j3 > 0) {
                            DisplayMetrics displayMetrics2 = this.s;
                            Long valueOf = displayMetrics2 != null && (displayMetrics2.density > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (displayMetrics2.density == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) != 0 ? Long.valueOf(Math.round(this.i / j3)) : null;
                            if (valueOf != null) {
                                long longValue11 = valueOf.longValue();
                                D2.n();
                                ((zzayx) D2.b).H(longValue11);
                            } else {
                                D2.n();
                                ((zzayx) D2.b).I();
                            }
                            long round = Math.round(this.h / this.d);
                            D2.n();
                            ((zzayx) D2.b).K(round);
                        }
                        Long l11 = d.i;
                        if (l11 != null) {
                            long longValue12 = l11.longValue();
                            D2.n();
                            ((zzayx) D2.b).N(longValue12);
                        }
                        Long l12 = d.j;
                        if (l12 != null) {
                            long longValue13 = l12.longValue();
                            D2.n();
                            ((zzayx) D2.b).M(longValue13);
                        }
                        Long l13 = d.k;
                        if (l13 != null) {
                            int i3 = l13.longValue() != 0 ? 2 : 1;
                            D2.n();
                            ((zzayx) D2.b).Y(i3);
                        }
                    }
                } catch (zzbbw unused2) {
                }
                long j4 = this.g;
                if (j4 > 0) {
                    D2.n();
                    ((zzayx) D2.b).O(j4);
                }
                zzayx zzayxVar = (zzayx) D2.o();
                zzayaVar.n();
                ((zzaza) zzayaVar.b).X(zzayxVar);
                long j5 = this.c;
                if (j5 > 0) {
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).N(j5);
                }
                long j6 = this.d;
                if (j6 > 0) {
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).M(j6);
                }
                long j7 = this.e;
                if (j7 > 0) {
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).L(j7);
                }
                long j8 = this.f;
                if (j8 > 0) {
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).O(j8);
                }
                try {
                    LinkedList linkedList = this.b;
                    int size = linkedList.size() - 1;
                    if (size > 0) {
                        zzayaVar.n();
                        ((zzaza) zzayaVar.b).Z();
                        for (int i4 = 0; i4 < size; i4++) {
                            zzbci i5 = i(zzbaz.u, (MotionEvent) linkedList.get(i4), this.s);
                            zzayw D3 = zzayx.D();
                            long longValue14 = i5.a.longValue();
                            D3.n();
                            ((zzayx) D3.b).E(longValue14);
                            long longValue15 = i5.b.longValue();
                            D3.n();
                            ((zzayx) D3.b).F(longValue15);
                            zzayx zzayxVar2 = (zzayx) D3.o();
                            zzayaVar.n();
                            ((zzaza) zzayaVar.b).Y(zzayxVar2);
                        }
                    }
                } catch (zzbbw unused3) {
                    zzayaVar.n();
                    ((zzaza) zzayaVar.b).Z();
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList = arrayList2;
            if (zzbcgVar.b != null) {
                int e = zzbcgVar.e();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.K3)).booleanValue()) {
                    arrayList2.add(new zzbcu(zzbcgVar, zzayaVar, e, context, this.v.c, D));
                    arrayList2.add(new zzbct(zzbcgVar, zzayaVar, e, context));
                    arrayList2.add(new zzbdj(zzbcgVar, zzayaVar, e, context));
                    arrayList2.add(new zzbdo(zzbcgVar, zzayaVar, e));
                    zzbcp zzbcpVar = B;
                    if (zzbcpVar != null) {
                        long j9 = zzbcpVar.d ? zzbcpVar.b - zzbcpVar.a : -1L;
                        long j10 = zzbcpVar.c;
                        zzbcpVar.c = -1L;
                        j2 = j9;
                        j = j10;
                    } else {
                        j = -1;
                        j2 = -1;
                    }
                    arrayList2.add(new zzbde(zzbcgVar, zzayaVar, e, A, j2, j));
                    arrayList2.add(new zzbdi(zzbcgVar, zzayaVar, e));
                }
                arrayList2.add(new zzbcz(zzbcgVar, zzayaVar));
                arrayList2.add(new zzbdg(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbcx(zzbcgVar, zzayaVar, z, e));
                arrayList2.add(new zzbcw(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbdf(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbdh(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbdb(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbcv(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbdp(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbcs(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbdm(zzbcgVar, zzayaVar, e));
                arrayList2.add(new zzbdl(zzbcgVar, zzayaVar, e, new Throwable().getStackTrace()));
                arrayList2.add(new zzbdq(zzbcgVar, zzayaVar, e, view));
                arrayList2.add(new zzbdk(zzbcgVar, zzayaVar, e));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.C3)).booleanValue()) {
                    arrayList2.add(new zzbcq(zzbcgVar, zzayaVar, e, view, activity));
                }
                arrayList2.add(new zzbcr(zzbcgVar, zzayaVar, e));
                if (z2) {
                    arrayList = arrayList2;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E3)).booleanValue()) {
                        arrayList2.add(new zzbdn(zzbcgVar, zzayaVar, e, this.w));
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList2.add(new zzbda(zzbcgVar, zzayaVar, e, C));
                    arrayList2.add(new zzbdd(zzbcgVar, zzayaVar, e, this.t));
                    arrayList = arrayList2;
                }
            }
        } else {
            zzayaVar.r(16384L);
            arrayList = Arrays.asList(new zzbcz(zzbcgVar, zzayaVar));
        }
        k(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzbaz, com.google.android.gms.internal.ads.zzbay
    public final void zzh(View view) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.E3)).booleanValue()) {
            zzbcn zzbcnVar = this.w;
            if (zzbcnVar == null) {
                zzbcg zzbcgVar = zzbaz.u;
                zzbcn zzbcnVar2 = new zzbcn(zzbcgVar.a, zzbcgVar.o);
                this.w = zzbcnVar2;
                zzbcnVar = zzbcnVar2;
            }
            zzbcnVar.a(view);
        }
    }
}
