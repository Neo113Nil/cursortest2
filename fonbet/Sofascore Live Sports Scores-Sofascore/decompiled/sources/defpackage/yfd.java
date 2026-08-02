package defpackage;

import android.app.Application;
import android.content.Context;
import com.sofascore.model.notifications.NotificationSetting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lyfd;", "Lynb;", "Lvfd;", "Lnfd;", "Lrfd;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class yfd extends ynb {
    public final yhd l;
    public final String m;
    public List n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yfd(Application application, fqg fqgVar, yhd yhdVar) {
        super(application, tnb.a);
        fqgVar.getClass();
        yhdVar.getClass();
        this.l = yhdVar;
        String str = (String) fqgVar.a("GROUP_EXTRA");
        this.m = str;
        this.n = km5.a;
        if (str != null) {
            xw3.L(un0.z(this), null, null, new gjb(this, null, 18), 3);
        }
    }

    public static boolean u(List list, gv9 gv9Var) {
        Iterable h = b.h(list);
        if ((h instanceof Collection) && ((Collection) h).isEmpty()) {
            return false;
        }
        v6a it = h.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            if (((NotificationSetting) list.get(nextInt)).getEnabled() != ((ghd) gv9Var.get(nextInt)).e) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r0.add(defpackage.ghd.a(r1, false, kotlin.jvm.internal.Intrinsics.c((java.lang.Boolean) r8.get(r3.getChannelId()), java.lang.Boolean.TRUE), 31));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final gv9 t(List list, LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ghd ghdVar = (ghd) it.next();
            for (NotificationSetting notificationSetting : this.n) {
                if (Intrinsics.c(notificationSetting.getName(), ghdVar.a)) {
                    break;
                }
            }
            ogj.m("Collection contains no element matching the predicate.");
            return null;
        }
        return l6g.W(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        r4.add(com.sofascore.model.notifications.NotificationSetting.copy$default(r8, null, null, r9.e, null, null, 27, null));
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(gv9 gv9Var, sq3 sq3Var) {
        xfd xfdVar;
        Object obj;
        int i;
        ArrayList arrayList;
        if (sq3Var instanceof xfd) {
            xfdVar = (xfd) sq3Var;
            int i2 = xfdVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xfdVar.u = i2 - Integer.MIN_VALUE;
                obj = xfdVar.s;
                lu3 lu3Var = lu3.a;
                i = xfdVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    n(null, new a7d(14));
                    List<NotificationSetting> list = this.n;
                    ArrayList arrayList2 = new ArrayList(k13.r(list, 10));
                    for (NotificationSetting notificationSetting : list) {
                        Iterator<E> it = gv9Var.iterator();
                        while (it.hasNext()) {
                            ghd ghdVar = (ghd) it.next();
                            if (Intrinsics.c(ghdVar.a, notificationSetting.getName())) {
                                break;
                            }
                        }
                        ogj.m("Collection contains no element matching the predicate.");
                        return null;
                    }
                    Context i3 = i();
                    xfdVar.r = arrayList2;
                    xfdVar.u = 1;
                    obj = this.l.d(i3, arrayList2, xfdVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    arrayList = arrayList2;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList = xfdVar.r;
                    y6a.M(obj);
                }
                if (((Number) obj).intValue() != arrayList.size()) {
                    k(rfd.a);
                } else {
                    n(null, new a7d(15));
                }
                return Unit.a;
            }
        }
        xfdVar = new xfd(this, sq3Var);
        obj = xfdVar.s;
        lu3 lu3Var2 = lu3.a;
        i = xfdVar.u;
        if (i != 0) {
        }
        if (((Number) obj).intValue() != arrayList.size()) {
        }
        return Unit.a;
    }
}
