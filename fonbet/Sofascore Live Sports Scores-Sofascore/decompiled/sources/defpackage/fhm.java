package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class fhm implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ v4m c;

    public /* synthetic */ fhm(Function1 function1, v4m v4mVar, int i) {
        this.a = i;
        this.b = function1;
        this.c = v4mVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        v4m v4mVar = this.c;
        Function1 function1 = this.b;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                break;
            default:
                str.getClass();
                break;
        }
        return (List) function1.invoke(v4mVar.a);
    }
}
