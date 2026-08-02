package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class epa implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1d b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ epa(e1d e1dVar, ArrayList arrayList, List list, boolean z, int i) {
        this.a = i;
        this.b = e1dVar;
        this.c = arrayList;
        this.d = list;
        this.e = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = this.e;
        List list = this.d;
        ArrayList arrayList = this.c;
        e1d e1dVar = this.b;
        phe pheVar = (phe) obj;
        switch (i) {
            case 0:
                pheVar.a = true;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((gpa) arrayList.get(i2)).k(pheVar, z);
                }
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    ((gpa) list.get(i3)).k(pheVar, z);
                }
                Unit unit = Unit.a;
                pheVar.a = false;
                e1dVar.getValue();
                break;
            default:
                pheVar.a = true;
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((dsa) arrayList.get(i4)).l(pheVar, z);
                }
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    ((dsa) list.get(i5)).l(pheVar, z);
                }
                Unit unit2 = Unit.a;
                pheVar.a = false;
                e1dVar.getValue();
                break;
        }
        return Unit.a;
    }
}
