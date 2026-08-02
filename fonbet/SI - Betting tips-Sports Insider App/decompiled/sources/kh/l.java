package kh;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.zzbe;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import s7.f1;
import s7.n0;
import s7.v3;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes3.dex */
public final class l implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19126a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final long f19127b;

    /* renamed from: c, reason: collision with root package name */
    public long f19128c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f19129d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f19130e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f19131f;

    /* renamed from: g, reason: collision with root package name */
    public final Iterable f19132g;

    public l(f1 f1Var, String str, String str2, String str3, long j, long j6, Bundle bundle) {
        zzbe zzbeVar;
        g6.v.e(str2);
        g6.v.e(str3);
        this.f19129d = str2;
        this.f19130e = str3;
        this.f19131f = true == TextUtils.isEmpty(str) ? null : str;
        this.f19127b = j;
        this.f19128c = j6;
        if (j6 != 0 && j6 > j) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22906i.b(n0.r(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            zzbeVar = new zzbe(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    n0 n0Var2 = f1Var.f22745f;
                    f1.m(n0Var2);
                    n0Var2.f22903f.a("Param name can't be null");
                    it.remove();
                } else {
                    v3 v3Var = f1Var.f22748i;
                    f1.k(v3Var);
                    Object q = v3Var.q(bundle2.get(next), next);
                    if (q == null) {
                        n0 n0Var3 = f1Var.f22745f;
                        f1.m(n0Var3);
                        n0Var3.f22906i.b(f1Var.j.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        v3 v3Var2 = f1Var.f22748i;
                        f1.k(v3Var2);
                        v3Var2.y(bundle2, next, q);
                    }
                }
            }
            zzbeVar = new zzbe(bundle2);
        }
        this.f19132g = zzbeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0057, B:64:0x0065, B:67:0x0072, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:33:0x0095, B:34:0x009b, B:36:0x009f, B:41:0x00a6, B:44:0x00b0, B:46:0x00b4, B:49:0x00ba, B:50:0x00be, B:52:0x00c2, B:53:0x00c3, B:56:0x00c7, B:69:0x004c, B:71:0x00d2, B:72:0x00d9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0057, B:64:0x0065, B:67:0x0072, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:33:0x0095, B:34:0x009b, B:36:0x009f, B:41:0x00a6, B:44:0x00b0, B:46:0x00b4, B:49:0x00ba, B:50:0x00be, B:52:0x00c2, B:53:0x00c3, B:56:0x00c7, B:69:0x004c, B:71:0x00d2, B:72:0x00d9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0057, B:64:0x0065, B:67:0x0072, B:25:0x007b, B:27:0x0081, B:31:0x008a, B:33:0x0095, B:34:0x009b, B:36:0x009f, B:41:0x00a6, B:44:0x00b0, B:46:0x00b4, B:49:0x00ba, B:50:0x00be, B:52:0x00c2, B:53:0x00c3, B:56:0x00c7, B:69:0x004c, B:71:0x00d2, B:72:0x00d9), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007b A[SYNTHETIC] */
    @Override // kh.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q a() {
        u d10;
        long j;
        Throwable th2;
        v vVar;
        u uVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.f19131f).isEmpty() && !((s) this.f19129d).a(null)) {
                    b();
                    Intrinsics.checkNotNull(iOException);
                    throw iOException;
                }
                if (((s) this.f19129d).f19182k.q) {
                    throw new IOException("Canceled");
                }
                i2.d dVar = ((jh.e) this.f19130e).f18553a;
                long nanoTime = System.nanoTime();
                long j6 = this.f19128c - nanoTime;
                if (!((CopyOnWriteArrayList) this.f19131f).isEmpty() && j6 > 0) {
                    j = j6;
                    d10 = null;
                    if (d10 != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f19131f;
                        if (!copyOnWriteArrayList.isEmpty() && (uVar = (u) ((LinkedBlockingDeque) this.f19132g).poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(uVar.f19189a);
                            d10 = uVar;
                            if (d10 != null) {
                            }
                        }
                        d10 = null;
                        if (d10 != null) {
                        }
                    }
                    boolean z5 = false;
                    if (d10.f19190b != null && d10.f19191c == null) {
                        b();
                        if (!d10.f19189a.c()) {
                            d10 = d10.f19189a.f();
                        }
                        if (d10.f19190b == null && d10.f19191c == null) {
                            z5 = true;
                        }
                        if (z5) {
                            return d10.f19189a.b();
                        }
                    }
                    th2 = d10.f19191c;
                    if (th2 != null) {
                        if (!(th2 instanceof IOException)) {
                            throw th2;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th2;
                        } else {
                            gf.d.a(iOException, th2);
                        }
                    }
                    vVar = d10.f19190b;
                    if (vVar == null) {
                        ((s) this.f19129d).f19187p.addFirst(vVar);
                    }
                }
                d10 = d();
                j = this.f19127b;
                this.f19128c = nanoTime + j;
                if (d10 != null) {
                }
                boolean z52 = false;
                if (d10.f19190b != null && d10.f19191c == null) {
                }
                th2 = d10.f19191c;
                if (th2 != null) {
                }
                vVar = d10.f19190b;
                if (vVar == null) {
                }
            } finally {
                b();
            }
        }
    }

    public void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f19131f;
        Iterator it = copyOnWriteArrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            v vVar = (v) it.next();
            vVar.cancel();
            v a7 = vVar.a();
            if (a7 != null) {
                ((s) this.f19129d).f19187p.addLast(a7);
            }
        }
        copyOnWriteArrayList.clear();
    }

    @Override // kh.i
    public w c() {
        return (s) this.f19129d;
    }

    public u d() {
        v jVar;
        s sVar = (s) this.f19129d;
        if (sVar.a(null)) {
            try {
                jVar = sVar.b();
            } catch (Throwable th2) {
                jVar = new j(th2);
            }
            if (jVar.c()) {
                return new u(jVar, (Throwable) null, 6);
            }
            if (jVar instanceof j) {
                return ((j) jVar).f19123a;
            }
            ((CopyOnWriteArrayList) this.f19131f).add(jVar);
            ((jh.e) this.f19130e).d().d(new k(hh.g.f10826b + " connect " + sVar.f19181i.f10114h.g(), jVar, this), 0L);
        }
        return null;
    }

    public l e(f1 f1Var, long j) {
        return new l(f1Var, (String) this.f19131f, (String) this.f19129d, (String) this.f19130e, this.f19127b, j, (zzbe) this.f19132g);
    }

    public String toString() {
        switch (this.f19126a) {
            case 1:
                String zzbeVar = ((zzbe) this.f19132g).toString();
                String str = (String) this.f19129d;
                int length = String.valueOf(str).length();
                String str2 = (String) this.f19130e;
                StringBuilder sb2 = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + zzbeVar.length() + 1);
                r4.k.s(sb2, "Event{appId='", str, "', name='", str2);
                return d9.e.m(sb2, "', params=", zzbeVar, "}");
            default:
                return super.toString();
        }
    }

    public l(f1 f1Var, String str, String str2, String str3, long j, long j6, zzbe zzbeVar) {
        g6.v.e(str2);
        g6.v.e(str3);
        g6.v.h(zzbeVar);
        this.f19129d = str2;
        this.f19130e = str3;
        this.f19131f = true == TextUtils.isEmpty(str) ? null : str;
        this.f19127b = j;
        this.f19128c = j6;
        if (j6 != 0 && j6 > j) {
            n0 n0Var = f1Var.f22745f;
            f1.m(n0Var);
            n0Var.f22906i.c(n0.r(str2), n0.r(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.f19132g = zzbeVar;
    }

    public l(s routePlanner, jh.e taskRunner) {
        Intrinsics.checkNotNullParameter(routePlanner, "routePlanner");
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        this.f19129d = routePlanner;
        this.f19130e = taskRunner;
        this.f19127b = TimeUnit.MILLISECONDS.toNanos(250L);
        this.f19128c = Long.MIN_VALUE;
        this.f19131f = new CopyOnWriteArrayList();
        i2.d dVar = taskRunner.f18553a;
        LinkedBlockingDeque queue = new LinkedBlockingDeque();
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f19132g = queue;
    }
}
