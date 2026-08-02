package m2;

import eg.b2;
import eg.y1;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f20284a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f20285b;

    /* renamed from: c, reason: collision with root package name */
    public final ReentrantLock f20286c;

    /* renamed from: d, reason: collision with root package name */
    public int f20287d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f20288e;

    /* renamed from: f, reason: collision with root package name */
    public final j[] f20289f;

    /* renamed from: g, reason: collision with root package name */
    public final ng.i f20290g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlin.collections.l f20291h;

    public w(int i5, Function0 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.f20284a = i5;
        this.f20285b = connectionFactory;
        this.f20286c = new ReentrantLock();
        this.f20289f = new j[i5];
        int i10 = ng.j.f20905a;
        this.f20290g = new ng.i(i5);
        this.f20291h = new kotlin.collections.l(i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[Catch: all -> 0x007b, TryCatch #1 {all -> 0x007b, blocks: (B:13:0x0044, B:15:0x0048, B:17:0x004e, B:20:0x0055, B:21:0x006f, B:25:0x007d, B:26:0x0085), top: B:12:0x0044, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:13:0x0044, B:15:0x0048, B:17:0x004e, B:20:0x0055, B:21:0x006f, B:25:0x007d, B:26:0x0085), top: B:12:0x0044, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c cVar) {
        t tVar;
        int i5;
        ng.i iVar;
        ReentrantLock reentrantLock;
        kotlin.collections.l lVar = this.f20291h;
        try {
            try {
                if (cVar instanceof t) {
                    tVar = (t) cVar;
                    int i10 = tVar.f20273c;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        tVar.f20273c = i10 - Integer.MIN_VALUE;
                        Object obj = tVar.f20271a;
                        lf.a aVar = lf.a.f20034a;
                        i5 = tVar.f20273c;
                        iVar = this.f20290g;
                        if (i5 != 0) {
                            h8.b.B(obj);
                            tVar.f20273c = 1;
                            if (iVar.a(tVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            h8.b.B(obj);
                        }
                        reentrantLock = this.f20286c;
                        reentrantLock.lock();
                        if (!this.f20288e) {
                            h8.b.C(21, "Connection pool is closed");
                            throw null;
                        }
                        if (lVar.isEmpty() && this.f20287d < this.f20284a) {
                            j jVar = new j((s2.a) this.f20285b.invoke());
                            j[] jVarArr = this.f20289f;
                            int i11 = this.f20287d;
                            this.f20287d = i11 + 1;
                            jVarArr[i11] = jVar;
                            lVar.addLast(jVar);
                        }
                        return (j) lVar.removeLast();
                    }
                }
                if (!this.f20288e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.f20286c;
            reentrantLock.lock();
        } catch (Throwable th2) {
            iVar.d();
            throw th2;
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.f20271a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = tVar.f20273c;
        iVar = this.f20290g;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:9|(2:10|11)|12|13|14|(1:(1:49)(2:46|(1:48)))(1:16)|17|18|19|20|(1:22)(1:41)|(1:(2:38|39))(3:24|(1:26)|(1:36)(1:30))|31|(1:33)(13:35|12|13|14|(0)(0)|17|18|19|20|(0)(0)|(0)(0)|31|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009a, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        r14 = r14;
        r13 = r13;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[Catch: all -> 0x00a9, TryCatch #0 {all -> 0x00a9, blocks: (B:14:0x00a1, B:16:0x00a5, B:46:0x00ad, B:49:0x00b4), top: B:13:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c A[Catch: all -> 0x009a, TryCatch #1 {all -> 0x009a, blocks: (B:20:0x0041, B:24:0x005c, B:28:0x0070, B:30:0x0076, B:31:0x0081, B:36:0x0078, B:38:0x008f, B:39:0x0094), top: B:19:0x0041 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0088 -> B:12:0x008a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, d dVar, mf.c cVar) {
        u uVar;
        int i5;
        Ref.ObjectRef objectRef;
        u uVar2;
        Throwable th2;
        v vVar;
        long j6;
        boolean z5;
        d dVar2;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i10 = uVar.f20279f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                uVar.f20279f = i10 - Integer.MIN_VALUE;
                Object obj = uVar.f20277d;
                lf.a aVar = lf.a.f20034a;
                i5 = uVar.f20279f;
                if (i5 != 0) {
                    h8.b.B(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    vVar = new v(objectRef2, this, null);
                    uVar.f20275b = dVar;
                    uVar.f20276c = objectRef2;
                    uVar.f20274a = j;
                    uVar.f20279f = 1;
                    cg.a aVar2 = cg.b.f3911b;
                    j6 = 0;
                    if (j > 0) {
                    }
                    if (z5) {
                    }
                    if (b2.b(j6, vVar, uVar) == aVar) {
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j = uVar.f20274a;
                    Ref.ObjectRef objectRef3 = uVar.f20276c;
                    ?? r22 = uVar.f20275b;
                    try {
                        h8.b.B(obj);
                        dVar2 = r22;
                    } catch (Throwable th3) {
                        objectRef = objectRef3;
                        dVar = r22;
                        uVar2 = uVar;
                        th2 = th3;
                    }
                    objectRef = objectRef3;
                    dVar = dVar2;
                    uVar2 = uVar;
                    th2 = null;
                    try {
                        if (th2 instanceof y1) {
                            dVar.invoke();
                        } else {
                            if (th2 != null) {
                                throw th2;
                            }
                            Object obj2 = objectRef.element;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        uVar = uVar2;
                        Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                        vVar = new v(objectRef22, this, null);
                        uVar.f20275b = dVar;
                        uVar.f20276c = objectRef22;
                        uVar.f20274a = j;
                        uVar.f20279f = 1;
                        cg.a aVar22 = cg.b.f3911b;
                        j6 = 0;
                        z5 = j > 0;
                        if (z5) {
                            long e7 = cg.b.e(j, cg.d.g(999999L, cg.e.f3916b));
                            j6 = (!((((int) e7) & 1) == 1) || cg.b.d(e7)) ? cg.b.f(e7, cg.e.f3918d) : e7 >> 1;
                        } else if (z5) {
                            throw new gf.m();
                        }
                        if (b2.b(j6, vVar, uVar) == aVar) {
                            return aVar;
                        }
                        dVar2 = dVar;
                        objectRef3 = objectRef22;
                        objectRef = objectRef3;
                        dVar = dVar2;
                        uVar2 = uVar;
                        th2 = null;
                        if (th2 instanceof y1) {
                        }
                        uVar = uVar2;
                        Ref.ObjectRef objectRef222 = new Ref.ObjectRef();
                        vVar = new v(objectRef222, this, null);
                        uVar.f20275b = dVar;
                        uVar.f20276c = objectRef222;
                        uVar.f20274a = j;
                        uVar.f20279f = 1;
                        cg.a aVar222 = cg.b.f3911b;
                        j6 = 0;
                        if (j > 0) {
                        }
                        if (z5) {
                        }
                        if (b2.b(j6, vVar, uVar) == aVar) {
                        }
                    } catch (Throwable th4) {
                        j jVar = (j) objectRef.element;
                        if (jVar != null) {
                            e(jVar);
                        }
                        throw th4;
                    }
                }
            }
        }
        uVar = new u(this, cVar);
        Object obj3 = uVar.f20277d;
        lf.a aVar3 = lf.a.f20034a;
        i5 = uVar.f20279f;
        if (i5 != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.f20286c;
        reentrantLock.lock();
        try {
            this.f20288e = true;
            for (j jVar : this.f20289f) {
                if (jVar != null) {
                    jVar.close();
                }
            }
            Unit unit = Unit.f19194a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void d(StringBuilder builder) {
        kotlin.collections.l lVar = this.f20291h;
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.f20286c;
        reentrantLock.lock();
        try {
            hf.e b10 = kotlin.collections.t.b();
            int i5 = lVar.f19213c;
            for (int i10 = 0; i10 < i5; i10++) {
                b10.add(lVar.get(i10));
            }
            hf.e a7 = kotlin.collections.t.a(b10);
            builder.append('\t' + toString() + " (");
            builder.append("capacity=" + this.f20284a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            ng.i iVar = this.f20290g;
            iVar.getClass();
            sb2.append(Math.max(ng.h.f20902g.get(iVar), 0));
            sb2.append(", ");
            builder.append(sb2.toString());
            builder.append("queue=(size=" + a7.a() + ")[" + CollectionsKt.J(a7, null, null, null, null, 63) + ']');
            builder.append(")");
            builder.append('\n');
            j[] jVarArr = this.f20289f;
            int length = jVarArr.length;
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                j jVar = jVarArr[i12];
                i11++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i11);
                sb3.append("] - ");
                sb3.append(jVar != null ? jVar.f20234a.toString() : null);
                builder.append(sb3.toString());
                builder.append('\n');
                if (jVar != null) {
                    jVar.n(builder);
                }
            }
            Unit unit = Unit.f19194a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void e(j connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.f20286c;
        reentrantLock.lock();
        try {
            this.f20291h.addLast(connection);
            Unit unit = Unit.f19194a;
            reentrantLock.unlock();
            this.f20290g.d();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }
}
