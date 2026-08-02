package defpackage;

import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class fto extends puo {
    public final /* synthetic */ int h = 3;
    public final Object i;

    public fto(zro zroVar, s9n s9nVar, int i, View view) {
        super(zroVar, "K/Oo81d3D7QQWAvkxOkmH49qSlOsGQFHscMya6S21HBqr+GdnpBDhLtEJWB1CCZB", "Ge8je/arysmNa4UdtKuRe+4JSpIyhDOrTZ5OtsYb5ag=", s9nVar, i, 57);
        this.i = view;
    }

    @Override // defpackage.puo
    public final void a() {
        int i = 2;
        switch (this.h) {
            case 0:
                Method method = this.e;
                cso csoVar = (cso) this.i;
                long[] jArr = (long[]) method.invoke(null, Long.valueOf(csoVar.c), Long.valueOf(csoVar.d), Long.valueOf(csoVar.e), Long.valueOf(csoVar.f));
                s9n s9nVar = this.d;
                synchronized (s9nVar) {
                    long j = jArr[0];
                    s9nVar.b();
                    ((cmn) s9nVar.b).X(j);
                    long j2 = jArr[1];
                    s9nVar.b();
                    ((cmn) s9nVar.b).Y(j2);
                }
                return;
            case 1:
                Method method2 = this.e;
                hro hroVar = (hro) this.i;
                List list = hroVar.a;
                hroVar.a = Collections.EMPTY_LIST;
                int intValue = ((Integer) method2.invoke(null, list)).intValue();
                s9n s9nVar2 = this.d;
                synchronized (s9nVar2) {
                    int Q = waa.Q(intValue);
                    s9nVar2.b();
                    ((cmn) s9nVar2.b).g0(Q);
                }
                return;
            case 2:
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) this.i;
                if (stackTraceElementArr != null) {
                    gro groVar = new gro((String) this.e.invoke(null, stackTraceElementArr));
                    s9n s9nVar3 = this.d;
                    synchronized (s9nVar3) {
                        try {
                            long longValue = groVar.a.longValue();
                            s9nVar3.b();
                            ((cmn) s9nVar3.b).D(longValue);
                            if (groVar.b.booleanValue()) {
                                if (true == groVar.c.booleanValue()) {
                                    i = 1;
                                }
                                s9nVar3.b();
                                ((cmn) s9nVar3.b).d0(i);
                            } else {
                                s9nVar3.b();
                                ((cmn) s9nVar3.b).d0(3);
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                View view = (View) this.i;
                if (view != null) {
                    kwo kwoVar = exo.u;
                    bwo bwoVar = bwo.e;
                    Boolean bool = (Boolean) bwoVar.c.a(kwoVar);
                    Boolean bool2 = (Boolean) bwoVar.c.a(exo.w);
                    String str = (String) this.e.invoke(null, view, this.a.a.getResources().getDisplayMetrics(), bool, bool2);
                    hso hsoVar = new hso();
                    HashMap b = neo.b(str);
                    if (b != null) {
                        hsoVar.a = (Long) b.get(0);
                        hsoVar.b = (Long) b.get(1);
                        hsoVar.c = (Long) b.get(2);
                        hsoVar.d = (Long) b.get(3);
                        hsoVar.e = (Long) b.get(4);
                    }
                    qln s = tln.s();
                    long longValue2 = hsoVar.a.longValue();
                    s.b();
                    ((tln) s.b).u(longValue2);
                    long longValue3 = hsoVar.b.longValue();
                    s.b();
                    ((tln) s.b).v(longValue3);
                    long longValue4 = hsoVar.c.longValue();
                    s.b();
                    ((tln) s.b).w(longValue4);
                    if (bool2.booleanValue()) {
                        long longValue5 = hsoVar.e.longValue();
                        s.b();
                        ((tln) s.b).t(longValue5);
                    }
                    if (bool.booleanValue()) {
                        long longValue6 = hsoVar.d.longValue();
                        s.b();
                        ((tln) s.b).x(longValue6);
                    }
                    s9n s9nVar4 = this.d;
                    tln tlnVar = (tln) s.c();
                    s9nVar4.b();
                    ((cmn) s9nVar4.b).M(tlnVar);
                    return;
                }
                return;
        }
    }

    public fto(zro zroVar, s9n s9nVar, int i, hro hroVar) {
        super(zroVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", s9nVar, i, 94);
        this.i = hroVar;
    }

    public fto(zro zroVar, s9n s9nVar, int i, cso csoVar) {
        super(zroVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", s9nVar, i, 85);
        this.i = csoVar;
    }

    public fto(zro zroVar, s9n s9nVar, int i, StackTraceElement[] stackTraceElementArr) {
        super(zroVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", s9nVar, i, 45);
        this.i = stackTraceElementArr;
    }
}
