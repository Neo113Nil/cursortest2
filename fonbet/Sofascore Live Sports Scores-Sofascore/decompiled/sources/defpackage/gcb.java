package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class gcb implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ xtc d;
    public final /* synthetic */ int e;

    public /* synthetic */ gcb(int i, String str, xtc xtcVar, int i2) {
        this.b = i;
        this.c = str;
        this.d = xtcVar;
        this.e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                sha.a(aba.K(this.b | 1), this.e, of3Var, this.d, this.c);
                break;
            default:
                ufa.g(this.b, aba.K(this.e | 1), of3Var, this.d, this.c);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ gcb(String str, xtc xtcVar, int i, int i2) {
        this.c = str;
        this.d = xtcVar;
        this.b = i;
        this.e = i2;
    }
}
