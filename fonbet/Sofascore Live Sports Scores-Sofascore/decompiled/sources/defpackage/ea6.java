package defpackage;

import com.sofascore.model.mvvm.model.ServerType;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.WidgetItemRef;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ea6 extends hoi implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public List r;
    public av4 s;
    public Map t;
    public long u;
    public long v;
    public int w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ qa6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea6(qa6 qa6Var, List list, int i, int i2, rq3 rq3Var) {
        super(2, rq3Var);
        this.z = qa6Var;
        this.A = list;
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        ea6 ea6Var = new ea6(this.z, this.A, this.B, this.C, rq3Var);
        ea6Var.y = obj;
        return ea6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ea6) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object U;
        long j;
        long j2;
        List<WidgetItemRef> L0;
        int i;
        Object w;
        lu3 lu3Var;
        av4 av4Var;
        int i2;
        long j3;
        Map map;
        Object T;
        ku3 ku3Var = (ku3) this.y;
        lu3 lu3Var2 = lu3.a;
        int i3 = this.x;
        int i4 = this.B;
        qa6 qa6Var = this.z;
        if (i3 == 0) {
            y6a.M(obj);
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            final long timeInMillis = calendar.getTimeInMillis() / 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.set(11, 0);
            calendar2.set(12, 0);
            calendar2.set(13, 0);
            calendar2.set(14, 0);
            calendar2.add(5, 8);
            final long timeInMillis2 = calendar2.getTimeInMillis() / 1000;
            final v76 v76Var = qa6Var.a;
            final List<String> ongoing_status_types = StatusKt.getONGOING_STATUS_TYPES();
            final int i5 = i4 + 1;
            this.y = ku3Var;
            this.u = timeInMillis;
            this.v = timeInMillis2;
            this.x = 1;
            v76Var.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT id, isStage FROM (SELECT id, 0 AS isStage, startTimestamp AS sortTimestamp, tournamentId AS sortParentId FROM events_table WHERE hide = 0 AND startTimestamp < ? AND (startTimestamp >= ? OR endTimestamp > ? OR status_type IN (");
            final int size = ongoing_status_types.size();
            pea.m(size, sb);
            sb.append(")) UNION ALL SELECT id, 1 AS isStage, startDateTimestamp AS sortTimestamp, COALESCE(parent_event_id, id) AS sortParentId FROM my_stage_table WHERE isHidden = 0 AND type IN (");
            final List list = this.A;
            final int size2 = list.size();
            pea.m(size2, sb);
            sb.append(") AND startDateTimestamp >= ");
            sb.append("?");
            sb.append(" AND startDateTimestamp < ");
            bf3.v(sb, "?", ") ORDER BY sortTimestamp ASC, sortParentId ASC, id ASC LIMIT ", "?", " OFFSET ");
            sb.append("?");
            final String sb2 = sb.toString();
            k6g k6gVar = v76Var.a;
            final int i6 = this.C;
            U = gz8.U(this, k6gVar, true, false, new Function1() { // from class: h76
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j4 = timeInMillis2;
                    long j5 = timeInMillis;
                    List list2 = ongoing_status_types;
                    int i7 = size;
                    List<ServerType> list3 = list;
                    v76 v76Var2 = v76Var;
                    int i8 = size2;
                    int i9 = i5;
                    int i10 = i6;
                    glg glgVar = (glg) obj2;
                    glgVar.getClass();
                    nlg V0 = glgVar.V0(sb2);
                    try {
                        V0.q(1, j4);
                        V0.q(2, j5);
                        V0.q(3, j5);
                        Iterator it = list2.iterator();
                        int i11 = 4;
                        while (it.hasNext()) {
                            V0.L(i11, (String) it.next());
                            i11++;
                        }
                        int i12 = i7 + 4;
                        int i13 = i12;
                        for (ServerType serverType : list3) {
                            v76Var2.getClass();
                            V0.L(i13, v76.a(serverType));
                            i13++;
                        }
                        V0.q(i12 + i8, j5);
                        V0.q(i7 + 5 + i8, j4);
                        V0.q(i7 + 6 + i8, i9);
                        V0.q(i7 + 7 + i8, i10);
                        ArrayList arrayList = new ArrayList();
                        while (V0.U0()) {
                            boolean z = false;
                            int i14 = (int) V0.getLong(0);
                            if (((int) V0.getLong(1)) != 0) {
                                z = true;
                            }
                            arrayList.add(new WidgetItemRef(i14, z));
                        }
                        V0.close();
                        return arrayList;
                    } catch (Throwable th) {
                        V0.close();
                        throw th;
                    }
                }
            });
            if (U == lu3Var2) {
                return lu3Var2;
            }
            j = timeInMillis2;
            j2 = timeInMillis;
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = this.w;
                    Map map2 = this.t;
                    List list2 = this.r;
                    y6a.M(obj);
                    L0 = list2;
                    map = map2;
                    i = 1;
                    T = obj;
                    Map map3 = (Map) T;
                    ArrayList arrayList = new ArrayList();
                    for (WidgetItemRef widgetItemRef : L0) {
                        boolean isStage = widgetItemRef.isStage();
                        int id = widgetItemRef.getId();
                        Object f = isStage ? me4.f(id, map3) : me4.f(id, map);
                        if (f != null) {
                            arrayList.add(f);
                        }
                    }
                    return new z7l(arrayList, i2 != 0 ? i : 0);
                }
                i2 = this.w;
                long j4 = this.v;
                j3 = this.u;
                av4 av4Var2 = this.s;
                List list3 = this.r;
                y6a.M(obj);
                lu3Var = lu3Var2;
                i = 1;
                av4Var = av4Var2;
                w = obj;
                L0 = list3;
                j = j4;
                map = (Map) w;
                this.y = null;
                this.r = L0;
                this.s = null;
                this.t = map;
                this.u = j3;
                this.v = j;
                this.w = i2;
                this.x = 3;
                T = av4Var.T(this);
                if (T == lu3Var) {
                    return lu3Var;
                }
                Map map32 = (Map) T;
                ArrayList arrayList2 = new ArrayList();
                while (r3.hasNext()) {
                }
                return new z7l(arrayList2, i2 != 0 ? i : 0);
            }
            j = this.v;
            j2 = this.u;
            y6a.M(obj);
            U = obj;
        }
        List list4 = (List) U;
        int i7 = list4.size() > i4 ? 1 : 0;
        L0 = CollectionsKt.L0(list4, i4);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : L0) {
            if (((WidgetItemRef) obj2).isStage()) {
                arrayList3.add(obj2);
            } else {
                arrayList4.add(obj2);
            }
        }
        hs4 hs4Var = z45.a;
        hq4 hq4Var = hq4.c;
        rq3 rq3Var = null;
        av4 t = xw3.t(ku3Var, hq4Var, new da6(arrayList4, qa6Var, rq3Var, 0), 2);
        i = 1;
        av4 t2 = xw3.t(ku3Var, hq4Var, new da6(arrayList3, qa6Var, rq3Var, i), 2);
        this.y = null;
        this.r = L0;
        this.s = t2;
        this.u = j2;
        this.v = j;
        this.w = i7;
        this.x = 2;
        w = t.w(this);
        lu3 lu3Var3 = lu3.a;
        lu3Var = lu3Var2;
        if (w == lu3Var) {
            return lu3Var;
        }
        av4Var = t2;
        i2 = i7;
        j3 = j2;
        map = (Map) w;
        this.y = null;
        this.r = L0;
        this.s = null;
        this.t = map;
        this.u = j3;
        this.v = j;
        this.w = i2;
        this.x = 3;
        T = av4Var.T(this);
        if (T == lu3Var) {
        }
        Map map322 = (Map) T;
        ArrayList arrayList22 = new ArrayList();
        while (r3.hasNext()) {
        }
        return new z7l(arrayList22, i2 != 0 ? i : 0);
    }
}
