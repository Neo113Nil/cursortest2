package defpackage;

import android.content.Context;
import com.sofascore.model.FirebaseBundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class b93 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b93(m93 m93Var, koh kohVar, boolean z, Function1 function1) {
        this.a = 0;
        this.d = m93Var;
        this.e = kohVar;
        this.c = z;
        this.b = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168 A[SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        jv jvVar;
        Pair pair;
        iwk iwkVar;
        x6a x6aVar;
        int i;
        int i2;
        int i3 = this.a;
        int i4 = 2;
        rq3 rq3Var = null;
        Object obj = this.b;
        Object obj2 = this.e;
        boolean z = this.c;
        Object obj3 = this.d;
        switch (i3) {
            case 0:
                m93 m93Var = (m93) obj3;
                koh kohVar = (koh) obj2;
                Function1 function1 = (Function1) obj;
                if (m93Var.d) {
                    y83 y83Var = (y83) CollectionsKt.firstOrNull(m93Var.c);
                    if (y83Var != null) {
                        function1.invoke(y83Var.c);
                    }
                } else {
                    kohVar.put(m93Var.a, Boolean.valueOf(!z));
                }
                return Unit.a;
            case 1:
                ((e1d) obj3).setValue(new fj6((String) obj2));
                ((Function1) obj).invoke(Boolean.valueOf(!z));
                return Unit.a;
            case 2:
                Function0 function0 = (Function0) obj3;
                ku3 ku3Var = (ku3) obj2;
                pr4 pr4Var = (pr4) obj;
                if (z) {
                    function0.invoke();
                } else {
                    xw3.L(ku3Var, null, null, new e61(pr4Var, rq3Var, i4), 3);
                }
                return Unit.a;
            case 3:
                Function1 function12 = (Function1) obj;
                e1d e1dVar = (e1d) obj2;
                if (!z) {
                    function12.invoke(obj3);
                }
                e1dVar.setValue(Boolean.FALSE);
                return Unit.a;
            case 4:
                tt2 tt2Var = (tt2) obj3;
                ut2 ut2Var = (ut2) obj2;
                Function0 function02 = (Function0) obj;
                if (!z) {
                    tt2Var.c.invoke(ut2Var.a);
                }
                function02.invoke();
                return Unit.a;
            case 5:
                oxh oxhVar = (oxh) obj3;
                Function1 function13 = (Function1) obj;
                e1d e1dVar2 = (e1d) obj2;
                if (oxhVar.g) {
                    if (!z) {
                        function13.invoke(oxhVar.a);
                    }
                    e1dVar2.setValue(Boolean.FALSE);
                }
                return Unit.a;
            case 6:
                lki lkiVar = (lki) obj3;
                Context context = (Context) obj2;
                e1d e1dVar3 = (e1d) obj;
                int ordinal = lkiVar.a.ordinal();
                if (ordinal == 0) {
                    int ordinal2 = ((jki) e1dVar3.getValue()).ordinal();
                    jvVar = ordinal2 != 1 ? ordinal2 != 2 ? jv.MONTHLY_ADS : jv.YEARLY_ADS : jv.MONTHLY_ADS;
                } else {
                    if (ordinal != 1) {
                        zzl.b();
                        return null;
                    }
                    if (((jki) e1dVar3.getValue()) == jki.c) {
                        jvVar = jv.FEATURED_OFFER;
                    } else {
                        cu cuVar = lkiVar.c.i;
                        int i5 = cuVar == null ? -1 : oki.a[cuVar.ordinal()];
                        jvVar = (i5 == 1 || i5 == 2) ? jv.AI_FREE_TRIAL : i5 != 3 ? i5 != 4 ? jv.AI_INSIGHTS : jv.WORLD_CUP_OFFER : jv.AI_PROMO_3_MONTHS;
                    }
                }
                jv jvVar2 = (lkiVar.a == eli.ADS && z) ? jv.ADS_FREE_TRIAL : jvVar;
                context.getClass();
                FirebaseBundle firebaseBundle = new FirebaseBundle();
                firebaseBundle.putString("type", jvVar2.a);
                nv.N(context, firebaseBundle, "start_subscription");
                lkiVar.g.invoke(jvVar);
                return Unit.a;
            default:
                qug qugVar = (qug) obj3;
                koh kohVar2 = (koh) obj2;
                gv9 gv9Var = (gv9) obj;
                int h = qugVar.a.h();
                int h2 = qugVar.b.h();
                int h3 = qugVar.e.h();
                if (h2 <= 0) {
                    return km5.a;
                }
                if (z) {
                    int i6 = h3 - h;
                    pair = new Pair(Integer.valueOf(i6), Integer.valueOf(i6 + h2));
                } else {
                    pair = new Pair(Integer.valueOf(h), Integer.valueOf(h + h2));
                }
                int intValue = ((Number) pair.a).intValue();
                int intValue2 = ((Number) pair.b).intValue();
                tnh tnhVar = kohVar2.b;
                ArrayList arrayList = new ArrayList();
                Object it = tnhVar.iterator();
                while (((n4) it).hasNext()) {
                    Object next = ((pdi) it).next();
                    Map.Entry entry = (Map.Entry) next;
                    if (((x6a) entry.getValue()).c > intValue && ((x6a) entry.getValue()).a < intValue2) {
                        arrayList.add(next);
                    }
                }
                List H0 = CollectionsKt.H0(arrayList, new q6i(16));
                Map.Entry entry2 = (Map.Entry) CollectionsKt.firstOrNull(H0);
                Map.Entry entry3 = (Map.Entry) CollectionsKt.j0(H0);
                ArrayList arrayList2 = new ArrayList();
                int i7 = 0;
                for (Object obj4 : gv9Var) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        b.q();
                        throw null;
                    }
                    Pair pair2 = (Pair) obj4;
                    Pair pair3 = (Pair) CollectionsKt.a0(i8, gv9Var);
                    int intValue3 = pair3 != null ? ((Number) pair3.a).intValue() : Integer.MAX_VALUE;
                    int intValue4 = ((Number) pair2.a).intValue();
                    if ((entry2 != null ? ((Number) entry2.getKey()).intValue() : Integer.MAX_VALUE) < intValue3) {
                        if ((entry3 != null ? ((Number) entry3.getKey()).intValue() : -1) >= intValue4 && (x6aVar = (x6a) kohVar2.get(Integer.valueOf(intValue4))) != null) {
                            if (z) {
                                if (entry2 == null || ((Number) entry2.getKey()).intValue() != intValue3 - 1) {
                                    i2 = intValue2 - x6aVar.c;
                                    if (i2 < 0) {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = intValue2 - ((x6a) entry2.getValue()).c;
                                }
                                i = -i2;
                            } else if (entry2 == null || ((Number) entry2.getKey()).intValue() != intValue3 - 1) {
                                i = x6aVar.a - intValue;
                                if (i < 0) {
                                    i = 0;
                                }
                            } else {
                                i = ((x6a) entry2.getValue()).a - intValue;
                            }
                            iwkVar = new iwk(i7, (r9k) pair2.b, i);
                            if (iwkVar == null) {
                                arrayList2.add(iwkVar);
                            }
                            i7 = i8;
                        }
                    }
                    iwkVar = null;
                    if (iwkVar == null) {
                    }
                    i7 = i8;
                }
                return arrayList2;
        }
    }

    public /* synthetic */ b93(e1d e1dVar, String str, Function1 function1, boolean z) {
        this.a = 1;
        this.d = e1dVar;
        this.e = str;
        this.b = function1;
        this.c = z;
    }

    public /* synthetic */ b93(oxh oxhVar, boolean z, Function1 function1, e1d e1dVar) {
        this.a = 5;
        this.d = oxhVar;
        this.c = z;
        this.b = function1;
        this.e = e1dVar;
    }

    public /* synthetic */ b93(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.a = i;
        this.d = obj;
        this.c = z;
        this.e = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b93(boolean z, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = z;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
    }

    public /* synthetic */ b93(boolean z, Function1 function1, Object obj, e1d e1dVar) {
        this.a = 3;
        this.c = z;
        this.b = function1;
        this.d = obj;
        this.e = e1dVar;
    }
}
