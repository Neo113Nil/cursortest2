package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class yyh implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zyh b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ yyh(zyh zyhVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = zyhVar;
        this.c = arrayList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        ArrayList arrayList = this.c;
        zyh zyhVar = this.b;
        glg glgVar = (glg) obj;
        switch (i) {
            case 0:
                glgVar.getClass();
                zyhVar.b.Z(glgVar, arrayList);
                break;
            default:
                glgVar.getClass();
                zyhVar.c.J(glgVar, arrayList);
                break;
        }
        return Unit.a;
    }
}
