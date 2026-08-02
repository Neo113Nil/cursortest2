package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class c4h {
    public static final Comparator[] a;
    public static final ned b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new cp(new y2f(i == 0 ? qe8.i : qe8.c), 27);
            i++;
        }
        a = comparatorArr;
        b = ned.H;
    }

    public static final void a(s3h s3hVar, ArrayList arrayList, oo ooVar, oo ooVar2, uzc uzcVar) {
        l3h l3hVar = s3hVar.d;
        Object g = l3hVar.a.g(w3h.n);
        if (g == null) {
            g = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) g).booleanValue();
        if ((booleanValue || ((Boolean) ooVar2.invoke(s3hVar)).booleanValue()) && ((Boolean) ooVar.invoke(s3hVar)).booleanValue()) {
            arrayList.add(s3hVar);
        }
        if (booleanValue) {
            uzcVar.i(s3hVar.f, b(s3hVar, ooVar, ooVar2, s3h.j(7, s3hVar)));
            return;
        }
        List j = s3h.j(7, s3hVar);
        int size = j.size();
        for (int i = 0; i < size; i++) {
            a((s3h) j.get(i), arrayList, ooVar, ooVar2, uzcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList b(s3h s3hVar, oo ooVar, oo ooVar2, List list) {
        int i;
        uzc uzcVar = q6a.a;
        uzc uzcVar2 = new uzc();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            a((s3h) list.get(i2), arrayList, ooVar, ooVar2, uzcVar2);
        }
        int i3 = 1;
        char c = s3hVar.c.z == ema.b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                s3h s3hVar2 = (s3h) arrayList.get(i4);
                if (i4 != 0) {
                    float f = s3hVar2.h().b;
                    float f2 = s3hVar2.h().d;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            oqf oqfVar = (oqf) ((Pair) arrayList2.get(i6)).a;
                            float f3 = oqfVar.b;
                            i = i3;
                            float f4 = oqfVar.d;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new Pair(new oqf(Math.max(oqfVar.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), Math.max(oqfVar.b, f), Math.min(oqfVar.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((Pair) arrayList2.get(i6)).b));
                                ((List) ((Pair) arrayList2.get(i6)).b).add(s3hVar2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new Pair(s3hVar2.h(), b.l(s3hVar2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new Pair(s3hVar2.h(), b.l(s3hVar2)));
                if (i4 != size2) {
                }
            }
        }
        n13.u(qe8.j, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            Pair pair = (Pair) arrayList2.get(i8);
            n13.u(comparator, (List) pair.b);
            arrayList3.addAll((Collection) pair.b);
        }
        n13.u(new rs2(b, 9), arrayList3);
        int i9 = 0;
        while (i9 <= arrayList3.size() - 1) {
            List list2 = (List) uzcVar2.b(((s3h) arrayList3.get(i9)).f);
            if (list2 != null) {
                if (((Boolean) ooVar2.invoke(arrayList3.get(i9))).booleanValue()) {
                    i9++;
                } else {
                    arrayList3.remove(i9);
                }
                arrayList3.addAll(i9, list2);
                i9 += list2.size();
            } else {
                i9++;
            }
        }
        return arrayList3;
    }
}
