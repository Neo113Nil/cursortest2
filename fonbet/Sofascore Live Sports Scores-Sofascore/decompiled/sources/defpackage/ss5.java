package defpackage;

import com.sofascore.model.newNetwork.AiInsightsTennisPossibleResult;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ss5 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;

    public /* synthetic */ ss5(ArrayList arrayList, int i) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2 = this.a;
        ArrayList arrayList = this.b;
        switch (i2) {
            case 0:
                return Double.valueOf(((AiInsightsTennisPossibleResult) arrayList.get(((Number) obj2).intValue())).getProbability()).compareTo(Double.valueOf(((AiInsightsTennisPossibleResult) arrayList.get(((Number) obj).intValue())).getProbability()));
            default:
                String str = (String) obj;
                Iterator it = arrayList.iterator();
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    i = -1;
                    if (!it.hasNext()) {
                        i4 = -1;
                    } else if (!Intrinsics.c((String) it.next(), str)) {
                        i4++;
                    }
                }
                Integer valueOf = Integer.valueOf(i4);
                String str2 = (String) obj2;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (Intrinsics.c((String) it2.next(), str2)) {
                            i = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                return valueOf.compareTo(Integer.valueOf(i));
        }
    }
}
