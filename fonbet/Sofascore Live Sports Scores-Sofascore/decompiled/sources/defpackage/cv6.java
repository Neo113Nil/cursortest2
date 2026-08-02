package defpackage;

import android.app.Application;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcv6;", "Lod7;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class cv6 extends od7 {
    public final do7 u;
    public final mj7 v;
    public final int w;
    public final int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv6(wi7 wi7Var, fqg fqgVar, Application application) {
        super(wi7Var, application);
        Object value;
        fqgVar.getClass();
        wi7Var.getClass();
        Object a = fqgVar.a("USER_COMPETITION_EXTRA");
        Object obj = null;
        if (a == null) {
            a70.r("Required value was null.");
            throw null;
        }
        do7 do7Var = (do7) a;
        this.u = do7Var;
        ev6 ev6Var = do7Var.c;
        mj7 mj7Var = ev6Var.k;
        mj7 mj7Var2 = ev6Var.i;
        List x = ph0.x(new mj7[]{mj7Var, mj7Var2, ev6Var.j});
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) x).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!((mj7) next).n) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (!((mj7) next2).h()) {
                obj = next2;
                break;
            }
        }
        mj7 mj7Var3 = (mj7) obj;
        if (mj7Var3 == null) {
            mj7 mj7Var4 = (mj7) CollectionsKt.j0(arrayList);
            if (mj7Var4 != null) {
                mj7Var2 = mj7Var4;
            }
        } else {
            mj7Var2 = mj7Var3;
        }
        this.v = mj7Var2;
        this.w = this.u.c.c;
        this.x = mj7Var2.a;
        fdi fdiVar = this.r;
        do {
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, this.u.c.r == 1 ? mei.i : mei.h));
    }

    @Override // defpackage.od7
    /* renamed from: m, reason: from getter */
    public final int getW() {
        return this.w;
    }

    @Override // defpackage.od7
    /* renamed from: n, reason: from getter */
    public final int getX() {
        return this.x;
    }
}
