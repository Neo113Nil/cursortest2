package com.google.android.gms.internal.measurement;

import defpackage.a70;
import defpackage.cep;
import defpackage.ecp;
import defpackage.edp;
import defpackage.ffp;
import defpackage.hdp;
import defpackage.kcp;
import defpackage.lep;
import defpackage.pvd;
import defpackage.s4n;
import defpackage.s6n;
import defpackage.xcp;
import defpackage.zdp;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class zzxz implements zzyi, zzzd {
    public static final String h = new String();
    public final Level a;
    public final long b;
    public xcp c;
    public zzyc d;
    public zzyq e;
    public zzaaf f;
    public Object[] g;

    public zzxz(Level level) {
        s4n.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        zzabr.a(level, "level");
        this.a = level;
        this.b = nanos;
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi a(Throwable th) {
        zzyl zzylVar = zzxx.a;
        zzabr.a(zzylVar, "metadata key");
        if (th != null) {
            k(zzylVar, th);
        }
        return f();
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final void b(String str, Object[] objArr) {
        xcp xcpVar;
        zzyd zzydVar = this.d;
        zzyd zzydVar2 = zzydVar;
        if (zzydVar == null) {
            s4n.a.a().getClass();
            edp edpVar = zzyc.a;
            this.d = edpVar;
            zzydVar2 = edpVar;
        }
        if (zzydVar2 != zzyc.a) {
            xcp xcpVar2 = this.c;
            if (xcpVar2 != null && xcpVar2.b > 0) {
                zzabr.a(zzydVar2, "logSiteKey");
                int i = xcpVar2.b;
                int i2 = 0;
                zzydVar2 = zzydVar2;
                while (i2 < i) {
                    if (zzxx.f.equals(xcpVar2.b(i2))) {
                        Object c = xcpVar2.c(i2);
                        zzydVar2 = c instanceof zzyj ? ((zzyj) c).b() : new lep(zzydVar2, c);
                    }
                    i2++;
                    zzydVar2 = zzydVar2;
                }
            }
        } else {
            zzydVar2 = null;
        }
        boolean d = d(zzydVar2);
        zzyq zzyqVar = this.e;
        if (zzyqVar != null) {
            cep cepVar = (cep) cep.c.b(zzydVar2, this.c);
            AtomicInteger atomicInteger = cepVar.b;
            AtomicBoolean atomicBoolean = cepVar.a;
            int incrementAndGet = atomicInteger.incrementAndGet();
            int i3 = -1;
            if (zzyqVar != zzyq.a && atomicBoolean.compareAndSet(false, true)) {
                try {
                    zzyqVar.a();
                    atomicBoolean.set(false);
                    atomicInteger.addAndGet(-incrementAndGet);
                    i3 = (-1) + incrementAndGet;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            }
            if (d && i3 > 0 && (xcpVar = this.c) != null) {
                xcpVar.e(zzxx.e, Integer.valueOf(i3));
            }
            d &= i3 >= 0;
        }
        if (d) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = copyOf;
            for (int i4 = 0; i4 < copyOf.length; i4++) {
                Object obj = copyOf[i4];
                if (obj instanceof zzxu) {
                    copyOf[i4] = ((zzxu) obj).zza();
                }
            }
            if (str != h) {
                this.f = new zzaaf(c(), str);
            }
            zzabe b = s4n.a.c().b();
            if (!b.a.isEmpty()) {
                zzzj j = j();
                zzyl zzylVar = zzxx.h;
                zzabe zzabeVar = (zzabe) j.d(zzylVar);
                if (zzabeVar != null) {
                    s6n s6nVar = zzabeVar.a;
                    if (!s6nVar.isEmpty()) {
                        s6n s6nVar2 = b.a;
                        if (!s6nVar2.isEmpty()) {
                            zzabeVar = new zzabe(new s6n(s6nVar2, s6nVar));
                        }
                        b = zzabeVar;
                    }
                }
                k(zzylVar, b);
            }
            zzzf zzzfVar = e().a;
            try {
                zzabt zzabtVar = (zzabt) zzabt.b.get();
                int i5 = zzabtVar.a + 1;
                zzabtVar.a = i5;
                if (i5 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i5 <= 100) {
                        zzzfVar.c(this);
                    } else {
                        zzxi.a("unbounded recursion in log statement", this);
                    }
                    zzabtVar.close();
                } finally {
                }
            } catch (RuntimeException e) {
                try {
                    zzzfVar.d(e, this);
                } catch (zzzg e2) {
                    throw e2;
                } catch (RuntimeException e3) {
                    String name = e3.getClass().getName();
                    String message = e3.getMessage();
                    StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(message);
                    zzxi.a(sb.toString(), this);
                    try {
                        e3.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    public abstract zzabl c();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009f A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.google.android.gms.internal.measurement.zzxz] */
    /* JADX WARN: Type inference failed for: r13v10, types: [xdp] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [com.google.android.gms.internal.measurement.zzyq] */
    /* JADX WARN: Type inference failed for: r13v9, types: [com.google.android.gms.internal.measurement.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(zzyd zzydVar) {
        StackTraceElement[] stackTraceElementArr;
        int f;
        int i;
        zzyq zzyqVar;
        ?? r13;
        zzyq zzyqVar2;
        zzyq zzyqVar3;
        xcp xcpVar = this.c;
        if (xcpVar != null) {
            if (zzydVar != null) {
                int i2 = i.d;
                if (xcpVar.d(zzxx.d) != null) {
                    pvd.j();
                    return false;
                }
                xcp xcpVar2 = this.c;
                ecp ecpVar = h.d;
                if (((Integer) xcpVar2.d(zzxx.b)) == null) {
                    zzyqVar = null;
                } else {
                    h hVar = (h) h.d.b(zzydVar, xcpVar2);
                    AtomicLong atomicLong = hVar.c;
                    zzyqVar = hVar;
                    if (atomicLong.incrementAndGet() < r4.intValue()) {
                        zzyqVar = zzyq.a;
                    }
                }
                xcp xcpVar3 = this.c;
                ecp ecpVar2 = j.d;
                Integer num = (Integer) xcpVar3.d(zzxx.c);
                if (num == null || num.intValue() <= 0) {
                    r13 = 0;
                } else {
                    r13 = (j) j.d.b(zzydVar, xcpVar3);
                    int nextInt = ((Random) j.e.get()).nextInt(num.intValue());
                    AtomicInteger atomicInteger = r13.c;
                    if ((nextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r13 = zzyq.a;
                    }
                }
                if (zzyqVar != null) {
                    if (r13 != 0 && zzyqVar != (zzyqVar2 = zzyq.a) && r13 != (zzyqVar3 = zzyq.b)) {
                        if (r13 != zzyqVar2 && zzyqVar != zzyqVar3) {
                            zzyqVar = new zdp(zzyqVar, r13);
                        }
                    }
                    this.e = zzyqVar;
                    if (zzyqVar == zzyq.a) {
                        return false;
                    }
                }
                zzyqVar = r13;
                this.e = zzyqVar;
                if (zzyqVar == zzyq.a) {
                }
            }
            xcp xcpVar4 = this.c;
            zzyl zzylVar = zzxx.i;
            zzyv zzyvVar = (zzyv) xcpVar4.d(zzylVar);
            if (zzyvVar != null) {
                xcp xcpVar5 = this.c;
                if (xcpVar5 != null && (f = xcpVar5.f(zzylVar)) >= 0) {
                    int i3 = f + f;
                    int i4 = i3 + 2;
                    while (true) {
                        i = xcpVar5.b;
                        if (i4 >= i + i) {
                            break;
                        }
                        Object obj = xcpVar5.a[i4];
                        if (!obj.equals(zzylVar)) {
                            Object[] objArr = xcpVar5.a;
                            objArr[i3] = obj;
                            objArr[i3 + 1] = objArr[i4 + 1];
                            i3 += 2;
                        }
                        i4 += 2;
                    }
                    xcpVar5.b = i - ((i4 - i3) >> 1);
                    while (i3 < i4) {
                        xcpVar5.a[i3] = null;
                        i3++;
                    }
                }
                zzzj j = j();
                zzyl zzylVar2 = zzxx.a;
                Throwable th = (Throwable) j.d(zzylVar2);
                int i5 = zzyvVar.a;
                String[] strArr = zzabq.a;
                if (i5 <= 0 && i5 != -1) {
                    a70.p("invalid maximum depth: 0");
                    return false;
                }
                zzabq.b.getClass();
                if (!(i5 == -1 || i5 > 0)) {
                    a70.p("maxDepth must be > 0 or -1");
                    return false;
                }
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                String name = zzxz.class.getName();
                int i6 = 3;
                boolean z = false;
                while (true) {
                    if (i6 >= stackTrace.length) {
                        i6 = -1;
                        break;
                    }
                    if (stackTrace[i6].getClassName().equals(name)) {
                        z = true;
                    } else if (z) {
                        break;
                    }
                    i6++;
                }
                if (i6 == -1) {
                    stackTraceElementArr = new StackTraceElement[0];
                } else {
                    int length = stackTrace.length - i6;
                    if (i5 <= 0 || i5 >= length) {
                        i5 = length;
                    }
                    StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i5];
                    System.arraycopy(stackTrace, i6, stackTraceElementArr2, 0, i5);
                    stackTraceElementArr = stackTraceElementArr2;
                }
                zzyg zzygVar = new zzyg(zzyvVar.toString(), th);
                zzygVar.setStackTrace(stackTraceElementArr);
                k(zzylVar2, zzygVar);
                return true;
            }
        }
        return true;
    }

    public abstract zzxs e();

    public abstract kcp f();

    public final zzyc g() {
        zzyc zzycVar = this.d;
        if (zzycVar != null) {
            return zzycVar;
        }
        a70.r("cannot request log site information prior to postProcess()");
        return null;
    }

    public final Object[] h() {
        if (!(this.f != null)) {
            a70.r("cannot get arguments unless a template context exists");
            return null;
        }
        Object[] objArr = this.g;
        if (objArr != null) {
            return objArr;
        }
        a70.r("cannot get arguments before calling log()");
        return null;
    }

    public final Object i() {
        if (!(this.f == null)) {
            a70.r("cannot get literal argument if a template context exists");
            return null;
        }
        Object[] objArr = this.g;
        if (objArr != null) {
            return objArr[0];
        }
        a70.r("cannot get literal argument before calling log()");
        return null;
    }

    public final zzzj j() {
        xcp xcpVar = this.c;
        return xcpVar != null ? xcpVar : ffp.a;
    }

    public final void k(zzyl zzylVar, Object obj) {
        xcp xcpVar = this.c;
        if (xcpVar == null) {
            xcpVar = new xcp();
            xcpVar.a = new Object[8];
            xcpVar.b = 0;
            this.c = xcpVar;
        }
        xcpVar.e(zzylVar, obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzyi
    public final zzyi zzn() {
        edp edpVar = zzyc.a;
        hdp hdpVar = new hdp();
        if (this.d == null) {
            this.d = hdpVar;
        }
        return f();
    }
}
