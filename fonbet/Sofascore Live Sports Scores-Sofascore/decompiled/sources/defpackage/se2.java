package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class se2 extends xka implements Function1 {
    public final /* synthetic */ int i;
    public final /* synthetic */ Function1 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se2(int i, Function1 function1) {
        super(1);
        this.i = i;
        this.j = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.i;
        Function1 function1 = this.j;
        switch (i) {
            case 0:
                yma ymaVar = (yma) obj;
                function1.invoke(ymaVar);
                ymaVar.a();
                return Unit.a;
            case 1:
                return new r6a(((Number) function1.invoke(Integer.valueOf((int) (((c7a) obj).a >> 32)))).intValue() << 32);
            case 2:
                return new r6a(((Number) function1.invoke(Integer.valueOf((int) (((c7a) obj).a & 4294967295L)))).intValue() & 4294967295L);
            case 3:
                return new r6a(((Number) function1.invoke(Integer.valueOf((int) (((c7a) obj).a >> 32)))).intValue() << 32);
            case 4:
                return new r6a(((Number) function1.invoke(Integer.valueOf((int) (((c7a) obj).a & 4294967295L)))).intValue() & 4294967295L);
            default:
                return (ltk) function1.invoke(obj);
        }
    }
}
