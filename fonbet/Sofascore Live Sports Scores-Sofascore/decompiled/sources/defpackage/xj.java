package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class xj implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ xj(int i, long j, String str, Function0 function0, int i2) {
        this.a = 2;
        this.d = i;
        this.c = j;
        this.f = str;
        this.b = function0;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.d;
        Object obj3 = this.b;
        Object obj4 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qx9.a((ald) obj4, (xtc) obj3, this.c, (of3) obj, aba.K(i2 | 1), this.e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                a00.a((pnd) obj4, (xtc) obj3, this.c, (of3) obj, aba.K(i2 | 1), this.e);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int K = aba.K(this.e | 1);
                int i3 = this.d;
                long j = this.c;
                s02.c(i3, j, (String) obj4, (Function0) obj3, (of3) obj, K);
                break;
            case 3:
                ((Integer) obj2).getClass();
                rha.b((String) obj4, (xtc) obj3, this.c, (of3) obj, aba.K(i2 | 1), this.e);
                break;
            default:
                ((Integer) obj2).getClass();
                int K2 = aba.K(i2 | 1);
                long j2 = this.c;
                v7a.e(j2, (List) obj4, (xtc) obj3, (of3) obj, K2, this.e);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ xj(long j, List list, xtc xtcVar, int i, int i2) {
        this.a = 4;
        this.c = j;
        this.f = list;
        this.b = xtcVar;
        this.d = i;
        this.e = i2;
    }

    public /* synthetic */ xj(Object obj, xtc xtcVar, long j, int i, int i2, int i3) {
        this.a = i3;
        this.f = obj;
        this.b = xtcVar;
        this.c = j;
        this.d = i;
        this.e = i2;
    }
}
