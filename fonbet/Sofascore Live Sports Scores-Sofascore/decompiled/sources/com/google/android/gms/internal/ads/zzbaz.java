package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import defpackage.a70;
import defpackage.gln;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzbaz implements zzbay {
    public static volatile zzbcg u;
    public MotionEvent a;
    public double j;
    public double k;
    public double l;
    public float m;
    public float n;
    public float o;
    public float p;
    public final DisplayMetrics s;
    public final zzbby t;
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

    public zzbaz(Context context) {
        try {
            gln.a();
            this.s = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L3)).booleanValue()) {
                this.t = new zzbby();
            }
        } catch (Throwable unused) {
        }
    }

    public abstract zzaya a(Context context);

    public abstract zzaya b(Context context, View view, Activity activity);

    public abstract zzaya c(Context context, View view, Activity activity);

    public abstract zzbci d(MotionEvent motionEvent);

    public abstract long e(StackTraceElement[] stackTraceElementArr);

    public final void f() {
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String g(Context context, String str, int i, View view, Activity activity) {
        zzbax zzbaxVar;
        String str2;
        int i2;
        Exception exc;
        zzaya zzayaVar;
        int i3;
        int i4;
        byte[] d;
        int i5;
        int i6 = i;
        long currentTimeMillis = System.currentTimeMillis();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.A3)).booleanValue();
        if (booleanValue) {
            zzbaxVar = u != null ? u.k : null;
            str2 = "be";
        } else {
            zzbaxVar = null;
            str2 = null;
        }
        try {
            if (i6 == 3) {
                zzayaVar = b(context, view, activity);
                try {
                    this.q = true;
                    i5 = 1002;
                } catch (Exception e) {
                    exc = e;
                    i2 = 3;
                    if (booleanValue) {
                        if (i6 != i2) {
                        }
                        i3 = i4;
                        zzbaxVar.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (zzayaVar != null) {
                    }
                    return Integer.toString(5);
                }
            } else if (i6 == 2) {
                zzayaVar = c(context, view, activity);
                i5 = 1008;
            } else {
                zzayaVar = a(context);
                i5 = 1000;
            }
            if (!booleanValue || zzbaxVar == null) {
                i2 = 3;
            } else {
                try {
                    i2 = 3;
                } catch (Exception e2) {
                    e = e2;
                    i2 = 3;
                }
                try {
                    zzbaxVar.a(i5, -1, System.currentTimeMillis() - currentTimeMillis, str2, null);
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    if (booleanValue && zzbaxVar != null) {
                        if (i6 != i2) {
                            i4 = 1003;
                        } else if (i6 == 2) {
                            i4 = 1009;
                        } else {
                            i3 = 1001;
                            i6 = 1;
                            zzbaxVar.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                        }
                        i3 = i4;
                        zzbaxVar.a(i3, -1, System.currentTimeMillis() - currentTimeMillis, str2, exc);
                    }
                    long currentTimeMillis22 = System.currentTimeMillis();
                    if (zzayaVar != null) {
                    }
                    return Integer.toString(5);
                }
            }
        } catch (Exception e4) {
            i2 = 3;
            exc = e4;
            zzayaVar = null;
        }
        long currentTimeMillis222 = System.currentTimeMillis();
        if (zzayaVar != null) {
            try {
                if (((zzaza) zzayaVar.o()).k(null) != 0) {
                    zzaza zzazaVar = (zzaza) zzayaVar.o();
                    boolean z = gln.a;
                    zzazs b = gln.b(str, zzazaVar.d());
                    if (b == null) {
                        zzaya G0 = zzaza.G0();
                        G0.r(4096L);
                        d = gln.d(str, ((zzaza) G0.o()).d(), true);
                    } else {
                        d = ((zzazt) b.o()).d();
                    }
                    String encodeToString = Base64.encodeToString(d, 11);
                    if (!booleanValue || zzbaxVar == null) {
                        return encodeToString;
                    }
                    zzbaxVar.a(i6 == i2 ? 1006 : i6 == 2 ? 1010 : 1004, -1, System.currentTimeMillis() - currentTimeMillis222, str2, null);
                    return encodeToString;
                }
            } catch (Exception e5) {
                String num = Integer.toString(7);
                if (!booleanValue || zzbaxVar == null) {
                    return num;
                }
                zzbaxVar.a(i6 == i2 ? 1007 : i6 == 2 ? 1011 : 1005, -1, System.currentTimeMillis() - currentTimeMillis222, str2, e5);
                return num;
            }
        }
        return Integer.toString(5);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final synchronized void zzd(MotionEvent motionEvent) {
        Long l;
        try {
            if (this.q) {
                f();
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
                        this.g = e(new Throwable().getStackTrace());
                    } else if (action2 == 2) {
                        this.d += motionEvent.getHistorySize() + 1;
                        zzbci d3 = d(motionEvent);
                        Long l2 = d3.d;
                        if (l2 != null && d3.g != null) {
                            this.h = l2.longValue() + d3.g.longValue() + this.h;
                        }
                        if (this.s != null && (l = d3.e) != null && d3.h != null) {
                            this.i = l.longValue() + d3.h.longValue() + this.i;
                        }
                    } else if (action2 == 3) {
                        this.f++;
                    }
                } catch (zzbbw unused) {
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

    @Override // com.google.android.gms.internal.ads.zzbay
    public final synchronized void zze(int i, int i2, int i3) {
        try {
            if (this.a != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.y3)).booleanValue()) {
                    f();
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

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzf(Context context, String str, View view, Activity activity) {
        return g(context, str, 3, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzg(Context context, String str, View view) {
        return g(context, str, 3, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbby zzbbyVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().a(zzbjg.L3)).booleanValue() || (zzbbyVar = this.t) == null) {
            return;
        }
        zzbbyVar.a = new ArrayList(Arrays.asList(stackTraceElementArr));
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzj(Context context, View view, Activity activity) {
        return g(context, null, 2, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public final String zzl(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return g(context, null, 1, null, null);
        }
        a70.r("The caller must not be called from the UI thread.");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbay
    public void zzh(View view) {
    }
}
