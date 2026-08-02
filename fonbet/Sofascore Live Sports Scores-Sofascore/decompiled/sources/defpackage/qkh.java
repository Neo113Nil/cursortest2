package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final /* synthetic */ class qkh implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qkh(String str, boolean z, float f, int i) {
        this.d = str;
        this.b = z;
        this.c = f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.d;
        float f = this.c;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                o02.x((String) obj3, z, f, (of3) obj, aba.K(1));
                break;
            default:
                ((Integer) obj2).getClass();
                eth.b(z, f, (tc3) obj3, (of3) obj, aba.K(385));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ qkh(boolean z, float f, tc3 tc3Var, int i) {
        this.b = z;
        this.c = f;
        this.d = tc3Var;
    }
}
