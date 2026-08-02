package defpackage;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qf4 implements ye4 {
    public final kfi a;
    public final vu3 b;
    public final ku3 c;
    public final pog d;
    public final j2d e;
    public int f;
    public g9i g;
    public final sz8 h;
    public final ujg i;
    public final mqi j;
    public final mqi k;
    public final g7h l;

    public qf4(kfi kfiVar, List list, vu3 vu3Var, ku3 ku3Var) {
        list.getClass();
        ku3Var.getClass();
        this.a = kfiVar;
        this.b = vu3Var;
        this.c = ku3Var;
        rq3 rq3Var = null;
        this.d = new pog(new g2(this, rq3Var, 27));
        this.e = new j2d();
        this.h = new sz8(19);
        this.i = new ujg(this, list);
        final int i = 0;
        this.j = ypa.b(new Function0(this) { // from class: ze4
            public final /* synthetic */ qf4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                qf4 qf4Var = this.b;
                switch (i2) {
                    case 0:
                        return qf4Var.a.a();
                    default:
                        return ((lfi) qf4Var.j.getValue()).d();
                }
            }
        });
        final int i2 = 1;
        this.k = ypa.b(new Function0(this) { // from class: ze4
            public final /* synthetic */ qf4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                qf4 qf4Var = this.b;
                switch (i22) {
                    case 0:
                        return qf4Var.a.a();
                    default:
                        return ((lfi) qf4Var.j.getValue()).d();
                }
            }
        });
        this.l = new g7h(ku3Var, new kz3(this, 4), new xt3(8), new ce4(this, rq3Var, 3));
    }

    @Override // defpackage.ye4
    public final Object a(Function2 function2, rq3 rq3Var) {
        mdk mdkVar = (mdk) rq3Var.getContext().get(rik.i);
        if (mdkVar != null) {
            mdkVar.a(this);
        }
        return xw3.R(new mdk(mdkVar, this), new g2(this, function2, null, 28), rq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0041, B:13:0x0049, B:15:0x004d, B:16:0x0053, B:17:0x0055), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        hf4 hf4Var;
        int i;
        j2d j2dVar;
        int i2;
        try {
            if (sq3Var instanceof hf4) {
                hf4Var = (hf4) sq3Var;
                int i3 = hf4Var.u;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hf4Var.u = i3 - Integer.MIN_VALUE;
                    Object obj = hf4Var.s;
                    lu3 lu3Var = lu3.a;
                    i = hf4Var.u;
                    if (i != 0) {
                        y6a.M(obj);
                        j2d j2dVar2 = this.e;
                        hf4Var.r = j2dVar2;
                        hf4Var.u = 1;
                        if (j2dVar2.e(hf4Var) == lu3Var) {
                            return lu3Var;
                        }
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2dVar = hf4Var.r;
                        y6a.M(obj);
                    }
                    i2 = this.f - 1;
                    this.f = i2;
                    if (i2 == 0) {
                        g9i g9iVar = this.g;
                        if (g9iVar != null) {
                            g9iVar.e(null);
                        }
                        this.g = null;
                    }
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            i2 = this.f - 1;
            this.f = i2;
            if (i2 == 0) {
            }
            Unit unit2 = Unit.a;
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        hf4Var = new hf4(this, sq3Var);
        Object obj2 = hf4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = hf4Var.u;
        if (i != 0) {
        }
    }

    public final h7a c() {
        return (h7a) this.k.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(rgc rgcVar, sq3 sq3Var) {
        if4 if4Var;
        int i;
        qa3 qa3Var;
        Throwable a;
        if (sq3Var instanceof if4) {
            if4Var = (if4) sq3Var;
            int i2 = if4Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                if4Var.u = i2 - Integer.MIN_VALUE;
                Object obj = if4Var.s;
                lu3 lu3Var = lu3.a;
                i = if4Var.u;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    qa3 qa3Var2 = rgcVar.b;
                    try {
                        p2g p2gVar = w2g.b;
                        CoroutineContext plus = rgcVar.d.plus(if4Var.getContext());
                        ce4 ce4Var = new ce4(this, rgcVar, rq3Var, i3);
                        if4Var.r = qa3Var2;
                        if4Var.u = 1;
                        Object R = xw3.R(plus, ce4Var, if4Var);
                        if (R == lu3Var) {
                            return lu3Var;
                        }
                        obj = R;
                        qa3Var = qa3Var2;
                    } catch (Throwable th) {
                        th = th;
                        qa3Var = qa3Var2;
                        p2g p2gVar2 = w2g.b;
                        obj = new u2g(th);
                        a = w2g.a(obj);
                        if (a != null) {
                        }
                        return Unit.a;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qa3Var = if4Var.r;
                    try {
                        y6a.M(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        p2g p2gVar22 = w2g.b;
                        obj = new u2g(th);
                        a = w2g.a(obj);
                        if (a != null) {
                        }
                        return Unit.a;
                    }
                }
                p2g p2gVar3 = w2g.b;
                a = w2g.a(obj);
                if (a != null) {
                    qa3Var.V(obj);
                } else {
                    qa3Var.j0(a);
                }
                return Unit.a;
            }
        }
        if4Var = new if4(this, sq3Var);
        Object obj2 = if4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = if4Var.u;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        p2g p2gVar32 = w2g.b;
        a = w2g.a(obj2);
        if (a != null) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048 A[Catch: all -> 0x0057, TryCatch #0 {all -> 0x0057, blocks: (B:11:0x0041, B:13:0x0048, B:14:0x0059), top: B:10:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(sq3 sq3Var) {
        jf4 jf4Var;
        int i;
        j2d j2dVar;
        int i2;
        try {
            if (sq3Var instanceof jf4) {
                jf4Var = (jf4) sq3Var;
                int i3 = jf4Var.u;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    jf4Var.u = i3 - Integer.MIN_VALUE;
                    Object obj = jf4Var.s;
                    lu3 lu3Var = lu3.a;
                    i = jf4Var.u;
                    int i4 = 1;
                    rq3 rq3Var = null;
                    if (i != 0) {
                        y6a.M(obj);
                        j2d j2dVar2 = this.e;
                        jf4Var.r = j2dVar2;
                        jf4Var.u = 1;
                        if (j2dVar2.e(jf4Var) == lu3Var) {
                            return lu3Var;
                        }
                        j2dVar = j2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j2dVar = jf4Var.r;
                        y6a.M(obj);
                    }
                    i2 = this.f + 1;
                    this.f = i2;
                    if (i2 == 1) {
                        this.g = xw3.L(this.c, null, null, new ef4(this, rq3Var, i4), 3);
                    }
                    Unit unit = Unit.a;
                    j2dVar.f(null);
                    return Unit.a;
                }
            }
            i2 = this.f + 1;
            this.f = i2;
            if (i2 == 1) {
            }
            Unit unit2 = Unit.a;
            j2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            j2dVar.f(null);
            throw th;
        }
        jf4Var = new jf4(this, sq3Var);
        Object obj2 = jf4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = jf4Var.u;
        int i42 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
    
        if (r2.b0(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0046, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sq3 sq3Var) {
        kf4 kf4Var;
        int i;
        int intValue;
        int i2;
        Throwable th;
        try {
            if (sq3Var instanceof kf4) {
                kf4Var = (kf4) sq3Var;
                int i3 = kf4Var.u;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    kf4Var.u = i3 - Integer.MIN_VALUE;
                    Object obj = kf4Var.s;
                    lu3 lu3Var = lu3.a;
                    i = kf4Var.u;
                    if (i != 0) {
                        y6a.M(obj);
                        h7a c = c();
                        kf4Var.u = 1;
                        obj = c.d(kf4Var);
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = kf4Var.r;
                            try {
                                y6a.M(obj);
                                return Unit.a;
                            } catch (Throwable th2) {
                                th = th2;
                                this.h.B(new wnf(i2, th));
                                throw th;
                            }
                        }
                        y6a.M(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    ujg ujgVar = this.i;
                    kf4Var.r = intValue;
                    kf4Var.u = 2;
                }
            }
            ujg ujgVar2 = this.i;
            kf4Var.r = intValue;
            kf4Var.u = 2;
        } catch (Throwable th3) {
            i2 = intValue;
            th = th3;
            this.h.B(new wnf(i2, th));
            throw th;
        }
        kf4Var = new kf4(this, sq3Var);
        Object obj2 = kf4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = kf4Var.u;
        if (i != 0) {
        }
        intValue = ((Number) obj2).intValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        if (r11 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(boolean z, rq3 rq3Var) {
        lf4 lf4Var;
        int i;
        adi t;
        boolean z2;
        Pair pair;
        if (rq3Var instanceof lf4) {
            lf4Var = (lf4) rq3Var;
            int i2 = lf4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lf4Var.v = i2 - Integer.MIN_VALUE;
                Object obj = lf4Var.t;
                lu3 lu3Var = lu3.a;
                i = lf4Var.v;
                sz8 sz8Var = this.h;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    t = sz8Var.t();
                    if (t instanceof t9k) {
                        a70.r("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    h7a c = c();
                    lf4Var.s = t;
                    lf4Var.r = z;
                    lf4Var.v = 1;
                    obj = c.d(lf4Var);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            pair = (Pair) obj;
                            adi adiVar = (adi) pair.a;
                            if (((Boolean) pair.b).booleanValue()) {
                            }
                            return adiVar;
                        }
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        pair = (Pair) obj;
                        adi adiVar2 = (adi) pair.a;
                        if (((Boolean) pair.b).booleanValue()) {
                            sz8Var.B(adiVar2);
                        }
                        return adiVar2;
                    }
                    z = lf4Var.r;
                    t = lf4Var.s;
                    y6a.M(obj);
                }
                int intValue = ((Number) obj).intValue();
                z2 = t instanceof od4;
                int i3 = !z2 ? ((od4) t).a : -1;
                if (!z2 && intValue == i3) {
                    return t;
                }
                if (z) {
                    h7a c2 = c();
                    mf4 mf4Var = new mf4(this, i3, rq3Var2, 0);
                    lf4Var.s = null;
                    lf4Var.v = 3;
                    obj = c2.b(mf4Var, lf4Var);
                } else {
                    h7a c3 = c();
                    cl clVar = new cl(this, rq3Var2, 8);
                    lf4Var.s = null;
                    lf4Var.v = 2;
                    obj = c3.e(clVar, lf4Var);
                }
                return lu3Var;
            }
        }
        lf4Var = new lf4(this, rq3Var);
        Object obj2 = lf4Var.t;
        lu3 lu3Var2 = lu3.a;
        i = lf4Var.v;
        sz8 sz8Var2 = this.h;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = t instanceof od4;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return lu3Var2;
    }

    @Override // defpackage.ye4
    public final z88 getData() {
        return this.d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|76|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x005b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012b A[Catch: all -> 0x0155, TryCatch #0 {all -> 0x0155, blocks: (B:29:0x0119, B:31:0x012b, B:35:0x0130), top: B:28:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130 A[Catch: all -> 0x0155, TRY_LEAVE, TryCatch #0 {all -> 0x0155, blocks: (B:29:0x0119, B:31:0x012b, B:35:0x0130), top: B:28:0x0119 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009a A[Catch: uu3 -> 0x005b, TryCatch #2 {uu3 -> 0x005b, blocks: (B:40:0x0056, B:41:0x00f2, B:44:0x0060, B:45:0x00d7, B:60:0x0075, B:62:0x009a, B:63:0x00a0, B:69:0x007f, B:72:0x00c7), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(boolean z, sq3 sq3Var) {
        nf4 nf4Var;
        nf4 nf4Var2;
        fsf fsfVar;
        uu3 uu3Var;
        fsf fsfVar2;
        Throwable th;
        uu3 uu3Var2;
        as2 as2Var;
        fsf fsfVar3;
        dsf dsfVar;
        Object d;
        boolean z2;
        int i;
        Object obj;
        if (sq3Var instanceof nf4) {
            nf4Var = (nf4) sq3Var;
            int i2 = nf4Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nf4Var.y = i2 - Integer.MIN_VALUE;
                nf4Var2 = nf4Var;
                Object obj2 = nf4Var2.w;
                lu3 lu3Var = lu3.a;
                int i3 = 1;
                rq3 rq3Var = null;
                switch (nf4Var2.y) {
                    case 0:
                        y6a.M(obj2);
                        int i4 = 3;
                        if (!z) {
                            h7a c = c();
                            nf4Var2.r = z;
                            nf4Var2.y = 3;
                            obj2 = c.d(nf4Var2);
                            if (obj2 == lu3Var) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            h7a c2 = c();
                            mf4 mf4Var = new mf4(this, intValue, rq3Var, i3);
                            nf4Var2.r = z;
                            nf4Var2.y = 4;
                            obj2 = c2.b(mf4Var, nf4Var2);
                            if (obj2 == lu3Var) {
                            }
                            return (od4) obj2;
                        }
                        nf4Var2.r = z;
                        nf4Var2.y = 1;
                        obj2 = ((lfi) this.j.getValue()).e(new ff4(i4, rq3Var), nf4Var2);
                        if (obj2 == lu3Var) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        h7a c3 = c();
                        nf4Var2.s = obj2;
                        nf4Var2.r = z;
                        nf4Var2.v = hashCode;
                        nf4Var2.y = 2;
                        d = c3.d(nf4Var2);
                        if (d != lu3Var) {
                            int i5 = hashCode;
                            z2 = z;
                            i = i5;
                            obj = obj2;
                            obj2 = d;
                            return new od4(obj, i, ((Number) obj2).intValue());
                        }
                        return lu3Var;
                    case 1:
                        z = nf4Var2.r;
                        y6a.M(obj2);
                        if (obj2 == null) {
                        }
                        h7a c32 = c();
                        nf4Var2.s = obj2;
                        nf4Var2.r = z;
                        nf4Var2.v = hashCode;
                        nf4Var2.y = 2;
                        d = c32.d(nf4Var2);
                        if (d != lu3Var) {
                        }
                        return lu3Var;
                    case 2:
                        i = nf4Var2.v;
                        z2 = nf4Var2.r;
                        obj = nf4Var2.s;
                        try {
                            y6a.M(obj2);
                            return new od4(obj, i, ((Number) obj2).intValue());
                        } catch (uu3 e) {
                            e = e;
                            z = z2;
                            fsf fsfVar4 = new fsf();
                            nf4Var2.s = e;
                            nf4Var2.t = fsfVar4;
                            nf4Var2.u = fsfVar4;
                            nf4Var2.r = z;
                            nf4Var2.y = 5;
                            Object f = this.b.f(e);
                            if (f != lu3Var) {
                                fsfVar = fsfVar4;
                                uu3Var = e;
                                obj2 = f;
                                fsfVar2 = fsfVar;
                                fsfVar2.a = obj2;
                                dsf dsfVar2 = new dsf();
                                try {
                                    as2Var = new as2(fsfVar, this, dsfVar2, rq3Var, 1);
                                    nf4Var2.s = uu3Var;
                                    nf4Var2.t = fsfVar;
                                    nf4Var2.u = dsfVar2;
                                    nf4Var2.y = 6;
                                    if ((!z ? as2Var.invoke(nf4Var2) : c().e(new r3(as2Var, rq3Var, 7), nf4Var2)) != lu3Var) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    uu3Var2 = uu3Var;
                                    de6.a(uu3Var2, th);
                                    throw uu3Var2;
                                }
                            }
                            return lu3Var;
                        }
                    case 3:
                        z = nf4Var2.r;
                        y6a.M(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        h7a c22 = c();
                        mf4 mf4Var2 = new mf4(this, intValue2, rq3Var, i3);
                        nf4Var2.r = z;
                        nf4Var2.y = 4;
                        obj2 = c22.b(mf4Var2, nf4Var2);
                        if (obj2 == lu3Var) {
                        }
                        return (od4) obj2;
                    case 4:
                        boolean z3 = nf4Var2.r;
                        y6a.M(obj2);
                        return (od4) obj2;
                    case 5:
                        z = nf4Var2.r;
                        fsf fsfVar5 = (fsf) nf4Var2.u;
                        fsf fsfVar6 = nf4Var2.t;
                        uu3 uu3Var3 = (uu3) nf4Var2.s;
                        y6a.M(obj2);
                        fsfVar = fsfVar6;
                        fsfVar2 = fsfVar5;
                        uu3Var = uu3Var3;
                        fsfVar2.a = obj2;
                        dsf dsfVar22 = new dsf();
                        as2Var = new as2(fsfVar, this, dsfVar22, rq3Var, 1);
                        nf4Var2.s = uu3Var;
                        nf4Var2.t = fsfVar;
                        nf4Var2.u = dsfVar22;
                        nf4Var2.y = 6;
                        if ((!z ? as2Var.invoke(nf4Var2) : c().e(new r3(as2Var, rq3Var, 7), nf4Var2)) != lu3Var) {
                            fsfVar3 = fsfVar;
                            dsfVar = dsfVar22;
                            Object obj3 = fsfVar3.a;
                            return new od4(obj3, obj3 != null ? obj3.hashCode() : 0, dsfVar.a);
                        }
                        return lu3Var;
                    case 6:
                        dsfVar = (dsf) nf4Var2.u;
                        fsfVar3 = nf4Var2.t;
                        uu3Var2 = (uu3) nf4Var2.s;
                        try {
                            y6a.M(obj2);
                            Object obj32 = fsfVar3.a;
                            return new od4(obj32, obj32 != null ? obj32.hashCode() : 0, dsfVar.a);
                        } catch (Throwable th3) {
                            th = th3;
                            de6.a(uu3Var2, th);
                            throw uu3Var2;
                        }
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        nf4Var = new nf4(this, sq3Var);
        nf4Var2 = nf4Var;
        Object obj22 = nf4Var2.w;
        lu3 lu3Var2 = lu3.a;
        int i32 = 1;
        rq3 rq3Var2 = null;
        switch (nf4Var2.y) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Object obj, boolean z, sq3 sq3Var) {
        of4 of4Var;
        int i;
        dsf dsfVar;
        if (sq3Var instanceof of4) {
            of4Var = (of4) sq3Var;
            int i2 = of4Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                of4Var.u = i2 - Integer.MIN_VALUE;
                Object obj2 = of4Var.s;
                lu3 lu3Var = lu3.a;
                i = of4Var.u;
                if (i != 0) {
                    y6a.M(obj2);
                    dsf dsfVar2 = new dsf();
                    lfi lfiVar = (lfi) this.j.getValue();
                    pf4 pf4Var = new pf4(dsfVar2, this, obj, z, (rq3) null);
                    of4Var.r = dsfVar2;
                    of4Var.u = 1;
                    if (lfiVar.a(pf4Var, of4Var) == lu3Var) {
                        return lu3Var;
                    }
                    dsfVar = dsfVar2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dsfVar = of4Var.r;
                    y6a.M(obj2);
                }
                return new Integer(dsfVar.a);
            }
        }
        of4Var = new of4(this, sq3Var);
        Object obj22 = of4Var.s;
        lu3 lu3Var2 = lu3.a;
        i = of4Var.u;
        if (i != 0) {
        }
        return new Integer(dsfVar.a);
    }
}
