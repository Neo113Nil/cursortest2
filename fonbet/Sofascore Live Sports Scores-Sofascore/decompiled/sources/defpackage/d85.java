package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class d85 implements b98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ e1d c;

    public /* synthetic */ d85(ArrayList arrayList, e1d e1dVar, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = e1dVar;
    }

    @Override // defpackage.b98
    public final Object emit(Object obj, rq3 rq3Var) {
        int i = this.a;
        e1d e1dVar = this.c;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                i7a i7aVar = (i7a) obj;
                if (i7aVar instanceof b85) {
                    arrayList.add(i7aVar);
                } else if (i7aVar instanceof c85) {
                    arrayList.remove(((c85) i7aVar).a);
                }
                e1dVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            case 1:
                i7a i7aVar2 = (i7a) obj;
                if (i7aVar2 instanceof rd8) {
                    arrayList.add(i7aVar2);
                } else if (i7aVar2 instanceof sd8) {
                    arrayList.remove(((sd8) i7aVar2).a);
                }
                e1dVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
            default:
                i7a i7aVar3 = (i7a) obj;
                if (i7aVar3 instanceof l6f) {
                    arrayList.add(i7aVar3);
                } else if (i7aVar3 instanceof m6f) {
                    arrayList.remove(((m6f) i7aVar3).a);
                } else if (i7aVar3 instanceof k6f) {
                    arrayList.remove(((k6f) i7aVar3).a);
                }
                e1dVar.setValue(Boolean.valueOf(!arrayList.isEmpty()));
                break;
        }
        return Unit.a;
    }
}
