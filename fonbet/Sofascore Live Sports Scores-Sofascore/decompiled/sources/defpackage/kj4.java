package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class kj4 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ kj4(int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 1:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 2:
                function1.invoke(Integer.valueOf(i2));
                break;
            case 3:
                function1.invoke(new exi(i2));
                break;
            case 4:
                function1.invoke(new jtj(i2 - 1));
                break;
            case 5:
                function1.invoke(new jtj(i2 + 1));
                break;
            case 6:
                function1.invoke(Integer.valueOf(i2));
                break;
            default:
                function1.invoke(Integer.valueOf(i2));
                break;
        }
        return Unit.a;
    }
}
