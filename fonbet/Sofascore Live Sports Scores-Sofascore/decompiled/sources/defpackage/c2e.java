package defpackage;

import com.sofascore.model.network.response.playerOfTheSeason.POTSMostAwardsNetworkPlayer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c2e extends a7e {
    public final lue b;
    public final HashSet c;

    public c2e(lue lueVar) {
        lueVar.getClass();
        this.b = lueVar;
        this.c = new HashSet();
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        Integer num = c7eVar.b;
        if (num != null) {
            c7eVar.a(num.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        b2e b2eVar;
        int i;
        int m;
        List list;
        if (sq3Var instanceof b2e) {
            b2eVar = (b2e) sq3Var;
            int i2 = b2eVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b2eVar.u = i2 - Integer.MIN_VALUE;
                Object obj = b2eVar.s;
                lu3 lu3Var = lu3.a;
                i = b2eVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    m = yid.m((Integer) y6eVar.a());
                    b2eVar.r = m;
                    b2eVar.u = 1;
                    obj = this.b.d(m, b2eVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m = b2eVar.r;
                    y6a.M(obj);
                }
                list = (List) obj;
                if (list == null) {
                    list = km5.a;
                }
                Integer num = list.isEmpty() ? null : new Integer(m + 1);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    POTSMostAwardsNetworkPlayer pOTSMostAwardsNetworkPlayer = (POTSMostAwardsNetworkPlayer) obj2;
                    if (this.c.add(new Integer(pOTSMostAwardsNetworkPlayer.getPlayer().getId()))) {
                        arrayList.add(obj2);
                    } else {
                        s38.a().c(new Throwable(ljg.j(pOTSMostAwardsNetworkPlayer.getPlayer().getId(), "Duplicate item in paging. Item: ")));
                    }
                }
                return new z6e(arrayList, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
            }
        }
        b2eVar = new b2e(this, sq3Var);
        Object obj3 = b2eVar.s;
        lu3 lu3Var2 = lu3.a;
        i = b2eVar.u;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list == null) {
        }
        if (list.isEmpty()) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r8.hasNext()) {
        }
        return new z6e(arrayList2, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }
}
