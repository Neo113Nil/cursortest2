package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class ru5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ru5(int i, int i2, Function1 function1) {
        this.a = i2;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(new it5(i2, ((Integer) obj).intValue()));
                break;
            default:
                ((Boolean) obj).booleanValue();
                function1.invoke(Integer.valueOf(i2));
                break;
        }
        return Unit.a;
    }
}
