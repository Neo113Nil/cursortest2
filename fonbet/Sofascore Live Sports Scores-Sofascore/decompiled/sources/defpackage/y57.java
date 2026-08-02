package defpackage;

import com.sofascore.model.fantasy.FantasyLeagueParticipant;
import com.sofascore.model.newNetwork.PredictedEvent;
import com.sofascore.model.newNetwork.UserPredictionsResponse;
import com.sofascore.model.newNetwork.UserPredictionsResponseKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class y57 extends a7e {
    public final /* synthetic */ int b = 0;
    public final String c;
    public final int d;
    public final Object e;
    public final Object f;
    public final Serializable g;

    public y57(a3l a3lVar, fyk fykVar, String str, int i, t6e t6eVar) {
        a3lVar.getClass();
        fykVar.getClass();
        str.getClass();
        t6eVar.getClass();
        this.e = a3lVar;
        this.f = fykVar;
        this.c = str;
        this.d = i;
        this.g = t6eVar;
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        switch (this.b) {
            case 0:
                c7eVar.getClass();
                break;
            default:
                c7eVar.getClass();
                break;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00da A[LOOP:0: B:17:0x00d4->B:19:0x00da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0184 A[LOOP:2: B:68:0x017e->B:70:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        x57 x57Var;
        int i;
        int intValue;
        int i2;
        Integer num;
        Iterator it;
        Iterator it2;
        y4l y4lVar;
        Object obj;
        int i3;
        int i4;
        lu3 lu3Var;
        y4l y4lVar2;
        Object obj2;
        int i5;
        UserPredictionsResponse userPredictionsResponse;
        List<PredictedEvent> list;
        int i6;
        List<PredictedEvent> list2;
        Iterator<T> it3;
        int i7 = this.b;
        Object obj3 = this.f;
        Serializable serializable = this.g;
        int i8 = this.d;
        Object obj4 = this.e;
        switch (i7) {
            case 0:
                HashSet hashSet = (HashSet) serializable;
                if (sq3Var instanceof x57) {
                    x57Var = (x57) sq3Var;
                    int i9 = x57Var.u;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        x57Var.u = i9 - Integer.MIN_VALUE;
                        Object obj5 = x57Var.s;
                        lu3 lu3Var2 = lu3.a;
                        i = x57Var.u;
                        if (i != 0) {
                            y6a.M(obj5);
                            Integer num2 = (Integer) y6eVar.a();
                            intValue = num2 != null ? num2.intValue() : 0;
                            x57Var.r = intValue;
                            x57Var.u = 1;
                            obj5 = ((wi7) obj4).z(i8, intValue, x57Var, this.c);
                            if (obj5 == lu3Var2) {
                                return lu3Var2;
                            }
                            i2 = intValue;
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = x57Var.r;
                            y6a.M(obj5);
                        }
                        List list3 = (List) obj5;
                        num = list3.isEmpty() ? null : new Integer(i2 + 1);
                        ArrayList arrayList = new ArrayList();
                        for (Object obj6 : list3) {
                            if (!hashSet.contains(((FantasyLeagueParticipant) obj6).getUserId())) {
                                arrayList.add(obj6);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((FantasyLeagueParticipant) it.next()).getUserId());
                        }
                        hashSet.addAll(arrayList2);
                        ArrayList arrayList3 = new ArrayList();
                        it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (!((List) obj3).contains(((FantasyLeagueParticipant) next).getUserId())) {
                                arrayList3.add(next);
                            }
                        }
                        return new z6e(arrayList3, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                }
                x57Var = new x57(this, sq3Var);
                Object obj52 = x57Var.s;
                lu3 lu3Var22 = lu3.a;
                i = x57Var.u;
                if (i != 0) {
                }
                List list32 = (List) obj52;
                if (list32.isEmpty()) {
                }
                ArrayList arrayList4 = new ArrayList();
                while (r1.hasNext()) {
                }
                ArrayList arrayList22 = new ArrayList(k13.r(arrayList4, 10));
                it = arrayList4.iterator();
                while (it.hasNext()) {
                }
                hashSet.addAll(arrayList22);
                ArrayList arrayList32 = new ArrayList();
                it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                }
                return new z6e(arrayList32, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
            default:
                if (sq3Var instanceof y4l) {
                    y4lVar = (y4l) sq3Var;
                    int i10 = y4lVar.v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        y4lVar.v = i10 - Integer.MIN_VALUE;
                        obj = y4lVar.t;
                        lu3 lu3Var3 = lu3.a;
                        i3 = y4lVar.v;
                        if (i3 != 0) {
                            y6a.M(obj);
                            Integer num3 = (Integer) y6eVar.a();
                            intValue = num3 != null ? num3.intValue() : 0;
                            String valueOf = String.valueOf(i8);
                            String t6eVar = ((t6e) serializable).toString();
                            y4lVar.s = intValue;
                            y4lVar.v = 1;
                            i4 = 2;
                            y4l y4lVar3 = y4lVar;
                            int i11 = intValue;
                            lu3Var = lu3Var3;
                            Object b = ((a3l) obj4).b(valueOf, this.c, t6eVar, i11, y4lVar3);
                            y4lVar2 = y4lVar3;
                            if (b != lu3Var) {
                                obj2 = b;
                                i5 = i11;
                            }
                            return lu3Var;
                        }
                        if (i3 != 1) {
                            if (i3 != 2) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i6 = y4lVar.s;
                            list2 = y4lVar.r;
                            y6a.M(obj);
                            List<PredictedEvent> mapMyPredictions = UserPredictionsResponseKt.mapMyPredictions(list2, (Map) obj, xe6.c().b().longValue());
                            num = mapMyPredictions.isEmpty() ? null : new Integer(i6 + 1);
                            ArrayList arrayList5 = new ArrayList(k13.r(mapMyPredictions, 10));
                            it3 = mapMyPredictions.iterator();
                            while (it3.hasNext()) {
                                arrayList5.add(new xaf((PredictedEvent) it3.next()));
                            }
                            return new z6e(arrayList5, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        }
                        int i12 = y4lVar.s;
                        y6a.M(obj);
                        obj2 = obj;
                        y4lVar2 = y4lVar;
                        i4 = 2;
                        i5 = i12;
                        lu3Var = lu3Var3;
                        userPredictionsResponse = (UserPredictionsResponse) obj2;
                        if (userPredictionsResponse != null || (list = userPredictionsResponse.getPredictions()) == null) {
                            list = km5.a;
                        }
                        y4lVar2.r = list;
                        y4lVar2.s = i5;
                        y4lVar2.v = i4;
                        obj = ((fyk) obj3).c(y4lVar2);
                        if (obj != lu3Var) {
                            i6 = i5;
                            list2 = list;
                            List<PredictedEvent> mapMyPredictions2 = UserPredictionsResponseKt.mapMyPredictions(list2, (Map) obj, xe6.c().b().longValue());
                            if (mapMyPredictions2.isEmpty()) {
                            }
                            ArrayList arrayList52 = new ArrayList(k13.r(mapMyPredictions2, 10));
                            it3 = mapMyPredictions2.iterator();
                            while (it3.hasNext()) {
                            }
                            return new z6e(arrayList52, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        }
                        return lu3Var;
                    }
                }
                y4lVar = new y4l(this, sq3Var);
                obj = y4lVar.t;
                lu3 lu3Var32 = lu3.a;
                i3 = y4lVar.v;
                if (i3 != 0) {
                }
                userPredictionsResponse = (UserPredictionsResponse) obj2;
                if (userPredictionsResponse != null) {
                }
                list = km5.a;
                y4lVar2.r = list;
                y4lVar2.s = i5;
                y4lVar2.v = i4;
                obj = ((fyk) obj3).c(y4lVar2);
                if (obj != lu3Var) {
                }
                return lu3Var;
        }
    }

    public y57(int i, wi7 wi7Var, List list, String str) {
        wi7Var.getClass();
        list.getClass();
        this.d = i;
        this.e = wi7Var;
        this.f = list;
        this.c = str;
        this.g = new HashSet();
    }
}
