package defpackage;

import com.sofascore.model.Sports;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class y9i {
    public static final List a = b.j(t9i.g, t9i.k, t9i.l, t9i.q, t9i.y, t9i.z, t9i.w);
    public static final Set b = ph0.a0(new String[]{Sports.FOOTBALL, Sports.VOLLEYBALL, Sports.FUTSAL, Sports.MINI_FOOTBALL});
    public static final Set c;
    public static final LinkedHashSet d;
    public static final Set e;
    public static final Set f;
    public static final Set g;

    static {
        Set a0 = ph0.a0(new String[]{Sports.HANDBALL, Sports.RUGBY, Sports.WATERPOLO});
        c = a0;
        d = y9h.g(a0, Sports.BASKETBALL);
        Set a02 = ph0.a0(new String[]{Sports.BASKETBALL, Sports.ICE_HOCKEY, Sports.VOLLEYBALL});
        e = a02;
        CollectionsKt.V0(a02).add(Sports.AMERICAN_FOOTBALL);
        f = ph0.a0(new String[]{Sports.VOLLEYBALL, Sports.AUSSIE_RULES});
        g = ph0.a0(new t9i[]{t9i.r, t9i.s, t9i.t, t9i.u, t9i.v});
    }

    public static ArrayList a(String str) {
        str.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            t9i t9iVar = (t9i) obj;
            Set set = c;
            boolean contains = set.contains(str);
            Set set2 = b;
            boolean z = false;
            boolean z2 = (contains || set2.contains(str) || str.equals(Sports.AMERICAN_FOOTBALL)) ? false : true;
            boolean z3 = set.contains(str) || set2.contains(str);
            if (t9iVar == t9i.g) {
                z = str.equals(Sports.BASKETBALL);
            } else if (t9iVar != t9i.w ? !((z3 || t9iVar != t9i.q) && ((z2 || t9iVar != t9i.k) && (str.equals(Sports.AMERICAN_FOOTBALL) || t9iVar != t9i.l))) : !str.equals(Sports.BASKETBALL)) {
                z = true;
            }
            if (!z) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
