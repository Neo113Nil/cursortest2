package com.inmobi.media;

import defpackage.a70;
import defpackage.h2d;
import defpackage.j2d;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Cb {
    public final h2d[] a;
    public final LinkedHashMap b;

    public Cb() {
        h2d[] h2dVarArr = new h2d[16];
        for (int i = 0; i < 16; i++) {
            h2dVarArr[i] = new j2d();
        }
        this.a = h2dVarArr;
        this.b = new LinkedHashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0069, code lost:
    
        if (r11.e(r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0074 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #1 {all -> 0x008f, blocks: (B:26:0x006c, B:28:0x0074), top: B:25:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Go go, sq3 sq3Var) {
        Ab ab;
        int i;
        h2d h2dVar;
        Function1 function1;
        h2d h2dVar2;
        Object obj;
        String str2;
        try {
            if (sq3Var instanceof Ab) {
                ab = (Ab) sq3Var;
                int i2 = ab.f;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ab.f = i2 - Integer.MIN_VALUE;
                    Object obj2 = ab.d;
                    lu3 lu3Var = lu3.a;
                    i = ab.f;
                    if (i != 0) {
                        y6a.M(obj2);
                        h2dVar = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                        ab.a = str;
                        ab.b = go;
                        ab.c = h2dVar;
                        ab.f = 1;
                        function1 = go;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            h2dVar2 = (h2d) ab.b;
                            str2 = ab.a;
                            try {
                                y6a.M(obj2);
                                this.b.put(str2, obj2);
                                obj = obj2;
                                h2dVar = h2dVar2;
                                h2dVar.f(null);
                                return obj;
                            } catch (Throwable th) {
                                th = th;
                                h2dVar2.f(null);
                                throw th;
                            }
                        }
                        h2d h2dVar3 = ab.c;
                        Function1 function12 = (Function1) ab.b;
                        String str3 = ab.a;
                        y6a.M(obj2);
                        h2dVar = h2dVar3;
                        str = str3;
                        function1 = function12;
                    }
                    obj = this.b.get(str);
                    if (obj == null) {
                        ab.a = str;
                        ab.b = h2dVar;
                        ab.c = null;
                        ab.f = 2;
                        Object invoke = function1.invoke(ab);
                        if (invoke != lu3Var) {
                            str2 = str;
                            h2dVar2 = h2dVar;
                            obj2 = invoke;
                            this.b.put(str2, obj2);
                            obj = obj2;
                            h2dVar = h2dVar2;
                        }
                        return lu3Var;
                    }
                    h2dVar.f(null);
                    return obj;
                }
            }
            obj = this.b.get(str);
            if (obj == null) {
            }
            h2dVar.f(null);
            return obj;
        } catch (Throwable th2) {
            th = th2;
            h2dVar2 = h2dVar;
            h2dVar2.f(null);
            throw th;
        }
        ab = new Ab(this, sq3Var);
        Object obj22 = ab.d;
        lu3 lu3Var2 = lu3.a;
        i = ab.f;
        if (i != 0) {
        }
    }

    public final String toString() {
        return this.b.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        Bb bb;
        int i;
        String str2;
        h2d h2dVar;
        try {
            if (sq3Var instanceof Bb) {
                bb = (Bb) sq3Var;
                int i2 = bb.e;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bb.e = i2 - Integer.MIN_VALUE;
                    Object obj = bb.c;
                    lu3 lu3Var = lu3.a;
                    i = bb.e;
                    if (i != 0) {
                        y6a.M(obj);
                        h2d h2dVar2 = this.a[Math.floorMod(str != null ? str.hashCode() : 0, 16)];
                        bb.a = str;
                        bb.b = h2dVar2;
                        bb.e = 1;
                        if (h2dVar2.e(bb) == lu3Var) {
                            return lu3Var;
                        }
                        str2 = str;
                        h2dVar = h2dVar2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        h2dVar = bb.b;
                        str2 = bb.a;
                        y6a.M(obj);
                    }
                    this.b.remove(str2);
                    h2dVar.f(null);
                    return Unit.a;
                }
            }
            this.b.remove(str2);
            h2dVar.f(null);
            return Unit.a;
        } catch (Throwable th) {
            h2dVar.f(null);
            throw th;
        }
        bb = new Bb(this, sq3Var);
        Object obj2 = bb.c;
        lu3 lu3Var2 = lu3.a;
        i = bb.e;
        if (i != 0) {
        }
    }
}
