package defpackage;

import com.sofascore.model.mvvm.model.TvChannel;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final /* synthetic */ class m39 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ m39(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.parseInt(((String) obj).split(":")[0]) - Integer.parseInt(((String) obj2).split(":")[0]);
            case 1:
                return ((rc9) obj).a.compareTo(((rc9) obj2).a);
            case 2:
                yi2 yi2Var = (yi2) obj;
                yi2 yi2Var2 = (yi2) obj2;
                if (yi2Var.k() && !yi2Var2.k()) {
                    return -1;
                }
                if (!yi2Var2.k() || yi2Var.k()) {
                    return Integer.compare(yi2Var.m().getValue(), yi2Var2.m().getValue());
                }
                return 1;
            case 3:
                IntRange intRange = (IntRange) obj;
                IntRange intRange2 = (IntRange) obj2;
                return (intRange.b - intRange.a) - (intRange2.b - intRange2.a);
            case 4:
                wma wmaVar = (wma) obj;
                wma wmaVar2 = (wma) obj2;
                float f = wmaVar.G.p.F;
                float f2 = wmaVar2.G.p.F;
                return f == f2 ? Intrinsics.d(wmaVar.w(), wmaVar2.w()) : Float.compare(f, f2);
            case 5:
                return Intrinsics.d(((xqa) obj).getIndex(), ((xqa) obj2).getIndex());
            case 6:
                hhh hhhVar = (hhh) obj;
                hhh hhhVar2 = (hhh) obj2;
                long j = hhhVar.f;
                long j2 = hhhVar2.f;
                return j - j2 == 0 ? hhhVar.compareTo(hhhVar2) : j < j2 ? -1 : 1;
            case 7:
                return ((ts0) ((sw3) obj)).a.compareTo(((ts0) ((sw3) obj2)).a);
            case 8:
                return ((dlh) obj).a - ((dlh) obj2).a;
            case 9:
                return ((elh) obj).a - ((elh) obj2).a;
            case 10:
                return Float.compare(((dlh) obj).c, ((dlh) obj2).c);
            case 11:
                return Float.compare(((elh) obj).c, ((elh) obj2).c);
            case 12:
                twh twhVar = (twh) obj;
                twh twhVar2 = (twh) obj2;
                int compare = Integer.compare(twhVar2.b, twhVar.b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = twhVar.c.compareTo(twhVar2.c);
                return compareTo != 0 ? compareTo : twhVar.d.compareTo(twhVar2.d);
            case 13:
                uwh uwhVar = (uwh) obj;
                uwh uwhVar2 = (uwh) obj2;
                int compare2 = Integer.compare(uwhVar2.b, uwhVar.b);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo2 = uwhVar.c.compareTo(uwhVar2.c);
                return compareTo2 != 0 ? compareTo2 : uwhVar.d.compareTo(uwhVar2.d);
            case 14:
                twh twhVar3 = (twh) obj;
                twh twhVar4 = (twh) obj2;
                int compare3 = Integer.compare(twhVar4.a, twhVar3.a);
                if (compare3 != 0) {
                    return compare3;
                }
                int compareTo3 = twhVar4.c.compareTo(twhVar3.c);
                return compareTo3 != 0 ? compareTo3 : twhVar4.d.compareTo(twhVar3.d);
            case 15:
                uwh uwhVar3 = (uwh) obj;
                uwh uwhVar4 = (uwh) obj2;
                int compare4 = Integer.compare(uwhVar4.a, uwhVar3.a);
                if (compare4 != 0) {
                    return compare4;
                }
                int compareTo4 = uwhVar4.c.compareTo(uwhVar3.c);
                return compareTo4 != 0 ? compareTo4 : uwhVar4.d.compareTo(uwhVar3.d);
            case 16:
                return new cp().b(((TvChannel) ((Pair) obj).a).getName(), ((TvChannel) ((Pair) obj2).a).getName());
            case 17:
                return Integer.compare(((x1l) obj).a.b, ((x1l) obj2).a.b);
            case 18:
                return Integer.compare(((y1l) obj).a.b, ((y1l) obj2).a.b);
            case 19:
                return Long.compare(((u1l) obj).b, ((u1l) obj2).b);
            default:
                return Long.compare(((v1l) obj).b, ((v1l) obj2).b);
        }
    }
}
