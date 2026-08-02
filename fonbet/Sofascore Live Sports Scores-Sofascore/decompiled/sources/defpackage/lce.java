package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class lce implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ lce(int i, String str, String str2, int i2) {
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        int i2 = this.b;
        of3 of3Var = (of3) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nce.b(i2, aba.K(1), of3Var, str2, str);
                break;
            default:
                s6a.b(i2, aba.K(1), of3Var, str2, str);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ lce(String str, String str2, int i, int i2) {
        this.c = str;
        this.d = str2;
        this.b = i;
    }
}
