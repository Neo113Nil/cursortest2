package defpackage;

import com.sofascore.model.mvvm.model.UniqueStageId;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class tak {
    public final mak a;
    public final v76 b;

    public tak(mak makVar, v76 v76Var) {
        this.a = makVar;
        this.b = v76Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        oak oakVar;
        int i2;
        if (sq3Var instanceof oak) {
            oakVar = (oak) sq3Var;
            int i3 = oakVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                oakVar.t = i3 - Integer.MIN_VALUE;
                Object obj = oakVar.r;
                lu3 lu3Var = lu3.a;
                i2 = oakVar.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    UniqueStageId uniqueStageId = new UniqueStageId(i);
                    oakVar.t = 1;
                    mak makVar = this.a;
                    obj = gz8.U(oakVar, makVar.a, false, true, new mwj(14, makVar, uniqueStageId));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(((Number) obj).longValue() > 0);
            }
        }
        oakVar = new oak(this, sq3Var);
        Object obj2 = oakVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = oakVar.t;
        if (i2 != 0) {
        }
        return Boolean.valueOf(((Number) obj2).longValue() > 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(List list, sq3 sq3Var) {
        pak pakVar;
        int i;
        if (sq3Var instanceof pak) {
            pakVar = (pak) sq3Var;
            int i2 = pakVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pakVar.t = i2 - Integer.MIN_VALUE;
                Object obj = pakVar.r;
                lu3 lu3Var = lu3.a;
                i = pakVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    ArrayList arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new UniqueStageId(((Number) it.next()).intValue()));
                    }
                    pakVar.t = 1;
                    mak makVar = this.a;
                    obj = gz8.U(pakVar, makVar.a, false, true, new mwj(15, makVar, arrayList));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return Boolean.valueOf(!((Collection) obj).isEmpty());
            }
        }
        pakVar = new pak(this, sq3Var);
        Object obj2 = pakVar.r;
        lu3 lu3Var2 = lu3.a;
        i = pakVar.t;
        if (i != 0) {
        }
        return Boolean.valueOf(!((Collection) obj2).isEmpty());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable c(sq3 sq3Var) {
        qak qakVar;
        int i;
        if (sq3Var instanceof qak) {
            qakVar = (qak) sq3Var;
            int i2 = qakVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qakVar.t = i2 - Integer.MIN_VALUE;
                Object obj = qakVar.r;
                lu3 lu3Var = lu3.a;
                i = qakVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    qakVar.t = 1;
                    obj = gz8.U(qakVar, this.a.a, true, false, new crj(29));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return CollectionsKt.Q0((Iterable) obj);
            }
        }
        qakVar = new qak(this, sq3Var);
        Object obj2 = qakVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qakVar.t;
        if (i != 0) {
        }
        return CollectionsKt.Q0((Iterable) obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (defpackage.gz8.U(r0, r7.b.a, false, true, new defpackage.q13(r8, r3)) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        if (defpackage.gz8.U(r0, r7.a.a, false, true, new defpackage.kwi(r8, r3)) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, sq3 sq3Var) {
        rak rakVar;
        int i2;
        if (sq3Var instanceof rak) {
            rakVar = (rak) sq3Var;
            int i3 = rakVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rakVar.u = i3 - Integer.MIN_VALUE;
                Object obj = rakVar.s;
                lu3 lu3Var = lu3.a;
                i2 = rakVar.u;
                int i4 = 9;
                if (i2 != 0) {
                    y6a.M(obj);
                    rakVar.r = i;
                    rakVar.u = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = rakVar.r;
                    y6a.M(obj);
                }
                rakVar.r = i;
                rakVar.u = 2;
            }
        }
        rakVar = new rak(this, sq3Var);
        Object obj2 = rakVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = rakVar.u;
        int i42 = 9;
        if (i2 != 0) {
        }
        rakVar.r = i;
        rakVar.u = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008b, code lost:
    
        if (defpackage.gz8.U(r0, r10.a, false, true, new defpackage.g76(r12.toString(), r11, r6)) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008d, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (defpackage.gz8.U(r0, r10.a.a, false, true, new defpackage.g76(r12.toString(), r11, 4)) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, sq3 sq3Var) {
        sak sakVar;
        int i;
        if (sq3Var instanceof sak) {
            sakVar = (sak) sq3Var;
            int i2 = sakVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sakVar.u = i2 - Integer.MIN_VALUE;
                Object obj = sakVar.s;
                lu3 lu3Var = lu3.a;
                i = sakVar.u;
                int i3 = 2;
                if (i != 0) {
                    y6a.M(obj);
                    sakVar.r = list;
                    sakVar.u = 1;
                    StringBuilder q = fc6.q("DELETE FROM my_unique_stage WHERE id IN (");
                    pea.m(list.size(), q);
                    q.append(")");
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = sakVar.r;
                    y6a.M(obj);
                }
                sakVar.r = null;
                sakVar.u = 2;
                v76 v76Var = this.b;
                StringBuilder q2 = fc6.q("DELETE FROM my_stage_table WHERE stage_season_unique_stage_id in (");
                pea.m(list.size(), q2);
                q2.append(")");
            }
        }
        sakVar = new sak(this, sq3Var);
        Object obj2 = sakVar.s;
        lu3 lu3Var2 = lu3.a;
        i = sakVar.u;
        int i32 = 2;
        if (i != 0) {
        }
        sakVar.r = null;
        sakVar.u = 2;
        v76 v76Var2 = this.b;
        StringBuilder q22 = fc6.q("DELETE FROM my_stage_table WHERE stage_season_unique_stage_id in (");
        pea.m(list.size(), q22);
        q22.append(")");
    }
}
