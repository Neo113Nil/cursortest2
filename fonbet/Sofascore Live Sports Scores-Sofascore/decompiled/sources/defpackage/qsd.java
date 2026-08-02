package defpackage;

import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.mvvm.model.UniqueTournament;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qsd extends a7e {
    public final uwg b;
    public final String c;
    public final HashSet d;

    public qsd(uwg uwgVar, String str) {
        uwgVar.getClass();
        str.getClass();
        this.b = uwgVar;
        this.c = str;
        this.d = new HashSet();
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.a7e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        psd psdVar;
        int i;
        int m;
        List list;
        List a;
        String str;
        int id;
        String str2;
        if (sq3Var instanceof psd) {
            psdVar = (psd) sq3Var;
            int i2 = psdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                psdVar.u = i2 - Integer.MIN_VALUE;
                Object obj = psdVar.s;
                Object obj2 = lu3.a;
                i = psdVar.u;
                String str3 = this.c;
                if (i != 0) {
                    y6a.M(obj);
                    if (str3.length() < 2) {
                        return new z6e(a.c(ksd.b), null);
                    }
                    m = yid.m((Integer) y6eVar.a());
                    psdVar.r = m;
                    psdVar.u = 1;
                    obj = this.b.e(m, str3, psdVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m = psdVar.r;
                    y6a.M(obj);
                }
                list = (List) obj;
                Integer num = !list.isEmpty() ? null : new Integer(m + 1);
                xbb b = a.b();
                for (Object obj3 : list) {
                    if (obj3 instanceof Team) {
                        id = ((Team) obj3).getId();
                        str2 = "Team_";
                    } else if (obj3 instanceof Player) {
                        id = ((Player) obj3).getId();
                        str2 = "Player_";
                    } else if (obj3 instanceof UniqueTournament) {
                        id = ((UniqueTournament) obj3).getId();
                        str2 = "League_";
                    } else {
                        str = null;
                        if (str == null) {
                            HashSet hashSet = this.d;
                            if (hashSet.contains(str)) {
                                s38.a().c(new Throwable(fc6.n("Duplicate item in paging. Item: ", str, ", query: ", str3)));
                            } else {
                                b.add(obj3);
                            }
                            hashSet.add(str);
                        }
                    }
                    str = ljg.j(id, str2);
                    if (str == null) {
                    }
                }
                a = a.a(b);
                if (list.isEmpty() && m == 0) {
                    a = a.c(ksd.a);
                }
                return new z6e(a, num);
            }
        }
        psdVar = new psd(this, sq3Var);
        Object obj4 = psdVar.s;
        Object obj22 = lu3.a;
        i = psdVar.u;
        String str32 = this.c;
        if (i != 0) {
        }
        list = (List) obj4;
        if (!list.isEmpty()) {
        }
        xbb b2 = a.b();
        while (r2.hasNext()) {
        }
        a = a.a(b2);
        if (list.isEmpty()) {
            a = a.c(ksd.a);
        }
        return new z6e(a, num);
    }
}
