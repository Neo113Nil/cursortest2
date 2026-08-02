package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class lk0 {
    public final CoroutineContext a;
    public fb9 b;
    public k9k c;
    public f5e d;
    public final hcc e;
    public final nh0 f;
    public final bka g;
    public volatile boolean h;
    public volatile int i;
    public final fdi j;
    public final jof k;
    public final aeh l;
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    public lk0(CoroutineContext coroutineContext, f6e f6eVar) {
        f5e f5eVar;
        z3e z3eVar;
        coroutineContext.getClass();
        this.a = coroutineContext;
        this.c = new l6e();
        f5e f5eVar2 = f5e.e;
        z3e z3eVar2 = f6eVar != null ? (z3e) f6eVar.d.invoke() : null;
        if (z3eVar2 != null) {
            f5eVar = new f5e(z3eVar2);
        } else {
            f5eVar = f5e.e;
            f5eVar.getClass();
        }
        this.d = f5eVar;
        hcc hccVar = new hcc(14);
        if (f6eVar != null && (z3eVar = (z3e) f6eVar.d.invoke()) != null) {
            hccVar.W(z3eVar.e, z3eVar.f);
        }
        this.e = hccVar;
        nh0 nh0Var = new nh0();
        this.f = nh0Var;
        this.g = new bka(20);
        this.j = gdi.a(Boolean.FALSE);
        this.k = (jof) hccVar.d;
        this.l = beh.a(0, 64, a62.b);
        ((CopyOnWriteArrayList) nh0Var.b).add(new xxb(this, 23));
    }

    public final Object a(int i) {
        Object value;
        Object value2;
        fdi fdiVar = this.j;
        do {
            value = fdiVar.getValue();
            ((Boolean) value).getClass();
        } while (!fdiVar.k(value, Boolean.TRUE));
        this.h = true;
        this.i = i;
        if (Build.ID != null) {
            Log.isLoggable("Paging", 2);
        }
        fb9 fb9Var = this.b;
        if (fb9Var != null) {
            fb9Var.g(this.d.a(i));
        }
        Object b = this.d.b(i);
        fdi fdiVar2 = this.j;
        do {
            value2 = fdiVar2.getValue();
            ((Boolean) value2).getClass();
        } while (!fdiVar2.k(value2, Boolean.FALSE));
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x011b A[Catch: CancellationException -> 0x0055, TryCatch #0 {CancellationException -> 0x0055, blocks: (B:11:0x004c, B:13:0x00af, B:15:0x00b3, B:17:0x00bc, B:19:0x00c9, B:21:0x00cd, B:22:0x00d3, B:24:0x00e3, B:26:0x00e7, B:27:0x00ed, B:29:0x011b, B:30:0x0134, B:34:0x013d, B:35:0x0145, B:37:0x014b, B:39:0x014f), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013d A[Catch: CancellationException -> 0x0055, TryCatch #0 {CancellationException -> 0x0055, blocks: (B:11:0x004c, B:13:0x00af, B:15:0x00b3, B:17:0x00bc, B:19:0x00c9, B:21:0x00cd, B:22:0x00d3, B:24:0x00e3, B:26:0x00e7, B:27:0x00ed, B:29:0x011b, B:30:0x0134, B:34:0x013d, B:35:0x0145, B:37:0x014b, B:39:0x014f), top: B:10:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, int i, int i2, boolean z, rfb rfbVar, rfb rfbVar2, fb9 fb9Var, sq3 sq3Var) {
        m6e m6eVar;
        int i3;
        f5e f5eVar;
        fb9 fb9Var2;
        List list2;
        boolean z2;
        rfb rfbVar3;
        fb9 fb9Var3;
        rfb rfbVar4;
        f5e f5eVar2;
        fb9 fb9Var4;
        List list3;
        List list4;
        int i4 = i;
        int i5 = i2;
        if (sq3Var instanceof m6e) {
            m6eVar = (m6e) sq3Var;
            int i6 = m6eVar.D;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                m6eVar.D = i6 - Integer.MIN_VALUE;
                Object obj = m6eVar.B;
                Object obj2 = lu3.a;
                i3 = m6eVar.D;
                if (i3 != 0) {
                    y6a.M(obj);
                    if (z && rfbVar == null) {
                        a70.p("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                        return null;
                    }
                    this.h = false;
                    f5e f5eVar3 = this.d;
                    fb9 fb9Var5 = this.b;
                    f5e f5eVar4 = new f5e(list, i4, i5);
                    f5e f5eVar5 = this.d;
                    f5eVar5.getClass();
                    this.d = f5eVar4;
                    this.b = fb9Var;
                    try {
                        d7a k6eVar = new k6e(f5eVar4, f5eVar5);
                        m6eVar.r = list;
                        m6eVar.s = rfbVar;
                        m6eVar.t = rfbVar2;
                        m6eVar.u = fb9Var;
                        m6eVar.v = f5eVar3;
                        m6eVar.w = fb9Var5;
                        m6eVar.x = f5eVar4;
                        m6eVar.y = i4;
                        m6eVar.z = i5;
                        m6eVar.A = z;
                        m6eVar.D = 1;
                        if (c(k6eVar, m6eVar) == obj2) {
                            return obj2;
                        }
                        list2 = list;
                        z2 = z;
                        rfbVar3 = rfbVar;
                        fb9Var3 = fb9Var;
                        f5eVar = f5eVar3;
                        fb9Var2 = fb9Var5;
                        rfbVar4 = rfbVar2;
                        f5eVar2 = f5eVar4;
                    } catch (CancellationException e) {
                        e = e;
                        f5eVar = f5eVar3;
                        fb9Var2 = fb9Var5;
                        this.d = f5eVar;
                        this.b = fb9Var2;
                        throw e;
                    }
                } else {
                    if (i3 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z2 = m6eVar.A;
                    int i7 = m6eVar.z;
                    int i8 = m6eVar.y;
                    f5eVar2 = m6eVar.x;
                    fb9Var2 = m6eVar.w;
                    f5eVar = m6eVar.v;
                    fb9Var3 = m6eVar.u;
                    rfbVar4 = m6eVar.t;
                    rfbVar3 = m6eVar.s;
                    list2 = m6eVar.r;
                    try {
                        y6a.M(obj);
                        i5 = i7;
                        i4 = i8;
                    } catch (CancellationException e2) {
                        e = e2;
                        this.d = f5eVar;
                        this.b = fb9Var2;
                        throw e;
                    }
                }
                if (Build.ID != null && Log.isLoggable("Paging", 3)) {
                    StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
                    zvj zvjVar = (zvj) CollectionsKt.firstOrNull(list2);
                    sb.append((zvjVar != null || (list4 = zvjVar.b) == null) ? null : CollectionsKt.firstOrNull(list4));
                    sb.append("\n                            |   last item: ");
                    zvj zvjVar2 = (zvj) CollectionsKt.j0(list2);
                    sb.append((zvjVar2 != null || (list3 = zvjVar2.b) == null) ? null : CollectionsKt.j0(list3));
                    sb.append("\n                            |   placeholdersBefore: ");
                    sb.append(i4);
                    sb.append("\n                            |   placeholdersAfter: ");
                    sb.append(i5);
                    sb.append("\n                            |   hintReceiver: ");
                    sb.append(fb9Var3);
                    sb.append("\n                            |   sourceLoadStates: ");
                    sb.append(rfbVar3);
                    sb.append("\n                        ");
                    String sb2 = sb.toString();
                    if (rfbVar4 != null) {
                        sb2 = sb2 + "|   mediatorLoadStates: " + rfbVar4 + '\n';
                    }
                    dii.d(sb2.concat("|)"));
                }
                if (z2) {
                    hcc hccVar = this.e;
                    rfbVar3.getClass();
                    hccVar.W(rfbVar3, rfbVar4);
                }
                if (f5eVar2.f() == 0 && (fb9Var4 = this.b) != null) {
                    int i9 = f5eVar2.b / 2;
                    fb9Var4.g(new uvk(i9, i9, f5eVar2.d(), f5eVar2.e()));
                }
                return Unit.a;
            }
        }
        m6eVar = new m6e(this, sq3Var);
        Object obj3 = m6eVar.B;
        Object obj22 = lu3.a;
        i3 = m6eVar.D;
        if (i3 != 0) {
        }
        if (Build.ID != null) {
            StringBuilder sb3 = new StringBuilder("Presenting data (\n                            |   first item: ");
            zvj zvjVar3 = (zvj) CollectionsKt.firstOrNull(list2);
            sb3.append((zvjVar3 != null || (list4 = zvjVar3.b) == null) ? null : CollectionsKt.firstOrNull(list4));
            sb3.append("\n                            |   last item: ");
            zvj zvjVar22 = (zvj) CollectionsKt.j0(list2);
            sb3.append((zvjVar22 != null || (list3 = zvjVar22.b) == null) ? null : CollectionsKt.j0(list3));
            sb3.append("\n                            |   placeholdersBefore: ");
            sb3.append(i4);
            sb3.append("\n                            |   placeholdersAfter: ");
            sb3.append(i5);
            sb3.append("\n                            |   hintReceiver: ");
            sb3.append(fb9Var3);
            sb3.append("\n                            |   sourceLoadStates: ");
            sb3.append(rfbVar3);
            sb3.append("\n                        ");
            String sb22 = sb3.toString();
            if (rfbVar4 != null) {
            }
            dii.d(sb22.concat("|)"));
        }
        if (z2) {
        }
        if (f5eVar2.f() == 0) {
            int i92 = f5eVar2.b / 2;
            fb9Var4.g(new uvk(i92, i92, f5eVar2.d(), f5eVar2.e()));
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(d7a d7aVar, sq3 sq3Var) {
        kk0 kk0Var;
        int i;
        k6e k6eVar;
        boolean z;
        int d;
        int a;
        int i2 = this.m;
        Object obj = this.n;
        switch (i2) {
            case 0:
                pk0 pk0Var = (pk0) obj;
                sz8 sz8Var = pk0Var.b;
                try {
                    if (sq3Var instanceof kk0) {
                        kk0Var = (kk0) sq3Var;
                        int i3 = kk0Var.v;
                        if ((i3 & Integer.MIN_VALUE) != 0) {
                            kk0Var.v = i3 - Integer.MIN_VALUE;
                            Object obj2 = kk0Var.t;
                            lu3 lu3Var = lu3.a;
                            i = kk0Var.v;
                            int i4 = 1;
                            rq3 rq3Var = null;
                            if (i != 0) {
                                y6a.M(obj2);
                                if (d7aVar instanceof k6e) {
                                    k6eVar = (k6e) d7aVar;
                                    f5e f5eVar = k6eVar.h;
                                    f5e f5eVar2 = k6eVar.i;
                                    if (f5eVar2.f() == 0) {
                                        if (f5eVar.f() > 0) {
                                            sz8Var.d(0, f5eVar.f());
                                        }
                                    } else if (f5eVar.f() != 0) {
                                        pk0Var.g.set(f5eVar2);
                                        CoroutineContext coroutineContext = pk0Var.d;
                                        r1 r1Var = new r1(k6eVar, pk0Var, rq3Var, i4);
                                        kk0Var.r = pk0Var;
                                        kk0Var.s = k6eVar;
                                        kk0Var.v = 1;
                                        obj2 = xw3.R(coroutineContext, r1Var, kk0Var);
                                        if (obj2 == lu3Var) {
                                            return lu3Var;
                                        }
                                        vhe vheVar = (vhe) obj2;
                                        pk0Var.g.set(null);
                                        f5e f5eVar3 = k6eVar.i;
                                        f5e f5eVar4 = k6eVar.h;
                                        sz8 sz8Var2 = pk0Var.b;
                                        f5eVar3.getClass();
                                        vheVar.getClass();
                                        i25 i25Var = vheVar.a;
                                        z = vheVar.b;
                                        if (z) {
                                        }
                                        f5e f5eVar5 = k6eVar.i;
                                        int i5 = pk0Var.f;
                                        f5eVar5.getClass();
                                        if (z) {
                                        }
                                        pk0Var.f = d;
                                        a(d);
                                    } else if (f5eVar2.f() > 0) {
                                        sz8Var.f(0, f5eVar2.f());
                                    }
                                } else if (d7aVar instanceof j6e) {
                                    j6e j6eVar = (j6e) d7aVar;
                                    int i6 = j6eVar.j;
                                    int size = j6eVar.h.size();
                                    int min = Math.min(i6, size);
                                    int i7 = i6 - min;
                                    int i8 = size - min;
                                    if (min > 0) {
                                        sz8Var.g(i7, min, null);
                                    }
                                    if (i8 > 0) {
                                        sz8Var.d(0, i8);
                                    }
                                    int i9 = (j6eVar.i - i6) + min;
                                    if (i9 > 0) {
                                        sz8Var.d(0, i9);
                                    } else if (i9 < 0) {
                                        sz8Var.f(0, -i9);
                                    }
                                } else if (d7aVar instanceof g6e) {
                                    g6e g6eVar = (g6e) d7aVar;
                                    int i10 = g6eVar.h;
                                    int i11 = g6eVar.k;
                                    int size2 = g6eVar.i.size();
                                    int min2 = Math.min(i11, size2);
                                    int i12 = size2 - min2;
                                    int i13 = i10 + min2;
                                    if (min2 > 0) {
                                        sz8Var.g(i10, min2, null);
                                    }
                                    if (i12 > 0) {
                                        sz8Var.d(i13, i12);
                                    }
                                    int i14 = g6eVar.j;
                                    int i15 = (i14 - i11) + min2;
                                    int i16 = i10 + size2 + i14;
                                    if (i15 > 0) {
                                        sz8Var.d(i16 - i15, i15);
                                    } else if (i15 < 0) {
                                        sz8Var.f(i16, -i15);
                                    }
                                } else if (d7aVar instanceof i6e) {
                                    i6e i6eVar = (i6e) d7aVar;
                                    int i17 = i6eVar.j;
                                    int i18 = i6eVar.i;
                                    int i19 = (i18 - i6eVar.h) - i17;
                                    if (i19 > 0) {
                                        sz8Var.d(0, i19);
                                    } else if (i19 < 0) {
                                        sz8Var.f(0, -i19);
                                    }
                                    int max = Math.max(0, i17 + i19);
                                    int i20 = i18 - max;
                                    if (i20 > 0) {
                                        sz8Var.g(max, i20, null);
                                    }
                                } else {
                                    if (!(d7aVar instanceof h6e)) {
                                        zzl.b();
                                        return null;
                                    }
                                    h6e h6eVar = (h6e) d7aVar;
                                    int i21 = h6eVar.h;
                                    int i22 = h6eVar.j;
                                    int i23 = h6eVar.k;
                                    int i24 = (i22 - h6eVar.i) - i23;
                                    int i25 = i21 + i22;
                                    if (i24 > 0) {
                                        sz8Var.d(i25 - i24, i24);
                                    } else if (i24 < 0) {
                                        sz8Var.f(i25, -i24);
                                    }
                                    int min3 = (i22 - i23) + (i24 < 0 ? Math.min(i23, -i24) : 0);
                                    if (min3 > 0) {
                                        sz8Var.g(i21, min3, null);
                                    }
                                }
                                return Unit.a;
                            }
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            k6eVar = kk0Var.s;
                            pk0Var = kk0Var.r;
                            y6a.M(obj2);
                            vhe vheVar2 = (vhe) obj2;
                            pk0Var.g.set(null);
                            f5e f5eVar32 = k6eVar.i;
                            f5e f5eVar42 = k6eVar.h;
                            sz8 sz8Var22 = pk0Var.b;
                            f5eVar32.getClass();
                            vheVar2.getClass();
                            i25 i25Var2 = vheVar2.a;
                            z = vheVar2.b;
                            if (z) {
                                int max2 = Math.max(f5eVar32.c, f5eVar42.c);
                                int min4 = Math.min(f5eVar32.c + f5eVar32.b, f5eVar42.c + f5eVar42.b);
                                int i26 = min4 - max2;
                                if (i26 > 0) {
                                    sz8Var22.f(max2, i26);
                                    sz8Var22.d(max2, i26);
                                }
                                int min5 = Math.min(max2, min4);
                                int max3 = Math.max(max2, min4);
                                int i27 = f5eVar32.c;
                                int f = f5eVar42.f();
                                if (i27 > f) {
                                    i27 = f;
                                }
                                int i28 = f5eVar32.c + f5eVar32.b;
                                int f2 = f5eVar42.f();
                                if (i28 > f2) {
                                    i28 = f2;
                                }
                                p25 p25Var = p25.a;
                                int i29 = min5 - i27;
                                if (i29 > 0) {
                                    sz8Var22.g(i27, i29, p25Var);
                                }
                                int i30 = i28 - max3;
                                if (i30 > 0) {
                                    sz8Var22.g(max3, i30, p25Var);
                                }
                                int i31 = f5eVar42.c;
                                int f3 = f5eVar32.f();
                                if (i31 > f3) {
                                    i31 = f3;
                                }
                                int i32 = f5eVar42.c + f5eVar42.b;
                                int f4 = f5eVar32.f();
                                if (i32 > f4) {
                                    i32 = f4;
                                }
                                p25 p25Var2 = p25.b;
                                int i33 = min5 - i31;
                                if (i33 > 0) {
                                    sz8Var22.g(i31, i33, p25Var2);
                                }
                                int i34 = i32 - max3;
                                if (i34 > 0) {
                                    sz8Var22.g(max3, i34, p25Var2);
                                }
                                int f5 = f5eVar42.f() - f5eVar32.f();
                                if (f5 > 0) {
                                    sz8Var22.d(f5eVar32.f(), f5);
                                } else if (f5 < 0) {
                                    sz8Var22.f(f5eVar32.f() + f5, -f5);
                                }
                            } else {
                                b65 b65Var = new b65(f5eVar32, f5eVar42, sz8Var22);
                                i25Var2.b(b65Var);
                                int min6 = Math.min(f5eVar32.c, b65Var.a);
                                int i35 = f5eVar42.c - b65Var.a;
                                if (i35 > 0) {
                                    if (min6 > 0) {
                                        sz8Var22.g(0, min6, p25.c);
                                    }
                                    sz8Var22.d(0, i35);
                                } else if (i35 < 0) {
                                    sz8Var22.f(0, -i35);
                                    int i36 = min6 + i35;
                                    if (i36 > 0) {
                                        sz8Var22.g(0, i36, p25.c);
                                    }
                                }
                                b65Var.a = f5eVar42.c;
                                int min7 = Math.min(f5eVar32.d, b65Var.b);
                                int i37 = f5eVar42.d;
                                int i38 = b65Var.b;
                                int i39 = i37 - i38;
                                int i40 = b65Var.a + b65Var.c + i38;
                                int i41 = i40 - min7;
                                boolean z2 = i41 != f5eVar32.f() - min7;
                                if (i39 > 0) {
                                    sz8Var22.d(i40, i39);
                                } else if (i39 < 0) {
                                    sz8Var22.f(i40 + i39, -i39);
                                    min7 += i39;
                                }
                                if (min7 > 0 && z2) {
                                    sz8Var22.g(i41, min7, p25.c);
                                }
                                b65Var.b = f5eVar42.d;
                            }
                            f5e f5eVar52 = k6eVar.i;
                            int i52 = pk0Var.f;
                            f5eVar52.getClass();
                            if (z) {
                                d = llf.d(i52, llf.j(0, f5eVar42.f()));
                            } else {
                                int i42 = i52 - f5eVar52.c;
                                int i43 = f5eVar52.b;
                                if (i42 >= 0 && i42 < i43) {
                                    for (int i44 = 0; i44 < 30; i44++) {
                                        int i45 = ((i44 / 2) * (i44 % 2 == 1 ? -1 : 1)) + i42;
                                        if (i45 >= 0 && i45 < f5eVar52.b && (a = i25Var2.a(i45)) != -1) {
                                            d = f5eVar42.c + a;
                                        }
                                    }
                                }
                                d = llf.d(i52, llf.j(0, f5eVar42.f()));
                            }
                            pk0Var.f = d;
                            a(d);
                            return Unit.a;
                        }
                    }
                    if (i != 0) {
                    }
                } catch (Throwable th) {
                    pk0Var.g.set(null);
                    throw th;
                }
                kk0Var = new kk0(this, sq3Var);
                Object obj22 = kk0Var.t;
                lu3 lu3Var2 = lu3.a;
                i = kk0Var.v;
                int i46 = 1;
                rq3 rq3Var2 = null;
                break;
            default:
                osa osaVar = (osa) obj;
                ((eoh) osaVar.d).setValue(osaVar.c.d());
                return Unit.a;
        }
    }

    public final xba d() {
        f5e f5eVar = this.d;
        int i = f5eVar.c;
        int i2 = f5eVar.d;
        ArrayList arrayList = f5eVar.a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o13.v(((zvj) it.next()).b, arrayList2);
        }
        return new xba(arrayList2, i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk0(pk0 pk0Var, CoroutineContext coroutineContext) {
        this(coroutineContext, (f6e) null);
        this.m = 0;
        this.n = pk0Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public lk0(osa osaVar, CoroutineContext coroutineContext, f6e f6eVar) {
        this(coroutineContext, f6eVar);
        this.m = 1;
        this.n = osaVar;
    }
}
