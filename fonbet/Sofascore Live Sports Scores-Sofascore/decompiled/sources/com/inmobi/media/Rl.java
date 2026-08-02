package com.inmobi.media;

import defpackage.a70;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.y6a;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Rl {
    public static final Rl a = new Rl();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ab, code lost:
    
        if (defpackage.n4o.y(100, r0) == r15) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00ab -> B:11:0x0055). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, sq3 sq3Var) {
        Ql ql;
        int i;
        int i2;
        Xe xe;
        InterfaceC3317bf interfaceC3317bf;
        if (sq3Var instanceof Ql) {
            ql = (Ql) sq3Var;
            int i3 = ql.e;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ql.e = i3 - Integer.MIN_VALUE;
                Object obj = ql.c;
                lu3 lu3Var = lu3.a;
                i = ql.e;
                if (i != 0) {
                    y6a.M(obj);
                    if (!Nl.a(str)) {
                        throw new Sl((short) 1114);
                    }
                    Xe xe2 = new Xe(str, null, null, null, null, false, 62);
                    i2 = 0;
                    xe = xe2;
                } else {
                    if (i == 1) {
                        i2 = ql.a;
                        xe = ql.b;
                        y6a.M(obj);
                        interfaceC3317bf = (InterfaceC3317bf) obj;
                        if (!Fl.a(interfaceC3317bf)) {
                            IntRange intRange = AbstractC3446gf.a;
                            interfaceC3317bf.getClass();
                            return interfaceC3317bf.d().r(Charsets.UTF_8);
                        }
                        IntRange intRange2 = AbstractC3446gf.a;
                        interfaceC3317bf.getClass();
                        IntRange intRange3 = AbstractC3446gf.b;
                        int i4 = intRange3.a;
                        int i5 = intRange3.b;
                        int c = interfaceC3317bf.c();
                        if (i4 > c || c > i5) {
                            ql.b = xe;
                            ql.a = i2;
                            ql.e = 2;
                        }
                        throw new Sl((short) 1113);
                    }
                    if (i != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = ql.a;
                    xe = ql.b;
                    y6a.M(obj);
                }
                int i6 = i2 + 1;
                if (i2 < 3) {
                    F9 f9 = (F9) Ve.c.getValue();
                    ql.b = xe;
                    ql.a = i6;
                    ql.e = 1;
                    Object a2 = f9.a.a(xe, ql);
                    if (a2 != lu3Var) {
                        i2 = i6;
                        obj = a2;
                        interfaceC3317bf = (InterfaceC3317bf) obj;
                        if (!Fl.a(interfaceC3317bf)) {
                        }
                    }
                    return lu3Var;
                }
                throw new Sl((short) 1113);
            }
        }
        ql = new Ql(this, sq3Var);
        Object obj2 = ql.c;
        lu3 lu3Var2 = lu3.a;
        i = ql.e;
        if (i != 0) {
        }
        int i62 = i2 + 1;
        if (i2 < 3) {
        }
        throw new Sl((short) 1113);
    }
}
