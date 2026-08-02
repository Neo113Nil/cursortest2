package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cf4 {
    public final /* synthetic */ h2d a;
    public final /* synthetic */ asf b;
    public final /* synthetic */ fsf c;
    public final /* synthetic */ qf4 d;

    public cf4(h2d h2dVar, asf asfVar, fsf fsfVar, qf4 qf4Var) {
        this.a = h2dVar;
        this.b = asfVar;
        this.c = fsfVar;
        this.d = qf4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r10.e(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00a8, B:30:0x00b0), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(jk jkVar, sq3 sq3Var) {
        bf4 bf4Var;
        int i;
        h2d h2dVar;
        asf asfVar;
        fsf fsfVar;
        qf4 qf4Var;
        Function2 function2;
        h2d h2dVar2;
        h2d h2dVar3;
        fsf fsfVar2;
        Object obj;
        try {
            if (sq3Var instanceof bf4) {
                bf4Var = (bf4) sq3Var;
                int i2 = bf4Var.y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bf4Var.y = i2 - Integer.MIN_VALUE;
                    Object obj2 = bf4Var.w;
                    lu3 lu3Var = lu3.a;
                    i = bf4Var.y;
                    if (i != 0) {
                        y6a.M(obj2);
                        bf4Var.r = jkVar;
                        h2dVar = this.a;
                        bf4Var.s = h2dVar;
                        asfVar = this.b;
                        bf4Var.t = asfVar;
                        fsfVar = this.c;
                        bf4Var.u = fsfVar;
                        qf4Var = this.d;
                        bf4Var.v = qf4Var;
                        bf4Var.y = 1;
                        function2 = jkVar;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a70.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = bf4Var.t;
                                fsfVar2 = (fsf) bf4Var.s;
                                h2dVar2 = (h2d) bf4Var.r;
                                try {
                                    y6a.M(obj2);
                                    fsfVar2.a = obj;
                                    Object obj3 = fsfVar2.a;
                                    h2dVar2.f(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    h2dVar2.f(null);
                                    throw th;
                                }
                            }
                            qf4Var = (qf4) bf4Var.t;
                            fsfVar2 = (fsf) bf4Var.s;
                            h2dVar3 = (h2d) bf4Var.r;
                            try {
                                y6a.M(obj2);
                                if (!Intrinsics.c(obj2, fsfVar2.a)) {
                                    h2dVar2 = h2dVar3;
                                    Object obj32 = fsfVar2.a;
                                    h2dVar2.f(null);
                                    return obj32;
                                }
                                bf4Var.r = h2dVar3;
                                bf4Var.s = fsfVar2;
                                bf4Var.t = obj2;
                                bf4Var.y = 3;
                                if (qf4Var.i(obj2, false, bf4Var) != lu3Var) {
                                    obj = obj2;
                                    h2dVar2 = h2dVar3;
                                    fsfVar2.a = obj;
                                    Object obj322 = fsfVar2.a;
                                    h2dVar2.f(null);
                                    return obj322;
                                }
                                return lu3Var;
                            } catch (Throwable th2) {
                                th = th2;
                                h2dVar2 = h2dVar3;
                                h2dVar2.f(null);
                                throw th;
                            }
                        }
                        qf4Var = bf4Var.v;
                        fsf fsfVar3 = bf4Var.u;
                        asfVar = (asf) bf4Var.t;
                        h2d h2dVar4 = (h2d) bf4Var.s;
                        Function2 function22 = (Function2) bf4Var.r;
                        y6a.M(obj2);
                        fsfVar = fsfVar3;
                        function2 = function22;
                        h2dVar = h2dVar4;
                    }
                    if (!asfVar.a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = fsfVar.a;
                    bf4Var.r = h2dVar;
                    bf4Var.s = fsfVar;
                    bf4Var.t = qf4Var;
                    bf4Var.u = null;
                    bf4Var.v = null;
                    bf4Var.y = 2;
                    Object invoke = function2.invoke(obj4, bf4Var);
                    if (invoke != lu3Var) {
                        h2dVar3 = h2dVar;
                        obj2 = invoke;
                        fsfVar2 = fsfVar;
                        if (!Intrinsics.c(obj2, fsfVar2.a)) {
                        }
                    }
                    return lu3Var;
                }
            }
            if (!asfVar.a) {
            }
        } catch (Throwable th3) {
            th = th3;
            h2dVar2 = h2dVar;
            h2dVar2.f(null);
            throw th;
        }
        bf4Var = new bf4(this, sq3Var);
        Object obj22 = bf4Var.w;
        lu3 lu3Var2 = lu3.a;
        i = bf4Var.y;
        if (i != 0) {
        }
    }
}
