package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class qlk extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ rlk j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qlk(rlk rlkVar, int i) {
        super(0);
        this.i = i;
        this.j = rlkVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [km5] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Iterable] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ?? r1;
        flk flkVar;
        alk alkVar;
        int i = this.i;
        rlk rlkVar = this.j;
        switch (i) {
            case 0:
                h5c h5cVar = new h5c();
                ilk ilkVar = (ilk) CollectionsKt.firstOrNull((List) rlkVar.i.getValue());
                h5cVar.b(ilkVar != null ? ilkVar.a : null);
                String str = rlkVar.a;
                str.getClass();
                h5cVar.a = str;
                return h5cVar.a();
            default:
                tkk tkkVar = rlkVar.d.b;
                if (tkkVar == null || (flkVar = tkkVar.a) == null || (alkVar = flkVar.d) == null) {
                    r1 = km5.a;
                } else {
                    ArrayList arrayList = alkVar.a;
                    r1 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        List a = ((zkk) next).a();
                        if (a != null && !a.isEmpty()) {
                            r1.add(next);
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = r1.iterator();
                while (it2.hasNext()) {
                    List a2 = ((zkk) it2.next()).a();
                    if (a2 == null) {
                        a2 = km5.a;
                    }
                    o13.v(a2, arrayList2);
                }
                return CollectionsKt.H0(arrayList2, new mye(new q6i(12), rlkVar.e));
        }
    }
}
