package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mye implements Comparator {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public mye(int i, pye pyeVar) {
        this.b = i;
        this.c = pyeVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Integer valueOf;
        Integer valueOf2;
        int i = this.a;
        Object obj3 = this.c;
        int i2 = this.b;
        switch (i) {
            case 0:
                sle sleVar = (sle) obj;
                pye pyeVar = (pye) obj3;
                int i3 = -1;
                int i4 = 0;
                if (i2 == 1) {
                    gye gyeVar = pyeVar.e;
                    if (gyeVar == null) {
                        Intrinsics.i("playersAveragePositionsData");
                        throw null;
                    }
                    Iterator it = gyeVar.m.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i5 = -1;
                        } else if (((Number) it.next()).intValue() != sleVar.a.getId()) {
                            i5++;
                        }
                    }
                    valueOf = Integer.valueOf(i5);
                } else {
                    gye gyeVar2 = pyeVar.e;
                    if (gyeVar2 == null) {
                        Intrinsics.i("playersAveragePositionsData");
                        throw null;
                    }
                    Iterator it2 = gyeVar2.n.iterator();
                    int i6 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            i6 = -1;
                        } else if (((Number) it2.next()).intValue() != sleVar.a.getId()) {
                            i6++;
                        }
                    }
                    valueOf = Integer.valueOf(i6);
                }
                sle sleVar2 = (sle) obj2;
                if (i2 == 1) {
                    gye gyeVar3 = pyeVar.e;
                    if (gyeVar3 == null) {
                        Intrinsics.i("playersAveragePositionsData");
                        throw null;
                    }
                    Iterator it3 = gyeVar3.m.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((Number) it3.next()).intValue() == sleVar2.a.getId()) {
                                i3 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    valueOf2 = Integer.valueOf(i3);
                } else {
                    gye gyeVar4 = pyeVar.e;
                    if (gyeVar4 == null) {
                        Intrinsics.i("playersAveragePositionsData");
                        throw null;
                    }
                    Iterator it4 = gyeVar4.n.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            if (((Number) it4.next()).intValue() == sleVar2.a.getId()) {
                                i3 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    valueOf2 = Integer.valueOf(i3);
                }
                return valueOf.compareTo(valueOf2);
            default:
                int compare = ((q6i) obj3).compare(obj, obj2);
                if (compare != 0) {
                    return compare;
                }
                Integer num = ((ilk) obj).b;
                Integer valueOf3 = Integer.valueOf(Math.abs((num != null ? num.intValue() : Integer.MAX_VALUE) - i2));
                Integer num2 = ((ilk) obj2).b;
                return valueOf3.compareTo(Integer.valueOf(Math.abs((num2 != null ? num2.intValue() : Integer.MAX_VALUE) - i2)));
        }
    }

    public mye(q6i q6iVar, int i) {
        this.c = q6iVar;
        this.b = i;
    }
}
