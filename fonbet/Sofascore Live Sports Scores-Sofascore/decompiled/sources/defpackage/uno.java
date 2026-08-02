package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class uno implements Runnable, pno {
    public static final long i = System.currentTimeMillis();
    public Context b;
    public final en0 c;
    public final Executor d;
    public final lto e;
    public final boolean f;
    public final AtomicReference a = new AtomicReference();
    public final CountDownLatch g = new CountDownLatch(1);
    public final ArrayList h = new ArrayList();

    public uno(Context context, Executor executor, lto ltoVar) {
        this.e = ltoVar;
        this.b = context;
        this.d = executor;
        kwo kwoVar = exo.a;
        jaa.R(new py3(context, 4));
        boolean z = ((Boolean) bwo.e.c.a(exo.c)).booleanValue() && ltoVar.v();
        this.f = z;
        this.c = en0.x(context, executor, z);
        executor.execute(this);
    }

    @Override // defpackage.pno
    public final String a(Context context, View view, Activity activity) {
        return zzf() ? ((pno) this.a.get()).a(context, view, activity) : "";
    }

    @Override // defpackage.pno
    public final void b(MotionEvent motionEvent) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            this.h.add(new Object[]{motionEvent});
        } else {
            f();
            ((pno) atomicReference.get()).b(motionEvent);
        }
    }

    @Override // defpackage.pno
    public final void c(View view) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            ((pno) atomicReference.get()).c(view);
        }
    }

    @Override // defpackage.pno
    public final String d(Context context, String str, View view, Activity activity) {
        if (!zzf()) {
            return "";
        }
        f();
        pno pnoVar = (pno) this.a.get();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return pnoVar.d(context, str, view, activity);
    }

    @Override // defpackage.pno
    public final void e(int i2, int i3, int i4) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            f();
            ((pno) atomicReference.get()).e(i2, i3, i4);
        } else {
            this.h.add(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
    }

    public final void f() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return;
        }
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object[] objArr = (Object[]) it.next();
            int length = objArr.length;
            if (length == 1) {
                ((pno) atomicReference.get()).b((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ((pno) atomicReference.get()).e(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        arrayList.clear();
    }

    public final String g(Context context) {
        if (!zzf()) {
            return "";
        }
        f();
        pno pnoVar = (pno) this.a.get();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return pnoVar.zzl(context);
    }

    public final void h() {
        Context context = this.b;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        yih yihVar = new yih(this.e);
        synchronized (yno.class) {
            if (!yno.y) {
                yno.z = System.currentTimeMillis() / 1000;
                yno.w = yno.k(context, yihVar.b);
                yno.A = hpo.K(context);
                ExecutorService executorService = yno.w.b;
                yno.B = lso.a(context, executorService);
                yno.C = new cso();
                gmo gmoVar = new gmo(context, executorService);
                yno.E = gmoVar;
                yno.D = new xfo(context, executorService, (i4n) yihVar.d, gmoVar);
                yno.y = true;
            }
        }
        this.a.set(new yno(context, yihVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[Catch: all -> 0x004a, NullPointerException -> 0x004c, TryCatch #1 {NullPointerException -> 0x004c, blocks: (B:4:0x000d, B:7:0x004e, B:9:0x0052, B:11:0x005b, B:15:0x0065, B:18:0x0073, B:19:0x0082, B:22:0x0085, B:24:0x0088, B:26:0x008e, B:30:0x0094, B:32:0x0019, B:34:0x0041), top: B:3:0x000d, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0052 A[Catch: all -> 0x004a, NullPointerException -> 0x004c, TryCatch #1 {NullPointerException -> 0x004c, blocks: (B:4:0x000d, B:7:0x004e, B:9:0x0052, B:11:0x005b, B:15:0x0065, B:18:0x0073, B:19:0x0082, B:22:0x0085, B:24:0x0088, B:26:0x008e, B:30:0x0094, B:32:0x0019, B:34:0x0041), top: B:3:0x000d, outer: #2 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i2;
        boolean z;
        CountDownLatch countDownLatch = this.g;
        Executor executor = this.d;
        en0 en0Var = this.c;
        lto ltoVar = this.e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            try {
            } catch (NullPointerException e) {
                if (ltoVar.s()) {
                    h();
                }
                en0Var.z(2031, System.currentTimeMillis() - currentTimeMillis, e);
            }
            if (ltoVar.D() - 1 == 2) {
                Context context = this.b;
                if (new n72(context, nq8.O(context, en0Var), new ohn(this, 23), ((Boolean) bwo.e.c.a(exo.b)).booleanValue()).y() || !ltoVar.s()) {
                    i2 = 3;
                    if (i2 - 1 == 2) {
                        h();
                        if (ltoVar.D() == 3) {
                            executor.execute(new dno(this, 1));
                        }
                    } else {
                        String t = ltoVar.t();
                        Context context2 = this.b;
                        Context applicationContext = context2.getApplicationContext();
                        if (applicationContext != null) {
                            context2 = applicationContext;
                        }
                        smo f = smo.f(t, context2, executor, ltoVar.u(), this.f);
                        this.a.set(f);
                        synchronized (f) {
                            z = f.o;
                        }
                        if (!z && ltoVar.s()) {
                            h();
                        }
                    }
                    this.b = null;
                    countDownLatch.countDown();
                }
            }
            i2 = 2;
            if (i2 - 1 == 2) {
            }
            this.b = null;
            countDownLatch.countDown();
        } catch (Throwable th) {
            this.b = null;
            countDownLatch.countDown();
            throw th;
        }
    }

    @Override // defpackage.pno
    public final boolean zze() {
        if (this.g.getCount() != 0) {
            return false;
        }
        AtomicReference atomicReference = this.a;
        return atomicReference.get() != null && ((pno) atomicReference.get()).zze();
    }

    @Override // defpackage.pno
    public final boolean zzf() {
        try {
            this.g.await();
            AtomicReference atomicReference = this.a;
            if (atomicReference.get() != null) {
                return ((pno) atomicReference.get()).zzf();
            }
            return false;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    @Override // defpackage.pno
    public final String zzl(Context context) {
        lto ltoVar = this.e;
        if (ltoVar.x().t()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = i;
            if (currentTimeMillis - j <= ltoVar.x().u()) {
                q8p q8pVar = new q8p(new een(16, this, context));
                this.d.execute(q8pVar);
                try {
                    return (String) q8pVar.get(ltoVar.x().s(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException | ExecutionException unused) {
                    return Integer.toString(17);
                } catch (TimeoutException unused2) {
                    String t = ltoVar.t();
                    try {
                        bon s = jon.s();
                        s.b();
                        ((jon) s.b).u(t);
                        s.b();
                        ((jon) s.b).t("0.828153725");
                        String packageName = context.getPackageName();
                        s.b();
                        ((jon) s.b).w(packageName);
                        long currentTimeMillis2 = (System.currentTimeMillis() - j) / 1000;
                        s.b();
                        ((jon) s.b).y(currentTimeMillis2);
                        long currentTimeMillis3 = System.currentTimeMillis() / 1000;
                        s.b();
                        ((jon) s.b).v(currentTimeMillis3);
                        try {
                            long j2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                            s.b();
                            ((jon) s.b).x(j2);
                        } catch (PackageManager.NameNotFoundException unused3) {
                            s.b();
                            ((jon) s.b).x(-1L);
                        }
                        npn b = ogo.b(null, ((jon) s.c()).b());
                        b.b();
                        ((vpn) b.b).v(5);
                        b.b();
                        ((vpn) b.b).w(2);
                        return Base64.encodeToString(((vpn) b.c()).b(), 11);
                    } catch (UnsupportedEncodingException | GeneralSecurityException unused4) {
                        return Integer.toString(7);
                    }
                }
            }
        }
        return g(context);
    }
}
