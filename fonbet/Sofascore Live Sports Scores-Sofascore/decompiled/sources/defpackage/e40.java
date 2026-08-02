package defpackage;

import java.io.IOException;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class e40 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e40(long j, e1d e1dVar) {
        this.a = 3;
        this.b = j;
        this.c = e1dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z;
        switch (this.a) {
            case 0:
                return ((oah) ((n52) this.c)).b(this.b);
            case 1:
                zg9 zg9Var = (zg9) this.c;
                long j = this.b;
                synchronized (zg9Var) {
                    long j2 = zg9Var.m;
                    long j3 = zg9Var.l;
                    if (j2 < j3) {
                        z = true;
                    } else {
                        zg9Var.l = j3 + 1;
                        z = false;
                    }
                }
                if (z) {
                    tp5 tp5Var = tp5.PROTOCOL_ERROR;
                    zg9Var.e(tp5Var, tp5Var, null);
                    j = -1;
                } else {
                    try {
                        zg9Var.x.j(1, 0, false);
                    } catch (IOException e) {
                        tp5 tp5Var2 = tp5.PROTOCOL_ERROR;
                        zg9Var.e(tp5Var2, tp5Var2, e);
                    }
                }
                return Long.valueOf(j);
            case 2:
                return new scj((String) this.c, this.b);
            default:
                long j4 = this.b;
                cdi cdiVar = (cdi) this.c;
                long longValue = j4 - ((Number) cdiVar.getValue()).longValue();
                be5 be5Var = be5.SECONDS;
                long S = wkn.S(longValue, be5Var);
                long k = xd5.k(S, be5Var);
                if (k < 0) {
                    k = 0;
                }
                int i = (int) k;
                long k2 = xd5.k(S, be5.DAYS);
                if (k2 < 0) {
                    k2 = 0;
                }
                int i2 = (int) k2;
                long k3 = xd5.k(S, be5.HOURS) % 24;
                if (k3 < 0) {
                    k3 = 0;
                }
                int i3 = (int) k3;
                long k4 = xd5.k(S, be5.MINUTES) % 60;
                if (k4 < 0) {
                    k4 = 0;
                }
                int i4 = (int) k4;
                long k5 = xd5.k(S, be5Var) % 60;
                return new js8(((Number) cdiVar.getValue()).longValue() < j4, ((Number) cdiVar.getValue()).longValue(), i, i2, i3, i4, (int) (k5 >= 0 ? k5 : 0L));
        }
    }

    public /* synthetic */ e40(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
