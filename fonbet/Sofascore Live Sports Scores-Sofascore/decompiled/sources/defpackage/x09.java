package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class x09 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ oog b;

    public /* synthetic */ x09(oog oogVar, int i) {
        this.a = i;
        this.b = oogVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        oog oogVar = this.b;
        switch (i) {
            case 0:
                oogVar.resumeWith(((w2g) obj).a);
                break;
            case 1:
                ugj.a.getClass();
                p2g p2gVar = w2g.b;
                oogVar.resumeWith((String) obj);
                break;
            case 2:
                oogVar.resumeWith(((w2g) obj).a);
                break;
            default:
                p2g p2gVar2 = w2g.b;
                oogVar.resumeWith((String) obj);
                break;
        }
        return Unit.a;
    }
}
