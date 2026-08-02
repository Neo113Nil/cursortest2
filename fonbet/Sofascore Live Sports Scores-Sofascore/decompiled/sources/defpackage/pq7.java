package defpackage;

import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbul;
import com.google.android.gms.internal.ads.zzbum;
import com.google.android.gms.internal.measurement.zzhs;
import com.google.android.gms.internal.measurement.zzid;
import com.google.android.gms.measurement.internal.zzfy;
import com.google.android.gms.measurement.internal.zzpg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class pq7 implements je6, zzbtg {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public pq7(ipf ipfVar, cui cuiVar) {
        cuiVar.getClass();
        this.b = ipfVar;
        this.c = cuiVar;
        this.a = Long.MIN_VALUE;
        this.d = new CopyOnWriteArrayList();
        this.e = new LinkedBlockingDeque();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0058 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0058, B:64:0x0066, B:67:0x0073, B:25:0x007c, B:27:0x0082, B:31:0x008b, B:33:0x0096, B:34:0x009c, B:36:0x00a0, B:41:0x00a7, B:44:0x00b1, B:46:0x00b5, B:49:0x00bb, B:50:0x00bf, B:52:0x00c3, B:53:0x00c4, B:56:0x00c8, B:69:0x004c, B:71:0x00d3, B:72:0x00da), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0058, B:64:0x0066, B:67:0x0073, B:25:0x007c, B:27:0x0082, B:31:0x008b, B:33:0x0096, B:34:0x009c, B:36:0x00a0, B:41:0x00a7, B:44:0x00b1, B:46:0x00b5, B:49:0x00bb, B:50:0x00bf, B:52:0x00c3, B:53:0x00c4, B:56:0x00c8, B:69:0x004c, B:71:0x00d3, B:72:0x00da), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5 A[Catch: all -> 0x001e, TryCatch #0 {all -> 0x001e, blocks: (B:3:0x0002, B:5:0x000c, B:11:0x0021, B:13:0x002b, B:20:0x0058, B:64:0x0066, B:67:0x0073, B:25:0x007c, B:27:0x0082, B:31:0x008b, B:33:0x0096, B:34:0x009c, B:36:0x00a0, B:41:0x00a7, B:44:0x00b1, B:46:0x00b5, B:49:0x00bb, B:50:0x00bf, B:52:0x00c3, B:53:0x00c4, B:56:0x00c8, B:69:0x004c, B:71:0x00d3, B:72:0x00da), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x007c A[SYNTHETIC] */
    @Override // defpackage.je6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qof a() {
        b8g c;
        long j;
        Throwable th;
        c8g c8gVar;
        b8g b8gVar;
        IOException iOException = null;
        while (true) {
            try {
                if (((CopyOnWriteArrayList) this.d).isEmpty() && !((ipf) this.b).a(null)) {
                    b();
                    iOException.getClass();
                    throw iOException;
                }
                if (((ipf) this.b).l.q) {
                    throw new IOException("Canceled");
                }
                by9 by9Var = ((cui) this.c).a;
                long nanoTime = System.nanoTime();
                long j2 = this.a - nanoTime;
                if (!((CopyOnWriteArrayList) this.d).isEmpty() && j2 > 0) {
                    j = j2;
                    c = null;
                    if (c != null) {
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
                        if (!copyOnWriteArrayList.isEmpty() && (b8gVar = (b8g) ((LinkedBlockingDeque) this.e).poll(j, timeUnit)) != null) {
                            copyOnWriteArrayList.remove(b8gVar.a);
                            c = b8gVar;
                            if (c != null) {
                            }
                        }
                        c = null;
                        if (c != null) {
                        }
                    }
                    boolean z = false;
                    if (c.b != null && c.c == null) {
                        b();
                        if (!c.a.isReady()) {
                            c = c.a.e();
                        }
                        if (c.b == null && c.c == null) {
                            z = true;
                        }
                        if (z) {
                            return c.a.d();
                        }
                    }
                    th = c.c;
                    if (th != null) {
                        if (!(th instanceof IOException)) {
                            throw th;
                        }
                        if (iOException == null) {
                            iOException = (IOException) th;
                        } else {
                            de6.a(iOException, th);
                        }
                    }
                    c8gVar = c.b;
                    if (c8gVar == null) {
                        ((ipf) this.b).q.addFirst(c8gVar);
                    }
                }
                c = c();
                j = 250000000;
                this.a = nanoTime + 250000000;
                if (c != null) {
                }
                boolean z2 = false;
                if (c.b != null && c.c == null) {
                }
                th = c.c;
                if (th != null) {
                }
                c8gVar = c.b;
                if (c8gVar == null) {
                }
            } finally {
                b();
            }
        }
    }

    public void b() {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        Iterator it = copyOnWriteArrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            c8g c8gVar = (c8g) it.next();
            c8gVar.cancel();
            c8g c = c8gVar.c();
            if (c != null) {
                ((ipf) this.b).q.addLast(c);
            }
        }
        copyOnWriteArrayList.clear();
    }

    public b8g c() {
        c8g jn6Var;
        ipf ipfVar = (ipf) this.b;
        if (ipfVar.a(null)) {
            try {
                jn6Var = ipfVar.b();
            } catch (Throwable th) {
                jn6Var = new jn6(th);
            }
            if (jn6Var.isReady()) {
                return new b8g(jn6Var, null, null, 6);
            }
            if (jn6Var instanceof jn6) {
                return ((jn6) jn6Var).a;
            }
            ((CopyOnWriteArrayList) this.d).add(jn6Var);
            ((cui) this.c).d().d(new oq7(yol.b + " connect " + ipfVar.j.h.h(), jn6Var, this), 0L);
        }
        return null;
    }

    @Override // defpackage.je6
    public ipf d() {
        return (ipf) this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfy.j.a(null)).intValue())) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.zzfy.j.a(null)).intValue())) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean e(long j, zzhs zzhsVar) {
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((zzhs) ((ArrayList) this.d).get(0)).F() / 1000) / 60) / 60 == ((zzhsVar.F() / 1000) / 60) / 60) {
            long e = this.a + zzhsVar.e();
            zzpg zzpgVar = (zzpg) this.e;
            if (zzpgVar.f0().b0(null, zzfy.Y0)) {
                if (!((ArrayList) this.d).isEmpty()) {
                    zzpgVar.f0();
                }
                this.a = e;
                ((ArrayList) this.d).add(zzhsVar);
                ((ArrayList) this.c).add(Long.valueOf(j));
                zzid zzidVar = (zzid) this.b;
                if (((ArrayList) this.d).size() < Math.max(1, zzpgVar.f0().Z(zzidVar != null ? zzidVar.y() : null, zzfy.k))) {
                    return true;
                }
            } else {
                zzpgVar.f0();
            }
        }
        return false;
    }

    public /* synthetic */ pq7(zzpg zzpgVar) {
        this.e = zzpgVar;
    }

    public /* synthetic */ pq7(zzbum zzbumVar, ArrayList arrayList, long j, zzbul zzbulVar, zzbtp zzbtpVar) {
        this.b = zzbumVar;
        this.c = arrayList;
        this.a = j;
        this.d = zzbulVar;
        this.e = zzbtpVar;
    }
}
