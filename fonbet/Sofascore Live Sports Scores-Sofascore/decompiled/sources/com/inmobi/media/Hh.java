package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Hh {
    public final h2d a = new j2d();
    public WeakReference b = new WeakReference(null);
    public int c;

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(1:(1:(2:13|14)(2:16|17))(2:18|19))(3:20|21|(1:24)(1:23)))(1:26))(1:29)|27))|36|6|7|(0)(0)|27) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r10 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005a, code lost:
    
        if (a((defpackage.sq3) r0) == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        r0.a = r9;
        r0.d = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r8.a(r0) != r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0080, code lost:
    
        throw r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(M3 m3, sq3 sq3Var) {
        Gh gh;
        int i;
        Function1 function1;
        if (sq3Var instanceof Gh) {
            gh = (Gh) sq3Var;
            int i2 = gh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gh.d = i2 - Integer.MIN_VALUE;
                Object obj = gh.b;
                lu3 lu3Var = lu3.a;
                i = gh.d;
                if (i != 0) {
                    y6a.M(obj);
                    gh.a = m3;
                    gh.d = 1;
                    function1 = m3;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            gh.a = obj;
                            gh.d = 3;
                            this = a(gh);
                            return this == lu3Var ? lu3Var : obj;
                        }
                        if (i == 3) {
                            Object obj2 = gh.a;
                            y6a.M(obj);
                            return obj2;
                        }
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Throwable th = (Throwable) gh.a;
                        y6a.M(obj);
                        throw th;
                    }
                    Function1 function12 = (Function1) gh.a;
                    y6a.M(obj);
                    function1 = function12;
                }
                gh.a = null;
                gh.d = 2;
                obj = function1.invoke(gh);
            }
        }
        gh = new Gh(this, sq3Var);
        Object obj3 = gh.b;
        lu3 lu3Var2 = lu3.a;
        i = gh.d;
        if (i != 0) {
        }
        gh.a = null;
        gh.d = 2;
        obj3 = function1.invoke(gh);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        Fh fh;
        int i;
        CoroutineContext coroutineContext;
        if (sq3Var instanceof Fh) {
            fh = (Fh) sq3Var;
            int i2 = fh.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fh.d = i2 - Integer.MIN_VALUE;
                Object obj = fh.b;
                lu3 lu3Var = lu3.a;
                i = fh.d;
                if (i != 0) {
                    y6a.M(obj);
                    CoroutineContext context = fh.getContext();
                    System.out.println(fh.getContext());
                    if (Intrinsics.c(this.b.get(), context)) {
                        this.c++;
                        return Unit.a;
                    }
                    h2d h2dVar = this.a;
                    fh.a = context;
                    fh.d = 1;
                    if (h2dVar.e(fh) == lu3Var) {
                        return lu3Var;
                    }
                    coroutineContext = context;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    coroutineContext = fh.a;
                    y6a.M(obj);
                }
                this.b = new WeakReference(coroutineContext);
                this.c = 1;
                return Unit.a;
            }
        }
        fh = new Fh(this, sq3Var);
        Object obj2 = fh.b;
        lu3 lu3Var2 = lu3.a;
        i = fh.d;
        if (i != 0) {
        }
        this.b = new WeakReference(coroutineContext);
        this.c = 1;
        return Unit.a;
    }

    public final Unit a(Gh gh) {
        CoroutineContext context = gh.getContext();
        System.out.println(gh.getContext());
        if (Intrinsics.c(this.b.get(), context)) {
            int i = this.c - 1;
            this.c = i;
            if (i == 0) {
                this.b = new WeakReference(null);
                this.a.f(null);
            }
            return Unit.a;
        }
        a70.r("ReentrantMutex is not locked by this coroutine.");
        return null;
    }
}
