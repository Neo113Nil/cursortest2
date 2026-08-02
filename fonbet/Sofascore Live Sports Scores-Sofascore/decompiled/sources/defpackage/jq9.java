package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class jq9 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ d7e c;
    public final /* synthetic */ long d;
    public final /* synthetic */ xtc e;
    public final /* synthetic */ int f;

    public /* synthetic */ jq9(d7e d7eVar, String str, xtc xtcVar, long j, int i) {
        this.c = d7eVar;
        this.b = str;
        this.e = xtcVar;
        this.d = j;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                lq9.a(aba.K(this.f | 1), this.d, (of3) obj, this.e, this.c, this.b);
                break;
            default:
                ((Integer) obj2).getClass();
                i9a.l(aba.K(this.f | 1), this.d, (of3) obj, this.e, this.c, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jq9(String str, d7e d7eVar, long j, xtc xtcVar, int i) {
        this.b = str;
        this.c = d7eVar;
        this.d = j;
        this.e = xtcVar;
        this.f = i;
    }
}
